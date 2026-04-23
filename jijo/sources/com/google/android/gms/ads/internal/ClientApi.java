package com.google.android.gms.ads.internal;

import a4.a;
import a4.b;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.signalgeneration.zzak;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.br0;
import com.google.android.gms.internal.ads.cr0;
import com.google.android.gms.internal.ads.cs;
import com.google.android.gms.internal.ads.dz;
import com.google.android.gms.internal.ads.ed0;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.el0;
import com.google.android.gms.internal.ads.gl0;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.gz;
import com.google.android.gms.internal.ads.hp0;
import com.google.android.gms.internal.ads.hq;
import com.google.android.gms.internal.ads.ih1;
import com.google.android.gms.internal.ads.jh1;
import com.google.android.gms.internal.ads.jl;
import com.google.android.gms.internal.ads.jz;
import com.google.android.gms.internal.ads.kh1;
import com.google.android.gms.internal.ads.kl0;
import com.google.android.gms.internal.ads.md0;
import com.google.android.gms.internal.ads.ml;
import com.google.android.gms.internal.ads.nh1;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.oq0;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.qh0;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.ry;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.te0;
import com.google.android.gms.internal.ads.ti;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.ads.tz;
import com.google.android.gms.internal.ads.u80;
import com.google.android.gms.internal.ads.u90;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.wp0;
import com.google.android.gms.internal.ads.yp0;
import com.google.android.gms.internal.ads.zc0;
import com.google.android.gms.internal.ads.zi;
import com.google.android.gms.internal.ads.zy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends zzcd {
    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(a aVar, String str, rn rnVar, int i10) {
        Context context = (Context) b.a0(aVar);
        return new el0(gy.b(context, rnVar, i10), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(a aVar, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, rn rnVar, int i10) {
        Context context = (Context) b.a0(aVar);
        zy zyVarB = gy.b(context, rnVar, i10);
        str.getClass();
        context.getClass();
        kh1 kh1VarA = kh1.a(context);
        kh1 kh1VarA2 = kh1.a(str);
        zy zyVar = zyVarB.f11340c;
        nh1 nh1Var = zyVar.f11361m0;
        oq0 oq0Var = new oq0(kh1VarA, nh1Var, zyVar.f11363n0);
        nh1 nh1VarB = ih1.b(new hp0(nh1Var, 3));
        nh1 nh1Var2 = zyVar.f11342d;
        kh1 kh1Var = zyVar.A;
        ry ryVar = zyVar.f11356k;
        return i10 >= ((Integer) zzba.zzc().a(eg.K4)).intValue() ? (wp0) ih1.b(new zc0((jh1) kh1Var, (nh1) kh1VarA, (nh1) kh1VarA2, ih1.b(new u80((nh1) kh1VarA, nh1Var2, kh1Var, (nh1) oq0Var, nh1VarB, (nh1) ryVar, 9)), nh1VarB, (nh1) ryVar, zyVar.f11377y, 5)).zzb() : new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(a aVar, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, rn rnVar, int i10) {
        Context context = (Context) b.a0(aVar);
        zy zyVarB = gy.b(context, rnVar, i10);
        context.getClass();
        zzqVar.getClass();
        str.getClass();
        kh1 kh1VarA = kh1.a(context);
        kh1 kh1VarA2 = kh1.a(zzqVar);
        zy zyVar = zyVarB.f11340c;
        nh1 nh1VarB = ih1.b(new md0(zyVar.f11377y, 21, (Object) null));
        yp0 yp0Var = (yp0) ih1.b(new zc0((nh1) kh1VarA, zyVar.f11342d, (nh1) kh1VarA2, (nh1) zyVar.A, nh1VarB, ih1.b(tc1.K), ih1.b(tc1.C), 6)).zzb();
        kl0 kl0Var = (kl0) nh1VarB.zzb();
        VersionInfoParcel versionInfoParcel = zyVar.f11338b.f5432a;
        tp1.b0(versionInfoParcel);
        return new gl0(context, zzqVar, str, yp0Var, kl0Var, versionInfoParcel, (ed0) zyVar.f11377y.zzb());
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(a aVar, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, rn rnVar, int i10) {
        Context context = (Context) b.a0(aVar);
        gz gzVar = new gz(gy.b(context, rnVar, i10).f11340c);
        context.getClass();
        gzVar.f5113b = context;
        zzqVar.getClass();
        gzVar.f5115d = zzqVar;
        str.getClass();
        gzVar.f5114c = str;
        return (nl0) ((nh1) gzVar.a().f100h).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(a aVar, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i10) {
        return new zzt((Context) b.a0(aVar), zzqVar, str, new VersionInfoParcel(242402000, i10, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(a aVar, int i10) {
        return (tz) gy.b((Context) b.a0(aVar), null, i10).f11378z.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(a aVar, rn rnVar, int i10) {
        return (te0) gy.b((Context) b.a0(aVar), rnVar, i10).f11373u.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ti zzi(a aVar, a aVar2) {
        return new v90((FrameLayout) b.a0(aVar), (FrameLayout) b.a0(aVar2));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zi zzj(a aVar, a aVar2, a aVar3) {
        return new u90((View) b.a0(aVar), (HashMap) b.a0(aVar2), (HashMap) b.a0(aVar3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ml zzk(a aVar, rn rnVar, int i10, jl jlVar) {
        Context context = (Context) b.a0(aVar);
        zy zyVarB = gy.b(context, rnVar, i10);
        context.getClass();
        jlVar.getClass();
        return (qd0) new jz(zyVarB.f11340c, context, jlVar).f6117e.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final aq zzl(a aVar, rn rnVar, int i10) {
        return (qh0) gy.b((Context) b.a0(aVar), rnVar, i10).G.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final hq zzm(a aVar) {
        Activity activity = (Activity) b.a0(aVar);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzu(activity);
        }
        int i10 = adOverlayInfoParcelZza.zzk;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? new com.google.android.gms.ads.internal.overlay.zzu(activity) : new zzad(activity) : new zzz(activity, adOverlayInfoParcelZza) : new zzag(activity) : new zzaf(activity) : new com.google.android.gms.ads.internal.overlay.zzt(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final cs zzn(a aVar, rn rnVar, int i10) {
        Context context = (Context) b.a0(aVar);
        dz dzVar = new dz(gy.b(context, rnVar, i10).f11340c);
        context.getClass();
        dzVar.f3765b = context;
        return (cr0) ((nh1) dzVar.a().f6078g).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ns zzo(a aVar, String str, rn rnVar, int i10) {
        Context context = (Context) b.a0(aVar);
        dz dzVar = new dz(gy.b(context, rnVar, i10).f11340c);
        context.getClass();
        dzVar.f3765b = context;
        dzVar.f3766c = str;
        return (br0) ((nh1) dzVar.a().f6080i).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ut zzp(a aVar, rn rnVar, int i10) {
        return (zzak) gy.b((Context) b.a0(aVar), rnVar, i10).J.zzb();
    }
}
