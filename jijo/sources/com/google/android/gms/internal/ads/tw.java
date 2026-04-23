package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class tw implements dj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq1 f9290a = new iq1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9291b = 15000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9292c = 30000000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9293d = 2500000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9294e = 5000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9296g;

    @Override // com.google.android.gms.internal.ads.dj1
    public final boolean a(cj1 cj1Var) {
        long j10 = cj1Var.f3306d ? this.f9294e : this.f9293d;
        return j10 <= 0 || cj1Var.f3304b >= j10;
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final void b(vk1 vk1Var) {
        this.f9295f = 0;
        this.f9296g = false;
        iq1 iq1Var = this.f9290a;
        synchronized (iq1Var) {
            iq1Var.f(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final boolean c(cj1 cj1Var) {
        int i10;
        long j10 = cj1Var.f3304b;
        boolean z9 = true;
        char c10 = j10 > this.f9292c ? (char) 0 : j10 < this.f9291b ? (char) 2 : (char) 1;
        iq1 iq1Var = this.f9290a;
        synchronized (iq1Var) {
            i10 = iq1Var.f5676b * 65536;
        }
        int i11 = this.f9295f;
        if (c10 != 2 && (c10 != 1 || !this.f9296g || i10 >= i11)) {
            z9 = false;
        }
        this.f9296g = z9;
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final void d(vk1 vk1Var) {
        this.f9295f = 0;
        this.f9296g = false;
        iq1 iq1Var = this.f9290a;
        synchronized (iq1Var) {
            iq1Var.f(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final void e(vk1 vk1Var, vh1[] vh1VarArr, cq1[] cq1VarArr) {
        int i10 = 0;
        this.f9295f = 0;
        while (true) {
            int length = vh1VarArr.length;
            if (i10 >= 2) {
                this.f9290a.f(this.f9295f);
                return;
            } else {
                if (cq1VarArr[i10] != null) {
                    this.f9295f += vh1VarArr[i10].f9849b != 1 ? 131072000 : 13107200;
                }
                i10++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final void f(vk1 vk1Var) {
        this.f9295f = 0;
        this.f9296g = false;
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final long zzb() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.dj1
    public final iq1 zzj() {
        return this.f9290a;
    }
}
