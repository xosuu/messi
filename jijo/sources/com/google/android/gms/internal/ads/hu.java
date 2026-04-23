package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class hu {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzg f5398h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5391a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5392b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5393c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5394d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5395e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5396f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5399i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5400j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5401k = 0;

    public hu(String str, zzj zzjVar) {
        this.f5397g = str;
        this.f5398h = zzjVar;
    }

    public final int a() {
        int i10;
        synchronized (this.f5396f) {
            i10 = this.f5401k;
        }
        return i10;
    }

    public final Bundle b(Context context, String str) {
        Bundle bundle;
        synchronized (this.f5396f) {
            try {
                bundle = new Bundle();
                if (!this.f5398h.zzS()) {
                    bundle.putString("session_id", this.f5397g);
                }
                bundle.putLong("basets", this.f5392b);
                bundle.putLong("currts", this.f5391a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.f5393c);
                bundle.putInt("preqs_in_session", this.f5394d);
                bundle.putLong("time_in_session", this.f5395e);
                bundle.putInt("pclick", this.f5399i);
                bundle.putInt("pimp", this.f5400j);
                int i10 = zr.f11315a;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z9 = false;
                if (identifier == 0) {
                    zzm.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                            z9 = true;
                        } else {
                            zzm.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        zzm.zzj("Fail to fetch AdActivity theme");
                        zzm.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z9);
                bundle.putInt("consent_form_action_identifier", a());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final void c() {
        synchronized (this.f5396f) {
            this.f5399i++;
        }
    }

    public final void d() {
        synchronized (this.f5396f) {
            this.f5400j++;
        }
    }

    public final void e(zzl zzlVar, long j10) {
        Bundle bundle;
        synchronized (this.f5396f) {
            try {
                long jZzd = this.f5398h.zzd();
                ((y3.b) zzu.zzB()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f5392b == -1) {
                    if (jCurrentTimeMillis - jZzd > ((Long) zzba.zzc().a(eg.K0)).longValue()) {
                        this.f5394d = -1;
                    } else {
                        this.f5394d = this.f5398h.zzc();
                    }
                    this.f5392b = j10;
                    this.f5391a = j10;
                } else {
                    this.f5391a = j10;
                }
                if (((Boolean) zzba.zzc().a(eg.f4037j3)).booleanValue() || (bundle = zzlVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.f5393c++;
                    int i10 = this.f5394d + 1;
                    this.f5394d = i10;
                    if (i10 == 0) {
                        this.f5395e = 0L;
                        this.f5398h.zzE(jCurrentTimeMillis);
                    } else {
                        this.f5395e = jCurrentTimeMillis - this.f5398h.zze();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.f5396f) {
            this.f5401k++;
        }
    }

    public final void g() {
        if (((Boolean) sh.f8868a.k()).booleanValue()) {
            synchronized (this.f5396f) {
                this.f5393c--;
                this.f5394d--;
            }
        }
    }
}
