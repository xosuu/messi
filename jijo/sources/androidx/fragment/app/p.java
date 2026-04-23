package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.a f852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t3.i f854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.result.a f855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f856e;

    public p(s sVar, o oVar, AtomicReference atomicReference, d.b bVar, androidx.activity.result.a aVar) {
        this.f856e = sVar;
        this.f852a = oVar;
        this.f853b = atomicReference;
        this.f854c = bVar;
        this.f855d = aVar;
    }

    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        s sVar = this.f856e;
        sb.append(sVar.f892q);
        sb.append("_rq#");
        sb.append(sVar.f888e0.getAndIncrement());
        this.f853b.set(((androidx.activity.result.f) this.f852a.apply()).c(sb.toString(), sVar, this.f854c, this.f855d));
    }
}
