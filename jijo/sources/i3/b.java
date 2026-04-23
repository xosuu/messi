package i3;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.yg;
import com.google.android.gms.internal.ads.zzaup;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l.u;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14171a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14172b;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f14171a) {
            case 0:
                try {
                    zzt zztVar = (zzt) this.f14172b;
                    zztVar.f2243t = (y9) zztVar.f2238d.get(1000L, TimeUnit.MILLISECONDS);
                    break;
                } catch (InterruptedException e10) {
                    e = e10;
                    zzm.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                } catch (ExecutionException e11) {
                    e = e11;
                    zzm.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                } catch (TimeoutException e12) {
                    zzm.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e12);
                }
                zzt zztVar2 = (zzt) this.f14172b;
                zztVar2.getClass();
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("https://").appendEncodedPath((String) yg.f10873d.k());
                u uVar = zztVar2.f2240h;
                builder.appendQueryParameter("query", (String) uVar.f15009f);
                builder.appendQueryParameter("pubId", (String) uVar.f15007b);
                builder.appendQueryParameter("mappver", (String) uVar.f15011q);
                Map map = (Map) uVar.f15008d;
                for (String str : map.keySet()) {
                    builder.appendQueryParameter(str, (String) map.get(str));
                }
                Uri uriBuild = builder.build();
                y9 y9Var = zztVar2.f2243t;
                if (y9Var != null) {
                    try {
                        uriBuild = y9.d(uriBuild, y9Var.f10801b.zzg(zztVar2.f2239f));
                    } catch (zzaup e13) {
                        zzm.zzk("Unable to process ad data", e13);
                    }
                    break;
                }
                return fb1.x(zztVar2.zzq(), "#", uriBuild.getEncodedQuery());
            default:
                ((j9.a) this.f14172b).g();
                return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        switch (this.f14171a) {
            case 0:
                String str = (String) obj;
                WebView webView = ((zzt) this.f14172b).f2241q;
                if (webView != null && str != null) {
                    webView.loadUrl(str);
                    break;
                }
                break;
            default:
                ((j9.a) this.f14172b).d();
                break;
        }
    }

    public b(j9.a aVar) {
        this.f14172b = aVar;
    }
}
