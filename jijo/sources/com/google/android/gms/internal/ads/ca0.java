package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbv;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ca0 implements wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3237a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ea0 f3238b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f3239d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WindowManager f3240f;

    public /* synthetic */ ca0(ea0 ea0Var, WindowManager windowManager, FrameLayout frameLayout) {
        this.f3238b = ea0Var;
        this.f3240f = windowManager;
        this.f3239d = frameLayout;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.da0] */
    @Override // com.google.android.gms.internal.ads.wk
    public final void b(Object obj, Map map) {
        int i10 = this.f3237a;
        final WindowManager windowManager = this.f3240f;
        final View view = this.f3239d;
        ea0 ea0Var = this.f3238b;
        switch (i10) {
            case 0:
                fx fxVar = (fx) obj;
                ea0Var.getClass();
                zzm.zze("Hide native ad policy validator overlay.");
                fxVar.d().setVisibility(8);
                if (fxVar.d().getWindowToken() != null) {
                    windowManager.removeView(fxVar.d());
                }
                fxVar.destroy();
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (ea0Var.f3889c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(ea0Var.f3889c);
                    break;
                }
                break;
            default:
                final fx fxVar2 = (fx) obj;
                ea0Var.getClass();
                fxVar2.g().f5715s = new p80(ea0Var, 21, map);
                if (map != null) {
                    Context context = view.getContext();
                    int iB = ea0.b(((Integer) zzba.zzc().a(eg.f4062l7)).intValue(), context, (String) map.get("validator_width"));
                    int iB2 = ea0.b(((Integer) zzba.zzc().a(eg.f4072m7)).intValue(), context, (String) map.get("validator_height"));
                    int iB3 = ea0.b(0, context, (String) map.get("validator_x"));
                    int iB4 = ea0.b(0, context, (String) map.get("validator_y"));
                    fxVar2.t0(new b4.c(1, iB, iB2, 3));
                    try {
                        fxVar2.q().getSettings().setUseWideViewPort(((Boolean) zzba.zzc().a(eg.f4082n7)).booleanValue());
                        fxVar2.q().getSettings().setLoadWithOverviewMode(((Boolean) zzba.zzc().a(eg.f4092o7)).booleanValue());
                        break;
                    } catch (NullPointerException unused) {
                    }
                    final WindowManager.LayoutParams layoutParamsZzb = zzbv.zzb();
                    layoutParamsZzb.x = iB3;
                    layoutParamsZzb.y = iB4;
                    windowManager.updateViewLayout(fxVar2.d(), layoutParamsZzb);
                    final String str = (String) map.get("orientation");
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect)) {
                        final int i11 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iB4;
                        ea0Var.f3889c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.da0
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final void onScrollChanged() {
                                Rect rect2 = new Rect();
                                if (view.getGlobalVisibleRect(rect2)) {
                                    fx fxVar3 = fxVar2;
                                    if (fxVar3.d().getWindowToken() == null) {
                                        return;
                                    }
                                    String str2 = str;
                                    boolean zEquals = "1".equals(str2);
                                    int i12 = i11;
                                    WindowManager.LayoutParams layoutParams = layoutParamsZzb;
                                    if (zEquals || "2".equals(str2)) {
                                        layoutParams.y = rect2.bottom - i12;
                                    } else {
                                        layoutParams.y = rect2.top - i12;
                                    }
                                    windowManager.updateViewLayout(fxVar3.d(), layoutParams);
                                }
                            }
                        };
                        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.addOnScrollChangedListener(ea0Var.f3889c);
                        }
                    }
                    String str2 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str2)) {
                        fxVar2.loadUrl(str2);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ca0(ea0 ea0Var, FrameLayout frameLayout, WindowManager windowManager) {
        this.f3238b = ea0Var;
        this.f3239d = frameLayout;
        this.f3240f = windowManager;
    }
}
