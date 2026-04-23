package s3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16700d;

    public l(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f16700d = bArr;
    }

    @Override // s3.k
    public final byte[] a0() {
        return this.f16700d;
    }
}
