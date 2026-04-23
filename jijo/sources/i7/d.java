package i7;

import com.google.android.gms.internal.ads.gp0;
import d5.e;
import f7.e0;
import f7.i;
import f7.n;
import f7.y;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7.a f14196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gp0 f14197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e0 f14198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f14199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f14200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f14201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z5.b f14202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f14204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j7.d f14207l;

    public d(i iVar, f7.a aVar, y yVar, n nVar, Object obj) {
        this.f14199d = iVar;
        this.f14196a = aVar;
        this.f14200e = nVar;
        e.f12374q.getClass();
        this.f14202g = new z5.b(aVar, iVar.f13293e, yVar, nVar);
        this.f14201f = obj;
    }

    public final synchronized b a() {
        return this.f14204i;
    }

    public final Socket b(boolean z9, boolean z10, boolean z11) {
        Socket socket;
        if (z11) {
            this.f14207l = null;
        }
        if (z10) {
            this.f14206k = true;
        }
        b bVar = this.f14204i;
        if (bVar == null) {
            return null;
        }
        if (z9) {
            bVar.f14190k = true;
        }
        if (this.f14207l != null) {
            return null;
        }
        if (!this.f14206k && !bVar.f14190k) {
            return null;
        }
        ArrayList arrayList = bVar.f14193n;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Reference) arrayList.get(i10)).get() == this) {
                arrayList.remove(i10);
                if (this.f14204i.f14193n.isEmpty()) {
                    this.f14204i.f14194o = System.nanoTime();
                    e eVar = e.f12374q;
                    b bVar2 = this.f14204i;
                    eVar.getClass();
                    i iVar = this.f14199d;
                    iVar.getClass();
                    if (bVar2.f14190k || iVar.f13289a == 0) {
                        iVar.f13292d.remove(bVar2);
                        socket = this.f14204i.f14184e;
                    } else {
                        iVar.notifyAll();
                        socket = null;
                    }
                } else {
                    socket = null;
                }
                this.f14204i = null;
                return socket;
            }
        }
        throw new IllegalStateException();
    }

    public final b c(boolean z9, int i10, int i11, int i12, int i13) throws Throwable {
        b bVar;
        Socket socketF;
        Socket socketB;
        b bVar2;
        e0 e0Var;
        boolean z10;
        boolean z11;
        b bVar3;
        gp0 gp0Var;
        synchronized (this.f14199d) {
            try {
                if (this.f14206k) {
                    throw new IllegalStateException("released");
                }
                if (this.f14207l != null) {
                    throw new IllegalStateException("codec != null");
                }
                bVar = this.f14204i;
                socketF = null;
                socketB = (bVar == null || !bVar.f14190k) ? null : b(false, false, true);
                bVar2 = this.f14204i;
                if (bVar2 != null) {
                    bVar = null;
                } else {
                    bVar2 = null;
                }
                if (!this.f14205j) {
                    bVar = null;
                }
                if (bVar2 == null) {
                    e eVar = e.f12374q;
                    i iVar = this.f14199d;
                    f7.a aVar = this.f14196a;
                    eVar.getClass();
                    e.g(iVar, aVar, this, null);
                    b bVar4 = this.f14204i;
                    if (bVar4 != null) {
                        bVar2 = bVar4;
                        z10 = true;
                        e0Var = null;
                    } else {
                        e0Var = this.f14198c;
                    }
                } else {
                    e0Var = null;
                }
                z10 = false;
            } finally {
            }
        }
        g7.b.e(socketB);
        if (bVar != null) {
            this.f14200e.getClass();
        }
        if (z10) {
            this.f14200e.getClass();
        }
        if (bVar2 != null) {
            return bVar2;
        }
        if (e0Var != null || ((gp0Var = this.f14197b) != null && gp0Var.f5025b < ((List) gp0Var.f5026d).size())) {
            z11 = false;
        } else {
            this.f14197b = this.f14202g.c();
            z11 = true;
        }
        synchronized (this.f14199d) {
            if (z11) {
                try {
                    gp0 gp0Var2 = this.f14197b;
                    gp0Var2.getClass();
                    ArrayList arrayList = new ArrayList((List) gp0Var2.f5026d);
                    int size = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            break;
                        }
                        e0 e0Var2 = (e0) arrayList.get(i14);
                        e eVar2 = e.f12374q;
                        i iVar2 = this.f14199d;
                        f7.a aVar2 = this.f14196a;
                        eVar2.getClass();
                        e.g(iVar2, aVar2, this, e0Var2);
                        b bVar5 = this.f14204i;
                        if (bVar5 != null) {
                            this.f14198c = e0Var2;
                            bVar2 = bVar5;
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                } finally {
                }
            }
            if (!z10) {
                if (e0Var == null) {
                    gp0 gp0Var3 = this.f14197b;
                    if (gp0Var3.f5025b >= ((List) gp0Var3.f5026d).size()) {
                        throw new NoSuchElementException();
                    }
                    List list = (List) gp0Var3.f5026d;
                    int i15 = gp0Var3.f5025b;
                    gp0Var3.f5025b = i15 + 1;
                    e0Var = (e0) list.get(i15);
                }
                this.f14198c = e0Var;
                this.f14203h = 0;
                bVar2 = new b(this.f14199d, e0Var);
                if (this.f14204i != null) {
                    throw new IllegalStateException();
                }
                this.f14204i = bVar2;
                this.f14205j = false;
                bVar2.f14193n.add(new c(this, this.f14201f));
            }
            bVar3 = bVar2;
        }
        if (z10) {
            this.f14200e.getClass();
            return bVar3;
        }
        bVar3.c(i10, i11, i12, i13, z9, this.f14200e);
        e.f12374q.getClass();
        this.f14199d.f13293e.b(bVar3.f14182c);
        synchronized (this.f14199d) {
            try {
                this.f14205j = true;
                e eVar3 = e.f12374q;
                i iVar3 = this.f14199d;
                eVar3.getClass();
                if (!iVar3.f13294f) {
                    iVar3.f13294f = true;
                    i.f13288g.execute(iVar3.f13291c);
                }
                iVar3.f13292d.add(bVar3);
                if (bVar3.f14187h != null) {
                    e eVar4 = e.f12374q;
                    i iVar4 = this.f14199d;
                    f7.a aVar3 = this.f14196a;
                    eVar4.getClass();
                    socketF = e.f(iVar4, aVar3, this);
                    bVar3 = this.f14204i;
                }
            } finally {
            }
        }
        g7.b.e(socketF);
        this.f14200e.getClass();
        return bVar3;
    }

    public final b d(int i10, int i11, int i12, int i13, boolean z9, boolean z10) throws Throwable {
        while (true) {
            b bVarC = c(z9, i10, i11, i12, i13);
            synchronized (this.f14199d) {
                try {
                    if (bVarC.f14191l == 0) {
                        return bVarC;
                    }
                    if (bVarC.h(z10)) {
                        return bVarC;
                    }
                    e();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e() {
        b bVar;
        Socket socketB;
        synchronized (this.f14199d) {
            bVar = this.f14204i;
            socketB = b(true, false, false);
            if (this.f14204i != null) {
                bVar = null;
            }
        }
        g7.b.e(socketB);
        if (bVar != null) {
            this.f14200e.getClass();
        }
    }

    public final void f() {
        b bVar;
        Socket socketB;
        synchronized (this.f14199d) {
            bVar = this.f14204i;
            socketB = b(false, true, false);
            if (this.f14204i != null) {
                bVar = null;
            }
        }
        g7.b.e(socketB);
        if (bVar != null) {
            this.f14200e.getClass();
        }
    }

    public final void g(IOException iOException) {
        b bVar;
        boolean z9;
        Socket socketB;
        synchronized (this.f14199d) {
            try {
                bVar = null;
                if (iOException instanceof StreamResetException) {
                    l7.a aVar = ((StreamResetException) iOException).f16119a;
                    l7.a aVar2 = l7.a.REFUSED_STREAM;
                    if (aVar == aVar2) {
                        this.f14203h++;
                    }
                    if (aVar != aVar2 || this.f14203h > 1) {
                        this.f14198c = null;
                        z9 = true;
                    }
                    z9 = false;
                } else {
                    b bVar2 = this.f14204i;
                    if (bVar2 != null && (bVar2.f14187h == null || (iOException instanceof ConnectionShutdownException))) {
                        if (bVar2.f14191l == 0) {
                            e0 e0Var = this.f14198c;
                            if (e0Var != null && iOException != null) {
                                this.f14202g.b(e0Var, iOException);
                            }
                            this.f14198c = null;
                        }
                        z9 = true;
                    }
                    z9 = false;
                }
                b bVar3 = this.f14204i;
                socketB = b(z9, false, true);
                if (this.f14204i == null && this.f14205j) {
                    bVar = bVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g7.b.e(socketB);
        if (bVar != null) {
            this.f14200e.getClass();
        }
    }

    public final void h(boolean z9, j7.d dVar, IOException iOException) {
        b bVar;
        Socket socketB;
        boolean z10;
        this.f14200e.getClass();
        synchronized (this.f14199d) {
            if (dVar != null) {
                try {
                    if (dVar == this.f14207l) {
                        if (!z9) {
                            this.f14204i.f14191l++;
                        }
                        bVar = this.f14204i;
                        socketB = b(z9, false, true);
                        if (this.f14204i != null) {
                            bVar = null;
                        }
                        z10 = this.f14206k;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.f14207l + " but was " + dVar);
        }
        g7.b.e(socketB);
        if (bVar != null) {
            this.f14200e.getClass();
        }
        if (iOException != null) {
            this.f14200e.getClass();
        } else if (z10) {
            this.f14200e.getClass();
        }
    }

    public final String toString() {
        b bVarA = a();
        return bVarA != null ? bVarA.toString() : this.f14196a.toString();
    }
}
