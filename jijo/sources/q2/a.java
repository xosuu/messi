package q2;

import t8.w;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16388b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f16387a = i10;
        this.f16388b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16387a;
        Object obj = this.f16388b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                w wVar = cVar.f16406o;
                if (wVar != null) {
                    wVar.a();
                }
                cVar.b();
                break;
            default:
                c cVar2 = (c) obj;
                w wVar2 = cVar2.f16406o;
                if (wVar2 != null) {
                    wVar2.a();
                }
                cVar2.b();
                break;
        }
    }
}
