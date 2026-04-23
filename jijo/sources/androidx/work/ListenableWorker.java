package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import c2.a0;
import c2.f;
import c2.g;
import c2.h;
import c2.v;
import com.google.android.gms.internal.ads.ur0;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import m2.n;
import m2.o;
import m2.p;
import n2.i;
import n5.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkerParameters f1163b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f1164d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1165f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1166h;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f1162a = context;
        this.f1163b = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f1162a;
    }

    public Executor getBackgroundExecutor() {
        return this.f1163b.f1173f;
    }

    public a getForegroundInfoAsync() {
        i iVar = new i();
        iVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return iVar;
    }

    public final UUID getId() {
        return this.f1163b.f1168a;
    }

    public final f getInputData() {
        return this.f1163b.f1169b;
    }

    public final Network getNetwork() {
        return (Network) this.f1163b.f1171d.f9602f;
    }

    public final int getRunAttemptCount() {
        return this.f1163b.f1172e;
    }

    public final Set<String> getTags() {
        return this.f1163b.f1170c;
    }

    public o2.a getTaskExecutor() {
        return this.f1163b.f1174g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.f1163b.f1171d.f9600b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.f1163b.f1171d.f9601d;
    }

    public a0 getWorkerFactory() {
        return this.f1163b.f1175h;
    }

    public boolean isRunInForeground() {
        return this.f1166h;
    }

    public final boolean isStopped() {
        return this.f1164d;
    }

    public final boolean isUsed() {
        return this.f1165f;
    }

    public void onStopped() {
    }

    public final a setForegroundAsync(g gVar) {
        this.f1166h = true;
        h hVar = this.f1163b.f1177j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        o oVar = (o) hVar;
        oVar.getClass();
        i iVar = new i();
        ((ur0) oVar.f15726a).s(new n(oVar, iVar, id, gVar, applicationContext));
        return iVar;
    }

    public a setProgressAsync(f fVar) {
        v vVar = this.f1163b.f1176i;
        getApplicationContext();
        UUID id = getId();
        p pVar = (p) vVar;
        pVar.getClass();
        i iVar = new i();
        ((ur0) pVar.f15731b).s(new k.g(pVar, id, fVar, iVar, 3));
        return iVar;
    }

    public void setRunInForeground(boolean z9) {
        this.f1166h = z9;
    }

    public final void setUsed() {
        this.f1165f = true;
    }

    public abstract a startWork();

    public final void stop() {
        this.f1164d = true;
        onStopped();
    }
}
