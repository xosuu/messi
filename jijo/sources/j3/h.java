package j3;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes.dex */
public final class h extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzq f14323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzaw f14325e;

    public h(zzaw zzawVar, Context context, zzq zzqVar, String str) {
        this.f14322b = context;
        this.f14323c = zzqVar;
        this.f14324d = str;
        this.f14325e = zzawVar;
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.a(this.f14322b, "search");
        return new zzew();
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        return zzceVar.zzf(new a4.b(this.f14322b), this.f14323c, this.f14324d, 242402000);
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f14325e.f1956a.zza(this.f14322b, this.f14323c, this.f14324d, null, 3);
    }
}
