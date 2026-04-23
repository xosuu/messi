package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class k80 implements e50, zzp, w40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx f6210b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fr0 f6211d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final VersionInfoParcel f6212f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final md f6213h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yh0 f6214q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zh0 f6215s;

    public k80(Context context, fx fxVar, fr0 fr0Var, VersionInfoParcel versionInfoParcel, md mdVar, yh0 yh0Var) {
        this.f6209a = context;
        this.f6210b = fxVar;
        this.f6211d = fr0Var;
        this.f6212f = versionInfoParcel;
        this.f6213h = mdVar;
        this.f6214q = yh0Var;
    }

    public final boolean a() {
        cu0 cu0Var;
        if (!((Boolean) zzba.zzc().a(eg.C4)).booleanValue()) {
            return false;
        }
        yh0 yh0Var = this.f6214q;
        synchronized (yh0Var) {
            cu0Var = yh0Var.f10888e;
        }
        return cu0Var != null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        fx fxVar;
        if (((Boolean) zzba.zzc().a(eg.G4)).booleanValue() || (fxVar = this.f6210b) == null) {
            return;
        }
        if (this.f6215s != null || a()) {
            if (this.f6215s != null) {
                fxVar.j("onSdkImpression", new s.b());
            } else {
                this.f6214q.a();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
        this.f6215s = null;
    }

    @Override // com.google.android.gms.internal.ads.w40
    public final void zzr() {
        fx fxVar;
        if (a()) {
            this.f6214q.a();
        } else {
            if (this.f6215s == null || (fxVar = this.f6210b) == null) {
                return;
            }
            if (((Boolean) zzba.zzc().a(eg.G4)).booleanValue()) {
                fxVar.j("onSdkImpression", new s.b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.e50
    public final void zzs() {
        fx fxVar;
        int i10;
        int i11;
        if (!((Boolean) zzba.zzc().a(eg.J4)).booleanValue()) {
            md mdVar = md.REWARD_BASED_VIDEO_AD;
            md mdVar2 = this.f6213h;
            if (mdVar2 != mdVar && mdVar2 != md.INTERSTITIAL && mdVar2 != md.APP_OPEN) {
                return;
            }
        }
        fr0 fr0Var = this.f6211d;
        if (fr0Var.T && (fxVar = this.f6210b) != 0 && ((k70) zzu.zzA()).f(this.f6209a)) {
            if (a()) {
                this.f6214q.b();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.f6212f;
            String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
            aa aaVar = fr0Var.V;
            String str2 = aaVar.q() + (-1) != 1 ? "javascript" : null;
            if (aaVar.q() == 1) {
                i10 = 2;
                i11 = 3;
            } else {
                i10 = fr0Var.Y == 2 ? 4 : 1;
                i11 = 1;
            }
            zh0 zh0VarB = ((k70) zzu.zzA()).b(str, fxVar.q(), str2, i10, i11, fr0Var.f4623l0);
            this.f6215s = zh0VarB;
            if (zh0VarB != null) {
                boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.B4)).booleanValue();
                yt0 yt0Var = zh0VarB.f11241a;
                if (zBooleanValue) {
                    ((k70) zzu.zzA()).d(yt0Var, fxVar.q());
                    for (View view : fxVar.o0()) {
                        ((k70) zzu.zzA()).getClass();
                        k70.m(new sh0(yt0Var, view, 0));
                    }
                } else {
                    ((k70) zzu.zzA()).d(yt0Var, (View) fxVar);
                }
                fxVar.k0(this.f6215s);
                ((k70) zzu.zzA()).e(yt0Var);
                fxVar.j("onSdkLoaded", new s.b());
            }
        }
    }
}
