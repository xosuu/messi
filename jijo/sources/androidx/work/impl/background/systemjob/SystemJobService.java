package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import c2.n;
import com.google.android.gms.internal.ads.ur0;
import d2.a;
import d2.k;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f1191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f1192b = new HashMap();

    static {
        n.l("SystemJobService");
    }

    @Override // d2.a
    public final void a(String str, boolean z9) {
        JobParameters jobParameters;
        n nVarI = n.i();
        String.format("%s executed on JobScheduler", str);
        nVarI.g(new Throwable[0]);
        synchronized (this.f1192b) {
            jobParameters = (JobParameters) this.f1192b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z9);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k kVarS0 = k.s0(getApplicationContext());
            this.f1191a = kVarS0;
            kVarS0.f12335h.b(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            n.i().n(new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.f1191a;
        if (kVar != null) {
            kVar.f12335h.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.f1191a == null) {
            n.i().g(new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        ur0 ur0Var = null;
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            n.i().h(new Throwable[0]);
            return false;
        }
        synchronized (this.f1192b) {
            try {
                if (this.f1192b.containsKey(string)) {
                    n nVarI = n.i();
                    String.format("Job is already being executed by SystemJobService: %s", string);
                    nVarI.g(new Throwable[0]);
                    return false;
                }
                n nVarI2 = n.i();
                String.format("onStartJob for %s", string);
                nVarI2.g(new Throwable[0]);
                this.f1192b.put(string, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    ur0Var = new ur0();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        ur0Var.f9601d = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        ur0Var.f9600b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i10 >= 28) {
                        ur0Var.f9602f = jobParameters.getNetwork();
                    }
                }
                this.f1191a.w0(string, ur0Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.f1191a == null) {
            n.i().g(new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            n.i().h(new Throwable[0]);
            return false;
        }
        n nVarI = n.i();
        String.format("onStopJob for %s", string);
        nVarI.g(new Throwable[0]);
        synchronized (this.f1192b) {
            this.f1192b.remove(string);
        }
        this.f1191a.x0(string);
        return !this.f1191a.f12335h.d(string);
    }
}
