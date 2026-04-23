package b6;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f1381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f1382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1383f;

    public g(int i10, Object obj) {
        this.f1378a = obj == null ? this : obj;
        this.f1380c = i10;
        z5.e eVar = new z5.e(2048);
        this.f1381d = new f(this, eVar);
        this.f1382e = new f(this, eVar);
    }

    public final int a() {
        int i10;
        synchronized (this.f1378a) {
            i10 = this.f1379b;
        }
        return i10;
    }

    public final void b(byte[] bArr, int i10, int i11) {
        int iMin;
        while (i11 > 0) {
            synchronized (this.f1378a) {
                while (true) {
                    try {
                        iMin = Math.min(i11, Math.max(0, this.f1380c - a()));
                        if (iMin != 0) {
                            break;
                        } else {
                            this.f1378a.wait();
                        }
                    } finally {
                    }
                }
                f fVar = this.f1382e;
                int i12 = i10;
                int i13 = iMin;
                while (i13 > 0) {
                    int iMin2 = Math.min(i13, fVar.a());
                    System.arraycopy(bArr, i12, (byte[]) fVar.f1375a.f20723b, fVar.f1376b, iMin2);
                    fVar.f1376b += iMin2;
                    i13 -= iMin2;
                    i12 += iMin2;
                }
                fVar.getClass();
                i10 += iMin;
                i11 -= iMin;
                this.f1379b += iMin;
                this.f1378a.notifyAll();
            }
        }
    }
}
