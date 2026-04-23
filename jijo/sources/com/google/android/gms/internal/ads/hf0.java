package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class hf0 implements xf0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f5270h = Pattern.compile("Received error HTTP response code: (.*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq f5271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p21 f5272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final or0 f5273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f5274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dh0 f5275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft0 f5276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f5277g;

    public hf0(Context context, or0 or0Var, xq xqVar, mu muVar, ScheduledExecutorService scheduledExecutorService, dh0 dh0Var, ft0 ft0Var) {
        this.f5277g = context;
        this.f5273c = or0Var;
        this.f5271a = xqVar;
        this.f5272b = muVar;
        this.f5274d = scheduledExecutorService;
        this.f5275e = dh0Var;
        this.f5276f = ft0Var;
    }

    @Override // com.google.android.gms.internal.ads.xf0
    public final n5.a a(zzbvb zzbvbVar) {
        n5.a aVarV;
        xq xqVar = this.f5271a;
        xqVar.getClass();
        String str = zzbvbVar.f11577f;
        zzu.zzp();
        if (zzt.zzC(str)) {
            aVarV = tc1.Z(new zzdyp(1));
        } else {
            aVarV = tc1.V(((q11) ((p21) xqVar.f10630b)).b(new xa(xqVar, 4, zzbvbVar)), ExecutionException.class, new f00(3), (p21) xqVar.f10631d);
        }
        y01 y01VarV = tc1.V(aVarV, zzdyp.class, new ye0(xqVar, zzbvbVar, Binder.getCallingUid(), 0), (p21) xqVar.f10631d);
        bt0 bt0VarD = tc1.d(this.f5277g, 11);
        tc1.J(y01VarV, bt0VarD);
        n5.a aVarQ0 = tc1.q0(y01VarV, new if0(9, this), this.f5272b);
        if (((Boolean) zzba.zzc().a(eg.T4)).booleanValue()) {
            aVarQ0 = tc1.V(tc1.r0(aVarQ0, ((Integer) zzba.zzc().a(eg.U4)).intValue(), TimeUnit.SECONDS, this.f5274d), TimeoutException.class, new f00(4), nu.f7388f);
        }
        tc1.b0(aVarQ0, this.f5276f, bt0VarD, false);
        tc1.u0(aVarQ0, new i10(19, this), nu.f7388f);
        return aVarQ0;
    }
}
