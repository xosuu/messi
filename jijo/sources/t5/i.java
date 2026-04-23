package t5;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16979a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f16984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f16985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16986h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16980b = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16987i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f16988j = new byte[4];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f16989k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ByteArrayOutputStream f16990l = null;

    public i(l lVar) {
        this.f16985g = lVar;
    }

    public final void a(int i10, long j10) {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f16988j;
            if (i11 >= i10) {
                this.f16985g.f17022k.update(bArr, 0, i10);
                return;
            } else {
                bArr[i11] = (byte) (255 & j10);
                j10 >>= 8;
                i11++;
            }
        }
    }

    public final int b(int i10, int i11) throws h {
        if (this.f16990l == null) {
            this.f16990l = new ByteArrayOutputStream();
        }
        while (this.f16981c > 0) {
            l lVar = this.f16985g;
            int i12 = lVar.f17014c;
            if (i12 == 0) {
                throw new h(i10);
            }
            lVar.f17014c = i12 - 1;
            byte[] bArr = lVar.f17012a;
            int i13 = lVar.f17013b;
            byte b10 = bArr[i13];
            this.f16990l.write(bArr, i13, 1);
            lVar.f17022k.update(lVar.f17012a, lVar.f17013b, 1);
            lVar.f17013b++;
            this.f16981c--;
            i10 = i11;
        }
        return i10;
    }

    public final int c(int i10, int i11, int i12) throws h {
        if (this.f16987i == -1) {
            this.f16987i = i10;
            this.f16981c = 0L;
        }
        while (true) {
            int i13 = this.f16987i;
            if (i13 <= 0) {
                if (i10 == 2) {
                    this.f16981c &= 65535;
                } else if (i10 == 4) {
                    this.f16981c &= 4294967295L;
                }
                this.f16987i = -1;
                return i11;
            }
            l lVar = this.f16985g;
            int i14 = lVar.f17014c;
            if (i14 == 0) {
                throw new h(i11);
            }
            lVar.f17014c = i14 - 1;
            long j10 = this.f16981c;
            byte[] bArr = lVar.f17012a;
            int i15 = lVar.f17013b;
            lVar.f17013b = i15 + 1;
            this.f16981c = j10 | ((long) ((bArr[i15] & 255) << ((i10 - i13) * 8)));
            this.f16987i = i13 - 1;
            i11 = i12;
        }
    }

    public final void d(int i10, int i11) throws h {
        if (this.f16990l == null) {
            this.f16990l = new ByteArrayOutputStream();
        }
        while (true) {
            l lVar = this.f16985g;
            int i12 = lVar.f17014c;
            if (i12 == 0) {
                throw new h(i10);
            }
            lVar.f17014c = i12 - 1;
            byte[] bArr = lVar.f17012a;
            int i13 = lVar.f17013b;
            byte b10 = bArr[i13];
            if (b10 != 0) {
                this.f16990l.write(bArr, i13, 1);
            }
            lVar.f17022k.update(lVar.f17012a, lVar.f17013b, 1);
            lVar.f17013b++;
            if (b10 == 0) {
                return;
            } else {
                i10 = i11;
            }
        }
    }
}
