package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class gu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5054a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzj f5055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ju f5056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f5058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VersionInfoParcel f5059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f5060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public jt f5061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f5062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f5063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f5064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fu f5065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f5066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n5.a f5067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f5068o;

    public gu() {
        zzj zzjVar = new zzj();
        this.f5055b = zzjVar;
        this.f5056c = new ju(zzay.zzd(), zzjVar);
        this.f5057d = false;
        this.f5061h = null;
        this.f5062i = null;
        this.f5063j = new AtomicInteger(0);
        this.f5064k = new AtomicInteger(0);
        this.f5065l = new fu();
        this.f5066m = new Object();
        this.f5068o = new AtomicBoolean();
    }

    public final boolean a(Context context) {
        if (z3.a.K()) {
            if (((Boolean) zzba.zzc().a(eg.C7)).booleanValue()) {
                return this.f5068o.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final Resources b() {
        if (this.f5059f.isClientJar) {
            return this.f5058e.getResources();
        }
        try {
            if (((Boolean) zzba.zzc().a(eg.V9)).booleanValue()) {
                return zzq.zza(this.f5058e).getResources();
            }
            zzq.zza(this.f5058e).getResources();
            return null;
        } catch (zzp e10) {
            zzm.zzk("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final jt c() {
        jt jtVar;
        synchronized (this.f5054a) {
            jtVar = this.f5061h;
        }
        return jtVar;
    }

    public final zzj d() {
        zzj zzjVar;
        synchronized (this.f5054a) {
            zzjVar = this.f5055b;
        }
        return zzjVar;
    }

    public final n5.a e() {
        if (this.f5058e != null) {
            if (!((Boolean) zzba.zzc().a(eg.f4154v2)).booleanValue()) {
                synchronized (this.f5066m) {
                    try {
                        n5.a aVar = this.f5067n;
                        if (aVar != null) {
                            return aVar;
                        }
                        n5.a aVarB = nu.f7383a.b(new du(0, this));
                        this.f5067n = aVarB;
                        return aVarB;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return tc1.d0(new ArrayList());
    }

    public final Boolean f() {
        Boolean bool;
        synchronized (this.f5054a) {
            bool = this.f5062i;
        }
        return bool;
    }

    public final void g(Context context, VersionInfoParcel versionInfoParcel) {
        jt jtVar;
        synchronized (this.f5054a) {
            try {
                if (!this.f5057d) {
                    this.f5058e = context.getApplicationContext();
                    this.f5059f = versionInfoParcel;
                    zzu.zzb().c(this.f5056c);
                    this.f5055b.zzs(this.f5058e);
                    cr.b(this.f5058e, this.f5059f);
                    zzu.zze();
                    int i10 = 2;
                    if (((Boolean) zzba.zzc().a(eg.N1)).booleanValue()) {
                        jtVar = new jt(2);
                    } else {
                        zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        jtVar = null;
                    }
                    this.f5061h = jtVar;
                    if (jtVar != null) {
                        b4.f.Z(new l3.f(this).zzb(), "AppState.registerCsiReporter");
                    }
                    if (z3.a.K()) {
                        if (((Boolean) zzba.zzc().a(eg.C7)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new j2.e(i10, this));
                            } catch (RuntimeException e10) {
                                zzm.zzk("Failed to register network callback", e10);
                                this.f5068o.set(true);
                            }
                        }
                    }
                    this.f5057d = true;
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzu.zzp().zzc(context, versionInfoParcel.afmaVersion);
    }

    public final void h(String str, Throwable th) {
        cr.b(this.f5058e, this.f5059f).f(th, str, ((Double) uh.f9485g.k()).floatValue());
    }

    public final void i(String str, Throwable th) {
        cr.b(this.f5058e, this.f5059f).e(str, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001d, B:10:0x002f, B:13:0x0039, B:14:0x0042), top: B:19:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.String r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            android.content.Context r0 = r5.f5058e
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r5.f5059f
            java.lang.Object r2 = com.google.android.gms.internal.ads.cr.f3387w
            monitor-enter(r2)
            com.google.android.gms.internal.ads.dr r3 = com.google.android.gms.internal.ads.cr.f3389y     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L42
            com.google.android.gms.internal.ads.xf r3 = com.google.android.gms.internal.ads.eg.R6     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.cg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L37
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L39
            com.google.android.gms.internal.ads.xf r3 = com.google.android.gms.internal.ads.eg.Q6     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.cg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L37
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L39
            com.google.android.gms.internal.ads.cr r3 = new com.google.android.gms.internal.ads.cr     // Catch: java.lang.Throwable -> L37
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.cr.f3389y = r3     // Catch: java.lang.Throwable -> L37
            goto L42
        L37:
            r6 = move-exception
            goto L49
        L39:
            com.google.android.gms.internal.ads.pe r0 = new com.google.android.gms.internal.ads.pe     // Catch: java.lang.Throwable -> L37
            r1 = 16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.cr.f3389y = r0     // Catch: java.lang.Throwable -> L37
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.dr r0 = com.google.android.gms.internal.ads.cr.f3389y
            r0.e(r6, r7)
            return
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gu.j(java.lang.String, java.lang.Throwable):void");
    }

    public final void k(Boolean bool) {
        synchronized (this.f5054a) {
            this.f5062i = bool;
        }
    }
}
