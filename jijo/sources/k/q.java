package k;

import android.app.Application;
import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.nonagon.signalgeneration.zzay;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.ep;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.k21;
import com.google.android.gms.internal.ads.rk1;
import com.google.android.gms.internal.ads.rv0;
import com.google.android.gms.internal.ads.tw0;
import com.google.android.gms.internal.ads.w70;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import f.w0;
import g4.a1;
import g4.q0;
import g4.r0;
import g4.s0;
import g4.t0;
import g4.x0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import l.w3;
import o0.i1;
import o0.j1;
import o0.k1;
import o0.r1;
import o0.t1;
import o0.v0;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class q implements m, l.o, o0.t, g0.m, o0.g, p0.t, b2.p, rv0, k21, v3.b, k4.a, l5.h, r0, r4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14587b;

    public /* synthetic */ q() {
        this.f14586a = 23;
    }

    public static Object w(Object[] objArr, int i10, g0.m mVar) {
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z9 = (i10 & 2) != 0;
        Object obj = null;
        int i12 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(mVar.j(obj2) - i11) * 2) + (mVar.k(obj2) == z9 ? 0 : 1);
            if (obj == null || i12 > iAbs) {
                obj = obj2;
                i12 = iAbs;
            }
        }
        return obj;
    }

    public final g4.c A() {
        Object obj = this.f14587b;
        if (((Application) obj) == null) {
            throw new IllegalStateException(String.valueOf(Application.class.getCanonicalName()).concat(" must be set"));
        }
        Application application = (Application) obj;
        g4.c cVar = new g4.c();
        cVar.f13696a = cVar;
        if (application == null) {
            throw new NullPointerException("instance cannot be null");
        }
        androidx.fragment.app.k kVar = new androidx.fragment.app.k(application);
        cVar.f13697b = kVar;
        cVar.f13698c = q0.a(new g4.h(kVar, 0));
        cVar.f13699d = q0.a(g4.z.f13836j);
        m2.f fVar = new m2.f(27, cVar);
        cVar.f13700e = fVar;
        cVar.f13701f = q0.a(new g4.h(fVar));
        s0 s0Var = (s0) cVar.f13698c;
        cVar.f13702g = new x0(kVar, s0Var);
        s0 s0VarA = q0.a(new c2.n(16, (Object) null));
        cVar.f13703h = s0VarA;
        g4.f fVar2 = new g4.f(kVar, s0Var);
        cVar.f13704i = fVar2;
        g4.a aVar = new g4.a(s0VarA, fVar2, s0Var);
        cVar.f13705j = aVar;
        s0 s0Var2 = (s0) cVar.f13699d;
        s0 s0Var3 = (s0) cVar.f13701f;
        a1 a1Var = new a1(kVar, s0Var2, s0Var, s0Var3, (s0) cVar.f13702g, aVar, s0VarA);
        cVar.f13706k = a1Var;
        cVar.f13707l = q0.a(new ep(s0Var, a1Var, s0Var3, 29, 0));
        return cVar;
    }

    public final void B(tw0 tw0Var) {
        zzx zzxVar = (zzx) this.f14587b;
        zzxVar.getClass();
        String str = tw0Var.f9298b;
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) zzba.zzc().a(eg.Ca)).booleanValue()) {
                zzxVar.f2087a = str;
            }
        }
        int i10 = tw0Var.f9297a;
        switch (i10) {
            case 8152:
                zzxVar.a("onLMDOverlayOpened", new HashMap());
                break;
            case 8153:
                zzxVar.a("onLMDOverlayClicked", new HashMap());
                break;
            case 8155:
                zzxVar.a("onLMDOverlayClose", new HashMap());
                break;
            case 8157:
                zzxVar.f2087a = null;
                zzxVar.f2088b = null;
                zzxVar.f2091e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(i10));
                zzxVar.a("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        w70 w70Var = (w70) this.f14587b;
        String message = th.getMessage();
        synchronized (w70Var) {
            w70Var.I0(new com.google.android.gms.internal.ads.d0(message, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final void mo4a(Object obj) {
        w70 w70Var = (w70) this.f14587b;
        zzay zzayVar = (zzay) obj;
        synchronized (w70Var) {
            w70Var.I0(new aa(11, zzayVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.rv0
    public final void b(int i10, long j10) {
        ((zzj) this.f14587b).f2229t.c(i10, System.currentTimeMillis() - j10);
    }

    @Override // l5.h
    public final void c(g4.k kVar) {
        ((AtomicReference) this.f14587b).set(kVar);
    }

    @Override // b2.p
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) q7.b.f(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f14587b).createWebView(webView));
    }

    @Override // o0.g
    public final ClipData d() {
        return ((ContentInfo) this.f14587b).getClip();
    }

    @Override // b2.p
    public final String[] e() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f14587b).getSupportedFeatures();
    }

    @Override // p0.t
    public final boolean f(View view) {
        ((DrawerLayout) this.f14587b).getClass();
        if (!DrawerLayout.n(view) || ((DrawerLayout) this.f14587b).i(view) == 2) {
            return false;
        }
        ((DrawerLayout) this.f14587b).b(view);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.rv0
    public final void g(int i10, String str, long j10) {
        ((zzj) this.f14587b).f2229t.d(i10, System.currentTimeMillis() - j10, null, null, str);
    }

    @Override // b2.p
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) q7.b.f(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f14587b).getStatics());
    }

    @Override // o0.t
    public final t1 h(View view, t1 t1Var) {
        r1 r1Var = t1Var.f16068a;
        z = false;
        boolean z9 = false;
        switch (this.f14586a) {
            case 3:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f14587b;
                if (!n0.b.a(coordinatorLayout.f439z, t1Var)) {
                    coordinatorLayout.f439z = t1Var;
                    boolean z10 = t1Var.d() > 0;
                    coordinatorLayout.A = z10;
                    coordinatorLayout.setWillNotDraw(!z10 && coordinatorLayout.getBackground() == null);
                    if (!r1Var.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i10 = 0; i10 < childCount; i10++) {
                            View childAt = coordinatorLayout.getChildAt(i10);
                            WeakHashMap weakHashMap = v0.f16075a;
                            if (!o0.d0.b(childAt) || ((b0.e) childAt.getLayoutParams()).f1211a == null || !r1Var.m()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return t1Var;
            case 26:
                AppBarLayout appBarLayout = (AppBarLayout) this.f14587b;
                appBarLayout.getClass();
                WeakHashMap weakHashMap2 = v0.f16075a;
                t1 t1Var2 = o0.d0.b(appBarLayout) ? t1Var : null;
                if (!n0.b.a(appBarLayout.f11700s, t1Var2)) {
                    appBarLayout.f11700s = t1Var2;
                    if (appBarLayout.G != null && appBarLayout.getTopInset() > 0) {
                        z9 = true;
                    }
                    appBarLayout.setWillNotDraw(!z9);
                    appBarLayout.requestLayout();
                }
                return t1Var;
            default:
                x4.s sVar = (x4.s) this.f14587b;
                if (sVar.f18453b == null) {
                    sVar.f18453b = new Rect();
                }
                ((x4.s) this.f14587b).f18453b.set(t1Var.b(), t1Var.d(), t1Var.c(), t1Var.a());
                x4.q qVar = ((NavigationView) ((x4.s) this.f14587b)).f11923u;
                qVar.getClass();
                int iD = t1Var.d();
                if (qVar.K != iD) {
                    qVar.K = iD;
                    int i11 = (qVar.f18439b.getChildCount() == 0 && qVar.I) ? qVar.K : 0;
                    NavigationMenuView navigationMenuView = qVar.f18438a;
                    navigationMenuView.setPadding(0, i11, 0, navigationMenuView.getPaddingBottom());
                }
                NavigationMenuView navigationMenuView2 = qVar.f18438a;
                navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, t1Var.a());
                v0.b(qVar.f18439b, t1Var);
                ((x4.s) this.f14587b).setWillNotDraw(!(r1Var.j().equals(g0.c.f13600e) ^ true) || ((x4.s) this.f14587b).f18452a == null);
                o0.d0.k((x4.s) this.f14587b);
                return r1Var.c();
        }
    }

    @Override // k4.a
    public final Object i(k4.l lVar) {
        d4.i iVar = (d4.i) this.f14587b;
        if (!lVar.d() && !lVar.f14685d) {
            Exception excA = lVar.a();
            if (excA instanceof ApiException) {
                int i10 = ((ApiException) excA).f2476a.f2481a;
                if (i10 == 43001 || i10 == 43002 || i10 == 43003 || i10 == 17) {
                    lVar = iVar.f12365b.a();
                } else if (i10 == 43000) {
                    Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
                    k4.l lVar2 = new k4.l();
                    lVar2.e(exc);
                    lVar = lVar2;
                } else if (i10 == 15) {
                    Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
                    k4.l lVar3 = new k4.l();
                    lVar3.e(exc2);
                    return lVar3;
                }
            }
        }
        return lVar;
    }

    @Override // g0.m
    public final int j(Object obj) {
        return ((l0.i) obj).f15116c;
    }

    @Override // g0.m
    public final boolean k(Object obj) {
        return ((l0.i) obj).f15117d;
    }

    @Override // o0.g
    public final int l() {
        return ((ContentInfo) this.f14587b).getFlags();
    }

    @Override // v3.b
    public final void m(int i10) {
        ((u3.c) this.f14587b).m(i10);
    }

    @Override // k.m
    public final boolean n(o oVar, MenuItem menuItem) {
        l.o oVar2 = ((ActionMenuView) this.f14587b).M;
        if (oVar2 == null) {
            return false;
        }
        q qVar = (q) oVar2;
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) qVar.f14587b).S.f9601d).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            throw null;
        }
        w3 w3Var = ((Toolbar) qVar.f14587b).U;
        return w3Var != null && ((w0) w3Var).f12982a.f12989d.onMenuItemSelected(0, menuItem);
    }

    @Override // o0.g
    public final ContentInfo o() {
        return (ContentInfo) this.f14587b;
    }

    @Override // o0.g
    public final int p() {
        return ((ContentInfo) this.f14587b).getSource();
    }

    @Override // k.m
    public final void q(o oVar) {
        m mVar = ((ActionMenuView) this.f14587b).H;
        if (mVar != null) {
            mVar.q(oVar);
        }
    }

    @Override // v3.b
    public final void r(Bundle bundle) {
        ((u3.c) this.f14587b).a0();
    }

    public Typeface s(Context context, f0.g gVar, Resources resources, int i10) {
        long jLongValue;
        f0.h hVar = (f0.h) w(gVar.f13017a, i10, new m2.f(9, this));
        if (hVar == null) {
            return null;
        }
        int i11 = hVar.f13023f;
        String str = hVar.f13018a;
        Typeface typefaceV = g0.g.f13608a.v(context, resources, i11, str, i10);
        if (typefaceV != null) {
            g0.g.f13609b.b(g0.g.b(resources, i11, str, 0, i10), typefaceV);
        }
        if (typefaceV == null) {
            jLongValue = 0;
        } else {
            try {
                Field declaredField = Typeface.class.getDeclaredField("native_instance");
                declaredField.setAccessible(true);
                jLongValue = ((Number) declaredField.get(typefaceV)).longValue();
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                jLongValue = 0;
            }
        }
        if (jLongValue != 0) {
            ((ConcurrentHashMap) this.f14587b).put(Long.valueOf(jLongValue), gVar);
        }
        return typefaceV;
    }

    public Typeface t(Context context, l0.i[] iVarArr, int i10) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (iVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(x(i10, iVarArr).f15114a);
            try {
                Typeface typefaceU = u(context, inputStreamOpenInputStream);
                z3.a.p(inputStreamOpenInputStream);
                return typefaceU;
            } catch (IOException unused) {
                z3.a.p(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                z3.a.p(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String toString() {
        switch (this.f14586a) {
            case 6:
                return "ContentInfoCompat{" + ((ContentInfo) this.f14587b) + "}";
            default:
                return super.toString();
        }
    }

    public Typeface u(Context context, InputStream inputStream) {
        File fileF = z3.a.F(context);
        if (fileF == null) {
            return null;
        }
        try {
            if (z3.a.s(fileF, inputStream)) {
                return Typeface.createFromFile(fileF.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileF.delete();
        }
    }

    public Typeface v(Context context, Resources resources, int i10, String str, int i11) {
        File fileF = z3.a.F(context);
        if (fileF == null) {
            return null;
        }
        try {
            if (z3.a.r(fileF, resources, i10)) {
                return Typeface.createFromFile(fileF.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileF.delete();
        }
    }

    public l0.i x(int i10, l0.i[] iVarArr) {
        return (l0.i) w(iVarArr, i10, new q(4, this));
    }

    public final long y() {
        return ((long) ((ByteBuffer) this.f14587b).getInt()) & 4294967295L;
    }

    public final void z(int i10) {
        Object obj = this.f14587b;
        ((ByteBuffer) obj).position(((ByteBuffer) obj).position() + i10);
    }

    @Override // g4.t0
    public final Object zza() {
        return new g4.q((Application) ((t0) this.f14587b).zza());
    }

    public /* synthetic */ q(int i10, Object obj) {
        this.f14586a = i10;
        this.f14587b = obj;
    }

    public q(InvocationHandler invocationHandler) {
        this.f14586a = 14;
        this.f14587b = (WebMessagePortBoundaryInterface) q7.b.f(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    public q(int i10) {
        Handler handler;
        Handler handlerA;
        this.f14586a = i10;
        if (i10 == 7) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                this.f14587b = new k1();
                return;
            } else if (i11 >= 29) {
                this.f14587b = new j1();
                return;
            } else {
                this.f14587b = new i1();
                return;
            }
        }
        if (i10 != 16) {
            if (i10 == 11) {
                this.f14587b = new HashMap();
                return;
            } else if (i10 != 12) {
                this.f14587b = new ConcurrentHashMap();
                return;
            } else {
                this.f14587b = new HashMap();
                return;
            }
        }
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handlerA = k0.e.a(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                handler = new Handler(mainLooper);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
                throw ((RuntimeException) cause);
            }
            handlerA = handler;
        }
        this.f14587b = handlerA;
    }

    public q(ByteBuffer byteBuffer) {
        this.f14586a = 10;
        this.f14587b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public q(ContentInfo contentInfo) {
        this.f14586a = 6;
        contentInfo.getClass();
        this.f14587b = rk1.m(contentInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(27, materialButtonToggleGroup);
        this.f14586a = 27;
    }
}
