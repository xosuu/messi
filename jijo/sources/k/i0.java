package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.WeakHashMap;
import l.q2;
import l.x1;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends y implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public c0 A;
    public ViewTreeObserver B;
    public boolean C;
    public boolean D;
    public int E;
    public int F = 0;
    public boolean G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f14530b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f14531d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f14532f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14533h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f14534q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q2 f14537u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f14538v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f14539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PopupWindow.OnDismissListener f14540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f14541y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f14542z;

    public i0(int i10, int i11, Context context, View view, o oVar, boolean z9) {
        int i12 = 1;
        this.f14538v = new e(i12, this);
        this.f14539w = new f(i12, this);
        this.f14530b = context;
        this.f14531d = oVar;
        this.f14533h = z9;
        this.f14532f = new l(oVar, LayoutInflater.from(context), z9, R.layout.t);
        this.f14535s = i10;
        this.f14536t = i11;
        Resources resources = context.getResources();
        this.f14534q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.x));
        this.f14541y = view;
        this.f14537u = new q2(context, null, i10, i11);
        oVar.b(this, context);
    }

    @Override // k.h0
    public final boolean a() {
        return !this.C && this.f14537u.L.isShowing();
    }

    @Override // k.d0
    public final void b(o oVar, boolean z9) {
        if (oVar != this.f14531d) {
            return;
        }
        dismiss();
        c0 c0Var = this.A;
        if (c0Var != null) {
            c0Var.b(oVar, z9);
        }
    }

    @Override // k.d0
    public final boolean d(j0 j0Var) {
        if (j0Var.hasVisibleItems()) {
            b0 b0Var = new b0(this.f14535s, this.f14536t, this.f14530b, this.f14542z, j0Var, this.f14533h);
            c0 c0Var = this.A;
            b0Var.f14497i = c0Var;
            y yVar = b0Var.f14498j;
            if (yVar != null) {
                yVar.j(c0Var);
            }
            boolean zX = y.x(j0Var);
            b0Var.f14496h = zX;
            y yVar2 = b0Var.f14498j;
            if (yVar2 != null) {
                yVar2.r(zX);
            }
            b0Var.f14499k = this.f14540x;
            this.f14540x = null;
            this.f14531d.c(false);
            q2 q2Var = this.f14537u;
            int width = q2Var.f14913q;
            int iN = q2Var.n();
            int i10 = this.F;
            View view = this.f14541y;
            WeakHashMap weakHashMap = v0.f16075a;
            if ((Gravity.getAbsoluteGravity(i10, o0.e0.d(view)) & 7) == 5) {
                width += this.f14541y.getWidth();
            }
            if (!b0Var.b()) {
                if (b0Var.f14494f != null) {
                    b0Var.d(width, iN, true, true);
                }
            }
            c0 c0Var2 = this.A;
            if (c0Var2 != null) {
                c0Var2.i(j0Var);
            }
            return true;
        }
        return false;
    }

    @Override // k.h0
    public final void dismiss() {
        if (a()) {
            this.f14537u.dismiss();
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
    @Override // k.h0
    public final void e() {
        View view;
        if (a()) {
            return;
        }
        if (this.C || (view = this.f14541y) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f14542z = view;
        q2 q2Var = this.f14537u;
        q2Var.L.setOnDismissListener(this);
        q2Var.B = this;
        q2Var.K = true;
        q2Var.L.setFocusable(true);
        View view2 = this.f14542z;
        boolean z9 = this.B == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.B = viewTreeObserver;
        if (z9) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f14538v);
        }
        view2.addOnAttachStateChangeListener(this.f14539w);
        q2Var.A = view2;
        q2Var.f14919x = this.F;
        boolean z10 = this.D;
        Context context = this.f14530b;
        l lVar = this.f14532f;
        if (!z10) {
            this.E = y.p(lVar, context, this.f14534q);
            this.D = true;
        }
        q2Var.r(this.E);
        q2Var.L.setInputMethodMode(2);
        Rect rect = this.f14624a;
        q2Var.J = rect != null ? new Rect(rect) : null;
        q2Var.e();
        x1 x1Var = q2Var.f14910d;
        x1Var.setOnKeyListener(this);
        if (this.G) {
            o oVar = this.f14531d;
            if (oVar.f14571m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.s, (ViewGroup) x1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(oVar.f14571m);
                }
                frameLayout.setEnabled(false);
                x1Var.addHeaderView(frameLayout, null, false);
            }
        }
        q2Var.p(lVar);
        q2Var.e();
    }

    @Override // k.d0
    public final void g(Parcelable parcelable) {
    }

    @Override // k.d0
    public final void h() {
        this.D = false;
        l lVar = this.f14532f;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @Override // k.h0
    public final x1 i() {
        return this.f14537u.f14910d;
    }

    @Override // k.d0
    public final void j(c0 c0Var) {
        this.A = c0Var;
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
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.C = true;
        this.f14531d.c(true);
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.B = this.f14542z.getViewTreeObserver();
            }
            this.B.removeGlobalOnLayoutListener(this.f14538v);
            this.B = null;
        }
        this.f14542z.removeOnAttachStateChangeListener(this.f14539w);
        PopupWindow.OnDismissListener onDismissListener = this.f14540x;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f14541y = view;
    }

    @Override // k.y
    public final void r(boolean z9) {
        this.f14532f.f14554d = z9;
    }

    @Override // k.y
    public final void s(int i10) {
        this.F = i10;
    }

    @Override // k.y
    public final void t(int i10) {
        this.f14537u.f14913q = i10;
    }

    @Override // k.y
    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f14540x = onDismissListener;
    }

    @Override // k.y
    public final void v(boolean z9) {
        this.G = z9;
    }

    @Override // k.y
    public final void w(int i10) {
        this.f14537u.j(i10);
    }
}
