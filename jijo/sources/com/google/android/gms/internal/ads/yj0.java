package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class yj0 implements hi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f10917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ec0 f10918d;

    public /* synthetic */ yj0(Context context, Executor executor, ec0 ec0Var, int i10) {
        this.f10915a = i10;
        this.f10916b = context;
        this.f10917c = executor;
        this.f10918d = ec0Var;
    }

    public static final void c(kr0 kr0Var, fr0 fr0Var, fi0 fi0Var) {
        zzffn zzffnVar;
        try {
            vr0 vr0Var = (vr0) fi0Var.f4535b;
            zzl zzlVar = ((or0) kr0Var.f6382a.f6060b).f7644d;
            String string = fr0Var.f4642v.toString();
            vr0Var.getClass();
            try {
                vr0Var.f9963a.C0(zzlVar, string);
            } finally {
            }
        } catch (Exception e10) {
            zzm.zzk("Fail to load ad from adapter ".concat(String.valueOf(fi0Var.f4534a)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final Object a(kr0 kr0Var, fr0 fr0Var, fi0 fi0Var) {
        switch (this.f10915a) {
            case 0:
                ep epVar = new ep(kr0Var, fr0Var, fi0Var.f4534a);
                dc0 dc0Var = new dc0(new si0(fi0Var));
                oz ozVar = (oz) this.f10918d;
                nz nzVar = new nz(ozVar.f7708c, ozVar.f7710d, epVar, dc0Var);
                nzVar.r0().H0(new k00(0, (vr0) fi0Var.f4535b), this.f10917c);
                ((zi0) fi0Var.f4536c).v1((bk0) nzVar.N.zzb());
                return nzVar.q0();
            default:
                ep epVar2 = new ep(kr0Var, fr0Var, fi0Var.f4534a);
                dc0 dc0Var2 = new dc0(new aa(19, fi0Var));
                oz ozVar2 = (oz) this.f10918d;
                nz nzVar2 = new nz(ozVar2.f7708c, ozVar2.f7710d, epVar2, dc0Var2);
                nzVar2.r0().H0(new k00(0, (vr0) fi0Var.f4535b), this.f10917c);
                b50 b50Var = (b50) nzVar2.f7437z.zzb();
                j40 j40VarD0 = nzVar2.d0();
                l50 l50Var = (l50) nzVar2.F.zzb();
                t70 t70Var = (t70) nzVar2.L.zzb();
                aj0 aj0Var = (aj0) fi0Var.f4536c;
                gk0 gk0Var = new gk0(l50Var, j40VarD0, b50Var, t70Var);
                synchronized (aj0Var) {
                    aj0Var.f2697a = gk0Var;
                }
                return nzVar2.q0();
        }
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void b(kr0 kr0Var, fr0 fr0Var, fi0 fi0Var) {
        zzffn zzffnVar;
        switch (this.f10915a) {
            case 0:
                try {
                    or0 or0Var = (or0) kr0Var.f6382a.f6060b;
                    int i10 = or0Var.f7655o.f1331b;
                    Context context = this.f10916b;
                    zzl zzlVar = or0Var.f7644d;
                    if (i10 == 3) {
                        vr0 vr0Var = (vr0) fi0Var.f4535b;
                        String string = fr0Var.f4642v.toString();
                        wn wnVar = (wn) fi0Var.f4536c;
                        vr0Var.getClass();
                        try {
                            vr0Var.f9963a.C(new a4.b(context), zzlVar, string, wnVar);
                            return;
                        } finally {
                        }
                    }
                    vr0 vr0Var2 = (vr0) fi0Var.f4535b;
                    String string2 = fr0Var.f4642v.toString();
                    wn wnVar2 = (wn) fi0Var.f4536c;
                    vr0Var2.getClass();
                    try {
                        vr0Var2.f9963a.V0(new a4.b(context), zzlVar, string2, wnVar2);
                        return;
                    } finally {
                    }
                } catch (Exception e10) {
                    zzm.zzk("Fail to load ad from adapter ".concat(String.valueOf(fi0Var.f4534a)), e10);
                    return;
                }
                zzm.zzk("Fail to load ad from adapter ".concat(String.valueOf(fi0Var.f4534a)), e10);
                return;
            default:
                if (((vr0) fi0Var.f4535b).a()) {
                    c(kr0Var, fr0Var, fi0Var);
                    return;
                }
                fk0 fk0Var = new fk0(this, kr0Var, fr0Var, fi0Var);
                aj0 aj0Var = (aj0) fi0Var.f4536c;
                synchronized (aj0Var) {
                    aj0Var.f2699d = fk0Var;
                }
                Object obj = fi0Var.f4535b;
                Context context2 = this.f10916b;
                vr0 vr0Var3 = (vr0) obj;
                or0 or0Var2 = (or0) kr0Var.f6382a.f6060b;
                hs hsVar = (hs) fi0Var.f4536c;
                String string3 = fr0Var.f4642v.toString();
                zzl zzlVar2 = or0Var2.f7644d;
                vr0Var3.getClass();
                try {
                    vr0Var3.f9963a.Q(new a4.b(context2), zzlVar2, hsVar, string3);
                    return;
                } finally {
                }
        }
    }
}
