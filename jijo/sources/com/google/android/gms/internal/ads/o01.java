package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o01 implements hw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7447b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hw0 f7448d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k51 f7449f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public et0 f7450h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public kv0 f7451q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public hw0 f7452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public yb1 f7453t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public uv0 f7454u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public kv0 f7455v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hw0 f7456w;

    public o01(Context context, f41 f41Var) {
        this.f7446a = context.getApplicationContext();
        this.f7448d = f41Var;
    }

    public static final void j(hw0 hw0Var, va1 va1Var) {
        if (hw0Var != null) {
            hw0Var.a(va1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void a(va1 va1Var) {
        va1Var.getClass();
        this.f7448d.a(va1Var);
        this.f7447b.add(va1Var);
        j(this.f7449f, va1Var);
        j(this.f7450h, va1Var);
        j(this.f7451q, va1Var);
        j(this.f7452s, va1Var);
        j(this.f7453t, va1Var);
        j(this.f7454u, va1Var);
        j(this.f7455v, va1Var);
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) {
        hw0 hw0Var = this.f7456w;
        hw0Var.getClass();
        return hw0Var.b(i10, bArr, i11);
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final long g(iz0 iz0Var) {
        tc1.W(this.f7456w == null);
        String scheme = iz0Var.f5730a.getScheme();
        int i10 = yn0.f10944a;
        Uri uri = iz0Var.f5730a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f7446a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f7449f == null) {
                    k51 k51Var = new k51(false);
                    this.f7449f = k51Var;
                    i(k51Var);
                }
                this.f7456w = this.f7449f;
            } else {
                if (this.f7450h == null) {
                    et0 et0Var = new et0(context);
                    this.f7450h = et0Var;
                    i(et0Var);
                }
                this.f7456w = this.f7450h;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f7450h == null) {
                et0 et0Var2 = new et0(context);
                this.f7450h = et0Var2;
                i(et0Var2);
            }
            this.f7456w = this.f7450h;
        } else if ("content".equals(scheme)) {
            if (this.f7451q == null) {
                kv0 kv0Var = new kv0(context, 0);
                this.f7451q = kv0Var;
                i(kv0Var);
            }
            this.f7456w = this.f7451q;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            hw0 hw0Var = this.f7448d;
            if (zEquals) {
                if (this.f7452s == null) {
                    try {
                        hw0 hw0Var2 = (hw0) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f7452s = hw0Var2;
                        i(hw0Var2);
                    } catch (ClassNotFoundException unused) {
                        fg0.f("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f7452s == null) {
                        this.f7452s = hw0Var;
                    }
                }
                this.f7456w = this.f7452s;
            } else if ("udp".equals(scheme)) {
                if (this.f7453t == null) {
                    yb1 yb1Var = new yb1();
                    this.f7453t = yb1Var;
                    i(yb1Var);
                }
                this.f7456w = this.f7453t;
            } else if ("data".equals(scheme)) {
                if (this.f7454u == null) {
                    uv0 uv0Var = new uv0(false);
                    this.f7454u = uv0Var;
                    i(uv0Var);
                }
                this.f7456w = this.f7454u;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f7455v == null) {
                    kv0 kv0Var2 = new kv0(context, 1);
                    this.f7455v = kv0Var2;
                    i(kv0Var2);
                }
                this.f7456w = this.f7455v;
            } else {
                this.f7456w = hw0Var;
            }
        }
        return this.f7456w.g(iz0Var);
    }

    public final void i(hw0 hw0Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f7447b;
            if (i10 >= arrayList.size()) {
                return;
            }
            hw0Var.a((va1) arrayList.get(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        hw0 hw0Var = this.f7456w;
        if (hw0Var == null) {
            return null;
        }
        return hw0Var.zzc();
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() {
        hw0 hw0Var = this.f7456w;
        if (hw0Var != null) {
            try {
                hw0Var.zzd();
            } finally {
                this.f7456w = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Map zze() {
        hw0 hw0Var = this.f7456w;
        return hw0Var == null ? Collections.emptyMap() : hw0Var.zze();
    }
}
