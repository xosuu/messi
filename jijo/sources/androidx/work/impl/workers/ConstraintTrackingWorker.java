package androidx.work.impl.workers;

import android.content.Context;
import androidx.activity.e;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import c2.n;
import d2.k;
import h2.b;
import java.util.ArrayList;
import java.util.List;
import n2.i;
import o2.a;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f1197w = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WorkerParameters f1198q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f1199s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f1200t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i f1201u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ListenableWorker f1202v;

    static {
        n.l("ConstraintTrkngWrkr");
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1198q = workerParameters;
        this.f1199s = new Object();
        this.f1200t = false;
        this.f1201u = new i();
    }

    @Override // h2.b
    public final void c(ArrayList arrayList) {
        n nVarI = n.i();
        String.format("Constraints changed for %s", arrayList);
        nVarI.g(new Throwable[0]);
        synchronized (this.f1199s) {
            this.f1200t = true;
        }
    }

    @Override // h2.b
    public final void d(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final a getTaskExecutor() {
        return k.s0(getApplicationContext()).f12333f;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f1202v;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f1202v;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f1202v.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final n5.a startWork() {
        getBackgroundExecutor().execute(new e(13, this));
        return this.f1201u;
    }
}
