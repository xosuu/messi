package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ok implements wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7595b;

    public /* synthetic */ ok(int i10, Object obj) {
        this.f7594a = i10;
        this.f7595b = obj;
    }

    private final void a(Object obj, Map map) {
        fx fxVar = (fx) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            zzm.zzh("Fail to parse float", e10);
        }
        yk ykVar = (yk) this.f7595b;
        synchronized (ykVar) {
            ykVar.f10919a = zEquals;
            ykVar.f10922d.set(true);
        }
        ((yk) this.f7595b).b(f10, zEquals2);
        fxVar.l(zEquals);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(java.util.Map r10) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ok.c(java.util.Map):void");
    }

    @Override // com.google.android.gms.internal.ads.wk
    public final void b(Object obj, Map map) {
        Bundle bundleZza = null;
        bundleZza = null;
        zzbvzVar = null;
        zzbvz zzbvzVar = null;
        switch (this.f7594a) {
            case 0:
                pk pkVar = (pk) this.f7595b;
                if (pkVar == null) {
                    return;
                }
                String str = (String) map.get("name");
                if (str == null) {
                    zzm.zzi("Ad metadata with no name parameter.");
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                if (map.containsKey("info")) {
                    try {
                        bundleZza = zzbs.zza(new JSONObject((String) map.get("info")));
                    } catch (JSONException e10) {
                        zzm.zzh("Failed to convert ad metadata to JSON.", e10);
                    }
                }
                if (bundleZza == null) {
                    zzm.zzg("Failed to convert ad metadata to Bundle.");
                    return;
                } else {
                    pkVar.n(bundleZza, str);
                    return;
                }
            case 1:
                String str2 = (String) map.get("name");
                if (str2 == null) {
                    zzm.zzj("App event with no name parameter.");
                    return;
                } else {
                    ((qk) this.f7595b).a(str2, (String) map.get("info"));
                    return;
                }
            case 2:
                a(obj, map);
                return;
            case 3:
                c(map);
                return;
            case 4:
                String str3 = (String) map.get("action");
                boolean zEquals = "grant".equals(str3);
                Object obj2 = this.f7595b;
                if (!zEquals) {
                    if ("video_start".equals(str3)) {
                        ((fl) obj2).zzc();
                        return;
                    } else {
                        if ("video_complete".equals(str3)) {
                            ((fl) obj2).zzb();
                            return;
                        }
                        return;
                    }
                }
                try {
                    int i10 = Integer.parseInt((String) map.get("amount"));
                    String str4 = (String) map.get("type");
                    if (!TextUtils.isEmpty(str4)) {
                        zzbvzVar = new zzbvz(str4, i10);
                    }
                } catch (NumberFormatException e11) {
                    zzm.zzk("Unable to parse reward amount.", e11);
                }
                ((fl) obj2).e0(zzbvzVar);
                return;
            case 5:
                if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
                    return;
                }
                zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
                if (map.containsKey("title")) {
                    intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
                }
                try {
                    zzu.zzp();
                    zzt.zzT((Context) this.f7595b, intent);
                    return;
                } catch (RuntimeException e12) {
                    zzm.zzk("Failed to open Share Sheet", e12);
                    zzu.zzo().i("ShareSheetGmsgHandler.onGmsg", e12);
                    return;
                }
            case 6:
                if (map != null) {
                    String str5 = (String) map.get("height");
                    if (TextUtils.isEmpty(str5)) {
                        return;
                    }
                    try {
                        int i11 = Integer.parseInt(str5);
                        synchronized (((px) this.f7595b)) {
                            try {
                                Object obj3 = this.f7595b;
                                px pxVar = (px) obj3;
                                if (pxVar.T != i11) {
                                    pxVar.T = i11;
                                    ((px) obj3).requestLayout();
                                }
                            } finally {
                            }
                            break;
                        }
                        return;
                    } catch (Exception e13) {
                        zzm.zzk("Exception occurred while getting webview content height", e13);
                        return;
                    }
                }
                return;
            default:
                ((ea0) this.f7595b).f3888b.b(map);
                return;
        }
    }
}
