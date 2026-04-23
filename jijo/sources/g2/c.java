package g2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import c2.n;
import c2.w;
import d2.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l2.e;
import l2.j;
import m2.f;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d2.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f13630h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JobScheduler f13632b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f13633d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f13634f;

    static {
        n.l("SystemJobScheduler");
    }

    public c(Context context, k kVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        b bVar = new b(context);
        this.f13631a = context;
        this.f13633d = kVar;
        this.f13632b = jobScheduler;
        this.f13634f = bVar;
    }

    public static void a(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            n nVarI = n.i();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10));
            nVarI.h(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList c(android.content.Context r5, android.app.job.JobScheduler r6, java.lang.String r7) {
        /*
            java.util.ArrayList r5 = d(r5, r6)
            r6 = 0
            if (r5 != 0) goto L8
            return r6
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r5.next()
            android.app.job.JobInfo r1 = (android.app.job.JobInfo) r1
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r1.getExtras()
            if (r3 == 0) goto L32
            boolean r4 = r3.containsKey(r2)     // Catch: java.lang.NullPointerException -> L31
            if (r4 == 0) goto L32
            java.lang.String r2 = r3.getString(r2)     // Catch: java.lang.NullPointerException -> L31
            goto L33
        L31:
        L32:
            r2 = r6
        L33:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L12
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L12
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.c.c(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            n.i().h(th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // d2.c
    public final void b(String str) {
        Context context = this.f13631a;
        JobScheduler jobScheduler = this.f13632b;
        ArrayList arrayListC = c(context, jobScheduler, str);
        if (arrayListC == null || arrayListC.isEmpty()) {
            return;
        }
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.f13633d.f12332e.k().N(str);
    }

    @Override // d2.c
    public final void e(j... jVarArr) {
        int iO;
        ArrayList arrayListC;
        int iO2;
        k kVar = this.f13633d;
        WorkDatabase workDatabase = kVar.f12332e;
        f fVar = new f(0, workDatabase);
        for (j jVar : jVarArr) {
            workDatabase.c();
            try {
                j jVarH = workDatabase.n().h(jVar.f15142a);
                if (jVarH == null) {
                    n.i().n(new Throwable[0]);
                    workDatabase.h();
                } else if (jVarH.f15143b != w.f1547a) {
                    n.i().n(new Throwable[0]);
                    workDatabase.h();
                } else {
                    e eVarF = workDatabase.k().F(jVar.f15142a);
                    if (eVarF != null) {
                        iO = eVarF.f15133b;
                    } else {
                        kVar.f12331d.getClass();
                        iO = fVar.o(kVar.f12331d.f1512g);
                    }
                    if (eVarF == null) {
                        kVar.f12332e.k().I(new e(jVar.f15142a, iO));
                    }
                    g(jVar, iO);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListC = c(this.f13631a, this.f13632b, jVar.f15142a)) != null) {
                        int iIndexOf = arrayListC.indexOf(Integer.valueOf(iO));
                        if (iIndexOf >= 0) {
                            arrayListC.remove(iIndexOf);
                        }
                        if (arrayListC.isEmpty()) {
                            kVar.f12331d.getClass();
                            iO2 = fVar.o(kVar.f12331d.f1512g);
                        } else {
                            iO2 = ((Integer) arrayListC.get(0)).intValue();
                        }
                        g(jVar, iO2);
                    }
                    workDatabase.h();
                }
            } finally {
                workDatabase.f();
            }
        }
    }

    @Override // d2.c
    public final boolean f() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (r6 < 26) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(l2.j r19, int r20) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.c.g(l2.j, int):void");
    }
}
