package p;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.qg;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f16167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f16168b;

    public d(qg qgVar) {
        this.f16168b = qgVar;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.f16167a = new Handler(Looper.getMainLooper());
    }
}
