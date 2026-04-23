package n3;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.xg;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f15939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f15940b;

    public d(a aVar, String str) {
        this.f15939a = str;
        this.f15940b = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        long jLongValue;
        zzm.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[3];
        objArr[0] = this.f15939a;
        objArr[1] = str;
        xg xgVar = qh.f8178a;
        if (((Boolean) xgVar.k()).booleanValue()) {
            jLongValue = ((Long) zzba.zzc().a(eg.X8)).longValue();
        } else {
            jLongValue = 0;
        }
        objArr[2] = Long.valueOf(jLongValue);
        final String str2 = String.format(locale, "window.postMessage({'paw_id': '%1$s', 'error': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", objArr);
        boolean zBooleanValue = ((Boolean) xgVar.k()).booleanValue();
        a aVar = this.f15940b;
        if (!zBooleanValue) {
            aVar.f15921b.evaluateJavascript(str2, null);
            return;
        }
        try {
            aVar.f15927h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f15940b.f15921b.evaluateJavascript(str2, null);
                }
            });
        } catch (RuntimeException e10) {
            zzu.zzo().h("TaggingLibraryJsInterface.getQueryInfo.onFailure", e10);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        final String str;
        String str2 = this.f15939a;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", str2);
            jSONObject.put("signal", query);
            jSONObject.put("sdk_ttl_ms", ((Boolean) qh.f8178a.k()).booleanValue() ? ((Long) zzba.zzc().a(eg.X8)).longValue() : 0L);
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = str2;
            objArr[1] = queryInfo.getQuery();
            objArr[2] = Long.valueOf(((Boolean) qh.f8178a.k()).booleanValue() ? ((Long) zzba.zzc().a(eg.X8)).longValue() : 0L);
            str = String.format(locale, "window.postMessage({'paw_id': '%1$s', 'signal': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", objArr);
        }
        boolean zBooleanValue = ((Boolean) qh.f8178a.k()).booleanValue();
        a aVar = this.f15940b;
        if (!zBooleanValue) {
            aVar.f15921b.evaluateJavascript(str, null);
            return;
        }
        try {
            aVar.f15927h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbe
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f15940b.f15921b.evaluateJavascript(str, null);
                }
            });
        } catch (RuntimeException e10) {
            zzu.zzo().h("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e10);
        }
    }
}
