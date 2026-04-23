package com.trilead.ssh2.crypto.cipher;

import g1.a;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class BlockCipherFactory {
    static Vector ciphers;

    public static class CipherEntry {
        int blocksize;
        String cipherClass;
        int keysize;
        String type;

        public CipherEntry(String str, int i10, int i11, String str2) {
            this.type = str;
            this.blocksize = i10;
            this.keysize = i11;
            this.cipherClass = str2;
        }
    }

    static {
        Vector vector = new Vector();
        ciphers = vector;
        vector.addElement(new CipherEntry("aes256-ctr", 16, 32, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("aes192-ctr", 16, 24, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("aes128-ctr", 16, 16, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("blowfish-ctr", 8, 16, "com.trilead.ssh2.crypto.cipher.BlowFish"));
        ciphers.addElement(new CipherEntry("aes256-cbc", 16, 32, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("aes192-cbc", 16, 24, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("aes128-cbc", 16, 16, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("blowfish-cbc", 8, 16, "com.trilead.ssh2.crypto.cipher.BlowFish"));
        ciphers.addElement(new CipherEntry("3des-ctr", 8, 24, "com.trilead.ssh2.crypto.cipher.DESede"));
        ciphers.addElement(new CipherEntry("3des-cbc", 8, 24, "com.trilead.ssh2.crypto.cipher.DESede"));
    }

    public static void checkCipherList(String[] strArr) {
        for (String str : strArr) {
            getEntry(str);
        }
    }

    public static BlockCipher createCipher(String str, boolean z9, byte[] bArr, byte[] bArr2) {
        try {
            BlockCipher blockCipher = (BlockCipher) Class.forName(getEntry(str).cipherClass).newInstance();
            if (str.endsWith("-cbc")) {
                blockCipher.init(z9, bArr);
                return new CBCMode(blockCipher, bArr2, z9);
            }
            if (!str.endsWith("-ctr")) {
                throw new IllegalArgumentException("Cannot instantiate ".concat(str));
            }
            blockCipher.init(true, bArr);
            return new CTRMode(blockCipher, bArr2, z9);
        } catch (Exception unused) {
            throw new IllegalArgumentException(a.q("Cannot instantiate ", str));
        }
    }

    public static int getBlockSize(String str) {
        return getEntry(str).blocksize;
    }

    public static String[] getDefaultCipherList() {
        String[] strArr = new String[ciphers.size()];
        for (int i10 = 0; i10 < ciphers.size(); i10++) {
            strArr[i10] = new String(((CipherEntry) ciphers.elementAt(i10)).type);
        }
        return strArr;
    }

    private static CipherEntry getEntry(String str) {
        for (int i10 = 0; i10 < ciphers.size(); i10++) {
            CipherEntry cipherEntry = (CipherEntry) ciphers.elementAt(i10);
            if (cipherEntry.type.equals(str)) {
                return cipherEntry;
            }
        }
        throw new IllegalArgumentException(a.q("Unkown algorithm ", str));
    }

    public static int getKeySize(String str) {
        return getEntry(str).keysize;
    }
}
