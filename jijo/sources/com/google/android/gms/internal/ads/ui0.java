package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ui0 implements hi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9493a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9497e;

    public ui0(Context context, VersionInfoParcel versionInfoParcel, i80 i80Var, mu muVar) {
        this.f9494b = context;
        this.f9496d = versionInfoParcel;
        this.f9495c = i80Var;
        this.f9497e = muVar;
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final Object a(kr0 kr0Var, fr0 fr0Var, fi0 fi0Var) throws zzeir, zzffn {
        View view;
        int i10 = this.f9493a;
        int i11 = 0;
        Object obj = null;
        Object obj2 = this.f9495c;
        switch (i10) {
            case 0:
                if (((Boolean) zzba.zzc().a(eg.Z6)).booleanValue() && fr0Var.f4613g0) {
                    try {
                        view = (View) a4.b.a0(((yn) this.f9497e).zze());
                        boolean zZzf = ((yn) this.f9497e).zzf();
                        if (view == null) {
                            throw new zzffn(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                        }
                        if (zZzf) {
                            try {
                                view = (View) tc1.q0(tc1.d0(null), new v20(this, view, fr0Var, 4), nu.f7387e).get();
                            } catch (InterruptedException | ExecutionException e10) {
                                throw new zzffn(e10);
                            }
                        }
                    } catch (RemoteException e11) {
                        throw new zzffn(e11);
                    }
                    break;
                } else {
                    view = (View) this.f9496d;
                }
                fz fzVar = (fz) ((z10) obj2);
                ez ezVar = new ez(fzVar.f4692d, fzVar.f4694e, new ep(kr0Var, fr0Var, fi0Var.f4534a), new xq(view, (nx) null, new si0(fi0Var), (gr0) fr0Var.f4640u.get(0)));
                ((o70) ezVar.J.zzb()).J0(view);
                ((zi0) fi0Var.f4536c).v1(ezVar.s0());
                return ezVar.q0();
            case 1:
                kz kzVarA = ((i80) obj2).a(new ep(kr0Var, fr0Var, fi0Var.f4534a), new p80(new cj0(this, 0, fi0Var), 18, (Object) null));
                kzVarA.r0().H0(new k00(0, (vr0) fi0Var.f4535b), (Executor) this.f9497e);
                ((zi0) fi0Var.f4536c).v1(kzVarA.t0());
                return kzVarA.q0();
            default:
                if (!((or0) kr0Var.f6382a.f6060b).f7647g.contains(Integer.toString(6))) {
                    throw new zzeir(2, "Unified must be used for RTB.");
                }
                n90 n90VarP = n90.P((eo) this.f9496d);
                or0 or0Var = (or0) kr0Var.f6382a.f6060b;
                if (!or0Var.f7647g.contains(Integer.toString(n90VarP.B()))) {
                    throw new zzeir(1, "No corresponding native ad listener");
                }
                ep epVar = new ep(kr0Var, fr0Var, fi0Var.f4534a);
                rk0 rk0Var = new rk0(14, n90VarP);
                la0 la0Var = new la0(null, null, (eo) this.f9496d);
                uy uyVar = (uy) ((t80) obj2);
                zy zyVar = uyVar.f9644b;
                x20 x20Var = new x20(epVar);
                uy uyVar2 = uyVar.f9647c;
                nh1 nh1Var = uyVar2.f9687w;
                qs0 qs0Var = zyVar.f11355j0;
                nh1 nh1VarB = ih1.b(new ft(nh1Var, x20Var, 23, i11));
                nh1 nh1VarL = g1.a.l(nh1VarB, 23, 0);
                int i12 = oh1.f7580c;
                ArrayList arrayList = new ArrayList(1);
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(uyVar2.f9678r0);
                arrayList2.add(uyVar2.f9680s0);
                arrayList.add(nh1VarL);
                nh1 nh1VarO = g1.a.o(new oh1(arrayList, arrayList2), 3);
                nh1 nh1VarB2 = ih1.b(tp1.f9241i);
                nh1 nh1VarB3 = ih1.b(new ft(nh1VarB2, zyVar.f11342d, 16));
                a30 a30Var = new a30(epVar);
                z20 z20Var = new z20(epVar);
                jy jyVar = zyVar.f11350h;
                nh1 nh1VarB4 = ih1.b(new t00(jyVar, zyVar.f11342d, zyVar.f11344e, a30Var, x20Var, uyVar2.f9670n0, ih1.b(new u80(zyVar.E, zyVar.F, x20Var, z20Var, ih1.b(new u80(jyVar, zyVar.Q, ih1.b(new md0(jyVar, 19, obj)), ih1.b(tc1.F), tp1.f9253u, zyVar.R, zyVar.f11344e, 1)), uyVar2.f9651e, 11)), new v60(12, 0), new v60(10, 0), zyVar.C, uyVar2.f9672o0, uyVar2.f9651e, uyVar2.f9688w0));
                c30 c30Var = new c30(nh1VarB4, 12);
                c30 c30Var2 = new c30(ih1.b(new ft(x20Var, zyVar.O, 2)), 29);
                ArrayList arrayList3 = new ArrayList(4);
                ArrayList arrayList4 = new ArrayList(2);
                arrayList3.add(uyVar2.f9682t0);
                arrayList4.add(uyVar2.f9684u0);
                arrayList4.add(uyVar2.f9686v0);
                arrayList3.add(nh1VarB3);
                arrayList3.add(c30Var);
                arrayList3.add(c30Var2);
                nh1 nh1VarO2 = g1.a.o(new oh1(arrayList3, arrayList4), 4);
                nh1 nh1VarB5 = ih1.b(new zc0((jh1) zyVar.f11350h, zyVar.f11339b0, zyVar.f11377y, (nh1) a30Var, (nh1) x20Var, zyVar.E, (nh1) tp1.f9243k, 0));
                nh1 nh1VarK = g1.a.k(nh1VarB5, 21);
                nh1 nh1VarB6 = ih1.b(new ft(nh1VarB2, zyVar.f11342d, 15));
                nh1 nh1VarK2 = g1.a.k(ih1.b(new ft(zyVar.X, uyVar2.f9649d, 13)), 19);
                c30 c30Var3 = new c30(nh1VarB4, 11);
                ArrayList arrayList5 = new ArrayList(5);
                ArrayList arrayList6 = new ArrayList(3);
                arrayList5.add(uyVar2.f9690x0);
                arrayList5.add(uyVar2.f9692y0);
                arrayList6.add(uyVar2.f9694z0);
                arrayList6.add(uyVar2.A0);
                arrayList5.add(nh1VarK);
                arrayList5.add(nh1VarB6);
                arrayList6.add(nh1VarK2);
                arrayList5.add(c30Var3);
                nh1 nh1VarO3 = g1.a.o(new oh1(arrayList5, arrayList6), 1);
                nh1 nh1VarK3 = g1.a.k(nh1VarB5, 22);
                nh1 nh1VarN = g1.a.n(nh1VarB2, zyVar.f11342d, 18);
                nh1 nh1VarB7 = ih1.b(new ft(nh1VarB2, zyVar.f11342d, 21));
                nh1 nh1VarB8 = ih1.b(tc1.E);
                e80 e80Var = new e80(nh1VarB8, 9, (Object) null);
                ArrayList arrayList7 = new ArrayList(2);
                ArrayList arrayList8 = new ArrayList(1);
                arrayList8.add(uyVar2.F0);
                arrayList7.add(nh1VarB7);
                arrayList7.add(e80Var);
                c30 c30Var4 = new c30(ih1.b(new ft(new oh1(arrayList7, arrayList8), x20Var, 24)), 0);
                c30 c30Var5 = new c30(nh1VarB4, 14);
                ArrayList arrayList9 = new ArrayList(6);
                ArrayList arrayList10 = new ArrayList(2);
                arrayList9.add(uyVar2.B0);
                arrayList9.add(uyVar2.C0);
                arrayList10.add(uyVar2.D0);
                arrayList10.add(uyVar2.E0);
                arrayList9.add(nh1VarK3);
                arrayList9.add(nh1VarN);
                arrayList9.add(c30Var4);
                arrayList9.add(c30Var5);
                nh1 nh1VarO4 = g1.a.o(new oh1(arrayList9, arrayList10), 2);
                c30 c30Var6 = new c30(nh1VarB4, 16);
                ArrayList arrayList11 = new ArrayList(1);
                ArrayList arrayList12 = new ArrayList(1);
                arrayList12.add(uyVar2.G0);
                arrayList11.add(c30Var6);
                nh1 nh1VarO5 = g1.a.o(new oh1(arrayList11, arrayList12), 15);
                c30 c30Var7 = new c30(ih1.b(new ft(x20Var, zyVar.F, 25)), 10);
                ArrayList arrayList13 = new ArrayList(1);
                new ArrayList(1).add(uyVar2.H0);
                arrayList13.add(c30Var7);
                nh1 nh1VarN2 = g1.a.n(nh1VarB2, zyVar.f11342d, 22);
                ArrayList arrayList14 = new ArrayList(1);
                ArrayList arrayList15 = new ArrayList(1);
                arrayList15.add(uyVar2.I0);
                arrayList14.add(nh1VarN2);
                nh1 nh1VarO6 = g1.a.o(new oh1(arrayList14, arrayList15), 16);
                nh1 nh1VarL2 = g1.a.l(nh1VarB, 24, 0);
                c30 c30Var8 = new c30(nh1VarB4, 15);
                ArrayList arrayList16 = new ArrayList(6);
                ArrayList arrayList17 = new ArrayList(4);
                arrayList16.add(uyVar2.J0);
                arrayList17.add(uyVar2.K0);
                arrayList16.add(uyVar2.L0);
                arrayList16.add(uyVar2.M0);
                arrayList17.add(uyVar2.N0);
                arrayList17.add(uyVar2.O0);
                arrayList17.add(uyVar2.P0);
                arrayList16.add(uyVar2.Q0);
                arrayList16.add(nh1VarL2);
                arrayList16.add(c30Var8);
                nh1 nh1VarO7 = g1.a.o(new oh1(arrayList16, arrayList17), 5);
                c30 c30Var9 = new c30(ih1.b(new ny(nh1VarO2, 29, (Object) null)), 18, 0);
                nh1 nh1VarN3 = g1.a.n(nh1VarB2, zyVar.f11342d, 20);
                ArrayList arrayList18 = new ArrayList(2);
                ArrayList arrayList19 = new ArrayList(1);
                arrayList19.add(uyVar2.U0);
                arrayList18.add(c30Var9);
                arrayList18.add(nh1VarN3);
                nh1 nh1VarO8 = g1.a.o(new oh1(arrayList18, arrayList19), 8);
                t90 t90Var = new t90(rk0Var);
                pa0 pa0Var = new pa0(new zb0(t90Var), zyVar.f11342d);
                ArrayList arrayList20 = new ArrayList(1);
                ArrayList arrayList21 = new ArrayList(1);
                arrayList21.add(uyVar2.V0);
                arrayList20.add(pa0Var);
                nh1 nh1VarB9 = ih1.b(new y70(new oh1(arrayList20, arrayList21)));
                nh1 nh1VarK4 = g1.a.k(nh1VarB5, 20);
                ArrayList arrayList22 = new ArrayList(1);
                List listEmptyList = Collections.emptyList();
                arrayList22.add(nh1VarK4);
                nh1 nh1VarO9 = g1.a.o(new oh1(arrayList22, listEmptyList), 10);
                nh1 nh1VarN4 = g1.a.n(nh1VarB2, zyVar.f11342d, 17);
                c30 c30Var10 = new c30(nh1VarB4, 13);
                ArrayList arrayList23 = new ArrayList(2);
                ArrayList arrayList24 = new ArrayList(1);
                arrayList24.add(uyVar2.W0);
                arrayList23.add(nh1VarN4);
                arrayList23.add(c30Var10);
                t40 t40Var = new t40(new oh1(arrayList23, arrayList24));
                nh1 nh1VarK5 = g1.a.k(nh1VarB5, 17);
                ArrayList arrayList25 = new ArrayList(1);
                List listEmptyList2 = Collections.emptyList();
                arrayList25.add(nh1VarK5);
                nh1 nh1VarB10 = ih1.b(new wg((jh1) t40Var, (nh1) new oh1(arrayList25, listEmptyList2), zyVar.f11344e, 10));
                y20 y20Var = new y20(epVar);
                i40 i40Var = new i40(x20Var, y20Var, uyVar2.f9693z, z20Var, uyVar2.f9653f);
                ArrayList arrayList26 = new ArrayList(1);
                ArrayList arrayList27 = new ArrayList(1);
                arrayList27.add(uyVar2.Y0);
                arrayList26.add(uyVar2.Z0);
                l30 l30Var = new l30(a30Var, x20Var, nh1VarO, nh1VarO7, uyVar2.X0, i40Var, nh1VarB2, new g50(new oh1(arrayList26, arrayList27)), nh1VarO5);
                e80 e80Var2 = new e80(ih1.b(new ka0(new ma0(la0Var), new na0(la0Var), new oa0(la0Var), nh1VarO4, nh1VarO3, nh1VarO6, uyVar2.f9687w, x20Var, zyVar.f11356k, uyVar2.f9649d, 0)), 10, 0);
                nh1 nh1VarB11 = ih1.b(new e80(x20Var, 8));
                v60 v60Var = new v60(13, 0);
                v60 v60Var2 = new v60(14, 0);
                nh1 nh1VarB12 = ih1.b(new e80(new d90(t90Var), 7));
                x90 x90Var = new x90(zyVar.Q, uyVar2.f9649d, nh1VarB11, t90Var, v60Var, v60Var2, zyVar.f11342d, nh1VarB12);
                hh1 hh1Var = new hh1();
                nh1 nh1VarB13 = ih1.b(new wg((nh1) y20Var, (nh1) hh1Var, (nh1) t90Var, 14));
                nh1 nh1VarB14 = ih1.b(new wg((nh1) y20Var, (nh1) hh1Var, (nh1) t90Var, 13));
                nh1 nh1VarB15 = ih1.b(new f10(y20Var, hh1Var, t90Var, zyVar.f11377y, 12));
                nh1 nh1VarB16 = ih1.b(new fa0(hh1Var, t90Var, 2));
                jy jyVar2 = zyVar.f11350h;
                hh1.a(hh1Var, ih1.b(new j90(l30Var, zyVar.f11342d, t90Var, e80Var2, x90Var, nh1VarB11, uyVar2.Q, nh1VarB13, nh1VarB14, nh1VarB15, nh1VarB16, ih1.b(new f10((nh1) jyVar2, (nh1) t90Var, (nh1) x90Var, (nh1) hh1Var, 11)), new s90(jyVar2, uyVar2.f9649d), zyVar.C, zyVar.f11356k, jyVar2, nh1VarB12, nh1VarB8, zyVar.f11367p0)));
                ((zi0) fi0Var.f4536c).v1(new kk0((j40) nh1VarO3.zzb(), (p70) nh1VarO6.zzb(), (v40) nh1VarO4.zzb(), (b50) nh1VarO2.zzb(), (d50) nh1VarO7.zzb(), (j60) uyVar2.T0.zzb(), (l50) nh1VarO8.zzb(), (x70) nh1VarB9.zzb(), (g60) nh1VarO9.zzb(), (s40) nh1VarB10.zzb()));
                return (i90) hh1Var.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void b(kr0 kr0Var, fr0 fr0Var, fi0 fi0Var) throws zzffn {
        int i10 = this.f9493a;
        Context context = this.f9494b;
        switch (i10) {
            case 0:
                try {
                    ((bp) fi0Var.f4535b).d1(fr0Var.Z);
                    boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.Z6)).booleanValue();
                    c50 c50Var = fi0Var.f4536c;
                    Object obj = fi0Var.f4535b;
                    JSONObject jSONObject = fr0Var.f4642v;
                    if (zBooleanValue && fr0Var.f4613g0) {
                        ((bp) obj).M0(fr0Var.U, jSONObject.toString(), ((or0) kr0Var.f6382a.f6060b).f7644d, new a4.b(context), new ti0(this, fi0Var), (wn) c50Var, ((or0) kr0Var.f6382a.f6060b).f7645e);
                        return;
                    } else {
                        ((bp) obj).J0(fr0Var.U, jSONObject.toString(), ((or0) kr0Var.f6382a.f6060b).f7644d, new a4.b(context), new ti0(this, fi0Var), (wn) c50Var, ((or0) kr0Var.f6382a.f6060b).f7645e);
                        return;
                    }
                } catch (RemoteException th) {
                    throw new zzffn(th);
                }
            case 1:
                vr0 vr0Var = (vr0) fi0Var.f4535b;
                or0 or0Var = (or0) kr0Var.f6382a.f6060b;
                String string = fr0Var.f4642v.toString();
                String strZzm = zzbs.zzm(fr0Var.f4636s);
                zzl zzlVar = or0Var.f7644d;
                wn wnVar = (wn) fi0Var.f4536c;
                vr0Var.getClass();
                try {
                    vr0Var.f9963a.p0(new a4.b(context), zzlVar, string, strZzm, wnVar);
                    return;
                } finally {
                    zzffn zzffnVar = new zzffn(th);
                }
            default:
                try {
                    ((bp) fi0Var.f4535b).d1(fr0Var.Z);
                    int i11 = ((VersionInfoParcel) this.f9497e).clientJarVersion;
                    int iIntValue = ((Integer) zzba.zzc().a(eg.f4172x1)).intValue();
                    c50 c50Var2 = fi0Var.f4536c;
                    Object obj2 = fi0Var.f4535b;
                    JSONObject jSONObject2 = fr0Var.f4642v;
                    if (i11 < iIntValue) {
                        ((bp) obj2).h1(fr0Var.U, jSONObject2.toString(), ((or0) kr0Var.f6382a.f6060b).f7644d, new a4.b(context), new ij0(this, fi0Var), (wn) c50Var2);
                        return;
                    } else {
                        ((bp) obj2).o0(fr0Var.U, jSONObject2.toString(), ((or0) kr0Var.f6382a.f6060b).f7644d, new a4.b(context), new ij0(this, fi0Var), (wn) c50Var2, ((or0) kr0Var.f6382a.f6060b).f7649i);
                        return;
                    }
                } catch (RemoteException th2) {
                    throw new zzffn(th2);
                }
        }
    }

    public ui0(Context context, z10 z10Var) {
        this.f9494b = context;
        this.f9495c = z10Var;
    }

    public ui0(Context context, t80 t80Var, VersionInfoParcel versionInfoParcel) {
        this.f9494b = context;
        this.f9495c = t80Var;
        this.f9497e = versionInfoParcel;
    }
}
