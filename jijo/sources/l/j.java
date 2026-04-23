package l;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import android.view.View;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.codetroopers.betterpickers.radialtimepicker.RadialPickerLayout;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.lq;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14876b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14877d;

    public /* synthetic */ j(Object obj, int i10, Object obj2) {
        this.f14875a = i10;
        this.f14877d = obj;
        this.f14876b = obj2;
    }

    private void a() {
        ((n1.j) this.f14877d).getClass();
        throw null;
    }

    private void b() {
        synchronized (((ConstraintTrackingWorker) this.f14877d).f1199s) {
            if (((ConstraintTrackingWorker) this.f14877d).f1200t) {
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f14877d;
                constraintTrackingWorker.f1201u.j(new c2.k());
            } else {
                ((ConstraintTrackingWorker) this.f14877d).f1201u.l((n5.a) this.f14876b);
            }
        }
    }

    private final void c() {
        boolean zBooleanValue;
        g4.o oVar = (g4.o) this.f14876b;
        String str = (String) this.f14877d;
        synchronized (g4.d0.class) {
            if (g4.d0.f13711a == null) {
                try {
                    oVar.evaluateJavascript("(function(){})()", null);
                    g4.d0.f13711a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    g4.d0.f13711a = Boolean.FALSE;
                }
                zBooleanValue = g4.d0.f13711a.booleanValue();
            } else {
                zBooleanValue = g4.d0.f13711a.booleanValue();
            }
        }
        if (zBooleanValue) {
            oVar.evaluateJavascript(str, null);
        } else {
            oVar.loadUrl("javascript:".concat(str));
        }
    }

    private final void d() {
        synchronized (((k4.i) this.f14877d).f14679d) {
            try {
                Object obj = ((k4.i) this.f14877d).f14680f;
                if (((k4.b) obj) != null) {
                    ((k4.b) obj).i((k4.l) this.f14876b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        synchronized (((k4.i) this.f14877d).f14679d) {
            try {
                Object obj = ((k4.i) this.f14877d).f14680f;
                if (((k4.c) obj) != null) {
                    Exception excA = ((k4.l) this.f14876b).a();
                    z3.a.l(excA);
                    ((k4.c) obj).b(excA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f() {
        synchronized (((k4.i) this.f14877d).f14679d) {
            try {
                Object obj = ((k4.i) this.f14877d).f14680f;
                if (((k4.d) obj) != null) {
                    ((k4.g) ((k4.d) obj)).f14675f.f(((k4.l) this.f14876b).b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        k.m mVar;
        v3.i iVar;
        Set set;
        int i10 = 0;
        Throwable th = null;
        v3.i e0Var = null;
        switch (this.f14875a) {
            case 0:
                androidx.appcompat.widget.b bVar = (androidx.appcompat.widget.b) this.f14877d;
                k.o oVar = bVar.f375d;
                if (oVar != null && (mVar = oVar.f14563e) != null) {
                    mVar.q(oVar);
                }
                View view = (View) bVar.f380t;
                if (view != null && view.getWindowToken() != null) {
                    h hVar = (h) this.f14876b;
                    if (hVar.b()) {
                        bVar.F = hVar;
                    } else if (hVar.f14494f != null) {
                        hVar.d(0, 0, false, false);
                        bVar.F = hVar;
                    }
                }
                bVar.H = null;
                return;
            case 1:
                ((p.d) this.f14877d).f16168b.c((Bundle) this.f14876b);
                return;
            case 2:
                ((androidx.core.app.f) this.f14876b).f462a = this.f14877d;
                return;
            case 3:
                ((Application) this.f14876b).unregisterActivityLifecycleCallbacks((androidx.core.app.f) this.f14877d);
                return;
            case 4:
                try {
                    Method method = androidx.core.app.g.f476d;
                    Object obj = this.f14877d;
                    Object obj2 = this.f14876b;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        androidx.core.app.g.f477e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e10) {
                    if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                        throw e10;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                androidx.fragment.app.q0.b(4, (ArrayList) this.f14876b);
                return;
            case 6:
                ((androidx.fragment.app.g) this.f14876b).b();
                return;
            case 7:
                ((androidx.fragment.app.c1) this.f14876b).c();
                return;
            case 8:
                a();
                return;
            case 9:
                Object obj3 = this.f14877d;
                ((Runnable) this.f14876b).run();
                fb1.t(obj3);
                throw null;
            case 10:
                c2.n nVarI = c2.n.i();
                int i11 = e2.a.f12630d;
                l2.j jVar = (l2.j) this.f14876b;
                String.format("Scheduling work %s", jVar.f15142a);
                nVarI.g(new Throwable[0]);
                ((e2.a) this.f14877d).f12631a.e(jVar);
                return;
            case 11:
                for (i2.c cVar : (List) this.f14876b) {
                    Object obj4 = ((j2.d) this.f14877d).f14288e;
                    cVar.f14166b = obj4;
                    cVar.d(cVar.f14168d, obj4);
                }
                return;
            case 12:
                Object obj5 = this.f14876b;
                try {
                    ((Runnable) this.f14877d).run();
                    return;
                } finally {
                    ((m2.i) obj5).b();
                }
            case 13:
                b();
                return;
            case 14:
                try {
                    ((r2.f) this.f14877d).getClass();
                    Process.setThreadPriority(10);
                    break;
                } catch (Throwable unused2) {
                }
                ((Runnable) this.f14876b).run();
                return;
            case 15:
                RadialPickerLayout radialPickerLayout = (RadialPickerLayout) this.f14877d;
                radialPickerLayout.H = true;
                int iB = radialPickerLayout.b(radialPickerLayout.J, ((Boolean[]) this.f14876b)[0].booleanValue(), false, true);
                radialPickerLayout.f1725d = iB;
                ((e3.j) radialPickerLayout.f1727h).m0(radialPickerLayout.getCurrentItemShowing(), iB, false);
                return;
            case 16:
                Object obj6 = this.f14877d;
                u3.q qVar = (u3.q) obj6;
                u3.o oVar2 = (u3.o) ((u3.d) qVar.f17612q).f17576v.get((u3.a) qVar.f17609d);
                if (oVar2 == null) {
                    return;
                }
                ConnectionResult connectionResult = (ConnectionResult) this.f14876b;
                if (connectionResult.f2470b != 0) {
                    oVar2.l(connectionResult, null);
                    return;
                }
                qVar.f17607a = true;
                if (((t3.c) qVar.f17608b).requiresSignIn()) {
                    if (!qVar.f17607a || (iVar = (v3.i) qVar.f17610f) == null) {
                        return;
                    }
                    ((t3.c) qVar.f17608b).getRemoteService(iVar, (Set) qVar.f17611h);
                    return;
                }
                try {
                    Object obj7 = ((u3.q) obj6).f17608b;
                    ((t3.c) obj7).getRemoteService(null, ((t3.c) obj7).a());
                    return;
                } catch (SecurityException unused3) {
                    ((t3.c) qVar.f17608b).disconnect("Failed to get service from broker.");
                    oVar2.l(new ConnectionResult(10), null);
                    return;
                }
            case 17:
                u3.y yVar = (u3.y) this.f14877d;
                zak zakVar = (zak) this.f14876b;
                w3.b bVar2 = u3.y.f17630t;
                ConnectionResult connectionResult2 = zakVar.f11691b;
                if (connectionResult2.f2470b == 0) {
                    zav zavVar = zakVar.f11692d;
                    z3.a.l(zavVar);
                    ConnectionResult connectionResult3 = zavVar.f2528d;
                    if (connectionResult3.f2470b != 0) {
                        String strValueOf = String.valueOf(connectionResult3);
                        new Exception();
                        "Sign-in succeeded with resolve account failure: ".concat(strValueOf);
                        yVar.f17637s.a(connectionResult3);
                        yVar.f17636q.disconnect();
                        return;
                    }
                    u3.q qVar2 = yVar.f17637s;
                    IBinder iBinder = zavVar.f2527b;
                    if (iBinder != null) {
                        int i12 = v3.a.f17714b;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        e0Var = iInterfaceQueryLocalInterface instanceof v3.i ? (v3.i) iInterfaceQueryLocalInterface : new v3.e0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    qVar2.getClass();
                    if (e0Var == null || (set = yVar.f17634f) == null) {
                        new Exception();
                        qVar2.a(new ConnectionResult(4));
                    } else {
                        qVar2.f17610f = e0Var;
                        qVar2.f17611h = set;
                        if (qVar2.f17607a) {
                            ((t3.c) qVar2.f17608b).getRemoteService(e0Var, set);
                        }
                    }
                } else {
                    yVar.f17637s.a(connectionResult2);
                }
                yVar.f17636q.disconnect();
                return;
            case 18:
                ((u3.k) this.f14877d).getClass();
                return;
            case 19:
                d4.f fVar = (d4.f) this.f14876b;
                k4.e eVar = (k4.e) this.f14877d;
                Context context = fVar.f12358a;
                String string = context.getSharedPreferences("app_set_id_storage", 0).getString("app_set_id", null);
                long j10 = fVar.f12358a.getSharedPreferences("app_set_id_storage", 0).getLong("app_set_id_last_used_time", -1L);
                long j11 = j10 != -1 ? 33696000000L + j10 : -1L;
                if (string != null && System.currentTimeMillis() <= j11) {
                    try {
                        d4.f.b(context);
                    } catch (d4.e e11) {
                        eVar.f14669a.e(e11);
                        return;
                    }
                    break;
                } else {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String strValueOf2 = String.valueOf(context.getPackageName());
                            if (strValueOf2.length() != 0) {
                                "Failed to store app set ID generated for App ".concat(strValueOf2);
                            }
                            throw new d4.e("Failed to store the app set ID.");
                        }
                        d4.f.b(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String strValueOf3 = String.valueOf(context.getPackageName());
                            if (strValueOf3.length() != 0) {
                                "Failed to store app set ID creation time for App ".concat(strValueOf3);
                            }
                            throw new d4.e("Failed to store the app set ID creation time.");
                        }
                    } catch (d4.e e12) {
                        eVar.f14669a.e(e12);
                        return;
                    }
                }
                eVar.f14669a.f(new q3.b(string, 1));
                return;
            case 20:
                g4.l lVar = (g4.l) this.f14876b;
                g4.k kVar = (g4.k) this.f14877d;
                AtomicReference atomicReference = lVar.f13750c;
                Objects.requireNonNull(atomicReference);
                kVar.b(new k.q(24, atomicReference), new c2.n(15, i10));
                return;
            case sf.zzm /* 21 */:
                c();
                return;
            case 22:
                if (((k4.l) this.f14876b).f14685d) {
                    ((k4.g) this.f14877d).f14675f.g();
                    return;
                }
                try {
                    ((k4.g) this.f14877d).f14675f.f(((k4.g) this.f14877d).f14674d.i((k4.l) this.f14876b));
                    return;
                } catch (RuntimeExecutionException e13) {
                    if (e13.getCause() instanceof Exception) {
                        ((k4.g) this.f14877d).f14675f.e((Exception) e13.getCause());
                        return;
                    } else {
                        ((k4.g) this.f14877d).f14675f.e(e13);
                        return;
                    }
                } catch (Exception e14) {
                    ((k4.g) this.f14877d).f14675f.e(e14);
                    return;
                }
            case 23:
                Object obj8 = this.f14877d;
                try {
                    k4.l lVar2 = (k4.l) ((k4.g) obj8).f14674d.i((k4.l) this.f14876b);
                    if (lVar2 == null) {
                        ((k4.g) obj8).b(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    k4.g gVar = (k4.g) obj8;
                    f.u0 u0Var = k4.f.f14671b;
                    k4.i iVar2 = new k4.i(u0Var, gVar, 0);
                    v3.d0 d0Var = lVar2.f14683b;
                    d0Var.e(iVar2);
                    lVar2.i();
                    lVar2.f14683b.e(new k4.i((Executor) u0Var, (k4.c) gVar));
                    lVar2.i();
                    d0Var.e(new k4.i(u0Var, gVar));
                    lVar2.i();
                    return;
                } catch (RuntimeExecutionException e15) {
                    if (e15.getCause() instanceof Exception) {
                        ((k4.g) obj8).f14675f.e((Exception) e15.getCause());
                        return;
                    } else {
                        ((k4.g) obj8).f14675f.e(e15);
                        return;
                    }
                } catch (Exception e16) {
                    ((k4.g) obj8).f14675f.e(e16);
                    return;
                }
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                d();
                return;
            case 25:
                e();
                return;
            case 26:
                f();
                return;
            case 27:
                Object obj9 = this.f14876b;
                try {
                    ((k4.l) obj9).f(((Callable) this.f14877d).call());
                    return;
                } catch (Exception e17) {
                    ((k4.l) obj9).e(e17);
                    return;
                } catch (Throwable th2) {
                    ((k4.l) obj9).e(new RuntimeException(th2));
                    return;
                }
            case 28:
                synchronized (((lq) this.f14876b)) {
                    try {
                        Object obj10 = this.f14876b;
                        if (((lq) obj10).f6692a) {
                            return;
                        }
                        ((lq) obj10).f6693b = true;
                        ((z5.a) this.f14877d).f20710j.c(new SocketTimeoutException("The connect timeout expired"), false);
                        return;
                    } finally {
                    }
                }
            default:
                ((h6.d) this.f14877d).g((Context) this.f14876b, 5);
                return;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, int i10) {
        this.f14875a = i10;
        this.f14876b = obj;
        this.f14877d = obj2;
    }
}
