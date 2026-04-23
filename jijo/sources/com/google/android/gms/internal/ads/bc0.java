package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class bc0 extends r20 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f2973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final WeakReference f2974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j80 f2975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e70 f2976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s40 f2977n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i50 f2978o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b30 f2979p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zs f2980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fv0 f2981r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mr0 f2982s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2983t;

    public bc0(jt jtVar, Context context, fx fxVar, j80 j80Var, e70 e70Var, s40 s40Var, i50 i50Var, b30 b30Var, fr0 fr0Var, fv0 fv0Var, mr0 mr0Var) {
        super(jtVar);
        this.f2983t = false;
        this.f2973j = context;
        this.f2975l = j80Var;
        this.f2974k = new WeakReference(fxVar);
        this.f2976m = e70Var;
        this.f2977n = s40Var;
        this.f2978o = i50Var;
        this.f2979p = b30Var;
        this.f2981r = fv0Var;
        zzbvz zzbvzVar = fr0Var.f4622l;
        this.f2980q = new zs(zzbvzVar != null ? zzbvzVar.f11589a : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzbvzVar != null ? zzbvzVar.f11590b : 1);
        this.f2982s = mr0Var;
    }

    public final Bundle b() {
        Bundle bundle;
        i50 i50Var = this.f2978o;
        synchronized (i50Var) {
            bundle = new Bundle(i50Var.f5496b);
        }
        return bundle;
    }

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
    public final void c(Activity activity, boolean z9) {
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.f4134t0)).booleanValue();
        Context context = this.f2973j;
        s40 s40Var = this.f2977n;
        if (zBooleanValue) {
            zzu.zzp();
            if (zzt.zzG(context)) {
                zzm.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                s40Var.zzb();
                if (((Boolean) zzba.zzc().a(eg.f4143u0)).booleanValue()) {
                    this.f2981r.a(((hr0) this.f8357a.f6383b.f10631d).f5371b);
                    return;
                }
                return;
            }
        }
        if (this.f2983t) {
            zzm.zzj("The rewarded ad have been showed.");
            s40Var.j(en1.u0(10, null, null));
            return;
        }
        this.f2983t = true;
        e70 e70Var = this.f2976m;
        e70Var.getClass();
        e70Var.I0(new v50(26));
        Context context2 = activity;
        if (activity == null) {
            context2 = context;
        }
        try {
            this.f2975l.h(z9, context2, s40Var);
            e70Var.I0(new v50(27));
        } catch (zzdgw e10) {
            s40Var.O(e10);
        }
    }

    public final void finalize() throws Throwable {
        try {
            fx fxVar = (fx) this.f2974k.get();
            if (((Boolean) zzba.zzc().a(eg.f3940a6)).booleanValue()) {
                if (!this.f2983t && fxVar != null) {
                    nu.f7387e.execute(new mx(fxVar, 5));
                }
            } else if (fxVar != null) {
                fxVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
