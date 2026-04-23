package f;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.ads.fb1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.u3;
import l.x3;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends b4.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x3 f12988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Window.Callback f12989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w0 f12990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f12994i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.activity.e f12995j = new androidx.activity.e(1, this);

    public y0(Toolbar toolbar, CharSequence charSequence, e0 e0Var) {
        w0 w0Var = new w0(this);
        toolbar.getClass();
        x3 x3Var = new x3(toolbar, false);
        this.f12988c = x3Var;
        e0Var.getClass();
        this.f12989d = e0Var;
        x3Var.f15078k = e0Var;
        toolbar.setOnMenuItemClickListener(w0Var);
        if (!x3Var.f15074g) {
            x3Var.f15075h = charSequence;
            if ((x3Var.f15069b & 8) != 0) {
                Toolbar toolbar2 = x3Var.f15068a;
                toolbar2.setTitle(charSequence);
                if (x3Var.f15074g) {
                    o0.v0.r(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f12990e = new w0(this);
    }

    @Override // b4.f
    public final void A() {
        this.f12988c.f15068a.removeCallbacks(this.f12995j);
    }

    @Override // b4.f
    public final boolean C(int i10, KeyEvent keyEvent) {
        Menu menuQ0 = q0();
        if (menuQ0 == null) {
            return false;
        }
        menuQ0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuQ0.performShortcut(i10, keyEvent, 0);
    }

    @Override // b4.f
    public final boolean E(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            G();
        }
        return true;
    }

    @Override // b4.f
    public final boolean G() {
        return this.f12988c.f15068a.v();
    }

    @Override // b4.f
    public final void H(boolean z9) {
    }

    @Override // b4.f
    public final void I(boolean z9) {
        x3 x3Var = this.f12988c;
        x3Var.a((x3Var.f15069b & (-5)) | 4);
    }

    @Override // b4.f
    public final void J(int i10) {
        this.f12988c.b(i10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // b4.f
    public final void K(g.i iVar) {
        x3 x3Var = this.f12988c;
        x3Var.f15073f = iVar;
        int i10 = x3Var.f15069b & 4;
        Toolbar toolbar = x3Var.f15068a;
        Drawable drawable = iVar;
        if (i10 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (iVar == null) {
            drawable = x3Var.f15082o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // b4.f
    public final void L(boolean z9) {
    }

    @Override // b4.f
    public final void N(Spanned spanned) {
        x3 x3Var = this.f12988c;
        x3Var.f15074g = true;
        x3Var.f15075h = spanned;
        if ((x3Var.f15069b & 8) != 0) {
            Toolbar toolbar = x3Var.f15068a;
            toolbar.setTitle(spanned);
            if (x3Var.f15074g) {
                o0.v0.r(toolbar.getRootView(), spanned);
            }
        }
    }

    @Override // b4.f
    public final void O(CharSequence charSequence) {
        x3 x3Var = this.f12988c;
        if (x3Var.f15074g) {
            return;
        }
        x3Var.f15075h = charSequence;
        if ((x3Var.f15069b & 8) != 0) {
            Toolbar toolbar = x3Var.f15068a;
            toolbar.setTitle(charSequence);
            if (x3Var.f15074g) {
                o0.v0.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // b4.f
    public final boolean e() {
        androidx.appcompat.widget.b bVar;
        ActionMenuView actionMenuView = this.f12988c.f15068a.f343a;
        return (actionMenuView == null || (bVar = actionMenuView.F) == null || !bVar.e()) ? false : true;
    }

    @Override // b4.f
    public final boolean f() {
        k.r rVar;
        u3 u3Var = this.f12988c.f15068a.f346b0;
        if (u3Var == null || (rVar = u3Var.f15027b) == null) {
            return false;
        }
        if (u3Var == null) {
            rVar = null;
        }
        if (rVar == null) {
            return true;
        }
        rVar.collapseActionView();
        return true;
    }

    @Override // b4.f
    public final void j(boolean z9) {
        if (z9 == this.f12993h) {
            return;
        }
        this.f12993h = z9;
        ArrayList arrayList = this.f12994i;
        if (arrayList.size() <= 0) {
            return;
        }
        fb1.t(arrayList.get(0));
        throw null;
    }

    @Override // b4.f
    public final int o() {
        return this.f12988c.f15069b;
    }

    public final Menu q0() {
        boolean z9 = this.f12992g;
        x3 x3Var = this.f12988c;
        if (!z9) {
            x0 x0Var = new x0(this);
            m2.f fVar = new m2.f(2, this);
            Toolbar toolbar = x3Var.f15068a;
            toolbar.f347c0 = x0Var;
            toolbar.f349d0 = fVar;
            ActionMenuView actionMenuView = toolbar.f343a;
            if (actionMenuView != null) {
                actionMenuView.G = x0Var;
                actionMenuView.H = fVar;
            }
            this.f12992g = true;
        }
        return x3Var.f15068a.getMenu();
    }

    @Override // b4.f
    public final Context r() {
        return this.f12988c.f15068a.getContext();
    }

    @Override // b4.f
    public final boolean t() {
        x3 x3Var = this.f12988c;
        Toolbar toolbar = x3Var.f15068a;
        androidx.activity.e eVar = this.f12995j;
        toolbar.removeCallbacks(eVar);
        Toolbar toolbar2 = x3Var.f15068a;
        WeakHashMap weakHashMap = o0.v0.f16075a;
        o0.d0.m(toolbar2, eVar);
        return true;
    }

    @Override // b4.f
    public final void z() {
    }
}
