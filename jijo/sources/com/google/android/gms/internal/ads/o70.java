package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o70 extends oe1 implements wb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f7524b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f7525d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fr0 f7526f;

    public o70(Context context, Set set, fr0 fr0Var) {
        super(set);
        this.f7524b = new WeakHashMap(1);
        this.f7525d = context;
        this.f7526f = fr0Var;
    }

    public final synchronized void J0(View view) {
        try {
            xb xbVar = (xb) this.f7524b.get(view);
            if (xbVar == null) {
                xb xbVar2 = new xb(this.f7525d, view);
                xbVar2.f10529x.add(this);
                xbVar2.c(3);
                this.f7524b.put(view, xbVar2);
                xbVar = xbVar2;
            }
            if (this.f7526f.X) {
                if (((Boolean) zzba.zzc().a(eg.f3991f1)).booleanValue()) {
                    xbVar.f10526u.zza(((Long) zzba.zzc().a(eg.f3980e1)).longValue());
                    return;
                }
            }
            xbVar.f10526u.zza(xb.A);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.wb
    public final synchronized void Z(vb vbVar) {
        I0(new rk0(13, vbVar));
    }
}
