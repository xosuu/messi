package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cj0 implements j80, yx, ss0, k21, qe0, xp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3301b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3302d;

    public cj0() {
        this.f3300a = 6;
        rk0 rk0Var = new rk0(24);
        this.f3301b = rk0Var;
        this.f3302d = new ks0(rk0Var);
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        switch (this.f3300a) {
            case 4:
                vs0 vs0Var = ((us0) ((tl0) this.f3302d).f9190q).f9606c;
                ts0 ts0Var = (ts0) this.f3301b;
                e70 e70Var = (e70) vs0Var;
                e70Var.getClass();
                e70Var.I0(new ok0(ts0Var, 2, th));
                break;
            default:
                bt0 bt0Var = (bt0) this.f3302d;
                bt0Var.e(th);
                bt0Var.x(false);
                ((ft0) this.f3301b).a(bt0Var);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.xp1
    public final wz0 S(int i10, ow owVar, int[] iArr) {
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < owVar.f7685a) {
            int i13 = i11;
            wp1 wp1Var = new wp1(i10, owVar, i13, (up1) this.f3301b, iArr[i11], (String) this.f3302d);
            int i14 = i12 + 1;
            int length = objArrCopyOf.length;
            if (length < i14) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, vy0.d(length, i14));
            }
            objArrCopyOf[i12] = wp1Var;
            i11++;
            i12 = i14;
        }
        return bz0.j(i12, objArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final void mo4a(Object obj) {
        switch (this.f3300a) {
            case 4:
                vs0 vs0Var = ((us0) ((tl0) this.f3302d).f9190q).f9606c;
                ts0 ts0Var = (ts0) this.f3301b;
                e70 e70Var = (e70) vs0Var;
                e70Var.getClass();
                e70Var.I0(new rk0(22, ts0Var));
                break;
        }
    }

    public final boolean b(int i10) {
        return ((p) this.f3301b).f7743a.get(i10);
    }

    public final void c(wh1 wh1Var) {
        synchronized (wh1Var) {
        }
        Handler handler = (Handler) this.f3301b;
        if (handler != null) {
            handler.post(new il1(this, wh1Var, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void h(boolean z9, Context context, s40 s40Var) throws zzdgw {
        zzffn zzffnVar;
        ui0 ui0Var = (ui0) this.f3301b;
        fi0 fi0Var = (fi0) this.f3302d;
        ui0Var.getClass();
        try {
            ((vr0) fi0Var.f4535b).c(z9);
            int i10 = ((VersionInfoParcel) ui0Var.f9496d).clientJarVersion;
            int iIntValue = ((Integer) zzba.zzc().a(eg.f4190z0)).intValue();
            Object obj = fi0Var.f4535b;
            if (i10 < iIntValue) {
                vr0 vr0Var = (vr0) obj;
                vr0Var.getClass();
                try {
                    vr0Var.f9963a.w();
                    return;
                } finally {
                }
            }
            vr0 vr0Var2 = (vr0) obj;
            vr0Var2.getClass();
            try {
                vr0Var2.f9963a.p1(new a4.b(context));
                return;
            } finally {
            }
        } catch (zzffn e10) {
            zzm.zzi("Cannot show interstitial.");
            throw new zzdgw(e10.getCause());
        }
        zzm.zzi("Cannot show interstitial.");
        throw new zzdgw(e10.getCause());
    }

    @Override // com.google.android.gms.internal.ads.qe0
    /* JADX INFO: renamed from: zza */
    public final void mo0zza(Object obj) {
        switch (this.f3300a) {
            case 11:
                ((fk1) obj).e((ek1) this.f3301b, (gk1) this.f3302d);
                break;
            default:
                ((fk1) obj).l((wh1) this.f3302d);
                break;
        }
    }

    public /* synthetic */ cj0(int i10) {
        this.f3300a = i10;
    }

    public cj0(Handler handler, ri1 ri1Var) {
        this.f3300a = 13;
        this.f3301b = handler;
        this.f3302d = ri1Var;
    }

    public /* synthetic */ cj0(Object obj, int i10, Object obj2) {
        this.f3300a = i10;
        this.f3301b = obj;
        this.f3302d = obj2;
    }

    public /* synthetic */ cj0(Object obj, Object obj2, int i10) {
        this.f3300a = i10;
        this.f3302d = obj;
        this.f3301b = obj2;
    }

    @Override // com.google.android.gms.internal.ads.ss0
    /* JADX INFO: renamed from: zza */
    public final void mo6zza() {
        wi0 wi0Var = (wi0) this.f3301b;
        mg mgVar = (mg) this.f3302d;
        ng ngVar = (ng) ((og) wi0Var.f10197b);
        Parcel parcelM = ngVar.m();
        qb.e(parcelM, mgVar);
        ngVar.a0(parcelM, 1);
    }

    public cj0(Context context) {
        this.f3300a = 14;
        ok0 ok0Var = new ok0(context, 4);
        this.f3302d = new qz(15, (g1.a) null);
        ep epVar = new ep();
        this.f3301b = epVar;
        if (ok0Var != ((cw0) epVar.f4271f)) {
            epVar.f4271f = ok0Var;
            ((Map) epVar.f4269b).clear();
            ((Map) epVar.f4270d).clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void zza(boolean z9, int i10, String str, String str2) {
        ((p80) this.f3301b).zzb();
        fx fxVar = (fx) this.f3302d;
        fxVar.n0();
        fxVar.g().z0();
    }

    public cj0(p pVar, SparseArray sparseArray) {
        this.f3300a = 10;
        this.f3301b = pVar;
        SparseBooleanArray sparseBooleanArray = pVar.f7743a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int iA = pVar.a(i10);
            ek1 ek1Var = (ek1) sparseArray.get(iA);
            ek1Var.getClass();
            sparseArray2.append(iA, ek1Var);
        }
        this.f3302d = sparseArray2;
    }
}
