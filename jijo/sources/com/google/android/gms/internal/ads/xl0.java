package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class xl0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10598a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p21 f10599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f10600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10603f;

    public xl0(p21 p21Var, mu muVar, Context context, or0 or0Var, ViewGroup viewGroup) {
        this.f10599b = p21Var;
        this.f10601d = muVar;
        this.f10600c = context;
        this.f10602e = or0Var;
        this.f10603f = viewGroup;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        View view = (View) this.f10603f;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        switch (this.f10598a) {
            case 0:
                return 3;
            default:
                return 11;
        }
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        k4.l lVarA;
        final int i10 = 0;
        switch (this.f10598a) {
            case 0:
                eg.a(this.f10600c);
                if (((Boolean) zzba.zzc().a(eg.fa)).booleanValue()) {
                    return ((q11) ((p21) this.f10601d)).b(new Callable(this) { // from class: com.google.android.gms.internal.ads.wl0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ xl0 f10226b;

                        {
                            this.f10226b = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i11 = i10;
                            xl0 xl0Var = this.f10226b;
                            switch (i11) {
                                case 0:
                                    return new yl0(xl0Var.f10600c, ((or0) xl0Var.f10602e).f7645e, xl0Var.a());
                                default:
                                    return new yl0(xl0Var.f10600c, ((or0) xl0Var.f10602e).f7645e, xl0Var.a());
                            }
                        }
                    });
                }
                final int i11 = 1;
                return ((q11) this.f10599b).b(new Callable(this) { // from class: com.google.android.gms.internal.ads.wl0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ xl0 f10226b;

                    {
                        this.f10226b = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i112 = i11;
                        xl0 xl0Var = this.f10226b;
                        switch (i112) {
                            case 0:
                                return new yl0(xl0Var.f10600c, ((or0) xl0Var.f10602e).f7645e, xl0Var.a());
                            default:
                                return new yl0(xl0Var.f10600c, ((or0) xl0Var.f10602e).f7645e, xl0Var.a());
                        }
                    }
                });
            default:
                if (((Boolean) zzba.zzc().a(eg.w2)).booleanValue()) {
                    if (!((Boolean) zzba.zzc().a(eg.B2)).booleanValue()) {
                        if (!((Boolean) zzba.zzc().a(eg.f4173x2)).booleanValue()) {
                            return tc1.o0(en1.R(((q3.a) this.f10602e).a()), new b3(11), nu.f7388f);
                        }
                        if (((Boolean) zzba.zzc().a(eg.A2)).booleanValue()) {
                            xr0.a(this.f10600c, false);
                            synchronized (xr0.f10646c) {
                                lVarA = xr0.f10644a;
                                break;
                            }
                        } else {
                            lVarA = ((q3.a) this.f10602e).a();
                        }
                        if (lVarA == null) {
                            return tc1.d0(new vm0(null, -1, 0));
                        }
                        n5.a aVarQ0 = tc1.q0(en1.R(lVarA), new f00(18), nu.f7388f);
                        if (((Boolean) zzba.zzc().a(eg.f4183y2)).booleanValue()) {
                            aVarQ0 = tc1.r0(aVarQ0, ((Long) zzba.zzc().a(eg.f4192z2)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f10603f);
                        }
                        return tc1.P(aVarQ0, Exception.class, new qr(5, this), this.f10599b);
                    }
                }
                return tc1.d0(new vm0(null, -1, 0));
        }
    }

    public xl0(Context context, gu guVar, ScheduledExecutorService scheduledExecutorService, mu muVar) {
        if (!((Boolean) zzba.zzc().a(eg.A2)).booleanValue()) {
            this.f10602e = new d4.i(context);
        }
        this.f10600c = context;
        this.f10601d = guVar;
        this.f10603f = scheduledExecutorService;
        this.f10599b = muVar;
    }
}
