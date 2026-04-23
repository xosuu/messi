package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class z70 extends r20 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f11169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final WeakReference f11170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e70 f11171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j80 f11172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b30 f11173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fv0 f11174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s40 f11175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ju f11176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11177r;

    public z70(jt jtVar, Context context, fx fxVar, e70 e70Var, j80 j80Var, b30 b30Var, fv0 fv0Var, s40 s40Var, ju juVar) {
        super(jtVar);
        this.f11177r = false;
        this.f11169j = context;
        this.f11170k = new WeakReference(fxVar);
        this.f11171l = e70Var;
        this.f11172m = j80Var;
        this.f11173n = b30Var;
        this.f11174o = fv0Var;
        this.f11175p = s40Var;
        this.f11176q = juVar;
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
    public final void b(Activity activity, boolean z9) {
        fr0 fr0VarI;
        int iA;
        e70 e70Var = this.f11171l;
        e70Var.getClass();
        e70Var.I0(new v50(26));
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.f4134t0)).booleanValue();
        Context context = this.f11169j;
        s40 s40Var = this.f11175p;
        if (zBooleanValue) {
            zzu.zzp();
            if (zzt.zzG(context)) {
                zzm.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                s40Var.zzb();
                if (((Boolean) zzba.zzc().a(eg.f4143u0)).booleanValue()) {
                    this.f11174o.a(((hr0) this.f8357a.f6383b.f10631d).f5371b);
                    return;
                }
                return;
            }
        }
        fx fxVar = (fx) this.f11170k.get();
        if (((Boolean) zzba.zzc().a(eg.Ua)).booleanValue() && fxVar != null && (fr0VarI = fxVar.i()) != null && fr0VarI.f4635r0) {
            ju juVar = this.f11176q;
            synchronized (juVar.f6081a) {
                iA = juVar.f6084d.a();
            }
            if (fr0VarI.f4637s0 != iA) {
                zzm.zzj("The interstitial consent form has been shown.");
                s40Var.j(en1.u0(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f11177r) {
            zzm.zzj("The interstitial ad has been shown.");
            s40Var.j(en1.u0(10, null, null));
        }
        Context context2 = activity;
        if (this.f11177r) {
            return;
        }
        if (activity == null) {
            context2 = context;
        }
        try {
            this.f11172m.h(z9, context2, s40Var);
            e70Var.I0(new v50(27));
            this.f11177r = true;
        } catch (zzdgw e10) {
            s40Var.O(e10);
        }
    }

    public final void finalize() throws Throwable {
        try {
            fx fxVar = (fx) this.f11170k.get();
            if (((Boolean) zzba.zzc().a(eg.f3940a6)).booleanValue()) {
                if (!this.f11177r && fxVar != null) {
                    nu.f7387e.execute(new mx(fxVar, 3));
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
