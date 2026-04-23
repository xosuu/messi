package m2;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.android.gms.internal.ads.ur0;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2.i f15711b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f15712d;

    public /* synthetic */ l(m mVar, n2.i iVar, int i10) {
        this.f15710a = i10;
        this.f15712d = mVar;
        this.f15711b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f15710a;
        n2.i iVar = this.f15711b;
        m mVar = this.f15712d;
        switch (i10) {
            case 0:
                iVar.l(mVar.f15717f.getForegroundInfoAsync());
                return;
            default:
                try {
                    c2.g gVar = (c2.g) iVar.get();
                    if (gVar == null) {
                        throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", mVar.f15716d.f15144c));
                    }
                    c2.n nVarI = c2.n.i();
                    int i11 = m.f15713s;
                    Object[] objArr = new Object[1];
                    l2.j jVar = mVar.f15716d;
                    ListenableWorker listenableWorker = mVar.f15717f;
                    objArr[0] = jVar.f15144c;
                    String.format("Updating notification for %s", objArr);
                    nVarI.g(new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    n2.i iVar2 = mVar.f15714a;
                    c2.h hVar = mVar.f15718h;
                    Context context = mVar.f15715b;
                    UUID id = listenableWorker.getId();
                    o oVar = (o) hVar;
                    oVar.getClass();
                    n2.i iVar3 = new n2.i();
                    ((ur0) oVar.f15726a).s(new n(oVar, iVar3, id, gVar, context));
                    iVar2.l(iVar3);
                    return;
                } catch (Throwable th) {
                    mVar.f15714a.k(th);
                    return;
                }
        }
    }
}
