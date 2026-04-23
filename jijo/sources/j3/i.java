package j3;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.rn;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzq f14327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn f14329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzaw f14330f;

    public i(zzaw zzawVar, Context context, zzq zzqVar, String str, rn rnVar) {
        this.f14326b = context;
        this.f14327c = zzqVar;
        this.f14328d = str;
        this.f14329e = rnVar;
        this.f14330f = zzawVar;
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.a(this.f14326b, "interstitial");
        return new zzew();
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        return zzceVar.zze(new a4.b(this.f14326b), this.f14327c, this.f14328d, this.f14329e, 242402000);
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f14330f.f1956a.zza(this.f14326b, this.f14327c, this.f14328d, this.f14329e, 2);
    }
}
