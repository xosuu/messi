package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class yp0 implements ql0 {
    public pl0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f10987b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gy f10988d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kl0 f10989f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ml0 f10990h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FrameLayout f10991q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public og f10992s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r50 f10993t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final gt0 f10994u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k60 f10995v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final nr0 f10996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ts0 f10997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10998y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public zze f10999z;

    public yp0(Context context, Executor executor, zzq zzqVar, gy gyVar, kl0 kl0Var, ml0 ml0Var, nr0 nr0Var, k60 k60Var) {
        this.f10986a = context;
        this.f10987b = executor;
        this.f10988d = gyVar;
        this.f10989f = kl0Var;
        this.f10990h = ml0Var;
        this.f10996w = nr0Var;
        zy zyVar = (zy) gyVar;
        this.f10993t = new r50((ScheduledExecutorService) zyVar.f11344e.zzb(), (y3.a) zyVar.f11348g.zzb());
        this.f10994u = gyVar.d();
        this.f10991q = new FrameLayout(context);
        this.f10995v = k60Var;
        nr0Var.f7359b = zzqVar;
        this.f10998y = true;
        this.f10999z = null;
        this.A = null;
    }

    public final void a() {
        int i10;
        k60 k60Var = this.f10995v;
        r50 r50Var = this.f10993t;
        synchronized (k60Var) {
            i10 = k60Var.f6203b;
        }
        r50Var.K0(i10);
    }

    @Override // com.google.android.gms.internal.ads.ql0
    public final boolean b(zzl zzlVar, String str, b4.f fVar, pl0 pl0Var) {
        fz fzVarP;
        pl0 pl0Var2;
        ft0 ft0Var;
        int i10 = 1;
        int i11 = 0;
        Executor executor = this.f10987b;
        if (str == null) {
            zzm.zzg("Ad unit ID should not be null for banner ad.");
            executor.execute(new xp0(this, i10));
            return false;
        }
        boolean zZza = zza();
        nr0 nr0Var = this.f10996w;
        if (!zZza) {
            boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.f3942a8)).booleanValue();
            gy gyVar = this.f10988d;
            if (zBooleanValue && zzlVar.zzf) {
                ((le0) ((zy) gyVar).f11375w.zzb()).e(true);
            }
            ((y3.b) zzu.zzB()).getClass();
            Bundle bundleC = tc1.c(new Pair("api-call", Long.valueOf(zzlVar.zzz)), new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            nr0Var.f7360c = str;
            nr0Var.f7358a = zzlVar;
            nr0Var.f7377t = bundleC;
            or0 or0VarA = nr0Var.a();
            int iS = tc1.S(or0VarA);
            Context context = this.f10986a;
            bt0 bt0VarS = tc1.s(context, iS, 3, zzlVar);
            boolean zBooleanValue2 = ((Boolean) rh.f8598e.k()).booleanValue();
            kl0 kl0Var = this.f10989f;
            if (!zBooleanValue2 || !nr0Var.f7359b.zzk) {
                boolean zBooleanValue3 = ((Boolean) zzba.zzc().a(eg.f4101p7)).booleanValue();
                FrameLayout frameLayout = this.f10991q;
                k60 k60Var = this.f10995v;
                r50 r50Var = this.f10993t;
                if (zBooleanValue3) {
                    l2.l lVar = new l2.l(((zy) gyVar).f11340c);
                    tl0 tl0Var = new tl0();
                    tl0Var.f9187d = context;
                    tl0Var.f9185a = or0VarA;
                    lVar.f15165h = new z30(tl0Var);
                    t60 t60Var = new t60();
                    t60Var.b(kl0Var, executor);
                    t60Var.c(kl0Var, executor);
                    lVar.f15164f = new u60(t60Var);
                    lVar.f15166q = new rk0(i11, this.f10992s);
                    lVar.f15170v = new p80(r90.f8536h, 0, (Object) null);
                    lVar.f15167s = new m20(r50Var, 0, k60Var);
                    lVar.f15169u = new i10(0, frameLayout);
                    fzVarP = lVar.p();
                } else {
                    l2.l lVar2 = new l2.l(((zy) gyVar).f11340c);
                    tl0 tl0Var2 = new tl0();
                    tl0Var2.f9187d = context;
                    tl0Var2.f9185a = or0VarA;
                    lVar2.f15165h = new z30(tl0Var2);
                    t60 t60Var2 = new t60();
                    t60Var2.b(kl0Var, executor);
                    n70 n70Var = new n70(kl0Var, executor);
                    HashSet hashSet = t60Var2.f9061c;
                    hashSet.add(n70Var);
                    hashSet.add(new n70(this.f10990h, executor));
                    t60Var2.d(kl0Var, executor);
                    t60Var2.f9064f.add(new n70(kl0Var, executor));
                    t60Var2.f9063e.add(new n70(kl0Var, executor));
                    t60Var2.f9066h.add(new n70(kl0Var, executor));
                    t60Var2.a(kl0Var, executor);
                    t60Var2.c(kl0Var, executor);
                    t60Var2.f9071m.add(new n70(kl0Var, executor));
                    lVar2.f15164f = new u60(t60Var2);
                    lVar2.f15166q = new rk0(i11, this.f10992s);
                    lVar2.f15170v = new p80(r90.f8536h, 0, (Object) null);
                    lVar2.f15167s = new m20(r50Var, 0, k60Var);
                    lVar2.f15169u = new i10(0, frameLayout);
                    fzVarP = lVar2.p();
                }
                fz fzVar = fzVarP;
                if (((Boolean) eh.f4203c.k()).booleanValue()) {
                    ft0 ft0Var2 = (ft0) fzVar.M.zzb();
                    ft0Var2.i(3);
                    ft0Var2.b(zzlVar.zzp);
                    ft0Var2.f(zzlVar.zzm);
                    pl0Var2 = pl0Var;
                    ft0Var = ft0Var2;
                } else {
                    pl0Var2 = pl0Var;
                    ft0Var = null;
                }
                this.A = pl0Var2;
                f30 f30Var = (f30) fzVar.X.zzb();
                ts0 ts0VarA = f30Var.a(f30Var.b());
                this.f10997x = ts0VarA;
                tc1.u0(ts0VarA, new xq(this, ft0Var, bt0VarS, fzVar, 19, 0), executor);
                return true;
            }
            if (kl0Var != null) {
                kl0Var.t(en1.u0(7, null, null));
            }
        } else if (!nr0Var.f7373p) {
            this.f10998y = true;
        }
        return false;
    }

    public final void c() {
        synchronized (this) {
            try {
                ts0 ts0Var = this.f10997x;
                if (ts0Var != null && ts0Var.f9284d.isDone()) {
                    try {
                        l10 l10Var = (l10) this.f10997x.f9284d.get();
                        this.f10997x = null;
                        this.f10991q.removeAllViews();
                        if (l10Var.d() != null) {
                            ViewParent parent = l10Var.d().getParent();
                            if (parent instanceof ViewGroup) {
                                String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                                h40 h40Var = l10Var.f8362f;
                                if (h40Var != null) {
                                    str = h40Var.f5205a;
                                }
                                zzm.zzj("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                                ((ViewGroup) parent).removeView(l10Var.d());
                            }
                        }
                        xf xfVar = eg.f4101p7;
                        if (((Boolean) zzba.zzc().a(xfVar)).booleanValue()) {
                            jp0 jp0Var = l10Var.f8363g.f3585a;
                            kl0 kl0Var = this.f10989f;
                            Object obj = jp0Var.f6060b;
                            ((d60) obj).f3586b = kl0Var;
                            ((d60) obj).f3587d = this.f10990h;
                        }
                        this.f10991q.addView(l10Var.d());
                        this.A.mo4a(l10Var);
                        if (((Boolean) zzba.zzc().a(xfVar)).booleanValue()) {
                            Executor executor = this.f10987b;
                            kl0 kl0Var2 = this.f10989f;
                            Objects.requireNonNull(kl0Var2);
                            executor.execute(new yd0(10, kl0Var2));
                        }
                        if (l10Var.b() >= 0) {
                            this.f10998y = false;
                            this.f10993t.J0(l10Var.b());
                            this.f10993t.K0(l10Var.c());
                        } else {
                            this.f10998y = true;
                            this.f10993t.J0(l10Var.c());
                        }
                    } catch (InterruptedException e10) {
                        e = e10;
                        d();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f10998y = true;
                        this.f10993t.zza();
                    } catch (ExecutionException e11) {
                        e = e11;
                        d();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f10998y = true;
                        this.f10993t.zza();
                    }
                } else if (this.f10997x != null) {
                    com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                    this.f10998y = true;
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f10998y = true;
                    this.f10993t.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.f10997x = null;
        if (((Boolean) zzba.zzc().a(eg.f4101p7)).booleanValue()) {
            this.f10987b.execute(new xp0(this, 0));
        }
        pl0 pl0Var = this.A;
        if (pl0Var != null) {
            pl0Var.mo1zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.ql0
    public final boolean zza() {
        ts0 ts0Var = this.f10997x;
        return (ts0Var == null || ts0Var.f9284d.isDone()) ? false : true;
    }
}
