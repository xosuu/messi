package androidx.activity;

import android.R;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.b0;
import androidx.lifecycle.x;
import androidx.viewpager.widget.ViewPager;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.balsikandar.crashreporter.ui.CrashReporterActivity;
import com.codetroopers.betterpickers.numberpicker.NumberPickerErrorTextView;
import com.codetroopers.betterpickers.radialtimepicker.RadialPickerLayout;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import de.blinkt.openvpn.core.OpenVPNService;
import f.y0;
import j3.t;
import j6.a0;
import j6.y;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import l.x1;
import o0.d0;
import o0.v0;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f143b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f142a = i10;
        this.f143b = obj;
    }

    private void b() {
        Object obj;
        synchronized (((x) this.f143b).f1008a) {
            obj = ((x) this.f143b).f1013f;
            ((x) this.f143b).f1013f = x.f1007k;
        }
        ((x) this.f143b).e(obj);
    }

    private void c() {
        ReentrantReadWriteLock.ReadLock lock = ((n1.i) this.f143b).f15839c.f15870h.readLock();
        HashSet hashSetA = null;
        try {
            try {
                lock.lock();
            } catch (SQLiteException | IllegalStateException unused) {
            }
            if (!((n1.i) this.f143b).a()) {
                lock.unlock();
                return;
            }
            if (!((n1.i) this.f143b).f15840d.compareAndSet(true, false)) {
                lock.unlock();
                return;
            }
            if (((s1.b) ((n1.i) this.f143b).f15839c.f15865c.y()).f16664a.inTransaction()) {
                lock.unlock();
                return;
            }
            Object obj = this.f143b;
            if (((n1.i) obj).f15839c.f15868f) {
                s1.b bVar = (s1.b) ((n1.i) obj).f15839c.f15865c.y();
                bVar.a();
                try {
                    hashSetA = a();
                    bVar.D();
                    bVar.c();
                } catch (Throwable th) {
                    bVar.c();
                    throw th;
                }
            } else {
                hashSetA = a();
            }
            lock.unlock();
            if (hashSetA == null || hashSetA.isEmpty()) {
                return;
            }
            synchronized (((n1.i) this.f143b).f15844h) {
                try {
                    n.e eVar = (n.e) ((n1.i) this.f143b).f15844h.iterator();
                    if (eVar.hasNext()) {
                        ((n1.h) ((Map.Entry) eVar.next()).getValue()).getClass();
                        throw null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    private void d() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f143b;
        String strB = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strB)) {
            c2.n nVarI = c2.n.i();
            int i10 = ConstraintTrackingWorker.f1197w;
            nVarI.h(new Throwable[0]);
            constraintTrackingWorker.f1201u.j(new c2.j());
            return;
        }
        ListenableWorker listenableWorkerA = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), strB, constraintTrackingWorker.f1198q);
        constraintTrackingWorker.f1202v = listenableWorkerA;
        if (listenableWorkerA == null) {
            c2.n nVarI2 = c2.n.i();
            int i11 = ConstraintTrackingWorker.f1197w;
            nVarI2.g(new Throwable[0]);
            constraintTrackingWorker.f1201u.j(new c2.j());
            return;
        }
        l2.j jVarH = d2.k.s0(constraintTrackingWorker.getApplicationContext()).f12332e.n().h(constraintTrackingWorker.getId().toString());
        if (jVarH == null) {
            constraintTrackingWorker.f1201u.j(new c2.j());
            return;
        }
        h2.c cVar = new h2.c(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
        cVar.c(Collections.singletonList(jVarH));
        if (!cVar.a(constraintTrackingWorker.getId().toString())) {
            c2.n nVarI3 = c2.n.i();
            int i12 = ConstraintTrackingWorker.f1197w;
            String.format("Constraints not met for delegate %s. Requesting retry.", strB);
            nVarI3.g(new Throwable[0]);
            constraintTrackingWorker.f1201u.j(new c2.k());
            return;
        }
        c2.n nVarI4 = c2.n.i();
        int i13 = ConstraintTrackingWorker.f1197w;
        String.format("Constraints met for delegate %s", strB);
        nVarI4.g(new Throwable[0]);
        try {
            n5.a aVarStartWork = constraintTrackingWorker.f1202v.startWork();
            aVarStartWork.a(new l.j(constraintTrackingWorker, 13, aVarStartWork), constraintTrackingWorker.getBackgroundExecutor());
        } catch (Throwable th) {
            c2.n nVarI5 = c2.n.i();
            int i14 = ConstraintTrackingWorker.f1197w;
            String.format("Delegated worker %s threw exception in startWork.", strB);
            nVarI5.g(th);
            synchronized (constraintTrackingWorker.f1199s) {
                try {
                    if (constraintTrackingWorker.f1200t) {
                        c2.n.i().g(new Throwable[0]);
                        constraintTrackingWorker.f1201u.j(new c2.k());
                    } else {
                        constraintTrackingWorker.f1201u.j(new c2.j());
                    }
                } finally {
                }
            }
        }
    }

    public final HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor cursorG = ((n1.i) this.f143b).f15839c.g(new f.f("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (cursorG.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(cursorG.getInt(0)));
            } catch (Throwable th) {
                cursorG.close();
                throw th;
            }
        }
        cursorG.close();
        if (!hashSet.isEmpty()) {
            ((n1.i) this.f143b).f15842f.D();
        }
        return hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View viewE;
        int width;
        int i10 = 0;
        int i11 = 1;
        switch (this.f142a) {
            case 0:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e10) {
                    if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e10;
                    }
                    return;
                }
            case 1:
                y0 y0Var = (y0) this.f143b;
                Window.Callback callback = y0Var.f12989d;
                Menu menuQ0 = y0Var.q0();
                k.o oVar = menuQ0 instanceof k.o ? (k.o) menuQ0 : null;
                if (oVar != null) {
                    oVar.w();
                }
                try {
                    menuQ0.clear();
                    if (!callback.onCreatePanelMenu(0, menuQ0) || !callback.onPreparePanel(0, null, menuQ0)) {
                        menuQ0.clear();
                        break;
                    }
                    if (oVar != null) {
                        oVar.v();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (oVar != null) {
                        oVar.v();
                    }
                    throw th;
                }
            case 2:
                g.h hVar = (g.h) this.f143b;
                hVar.a(true);
                hVar.invalidateSelf();
                return;
            case 3:
                x1 x1Var = (x1) this.f143b;
                x1Var.f15067x = null;
                x1Var.drawableStateChanged();
                return;
            case 4:
                ((Toolbar) this.f143b).v();
                return;
            case 5:
                s0.g gVar = (s0.g) this.f143b;
                if (gVar.A) {
                    if (gVar.f16652y) {
                        gVar.f16652y = false;
                        s0.a aVar = gVar.f16640a;
                        aVar.getClass();
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f16635e = jCurrentAnimationTimeMillis;
                        aVar.f16637g = -1L;
                        aVar.f16636f = jCurrentAnimationTimeMillis;
                        aVar.f16638h = 0.5f;
                    }
                    s0.a aVar2 = gVar.f16640a;
                    if ((aVar2.f16637g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f16637g + ((long) aVar2.f16639i)) || !gVar.f()) {
                        gVar.A = false;
                        return;
                    }
                    if (gVar.f16653z) {
                        gVar.f16653z = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        gVar.f16642d.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar2.f16636f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar2.a(jCurrentAnimationTimeMillis2);
                    long j10 = jCurrentAnimationTimeMillis2 - aVar2.f16636f;
                    aVar2.f16636f = jCurrentAnimationTimeMillis2;
                    s0.h.b(gVar.C, (int) (j10 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar2.f16634d));
                    View view = gVar.f16642d;
                    WeakHashMap weakHashMap = v0.f16075a;
                    d0.m(view, this);
                    return;
                }
                return;
            case 6:
                ((v0.e) this.f143b).o(0);
                return;
            case 7:
                x0.e eVar = (x0.e) this.f143b;
                int i12 = eVar.f18282c.f17705o;
                boolean z9 = eVar.f18281b == 3;
                DrawerLayout drawerLayout = eVar.f18284e;
                if (z9) {
                    viewE = drawerLayout.e(3);
                    width = (viewE != null ? -viewE.getWidth() : 0) + i12;
                } else {
                    viewE = drawerLayout.e(5);
                    width = drawerLayout.getWidth() - i12;
                }
                if (viewE != null) {
                    if (((!z9 || viewE.getLeft() >= width) && (z9 || viewE.getLeft() <= width)) || drawerLayout.i(viewE) != 0) {
                        return;
                    }
                    x0.d dVar = (x0.d) viewE.getLayoutParams();
                    eVar.f18282c.r(viewE, width, viewE.getTop());
                    dVar.f18279c = true;
                    drawerLayout.invalidate();
                    int i13 = eVar.f18281b == 3 ? 5 : 3;
                    DrawerLayout drawerLayout2 = eVar.f18284e;
                    View viewE2 = drawerLayout2.e(i13);
                    if (viewE2 != null) {
                        drawerLayout2.b(viewE2);
                    }
                    if (drawerLayout.D) {
                        return;
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    while (i10 < childCount) {
                        drawerLayout.getChildAt(i10).dispatchTouchEvent(motionEventObtain2);
                        i10++;
                    }
                    motionEventObtain2.recycle();
                    drawerLayout.D = true;
                    return;
                }
                return;
            case 8:
                b();
                return;
            case 9:
                b0 b0Var = (b0) this.f143b;
                if (b0Var.f949b == 0) {
                    b0Var.f950d = true;
                    b0Var.f953q.e(androidx.lifecycle.k.ON_PAUSE);
                }
                if (b0Var.f948a == 0 && b0Var.f950d) {
                    b0Var.f953q.e(androidx.lifecycle.k.ON_STOP);
                    b0Var.f951f = true;
                    return;
                }
                return;
            case 10:
                c();
                return;
            case 11:
                ViewPager viewPager = (ViewPager) this.f143b;
                viewPager.setScrollState(0);
                viewPager.t();
                return;
            case 12:
                Object obj = this.f143b;
                try {
                    ((Worker) obj).f1167q.j(((Worker) obj).doWork());
                    return;
                } catch (Throwable th2) {
                    ((Worker) obj).f1167q.k(th2);
                    return;
                }
            case 13:
                d();
                return;
            case 14:
                x2.c cVar = ((CrashReporterActivity) ((e) this.f143b).f143b).G.f18385g.f20447h0;
                if (cVar != null) {
                    cVar.f18380f = y2.a.Z();
                    cVar.d();
                    return;
                }
                return;
            case 15:
                File[] fileArrListFiles = new File(TextUtils.isEmpty(null) ? z2.b.a() : null).listFiles();
                int length = fileArrListFiles.length;
                while (i10 < length) {
                    b4.f.i(fileArrListFiles[i10]);
                    i10++;
                }
                ((CrashReporterActivity) this.f143b).runOnUiThread(new e(14, this));
                return;
            case 16:
                NumberPickerErrorTextView numberPickerErrorTextView = (NumberPickerErrorTextView) this.f143b;
                numberPickerErrorTextView.f1715b.removeCallbacks(numberPickerErrorTextView.f1714a);
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(numberPickerErrorTextView.getContext(), R.anim.fade_out);
                animationLoadAnimation.setAnimationListener(new d3.a(numberPickerErrorTextView, i11));
                numberPickerErrorTextView.startAnimation(animationLoadAnimation);
                return;
            case 17:
                RadialPickerLayout radialPickerLayout = (RadialPickerLayout) this.f143b;
                radialPickerLayout.f1735y.setAmOrPmPressed(radialPickerLayout.G);
                radialPickerLayout.f1735y.invalidate();
                return;
            case 18:
                zzbh zzbhVar = ((t) this.f143b).f14353a.f2045a;
                if (zzbhVar != null) {
                    try {
                        zzbhVar.zze(1);
                        return;
                    } catch (RemoteException e11) {
                        zzm.zzk("Could not notify onAdFailedToLoad event.", e11);
                        return;
                    }
                }
                return;
            case 19:
                zzbh zzbhVar2 = ((zzew) this.f143b).f2046a;
                if (zzbhVar2 != null) {
                    try {
                        zzbhVar2.zze(1);
                        return;
                    } catch (RemoteException e12) {
                        zzm.zzk("Could not notify onAdFailedToLoad event.", e12);
                        return;
                    }
                }
                return;
            case 20:
                zzb zzbVar = (zzb) this.f143b;
                Thread.currentThread();
                zzbVar.getClass();
                zzbVar.zza();
                return;
            case sf.zzm /* 21 */:
                d4.f fVar = (d4.f) this.f143b;
                long j11 = fVar.f12358a.getSharedPreferences("app_set_id_storage", 0).getLong("app_set_id_last_used_time", -1L);
                long j12 = j11 != -1 ? j11 + 33696000000L : -1L;
                if (j12 == -1 || System.currentTimeMillis() <= j12) {
                    return;
                }
                Context context = fVar.f12358a;
                if (!context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    if (strValueOf.length() != 0) {
                        "Failed to clear app set ID generated for App ".concat(strValueOf);
                    }
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context.getPackageName());
                if (strValueOf2.length() != 0) {
                    "Failed to clear app set ID last used time for App ".concat(strValueOf2);
                    return;
                }
                return;
            case 22:
                zzg zzgVar = new zzg(4, "Web view timed out.");
                g4.j jVar = (g4.j) ((g4.k) this.f143b).f13743i.getAndSet(null);
                if (jVar == null) {
                    return;
                }
                jVar.d(zzgVar.a());
                return;
            case 23:
                ((l5.c) this.f143b).e();
                return;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                u3.j jVar2 = (u3.j) this.f143b;
                jVar2.f17586c = false;
                v0.e eVar2 = ((BottomSheetBehavior) jVar2.f17585b).M;
                if (eVar2 != null && eVar2.g()) {
                    jVar2.a(jVar2.f17587d);
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) jVar2.f17585b;
                if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.B(jVar2.f17587d);
                    return;
                }
                return;
            case 25:
                View view2 = (View) this.f143b;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 1);
                return;
            case 26:
                Object obj2 = this.f143b;
                try {
                    ((f6.i) obj2).i();
                    throw null;
                } catch (IOException e13) {
                    c6.a aVar3 = f6.i.f13177q;
                    aVar3.getClass();
                    f6.i iVar = (f6.i) obj2;
                    if (iVar.g() == null) {
                        aVar3.f1578a.log(Level.FINE, "Receive thread: error in receiveLoop", (Throwable) e13);
                    }
                    iVar.c(e13, false);
                    aVar3.b(50, "Receive thread: back from receiveLoop");
                    if (iVar.f13189k != null) {
                        try {
                            ((f6.i) obj2).f13189k.a(e13);
                            break;
                        } catch (IOException unused) {
                        }
                    }
                    while (i10 < iVar.f13190l.size()) {
                        try {
                            ((f6.h) iVar.f13190l.elementAt(i10)).f13174a.a(e13);
                        } catch (Exception unused2) {
                        }
                        i10++;
                    }
                    return;
                }
            case 27:
                j6.c cVar2 = (j6.c) this.f143b;
                if (cVar2.f14379d != 2) {
                    return;
                }
                cVar2.f14379d = 3;
                if (cVar2.f14380f == 2) {
                    cVar2.f14380f = 3;
                }
                ((y) cVar2.f14378b).c(cVar2.a());
                return;
            case 28:
                OpenVPNService openVPNService = (OpenVPNService) this.f143b;
                if (openVPNService.f12557x != null) {
                    openVPNService.E1();
                }
                OpenVPNService openVPNService2 = (OpenVPNService) this.f143b;
                y yVar = openVPNService2.B;
                synchronized (openVPNService2) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    j6.c cVar3 = new j6.c(yVar);
                    openVPNService2.f12557x = cVar3;
                    cVar3.b(openVPNService2);
                    b4.f.g(openVPNService2, openVPNService2.f12557x, intentFilter);
                    de.blinkt.openvpn.core.c.a(openVPNService2.f12557x);
                }
                return;
            default:
                y yVar2 = (y) this.f143b;
                String string = Integer.toString(9050);
                Vector vector = y.A;
                yVar2.g(3, "127.0.0.1", string, false);
                a0.b().c(yVar2.f14445y);
                return;
        }
    }

    public /* synthetic */ e(d4.f fVar) {
        this.f142a = 21;
        this.f143b = fVar;
    }
}
