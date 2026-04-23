package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class ex extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx f4314a;

    public ex(nx nxVar) {
        this.f4314a = nxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof fx)) {
            return webView.getContext();
        }
        fx fxVar = (fx) webView;
        Activity activityZzi = fxVar.zzi();
        return activityZzi != null ? activityZzi : fxVar.getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[Catch: BadTokenException -> 0x0041, TryCatch #0 {BadTokenException -> 0x0041, blocks: (B:4:0x0008, B:6:0x000e, B:8:0x0016, B:10:0x001e, B:12:0x0024, B:16:0x0044, B:18:0x0055, B:19:0x009b), top: B:23:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[Catch: BadTokenException -> 0x0041, TRY_LEAVE, TryCatch #0 {BadTokenException -> 0x0041, blocks: (B:4:0x0008, B:6:0x000e, B:8:0x0016, B:10:0x001e, B:12:0x0024, B:16:0x0044, B:18:0x0055, B:19:0x009b), top: B:23:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, android.webkit.JsResult r11, android.webkit.JsPromptResult r12, boolean r13) {
        /*
            r5 = this;
            java.lang.String r0 = "window."
            r1 = 1
            r2 = 0
            com.google.android.gms.internal.ads.fx r3 = r5.f4314a
            if (r3 == 0) goto L44
            com.google.android.gms.internal.ads.ix r4 = r3.g()     // Catch: android.view.WindowManager.BadTokenException -> L41
            if (r4 == 0) goto L44
            com.google.android.gms.internal.ads.ix r4 = r3.g()     // Catch: android.view.WindowManager.BadTokenException -> L41
            com.google.android.gms.ads.internal.zzb r4 = r4.H     // Catch: android.view.WindowManager.BadTokenException -> L41
            if (r4 == 0) goto L44
            com.google.android.gms.internal.ads.ix r3 = r3.g()     // Catch: android.view.WindowManager.BadTokenException -> L41
            com.google.android.gms.ads.internal.zzb r3 = r3.H     // Catch: android.view.WindowManager.BadTokenException -> L41
            if (r3 == 0) goto L44
            boolean r4 = r3.zzc()     // Catch: android.view.WindowManager.BadTokenException -> L41
            if (r4 != 0) goto L44
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.view.WindowManager.BadTokenException -> L41
            r6.<init>(r0)     // Catch: android.view.WindowManager.BadTokenException -> L41
            r6.append(r7)     // Catch: android.view.WindowManager.BadTokenException -> L41
            java.lang.String r7 = "('"
            r6.append(r7)     // Catch: android.view.WindowManager.BadTokenException -> L41
            r6.append(r9)     // Catch: android.view.WindowManager.BadTokenException -> L41
            java.lang.String r7 = "')"
            r6.append(r7)     // Catch: android.view.WindowManager.BadTokenException -> L41
            java.lang.String r6 = r6.toString()     // Catch: android.view.WindowManager.BadTokenException -> L41
            r3.zzb(r6)     // Catch: android.view.WindowManager.BadTokenException -> L41
            return r2
        L41:
            r6 = move-exception
            goto Lc2
        L44:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.view.WindowManager.BadTokenException -> L41
            android.app.AlertDialog$Builder r7 = com.google.android.gms.ads.internal.util.zzt.zzK(r6)     // Catch: android.view.WindowManager.BadTokenException -> L41
            r7.setTitle(r8)     // Catch: android.view.WindowManager.BadTokenException -> L41
            r8 = 17039360(0x1040000, float:2.424457E-38)
            r0 = 17039370(0x104000a, float:2.42446E-38)
            if (r13 == 0) goto L9b
            android.widget.LinearLayout r11 = new android.widget.LinearLayout     // Catch: android.view.WindowManager.BadTokenException -> L41
            r11.<init>(r6)     // Catch: android.view.WindowManager.BadTokenException -> L41
            r11.setOrientation(r1)     // Catch: android.view.WindowManager.BadTokenException -> L41
            android.widget.TextView r13 = new android.widget.TextView     // Catch: android.view.WindowManager.BadTokenException -> L41
            r13.<init>(r6)     // Catch: android.view.WindowManager.BadTokenException -> L41
            r13.setText(r9)     // Catch: android.view.WindowManager.BadTokenException -> L41
            android.widget.EditText r9 = new android.widget.EditText     // Catch: android.view.WindowManager.BadTokenException -> L41
            r9.<init>(r6)     // Catch: android.view.WindowManager.BadTokenException -> L41
            r9.setText(r10)     // Catch: android.view.WindowManager.BadTokenException -> L41
            r11.addView(r13)     // Catch: android.view.WindowManager.BadTokenException -> L41
            r11.addView(r9)     // Catch: android.view.WindowManager.BadTokenException -> L41
            android.app.AlertDialog$Builder r6 = r7.setView(r11)     // Catch: android.view.WindowManager.BadTokenException -> L41
            com.google.android.gms.internal.ads.nh0 r7 = new com.google.android.gms.internal.ads.nh0     // Catch: android.view.WindowManager.BadTokenException -> L41
            r10 = 2
            r7.<init>(r12, r10, r9)     // Catch: android.view.WindowManager.BadTokenException -> L41
            android.app.AlertDialog$Builder r6 = r6.setPositiveButton(r0, r7)     // Catch: android.view.WindowManager.BadTokenException -> L41
            com.google.android.gms.internal.ads.lp r7 = new com.google.android.gms.internal.ads.lp     // Catch: android.view.WindowManager.BadTokenException -> L41
            r7.<init>(r1, r12)     // Catch: android.view.WindowManager.BadTokenException -> L41
            android.app.AlertDialog$Builder r6 = r6.setNegativeButton(r8, r7)     // Catch: android.view.WindowManager.BadTokenException -> L41
            com.google.android.gms.internal.ads.bx r7 = new com.google.android.gms.internal.ads.bx     // Catch: android.view.WindowManager.BadTokenException -> L41
            r7.<init>(r1, r12)     // Catch: android.view.WindowManager.BadTokenException -> L41
            android.app.AlertDialog$Builder r6 = r6.setOnCancelListener(r7)     // Catch: android.view.WindowManager.BadTokenException -> L41
            android.app.AlertDialog r6 = r6.create()     // Catch: android.view.WindowManager.BadTokenException -> L41
            r6.show()     // Catch: android.view.WindowManager.BadTokenException -> L41
            goto Lc7
        L9b:
            android.app.AlertDialog$Builder r6 = r7.setMessage(r9)     // Catch: android.view.WindowManager.BadTokenException -> L41
            com.google.android.gms.internal.ads.cx r7 = new com.google.android.gms.internal.ads.cx     // Catch: android.view.WindowManager.BadTokenException -> L41
            r7.<init>(r11, r1)     // Catch: android.view.WindowManager.BadTokenException -> L41
            android.app.AlertDialog$Builder r6 = r6.setPositiveButton(r0, r7)     // Catch: android.view.WindowManager.BadTokenException -> L41
            com.google.android.gms.internal.ads.cx r7 = new com.google.android.gms.internal.ads.cx     // Catch: android.view.WindowManager.BadTokenException -> L41
            r7.<init>(r11, r2)     // Catch: android.view.WindowManager.BadTokenException -> L41
            android.app.AlertDialog$Builder r6 = r6.setNegativeButton(r8, r7)     // Catch: android.view.WindowManager.BadTokenException -> L41
            com.google.android.gms.internal.ads.bx r7 = new com.google.android.gms.internal.ads.bx     // Catch: android.view.WindowManager.BadTokenException -> L41
            r7.<init>(r2, r11)     // Catch: android.view.WindowManager.BadTokenException -> L41
            android.app.AlertDialog$Builder r6 = r6.setOnCancelListener(r7)     // Catch: android.view.WindowManager.BadTokenException -> L41
            android.app.AlertDialog r6 = r6.create()     // Catch: android.view.WindowManager.BadTokenException -> L41
            r6.show()     // Catch: android.view.WindowManager.BadTokenException -> L41
            goto Lc7
        Lc2:
            java.lang.String r7 = "Fail to display Dialog."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r7, r6)
        Lc7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ex.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.webkit.JsResult, android.webkit.JsPromptResult, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof fx)) {
            zzm.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarS = ((fx) webView).s();
        if (zzmVarS == null) {
            zzm.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzmVarS.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        String strH = l.a0.h(l.a0.l("JS: ", strMessage, " (", strSourceId, ":"), consoleMessage.lineNumber(), ")");
        if (strH.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = dx.f3763a[consoleMessage.messageLevel().ordinal()];
        if (i10 == 1) {
            zzm.zzg(strH);
        } else if (i10 == 2) {
            zzm.zzj(strH);
        } else if (i10 == 3 || i10 == 4 || i10 != 5) {
            zzm.zzi(strH);
        } else {
            zzm.zze(strH);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z9, boolean z10, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        fx fxVar = this.f4314a;
        if (fxVar.zzH() != null) {
            webView2.setWebViewClient(fxVar.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        long j13 = 5242880 - j12;
        if (j13 <= 0) {
            quotaUpdater.updateQuota(j10);
            return;
        }
        if (j10 == 0) {
            if (j11 > j13 || j11 > 1048576) {
                j11 = 0;
            }
        } else if (j11 == 0) {
            j11 = Math.min(Math.min(131072L, j13) + j10, 1048576L);
        } else {
            if (j11 <= Math.min(1048576 - j10, j13)) {
                j10 += j11;
            }
            j11 = j10;
        }
        quotaUpdater.updateQuota(j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L29
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.internal.ads.fx r0 = r3.f4314a
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = com.google.android.gms.ads.internal.util.zzt.zzA(r1, r2)
            r2 = 1
            if (r1 != 0) goto L23
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzA(r0, r1)
            if (r0 == 0) goto L25
        L23:
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            r5.invoke(r4, r0, r2)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ex.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarS = this.f4314a.s();
        if (zzmVarS == null) {
            zzm.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzmVarS.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarS = this.f4314a.s();
        if (zzmVarS == null) {
            zzm.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzmVarS.zzC(view, customViewCallback);
            zzmVarS.zzA(i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
