package b2;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public interface p {
    WebViewProviderBoundaryInterface createWebView(WebView webView);

    String[] e();

    StaticsBoundaryInterface getStatics();
}
