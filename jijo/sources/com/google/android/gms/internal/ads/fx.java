package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzm;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface fx extends zza, q70, hm, ux, mm, wb, zzm, pv, xx {
    boolean A();

    void B(zzc zzcVar, boolean z9, boolean z10);

    void C(boolean z9, int i10, String str, boolean z10, boolean z11);

    void D(boolean z9);

    void F();

    void G(Context context);

    boolean H(int i10, boolean z9);

    gi I();

    boolean K();

    void M(String str, wk wkVar);

    void N();

    void P(boolean z9);

    boolean Q();

    void R();

    void W(int i10);

    boolean Y();

    void a0();

    void b0(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    @Override // com.google.android.gms.internal.ads.pv
    void c(rx rxVar);

    boolean c0();

    boolean canGoBack();

    @Override // com.google.android.gms.internal.ads.xx
    View d();

    String d0();

    void destroy();

    @Override // com.google.android.gms.internal.ads.pv
    b4.c e();

    @Override // com.google.android.gms.internal.ads.pv
    void f(String str, lw lwVar);

    void f0(wp0 wp0Var);

    ix g();

    void g0(boolean z9);

    @Override // com.google.android.gms.internal.ads.ux, com.google.android.gms.internal.ads.pv
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void h0(int i10, String str, String str2, boolean z9, boolean z10);

    fr0 i();

    void i0(p80 p80Var);

    boolean isAttachedToWindow();

    void j0(jb0 jb0Var);

    void k0(zh0 zh0Var);

    void l(boolean z9);

    void l0(String str, wk wkVar);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    mc m();

    void m0(String str, String str2);

    void measure(int i10, int i11);

    void n0();

    void o(boolean z9);

    ArrayList o0();

    void onPause();

    void onResume();

    void p(fr0 fr0Var, hr0 hr0Var);

    void p0(boolean z9);

    WebView q();

    void q0(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void r(int i10, boolean z9, boolean z10);

    void r0();

    com.google.android.gms.ads.internal.overlay.zzm s();

    void s0(String str, String str2);

    @Override // com.google.android.gms.internal.ads.pv
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void t0(b4.c cVar);

    com.google.android.gms.ads.internal.overlay.zzm u();

    boolean u0();

    void v(int i10);

    y9 w();

    void x(String str, i10 i10Var);

    void y(yh0 yh0Var);

    Context zzE();

    WebViewClient zzH();

    yh0 zzP();

    zh0 zzQ();

    hr0 zzR();

    pr0 zzS();

    n5.a zzT();

    void zzX();

    void zzY();

    void zzaa();

    @Override // com.google.android.gms.internal.ads.ux, com.google.android.gms.internal.ads.pv
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.pv
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.pv
    p80 zzm();

    @Override // com.google.android.gms.internal.ads.pv
    VersionInfoParcel zzn();

    @Override // com.google.android.gms.internal.ads.pv
    rx zzq();
}
