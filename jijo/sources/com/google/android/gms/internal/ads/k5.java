package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class k5 implements p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f6180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ik0 f6181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b1 f6185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f6189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y1 f6190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6192n;

    public k5(String str, int i10, int i11) {
        this.f6179a = i11;
        if (i11 != 1) {
            d1 d1Var = new d1(new byte[NotificationCompat.FLAG_HIGH_PRIORITY], NotificationCompat.FLAG_HIGH_PRIORITY);
            this.f6180b = d1Var;
            this.f6181c = new ik0(d1Var.f3531c);
            this.f6186h = 0;
            this.f6192n = -9223372036854775807L;
            this.f6182d = str;
            this.f6183e = i10;
            return;
        }
        d1 d1Var2 = new d1(new byte[16], 16);
        this.f6180b = d1Var2;
        this.f6181c = new ik0(d1Var2.f3531c);
        this.f6186h = 0;
        this.f6187i = 0;
        this.f6188j = false;
        this.f6192n = -9223372036854775807L;
        this.f6182d = str;
        this.f6183e = i10;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void b(boolean z9) {
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03f4  */
    @Override // com.google.android.gms.internal.ads.p5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.ik0 r31) {
        /*
            Method dump skipped, instruction units count: 1278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k5.c(com.google.android.gms.internal.ads.ik0):void");
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void d(i0 i0Var, q2.d dVar) {
        switch (this.f6179a) {
            case 0:
                dVar.c();
                dVar.d();
                this.f6184f = dVar.f16416e;
                dVar.d();
                this.f6185g = i0Var.j(dVar.f16414c, 1);
                break;
            default:
                dVar.c();
                dVar.d();
                this.f6184f = dVar.f16416e;
                dVar.d();
                this.f6185g = i0Var.j(dVar.f16414c, 1);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void e(int i10, long j10) {
        switch (this.f6179a) {
            case 0:
                this.f6192n = j10;
                break;
            default:
                this.f6192n = j10;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void zze() {
        switch (this.f6179a) {
            case 0:
                this.f6186h = 0;
                this.f6187i = 0;
                this.f6188j = false;
                this.f6192n = -9223372036854775807L;
                break;
            default:
                this.f6186h = 0;
                this.f6187i = 0;
                this.f6188j = false;
                this.f6192n = -9223372036854775807L;
                break;
        }
    }
}
