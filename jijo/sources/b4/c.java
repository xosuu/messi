package b4;

import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1311c;

    public c() {
        this.f1309a = 0;
        this.f1310b = 0;
        this.f1311c = 0;
    }

    public static c a(zzq zzqVar) {
        return zzqVar.zzd ? new c(3, 0, 0, 3) : zzqVar.zzi ? new c(2, 0, 0, 3) : zzqVar.zzh ? new c(0, 0, 0, 3) : new c(1, zzqVar.zzf, zzqVar.zzc, 3);
    }

    public final boolean b() {
        return this.f1309a == 3;
    }

    public c(int i10, int i11, int i12, int i13) {
        if (i13 != 4) {
            this.f1309a = i10;
            this.f1311c = i11;
            this.f1310b = i12;
        } else {
            this.f1309a = i10;
            this.f1310b = i11;
            this.f1311c = i12;
        }
    }
}
