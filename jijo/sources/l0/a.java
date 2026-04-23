package l0;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabase;
import c2.m;
import c2.n;
import com.androidnetworking.error.ANError;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.av;
import com.google.android.gms.internal.ads.bt0;
import com.google.android.gms.internal.ads.bv;
import com.google.android.gms.internal.ads.cj0;
import com.google.android.gms.internal.ads.ek0;
import com.google.android.gms.internal.ads.fr0;
import com.google.android.gms.internal.ads.ft0;
import com.google.android.gms.internal.ads.gk1;
import com.google.android.gms.internal.ads.gv;
import com.google.android.gms.internal.ads.i7;
import com.google.android.gms.internal.ads.jj1;
import com.google.android.gms.internal.ads.jo1;
import com.google.android.gms.internal.ads.kr0;
import com.google.android.gms.internal.ads.l7;
import com.google.android.gms.internal.ads.lh0;
import com.google.android.gms.internal.ads.m20;
import com.google.android.gms.internal.ads.mk;
import com.google.android.gms.internal.ads.no1;
import com.google.android.gms.internal.ads.ok0;
import com.google.android.gms.internal.ads.ol1;
import com.google.android.gms.internal.ads.p21;
import com.google.android.gms.internal.ads.pm1;
import com.google.android.gms.internal.ads.px;
import com.google.android.gms.internal.ads.qw0;
import com.google.android.gms.internal.ads.ri1;
import com.google.android.gms.internal.ads.rj1;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.ads.sw0;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.u30;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.gms.internal.ads.vt0;
import com.google.android.gms.internal.ads.vw0;
import com.google.android.gms.internal.ads.ww0;
import com.google.android.gms.internal.ads.xh1;
import com.google.android.gms.internal.ads.xi0;
import com.google.android.gms.internal.ads.xw0;
import com.google.android.gms.internal.ads.y1;
import com.google.android.gms.internal.ads.yn0;
import com.google.android.gms.internal.ads.yy0;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.material.appbar.AppBarLayout;
import d2.l;
import g4.f0;
import g4.p;
import g4.p0;
import g4.q0;
import g4.s;
import g4.s0;
import g4.z0;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import k.q;
import l.u;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;
import u3.c0;
import u3.d0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15097b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15098d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15099f;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.f15096a = i10;
        this.f15099f = obj;
        this.f15097b = obj2;
        this.f15098d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [d2.l] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [android.os.IInterface, com.google.android.gms.internal.ads.pw0] */
    /* JADX WARN: Type inference failed for: r5v25, types: [android.os.IInterface, com.google.android.gms.internal.ads.pw0] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        JSONObject jSONObject;
        n4.e eVar;
        OverScroller overScroller;
        int i10 = 4;
        Object objCall = null;
        switch (this.f15096a) {
            case 0:
                m2.f fVar = (m2.f) this.f15097b;
                Typeface typeface = (Typeface) this.f15098d;
                q7.b bVar = (q7.b) fVar.f15701b;
                if (bVar != null) {
                    bVar.n(typeface);
                    return;
                }
                return;
            case 1:
                ((n0.a) this.f15097b).a(this.f15098d);
                return;
            case 2:
                try {
                    objCall = ((Callable) this.f15097b).call();
                    break;
                } catch (Exception unused) {
                }
                ((Handler) this.f15099f).post(new a(this, (n0.a) this.f15098d, objCall, 1));
                return;
            case 3:
                try {
                    zBooleanValue = ((Boolean) ((n5.a) this.f15099f).get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused2) {
                    zBooleanValue = true;
                }
                ((d2.a) this.f15097b).a((String) this.f15098d, zBooleanValue);
                return;
            case 4:
                Object obj = this.f15098d;
                Object obj2 = this.f15099f;
                try {
                    ((n5.a) this.f15097b).get();
                    n nVarI = n.i();
                    int i11 = l.F;
                    String.format("Starting work for %s", ((l) obj2).f12343h.f15144c);
                    nVarI.g(new Throwable[0]);
                    ((l) obj2).D = ((l) obj2).f12344q.startWork();
                    ((n2.i) obj).l(((l) obj2).D);
                    return;
                } catch (Throwable th) {
                    ((n2.i) obj).k(th);
                    return;
                }
            case 5:
                Object obj3 = this.f15098d;
                ?? r32 = this.f15099f;
                try {
                    try {
                        m mVar = (m) ((n2.i) this.f15097b).get();
                        if (mVar == null) {
                            n nVarI2 = n.i();
                            int i12 = l.F;
                            String.format("%s returned a null result. Treating it as a failure.", ((l) r32).f12343h.f15144c);
                            nVarI2.h(new Throwable[0]);
                        } else {
                            n nVarI3 = n.i();
                            int i13 = l.F;
                            String.format("%s returned a %s result.", ((l) r32).f12343h.f15144c, mVar);
                            nVarI3.g(new Throwable[0]);
                            ((l) r32).f12346t = mVar;
                        }
                    } catch (Throwable th2) {
                        ((l) r32).c();
                        throw th2;
                    }
                    break;
                } catch (InterruptedException e10) {
                    e = e10;
                    n nVarI4 = n.i();
                    int i14 = l.F;
                    String.format("%s failed because it threw an exception/error", (String) obj3);
                    nVarI4.h(e);
                } catch (CancellationException e11) {
                    n nVarI5 = n.i();
                    int i15 = l.F;
                    String.format("%s was cancelled", (String) obj3);
                    nVarI5.j(e11);
                } catch (ExecutionException e12) {
                    e = e12;
                    n nVarI42 = n.i();
                    int i142 = l.F;
                    String.format("%s failed because it threw an exception/error", (String) obj3);
                    nVarI42.h(e);
                }
                r32 = (l) r32;
                r32.c();
                return;
            case 6:
                l2.j jVarH = ((WorkDatabase) this.f15097b).n().h((String) this.f15098d);
                if (jVarH == null || !jVarH.b()) {
                    return;
                }
                synchronized (((k2.c) this.f15099f).f14652d) {
                    ((k2.c) this.f15099f).f14655q.put((String) this.f15098d, jVarH);
                    ((k2.c) this.f15099f).f14656s.add(jVarH);
                    Object obj4 = this.f15099f;
                    ((k2.c) obj4).f14657t.c(((k2.c) obj4).f14656s);
                    break;
                }
                return;
            case 7:
                ((d2.k) this.f15097b).f12335h.h((String) this.f15098d, (ur0) this.f15099f);
                return;
            case 8:
                q2.c cVar = (q2.c) this.f15097b;
                cVar.a((ANError) this.f15098d);
                cVar.b();
                return;
            case 9:
                c0 c0Var = (c0) this.f15099f;
                int i16 = c0Var.f17565b;
                Object obj5 = this.f15097b;
                if (i16 > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) obj5;
                    Bundle bundle = c0Var.f17566d;
                    lifecycleCallback.c(bundle != null ? bundle.getBundle((String) this.f15098d) : null);
                }
                if (c0Var.f17565b >= 2) {
                    ((LifecycleCallback) obj5).f();
                }
                if (c0Var.f17565b >= 3) {
                    ((LifecycleCallback) obj5).d();
                }
                if (c0Var.f17565b >= 4) {
                    ((LifecycleCallback) obj5).g();
                }
                if (c0Var.f17565b >= 5) {
                    ((LifecycleCallback) obj5).getClass();
                    return;
                }
                return;
            case 10:
                d0 d0Var = (d0) this.f15099f;
                int i17 = d0Var.f17582i0;
                Object obj6 = this.f15097b;
                if (i17 > 0) {
                    LifecycleCallback lifecycleCallback2 = (LifecycleCallback) obj6;
                    Bundle bundle2 = d0Var.f17583j0;
                    lifecycleCallback2.c(bundle2 != null ? bundle2.getBundle((String) this.f15098d) : null);
                }
                if (d0Var.f17582i0 >= 2) {
                    ((LifecycleCallback) obj6).f();
                }
                if (d0Var.f17582i0 >= 3) {
                    ((LifecycleCallback) obj6).d();
                }
                if (d0Var.f17582i0 >= 4) {
                    ((LifecycleCallback) obj6).g();
                }
                if (d0Var.f17582i0 >= 5) {
                    ((LifecycleCallback) obj6).getClass();
                    return;
                }
                return;
            case 11:
                m20 m20Var = (m20) this.f15097b;
                y1 y1Var = (y1) this.f15098d;
                xh1 xh1Var = (xh1) this.f15099f;
                m20Var.getClass();
                int i18 = yn0.f10944a;
                ((ri1) m20Var.f6810d).f8608a.f9512p.F(y1Var, xh1Var);
                return;
            case 12:
                i7 i7Var = (i7) this.f15097b;
                i7Var.zzw();
                l7 l7Var = (l7) this.f15098d;
                if (l7Var.b()) {
                    i7Var.d(l7Var.f6524b);
                } else {
                    i7Var.zzn((zzapq) l7Var.f6526f);
                }
                if (l7Var.f6523a) {
                    i7Var.zzm("intermediate-response");
                } else {
                    i7Var.e("done");
                }
                Runnable runnable = (Runnable) this.f15099f;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                AdManagerAdView adManagerAdView = (AdManagerAdView) this.f15097b;
                if (adManagerAdView.zzb((zzbu) this.f15098d)) {
                    ((mk) this.f15099f).f6991a.onAdManagerAdViewLoaded(adManagerAdView);
                    return;
                } else {
                    zzm.zzj("Could not bind.");
                    return;
                }
            case 14:
                bv bvVar = ((av) this.f15099f).B;
                if (bvVar != null) {
                    ((gv) bvVar).c("error", "what", (String) this.f15097b, "extra", (String) this.f15098d);
                    return;
                }
                return;
            case 15:
                ((px) this.f15097b).y0((String) this.f15098d, (ValueCallback) this.f15099f);
                return;
            case 16:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f15097b;
                String str = (String) this.f15098d;
                zzr zzrVar = (zzr) this.f15099f;
                int i19 = lh0.f6626d;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
                lh0.u(sQLiteDatabase, zzrVar);
                return;
            case 17:
                xi0 xi0Var = (xi0) this.f15097b;
                tc1.u0(tc1.r0(((xi0) xi0Var.f10563c).a((kr0) this.f15098d, (fr0) this.f15099f), r3.R, TimeUnit.SECONDS, (ScheduledExecutorService) xi0Var.f10566f), new aa(18, xi0Var), (p21) xi0Var.f10564d);
                return;
            case 18:
                vt0 vt0Var = (vt0) this.f15097b;
                String str2 = (String) this.f15098d;
                ft0 ft0Var = (ft0) this.f15099f;
                bt0 bt0VarD = tc1.d(vt0Var.f9964a, 14);
                bt0VarD.zzi();
                bt0VarD.x(vt0Var.f9966c.zza(str2));
                if (ft0Var == null) {
                    vt0Var.f9967d.b(bt0VarD.zzm());
                    return;
                } else {
                    ft0Var.a(bt0VarD);
                    ft0Var.h();
                    return;
                }
            case 19:
                ww0 ww0Var = (ww0) this.f15097b;
                xw0 xw0Var = (xw0) this.f15098d;
                q qVar = (q) this.f15099f;
                String str3 = ww0Var.f10367b;
                try {
                    ek0 ek0Var = ww0Var.f10366a;
                    ek0Var.getClass();
                    ?? r52 = (IInterface) ek0Var.f4221v;
                    if (r52 == 0) {
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putBinder("windowToken", ((sw0) xw0Var).f8984a);
                    bundle3.putString("adFieldEnifd", ((sw0) xw0Var).f8989f);
                    bundle3.putInt("layoutGravity", ((sw0) xw0Var).f8986c);
                    bundle3.putFloat("layoutVerticalMargin", ((sw0) xw0Var).f8987d);
                    bundle3.putInt("displayMode", 0);
                    bundle3.putInt("triggerMode", 0);
                    bundle3.putInt("windowWidthPx", ((sw0) xw0Var).f8988e);
                    bundle3.putString("deeplinkUrl", null);
                    bundle3.putBoolean("stableSessionToken", true);
                    bundle3.putString("callerPackage", str3);
                    if (((sw0) xw0Var).f8985b != null) {
                        bundle3.putString("appId", ((sw0) xw0Var).f8985b);
                    }
                    r52.z0(str3, bundle3, new vw0(ww0Var, qVar));
                    return;
                } catch (RemoteException e13) {
                    ww0.f10364c.c(e13, "show overlay display from: %s", str3);
                    return;
                }
            case 20:
                ww0 ww0Var2 = (ww0) this.f15097b;
                qw0 qw0Var = (qw0) this.f15098d;
                q qVar2 = (q) this.f15099f;
                String str4 = ww0Var2.f10367b;
                try {
                    ek0 ek0Var2 = ww0Var2.f10366a;
                    ek0Var2.getClass();
                    ?? r53 = (IInterface) ek0Var2.f4221v;
                    if (r53 == 0) {
                        return;
                    }
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("sessionToken", qw0Var.f8306a);
                    bundle4.putString("callerPackage", str4);
                    bundle4.putString("appId", qw0Var.f8307b);
                    r53.f1(bundle4, new vw0(ww0Var2, qVar2));
                    return;
                } catch (RemoteException e14) {
                    ww0.f10364c.c(e14, "dismiss overlay display from: %s", str4);
                    return;
                }
            case sf.zzm /* 21 */:
                jj1 jj1Var = (jj1) this.f15097b;
                yy0 yy0Var = (yy0) this.f15098d;
                jo1 jo1Var = (jo1) this.f15099f;
                jj1Var.getClass();
                jj1Var.f5972c.C(yy0Var.g(), jo1Var);
                return;
            case 22:
                Pair pair = (Pair) this.f15098d;
                ((rj1) ((ok0) this.f15097b).f7598d).f8623h.j(((Integer) pair.first).intValue(), (jo1) pair.second, (gk1) this.f15099f);
                return;
            case 23:
                cj0 cj0Var = (cj0) this.f15097b;
                y1 y1Var2 = (y1) this.f15098d;
                xh1 xh1Var2 = (xh1) this.f15099f;
                cj0Var.getClass();
                int i20 = yn0.f10944a;
                ((ri1) ((ol1) cj0Var.f3302d)).f8608a.f9512p.v(y1Var2, xh1Var2);
                return;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                ((no1) this.f15098d).j(0, ((pm1) this.f15097b).f7921a, (gk1) this.f15099f);
                return;
            case 25:
                ((com.google.android.gms.internal.ads.q) this.f15098d).a();
                return;
            case 26:
                String str5 = (String) this.f15097b;
                if (TextUtils.isEmpty(str5)) {
                    return;
                }
                String str6 = (String) this.f15098d;
                String lowerCase = str5.toLowerCase();
                if (!TextUtils.isEmpty(str6)) {
                    try {
                        jSONObject = new JSONObject(str6);
                    } catch (JSONException unused3) {
                        return;
                    }
                    break;
                } else {
                    jSONObject = new JSONObject();
                }
                JSONObject jSONObject2 = jSONObject;
                f0[] f0VarArr = (f0[]) this.f15099f;
                jSONObject2.toString();
                for (f0 f0Var : f0VarArr) {
                    FutureTask futureTask = new FutureTask(new u30(f0Var, lowerCase, jSONObject2, i10));
                    f0Var.zza().execute(futureTask);
                    try {
                        break;
                    } catch (InterruptedException unused4) {
                    } catch (ExecutionException e15) {
                        e15.getCause();
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
                return;
            case 27:
                z0 z0Var = (z0) this.f15097b;
                l5.c cVar2 = (l5.c) this.f15098d;
                f0.d dVar = (f0.d) this.f15099f;
                z0Var.getClass();
                Objects.requireNonNull(cVar2);
                z0Var.f13838b.post(new androidx.activity.e(23, cVar2));
                if (((l5.d) dVar.f13015c) != l5.d.f15215b) {
                    g4.l lVar = z0Var.f13841e;
                    g4.m mVar2 = (g4.m) lVar.f13749b.get();
                    if (mVar2 == null) {
                        return;
                    }
                    g4.d dVar2 = (g4.d) lVar.f13748a.zza();
                    dVar2.getClass();
                    g4.c cVar3 = dVar2.f13710a;
                    s0 s0VarA = q0.a(new q(25, (s0) cVar3.f13697b));
                    androidx.fragment.app.k kVar = new androidx.fragment.app.k(mVar2);
                    p0 p0Var = new p0();
                    s0 s0Var = (s0) cVar3.f13697b;
                    s0 s0Var2 = (s0) cVar3.f13703h;
                    s0 s0Var3 = (s0) cVar3.f13704i;
                    s0 s0Var4 = (s0) cVar3.f13698c;
                    s0 s0VarA2 = q0.a(new u(s0Var, (s0) cVar3.f13699d, s0VarA, s0Var4, kVar, new p(s0VarA, new s(s0Var, s0VarA, s0Var2, s0Var3, p0Var, s0Var4))));
                    if (p0Var.f13774a != null) {
                        throw new IllegalStateException();
                    }
                    p0Var.f13774a = s0VarA2;
                    g4.k kVar2 = (g4.k) p0Var.zza();
                    kVar2.f13746l = true;
                    g4.c0.f13708a.post(new l.j(lVar, kVar2, 20));
                    return;
                }
                return;
            default:
                View view = (View) this.f15098d;
                if (view == null || (overScroller = (eVar = (n4.e) this.f15099f).f15955d) == null) {
                    return;
                }
                boolean zComputeScrollOffset = overScroller.computeScrollOffset();
                Object obj7 = this.f15097b;
                if (zComputeScrollOffset) {
                    eVar.w((CoordinatorLayout) obj7, view, eVar.f15955d.getCurrY());
                    o0.d0.m(view, this);
                    return;
                }
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj7;
                AppBarLayout appBarLayout = (AppBarLayout) view;
                ((AppBarLayout.BaseBehavior) eVar).C(coordinatorLayout, appBarLayout);
                if (appBarLayout.f11704w) {
                    appBarLayout.e(appBarLayout.f(AppBarLayout.BaseBehavior.z(coordinatorLayout)));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f15096a = i10;
        this.f15097b = obj;
        this.f15098d = obj2;
        this.f15099f = obj3;
    }
}
