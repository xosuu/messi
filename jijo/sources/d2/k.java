package d2;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import c2.n;
import com.google.android.gms.internal.ads.ur0;
import f.u0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import k.q;
import n1.o;
import n1.p;
import n1.r;
import n1.s;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class k extends b4.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static k f12327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static k f12328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f12329n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f12330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2.b f12331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkDatabase f12332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o2.a f12333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f12334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f12335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f12336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f12338k;

    static {
        n.l("WorkManagerImpl");
        f12327l = null;
        f12328m = null;
        f12329n = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public k(Context context, c2.b bVar, ur0 ur0Var) {
        o oVar;
        Executor executor;
        String str;
        ?? r52;
        int i10;
        c iVar;
        boolean z9 = context.getResources().getBoolean(R.bool.g);
        Context applicationContext = context.getApplicationContext();
        m2.i iVar2 = (m2.i) ur0Var.f9600b;
        int i11 = WorkDatabase.f1179k;
        int i12 = 1;
        if (z9) {
            oVar = new o(applicationContext, null);
            oVar.f15858h = true;
        } else {
            String[] strArr = j.f12326a;
            oVar = new o(applicationContext, "androidx.work.workdb");
            oVar.f15857g = new s3.g(applicationContext, i12);
        }
        oVar.f15855e = iVar2;
        f fVar = new f();
        if (oVar.f15854d == null) {
            oVar.f15854d = new ArrayList();
        }
        oVar.f15854d.add(fVar);
        oVar.a(i.f12319a);
        oVar.a(new h(applicationContext, 2, 3));
        oVar.a(i.f12320b);
        oVar.a(i.f12321c);
        oVar.a(new h(applicationContext, 5, 6));
        oVar.a(i.f12322d);
        oVar.a(i.f12323e);
        oVar.a(i.f12324f);
        oVar.a(new h(applicationContext));
        oVar.a(new h(applicationContext, 10, 11));
        oVar.a(i.f12325g);
        oVar.f15859i = false;
        oVar.f15860j = true;
        Context context2 = oVar.f15853c;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Class cls = oVar.f15851a;
        if (cls == null) {
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        Executor executor2 = oVar.f15855e;
        if (executor2 == null && oVar.f15856f == null) {
            u0 u0Var = m.a.f15364e;
            oVar.f15856f = u0Var;
            oVar.f15855e = u0Var;
        } else if (executor2 != null && oVar.f15856f == null) {
            oVar.f15856f = executor2;
        } else if (executor2 == null && (executor = oVar.f15856f) != null) {
            oVar.f15855e = executor;
        }
        if (oVar.f15857g == null) {
            oVar.f15857g = new d5.e();
        }
        String str2 = oVar.f15852b;
        r1.c cVar = oVar.f15857g;
        q qVar = oVar.f15861k;
        ArrayList arrayList = oVar.f15854d;
        boolean z10 = oVar.f15858h;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        int i13 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        Executor executor3 = oVar.f15855e;
        n1.a aVar = new n1.a(context2, str2, cVar, qVar, arrayList, z10, i13, executor3, oVar.f15856f, oVar.f15859i, oVar.f15860j);
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        String str3 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str3;
            } else {
                str = name + "." + str3;
            }
            p pVar = (p) Class.forName(str).newInstance();
            r1.d dVarE = pVar.e(aVar);
            pVar.f15865c = dVarE;
            if (dVarE instanceof r) {
                ((r) dVarE).f15886q = aVar;
            }
            boolean z11 = i13 == 3;
            dVarE.setWriteAheadLoggingEnabled(z11);
            pVar.f15869g = arrayList;
            pVar.f15864b = executor3;
            new ArrayDeque();
            pVar.f15867e = z10;
            pVar.f15868f = z11;
            WorkDatabase workDatabase = (WorkDatabase) pVar;
            Context applicationContext2 = context.getApplicationContext();
            n nVar = new n(bVar.f1511f);
            synchronized (n.class) {
                n.f1534b = nVar;
            }
            c[] cVarArr = new c[2];
            int i14 = Build.VERSION.SDK_INT;
            int i15 = d.f12309a;
            if (i14 >= 23) {
                iVar = new g2.c(applicationContext2, this);
                r52 = 1;
                m2.g.a(applicationContext2, SystemJobService.class, true);
                n.i().g(new Throwable[0]);
                i10 = 0;
            } else {
                try {
                    iVar = (c) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext2);
                    n nVarI = n.i();
                    String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler");
                    nVarI.g(new Throwable[0]);
                    r52 = 1;
                    i10 = 0;
                } catch (Throwable th) {
                    r52 = 1;
                    i10 = 0;
                    n.i().g(th);
                    iVar = null;
                }
                if (iVar == null) {
                    iVar = new f2.i(applicationContext2);
                    m2.g.a(applicationContext2, SystemAlarmService.class, r52);
                    n.i().g(new Throwable[i10]);
                }
            }
            cVarArr[i10] = iVar;
            cVarArr[r52] = new e2.b(applicationContext2, bVar, ur0Var, this);
            List listAsList = Arrays.asList(cVarArr);
            b bVar2 = new b(context, bVar, ur0Var, workDatabase, listAsList);
            Context applicationContext3 = context.getApplicationContext();
            this.f12330c = applicationContext3;
            this.f12331d = bVar;
            this.f12333f = ur0Var;
            this.f12332e = workDatabase;
            this.f12334g = listAsList;
            this.f12335h = bVar2;
            this.f12336i = new q(17, workDatabase);
            this.f12337j = false;
            if (Build.VERSION.SDK_INT >= 24 && applicationContext3.isDeviceProtectedStorage()) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            ((ur0) this.f12333f).s(new m2.e(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    public static k r0() {
        synchronized (f12329n) {
            try {
                k kVar = f12327l;
                if (kVar != null) {
                    return kVar;
                }
                return f12328m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static k s0(Context context) {
        k kVarR0;
        synchronized (f12329n) {
            try {
                kVarR0 = r0();
                if (kVarR0 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVarR0;
    }

    public static void t0(Context context, c2.b bVar) {
        synchronized (f12329n) {
            try {
                k kVar = f12327l;
                if (kVar != null && f12328m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (kVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f12328m == null) {
                        f12328m = new k(applicationContext, bVar, new ur0(bVar.f1507b));
                    }
                    f12327l = f12328m;
                }
            } finally {
            }
        }
    }

    public final f.f q0(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        e eVar = new e(this, list);
        if (eVar.f12314f) {
            n nVarI = n.i();
            String.format("Already enqueued work ids (%s)", TextUtils.join(", ", eVar.f12312d));
            nVarI.n(new Throwable[0]);
        } else {
            m2.d dVar = new m2.d(eVar);
            ((ur0) this.f12333f).s(dVar);
            eVar.f12315g = dVar.f15695b;
        }
        return eVar.f12315g;
    }

    public final void u0() {
        synchronized (f12329n) {
            try {
                this.f12337j = true;
                BroadcastReceiver.PendingResult pendingResult = this.f12338k;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f12338k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v0() {
        ArrayList arrayListD;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f12330c;
            int i10 = g2.c.f13630h;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null && (arrayListD = g2.c.d(context, jobScheduler)) != null && !arrayListD.isEmpty()) {
                Iterator it = arrayListD.iterator();
                while (it.hasNext()) {
                    g2.c.a(jobScheduler, ((JobInfo) it.next()).getId());
                }
            }
        }
        l2.l lVarN = this.f12332e.n();
        Object obj = lVarN.f15161a;
        p pVar = (p) obj;
        pVar.b();
        s1.g gVarA = ((s) lVarN.f15169u).a();
        pVar.c();
        try {
            gVarA.f16678b.executeUpdateDelete();
            ((p) obj).h();
            pVar.f();
            ((s) lVarN.f15169u).c(gVarA);
            d.a(this.f12331d, this.f12332e, this.f12334g);
        } catch (Throwable th) {
            pVar.f();
            ((s) lVarN.f15169u).c(gVarA);
            throw th;
        }
    }

    public final void w0(String str, ur0 ur0Var) {
        ((ur0) this.f12333f).s(new l0.a(this, str, ur0Var, 7, 0));
    }

    public final void x0(String str) {
        ((ur0) this.f12333f).s(new m2.j(this, str, false));
    }
}
