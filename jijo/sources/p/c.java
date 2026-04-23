package p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f16163b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f16164d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f16165f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f16166h;

    public c(d dVar, int i10, Uri uri, boolean z9, Bundle bundle) {
        this.f16166h = dVar;
        this.f16162a = i10;
        this.f16163b = uri;
        this.f16164d = z9;
        this.f16165f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16166h.f16168b.f(this.f16162a, this.f16163b, this.f16164d, this.f16165f);
    }
}
