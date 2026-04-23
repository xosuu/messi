package p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16159b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f16160d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f16161f;

    public /* synthetic */ b(d dVar, String str, Bundle bundle, int i10) {
        this.f16158a = i10;
        this.f16161f = dVar;
        this.f16159b = str;
        this.f16160d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16158a;
        Bundle bundle = this.f16160d;
        String str = this.f16159b;
        d dVar = this.f16161f;
        switch (i10) {
            case 0:
                dVar.f16168b.a(bundle, str);
                break;
            default:
                dVar.f16168b.e(bundle, str);
                break;
        }
    }
}
