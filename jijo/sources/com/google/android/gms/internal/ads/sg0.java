package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import java.io.ByteArrayInputStream;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class sg0 extends pb implements ir {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p21 f8863b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rk0 f8864d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xz f8865f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque f8866h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gt0 f8867q;

    public sg0(Context context, mu muVar, pe peVar, gy gyVar, rk0 rk0Var, ArrayDeque arrayDeque, gt0 gt0Var) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        eg.a(context);
        this.f8862a = context;
        this.f8863b = muVar;
        this.f8864d = rk0Var;
        this.f8865f = gyVar;
        this.f8866h = arrayDeque;
        this.f8867q = gt0Var;
    }

    public static ts0 A1(zzbvb zzbvbVar, xs0 xs0Var, vy vyVar) {
        jn jnVar = new jn(vyVar, 10, zzbvbVar);
        return xs0Var.b(tc1.d0(zzbvbVar.f11574a), ws0.f10332q).l(jnVar).j(new k70(17)).d();
    }

    public static void C1(n5.a aVar, pr prVar, zzbvb zzbvbVar) {
        tc1.u0(tc1.q0(aVar, new f00(12, 0), nu.f7383a), new m20(prVar, zzbvbVar, 26), nu.f7388f);
    }

    public static ts0 z1(ts0 ts0Var, xs0 xs0Var, fn fnVar, ft0 ft0Var, bt0 bt0Var) {
        hn hnVarA = fnVar.a("AFMA_getAdDictionary", en.f4244b, new k70(18));
        tc1.J(ts0Var, bt0Var);
        ts0 ts0VarD = xs0Var.b(ts0Var, ws0.f10333s).l(hnVarA).d();
        if (((Boolean) eh.f4203c.k()).booleanValue()) {
            tc1.u0(h21.r(ts0VarD), new cj0(ft0Var, 5, bt0Var), nu.f7388f);
        }
        return ts0VarD;
    }

    public final synchronized void B1() {
        int iIntValue = ((Long) sh.f8870c.k()).intValue();
        while (this.f8866h.size() >= iIntValue) {
            this.f8866h.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final void G(String str, pr prVar) {
        C1(x1(str), prVar, null);
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final void O(zzbvb zzbvbVar, pr prVar) {
        Bundle bundle;
        if (((Boolean) zzba.zzc().a(eg.S1)).booleanValue() && (bundle = zzbvbVar.f11586y) != null) {
            ((y3.b) zzu.zzB()).getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        ts0 ts0VarV1 = v1(zzbvbVar, Binder.getCallingUid());
        C1(ts0VarV1, prVar, zzbvbVar);
        if (((Boolean) lh.f6618e.k()).booleanValue()) {
            rk0 rk0Var = this.f8864d;
            Objects.requireNonNull(rk0Var);
            ts0VarV1.a(new og0(rk0Var, 0), this.f8863b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final void W0(zzbvb zzbvbVar, pr prVar) {
        C1(u1(zzbvbVar, Binder.getCallingUid()), prVar, zzbvbVar);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        pr orVar = null;
        if (i10 == 1) {
            qb.b(parcel);
            parcel2.writeNoException();
            qb.d(parcel2, null);
            return true;
        }
        if (i10 == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (iInterfaceQueryLocalInterface instanceof jr) {
                }
            }
            qb.b(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 4) {
            zzbvb zzbvbVar = (zzbvb) qb.a(parcel, zzbvb.CREATOR);
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                orVar = iInterfaceQueryLocalInterface2 instanceof pr ? (pr) iInterfaceQueryLocalInterface2 : new or(strongBinder2);
            }
            qb.b(parcel);
            O(zzbvbVar, orVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 5) {
            zzbvb zzbvbVar2 = (zzbvb) qb.a(parcel, zzbvb.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                orVar = iInterfaceQueryLocalInterface3 instanceof pr ? (pr) iInterfaceQueryLocalInterface3 : new or(strongBinder3);
            }
            qb.b(parcel);
            v0(zzbvbVar2, orVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 6) {
            zzbvb zzbvbVar3 = (zzbvb) qb.a(parcel, zzbvb.CREATOR);
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                orVar = iInterfaceQueryLocalInterface4 instanceof pr ? (pr) iInterfaceQueryLocalInterface4 : new or(strongBinder4);
            }
            qb.b(parcel);
            W0(zzbvbVar3, orVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 7) {
            return false;
        }
        String string = parcel.readString();
        IBinder strongBinder5 = parcel.readStrongBinder();
        if (strongBinder5 != null) {
            IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
            orVar = iInterfaceQueryLocalInterface5 instanceof pr ? (pr) iInterfaceQueryLocalInterface5 : new or(strongBinder5);
        }
        qb.b(parcel);
        G(string, orVar);
        parcel2.writeNoException();
        return true;
    }

    public final n5.a u1(final zzbvb zzbvbVar, int i10) {
        if (!((Boolean) sh.f8868a.k()).booleanValue()) {
            return tc1.Z(new Exception("Split request is disabled."));
        }
        zzfhb zzfhbVar = zzbvbVar.f11582u;
        if (zzfhbVar == null) {
            return tc1.Z(new Exception("Pool configuration missing from request."));
        }
        if (zzfhbVar.f11619f == 0 || zzfhbVar.f11620h == 0) {
            return tc1.Z(new Exception("Caching is disabled."));
        }
        bn bnVarZzf = zzu.zzf();
        VersionInfoParcel versionInfoParcelForPackage = VersionInfoParcel.forPackage();
        gt0 gt0Var = this.f8867q;
        Context context = this.f8862a;
        fn fnVarB = bnVarZzf.b(context, versionInfoParcelForPackage, gt0Var);
        vy vyVarC = ((gy) this.f8865f).c(zzbvbVar, i10);
        xs0 xs0Var = (xs0) vyVarC.f10005l.zzb();
        final ts0 ts0VarA1 = A1(zzbvbVar, xs0Var, vyVarC);
        ft0 ft0Var = (ft0) vyVarC.f9996c.zzb();
        final bt0 bt0VarD = tc1.d(context, 9);
        final ts0 ts0VarZ1 = z1(ts0VarA1, xs0Var, fnVarB, ft0Var, bt0VarD);
        return xs0Var.a(ws0.K, ts0VarA1, ts0VarZ1).b(new Callable() { // from class: com.google.android.gms.internal.ads.ng0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sg0 sg0Var = this.f7258a;
                n5.a aVar = ts0VarZ1;
                n5.a aVar2 = ts0VarA1;
                zzbvb zzbvbVar2 = zzbvbVar;
                bt0 bt0Var = bt0VarD;
                sg0Var.getClass();
                String str = ((tr) aVar.get()).f9267i;
                qg0 qg0Var = new qg0((tr) aVar.get(), (JSONObject) aVar2.get(), zzbvbVar2.f11581t, bt0Var);
                synchronized (sg0Var) {
                    sg0Var.B1();
                    sg0Var.f8866h.addLast(qg0Var);
                }
                return new ByteArrayInputStream(str.getBytes(fx0.f4681c));
            }
        }).d();
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final void v0(zzbvb zzbvbVar, pr prVar) {
        Bundle bundle;
        if (((Boolean) zzba.zzc().a(eg.S1)).booleanValue() && (bundle = zzbvbVar.f11586y) != null) {
            ((y3.b) zzu.zzB()).getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        C1(w1(zzbvbVar, Binder.getCallingUid()), prVar, zzbvbVar);
    }

    public final ts0 v1(zzbvb zzbvbVar, int i10) {
        qg0 qg0VarY1;
        ts0 ts0VarD;
        bn bnVarZzf = zzu.zzf();
        VersionInfoParcel versionInfoParcelForPackage = VersionInfoParcel.forPackage();
        Context context = this.f8862a;
        fn fnVarB = bnVarZzf.b(context, versionInfoParcelForPackage, this.f8867q);
        vy vyVarC = ((gy) this.f8865f).c(zzbvbVar, i10);
        hn hnVarA = fnVarB.a("google.afma.response.normalize", rg0.f8590d, en.f4245c);
        if (((Boolean) sh.f8868a.k()).booleanValue()) {
            qg0VarY1 = y1(zzbvbVar.f11581t);
            if (qg0VarY1 == null) {
                zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbvbVar.f11583v;
            qg0VarY1 = null;
            if (str != null && !str.isEmpty()) {
                zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        bt0 bt0VarD = qg0VarY1 == null ? tc1.d(context, 9) : qg0VarY1.f8177d;
        ft0 ft0Var = (ft0) vyVarC.f9996c.zzb();
        ft0Var.d(zzbvbVar.f11574a.getStringArrayList("ad_types"));
        xg0 xg0Var = new xg0(zzbvbVar.f11580s, ft0Var, bt0VarD);
        p80 p80Var = new p80(context, zzbvbVar.f11575b.afmaVersion);
        xs0 xs0Var = (xs0) vyVarC.f10005l.zzb();
        bt0 bt0VarD2 = tc1.d(context, 11);
        ws0 ws0Var = ws0.f10337w;
        ws0 ws0Var2 = ws0.f10335u;
        if (qg0VarY1 == null) {
            ts0 ts0VarA1 = A1(zzbvbVar, xs0Var, vyVarC);
            ts0 ts0VarZ1 = z1(ts0VarA1, xs0Var, fnVarB, ft0Var, bt0VarD);
            bt0 bt0VarD3 = tc1.d(context, 10);
            ts0 ts0VarD2 = xs0Var.a(ws0Var2, ts0VarZ1, ts0VarA1).b(new u30(ts0VarZ1, zzbvbVar, ts0VarA1)).j(xg0Var).j(new ks0(bt0VarD3)).j(p80Var).d();
            tc1.b0(ts0VarD2, ft0Var, bt0VarD3, false);
            tc1.J(ts0VarD2, bt0VarD2);
            ts0VarD = xs0Var.a(ws0Var, ts0VarA1, ts0VarZ1, ts0VarD2).b(new d30(zzbvbVar, ts0VarD2, ts0VarA1, ts0VarZ1, 1)).l(hnVarA).d();
        } else {
            wg0 wg0Var = new wg0(qg0VarY1.f8175b, qg0VarY1.f8174a);
            bt0 bt0VarD4 = tc1.d(context, 10);
            ts0 ts0VarD3 = xs0Var.b(tc1.d0(wg0Var), ws0Var2).j(xg0Var).j(new ks0(bt0VarD4)).j(p80Var).d();
            tc1.b0(ts0VarD3, ft0Var, bt0VarD4, false);
            m21 m21VarD0 = tc1.d0(qg0VarY1);
            tc1.J(ts0VarD3, bt0VarD2);
            ts0VarD = xs0Var.a(ws0Var, ts0VarD3, m21VarD0).b(new mg0(ts0VarD3, m21VarD0, 0)).l(hnVarA).d();
        }
        tc1.b0(ts0VarD, ft0Var, bt0VarD2, false);
        return ts0VarD;
    }

    public final n5.a w1(zzbvb zzbvbVar, int i10) {
        String string;
        List list;
        bn bnVarZzf = zzu.zzf();
        VersionInfoParcel versionInfoParcelForPackage = VersionInfoParcel.forPackage();
        Context context = this.f8862a;
        fn fnVarB = bnVarZzf.b(context, versionInfoParcelForPackage, this.f8867q);
        if (!((Boolean) xh.f10555a.k()).booleanValue()) {
            return tc1.Z(new Exception("Signal collection disabled."));
        }
        vy vyVarC = ((gy) this.f8865f).c(zzbvbVar, i10);
        zy zyVar = vyVarC.f9995b;
        Context context2 = zyVar.f11338b.f5433b;
        tp1.b0(context2);
        Object objZzb = zyVar.f11369q0.zzb();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        gp0 gp0Var = vyVarC.f9994a;
        switch (gp0Var.f5024a) {
            case 0:
                string = ((zzbuc) gp0Var.f5026d).f11557f;
                break;
            default:
                string = ((zzbvb) gp0Var.f5026d).f11574a.getString("ms");
                if (string == null) {
                    string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                break;
        }
        switch (gp0Var.f5024a) {
            case 0:
                PackageInfo packageInfo = ((zzbuc) gp0Var.f5026d).f11556d;
                break;
            default:
                PackageInfo packageInfo2 = ((zzbvb) gp0Var.f5026d).f11579q;
                break;
        }
        gp0Var.zza();
        am0 am0Var = new am0(muVar, string);
        tp1.b0(muVar);
        switch (gp0Var.f5024a) {
            case 0:
                list = ((zzbuc) gp0Var.f5026d).f11560s;
                break;
            default:
                list = ((zzbvb) gp0Var.f5026d).f11578h;
                break;
        }
        tp1.b0(list);
        am0 am0Var2 = new am0(muVar, list);
        eh1 eh1VarA = ih1.a(vyVarC.f9997d);
        eh1 eh1VarA2 = ih1.a(vyVarC.f9998e);
        eh1 eh1VarA3 = ih1.a(vyVarC.f9999f);
        ih1.a(vyVarC.f10000g);
        eh1 eh1VarA4 = ih1.a(vyVarC.f10001h);
        eh1 eh1VarA5 = ih1.a(vyVarC.f10002i);
        ih1.a(vyVarC.f10003j);
        eh1 eh1VarA6 = ih1.a(vyVarC.f10004k);
        tp1.b0(muVar);
        nh1 nh1Var = vyVarC.f9996c;
        ft0 ft0Var = (ft0) nh1Var.zzb();
        ed0 ed0Var = (ed0) zyVar.f11377y.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add((ip0) objZzb);
        hashSet.add(am0Var);
        hashSet.add(am0Var2);
        if (((Boolean) zzba.zzc().a(eg.f3995f5)).booleanValue()) {
            hashSet.add((to0) eh1VarA.zzb());
        }
        if (((Boolean) zzba.zzc().a(eg.f4006g5)).booleanValue()) {
            hashSet.add((to0) eh1VarA2.zzb());
        }
        if (((Boolean) zzba.zzc().a(eg.f4017h5)).booleanValue()) {
            hashSet.add((to0) eh1VarA3.zzb());
        }
        if (((Boolean) zzba.zzc().a(eg.f4039j5)).booleanValue()) {
            hashSet.add((to0) eh1VarA4.zzb());
        }
        if (((Boolean) zzba.zzc().a(eg.k5)).booleanValue()) {
            hashSet.add((to0) eh1VarA5.zzb());
        }
        if (((Boolean) zzba.zzc().a(eg.C2)).booleanValue()) {
            hashSet.add((to0) eh1VarA6.zzb());
        }
        uo0 uo0Var = new uo0(context2, muVar, hashSet, ft0Var, ed0Var);
        hn hnVarA = fnVarB.a("google.afma.request.getSignals", en.f4244b, en.f4245c);
        bt0 bt0VarD = tc1.d(context, 22);
        ts0 ts0VarD = ((xs0) vyVarC.f10005l.zzb()).b(tc1.d0(zzbvbVar.f11574a), ws0.f10338x).j(new ks0(bt0VarD)).l(new jn(uo0Var, 11, zzbvbVar)).g(ws0.f10339y).l(hnVarA).d();
        ft0 ft0Var2 = (ft0) nh1Var.zzb();
        Bundle bundle = zzbvbVar.f11574a;
        ft0Var2.d(bundle.getStringArrayList("ad_types"));
        ft0Var2.f(bundle.getBundle("extras"));
        tc1.b0(ts0VarD, ft0Var2, bt0VarD, true);
        if (((Boolean) lh.f6620g.k()).booleanValue()) {
            rk0 rk0Var = this.f8864d;
            Objects.requireNonNull(rk0Var);
            ts0VarD.a(new og0(rk0Var, 0), this.f8863b);
        }
        return ts0VarD;
    }

    public final n5.a x1(String str) {
        if (((Boolean) sh.f8868a.k()).booleanValue()) {
            return y1(str) == null ? tc1.Z(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : tc1.d0(new pg0());
        }
        return tc1.Z(new Exception("Split request is disabled."));
    }

    public final synchronized qg0 y1(String str) {
        Iterator it = this.f8866h.iterator();
        while (it.hasNext()) {
            qg0 qg0Var = (qg0) it.next();
            if (qg0Var.f8176c.equals(str)) {
                it.remove();
                return qg0Var;
            }
        }
        return null;
    }
}
