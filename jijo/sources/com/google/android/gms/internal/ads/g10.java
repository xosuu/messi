package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class g10 extends r20 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fx f4760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f4762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m20 f4763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j80 f4764n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e70 f4765o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s40 f4766p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f4767q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ju f4768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4769s;

    public g10(jt jtVar, Context context, fx fxVar, int i10, m20 m20Var, j80 j80Var, e70 e70Var, s40 s40Var, ju juVar) {
        super(jtVar);
        this.f4769s = false;
        this.f4760j = fxVar;
        this.f4762l = context;
        this.f4761k = i10;
        this.f4763m = m20Var;
        this.f4764n = j80Var;
        this.f4765o = e70Var;
        this.f4766p = s40Var;
        this.f4767q = ((Boolean) zzba.zzc().a(eg.M4)).booleanValue();
        this.f4768r = juVar;
    }

    public final void b() {
        z40 z40Var = this.f8359c;
        z40Var.getClass();
        z40Var.I0(new y40(null));
        fx fxVar = this.f4760j;
        if (fxVar != null) {
            fxVar.destroy();
        }
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
        fx fxVar;
        fr0 fr0VarI;
        int iA;
        Context context = activity;
        if (activity == null) {
            context = this.f4762l;
        }
        e70 e70Var = this.f4765o;
        boolean z10 = this.f4767q;
        if (z10) {
            e70Var.getClass();
            e70Var.I0(new v50(26));
        }
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.f4134t0)).booleanValue();
        s40 s40Var = this.f4766p;
        if (zBooleanValue) {
            zzu.zzp();
            if (zzt.zzG(context)) {
                zzm.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                s40Var.zzb();
                if (((Boolean) zzba.zzc().a(eg.f4143u0)).booleanValue()) {
                    new fv0(context.getApplicationContext(), zzu.zzt().zzb()).a(((hr0) this.f8357a.f6383b.f10631d).f5371b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) zzba.zzc().a(eg.Ua)).booleanValue() && (fxVar = this.f4760j) != null && (fr0VarI = fxVar.i()) != null && fr0VarI.f4635r0) {
            ju juVar = this.f4768r;
            synchronized (juVar.f6081a) {
                iA = juVar.f6084d.a();
            }
            if (fr0VarI.f4637s0 != iA) {
                zzm.zzj("The app open consent form has been shown.");
                s40Var.j(en1.u0(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f4769s) {
            zzm.zzj("App open interstitial ad is already visible.");
            s40Var.j(en1.u0(10, null, null));
        }
        if (this.f4769s) {
            return;
        }
        try {
            this.f4764n.h(z9, context, s40Var);
            if (z10) {
                e70Var.getClass();
                e70Var.I0(new v50(27));
            }
            this.f4769s = true;
        } catch (zzdgw e10) {
            s40Var.O(e10);
        }
    }

    public final void d(int i10, long j10) {
        m20 m20Var = this.f4763m;
        m20 m20VarA = ((ed0) m20Var.f6809b).a();
        m20VarA.f("gqi", ((hr0) ((kr0) m20Var.f6810d).f6383b.f10631d).f5371b);
        m20VarA.f("action", "ad_closed");
        m20VarA.f("show_time", String.valueOf(j10));
        m20VarA.f("ad_format", "app_open_ad");
        int i11 = i10 - 1;
        m20VarA.f("acr", i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        m20VarA.h();
    }
}
