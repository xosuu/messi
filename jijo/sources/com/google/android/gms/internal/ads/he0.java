package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class he0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5268g;

    public he0(int i10, int i11, String str, String str2, String str3, String str4, boolean z9) {
        this.f5262a = str;
        this.f5263b = str2;
        this.f5264c = str3;
        this.f5265d = i10;
        this.f5266e = str4;
        this.f5267f = i11;
        this.f5268g = z9;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f5262a);
        jSONObject.put("version", this.f5264c);
        if (((Boolean) zzba.zzc().a(eg.f4169w8)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f5263b);
        }
        jSONObject.put(NotificationCompat.CATEGORY_STATUS, this.f5265d);
        jSONObject.put("description", this.f5266e);
        jSONObject.put("initializationLatencyMillis", this.f5267f);
        if (((Boolean) zzba.zzc().a(eg.f4179x8)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f5268g);
        }
        return jSONObject;
    }
}
