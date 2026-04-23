package e8;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.ql1;
import x7.e;

/* JADX INFO: loaded from: classes.dex */
public final class a extends org.minidns.iterative.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f12783l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ql1 ql1Var) {
        super(ql1Var);
        this.f12783l = cVar;
        this.f16154j = NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // org.minidns.a
    public final boolean c(e eVar, y7.c cVar) {
        return this.f12783l.c(eVar, cVar) && cVar.f20468a.f18534e;
    }

    @Override // org.minidns.a
    public final x7.a d(x7.a aVar) {
        aVar.f18511g = false;
        if (aVar.f18520p == null) {
            aVar.f18520p = new c8.a();
        }
        c8.a aVar2 = aVar.f18520p;
        this.f16128e.getClass();
        aVar2.f1583a = 1024;
        return this.f12783l.d(aVar);
    }
}
