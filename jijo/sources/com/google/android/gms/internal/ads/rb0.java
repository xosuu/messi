package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class rb0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zza f8557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ed0 f8559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lh0 f8560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f8561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y9 f8562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f8563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vt0 f8564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qh0 f8565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pr0 f8566j;

    public rb0(Context context, Executor executor, y9 y9Var, VersionInfoParcel versionInfoParcel, zza zzaVar, lh0 lh0Var, vt0 vt0Var, ed0 ed0Var, qh0 qh0Var, pr0 pr0Var) {
        this.f8558b = context;
        this.f8561e = executor;
        this.f8562f = y9Var;
        this.f8563g = versionInfoParcel;
        this.f8557a = zzaVar;
        this.f8560d = lh0Var;
        this.f8564h = vt0Var;
        this.f8559c = ed0Var;
        this.f8565i = qh0Var;
        this.f8566j = pr0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        tb0 tb0Var = new tb0(this);
        synchronized (tb0Var) {
            String str = (String) zzba.zzc().a(eg.f4117r3);
            Context context = tb0Var.f9098c;
            y9 y9Var = tb0Var.f9101f;
            VersionInfoParcel versionInfoParcel = tb0Var.f9102g;
            zza zzaVar = tb0Var.f9097b;
            qh0 qh0Var = tb0Var.f9106k;
            pr0 pr0Var = tb0Var.f9107l;
            l.b4 b4Var = new l.b4();
            b4Var.f14809a = context;
            b4Var.f14810b = y9Var;
            b4Var.f14811d = versionInfoParcel;
            b4Var.f14812f = zzaVar;
            b4Var.f14813h = qh0Var;
            b4Var.f14814q = pr0Var;
            b4Var.f14815s = str;
            s11 s11VarO0 = tc1.o0(tc1.k0(b4Var, nu.f7387e), new qr(1, tb0Var), tb0Var.f9100e);
            tb0Var.f9108m = s11VarO0;
            b4.f.Z(s11VarO0, "NativeJavascriptExecutor.initializeEngine");
        }
        return tb0Var;
    }
}
