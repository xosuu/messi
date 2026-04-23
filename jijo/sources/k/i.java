package k;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.m2;
import l.q2;
import l.x1;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class i extends y implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View A;
    public View B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean I;
    public c0 J;
    public ViewTreeObserver K;
    public PopupWindow.OnDismissListener L;
    public boolean M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f14517b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14518d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14519f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14520h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f14521q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f14522s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f14525v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f14526w;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f14523t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f14524u = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m2.f f14527x = new m2.f(4, this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14528y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f14529z = 0;
    public boolean H = false;

    public i(Context context, View view, int i10, int i11, boolean z9) {
        this.f14525v = new e(i, this);
        this.f14526w = new f(i, this);
        this.f14517b = context;
        this.A = view;
        this.f14519f = i10;
        this.f14520h = i11;
        this.f14521q = z9;
        WeakHashMap weakHashMap = v0.f16075a;
        this.C = o0.e0.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f14518d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.x));
        this.f14522s = new Handler();
    }

    @Override // k.h0
    public final boolean a() {
        ArrayList arrayList = this.f14524u;
        return arrayList.size() > 0 && ((h) arrayList.get(0)).f14514a.L.isShowing();
    }

    @Override // k.d0
    public final void b(o oVar, boolean z9) {
        ArrayList arrayList = this.f14524u;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (oVar == ((h) arrayList.get(i10)).f14515b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((h) arrayList.get(i11)).f14515b.c(false);
        }
        h hVar = (h) arrayList.remove(i10);
        hVar.f14515b.r(this);
        boolean z10 = this.M;
        q2 q2Var = hVar.f14514a;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 23) {
                m2.b(q2Var.L, null);
            } else {
                q2Var.getClass();
            }
            q2Var.L.setAnimationStyle(0);
        }
        q2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.C = ((h) arrayList.get(size2 - 1)).f14516c;
        } else {
            View view = this.A;
            WeakHashMap weakHashMap = v0.f16075a;
            this.C = o0.e0.d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z9) {
                ((h) arrayList.get(0)).f14515b.c(false);
                return;
            }
            return;
        }
        dismiss();
        c0 c0Var = this.J;
        if (c0Var != null) {
            c0Var.b(oVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.K;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.K.removeGlobalOnLayoutListener(this.f14525v);
            }
            this.K = null;
        }
        this.B.removeOnAttachStateChangeListener(this.f14526w);
        this.L.onDismiss();
    }

    @Override // k.d0
    public final boolean d(j0 j0Var) {
        for (h hVar : this.f14524u) {
            if (j0Var == hVar.f14515b) {
                hVar.f14514a.f14910d.requestFocus();
                return true;
            }
        }
        if (!j0Var.hasVisibleItems()) {
            return false;
        }
        o(j0Var);
        c0 c0Var = this.J;
        if (c0Var != null) {
            c0Var.i(j0Var);
        }
        return true;
    }

    @Override // k.h0
    public final void dismiss() {
        ArrayList arrayList = this.f14524u;
        int size = arrayList.size();
        if (size > 0) {
            h[] hVarArr = (h[]) arrayList.toArray(new h[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                h hVar = hVarArr[i10];
                if (hVar.f14514a.L.isShowing()) {
                    hVar.f14514a.dismiss();
                }
            }
        }
    }

    @Override // k.h0
    public final void e() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f14523t;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y((o) it.next());
        }
        arrayList.clear();
        View view = this.A;
        this.B = view;
        if (view != null) {
            boolean z9 = this.K == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.K = viewTreeObserver;
            if (z9) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f14525v);
            }
            this.B.addOnAttachStateChangeListener(this.f14526w);
        }
    }

    @Override // k.d0
    public final void g(Parcelable parcelable) {
    }

    @Override // k.d0
    public final void h() {
        Iterator it = this.f14524u.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((h) it.next()).f14514a.f14910d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((l) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.h0
    public final x1 i() {
        ArrayList arrayList = this.f14524u;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((h) arrayList.get(arrayList.size() - 1)).f14514a.f14910d;
    }

    @Override // k.d0
    public final void j(c0 c0Var) {
        this.J = c0Var;
    }

    @Override // k.d0
    public final boolean m() {
        return false;
    }

    @Override // k.d0
    public final Parcelable n() {
        return null;
    }

    @Override // k.y
    public final void o(o oVar) {
        oVar.b(this, this.f14517b);
        if (a()) {
            y(oVar);
        } else {
            this.f14523t.add(oVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        h hVar;
        ArrayList arrayList = this.f14524u;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                hVar = null;
                break;
            }
            hVar = (h) arrayList.get(i10);
            if (!hVar.f14514a.L.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (hVar != null) {
            hVar.f14515b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.y
    public final void q(View view) {
        if (this.A != view) {
            this.A = view;
            int i10 = this.f14528y;
            WeakHashMap weakHashMap = v0.f16075a;
            this.f14529z = Gravity.getAbsoluteGravity(i10, o0.e0.d(view));
        }
    }

    @Override // k.y
    public final void r(boolean z9) {
        this.H = z9;
    }

    @Override // k.y
    public final void s(int i10) {
        if (this.f14528y != i10) {
            this.f14528y = i10;
            View view = this.A;
            WeakHashMap weakHashMap = v0.f16075a;
            this.f14529z = Gravity.getAbsoluteGravity(i10, o0.e0.d(view));
        }
    }

    @Override // k.y
    public final void t(int i10) {
        this.D = true;
        this.F = i10;
    }

    @Override // k.y
    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.L = onDismissListener;
    }

    @Override // k.y
    public final void v(boolean z9) {
        this.I = z9;
    }

    @Override // k.y
    public final void w(int i10) {
        this.E = true;
        this.G = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(k.o r18) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.i.y(k.o):void");
    }
}
