package n3;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzq;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.hd0;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.nu;
import com.google.android.gms.internal.ads.pr0;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.ads.vt0;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.zzaup;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n3.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f15921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y9 f15922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pr0 f15923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hd0 f15925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mu f15927h = nu.f7387e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final vt0 f15928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zze f15929j;

    public a(WebView webView, y9 y9Var, hd0 hd0Var, vt0 vt0Var, pr0 pr0Var, zze zzeVar) {
        this.f15921b = webView;
        Context context = webView.getContext();
        this.f15920a = context;
        this.f15922c = y9Var;
        this.f15925f = hd0Var;
        eg.a(context);
        this.f15924e = ((Integer) zzba.zzc().a(eg.I8)).intValue();
        this.f15926g = ((Boolean) zzba.zzc().a(eg.J8)).booleanValue();
        this.f15928i = vt0Var;
        this.f15923d = pr0Var;
        this.f15929j = zzeVar;
    }

    @JavascriptInterface
    @TargetApi(sf.zzm)
    public String getClickSignals(String str) {
        try {
            ((y3.b) zzu.zzB()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZze = this.f15922c.f10801b.zze(this.f15920a, str, this.f15921b);
            if (this.f15926g) {
                ((y3.b) zzu.zzB()).getClass();
                zzq.zzd(this.f15925f, null, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZze;
        } catch (RuntimeException e10) {
            zzm.zzh("Exception getting click signals. ", e10);
            zzu.zzo().i("TaggingLibraryJsInterface.getClickSignals", e10);
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @JavascriptInterface
    @TargetApi(sf.zzm)
    public String getClickSignalsWithTimeout(final String str, int i10) {
        if (i10 <= 0) {
            zzm.zzg("Invalid timeout for getting click signals. Timeout=" + i10);
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            return (String) nu.f7383a.b(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i10, this.f15924e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzm.zzh("Exception getting click signals with timeout. ", e10);
            zzu.zzo().i("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e10);
            return e10 instanceof TimeoutException ? "17" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @JavascriptInterface
    @TargetApi(sf.zzm)
    public String getQueryInfo() {
        zzu.zzp();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final d dVar = new d(this, string);
        if (((Boolean) qh.f8178a.k()).booleanValue()) {
            this.f15929j.zzg(this.f15921b, dVar);
        } else {
            if (((Boolean) zzba.zzc().a(eg.L8)).booleanValue()) {
                this.f15927h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbc
                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar = this.zza;
                        Bundle bundle2 = bundle;
                        QueryInfoGenerationCallback queryInfoGenerationCallback = dVar;
                        aVar.getClass();
                        com.google.android.gms.ads.internal.util.zzab zzabVarZzq = com.google.android.gms.ads.internal.zzu.zzq();
                        Context context = aVar.f15920a;
                        CookieManager cookieManagerZza = zzabVarZzq.zza(context);
                        bundle2.putBoolean("accept_3p_cookie", cookieManagerZza != null ? cookieManagerZza.acceptThirdPartyCookies(aVar.f15921b) : false);
                        QueryInfo.generate(context, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle2).build(), queryInfoGenerationCallback);
                    }
                });
            } else {
                QueryInfo.generate(this.f15920a, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), dVar);
            }
        }
        return string;
    }

    @JavascriptInterface
    @TargetApi(sf.zzm)
    public String getViewSignals() {
        try {
            ((y3.b) zzu.zzB()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzh = this.f15922c.f10801b.zzh(this.f15920a, this.f15921b, null);
            if (this.f15926g) {
                ((y3.b) zzu.zzB()).getClass();
                zzq.zzd(this.f15925f, null, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzh;
        } catch (RuntimeException e10) {
            zzm.zzh("Exception getting view signals. ", e10);
            zzu.zzo().i("TaggingLibraryJsInterface.getViewSignals", e10);
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @JavascriptInterface
    @TargetApi(sf.zzm)
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            zzm.zzg("Invalid timeout for getting view signals. Timeout=" + i10);
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            return (String) nu.f7383a.b(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i10, this.f15924e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzm.zzh("Exception getting view signals with timeout. ", e10);
            zzu.zzo().i("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e10);
            return e10 instanceof TimeoutException ? "17" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @JavascriptInterface
    @TargetApi(sf.zzm)
    public void recordClick(final String str) {
        if (!((Boolean) zzba.zzc().a(eg.N8)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        nu.f7383a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzba
            @Override // java.lang.Runnable
            public final void run() {
                pr0 pr0Var;
                a aVar = this.zza;
                String str2 = str;
                aVar.getClass();
                Uri uriA = Uri.parse(str2);
                try {
                    boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.ab)).booleanValue();
                    WebView webView = aVar.f15921b;
                    Context context = aVar.f15920a;
                    uriA = (!zBooleanValue || (pr0Var = aVar.f15923d) == null) ? aVar.f15922c.a(uriA, context, webView, null) : pr0Var.a(uriA, context, webView, null);
                } catch (zzaup e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to append the click signal to URL: ", e10);
                    com.google.android.gms.ads.internal.zzu.zzo().i("TaggingLibraryJsInterface.recordClick", e10);
                }
                aVar.f15928i.a(uriA.toString(), null);
            }
        });
    }

    @JavascriptInterface
    @TargetApi(sf.zzm)
    public void reportTouchEvent(String str) {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i10 = jSONObject.getInt("x");
            i11 = jSONObject.getInt("y");
            i12 = jSONObject.getInt("duration_ms");
            f10 = (float) jSONObject.getDouble("force");
            i13 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e10) {
            e = e10;
        }
        try {
            this.f15922c.f10801b.zzk(MotionEvent.obtain(0L, i12, i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? -1 : 3 : 2 : 1 : 0, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e11) {
            e = e11;
            zzm.zzh("Failed to parse the touch string. ", e);
            zzu.zzo().i("TaggingLibraryJsInterface.reportTouchEvent", e);
        } catch (JSONException e12) {
            e = e12;
            zzm.zzh("Failed to parse the touch string. ", e);
            zzu.zzo().i("TaggingLibraryJsInterface.reportTouchEvent", e);
        }
    }
}
