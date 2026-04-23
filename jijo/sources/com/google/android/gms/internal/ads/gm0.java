package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gm0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4966a;

    @Override // com.google.android.gms.internal.ads.so0
    public final void a(Object obj) {
        switch (this.f4966a) {
            case 0:
                ((Bundle) obj).putString("ms", Integer.toString(17));
                break;
            case 1:
                ((Bundle) obj).putString("ms", null);
                break;
            case 2:
                break;
            case 3:
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
                break;
            case 4:
                break;
            default:
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
                } catch (JSONException unused) {
                    return;
                }
                break;
        }
    }
}
