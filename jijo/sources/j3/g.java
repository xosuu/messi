package j3;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.rn;

/* JADX INFO: loaded from: classes.dex */
public final class g extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzq f14318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn f14320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzaw f14321f;

    public g(zzaw zzawVar, Context context, zzq zzqVar, String str, rn rnVar) {
        this.f14317b = context;
        this.f14318c = zzqVar;
        this.f14319d = str;
        this.f14320e = rnVar;
        this.f14321f = zzawVar;
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.a(this.f14317b, "app_open");
        return new zzew();
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        return zzceVar.zzc(new a4.b(this.f14317b), this.f14318c, this.f14319d, this.f14320e, 242402000);
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f14321f.f1956a.zza(this.f14317b, this.f14318c, this.f14319d, this.f14320e, 4);
    }
}
