package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class li0 implements ci0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kc0 f6632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final or0 f6633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f6634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final VersionInfoParcel f6635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yk f6636g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qh0 f6638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f6639j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6630a = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6637h = ((Boolean) zzba.zzc().a(eg.Z7)).booleanValue();

    public li0(Context context, VersionInfoParcel versionInfoParcel, or0 or0Var, Executor executor, i80 i80Var, kc0 kc0Var, yk ykVar, qh0 qh0Var) {
        this.f6631b = context;
        this.f6633d = or0Var;
        this.f6639j = i80Var;
        this.f6634e = executor;
        this.f6635f = versionInfoParcel;
        this.f6632c = kc0Var;
        this.f6636g = ykVar;
        this.f6638i = qh0Var;
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final n5.a a(kr0 kr0Var, fr0 fr0Var) {
        int i10 = this.f6630a;
        Executor executor = this.f6634e;
        switch (i10) {
            case 0:
                final p80 p80Var = new p80(24);
                r11 r11VarQ0 = tc1.q0(tc1.d0(null), new hn(this, fr0Var, kr0Var, p80Var, 3), executor);
                final int i11 = 0;
                r11VarQ0.a(new Runnable() { // from class: com.google.android.gms.internal.ads.ji0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i11;
                        p80 p80Var2 = p80Var;
                        switch (i12) {
                            case 0:
                                p80Var2.zzb();
                                break;
                            case 1:
                                p80Var2.zzb();
                                break;
                            default:
                                p80Var2.zzb();
                                break;
                        }
                    }
                }, executor);
                return r11VarQ0;
            case 1:
                final p80 p80Var2 = new p80(24);
                r11 r11VarQ02 = tc1.q0(tc1.d0(null), new hn(this, fr0Var, kr0Var, p80Var2, 5), executor);
                final int i12 = 1;
                r11VarQ02.a(new Runnable() { // from class: com.google.android.gms.internal.ads.ji0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i12;
                        p80 p80Var22 = p80Var2;
                        switch (i122) {
                            case 0:
                                p80Var22.zzb();
                                break;
                            case 1:
                                p80Var22.zzb();
                                break;
                            default:
                                p80Var22.zzb();
                                break;
                        }
                    }
                }, executor);
                return r11VarQ02;
            default:
                final p80 p80Var3 = new p80(24);
                r11 r11VarQ03 = tc1.q0(tc1.d0(null), new hn(this, fr0Var, kr0Var, p80Var3, 7), executor);
                final int i13 = 2;
                r11VarQ03.a(new Runnable() { // from class: com.google.android.gms.internal.ads.ji0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i13;
                        p80 p80Var22 = p80Var3;
                        switch (i122) {
                            case 0:
                                p80Var22.zzb();
                                break;
                            case 1:
                                p80Var22.zzb();
                                break;
                            default:
                                p80Var22.zzb();
                                break;
                        }
                    }
                }, executor);
                return r11VarQ03;
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final boolean b(kr0 kr0Var, fr0 fr0Var) {
        ir0 ir0Var = fr0Var.f4636s;
        switch (this.f6630a) {
            case 0:
                if (ir0Var == null || ir0Var.f5679a == null) {
                }
                break;
            case 1:
                if (ir0Var == null || ir0Var.f5679a == null) {
                }
                break;
            default:
                if (ir0Var == null || ir0Var.f5679a == null) {
                }
                break;
        }
        return false;
    }

    public final s11 c(fr0 fr0Var, kr0 kr0Var, p80 p80Var) {
        boolean z9;
        yk ykVar;
        int i10 = this.f6630a;
        Executor executor = this.f6634e;
        yk ykVar2 = this.f6636g;
        boolean z10 = this.f6637h;
        Object obj = this.f6639j;
        kc0 kc0Var = this.f6632c;
        or0 or0Var = this.f6633d;
        switch (i10) {
            case 0:
                nx nxVarA = kc0Var.a(or0Var.f7645e, fr0Var, (hr0) kr0Var.f6383b.f10631d);
                nxVarA.D(fr0Var.W);
                p80Var.getClass();
                qu quVar = new qu();
                cz czVar = (cz) ((d10) obj);
                az azVar = new az(czVar.f3473c, czVar.f3475d, new ep(kr0Var, fr0Var, (String) null), new p80(new mi0(this.f6635f, quVar, fr0Var, nxVarA, this.f6633d, this.f6637h, this.f6636g, this.f6638i), 18, nxVarA), new b4.j(fr0Var.f4601a0, 2));
                nh1 nh1Var = azVar.K;
                ((jc0) nh1Var.zzb()).a(nxVarA, false, z10 ? ykVar2 : null);
                quVar.b(azVar);
                azVar.h0().H0(new ki0(nxVarA, 0), nu.f7388f);
                ir0 ir0Var = fr0Var.f4636s;
                String strB = ir0Var.f5679a;
                if (((Boolean) zzba.zzc().a(eg.C4)).booleanValue() && ((yh0) azVar.f2839v.zzb()).c()) {
                    strB = wx.b(strB, wx.a(fr0Var));
                }
                return tc1.o0(jc0.b(nxVarA, ir0Var.f5680b, strB), new q30(nxVarA, fr0Var, azVar, 1), executor);
            case 1:
                nx nxVarA2 = kc0Var.a(or0Var.f7645e, fr0Var, (hr0) kr0Var.f6383b.f10631d);
                nxVarA2.D(fr0Var.W);
                p80Var.getClass();
                qu quVar2 = new qu();
                i80 i80Var = (i80) obj;
                kz kzVarA = i80Var.a(new ep(kr0Var, fr0Var, (String) null), new p80(new bj0(this.f6631b, this.f6635f, quVar2, fr0Var, nxVarA2, this.f6633d, this.f6637h, this.f6636g, this.f6638i), 18, nxVarA2));
                quVar2.b(kzVarA);
                kzVarA.h0().H0(new ki0(nxVarA2, 2), nu.f7388f);
                ir0 ir0Var2 = fr0Var.f4636s;
                String strB2 = ir0Var2.f5679a;
                if (((Boolean) zzba.zzc().a(eg.C4)).booleanValue() && ((yh0) kzVarA.f6433u.zzb()).c()) {
                    strB2 = wx.b(strB2, wx.a(fr0Var));
                }
                nh1 nh1Var2 = kzVarA.M;
                ((jc0) nh1Var2.zzb()).a(nxVarA2, true, z10 ? ykVar2 : null);
                return tc1.o0(jc0.b(nxVarA2, ir0Var2.f5680b, strB2), new q30(nxVarA2, fr0Var, kzVarA, 2), executor);
            default:
                nx nxVarA3 = kc0Var.a(or0Var.f7645e, fr0Var, (hr0) kr0Var.f6383b.f10631d);
                nxVarA3.D(fr0Var.W);
                p80Var.getClass();
                qu quVar3 = new qu();
                oz ozVar = (oz) ((ec0) obj);
                nz nzVar = new nz(ozVar.f7708c, ozVar.f7710d, new ep(kr0Var, fr0Var, (String) null), new dc0(new ek0(this.f6631b, this.f6632c, this.f6633d, this.f6635f, fr0Var, quVar3, nxVarA3, this.f6636g, this.f6637h, this.f6638i), nxVarA3));
                quVar3.b(nzVar);
                nxVarA3.l0("/reward", new ok(4, (t70) nzVar.L.zzb()));
                nzVar.h0().H0(new ki0(nxVarA3, 3), nu.f7388f);
                nh1 nh1Var3 = nzVar.M;
                jc0 jc0Var = (jc0) nh1Var3.zzb();
                if (z10) {
                    ykVar = ykVar2;
                    z9 = true;
                } else {
                    z9 = true;
                    ykVar = null;
                }
                jc0Var.a(nxVarA3, z9, ykVar);
                ir0 ir0Var3 = fr0Var.f4636s;
                String strB3 = ir0Var3.f5679a;
                if (((Boolean) zzba.zzc().a(eg.C4)).booleanValue() && ((yh0) nzVar.f7432u.zzb()).c()) {
                    strB3 = wx.b(strB3, wx.a(fr0Var));
                }
                return tc1.o0(jc0.b(nxVarA3, ir0Var3.f5680b, strB3), new q30(nxVarA3, fr0Var, nzVar, 3), executor);
        }
    }

    public li0(Context context, VersionInfoParcel versionInfoParcel, or0 or0Var, Executor executor, ec0 ec0Var, kc0 kc0Var, yk ykVar, qh0 qh0Var) {
        this.f6631b = context;
        this.f6633d = or0Var;
        this.f6639j = ec0Var;
        this.f6634e = executor;
        this.f6635f = versionInfoParcel;
        this.f6632c = kc0Var;
        this.f6636g = ykVar;
        this.f6638i = qh0Var;
    }

    public li0(d10 d10Var, Context context, Executor executor, kc0 kc0Var, or0 or0Var, VersionInfoParcel versionInfoParcel, yk ykVar, qh0 qh0Var) {
        this.f6631b = context;
        this.f6639j = d10Var;
        this.f6634e = executor;
        this.f6632c = kc0Var;
        this.f6633d = or0Var;
        this.f6635f = versionInfoParcel;
        this.f6636g = ykVar;
        this.f6638i = qh0Var;
    }
}
