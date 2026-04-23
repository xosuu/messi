package m2;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.android.gms.internal.ads.ur0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f15713s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2.i f15714a = new n2.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f15715b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l2.j f15716d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ListenableWorker f15717f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c2.h f15718h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o2.a f15719q;

    static {
        c2.n.l("WorkForegroundRunnable");
    }

    public m(Context context, l2.j jVar, ListenableWorker listenableWorker, o oVar, o2.a aVar) {
        this.f15715b = context;
        this.f15716d = jVar;
        this.f15717f = listenableWorker;
        this.f15718h = oVar;
        this.f15719q = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f15716d.f15158q || p7.q.l()) {
            this.f15714a.j(null);
            return;
        }
        n2.i iVar = new n2.i();
        o2.a aVar = this.f15719q;
        ((Executor) ((ur0) aVar).f9602f).execute(new l(this, iVar, 0));
        iVar.a(new l(this, iVar, 1), (Executor) ((ur0) aVar).f9602f);
    }
}
