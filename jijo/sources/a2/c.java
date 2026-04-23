package a2;

import android.content.pm.PackageInfo;
import android.net.Uri;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10a = 0;

    static {
        Uri.parse("*");
        Uri.parse(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }
}
