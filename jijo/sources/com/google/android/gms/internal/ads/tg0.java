package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tg0 extends pb implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p80 f9154b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m20 f9155d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rk0 f9156f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p21 f9157h;

    public tg0(Context context, p80 p80Var, m20 m20Var, rk0 rk0Var, mu muVar, pe peVar) {
        super("com.google.android.gms.ads.internal.request.IAdsService");
        this.f9153a = context;
        this.f9154b = p80Var;
        this.f9155d = m20Var;
        this.f9156f = rk0Var;
        this.f9157h = muVar;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        nr mrVar = null;
        if (i10 == 1) {
            zzbuc zzbucVar = (zzbuc) qb.a(parcel, zzbuc.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                mrVar = iInterfaceQueryLocalInterface instanceof nr ? (nr) iInterfaceQueryLocalInterface : new mr(strongBinder);
            }
            qb.b(parcel);
            z(zzbucVar, mrVar);
        } else if (i10 == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (iInterfaceQueryLocalInterface2 instanceof nr) {
                }
            }
            qb.b(parcel);
        } else {
            if (i10 != 3) {
                return false;
            }
            zzbug zzbugVar = (zzbug) qb.a(parcel, zzbug.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                mrVar = iInterfaceQueryLocalInterface3 instanceof nr ? (nr) iInterfaceQueryLocalInterface3 : new mr(strongBinder3);
            }
            qb.b(parcel);
            i0(zzbugVar, mrVar);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final void i0(zzbug zzbugVar, nr nrVar) {
        tc1.u0(tc1.q0(h21.r(u1(zzbugVar, Binder.getCallingUid())), new f00(15, 0), nu.f7383a), new i10(21, nrVar, 0), nu.f7388f);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.r11 u1(com.google.android.gms.internal.ads.zzbug r9, int r10) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tg0.u1(com.google.android.gms.internal.ads.zzbug, int):com.google.android.gms.internal.ads.r11");
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final void z(zzbuc zzbucVar, nr nrVar) {
        xs0 xs0Var;
        gp0 gp0Var = new gp0(Binder.getCallingUid(), 0, zzbucVar);
        p80 p80Var = this.f9154b;
        p80Var.f7835d = gp0Var;
        wy wyVar = new wy((zy) p80Var.f7834b, gp0Var);
        switch (1) {
            case 0:
                xs0Var = (xs0) wyVar.f10377d.zzb();
                break;
            default:
                xs0Var = (xs0) wyVar.f10378e.zzb();
                break;
        }
        ts0 ts0VarD = xs0Var.b(m21.f6811b, ws0.f10332q).l(new if0(13, wyVar)).j(new k70(20)).l(new f00(14)).d();
        tc1.u0(tc1.q0(h21.r(ts0VarD), new f00(15, 0), nu.f7383a), new i10(21, nrVar, 0), nu.f7388f);
        if (((Boolean) lh.f6619f.k()).booleanValue()) {
            rk0 rk0Var = this.f9156f;
            Objects.requireNonNull(rk0Var);
            ts0VarD.a(new og0(rk0Var, 1), this.f9157h);
        }
    }
}
