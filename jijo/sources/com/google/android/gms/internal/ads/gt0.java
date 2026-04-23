package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashMap;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class gt0 implements Runnable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f5042u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f5043v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f5044w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static Boolean f5045x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f5047b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5050h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qc0 f5051q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f5052s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kt0 f5048d = nt0.B();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5049f = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5053t = false;

    public gt0(Context context, VersionInfoParcel versionInfoParcel, qc0 qc0Var, pe peVar) {
        this.f5046a = context;
        this.f5047b = versionInfoParcel;
        this.f5051q = qc0Var;
        if (((Boolean) zzba.zzc().a(eg.W7)).booleanValue()) {
            this.f5052s = zzt.zzd();
        } else {
            zy0 zy0Var = bz0.f3132b;
            this.f5052s = wz0.f10382h;
        }
    }

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (f5042u) {
            try {
                if (f5045x == null) {
                    if (((Boolean) eh.f4202b.k()).booleanValue()) {
                        f5045x = Boolean.valueOf(Math.random() < ((Double) eh.f4201a.k()).doubleValue());
                    } else {
                        f5045x = Boolean.FALSE;
                    }
                }
                zBooleanValue = f5045x.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final void b(dt0 dt0Var) {
        nu.f7383a.a(new vh0(this, 9, dt0Var));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrD;
        if (a()) {
            Object obj = f5043v;
            synchronized (obj) {
                try {
                    if (((nt0) this.f5048d.f9462b).A() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            bArrD = ((nt0) this.f5048d.b()).d();
                            kt0 kt0Var = this.f5048d;
                            kt0Var.d();
                            nt0.C((nt0) kt0Var.f9462b);
                        }
                        ug0 ug0Var = new ug0((String) zzba.zzc().a(eg.Q7), DateTimeConstants.MILLIS_PER_MINUTE, new HashMap(), bArrD, "application/x-protobuf", false);
                        Context context = this.f5046a;
                        String str = this.f5047b.afmaVersion;
                        Binder.getCallingUid();
                        new p80(context, str).e(ug0Var);
                    } catch (Exception e10) {
                        if ((e10 instanceof zzdwl) && ((zzdwl) e10).f11605a == 3) {
                            return;
                        }
                        zzu.zzo().h("CuiMonitor.sendCuiPing", e10);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
