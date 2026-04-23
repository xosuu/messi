package f;

import android.R;
import android.animation.Animator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.k7;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.ads.zzapq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f implements c, k0.a, r1.e, o0.t, c2.u, k7, CustomEventBannerListener, CustomEventNativeListener, k4.b, com.google.gson.internal.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12832b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12833d;

    public /* synthetic */ f(Object obj, int i10, Object obj2) {
        this.f12831a = i10;
        this.f12832b = obj;
        this.f12833d = obj2;
    }

    public final void A(boolean z9) {
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f12833d).f799r;
        if (sVar != null) {
            sVar.p().f794m.A(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public final KeyListener B(KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? ((d5.e) ((z0.b) this.f12833d).f20648c).j(keyListener) : keyListener;
    }

    public final void C(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f12832b).getContext().obtainStyledAttributes(attributeSet, e.a.f12602i, i10, 0);
        try {
            boolean z9 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((d5.e) ((z0.b) this.f12833d).f20648c).t(z9);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection D(InputConnection inputConnection, EditorInfo editorInfo) {
        z0.b bVar = (z0.b) this.f12833d;
        if (inputConnection != null) {
            return ((d5.e) bVar.f20648c).p(inputConnection, editorInfo);
        }
        bVar.getClass();
        return null;
    }

    public final void E(l0.g gVar) {
        int i10 = gVar.f15109b;
        if (i10 != 0) {
            ((Handler) this.f12833d).post(new b.d(this, (m2.f) this.f12832b, i10, 5, 0));
        } else {
            m2.f fVar = (m2.f) this.f12832b;
            ((Handler) this.f12833d).post(new l0.a(this, fVar, gVar.f15108a, 0));
        }
    }

    public final void F(int i10, int i11, int i12, int i13) {
        ((CardView) this.f12833d).f406f.set(i10, i11, i12, i13);
        Object obj = this.f12833d;
        super/*android.widget.FrameLayout*/.setPadding(i10 + ((CardView) obj).f405d.left, i11 + ((CardView) obj).f405d.top, i12 + ((CardView) obj).f405d.right, i13 + ((CardView) obj).f405d.bottom);
    }

    public final void G(q7.b bVar) {
        boolean z9;
        androidx.lifecycle.x xVar = (androidx.lifecycle.x) this.f12832b;
        synchronized (xVar.f1008a) {
            z9 = xVar.f1013f == androidx.lifecycle.x.f1007k;
            xVar.f1013f = bVar;
        }
        if (z9) {
            m.a.r0().s0(xVar.f1017j);
        }
        if (bVar instanceof c2.t) {
            ((n2.i) this.f12833d).j((c2.t) bVar);
        } else if (bVar instanceof c2.r) {
            ((n2.i) this.f12833d).k(((c2.r) bVar).f1544b);
        }
    }

    public final void H() {
        ((u3.k) ((l.j) this.f12833d).f14877d).getClass();
        throw null;
    }

    public final int I(Context context, v3.h hVar) {
        z3.a.l(context);
        z3.a.l(hVar);
        int i10 = 0;
        if (!hVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = hVar.getMinApkVersion();
        int iC = ((SparseIntArray) this.f12832b).get(minApkVersion, -1);
        if (iC == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= ((SparseIntArray) this.f12832b).size()) {
                    i10 = -1;
                    break;
                }
                int iKeyAt = ((SparseIntArray) this.f12832b).keyAt(i11);
                if (iKeyAt > minApkVersion && ((SparseIntArray) this.f12832b).get(iKeyAt) == 0) {
                    break;
                }
                i11++;
            }
            iC = i10 == -1 ? ((s3.d) this.f12833d).c(context, minApkVersion) : i10;
            ((SparseIntArray) this.f12832b).put(minApkVersion, iC);
        }
        return iC;
    }

    public final void J(boolean z9, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f12832b)) {
            map = new HashMap((Map) this.f12832b);
        }
        synchronized (((Map) this.f12833d)) {
            map2 = new HashMap((Map) this.f12833d);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z9 || ((Boolean) entry.getValue()).booleanValue()) {
                fb1.t(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z9 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((k4.e) entry2.getKey()).a(new ApiException(status));
            }
        }
    }

    @Override // f.c
    public final void a(g.i iVar, int i10) {
        ActionBar actionBar = ((Activity) this.f12832b).getActionBar();
        if (actionBar != null) {
            e.b(actionBar, iVar);
            e.a(actionBar, i10);
        }
    }

    @Override // k0.a
    public final void b() {
        ((Animator) this.f12832b).end();
    }

    @Override // r1.e
    public final String c() {
        return (String) this.f12832b;
    }

    @Override // f.c
    public final boolean d() {
        ActionBar actionBar = ((Activity) this.f12832b).getActionBar();
        return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(zzapq zzapqVar) {
        zzm.zzj("Failed to load URL: " + ((String) this.f12832b) + "\n" + zzapqVar.toString());
        ((l3.e) this.f12833d).b(null);
    }

    @Override // com.google.gson.internal.l
    public final Object f() {
        try {
            return com.google.gson.internal.u.f12230a.a((Class) this.f12832b);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + ((Class) this.f12832b) + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    public final void g(Object obj, String str) {
        ((List) this.f12832b).add(fb1.x(str, "=", String.valueOf(obj)));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    @Override // o0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o0.t1 h(android.view.View r18, o0.t1 r19) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.f.h(android.view.View, o0.t1):o0.t1");
    }

    @Override // k4.b
    public final void i(k4.l lVar) {
        ((Map) ((f) this.f12833d).f12833d).remove((k4.e) this.f12832b);
    }

    public final void j(boolean z9) {
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f12833d).f799r;
        if (sVar != null) {
            sVar.p().f794m.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    @Override // f.c
    public final Drawable k() {
        TypedArray typedArrayObtainStyledAttributes = o().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    @Override // f.c
    public final void l(int i10) {
        ActionBar actionBar = ((Activity) this.f12832b).getActionBar();
        if (actionBar != null) {
            e.a(actionBar, i10);
        }
    }

    public final void m(boolean z9) {
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f12833d;
        Context context = j0Var.f797p.f914y;
        androidx.fragment.app.s sVar = j0Var.f799r;
        if (sVar != null) {
            sVar.p().f794m.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public final void n(boolean z9) {
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f12833d).f799r;
        if (sVar != null) {
            sVar.p().f794m.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    @Override // f.c
    public final Context o() {
        ActionBar actionBar = ((Activity) this.f12832b).getActionBar();
        return actionBar != null ? actionBar.getThemedContext() : (Activity) this.f12832b;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        switch (this.f12831a) {
            case 15:
                zzm.zze("Custom event adapter called onAdClicked.");
                ((MediationBannerListener) this.f12833d).onAdClicked((CustomEventAdapter) this.f12832b);
                break;
            default:
                zzm.zze("Custom event adapter called onAdClicked.");
                ((MediationNativeListener) this.f12833d).onAdClicked((CustomEventAdapter) this.f12832b);
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        switch (this.f12831a) {
            case 15:
                zzm.zze("Custom event adapter called onAdClosed.");
                ((MediationBannerListener) this.f12833d).onAdClosed((CustomEventAdapter) this.f12832b);
                break;
            default:
                zzm.zze("Custom event adapter called onAdClosed.");
                ((MediationNativeListener) this.f12833d).onAdClosed((CustomEventAdapter) this.f12832b);
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i10) {
        switch (this.f12831a) {
            case 15:
                zzm.zze("Custom event adapter called onAdFailedToLoad.");
                ((MediationBannerListener) this.f12833d).onAdFailedToLoad((CustomEventAdapter) this.f12832b, i10);
                break;
            default:
                zzm.zze("Custom event adapter called onAdFailedToLoad.");
                ((MediationNativeListener) this.f12833d).onAdFailedToLoad((CustomEventAdapter) this.f12832b, i10);
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdImpression() {
        zzm.zze("Custom event adapter called onAdImpression.");
        ((MediationNativeListener) this.f12833d).onAdImpression((CustomEventAdapter) this.f12832b);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        switch (this.f12831a) {
            case 15:
                zzm.zze("Custom event adapter called onAdLeftApplication.");
                ((MediationBannerListener) this.f12833d).onAdLeftApplication((CustomEventAdapter) this.f12832b);
                break;
            default:
                zzm.zze("Custom event adapter called onAdLeftApplication.");
                ((MediationNativeListener) this.f12833d).onAdLeftApplication((CustomEventAdapter) this.f12832b);
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
    public final void onAdLoaded(View view) {
        zzm.zze("Custom event adapter called onAdLoaded.");
        Object obj = this.f12832b;
        ((CustomEventAdapter) obj).f2319a = view;
        ((MediationBannerListener) this.f12833d).onAdLoaded((CustomEventAdapter) obj);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        switch (this.f12831a) {
            case 15:
                zzm.zze("Custom event adapter called onAdOpened.");
                ((MediationBannerListener) this.f12833d).onAdOpened((CustomEventAdapter) this.f12832b);
                break;
            default:
                zzm.zze("Custom event adapter called onAdOpened.");
                ((MediationNativeListener) this.f12833d).onAdOpened((CustomEventAdapter) this.f12832b);
                break;
        }
    }

    public final void p(boolean z9) {
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f12833d).f799r;
        if (sVar != null) {
            sVar.p().f794m.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public final void q(boolean z9) {
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f12833d).f799r;
        if (sVar != null) {
            sVar.p().f794m.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public final void r(boolean z9) {
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f12833d).f799r;
        if (sVar != null) {
            sVar.p().f794m.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public final void s(boolean z9) {
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f12833d;
        Context context = j0Var.f797p.f914y;
        androidx.fragment.app.s sVar = j0Var.f799r;
        if (sVar != null) {
            sVar.p().f794m.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public final void t(boolean z9) {
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f12833d).f799r;
        if (sVar != null) {
            sVar.p().f794m.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public final String toString() {
        switch (this.f12831a) {
            case sf.zzm /* 21 */:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f12833d.getClass().getSimpleName());
                sb.append('{');
                int size = ((List) this.f12832b).size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb.append((String) ((List) this.f12832b).get(i10));
                    if (i10 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // r1.e
    public final void u(s1.f fVar) {
        Object[] objArr = (Object[]) this.f12833d;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            if (obj == null) {
                fVar.u(i10);
            } else if (obj instanceof byte[]) {
                fVar.a((byte[]) obj, i10);
            } else if (obj instanceof Float) {
                fVar.c(i10, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                fVar.c(i10, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                fVar.e(i10, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                fVar.e(i10, ((Integer) obj).intValue());
            } else if (obj instanceof Short) {
                fVar.e(i10, ((Short) obj).shortValue());
            } else if (obj instanceof Byte) {
                fVar.e(i10, ((Byte) obj).byteValue());
            } else if (obj instanceof String) {
                fVar.A(i10, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
                fVar.e(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public final void v(boolean z9) {
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f12833d).f799r;
        if (sVar != null) {
            sVar.p().f794m.v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public final void w(boolean z9) {
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f12833d).f799r;
        if (sVar != null) {
            sVar.p().f794m.w(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public final void x(boolean z9) {
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f12833d).f799r;
        if (sVar != null) {
            sVar.p().f794m.x(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public final void y(boolean z9) {
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f12833d).f799r;
        if (sVar != null) {
            sVar.p().f794m.y(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public final void z(boolean z9) {
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f12833d).f799r;
        if (sVar != null) {
            sVar.p().f794m.z(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12832b).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, int i10) {
        this.f12831a = i10;
        this.f12833d = obj;
        this.f12832b = obj2;
    }

    public f(String str, l3.e eVar) {
        this.f12831a = 14;
        this.f12832b = str;
        this.f12833d = eVar;
    }

    public f(l.j jVar, AlertDialog alertDialog) {
        this.f12831a = 20;
        this.f12833d = jVar;
        this.f12832b = alertDialog;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        zzm.zze("Custom event adapter called onAdLoaded.");
        ((MediationNativeListener) this.f12833d).onAdLoaded((CustomEventAdapter) this.f12832b, unifiedNativeAdMapper);
    }

    public /* synthetic */ f(Object obj) {
        this.f12831a = 21;
        z3.a.l(obj);
        this.f12833d = obj;
        this.f12832b = new ArrayList();
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        switch (this.f12831a) {
            case 15:
                zzm.zze("Custom event adapter called onAdFailedToLoad.");
                ((MediationBannerListener) this.f12833d).onAdFailedToLoad((CustomEventAdapter) this.f12832b, adError);
                break;
            default:
                zzm.zze("Custom event adapter called onAdFailedToLoad.");
                ((MediationNativeListener) this.f12833d).onAdFailedToLoad((CustomEventAdapter) this.f12832b, adError);
                break;
        }
    }

    public f() {
        s3.c cVar = s3.c.f16685d;
        this.f12831a = 22;
        this.f12832b = new SparseIntArray();
        this.f12833d = cVar;
    }

    public f(int i10) {
        this.f12831a = i10;
        if (i10 == 19) {
            this.f12832b = Collections.synchronizedMap(new WeakHashMap());
            this.f12833d = Collections.synchronizedMap(new WeakHashMap());
        } else if (i10 != 25) {
            this.f12832b = new androidx.lifecycle.x();
            this.f12833d = new n2.i();
            G(c2.u.f1546e);
        } else {
            this.f12832b = new Rect();
            this.f12833d = new Rect();
        }
    }

    public f(TextView textView) {
        this.f12831a = 2;
        textView.getClass();
        this.f12832b = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(String str) {
        this(str, 10, (Object) null);
        this.f12831a = 10;
    }

    public f(EditText editText) {
        this.f12831a = 1;
        this.f12832b = editText;
        this.f12833d = new z0.b(editText);
    }

    public f(androidx.fragment.app.j0 j0Var) {
        this.f12831a = 8;
        this.f12832b = new CopyOnWriteArrayList();
        this.f12833d = j0Var;
    }

    public f(ArrayList arrayList, ArrayList arrayList2) {
        this.f12831a = 5;
        int size = arrayList.size();
        this.f12832b = new int[size];
        this.f12833d = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f12832b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f12833d)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public f(int i10, int i11) {
        this.f12831a = 5;
        this.f12832b = new int[]{i10, i11};
        this.f12833d = new float[]{0.0f, 1.0f};
    }

    public f(int i10, int i11, int i12) {
        this.f12831a = 5;
        this.f12832b = new int[]{i10, i11, i12};
        this.f12833d = new float[]{0.0f, 0.5f, 1.0f};
    }

    public f(ViewPager viewPager) {
        this.f12831a = 11;
        this.f12833d = viewPager;
        this.f12832b = new Rect();
    }

    public f(CardView cardView) {
        this.f12831a = 4;
        this.f12833d = cardView;
    }

    public f(Activity activity) {
        this.f12831a = 0;
        this.f12832b = activity;
    }

    public f(v5.g gVar, v5.b bVar) {
        this.f12831a = 29;
        this.f12833d = gVar;
        v5.f fVar = (v5.f) gVar.f17823d.get(bVar);
        this.f12832b = fVar;
        if (fVar == null) {
            v5.f fVar2 = new v5.f(bVar);
            this.f12832b = fVar2;
            gVar.f17823d.put(bVar, fVar2);
            gVar.f17824f.add((v5.f) this.f12832b);
        }
    }
}
