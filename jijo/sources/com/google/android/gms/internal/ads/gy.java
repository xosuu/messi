package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class gy implements xz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static zy f5106a;

    public static zy b(Context context, rn rnVar, int i10) {
        SharedPreferences sharedPreferences;
        synchronized (gy.class) {
            try {
                zy zyVar = f5106a;
                if (zyVar != null) {
                    return zyVar;
                }
                ((y3.b) zzu.zzB()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                eg.a(context);
                if (((Boolean) dh.f3653e.k()).booleanValue() && (sharedPreferences = context.getSharedPreferences("admob", 0)) != null) {
                    sharedPreferences.edit().putInt("init_without_write", b4.f.m0(context, "init_without_write") + 1).commit();
                }
                ur0 ur0VarS = ur0.S(context);
                zzu.zzp();
                boolean zZzE = zzt.zzE((Context) ur0VarS.f9600b);
                VersionInfoParcel versionInfoParcel = new VersionInfoParcel(242402000, i10, true, zZzE);
                if (((Boolean) mh.f6940c.k()).booleanValue()) {
                    com.google.android.gms.ads.internal.client.zzcl zzclVar = (com.google.android.gms.ads.internal.client.zzcl) ur0VarS.f9601d;
                    zzen liteSdkVersion = null;
                    if (zzclVar != null) {
                        try {
                            liteSdkVersion = zzclVar.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (liteSdkVersion != null) {
                        versionInfoParcel = new VersionInfoParcel(242402000, liteSdkVersion.zza(), true, zZzE);
                    }
                }
                ur0VarS.U(rnVar);
                WeakReference weakReference = new WeakReference(context);
                Context applicationContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                hy hyVar = new hy();
                hyVar.f5432a = versionInfoParcel;
                hyVar.f5433b = applicationContext;
                hyVar.f5435d = weakReference;
                hyVar.f5434c = jCurrentTimeMillis;
                zy zyVar2 = new zy(hyVar);
                zzu.zzo().g(context, versionInfoParcel);
                zzu.zzc().d(context);
                zzu.zzp().zzl(context);
                zzu.zzp().zzk(context);
                zzd.zza(context);
                zzu.zzb().d(context);
                zzu.zzv().zzb(context);
                ((zzcb) zyVar2.M.zzb()).zzc();
                jt.e(context);
                if (((Boolean) zzba.zzc().a(eg.B5)).booleanValue()) {
                    if (!((Boolean) zzba.zzc().a(eg.f4095p0)).booleanValue()) {
                        xq xqVar = new xq(context, versionInfoParcel, new kd(new v3.d0(context)), new m20(new zg0(context, 0), 27, (p21) zyVar2.f11346f.zzb()), 16, (Object) null);
                        try {
                            ((m20) xqVar.f10632f).e(new f.x0(xqVar, zzu.zzo().d().zzS()));
                        } catch (Exception e10) {
                            zzm.zzg("Error in offline signals database startup: ".concat(String.valueOf(e10.getMessage())));
                        }
                    }
                }
                f5106a = zyVar2;
                return zyVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Executor a();

    public final vy c(zzbvb zzbvbVar, int i10) {
        return new vy(((zy) this).f11340c, new gp0(i10, 7, zzbvbVar));
    }

    public abstract gt0 d();
}
