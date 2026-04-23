package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class ai0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h1.d f2687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2688b;

    public ai0(Context context) {
        this.f2688b = context;
    }

    public final n5.a a() {
        try {
            Context context = this.f2688b;
            g4.a0.f(context, "context");
            int i10 = Build.VERSION.SDK_INT;
            f1.a aVar = f1.a.f13053a;
            if (i10 >= 30) {
                aVar.a();
            }
            j1.d dVar = (i10 < 30 || aVar.a() < 5) ? null : new j1.d(context);
            h1.d dVar2 = dVar != null ? new h1.d(dVar) : null;
            this.f2687a = dVar2;
            return dVar2 == null ? tc1.Z(new IllegalStateException("MeasurementManagerFutures is null")) : dVar2.b();
        } catch (Exception e10) {
            return tc1.Z(e10);
        }
    }
}
