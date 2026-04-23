package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jasypt.digest.StandardStringDigester;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class nx extends FrameLayout implements fx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx f7407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xq f7408b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f7409d;

    public nx(px pxVar) {
        super(pxVar.getContext());
        this.f7409d = new AtomicBoolean();
        this.f7407a = pxVar;
        this.f7408b = new xq(pxVar.f7982a.f3467c, this, this);
        addView(pxVar);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final boolean A() {
        return this.f7407a.A();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void B(zzc zzcVar, boolean z9, boolean z10) {
        this.f7407a.B(zzcVar, z9, z10);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void C(boolean z9, int i10, String str, boolean z10, boolean z11) {
        this.f7407a.C(z9, i10, str, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void D(boolean z9) {
        this.f7407a.D(z9);
    }

    @Override // com.google.android.gms.internal.ads.hm
    public final void E(JSONObject jSONObject, String str) {
        this.f7407a.E(jSONObject, str);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void F() {
        setBackgroundColor(0);
        this.f7407a.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void G(Context context) {
        this.f7407a.G(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.fx
    public final boolean H(int i10, boolean z9) {
        if (!this.f7409d.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzba.zzc().a(eg.D0)).booleanValue()) {
            return false;
        }
        fx fxVar = this.f7407a;
        if (fxVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) fxVar.getParent()).removeView((View) fxVar);
        }
        fxVar.H(i10, z9);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final gi I() {
        return this.f7407a.I();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void J() {
        this.f7407a.J();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final boolean K() {
        return this.f7407a.K();
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void L() {
        fx fxVar = this.f7407a;
        if (fxVar != null) {
            fxVar.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void M(String str, wk wkVar) {
        this.f7407a.M(str, wkVar);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void N() {
        this.f7407a.N();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final String O() {
        return this.f7407a.O();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void P(boolean z9) {
        this.f7407a.P(z9);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final boolean Q() {
        return this.f7407a.Q();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void R() {
        zh0 zh0VarZzQ;
        yh0 yh0VarZzP;
        TextView textView = new TextView(getContext());
        zzu.zzp();
        textView.setText(zzt.zzy());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        int i10 = 0;
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.C4)).booleanValue();
        fx fxVar = this.f7407a;
        if (zBooleanValue && (yh0VarZzP = fxVar.zzP()) != null) {
            synchronized (yh0VarZzP) {
                cu0 cu0Var = yh0VarZzP.f10888e;
                if (cu0Var != null) {
                    ((k70) zzu.zzA()).getClass();
                    k70.m(new vh0(cu0Var, 1, textView));
                }
            }
            return;
        }
        if (((Boolean) zzba.zzc().a(eg.B4)).booleanValue() && (zh0VarZzQ = fxVar.zzQ()) != null && ((xt0) zh0VarZzQ.f11242b.f14815s) == xt0.f10647b) {
            k70 k70Var = (k70) zzu.zzA();
            yt0 yt0Var = zh0VarZzQ.f11241a;
            k70Var.getClass();
            k70.m(new sh0(yt0Var, textView, i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void T(JSONObject jSONObject, String str) {
        ((px) this.f7407a).a(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void U(int i10) {
        this.f7407a.U(i10);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void V() {
        fx fxVar = this.f7407a;
        if (fxVar != null) {
            fxVar.V();
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void W(int i10) {
        this.f7407a.W(i10);
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void X() {
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final boolean Y() {
        return this.f7407a.Y();
    }

    @Override // com.google.android.gms.internal.ads.wb
    public final void Z(vb vbVar) {
        this.f7407a.Z(vbVar);
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void a(String str, String str2) {
        this.f7407a.a("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void a0() {
        this.f7407a.a0();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void b() {
        this.f7407a.b();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void b0(zzm zzmVar) {
        this.f7407a.b0(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final void c(rx rxVar) {
        this.f7407a.c(rxVar);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final boolean c0() {
        return this.f7409d.get();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final boolean canGoBack() {
        return this.f7407a.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.xx
    public final View d() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final String d0() {
        return this.f7407a.d0();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void destroy() {
        yh0 yh0VarZzP;
        fx fxVar = this.f7407a;
        zh0 zh0VarZzQ = fxVar.zzQ();
        if (zh0VarZzQ != null) {
            ew0 ew0Var = zzt.zza;
            ew0Var.post(new s9(17, zh0VarZzQ));
            ew0Var.postDelayed(new mx(fxVar, 0), ((Integer) zzba.zzc().a(eg.A4)).intValue());
        } else if (!((Boolean) zzba.zzc().a(eg.C4)).booleanValue() || (yh0VarZzP = fxVar.zzP()) == null) {
            fxVar.destroy();
        } else {
            zzt.zza.post(new vm(this, 16, yh0VarZzP));
        }
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final b4.c e() {
        return this.f7407a.e();
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final void f(String str, lw lwVar) {
        this.f7407a.f(str, lwVar);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void f0(wp0 wp0Var) {
        this.f7407a.f0(wp0Var);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final ix g() {
        return ((px) this.f7407a).f8008z;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void g0(boolean z9) {
        this.f7407a.g0(z9);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void goBack() {
        this.f7407a.goBack();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final lw h(String str) {
        return this.f7407a.h(str);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void h0(int i10, String str, String str2, boolean z9, boolean z10) {
        this.f7407a.h0(i10, str, str2, z9, z10);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final fr0 i() {
        return this.f7407a.i();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void i0(p80 p80Var) {
        this.f7407a.i0(p80Var);
    }

    @Override // com.google.android.gms.internal.ads.hm
    public final void j(String str, Map map) {
        this.f7407a.j(str, map);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void j0(jb0 jb0Var) {
        this.f7407a.j0(jb0Var);
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void k(int i10) {
        gv gvVar = (gv) this.f7408b.f10633h;
        if (gvVar != null) {
            if (((Boolean) zzba.zzc().a(eg.f4189z)).booleanValue()) {
                gvVar.f5071b.setBackgroundColor(i10);
                gvVar.f5072d.setBackgroundColor(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void k0(zh0 zh0Var) {
        this.f7407a.k0(zh0Var);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void l(boolean z9) {
        this.f7407a.l(z9);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void l0(String str, wk wkVar) {
        this.f7407a.l0(str, wkVar);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void loadData(String str, String str2, String str3) {
        this.f7407a.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f7407a.loadDataWithBaseURL(str, str2, "text/html", StandardStringDigester.MESSAGE_CHARSET, null);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void loadUrl(String str) {
        this.f7407a.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final mc m() {
        return this.f7407a.m();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void m0(String str, String str2) {
        this.f7407a.m0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void n() {
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void n0() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(zzu.zzr().zze()));
        map.put("app_volume", String.valueOf(zzu.zzr().zza()));
        px pxVar = (px) this.f7407a;
        map.put("device_volume", String.valueOf(zzac.zzb(pxVar.getContext())));
        pxVar.j("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void o(boolean z9) {
        this.f7407a.o(z9);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final ArrayList o0() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f7407a) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        fx fxVar = this.f7407a;
        if (fxVar != null) {
            fxVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void onPause() {
        cv cvVar;
        xq xqVar = this.f7408b;
        xqVar.getClass();
        z3.a.j("onPause must be called from the UI thread.");
        gv gvVar = (gv) xqVar.f10633h;
        if (gvVar != null && (cvVar = gvVar.f5076s) != null) {
            cvVar.s();
        }
        this.f7407a.onPause();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void onResume() {
        this.f7407a.onResume();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void p(fr0 fr0Var, hr0 hr0Var) {
        this.f7407a.p(fr0Var, hr0Var);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void p0(boolean z9) {
        this.f7407a.p0(z9);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final WebView q() {
        return (WebView) this.f7407a;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void q0(zzm zzmVar) {
        this.f7407a.q0(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void r(int i10, boolean z9, boolean z10) {
        this.f7407a.r(i10, z9, z10);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void r0() {
        this.f7407a.r0();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final zzm s() {
        return this.f7407a.s();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void s0(String str, String str2) {
        this.f7407a.s0(str, str2);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.fx
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7407a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.fx
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f7407a.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f7407a.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f7407a.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void t(long j10, boolean z9) {
        this.f7407a.t(j10, z9);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void t0(b4.c cVar) {
        this.f7407a.t0(cVar);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final zzm u() {
        return this.f7407a.u();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final boolean u0() {
        return this.f7407a.u0();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void v(int i10) {
        this.f7407a.v(i10);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final y9 w() {
        return this.f7407a.w();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void x(String str, i10 i10Var) {
        this.f7407a.x(str, i10Var);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void y(yh0 yh0Var) {
        this.f7407a.y(yh0Var);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final Context zzE() {
        return this.f7407a.zzE();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final WebViewClient zzH() {
        return this.f7407a.zzH();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final yh0 zzP() {
        return this.f7407a.zzP();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final zh0 zzQ() {
        return this.f7407a.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final hr0 zzR() {
        return this.f7407a.zzR();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final pr0 zzS() {
        return this.f7407a.zzS();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final n5.a zzT() {
        return this.f7407a.zzT();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void zzX() {
        xq xqVar = this.f7408b;
        xqVar.getClass();
        z3.a.j("onDestroy must be called from the UI thread.");
        gv gvVar = (gv) xqVar.f10633h;
        if (gvVar != null) {
            gvVar.f5074h.a();
            cv cvVar = gvVar.f5076s;
            if (cvVar != null) {
                cvVar.x();
            }
            gvVar.b();
            ((ViewGroup) xqVar.f10632f).removeView((gv) xqVar.f10633h);
            xqVar.f10633h = null;
        }
        this.f7407a.zzX();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void zzY() {
        this.f7407a.zzY();
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void zza(String str) {
        ((px) this.f7407a).x0(str);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void zzaa() {
        this.f7407a.zzaa();
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final void zzdg() {
        this.f7407a.zzdg();
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final void zzdh() {
        this.f7407a.zzdh();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final int zzf() {
        return this.f7407a.zzf();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final int zzg() {
        return ((Boolean) zzba.zzc().a(eg.f4174x3)).booleanValue() ? this.f7407a.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final int zzh() {
        return ((Boolean) zzba.zzc().a(eg.f4174x3)).booleanValue() ? this.f7407a.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.ux, com.google.android.gms.internal.ads.pv
    public final Activity zzi() {
        return this.f7407a.zzi();
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final zza zzj() {
        return this.f7407a.zzj();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final jg zzk() {
        return this.f7407a.zzk();
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final p80 zzm() {
        return this.f7407a.zzm();
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final VersionInfoParcel zzn() {
        return this.f7407a.zzn();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final xq zzo() {
        return this.f7408b;
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final rx zzq() {
        return this.f7407a.zzq();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final String zzr() {
        return this.f7407a.zzr();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void zzu() {
        this.f7407a.zzu();
    }
}
