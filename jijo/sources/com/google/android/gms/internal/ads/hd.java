package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class hd {
    public static final ed a(Context context, zzbah zzbahVar) {
        l7 l7Var = new l7(context);
        ed edVar = new ed(l7Var);
        ur0 ur0Var = new ur0(l7Var, zzbahVar, edVar, 23);
        p80 p80Var = new p80(l7Var, edVar, 5);
        synchronized (l7Var.f6524b) {
            cd cdVar = new cd((Context) l7Var.f6526f, zzu.zzt().zzb(), ur0Var, p80Var, 0);
            l7Var.f6525d = cdVar;
            cdVar.checkAvailabilityAndConnect();
        }
        return edVar;
    }
}
