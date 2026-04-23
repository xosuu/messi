package androidx.fragment.app;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.ac;
import com.google.android.gms.internal.ads.fc;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f758a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f759b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f760d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f761f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f762h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f763q;

    public e(fc fcVar, final ac acVar, final WebView webView, final boolean z9) {
        this.f761f = acVar;
        this.f762h = webView;
        this.f759b = z9;
        this.f763q = fcVar;
        this.f760d = new ValueCallback() { // from class: com.google.android.gms.internal.ads.ec
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                fc fcVar2 = (fc) this.f3899a.f763q;
                ac acVar2 = acVar;
                WebView webView2 = webView;
                String str = (String) obj;
                boolean z10 = z9;
                fcVar2.getClass();
                synchronized (acVar2.f2642g) {
                    acVar2.f2648m--;
                }
                try {
                    if (!TextUtils.isEmpty(str)) {
                        String strOptString = new JSONObject(str).optString("text");
                        if (fcVar2.f4461z || TextUtils.isEmpty(webView2.getTitle())) {
                            acVar2.b(strOptString, z10, webView2.getX(), webView2.getY(), webView2.getWidth(), webView2.getHeight());
                        } else {
                            acVar2.b(webView2.getTitle() + "\n" + strOptString, z10, webView2.getX(), webView2.getY(), webView2.getWidth(), webView2.getHeight());
                        }
                    }
                    if (acVar2.e()) {
                        fcVar2.f4451f.i(acVar2);
                    }
                } catch (JSONException unused) {
                    zzm.zze("Json string may be malformed.");
                } catch (Throwable th) {
                    zzm.zzf("Failed to get webview content.", th);
                    zzu.zzo().i("ContentFetchTask.processWebViewContent", th);
                }
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f758a;
        Object obj = this.f760d;
        switch (i10) {
            case 0:
                q0.a(((b1) obj).f734c, ((b1) this.f761f).f734c, this.f759b);
                break;
            default:
                Object obj2 = this.f762h;
                if (((WebView) obj2).getSettings().getJavaScriptEnabled()) {
                    try {
                        ((WebView) obj2).evaluateJavascript("(function() { return  {text:document.body.innerText}})();", (ValueCallback) obj);
                    } catch (Throwable unused) {
                        ((ValueCallback) obj).onReceiveValue(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                }
                break;
        }
    }

    public e(h hVar, b1 b1Var, b1 b1Var2, boolean z9, s.b bVar) {
        this.f763q = hVar;
        this.f760d = b1Var;
        this.f761f = b1Var2;
        this.f759b = z9;
        this.f762h = bVar;
    }
}
