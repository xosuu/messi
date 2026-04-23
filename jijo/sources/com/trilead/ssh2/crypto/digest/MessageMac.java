package com.trilead.ssh2.crypto.digest;

import g1.a;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class MessageMac extends MAC {
    private final Mac messageMac;

    public enum Hmac {
        HMAC_MD5_96("hmac-md5-96", "HmacMD5", 16),
        HMAC_MD5("hmac-md5", "HmacMD5", 16),
        HMAC_SHA1_96("hmac-sha1-96", "HmacSHA1", 20),
        HMAC_SHA1("hmac-sha1", "HmacSHA1", 20),
        HMAC_SHA2_256("hmac-sha2-256", "HmacSHA256", 32),
        HMAC_SHA2_512("hmac-sha2-512", "HmacSHA512", 64);

        private String algorithm;
        private int length;
        private String type;

        Hmac(String str, String str2, int i10) {
            this.type = str;
            this.algorithm = str2;
            this.length = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Hmac getHmac(String str) {
            for (Hmac hmac : values()) {
                if (hmac.getType().equals(str)) {
                    return hmac;
                }
            }
            throw new IllegalArgumentException(a.q("Invalid HMAC type: ", str));
        }

        public String getAlgorithm() {
            return this.algorithm;
        }

        public int getLength() {
            return this.length;
        }

        public String getType() {
            return this.type;
        }
    }

    public MessageMac(String str, byte[] bArr) {
        super(str, bArr);
        try {
            Mac mac = Mac.getInstance(Hmac.getHmac(str).getAlgorithm());
            this.messageMac = mac;
            mac.init(new SecretKeySpec(bArr, str));
        } catch (GeneralSecurityException e10) {
            throw new IllegalArgumentException("Could not create Mac", e10);
        }
    }

    public static void checkMacs(String[] strArr) {
        for (String str : strArr) {
            Hmac.getHmac(str);
        }
    }

    public static int getKeyLength(String str) {
        return Hmac.getHmac(str).getLength();
    }

    public static String[] getMacs() {
        ArrayList arrayList = new ArrayList();
        for (Hmac hmac : Hmac.values()) {
            arrayList.add(0, hmac.getType());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.trilead.ssh2.crypto.digest.MAC
    public final void getMac(byte[] bArr, int i10) {
        byte[] bArrDoFinal = this.messageMac.doFinal();
        System.arraycopy(bArrDoFinal, i10, bArr, 0, bArrDoFinal.length - i10);
    }

    @Override // com.trilead.ssh2.crypto.digest.MAC
    public final void initMac(int i10) {
        this.messageMac.reset();
        this.messageMac.update((byte) (i10 >> 24));
        this.messageMac.update((byte) (i10 >> 16));
        this.messageMac.update((byte) (i10 >> 8));
        this.messageMac.update((byte) i10);
    }

    @Override // com.trilead.ssh2.crypto.digest.MAC
    public final int size() {
        return this.messageMac.getMacLength();
    }

    @Override // com.trilead.ssh2.crypto.digest.MAC
    public final void update(byte[] bArr, int i10, int i11) {
        this.messageMac.update(bArr, i10, i11);
    }
}
