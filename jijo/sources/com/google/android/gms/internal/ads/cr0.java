package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;

/* JADX INFO: loaded from: classes.dex */
public final class cr0 extends pb implements cs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yq0 f3401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wq0 f3402b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lr0 f3403d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bc0 f3404f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3405h;

    public cr0(yq0 yq0Var, wq0 wq0Var, lr0 lr0Var) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.f3405h = false;
        this.f3401a = yq0Var;
        this.f3402b = wq0Var;
        this.f3403d = lr0Var;
    }

    public final synchronized void S0(a4.a aVar) {
        z3.a.j("pause must be called on the main UI thread.");
        if (this.f3404f != null) {
            Context context = aVar == null ? null : (Context) a4.b.a0(aVar);
            z40 z40Var = this.f3404f.f8359c;
            z40Var.getClass();
            z40Var.I0(new dg(context));
        }
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        fx fxVar;
        if (i10 == 1) {
            zzbvu zzbvuVar = (zzbvu) qb.a(parcel, zzbvu.CREATOR);
            qb.b(parcel);
            v1(zzbvuVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 2) {
            zzq();
            parcel2.writeNoException();
            return true;
        }
        IInterface bsVar = null;
        if (i10 == 3) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                bsVar = iInterfaceQueryLocalInterface instanceof es ? (es) iInterfaceQueryLocalInterface : new ds(strongBinder);
            }
            qb.b(parcel);
            z3.a.j("setRewardedVideoAdListener can only be called from the UI thread.");
            this.f3402b.f10298h.set(bsVar);
            parcel2.writeNoException();
            return true;
        }
        i = 0;
        i = 0;
        int i11 = 0;
        if (i10 == 34) {
            ClassLoader classLoader = qb.f8146a;
            boolean z9 = parcel.readInt() != 0;
            qb.b(parcel);
            synchronized (this) {
                z3.a.j("setImmersiveMode must be called on the main UI thread.");
                this.f3405h = z9;
            }
            parcel2.writeNoException();
            return true;
        }
        switch (i10) {
            case 5:
                z3.a.j("isLoaded must be called on the main UI thread.");
                boolean zZ1 = z1();
                parcel2.writeNoException();
                ClassLoader classLoader2 = qb.f8146a;
                parcel2.writeInt(zZ1 ? 1 : 0);
                return true;
            case 6:
                S0(null);
                parcel2.writeNoException();
                return true;
            case 7:
                zzk(null);
                parcel2.writeNoException();
                return true;
            case 8:
                c0(null);
                parcel2.writeNoException();
                return true;
            case 9:
                a4.a aVarT = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                S0(aVarT);
                parcel2.writeNoException();
                return true;
            case 10:
                a4.a aVarT2 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zzk(aVarT2);
                parcel2.writeNoException();
                return true;
            case 11:
                a4.a aVarT3 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                c0(aVarT3);
                parcel2.writeNoException();
                return true;
            case 12:
                String strU1 = u1();
                parcel2.writeNoException();
                parcel2.writeString(strU1);
                return true;
            case 13:
                String string = parcel.readString();
                qb.b(parcel);
                x1(string);
                parcel2.writeNoException();
                return true;
            case 14:
                zzby zzbyVarZzb = zzbx.zzb(parcel.readStrongBinder());
                qb.b(parcel);
                z3.a.j("setAdMetadataListener can only be called from the UI thread.");
                wq0 wq0Var = this.f3402b;
                if (zzbyVarZzb == null) {
                    wq0Var.f10295b.set(null);
                } else {
                    wq0Var.f10295b.set(new ar0(this, zzbyVarZzb, 1));
                }
                parcel2.writeNoException();
                return true;
            case 15:
                z3.a.j("getAdMetadata can only be called from the UI thread.");
                bc0 bc0Var = this.f3404f;
                Bundle bundleB = bc0Var != null ? bc0Var.b() : new Bundle();
                parcel2.writeNoException();
                qb.d(parcel2, bundleB);
                return true;
            case 16:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    bsVar = iInterfaceQueryLocalInterface2 instanceof bs ? (bs) iInterfaceQueryLocalInterface2 : new bs(strongBinder2, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                }
                qb.b(parcel);
                z3.a.j("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                this.f3402b.f10300s.set(bsVar);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                qb.b(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                a4.a aVarT4 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                y1(aVarT4);
                parcel2.writeNoException();
                return true;
            case 19:
                String string2 = parcel.readString();
                qb.b(parcel);
                w1(string2);
                parcel2.writeNoException();
                return true;
            case 20:
                bc0 bc0Var2 = this.f3404f;
                if (bc0Var2 != null && (fxVar = (fx) bc0Var2.f2974k.get()) != null && !fxVar.c0()) {
                    i11 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = qb.f8146a;
                parcel2.writeInt(i11);
                return true;
            case sf.zzm /* 21 */:
                zzdn zzdnVarZzc = zzc();
                parcel2.writeNoException();
                qb.e(parcel2, zzdnVarZzc);
                return true;
            default:
                return false;
        }
    }

    public final synchronized void c0(a4.a aVar) {
        z3.a.j("destroy must be called on the main UI thread.");
        Context context = null;
        this.f3402b.f10295b.set(null);
        if (this.f3404f != null) {
            if (aVar != null) {
                context = (Context) a4.b.a0(aVar);
            }
            z40 z40Var = this.f3404f.f8359c;
            z40Var.getClass();
            z40Var.I0(new y40(context));
        }
    }

    public final synchronized String u1() {
        h40 h40Var;
        bc0 bc0Var = this.f3404f;
        if (bc0Var == null || (h40Var = bc0Var.f8362f) == null) {
            return null;
        }
        return h40Var.f5205a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.eg.P4)).booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void v1(com.google.android.gms.internal.ads.zzbvu r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            z3.a.j(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r6.f11588b     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.xf r1 = com.google.android.gms.internal.ads.eg.N4     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.cg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r6 = move-exception
            goto L67
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.gu r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L20
            r2.i(r1, r0)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r5.z1()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.xf r0 = com.google.android.gms.internal.ads.eg.P4     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.cg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r5)
            return
        L46:
            com.google.android.gms.internal.ads.vp0 r0 = new com.google.android.gms.internal.ads.vp0     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r5.f3404f = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.yq0 r1 = r5.f3401a     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.nr0 r2 = r1.f11013t     // Catch: java.lang.Throwable -> L20
            b4.j r2 = r2.f7372o     // Catch: java.lang.Throwable -> L20
            r3 = 1
            r2.f1331b = r3     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.internal.client.zzl r2 = r6.f11587a     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = r6.f11588b     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.i10 r3 = new com.google.android.gms.internal.ads.i10     // Catch: java.lang.Throwable -> L20
            r4 = 29
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L20
            r1.b(r2, r6, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r5)
            return
        L67:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cr0.v1(com.google.android.gms.internal.ads.zzbvu):void");
    }

    public final synchronized void w1(String str) {
        z3.a.j("#008 Must be called on the main UI thread.: setCustomData");
        this.f3403d.f6696b = str;
    }

    public final synchronized void x1(String str) {
        z3.a.j("setUserId must be called on the main UI thread.");
        this.f3403d.f6695a = str;
    }

    public final synchronized void y1(a4.a aVar) {
        try {
            z3.a.j("showAd must be called on the main UI thread.");
            if (this.f3404f != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object objA0 = a4.b.a0(aVar);
                    if (objA0 instanceof Activity) {
                        activity = (Activity) objA0;
                    }
                }
                this.f3404f.c(activity, this.f3405h);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean z1() {
        bc0 bc0Var = this.f3404f;
        if (bc0Var != null) {
            if (!bc0Var.f2979p.f2886b.get()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized zzdn zzc() {
        bc0 bc0Var;
        if (((Boolean) zzba.zzc().a(eg.f3962c6)).booleanValue() && (bc0Var = this.f3404f) != null) {
            return bc0Var.f8362f;
        }
        return null;
    }

    public final synchronized void zzk(a4.a aVar) {
        z3.a.j("resume must be called on the main UI thread.");
        if (this.f3404f != null) {
            Context context = aVar == null ? null : (Context) a4.b.a0(aVar);
            z40 z40Var = this.f3404f.f8359c;
            z40Var.getClass();
            z40Var.I0(new mu0(context, 0));
        }
    }

    public final synchronized void zzq() {
        y1(null);
    }
}
