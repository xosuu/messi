package com.google.android.gms.ads;

import a4.b;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.xq;
import p.a;
import p.e;
import p.g;

/* JADX INFO: loaded from: classes.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    public static void disableMediationAdapterInitialization(Context context) {
        zzej.zzf().zzl(context);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzej.zzf().zze();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzej.zzf().zzc();
    }

    public static VersionInfo getVersion() {
        zzej.zzf();
        String[] strArrSplit = TextUtils.split("23.3.0", "\\.");
        if (strArrSplit.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    public static void initialize(Context context) {
        zzej.zzf().zzm(context, null, null);
    }

    public static void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzej.zzf().zzp(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(Context context, String str) {
        zzej.zzf().zzq(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z9) {
        return zzej.zzf().zzx(z9);
    }

    public static g registerCustomTabsSession(Context context, e eVar, String str, a aVar) {
        zzej.zzf();
        z3.a.j("#008 Must be called on the main UI thread.");
        ut utVarD = xq.d(context);
        if (utVarD == null) {
            zzm.zzg("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (g) b.a0(utVarD.zze(new b(context), new b(eVar), str, new b(aVar)));
        } catch (RemoteException | IllegalArgumentException e10) {
            zzm.zzh("Unable to register custom tabs session. Error: ", e10);
            return null;
        }
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzej.zzf().zzr(cls);
    }

    public static void registerWebView(WebView webView) {
        zzej.zzf();
        z3.a.j("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzm.zzg("The webview to be registered cannot be null.");
            return;
        }
        ut utVarD = xq.d(webView.getContext());
        if (utVarD == null) {
            zzm.zzg("Internal error, query info generator is null.");
            return;
        }
        try {
            utVarD.zzj(new b(webView));
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    public static void setAppMuted(boolean z9) {
        zzej.zzf().zzs(z9);
    }

    public static void setAppVolume(float f10) {
        zzej.zzf().zzt(f10);
    }

    private static void setPlugin(String str) {
        zzej.zzf().zzu(str);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzej.zzf().zzv(requestConfiguration);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzej.zzf().zzm(context, null, onInitializationCompleteListener);
    }
}
