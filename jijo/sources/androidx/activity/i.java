package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.w;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.s;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.ur0;
import g4.a0;
import g4.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends androidx.core.app.k implements o0, androidx.lifecycle.h, q1.f, q, androidx.activity.result.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.a f146b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ur0 f147d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f148f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q1.e f149h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n0 f150q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicInteger f152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f f153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArrayList f154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList f155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CopyOnWriteArrayList f157y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CopyOnWriteArrayList f158z;

    public i() {
        q1.c cVar;
        this.f496a = new s(this);
        this.f146b = new c.a();
        int i10 = 0;
        this.f147d = new ur0(new b(i10, this));
        s sVar = new s(this);
        this.f148f = sVar;
        q1.e eVar = new q1.e(this);
        this.f149h = eVar;
        this.f151s = new p(new e(i10, this));
        this.f152t = new AtomicInteger();
        final w wVar = (w) this;
        this.f153u = new f(wVar);
        this.f154v = new CopyOnWriteArrayList();
        this.f155w = new CopyOnWriteArrayList();
        this.f156x = new CopyOnWriteArrayList();
        this.f157y = new CopyOnWriteArrayList();
        this.f158z = new CopyOnWriteArrayList();
        sVar.a(new androidx.lifecycle.o() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.o
            public final void a(androidx.lifecycle.q qVar, androidx.lifecycle.k kVar) {
                if (kVar == androidx.lifecycle.k.ON_STOP) {
                    Window window = wVar.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        sVar.a(new androidx.lifecycle.o() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.o
            public final void a(androidx.lifecycle.q qVar, androidx.lifecycle.k kVar) {
                if (kVar == androidx.lifecycle.k.ON_DESTROY) {
                    wVar.f146b.f1490a = null;
                    if (wVar.isChangingConfigurations()) {
                        return;
                    }
                    wVar.f().a();
                }
            }
        });
        sVar.a(new androidx.lifecycle.o() { // from class: androidx.activity.ComponentActivity$5
            @Override // androidx.lifecycle.o
            public final void a(androidx.lifecycle.q qVar, androidx.lifecycle.k kVar) {
                i iVar = wVar;
                if (iVar.f150q == null) {
                    h hVar = (h) iVar.getLastNonConfigurationInstance();
                    if (hVar != null) {
                        iVar.f150q = hVar.f145a;
                    }
                    if (iVar.f150q == null) {
                        iVar.f150q = new n0();
                    }
                }
                iVar.f148f.b(this);
            }
        });
        eVar.a();
        androidx.lifecycle.l lVar = sVar.f993e;
        a0.e(lVar, "lifecycle.currentState");
        if (lVar != androidx.lifecycle.l.f981b && lVar != androidx.lifecycle.l.f982d) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        q1.d dVar = eVar.f16385b;
        dVar.getClass();
        Iterator it = dVar.f16378a.iterator();
        while (true) {
            n.e eVar2 = (n.e) it;
            if (!eVar2.hasNext()) {
                cVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) eVar2.next();
            a0.e(entry, "components");
            String str = (String) entry.getKey();
            cVar = (q1.c) entry.getValue();
            if (a0.b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            h0 h0Var = new h0(this.f149h.f16385b, wVar);
            this.f149h.f16385b.b("androidx.lifecycle.internal.SavedStateHandlesProvider", h0Var);
            this.f148f.a(new SavedStateHandleAttacher(h0Var));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            s sVar2 = this.f148f;
            ImmLeaksCleaner immLeaksCleaner = new ImmLeaksCleaner();
            immLeaksCleaner.f133a = this;
            sVar2.a(immLeaksCleaner);
        }
        this.f149h.f16385b.b("android:support:activity-result", new q1.c() { // from class: androidx.activity.c
            @Override // q1.c
            public final Bundle a() {
                i iVar = wVar;
                iVar.getClass();
                Bundle bundle = new Bundle();
                f fVar = iVar.f153u;
                fVar.getClass();
                HashMap map = fVar.f192c;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(fVar.f194e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) fVar.f197h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", fVar.f190a);
                return bundle;
            }
        });
        k(new c.b() { // from class: androidx.activity.d
            @Override // c.b
            public final void a() {
                i iVar = wVar;
                Bundle bundleA = iVar.f149h.f16385b.a("android:support:activity-result");
                if (bundleA != null) {
                    f fVar = iVar.f153u;
                    fVar.getClass();
                    ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    fVar.f194e = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    fVar.f190a = (Random) bundleA.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                    Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = fVar.f197h;
                    bundle2.putAll(bundle);
                    for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                        String str2 = stringArrayList.get(i11);
                        HashMap map = fVar.f192c;
                        boolean zContainsKey = map.containsKey(str2);
                        HashMap map2 = fVar.f191b;
                        if (zContainsKey) {
                            Integer num = (Integer) map.remove(str2);
                            if (!bundle2.containsKey(str2)) {
                                map2.remove(num);
                            }
                        }
                        int iIntValue = integerArrayList.get(i11).intValue();
                        String str3 = stringArrayList.get(i11);
                        map2.put(Integer.valueOf(iIntValue), str3);
                        map.put(str3, Integer.valueOf(iIntValue));
                    }
                }
            }
        });
    }

    @Override // q1.f
    public final q1.d a() {
        return this.f149h.f16385b;
    }

    @Override // androidx.lifecycle.h
    public final c1.b d() {
        c1.e eVar = new c1.e(c1.a.f1497b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = eVar.f1498a;
        if (application != null) {
            linkedHashMap.put(l0.f986a, getApplication());
        }
        linkedHashMap.put(f0.f963a, this);
        linkedHashMap.put(f0.f964b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(f0.f965c, getIntent().getExtras());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.o0
    public final n0 f() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f150q == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f150q = hVar.f145a;
            }
            if (this.f150q == null) {
                this.f150q = new n0();
            }
        }
        return this.f150q;
    }

    @Override // androidx.lifecycle.q
    public final s h() {
        return this.f148f;
    }

    public final void k(c.b bVar) {
        c.a aVar = this.f146b;
        if (((Context) aVar.f1490a) != null) {
            bVar.a();
        }
        ((Set) aVar.f1491b).add(bVar);
    }

    public final androidx.activity.result.c l(androidx.activity.result.a aVar, t3.i iVar) {
        return this.f153u.c("activity_rq#" + this.f152t.getAndIncrement(), this, iVar, aVar);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f153u.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f151s.b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f154v.iterator();
        while (it.hasNext()) {
            ((n0.a) it.next()).a(configuration);
        }
    }

    @Override // androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f149h.b(bundle);
        c.a aVar = this.f146b;
        aVar.f1490a = this;
        Iterator it = ((Set) aVar.f1491b).iterator();
        while (it.hasNext()) {
            ((c.b) it.next()).a();
        }
        super.onCreate(bundle);
        d0.c(this);
        if (p7.q.m()) {
            p pVar = this.f151s;
            pVar.f170e = g.a(this);
            pVar.c();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f147d.f9601d).iterator();
        if (!it.hasNext()) {
            return true;
        }
        fb1.t(it.next());
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f147d.f9601d).iterator();
        if (!it.hasNext()) {
            return false;
        }
        fb1.t(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z9, Configuration configuration) {
        super.onMultiWindowModeChanged(z9, configuration);
        Iterator it = this.f157y.iterator();
        while (it.hasNext()) {
            ((n0.a) it.next()).a(new d5.e());
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f156x.iterator();
        while (it.hasNext()) {
            ((n0.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f147d.f9601d).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            throw null;
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z9, Configuration configuration) {
        super.onPictureInPictureModeChanged(z9, configuration);
        Iterator it = this.f158z.iterator();
        while (it.hasNext()) {
            ((n0.a) it.next()).a(new d5.e());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f147d.f9601d).iterator();
        if (!it.hasNext()) {
            return true;
        }
        fb1.t(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.f153u.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        n0 n0Var = this.f150q;
        if (n0Var == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            n0Var = hVar.f145a;
        }
        if (n0Var == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f145a = n0Var;
        return hVar2;
    }

    @Override // androidx.core.app.k, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        s sVar = this.f148f;
        if (sVar instanceof s) {
            androidx.lifecycle.l lVar = androidx.lifecycle.l.f982d;
            sVar.d("setCurrentState");
            sVar.f(lVar);
        }
        super.onSaveInstanceState(bundle);
        this.f149h.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.f155w.iterator();
        while (it.hasNext()) {
            ((n0.a) it.next()).a(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (z.p()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        getWindow().getDecorView().setTag(R.id.yc, this);
        getWindow().getDecorView().setTag(R.id.yf, this);
        View decorView = getWindow().getDecorView();
        a0.f(decorView, "<this>");
        decorView.setTag(R.id.ye, this);
        View decorView2 = getWindow().getDecorView();
        a0.f(decorView2, "<this>");
        decorView2.setTag(R.id.yd, this);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
