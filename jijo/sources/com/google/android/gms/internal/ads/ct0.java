package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class ct0 implements bt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3422a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3437p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3423b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3424c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3425d = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3438q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3439r = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3426e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3427f = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3428g = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f3429h = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f3430i = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public it0 f3431j = it0.SCAR_REQUEST_TYPE_UNSPECIFIED;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f3432k = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f3433l = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f3434m = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3435n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3436o = false;

    public ct0(Context context, int i10) {
        this.f3422a = context;
        this.f3437p = i10;
    }

    @Override // com.google.android.gms.internal.ads.bt0
    public final bt0 a(String str) {
        synchronized (this) {
            this.f3430i = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bt0
    public final bt0 b(int i10) {
        synchronized (this) {
            this.f3438q = i10;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bt0
    public final bt0 c(it0 it0Var) {
        synchronized (this) {
            this.f3431j = it0Var;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r2.f3428g = r0.f4603b0;
     */
    @Override // com.google.android.gms.internal.ads.bt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.bt0 d(com.google.android.gms.internal.ads.xq r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r3.f10631d     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.hr0 r0 = (com.google.android.gms.internal.ads.hr0) r0     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r0.f5371b     // Catch: java.lang.Throwable -> L16
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            java.lang.Object r0 = r3.f10631d     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.hr0 r0 = (com.google.android.gms.internal.ads.hr0) r0     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r0.f5371b     // Catch: java.lang.Throwable -> L16
            r2.f3427f = r0     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L3a
        L18:
            java.lang.Object r3 = r3.f10630b     // Catch: java.lang.Throwable -> L16
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L16
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L16
        L20:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.fr0 r0 = (com.google.android.gms.internal.ads.fr0) r0     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r0.f4603b0     // Catch: java.lang.Throwable -> L16
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L20
            java.lang.String r3 = r0.f4603b0     // Catch: java.lang.Throwable -> L16
            r2.f3428g = r3     // Catch: java.lang.Throwable -> L16
        L38:
            monitor-exit(r2)
            return r2
        L3a:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ct0.d(com.google.android.gms.internal.ads.xq):com.google.android.gms.internal.ads.bt0");
    }

    @Override // com.google.android.gms.internal.ads.bt0
    public final bt0 e(Throwable th) {
        synchronized (this) {
            if (((Boolean) zzba.zzc().a(eg.V7)).booleanValue()) {
                String strZzg = zzf.zzg(cr.d(th));
                if (strZzg == null) {
                    strZzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                this.f3433l = strZzg;
                String strD = cr.d(th);
                ks0 ks0VarO = ks0.o(new ex0('\n'));
                strD.getClass();
                this.f3432k = (String) ((px0) ks0VarO.f6384a).f(ks0VarO, strD).next();
            }
        }
        return this;
    }

    public final synchronized void f() {
        ((y3.b) zzu.zzB()).getClass();
        this.f3424c = SystemClock.elapsedRealtime();
    }

    public final synchronized void g() {
        Configuration configuration;
        this.f3426e = zzu.zzq().zzm(this.f3422a);
        Resources resources = this.f3422a.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f3439r = i10;
        ((y3.b) zzu.zzB()).getClass();
        this.f3423b = SystemClock.elapsedRealtime();
        this.f3436o = true;
    }

    @Override // com.google.android.gms.internal.ads.bt0
    public final bt0 i(String str) {
        synchronized (this) {
            if (((Boolean) zzba.zzc().a(eg.V7)).booleanValue()) {
                this.f3434m = str;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bt0
    public final bt0 j(zze zzeVar) {
        synchronized (this) {
            try {
                IBinder iBinder = zzeVar.zze;
                if (iBinder != null) {
                    h40 h40Var = (h40) iBinder;
                    String str = h40Var.f5208f;
                    if (!TextUtils.isEmpty(str)) {
                        this.f3427f = str;
                    }
                    String str2 = h40Var.f5206b;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f3428g = str2;
                    }
                }
            } finally {
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bt0
    public final bt0 v(String str) {
        synchronized (this) {
            this.f3429h = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bt0
    public final bt0 x(boolean z9) {
        synchronized (this) {
            this.f3425d = z9;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bt0
    public final /* bridge */ /* synthetic */ bt0 zzi() {
        g();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bt0
    public final /* bridge */ /* synthetic */ bt0 zzj() {
        f();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bt0
    public final synchronized boolean zzk() {
        return this.f3436o;
    }

    @Override // com.google.android.gms.internal.ads.bt0
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.f3429h);
    }

    @Override // com.google.android.gms.internal.ads.bt0
    public final synchronized dt0 zzm() {
        try {
            if (this.f3435n) {
                return null;
            }
            this.f3435n = true;
            if (!this.f3436o) {
                g();
            }
            if (this.f3424c < 0) {
                f();
            }
            return new dt0(this);
        } catch (Throwable th) {
            throw th;
        }
    }
}
