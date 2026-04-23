package t5;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f16884b = new int[NotificationCompat.FLAG_LOCAL_ONLY];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16885a = 0;

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = 8;
            int i12 = i10;
            while (true) {
                i11--;
                if (i11 >= 0) {
                    i12 = (i12 & 1) != 0 ? (i12 >>> 1) ^ (-306674912) : i12 >>> 1;
                }
            }
            f16884b[i10] = i12;
        }
    }

    @Override // t5.b
    public final void a(long j10) {
        this.f16885a = (int) (j10 & 4294967295L);
    }

    @Override // t5.b
    public final long getValue() {
        return ((long) this.f16885a) & 4294967295L;
    }

    @Override // t5.b
    public final void reset() {
        this.f16885a = 0;
    }

    @Override // t5.b
    public final void update(byte[] bArr, int i10, int i11) {
        int i12 = ~this.f16885a;
        while (true) {
            i11--;
            if (i11 < 0) {
                this.f16885a = ~i12;
                return;
            }
            i12 = (i12 >>> 8) ^ f16884b[(bArr[i10] ^ i12) & 255];
            i10++;
        }
    }
}
