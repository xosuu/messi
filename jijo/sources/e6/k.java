package e6;

import com.trilead.ssh2.crypto.cipher.BlockCipher;
import com.trilead.ssh2.crypto.cipher.CBCMode;
import com.trilead.ssh2.crypto.cipher.DES;

/* JADX INFO: loaded from: classes.dex */
public enum k extends o {
    @Override // e6.o
    public final BlockCipher a(byte[] bArr, byte[] bArr2) {
        DES des = new DES();
        des.init(false, bArr);
        return new CBCMode(des, bArr2, false);
    }
}
