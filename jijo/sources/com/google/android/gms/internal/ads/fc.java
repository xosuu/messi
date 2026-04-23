package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fc extends Thread {
    public final boolean A;
    public final boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4449b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4450d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xg f4451f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4452h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4453q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f4455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f4456u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f4457v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f4458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f4459x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f4460y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f4461z;

    public fc() {
        xg xgVar = new xg(3, 0);
        this.f4448a = false;
        this.f4449b = false;
        this.f4451f = xgVar;
        this.f4450d = new Object();
        this.f4453q = ((Long) ch.f3274d.k()).intValue();
        this.f4454s = ((Long) ch.f3271a.k()).intValue();
        this.f4455t = ((Long) ch.f3275e.k()).intValue();
        this.f4456u = ((Long) ch.f3273c.k()).intValue();
        this.f4457v = ((Integer) zzba.zzc().a(eg.L)).intValue();
        this.f4458w = ((Integer) zzba.zzc().a(eg.M)).intValue();
        this.f4459x = ((Integer) zzba.zzc().a(eg.N)).intValue();
        this.f4452h = ((Long) ch.f3276f.k()).intValue();
        this.f4460y = (String) zzba.zzc().a(eg.P);
        this.f4461z = ((Boolean) zzba.zzc().a(eg.Q)).booleanValue();
        this.A = ((Boolean) zzba.zzc().a(eg.R)).booleanValue();
        this.B = ((Boolean) zzba.zzc().a(eg.S)).booleanValue();
        setName("ContentFetchTask");
    }

    public final ac a() {
        ac acVar;
        xg xgVar = this.f4451f;
        boolean z9 = this.B;
        synchronized (xgVar.f10550f) {
            try {
                acVar = null;
                if (((List) xgVar.f10549d).isEmpty()) {
                    zzm.zze("Queue empty");
                } else {
                    int i10 = 0;
                    if (((List) xgVar.f10549d).size() >= 2) {
                        int i11 = Integer.MIN_VALUE;
                        int i12 = 0;
                        for (ac acVar2 : (List) xgVar.f10549d) {
                            int i13 = acVar2.f2649n;
                            if (i13 > i11) {
                                i10 = i12;
                            }
                            int i14 = i13 > i11 ? i13 : i11;
                            if (i13 > i11) {
                                acVar = acVar2;
                            }
                            i12++;
                            i11 = i14;
                        }
                        ((List) xgVar.f10549d).remove(i10);
                    } else {
                        acVar = (ac) ((List) xgVar.f10549d).get(0);
                        if (z9) {
                            ((List) xgVar.f10549d).remove(0);
                        } else {
                            acVar.a();
                        }
                    }
                }
            } finally {
            }
        }
        return acVar;
    }

    public final o0.s b(View view, ac acVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    acVar.f(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new o0.s(1, 0, 0);
                }
            } else {
                if ((view instanceof WebView) && !(view instanceof fx)) {
                    WebView webView = (WebView) view;
                    synchronized (acVar.f2642g) {
                        acVar.f2648m++;
                    }
                    webView.post(new androidx.fragment.app.e(this, acVar, webView, globalVisibleRect));
                    return new o0.s(0, 1, 0);
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i10 = 0;
                    int i11 = 0;
                    for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                        o0.s sVarB = b(viewGroup.getChildAt(i12), acVar);
                        i10 += sVarB.f16064a;
                        i11 += sVarB.f16065b;
                    }
                    return new o0.s(i10, i11, 0);
                }
            }
        }
        return new o0.s(0, 0, 0);
    }

    public final void c() {
        synchronized (this.f4450d) {
            try {
                if (this.f4448a) {
                    zzm.zze("Content hash thread already started, quitting...");
                } else {
                    this.f4448a = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f4450d) {
            this.f4449b = true;
            zzm.zze("ContentFetchThread: paused, pause = true");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzu.zzb().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zze("ContentFetchThread: no activity. Sleeping.");
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        com.google.android.gms.ads.internal.zzu.zzo().i("ContentFetchTask.extractContent", r0);
        com.google.android.gms.ads.internal.util.client.zzm.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c8, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzu.zzo().i("ContentFetchTask.run", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df A[EXC_TOP_SPLITTER, LOOP:1: B:68:0x00df->B:73:0x00df, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fc.run():void");
    }
}
