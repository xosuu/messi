package e6;

import com.google.android.gms.internal.ads.i2;
import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.crypto.PEMStructure;
import com.trilead.ssh2.crypto.cipher.BlockCipher;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends CertificateDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12740a;

    public p(String str) {
        this.f12740a = str;
    }

    public abstract KeyPair a(i2 i2Var);

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public final KeyPair createKeyPair(PEMStructure pEMStructure) {
        return null;
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public final String getEndLine() {
        return "-----END OPENSSH PRIVATE KEY-----";
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public final String getStartLine() {
        return "-----BEGIN OPENSSH PRIVATE KEY-----";
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public final KeyPair createKeyPair(PEMStructure pEMStructure, String str) throws IOException {
        i2 i2Var;
        byte[] bArr;
        i2 i2Var2 = new i2(pEMStructure.getData(), 1);
        if (!"openssh-key-v1".equals(new String(i2Var2.d(15), StandardCharsets.UTF_8).trim())) {
            throw new IOException("Could not find openssh header in key");
        }
        String strG = i2Var2.g();
        String strG2 = i2Var2.g();
        byte[] bArrC = i2Var2.c();
        if (i2Var2.i() != 1) {
            throw new IOException("Only single OpenSSH keys are supported");
        }
        i2Var2.c();
        byte[] bArrC2 = i2Var2.c();
        if ("bcrypt".equals(strG2)) {
            if (str == null) {
                throw new IOException("PEM is encrypted but password has not been specified");
            }
            i2 i2Var3 = new i2(bArrC, 1);
            byte[] bArrC3 = i2Var3.c();
            int i10 = i2Var3.i();
            o[] oVarArrValues = o.values();
            int length = oVarArrValues.length;
            int i11 = 0;
            while (i11 < length) {
                o oVar = oVarArrValues[i11];
                String[] strArr = oVar.f12737a;
                int length2 = strArr.length;
                int i12 = 0;
                while (i12 < length2) {
                    if (strArr[i12].equalsIgnoreCase(strG)) {
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        int i13 = oVar.f12738b;
                        int i14 = oVar.f12739d;
                        int i15 = i13 + i14;
                        byte[] bArr2 = new byte[i15];
                        s7.a aVar = new s7.a();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                            int i16 = (i15 + 31) / 32;
                            byte[] bArrDigest = messageDigest.digest(bytes);
                            byte[] bArr3 = new byte[64];
                            byte[] bArr4 = new byte[4];
                            i2Var = i2Var2;
                            byte[] bArr5 = new byte[32];
                            byte[] bArr6 = new byte[32];
                            int i17 = 1;
                            while (i17 <= i16) {
                                o oVar2 = oVar;
                                bArr4[0] = (byte) ((i17 >> 24) & 255);
                                bArr4[1] = (byte) ((i17 >> 16) & 255);
                                bArr4[2] = (byte) ((i17 >> 8) & 255);
                                bArr4[3] = (byte) (i17 & 255);
                                messageDigest.reset();
                                messageDigest.update(bArrC3);
                                messageDigest.update(bArr4);
                                byte[] bArr7 = bArrC3;
                                int i18 = 0;
                                messageDigest.digest(bArr3, 0, 64);
                                aVar.b(bArrDigest, bArr3, bArr5);
                                System.arraycopy(bArr5, 0, bArr6, 0, 32);
                                int i19 = 1;
                                while (i19 < i10) {
                                    messageDigest.reset();
                                    messageDigest.update(bArr6);
                                    int i20 = i10;
                                    messageDigest.digest(bArr3, i18, 64);
                                    aVar.b(bArrDigest, bArr3, bArr6);
                                    int i21 = 0;
                                    for (int i22 = 32; i21 < i22; i22 = 32) {
                                        bArr5[i21] = (byte) (bArr5[i21] ^ bArr6[i21]);
                                        i21++;
                                    }
                                    i19++;
                                    i10 = i20;
                                    i18 = 0;
                                }
                                int i23 = i10;
                                for (int i24 = 0; i24 < 32; i24++) {
                                    int i25 = (i17 - 1) + (i24 * i16);
                                    if (i25 < i15) {
                                        bArr2[i25] = bArr5[i24];
                                    }
                                }
                                i17++;
                                oVar = oVar2;
                                bArrC3 = bArr7;
                                i10 = i23;
                            }
                            byte[] bArr8 = new byte[i13];
                            byte[] bArr9 = new byte[i14];
                            System.arraycopy(bArr2, 0, bArr8, 0, i13);
                            System.arraycopy(bArr2, i13, bArr9, 0, i14);
                            BlockCipher blockCipherA = oVar.a(bArr8, bArr9);
                            byte[] bArr10 = new byte[bArrC2.length];
                            for (int i26 = 0; i26 < bArrC2.length / blockCipherA.getBlockSize(); i26++) {
                                blockCipherA.transformBlock(bArrC2, blockCipherA.getBlockSize() * i26, bArr10, blockCipherA.getBlockSize() * i26);
                            }
                            bArr = bArr10;
                        } catch (DigestException e10) {
                            throw new RuntimeException(e10);
                        } catch (NoSuchAlgorithmException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else {
                        i12++;
                        i2Var2 = i2Var2;
                    }
                }
                i11++;
                i2Var2 = i2Var2;
            }
            throw new IllegalArgumentException("Unknown Cipher: ".concat(strG));
        }
        i2Var = i2Var2;
        if (!"none".equals(strG) || !"none".equals(strG2)) {
            throw new IOException("Unexpected encryption method for key");
        }
        bArr = bArrC2;
        i2 i2Var4 = new i2(bArr, 1);
        if (i2Var4.i() != i2Var4.i()) {
            throw new IOException("Check integers didn't match");
        }
        String strG3 = i2Var4.g();
        if (!strG3.equals(this.f12740a)) {
            throw new IOException("Invalid key type: ".concat(strG3));
        }
        try {
            KeyPair keyPairA = a(i2Var4);
            i2Var4.c();
            int i27 = 0;
            while (i27 < i2Var.j()) {
                i27++;
                if (i27 != i2Var.b()) {
                    throw new IOException("Incorrect padding on private keys");
                }
            }
            return keyPairA;
        } catch (GeneralSecurityException e12) {
            throw new IOException("Could not create key pair", e12);
        }
    }
}
