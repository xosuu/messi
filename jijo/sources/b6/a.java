package b6;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f1340s = Integer.getInteger(a.class.getName().concat(".bufferSize"), 1064960).intValue();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c6.a f1341t = c6.a.a(a.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f1344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j2.h f1345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j2.h f1346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f1349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f1351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f1354m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1355n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1356o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1357p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f1358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Throwable f1359r;

    public a(c cVar) {
        int i10 = f1340s;
        this.f1342a = i10;
        j2.h hVar = new j2.h(this);
        this.f1345d = hVar;
        j2.h hVar2 = new j2.h(this);
        this.f1346e = hVar2;
        this.f1347f = -1;
        this.f1348g = -1;
        this.f1349h = new Object();
        this.f1350i = false;
        this.f1351j = new byte[9];
        this.f1352k = 1;
        this.f1354m = 0L;
        this.f1355n = -1;
        this.f1356o = -1;
        this.f1357p = false;
        this.f1358q = new Object();
        this.f1359r = null;
        this.f1343b = cVar;
        this.f1353l = i10;
        this.f1355n = f6.i.f13178r - 1024;
        d dVar = new d();
        dVar.f1372b = false;
        dVar.f1371a = this;
        this.f1344c = dVar;
        hVar.f14297a = new b(this, false);
        hVar2.f14297a = new b(this, true);
    }

    public final synchronized void a() {
        this.f1345d.l();
        this.f1346e.l();
        this.f1357p = true;
    }

    public final void b(int i10, boolean z9) {
        int i11;
        int i12;
        int i13;
        if (i10 <= 0) {
            return;
        }
        synchronized (this) {
            try {
                int i14 = this.f1353l;
                int i15 = this.f1342a;
                if (i14 <= (i15 * 3) / 4) {
                    Object obj = this.f1345d.f14298b;
                    int iA = i15 - (((g) obj) != null ? ((g) obj).a() : 0);
                    Object obj2 = this.f1346e.f14298b;
                    int iA2 = iA - (((g) obj2) != null ? ((g) obj2).a() : 0);
                    int i16 = this.f1353l;
                    i11 = iA2 - i16;
                    if (i11 > 0) {
                        this.f1353l = i16 + i11;
                    }
                } else {
                    i11 = 0;
                }
                i12 = this.f1348g;
                i13 = this.f1347f;
            } finally {
            }
        }
        if (i11 > 0) {
            c6.a aVar = f1341t;
            aVar.getClass();
            aVar.b(80, "Sending SSH_MSG_CHANNEL_WINDOW_ADJUST (channel " + i13 + ", " + i11 + ")");
            synchronized (this.f1349h) {
                try {
                    byte[] bArr = this.f1351j;
                    bArr[0] = 93;
                    bArr[1] = (byte) (i12 >> 24);
                    bArr[2] = (byte) (i12 >> 16);
                    bArr[3] = (byte) (i12 >> 8);
                    bArr[4] = (byte) i12;
                    bArr[5] = (byte) (i11 >> 24);
                    bArr[6] = (byte) (i11 >> 16);
                    bArr[7] = (byte) (i11 >> 8);
                    bArr[8] = (byte) i11;
                    if (!this.f1350i) {
                        if (z9) {
                            this.f1343b.f1365b.l(bArr);
                        } else {
                            this.f1343b.f1365b.n(bArr);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void c(Throwable th) {
        synchronized (this.f1358q) {
            try {
                if (this.f1359r == null) {
                    this.f1359r = th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
