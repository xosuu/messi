package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class yv implements hw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hw0 f11041b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11042d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11043f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11044h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InputStream f11045q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Uri f11047t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile zzbah f11048u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11049v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11050w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public iz0 f11051x;

    public yv(Context context, f41 f41Var, String str, int i10) {
        this.f11040a = context;
        this.f11041b = f41Var;
        this.f11042d = str;
        this.f11043f = i10;
        new AtomicLong(-1L);
        this.f11044h = ((Boolean) zzba.zzc().a(eg.G1)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void a(va1 va1Var) {
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) throws IOException {
        if (!this.f11046s) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f11045q;
        return inputStream != null ? inputStream.read(bArr, i10, i11) : this.f11041b.b(i10, bArr, i11);
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final long g(iz0 iz0Var) throws IOException {
        Long l9;
        if (this.f11046s) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f11046s = true;
        Uri uri = iz0Var.f5730a;
        this.f11047t = uri;
        this.f11051x = iz0Var;
        this.f11048u = zzbah.b(uri);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.Q3)).booleanValue();
        zzbae zzbaeVarA = null;
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (!zBooleanValue) {
            if (this.f11048u != null) {
                this.f11048u.f11473t = iz0Var.f5732c;
                zzbah zzbahVar = this.f11048u;
                String str2 = this.f11042d;
                if (str2 != null) {
                    str = str2;
                }
                zzbahVar.f11474u = str;
                this.f11048u.f11475v = this.f11043f;
                zzbaeVarA = zzu.zzc().a(this.f11048u);
            }
            if (zzbaeVarA != null && zzbaeVarA.e()) {
                this.f11049v = zzbaeVarA.g();
                this.f11050w = zzbaeVarA.f();
                if (!i()) {
                    this.f11045q = zzbaeVarA.c();
                    return -1L;
                }
            }
        } else if (this.f11048u != null) {
            this.f11048u.f11473t = iz0Var.f5732c;
            zzbah zzbahVar2 = this.f11048u;
            String str3 = this.f11042d;
            if (str3 != null) {
                str = str3;
            }
            zzbahVar2.f11474u = str;
            this.f11048u.f11475v = this.f11043f;
            if (this.f11048u.f11472s) {
                l9 = (Long) zzba.zzc().a(eg.S3);
            } else {
                l9 = (Long) zzba.zzc().a(eg.R3);
            }
            long jLongValue = l9.longValue();
            ((y3.b) zzu.zzB()).getClass();
            SystemClock.elapsedRealtime();
            zzu.zzd();
            ed edVarA = hd.a(this.f11040a, this.f11048u);
            try {
                try {
                    id idVar = (id) edVarA.f8276a.get(jLongValue, TimeUnit.MILLISECONDS);
                    idVar.getClass();
                    this.f11049v = idVar.f5565c;
                    this.f11050w = idVar.f5567e;
                    if (!i()) {
                        this.f11045q = idVar.f5563a;
                    }
                } catch (InterruptedException unused) {
                    edVarA.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    edVarA.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            ((y3.b) zzu.zzB()).getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.f11048u != null) {
            Map map = iz0Var.f5731b;
            long j10 = iz0Var.f5732c;
            long j11 = iz0Var.f5733d;
            int i10 = iz0Var.f5734e;
            Uri uri2 = Uri.parse(this.f11048u.f11466a);
            if (uri2 == null) {
                throw new IllegalStateException("The uri must be set.");
            }
            this.f11051x = new iz0(uri2, map, j10, j11, i10);
        }
        return this.f11041b.g(this.f11051x);
    }

    public final boolean i() {
        if (!this.f11044h) {
            return false;
        }
        if (!((Boolean) zzba.zzc().a(eg.T3)).booleanValue() || this.f11049v) {
            return ((Boolean) zzba.zzc().a(eg.U3)).booleanValue() && !this.f11050w;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        return this.f11047t;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() throws IOException {
        if (!this.f11046s) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f11046s = false;
        this.f11047t = null;
        InputStream inputStream = this.f11045q;
        if (inputStream == null) {
            this.f11041b.zzd();
        } else {
            y3.c.b(inputStream);
            this.f11045q = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }
}
