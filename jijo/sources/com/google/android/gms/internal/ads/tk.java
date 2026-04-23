package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk implements wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9181b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9182d;

    public /* synthetic */ tk(Object obj, int i10, Object obj2) {
        this.f9180a = i10;
        this.f9181b = obj;
        this.f9182d = obj2;
    }

    private final void a(Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "\n".concat(String.valueOf(str4));
        synchronized (this.f9181b) {
            try {
                el elVar = (el) ((Map) this.f9182d).remove(str);
                if (elVar == null) {
                    zzm.zzj("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    elVar.zza(str3 + strConcat);
                    return;
                }
                if (str5 == null) {
                    elVar.a(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (zze.zzc()) {
                        zze.zza("Result GMSG: " + jSONObject.toString(2));
                    }
                    elVar.a(jSONObject);
                } catch (JSONException e10) {
                    elVar.zza(e10.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    @Override // com.google.android.gms.internal.ads.wk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r11, java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tk.b(java.lang.Object, java.util.Map):void");
    }

    public final void c(String str, el elVar) {
        synchronized (this.f9181b) {
            ((Map) this.f9182d).put(str, elVar);
        }
    }

    public tk() {
        this.f9180a = 2;
        this.f9181b = new Object();
        this.f9182d = new HashMap();
    }
}
