package l7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f15342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f15343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f15345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f15346h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15339a = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f15347i = new w(0, this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f15348j = new w(0, this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f15349k = null;

    public x(int i10, r rVar, boolean z9, boolean z10, ArrayList arrayList) {
        if (rVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f15341c = i10;
        this.f15342d = rVar;
        this.f15340b = rVar.A.j();
        v vVar = new v(this, rVar.f15315z.j());
        this.f15345g = vVar;
        u uVar = new u(this);
        this.f15346h = uVar;
        vVar.f15335h = z10;
        uVar.f15329d = z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r2 = this;
            monitor-enter(r2)
            l7.v r0 = r2.f15345g     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.f15335h     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L1a
            boolean r0 = r0.f15334f     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            l7.u r0 = r2.f15346h     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.f15329d     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            boolean r0 = r0.f15328b     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            goto L18
        L16:
            r0 = move-exception
            goto L32
        L18:
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            boolean r1 = r2.g()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L28
            l7.a r0 = l7.a.CANCEL
            r2.c(r0)
            goto L31
        L28:
            if (r1 != 0) goto L31
            l7.r r0 = r2.f15342d
            int r1 = r2.f15341c
            r0.A(r1)
        L31:
            return
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.x.a():void");
    }

    public final void b() throws IOException {
        u uVar = this.f15346h;
        if (uVar.f15328b) {
            throw new IOException("stream closed");
        }
        if (uVar.f15329d) {
            throw new IOException("stream finished");
        }
        if (this.f15349k != null) {
            throw new StreamResetException(this.f15349k);
        }
    }

    public final void c(a aVar) {
        if (d(aVar)) {
            this.f15342d.D.E(this.f15341c, aVar);
        }
    }

    public final boolean d(a aVar) {
        synchronized (this) {
            try {
                if (this.f15349k != null) {
                    return false;
                }
                if (this.f15345g.f15335h && this.f15346h.f15329d) {
                    return false;
                }
                this.f15349k = aVar;
                notifyAll();
                this.f15342d.A(this.f15341c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final u e() {
        synchronized (this) {
            try {
                if (!this.f15344f && !f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f15346h;
    }

    public final boolean f() {
        return this.f15342d.f15302a == ((this.f15341c & 1) == 1);
    }

    public final synchronized boolean g() {
        try {
            if (this.f15349k != null) {
                return false;
            }
            v vVar = this.f15345g;
            if (vVar.f15335h || vVar.f15334f) {
                u uVar = this.f15346h;
                if (uVar.f15329d || uVar.f15328b) {
                    if (this.f15344f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h() {
        boolean zG;
        synchronized (this) {
            this.f15345g.f15335h = true;
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f15342d.A(this.f15341c);
    }

    public final void i(ArrayList arrayList) {
        boolean zG;
        synchronized (this) {
            zG = true;
            try {
                this.f15344f = true;
                if (this.f15343e == null) {
                    this.f15343e = arrayList;
                    zG = g();
                    notifyAll();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(this.f15343e);
                    arrayList2.add(null);
                    arrayList2.addAll(arrayList);
                    this.f15343e = arrayList2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zG) {
            return;
        }
        this.f15342d.A(this.f15341c);
    }

    public final synchronized void j(a aVar) {
        if (this.f15349k == null) {
            this.f15349k = aVar;
            notifyAll();
        }
    }
}
