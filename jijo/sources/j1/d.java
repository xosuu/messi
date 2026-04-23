package j1;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.google.android.gms.internal.ads.en1;
import g4.a0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends q7.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MeasurementManager f14281b;

    public d(Context context) {
        Object systemService = context.getSystemService((Class<Object>) b.k());
        a0.e(systemService, "context.getSystemService…:class.java\n            )");
        this.f14281b = b.c(systemService);
    }

    @Override // q7.b
    public Object i(n6.e eVar) {
        b7.d dVar = new b7.d(en1.u(eVar));
        dVar.l();
        this.f14281b.getMeasurementApiStatus(new c(0), new k0.d(dVar));
        return dVar.k();
    }

    @Override // q7.b
    public Object p(Uri uri, InputEvent inputEvent, n6.e eVar) throws Throwable {
        b7.d dVar = new b7.d(en1.u(eVar));
        dVar.l();
        this.f14281b.registerSource(uri, inputEvent, new c(4), new k0.d(dVar));
        Object objK = dVar.k();
        return objK == o6.a.f16110a ? objK : l6.f.f15231a;
    }

    @Override // q7.b
    public Object q(Uri uri, n6.e eVar) throws Throwable {
        b7.d dVar = new b7.d(en1.u(eVar));
        dVar.l();
        this.f14281b.registerTrigger(uri, new c(1), new k0.d(dVar));
        Object objK = dVar.k();
        return objK == o6.a.f16110a ? objK : l6.f.f15231a;
    }

    public Object x(a aVar, n6.e eVar) {
        new b7.d(en1.u(eVar)).l();
        b.m();
        throw null;
    }

    public Object y(e eVar, n6.e eVar2) {
        new b7.d(en1.u(eVar2)).l();
        b.t();
        throw null;
    }

    public Object z(f fVar, n6.e eVar) {
        new b7.d(en1.u(eVar)).l();
        b.u();
        throw null;
    }
}
