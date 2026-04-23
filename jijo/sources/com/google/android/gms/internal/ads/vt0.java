package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzr;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class vt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f9965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzr f9966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gt0 f9967d;

    public vt0(Context context, mu muVar, zzr zzrVar, gt0 gt0Var) {
        this.f9964a = context;
        this.f9965b = muVar;
        this.f9966c = zzrVar;
        this.f9967d = gt0Var;
    }

    public final void a(String str, ft0 ft0Var) {
        boolean zA = gt0.a();
        Executor executor = this.f9965b;
        if (zA && ((Boolean) eh.f4204d.k()).booleanValue()) {
            executor.execute(new l0.a(this, str, ft0Var, 18, 0));
        } else {
            executor.execute(new m00(this, str, 1));
        }
    }

    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((String) it.next(), null);
        }
    }
}
