package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.activity.e;
import androidx.annotation.Keep;
import c2.m;
import n2.i;
import n5.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f1167q;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract m doWork();

    @Override // androidx.work.ListenableWorker
    public final a startWork() {
        this.f1167q = new i();
        getBackgroundExecutor().execute(new e(12, this));
        return this.f1167q;
    }
}
