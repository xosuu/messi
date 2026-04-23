package j3;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.pn;
import com.google.android.gms.internal.ads.rn;

/* JADX INFO: loaded from: classes.dex */
public final class f extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzq f14313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn f14315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzaw f14316f;

    public f(zzaw zzawVar, Context context, zzq zzqVar, String str, pn pnVar) {
        this.f14312b = context;
        this.f14313c = zzqVar;
        this.f14314d = str;
        this.f14315e = pnVar;
        this.f14316f = zzawVar;
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.a(this.f14312b, "banner");
        return new zzew();
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        return zzceVar.zzd(new a4.b(this.f14312b), this.f14313c, this.f14314d, this.f14315e, 242402000);
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f14316f.f1956a.zza(this.f14312b, this.f14313c, this.f14314d, this.f14315e, 1);
    }
}
