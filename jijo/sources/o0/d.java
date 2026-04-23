package o0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.google.android.gms.internal.ads.rk1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentInfo.Builder f16018a;

    public d(ClipData clipData, int i10) {
        this.f16018a = rk1.k(clipData, i10);
    }

    @Override // o0.e
    public final h a() {
        return new h(new k.q(this.f16018a.build()));
    }

    @Override // o0.e
    public final void b(Bundle bundle) {
        this.f16018a.setExtras(bundle);
    }

    @Override // o0.e
    public final void c(Uri uri) {
        this.f16018a.setLinkUri(uri);
    }

    @Override // o0.e
    public final void e(int i10) {
        this.f16018a.setFlags(i10);
    }
}
