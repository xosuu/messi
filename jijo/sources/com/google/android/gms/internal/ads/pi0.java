package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pi0 implements hi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7888c;

    public /* synthetic */ pi0(int i10, Context context, Object obj) {
        this.f7886a = i10;
        this.f7887b = context;
        this.f7888c = obj;
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final Object a(kr0 kr0Var, fr0 fr0Var, fi0 fi0Var) {
        int i10 = this.f7886a;
        int i11 = 18;
        Object obj = null;
        Object obj2 = this.f7888c;
        switch (i10) {
            case 0:
                xq xqVar = new xq(fr0Var, (bp) fi0Var.f4535b, AdFormat.APP_OPEN_AD);
                cz czVar = (cz) ((d10) obj2);
                az azVar = new az(czVar.f3473c, czVar.f3475d, new ep(kr0Var, fr0Var, fi0Var.f4534a), new p80(xqVar, i11, obj), new b4.j(fr0Var.f4601a0, 2));
                xqVar.f10633h = azVar.h0();
                ((zi0) fi0Var.f4536c).v1(azVar.s0());
                return azVar.q0();
            case 1:
                xq xqVar2 = new xq(fr0Var, (bp) fi0Var.f4535b, AdFormat.INTERSTITIAL);
                kz kzVarA = ((i80) obj2).a(new ep(kr0Var, fr0Var, fi0Var.f4534a), new p80(xqVar2, i11, obj));
                xqVar2.f10633h = kzVarA.h0();
                ((zi0) fi0Var.f4536c).v1(kzVarA.s0());
                return kzVarA.q0();
            default:
                xq xqVar3 = new xq(fr0Var, (bp) fi0Var.f4535b, AdFormat.REWARDED);
                ep epVar = new ep(kr0Var, fr0Var, fi0Var.f4534a);
                dc0 dc0Var = new dc0(xqVar3);
                oz ozVar = (oz) ((ec0) obj2);
                zy zyVar = ozVar.f7708c;
                oz ozVar2 = ozVar.f7710d;
                nz nzVar = new nz(zyVar, ozVar2, epVar, dc0Var);
                xqVar3.f10633h = nzVar.h0();
                ((zi0) fi0Var.f4536c).v1(new jk0((j40) nzVar.A.zzb(), (p70) nzVar.C.zzb(), (v40) nzVar.f7434w.zzb(), (b50) nzVar.f7437z.zzb(), (d50) nzVar.D.zzb(), (s40) nzVar.J.zzb(), (j60) ozVar2.f7717g0.zzb(), (x70) nzVar.G.zzb(), (l50) nzVar.F.zzb(), (t70) nzVar.L.zzb(), (g60) nzVar.H.zzb()));
                return nzVar.q0();
        }
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void b(kr0 kr0Var, fr0 fr0Var, fi0 fi0Var) throws zzffn {
        int i10 = this.f7886a;
        Context context = this.f7887b;
        switch (i10) {
            case 0:
                try {
                    ((bp) fi0Var.f4535b).d1(fr0Var.Z);
                    ((bp) fi0Var.f4535b).g0(fr0Var.U, fr0Var.f4642v.toString(), ((or0) kr0Var.f6382a.f6060b).f7644d, new a4.b(context), new oi0(fi0Var), (wn) fi0Var.f4536c);
                    return;
                } catch (RemoteException e10) {
                    zze.zzb("Remote exception loading an app open RTB ad", e10);
                    throw new zzffn(e10);
                }
            case 1:
                try {
                    ((bp) fi0Var.f4535b).d1(fr0Var.Z);
                    ((bp) fi0Var.f4535b).F(fr0Var.U, fr0Var.f4642v.toString(), ((or0) kr0Var.f6382a.f6060b).f7644d, new a4.b(context), new dj0(fi0Var), (wn) fi0Var.f4536c);
                    return;
                } catch (RemoteException e11) {
                    zze.zzb("Remote exception loading a interstitial RTB ad", e11);
                    throw new zzffn(e11);
                }
            default:
                try {
                    ((bp) fi0Var.f4535b).d1(fr0Var.Z);
                    jp0 jp0Var = kr0Var.f6382a;
                    int i11 = ((or0) jp0Var.f6060b).f7655o.f1331b;
                    Object obj = jp0Var.f6060b;
                    c50 c50Var = fi0Var.f4536c;
                    Object obj2 = fi0Var.f4535b;
                    JSONObject jSONObject = fr0Var.f4642v;
                    if (i11 == 3) {
                        ((bp) obj2).T(fr0Var.U, jSONObject.toString(), ((or0) obj).f7644d, new a4.b(context), new zj0(fi0Var), (wn) c50Var);
                    } else {
                        ((bp) obj2).B0(fr0Var.U, jSONObject.toString(), ((or0) obj).f7644d, new a4.b(context), new zj0(fi0Var), (wn) c50Var);
                    }
                    return;
                } catch (RemoteException e12) {
                    zze.zzb("Remote exception loading a rewarded RTB ad", e12);
                    return;
                }
        }
    }
}
