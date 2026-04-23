package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9620b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f9621d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9622f;

    public /* synthetic */ uv(Object obj, boolean z9, long j10, int i10) {
        this.f9619a = i10;
        this.f9622f = obj;
        this.f9620b = z9;
        this.f9621d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9619a;
        boolean z9 = this.f9620b;
        long j10 = this.f9621d;
        Object obj = this.f9622f;
        switch (i10) {
            case 0:
                ((xv) obj).f10655d.t(j10, z9);
                break;
            case 1:
                ((pv) obj).t(j10, z9);
                break;
            default:
                ((ix) obj).f5709a.t(j10, z9);
                break;
        }
    }
}
