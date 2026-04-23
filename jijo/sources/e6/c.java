package e6;

import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.i2;
import com.trilead.ssh2.IOWarningException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSASecurityProvider;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10) {
        super("SHA1WithDSA", "ssh-dss", null);
        this.f12724d = i10;
        if (i10 == 1) {
            super("NoneWithEdDSA", "ssh-ed25519", new EdDSASecurityProvider());
        } else if (i10 != 2) {
        } else {
            super("SHA1WithRSA", "ssh-rsa", null);
        }
    }

    @Override // e6.h
    public final PublicKey a(byte[] bArr) throws IOException {
        int i10 = this.f12724d;
        String str = this.f12733b;
        switch (i10) {
            case 0:
                i2 i2Var = new i2(bArr, 1);
                String strG = i2Var.g();
                if (!strG.equals(str)) {
                    throw new IOWarningException("Unsupported key format found '" + strG + "' while expecting " + str);
                }
                BigInteger bigIntegerE = i2Var.e();
                BigInteger bigIntegerE2 = i2Var.e();
                BigInteger bigIntegerE3 = i2Var.e();
                BigInteger bigIntegerE4 = i2Var.e();
                if (i2Var.j() != 0) {
                    throw new IOException("Padding in DSA public key!");
                }
                try {
                    return (DSAPublicKey) KeyFactory.getInstance("DSA").generatePublic(new DSAPublicKeySpec(bigIntegerE4, bigIntegerE, bigIntegerE2, bigIntegerE3));
                } catch (GeneralSecurityException e10) {
                    throw new IOException("Could not generate DSA Key", e10);
                }
            case 1:
                i2 i2Var2 = new i2(bArr, 1);
                if (!i2Var2.g().equals("ssh-ed25519")) {
                    throw new IOException("Invalid key type");
                }
                byte[] bArrC = i2Var2.c();
                if (i2Var2.j() == 0) {
                    return new EdDSAPublicKey(new EdDSAPublicKeySpec(bArrC, EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519)));
                }
                throw new IOException("Unexpected padding in public key");
            default:
                i2 i2Var3 = new i2(bArr, 1);
                String strG2 = i2Var3.g();
                if (!strG2.equals(str)) {
                    throw new IOWarningException("Unsupported key format found '" + strG2 + "' while expecting " + str);
                }
                BigInteger bigIntegerE5 = i2Var3.e();
                BigInteger bigIntegerE6 = i2Var3.e();
                if (i2Var3.j() != 0) {
                    throw new IOException("Padding in RSA public key!");
                }
                try {
                    return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(bigIntegerE6, bigIntegerE5));
                } catch (GeneralSecurityException e11) {
                    throw new IOException("Could not generate RSA key", e11);
                }
        }
    }

    @Override // e6.h
    public final byte[] b(byte[] bArr) throws IOException {
        byte b10;
        byte b11;
        int i10 = this.f12724d;
        String str = this.f12733b;
        switch (i10) {
            case 0:
                if (bArr.length != 40) {
                    i2 i2Var = new i2(bArr, 1);
                    if (!i2Var.g().equals(str)) {
                        throw new IOException("Peer sent wrong signature format");
                    }
                    bArr = i2Var.c();
                    if (bArr.length != 40) {
                        throw new IOException("Peer sent corrupt signature");
                    }
                    if (i2Var.j() != 0) {
                        throw new IOException("Padding in DSA signature!");
                    }
                }
                byte b12 = bArr[0];
                if (b12 == 0 && (b10 = bArr[1]) == 0 && (b11 = bArr[2]) == 0) {
                    int i11 = ((b12 << 24) & (-16777216)) | ((b10 << 16) & 16711680) | ((b11 << 8) & 65280) | (bArr[3] & 255);
                    int i12 = ((bArr[4 + i11] << 24) & (-16777216)) | (16711680 & (bArr[i11 + 5] << 16)) | (65280 & (bArr[i11 + 6] << 8)) | (bArr[i11 + 7] & 255);
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, i11 + 8, bArr2, 0, i12);
                    bArr = bArr2;
                }
                int i13 = (bArr[0] & 128) != 0 ? 1 : 0;
                byte b13 = (bArr[20] & 128) != 0 ? (byte) 1 : (byte) 0;
                byte[] bArr3 = new byte[fb1.e(bArr.length, 6, i13, b13)];
                bArr3[0] = 48;
                if (bArr.length != 40) {
                    throw new IOException("Peer sent corrupt signature");
                }
                bArr3[1] = 44;
                byte b14 = (byte) (44 + i13);
                bArr3[1] = b14;
                bArr3[1] = (byte) (b14 + b13);
                bArr3[2] = 2;
                bArr3[3] = 20;
                bArr3[3] = (byte) (20 + i13);
                System.arraycopy(bArr, 0, bArr3, i13 + 4, 20);
                bArr3[bArr3[3] + 4] = 2;
                bArr3[bArr3[3] + 5] = 20;
                int i14 = bArr3[3] + 5;
                bArr3[i14] = (byte) (bArr3[i14] + b13);
                System.arraycopy(bArr, 20, bArr3, bArr3[3] + 6 + b13, 20);
                return bArr3;
            case 1:
                i2 i2Var2 = new i2(bArr, 1);
                if (!i2Var2.g().equals("ssh-ed25519")) {
                    throw new IOException("Invalid signature format");
                }
                byte[] bArrC = i2Var2.c();
                if (i2Var2.j() == 0) {
                    return bArrC;
                }
                throw new IOException("Unexpected padding in signature");
            default:
                i2 i2Var3 = new i2(bArr, 1);
                if (!i2Var3.g().equals(str)) {
                    throw new IOException("Peer sent wrong signature format");
                }
                byte[] bArrC2 = i2Var3.c();
                if (bArrC2.length == 0) {
                    throw new IOException("Error in RSA signature, S is empty.");
                }
                if (i2Var3.j() == 0) {
                    return bArrC2;
                }
                throw new IOException("Padding in RSA signature!");
        }
    }

    @Override // e6.h
    public final List c() {
        int i10 = 0;
        int i11 = 2;
        int i12 = 1;
        switch (this.f12724d) {
            case 0:
                return Arrays.asList(new b(), new a(this.f12733b, i10));
            case 1:
                return Collections.singletonList(new a("ssh-ed25519", i12));
            default:
                return Arrays.asList(new b((Object) null), new a("ssh-rsa", i11));
        }
    }
}
