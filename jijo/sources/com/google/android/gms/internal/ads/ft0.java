package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzq;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ft0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gt0 f4653b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4654d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4656h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public xq f4657q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zze f4658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ScheduledFuture f4659t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4652a = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4660u = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public it0 f4655f = it0.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public ft0(gt0 gt0Var) {
        this.f4653b = gt0Var;
    }

    public final synchronized void a(bt0 bt0Var) {
        try {
            if (((Boolean) eh.f4203c.k()).booleanValue()) {
                ArrayList arrayList = this.f4652a;
                bt0Var.zzj();
                arrayList.add(bt0Var);
                ScheduledFuture scheduledFuture = this.f4659t;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f4659t = nu.f7386d.schedule(this, ((Integer) zzba.zzc().a(eg.T7)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) eh.f4203c.k()).booleanValue() && !TextUtils.isEmpty(str)) {
            if (Pattern.matches((String) zzba.zzc().a(eg.U7), str)) {
                this.f4654d = str;
            }
        }
    }

    public final synchronized void c(zze zzeVar) {
        if (((Boolean) eh.f4203c.k()).booleanValue()) {
            this.f4658s = zzeVar;
        }
    }

    public final synchronized void d(ArrayList arrayList) {
        try {
            if (((Boolean) eh.f4203c.k()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.f4660u = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.f4660u = 4;
                } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.f4660u = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.f4660u = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f4660u = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.f4660u = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(String str) {
        if (((Boolean) eh.f4203c.k()).booleanValue()) {
            this.f4656h = str;
        }
    }

    public final synchronized void f(Bundle bundle) {
        if (((Boolean) eh.f4203c.k()).booleanValue()) {
            this.f4655f = zzq.zza(bundle);
        }
    }

    public final synchronized void g(xq xqVar) {
        if (((Boolean) eh.f4203c.k()).booleanValue()) {
            this.f4657q = xqVar;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) eh.f4203c.k()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.f4659t;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                for (bt0 bt0Var : this.f4652a) {
                    int i10 = this.f4660u;
                    if (i10 != 2) {
                        bt0Var.b(i10);
                    }
                    if (!TextUtils.isEmpty(this.f4654d)) {
                        bt0Var.a(this.f4654d);
                    }
                    if (!TextUtils.isEmpty(this.f4656h) && !bt0Var.zzl()) {
                        bt0Var.v(this.f4656h);
                    }
                    xq xqVar = this.f4657q;
                    if (xqVar != null) {
                        bt0Var.d(xqVar);
                    } else {
                        zze zzeVar = this.f4658s;
                        if (zzeVar != null) {
                            bt0Var.j(zzeVar);
                        }
                    }
                    bt0Var.c(this.f4655f);
                    this.f4653b.b(bt0Var.zzm());
                }
                this.f4652a.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(int i10) {
        if (((Boolean) eh.f4203c.k()).booleanValue()) {
            this.f4660u = i10;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
