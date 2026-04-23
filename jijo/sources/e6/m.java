package e6;

import com.trilead.ssh2.crypto.cipher.BlockCipher;
import com.trilead.ssh2.crypto.cipher.BlockCipherFactory;

/* JADX INFO: loaded from: classes.dex */
public enum m extends o {
    @Override // e6.o
    public final BlockCipher a(byte[] bArr, byte[] bArr2) {
        return BlockCipherFactory.createCipher("aes192-cbc", false, bArr, bArr2);
    }
}
