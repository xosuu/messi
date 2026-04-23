package net.i2p.crypto.eddsa;

import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import net.i2p.crypto.eddsa.math.GroupElement;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAParameterSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class EdDSAPrivateKey implements EdDSAKey, PrivateKey {
    private static final int IDLEN_BYTE = 6;
    private static final int OID_BYTE = 11;
    private static final int OID_ED25519 = 112;
    private static final int OID_OLD = 100;
    private static final long serialVersionUID = 23495873459878957L;
    private final GroupElement A;
    private final byte[] Abyte;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f15993a;
    private final EdDSAParameterSpec edDsaSpec;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f15994h;
    private final byte[] seed;

    public EdDSAPrivateKey(EdDSAPrivateKeySpec edDSAPrivateKeySpec) {
        this.seed = edDSAPrivateKeySpec.getSeed();
        this.f15994h = edDSAPrivateKeySpec.getH();
        this.f15993a = edDSAPrivateKeySpec.geta();
        GroupElement a10 = edDSAPrivateKeySpec.getA();
        this.A = a10;
        this.Abyte = a10.toByteArray();
        this.edDsaSpec = edDSAPrivateKeySpec.getParams();
    }

    private static byte[] decode(byte[] bArr) throws InvalidKeySpecException {
        int i10;
        byte b10;
        int i11;
        try {
            byte b11 = bArr[11];
            if (b11 == OID_OLD) {
                i10 = 49;
                b10 = 8;
            } else {
                if (b11 != OID_ED25519) {
                    throw new InvalidKeySpecException("unsupported key spec");
                }
                if (bArr[6] == 7) {
                    i10 = 50;
                    b10 = 7;
                } else {
                    i10 = 48;
                    b10 = 5;
                }
            }
            if (bArr.length != i10) {
                throw new InvalidKeySpecException("invalid key spec length");
            }
            if (bArr[0] != 48 || bArr[1] != i10 - 2 || bArr[2] != 2 || bArr[3] != 1 || bArr[4] != 0 || bArr[5] != 48 || bArr[6] != b10 || bArr[7] != 6 || bArr[8] != 3 || bArr[9] != 43 || bArr[10] != 101) {
                throw new InvalidKeySpecException("unsupported key spec");
            }
            int i12 = 14;
            if (b11 != OID_OLD) {
                if (b10 != 7) {
                    i12 = 12;
                } else if (bArr[12] != 5 || bArr[13] != 0) {
                    throw new InvalidKeySpecException("unsupported key spec");
                }
                int i13 = i12 + 1;
                if (bArr[i12] == 4) {
                    i11 = bArr[i13] == 34 ? i12 + 2 : 15;
                }
                throw new InvalidKeySpecException("unsupported key spec");
            }
            if (bArr[12] != 10 || bArr[13] != 1 || bArr[14] != 1) {
                throw new InvalidKeySpecException("unsupported key spec");
            }
            int i14 = i11 + 1;
            if (bArr[i11] == 4) {
                int i15 = i11 + 2;
                if (bArr[i14] == 32) {
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(bArr, i15, bArr2, 0, 32);
                    return bArr2;
                }
            }
            throw new InvalidKeySpecException("unsupported key spec");
        } catch (IndexOutOfBoundsException e10) {
            throw new InvalidKeySpecException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EdDSAPrivateKey)) {
            return false;
        }
        EdDSAPrivateKey edDSAPrivateKey = (EdDSAPrivateKey) obj;
        return Arrays.equals(this.seed, edDSAPrivateKey.getSeed()) && this.edDsaSpec.equals(edDSAPrivateKey.getParams());
    }

    public GroupElement getA() {
        return this.A;
    }

    public byte[] getAbyte() {
        return this.Abyte;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "EdDSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] bArr;
        if (!this.edDsaSpec.equals(EdDSANamedCurveTable.ED_25519_CURVE_SPEC) || (bArr = this.seed) == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 16];
        bArr2[0] = 48;
        bArr2[1] = (byte) (length + 14);
        bArr2[2] = 2;
        bArr2[3] = 1;
        bArr2[4] = 0;
        bArr2[5] = 48;
        bArr2[6] = 5;
        bArr2[7] = 6;
        bArr2[8] = 3;
        bArr2[9] = 43;
        bArr2[10] = 101;
        bArr2[11] = 112;
        bArr2[12] = 4;
        bArr2[13] = (byte) (bArr.length + 2);
        bArr2[14] = 4;
        bArr2[15] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr2, 16, bArr.length);
        return bArr2;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public byte[] getH() {
        return this.f15994h;
    }

    @Override // net.i2p.crypto.eddsa.EdDSAKey
    public EdDSAParameterSpec getParams() {
        return this.edDsaSpec;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public byte[] geta() {
        return this.f15993a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.seed);
    }

    public EdDSAPrivateKey(PKCS8EncodedKeySpec pKCS8EncodedKeySpec) {
        this(new EdDSAPrivateKeySpec(decode(pKCS8EncodedKeySpec.getEncoded()), EdDSANamedCurveTable.ED_25519_CURVE_SPEC));
    }
}
