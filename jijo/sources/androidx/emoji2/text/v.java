package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class v implements t5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f649b;

    public v(int i10) {
        if (i10 == 2) {
            this.f648a = -9223372036854775807L;
            this.f649b = -9223372036854775807L;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f648a = 1L;
            this.f649b = 0L;
        }
    }

    @Override // t5.b
    public final void a(long j10) {
        this.f648a = j10 & 65535;
        this.f649b = (j10 >> 16) & 65535;
    }

    @Override // t5.b
    public final long getValue() {
        return (this.f649b << 16) | this.f648a;
    }

    @Override // t5.b
    public final void reset() {
        this.f648a = 1L;
        this.f649b = 0L;
    }

    @Override // t5.b
    public final void update(byte[] bArr, int i10, int i11) {
        if (i11 == 1) {
            long j10 = this.f648a + ((long) (bArr[i10] & 255));
            this.f648a = j10;
            long j11 = this.f649b + j10;
            this.f649b = j11;
            this.f648a = j10 % 65521;
            this.f649b = j11 % 65521;
            return;
        }
        int i12 = i11 / 5552;
        int i13 = i11 % 5552;
        while (true) {
            int i14 = i12 - 1;
            if (i12 <= 0) {
                break;
            }
            int i15 = 5552;
            while (true) {
                int i16 = i15 - 1;
                if (i15 > 0) {
                    long j12 = this.f648a + ((long) (bArr[i10] & 255));
                    this.f648a = j12;
                    this.f649b += j12;
                    i10++;
                    i15 = i16;
                }
            }
            this.f648a %= 65521;
            this.f649b %= 65521;
            i12 = i14;
        }
        while (true) {
            int i17 = i13 - 1;
            if (i13 <= 0) {
                this.f648a %= 65521;
                this.f649b %= 65521;
                return;
            }
            long j13 = this.f648a + ((long) (bArr[i10] & 255));
            this.f648a = j13;
            this.f649b += j13;
            i10++;
            i13 = i17;
        }
    }
}
