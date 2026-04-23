package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzu;
import java.math.BigInteger;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ju implements cc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzg f6082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iu f6083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hu f6084d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6081a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f6085e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f6086f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6087g = false;

    public ju(String str, zzj zzjVar) {
        this.f6084d = new hu(str, zzjVar);
        this.f6082b = zzjVar;
        iu iuVar = new iu();
        iuVar.f5698a = BigInteger.ONE;
        iuVar.f5699b = "0";
        this.f6083c = iuVar;
    }

    public final void a(bu buVar) {
        synchronized (this.f6081a) {
            this.f6085e.add(buVar);
        }
    }

    public final void b() {
        synchronized (this.f6081a) {
            this.f6084d.c();
        }
    }

    public final void c() {
        synchronized (this.f6081a) {
            this.f6084d.d();
        }
    }

    public final void d() {
        synchronized (this.f6081a) {
            this.f6084d.g();
        }
    }

    public final void e() {
        synchronized (this.f6081a) {
            this.f6084d.g();
        }
    }

    public final void f(zzl zzlVar, long j10) {
        synchronized (this.f6081a) {
            this.f6084d.e(zzlVar, j10);
        }
    }

    public final void g(HashSet hashSet) {
        synchronized (this.f6081a) {
            this.f6085e.addAll(hashSet);
        }
    }

    @Override // com.google.android.gms.internal.ads.cc
    public final void zza(boolean z9) {
        ((y3.b) zzu.zzB()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        hu huVar = this.f6084d;
        zzg zzgVar = this.f6082b;
        if (!z9) {
            zzgVar.zzu(jCurrentTimeMillis);
            zzgVar.zzL(huVar.f5394d);
            return;
        }
        if (jCurrentTimeMillis - zzgVar.zzd() > ((Long) zzba.zzc().a(eg.K0)).longValue()) {
            huVar.f5394d = -1;
        } else {
            huVar.f5394d = zzgVar.zzc();
        }
        this.f6087g = true;
    }
}
