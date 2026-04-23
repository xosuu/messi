package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class j20 implements e50, w40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx f5776b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fr0 f5777d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final VersionInfoParcel f5778f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zh0 f5779h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5780q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yh0 f5781s;

    public j20(Context context, fx fxVar, fr0 fr0Var, VersionInfoParcel versionInfoParcel, yh0 yh0Var) {
        this.f5775a = context;
        this.f5776b = fxVar;
        this.f5777d = fr0Var;
        this.f5778f = versionInfoParcel;
        this.f5781s = yh0Var;
    }

    public final synchronized void a() {
        int i10;
        int i11;
        try {
            if (this.f5777d.T && this.f5776b != null) {
                if (((k70) zzu.zzA()).f(this.f5775a)) {
                    VersionInfoParcel versionInfoParcel = this.f5778f;
                    String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                    aa aaVar = this.f5777d.V;
                    String str2 = aaVar.q() + (-1) != 1 ? "javascript" : null;
                    if (aaVar.q() == 1) {
                        i10 = 2;
                        i11 = 3;
                    } else {
                        i10 = this.f5777d.f4608e == 1 ? 3 : 1;
                        i11 = 1;
                    }
                    zh0 zh0VarB = ((k70) zzu.zzA()).b(str, this.f5776b.q(), str2, i10, i11, this.f5777d.f4623l0);
                    this.f5779h = zh0VarB;
                    Object obj = this.f5776b;
                    if (zh0VarB != null) {
                        yt0 yt0Var = zh0VarB.f11241a;
                        if (((Boolean) zzba.zzc().a(eg.B4)).booleanValue()) {
                            ((k70) zzu.zzA()).d(yt0Var, this.f5776b.q());
                            for (View view : this.f5776b.o0()) {
                                ((k70) zzu.zzA()).getClass();
                                k70.m(new sh0(yt0Var, view, 0));
                            }
                        } else {
                            ((k70) zzu.zzA()).d(yt0Var, (View) obj);
                        }
                        this.f5776b.k0(this.f5779h);
                        ((k70) zzu.zzA()).e(yt0Var);
                        this.f5780q = true;
                        this.f5776b.j("onSdkLoaded", new s.b());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b() {
        cu0 cu0Var;
        if (!((Boolean) zzba.zzc().a(eg.C4)).booleanValue()) {
            return false;
        }
        yh0 yh0Var = this.f5781s;
        synchronized (yh0Var) {
            cu0Var = yh0Var.f10888e;
        }
        return cu0Var != null;
    }

    @Override // com.google.android.gms.internal.ads.w40
    public final synchronized void zzr() {
        fx fxVar;
        if (b()) {
            this.f5781s.a();
            return;
        }
        if (!this.f5780q) {
            a();
        }
        if (!this.f5777d.T || this.f5779h == null || (fxVar = this.f5776b) == null) {
            return;
        }
        fxVar.j("onSdkImpression", new s.b());
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final synchronized void zzs() {
        if (b()) {
            this.f5781s.b();
        } else {
            if (this.f5780q) {
                return;
            }
            a();
        }
    }
}
