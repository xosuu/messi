package net.i2p.crypto.eddsa.spec;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import net.i2p.crypto.eddsa.math.GroupElement;

/* JADX INFO: loaded from: classes.dex */
public class EdDSAPrivateKeySpec implements KeySpec {
    private final GroupElement A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f16004a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f16005h;
    private final byte[] seed;
    private final EdDSAParameterSpec spec;

    public EdDSAPrivateKeySpec(byte[] bArr, EdDSAParameterSpec edDSAParameterSpec) {
        if (bArr.length != edDSAParameterSpec.getCurve().getField().getb() / 8) {
            throw new IllegalArgumentException("seed length is wrong");
        }
        this.spec = edDSAParameterSpec;
        this.seed = bArr;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(edDSAParameterSpec.getHashAlgorithm());
            int bVar = edDSAParameterSpec.getCurve().getField().getb();
            byte[] bArrDigest = messageDigest.digest(bArr);
            this.f16005h = bArrDigest;
            bArrDigest[0] = (byte) (bArrDigest[0] & 248);
            int i10 = (bVar / 8) - 1;
            bArrDigest[i10] = (byte) (bArrDigest[i10] & 63);
            int i11 = (bVar / 8) - 1;
            bArrDigest[i11] = (byte) (bArrDigest[i11] | 64);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDigest, 0, bVar / 8);
            this.f16004a = bArrCopyOfRange;
            this.A = edDSAParameterSpec.getB().scalarMultiply(bArrCopyOfRange);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalArgumentException("Unsupported hash algorithm");
        }
    }

    public GroupElement getA() {
        return this.A;
    }

    public byte[] getH() {
        return this.f16005h;
    }

    public EdDSAParameterSpec getParams() {
        return this.spec;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public byte[] geta() {
        return this.f16004a;
    }

    public EdDSAPrivateKeySpec(EdDSAParameterSpec edDSAParameterSpec, byte[] bArr) {
        if (bArr.length == edDSAParameterSpec.getCurve().getField().getb() / 4) {
            this.seed = null;
            this.f16005h = bArr;
            this.spec = edDSAParameterSpec;
            int bVar = edDSAParameterSpec.getCurve().getField().getb();
            bArr[0] = (byte) (bArr[0] & 248);
            int i10 = bVar / 8;
            int i11 = i10 - 1;
            byte b10 = (byte) (bArr[i11] & 63);
            bArr[i11] = b10;
            bArr[i11] = (byte) (b10 | 64);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i10);
            this.f16004a = bArrCopyOfRange;
            this.A = edDSAParameterSpec.getB().scalarMultiply(bArrCopyOfRange);
            return;
        }
        throw new IllegalArgumentException("hash length is wrong");
    }

    public EdDSAPrivateKeySpec(byte[] bArr, byte[] bArr2, byte[] bArr3, GroupElement groupElement, EdDSAParameterSpec edDSAParameterSpec) {
        this.seed = bArr;
        this.f16005h = bArr2;
        this.f16004a = bArr3;
        this.A = groupElement;
        this.spec = edDSAParameterSpec;
    }
}
