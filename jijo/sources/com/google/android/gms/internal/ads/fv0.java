package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class fv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Looper f4673b;

    public fv0(Context context, Looper looper) {
        this.f4672a = context;
        this.f4673b = looper;
    }

    public final void a(String str) {
        ov0 ov0VarA = qv0.A();
        String packageName = this.f4672a.getPackageName();
        ov0VarA.d();
        qv0.B((qv0) ov0VarA.f9462b, packageName);
        ov0VarA.d();
        qv0.D((qv0) ov0VarA.f9462b);
        mv0 mv0VarA = nv0.A();
        mv0VarA.d();
        nv0.B((nv0) mv0VarA.f9462b, str);
        mv0VarA.d();
        nv0.C((nv0) mv0VarA.f9462b);
        ov0VarA.d();
        qv0.C((qv0) ov0VarA.f9462b, (nv0) mv0VarA.b());
        n1.g gVar = new n1.g(this.f4672a, this.f4673b, (qv0) ov0VarA.b());
        synchronized (gVar.f15835h) {
            try {
                if (!gVar.f15831a) {
                    gVar.f15831a = true;
                    ((sv0) gVar.f15833d).checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
