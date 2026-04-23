package d2;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import c2.n;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.ur0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a, k2.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f12297x = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12299b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2.b f12300d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o2.a f12301f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WorkDatabase f12302h;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f12305t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f12304s = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f12303q = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashSet f12306u = new HashSet();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f12307v = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f12298a = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f12308w = new Object();

    static {
        n.l("Processor");
    }

    public b(Context context, c2.b bVar, ur0 ur0Var, WorkDatabase workDatabase, List list) {
        this.f12299b = context;
        this.f12300d = bVar;
        this.f12301f = ur0Var;
        this.f12302h = workDatabase;
        this.f12305t = list;
    }

    public static boolean c(String str, l lVar) {
        boolean zIsDone;
        if (lVar == null) {
            n nVarI = n.i();
            String.format("WorkerWrapper could not be found for %s", str);
            nVarI.g(new Throwable[0]);
            return false;
        }
        lVar.E = true;
        lVar.i();
        n5.a aVar = lVar.D;
        if (aVar != null) {
            zIsDone = aVar.isDone();
            lVar.D.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = lVar.f12344q;
        if (listenableWorker == null || zIsDone) {
            String.format("WorkSpec %s is already done. Not interrupting.", lVar.f12343h);
            n nVarI2 = n.i();
            int i10 = l.F;
            nVarI2.g(new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        n nVarI3 = n.i();
        String.format("WorkerWrapper interrupted for %s", str);
        nVarI3.g(new Throwable[0]);
        return true;
    }

    @Override // d2.a
    public final void a(String str, boolean z9) {
        synchronized (this.f12308w) {
            try {
                this.f12304s.remove(str);
                n nVarI = n.i();
                String.format("%s %s executed; reschedule = %s", b.class.getSimpleName(), str, Boolean.valueOf(z9));
                nVarI.g(new Throwable[0]);
                Iterator it = this.f12307v.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(str, z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(a aVar) {
        synchronized (this.f12308w) {
            this.f12307v.add(aVar);
        }
    }

    public final boolean d(String str) {
        boolean zContains;
        synchronized (this.f12308w) {
            zContains = this.f12306u.contains(str);
        }
        return zContains;
    }

    public final boolean e(String str) {
        boolean z9;
        synchronized (this.f12308w) {
            try {
                z9 = this.f12304s.containsKey(str) || this.f12303q.containsKey(str);
            } finally {
            }
        }
        return z9;
    }

    public final void f(a aVar) {
        synchronized (this.f12308w) {
            this.f12307v.remove(aVar);
        }
    }

    public final void g(String str, c2.g gVar) {
        synchronized (this.f12308w) {
            try {
                n nVarI = n.i();
                String.format("Moving WorkSpec (%s) to the foreground", str);
                nVarI.j(new Throwable[0]);
                l lVar = (l) this.f12304s.remove(str);
                if (lVar != null) {
                    if (this.f12298a == null) {
                        PowerManager.WakeLock wakeLockA = m2.k.a(this.f12299b, "ProcessorForegroundLck");
                        this.f12298a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f12303q.put(str, lVar);
                    Intent intentE = k2.c.e(this.f12299b, str, gVar);
                    Context context = this.f12299b;
                    Object obj = d0.f.f12287a;
                    if (Build.VERSION.SDK_INT >= 26) {
                        d0.e.b(context, intentE);
                    } else {
                        context.startService(intentE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(String str, ur0 ur0Var) {
        synchronized (this.f12308w) {
            try {
                if (e(str)) {
                    n nVarI = n.i();
                    String.format("Work %s is already enqueued for processing", str);
                    nVarI.g(new Throwable[0]);
                    return false;
                }
                Context context = this.f12299b;
                c2.b bVar = this.f12300d;
                o2.a aVar = this.f12301f;
                WorkDatabase workDatabase = this.f12302h;
                jt jtVar = new jt();
                jtVar.f6080i = new ur0();
                jtVar.f6072a = context.getApplicationContext();
                jtVar.f6075d = aVar;
                jtVar.f6074c = this;
                jtVar.f6076e = bVar;
                jtVar.f6077f = workDatabase;
                jtVar.f6078g = str;
                jtVar.f6079h = this.f12305t;
                if (ur0Var != null) {
                    jtVar.f6080i = ur0Var;
                }
                l lVarA = jtVar.a();
                n2.i iVar = lVarA.C;
                iVar.a(new l0.a(this, str, iVar, 3, 0), (Executor) ((ur0) this.f12301f).f9602f);
                this.f12304s.put(str, lVarA);
                ((m2.i) ((ur0) this.f12301f).f9600b).execute(lVarA);
                n nVarI2 = n.i();
                String.format("%s: processing %s", b.class.getSimpleName(), str);
                nVarI2.g(new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f12308w) {
            try {
                if (!(!this.f12303q.isEmpty())) {
                    Context context = this.f12299b;
                    int i10 = k2.c.f14649v;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f12299b.startService(intent);
                    } catch (Throwable th) {
                        n.i().h(th);
                    }
                    PowerManager.WakeLock wakeLock = this.f12298a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f12298a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(String str) {
        boolean zC;
        synchronized (this.f12308w) {
            n nVarI = n.i();
            String.format("Processor stopping foreground work %s", str);
            nVarI.g(new Throwable[0]);
            zC = c(str, (l) this.f12303q.remove(str));
        }
        return zC;
    }

    public final boolean k(String str) {
        boolean zC;
        synchronized (this.f12308w) {
            n nVarI = n.i();
            String.format("Processor stopping background work %s", str);
            nVarI.g(new Throwable[0]);
            zC = c(str, (l) this.f12304s.remove(str));
        }
        return zC;
    }
}
