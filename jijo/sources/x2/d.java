package x2;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.j0;
import androidx.fragment.app.o0;
import androidx.fragment.app.s;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class d extends z1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f18381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.fragment.app.a f18382d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f18383e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y2.a f18385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f18386h;

    public d(j0 j0Var, String[] strArr) {
        this.f18381c = j0Var;
        this.f18386h = strArr;
    }

    @Override // z1.a
    public final void a(ViewGroup viewGroup, int i10, Object obj) {
        s sVar = (s) obj;
        if (this.f18382d == null) {
            j0 j0Var = this.f18381c;
            j0Var.getClass();
            this.f18382d = new androidx.fragment.app.a(j0Var);
        }
        androidx.fragment.app.a aVar = this.f18382d;
        aVar.getClass();
        j0 j0Var2 = sVar.E;
        if (j0Var2 != null && j0Var2 != aVar.f717p) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + sVar.toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new o0(6, sVar));
        if (sVar.equals(this.f18383e)) {
            this.f18383e = null;
        }
    }

    @Override // z1.a
    public final void b() {
        androidx.fragment.app.a aVar = this.f18382d;
        if (aVar != null) {
            if (!this.f18384f) {
                try {
                    this.f18384f = true;
                    if (aVar.f708g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    j0 j0Var = aVar.f717p;
                    if (j0Var.f797p != null && !j0Var.C) {
                        j0Var.w(true);
                        aVar.a(j0Var.E, j0Var.F);
                        j0Var.f783b = true;
                        try {
                            j0Var.P(j0Var.E, j0Var.F);
                            j0Var.d();
                            j0Var.a0();
                            j0Var.t();
                            j0Var.f784c.f841b.values().removeAll(Collections.singleton(null));
                        } catch (Throwable th) {
                            j0Var.d();
                            throw th;
                        }
                    }
                } finally {
                    this.f18384f = false;
                }
            }
            this.f18382d = null;
        }
    }

    @Override // z1.a
    public final int c() {
        return 1;
    }

    @Override // z1.a
    public final CharSequence e(int i10) {
        return this.f18386h[i10];
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
    @Override // z1.a
    public final Object f(ViewGroup viewGroup, int i10) {
        s sVar;
        androidx.fragment.app.a aVar = this.f18382d;
        j0 j0Var = this.f18381c;
        if (aVar == null) {
            j0Var.getClass();
            this.f18382d = new androidx.fragment.app.a(j0Var);
        }
        long j10 = i10;
        s sVarA = j0Var.A("android:switcher:" + viewGroup.getId() + ":" + j10);
        if (sVarA != null) {
            androidx.fragment.app.a aVar2 = this.f18382d;
            aVar2.getClass();
            aVar2.b(new o0(7, sVarA));
            sVar = sVarA;
        } else {
            y2.a aVar3 = new y2.a();
            this.f18385g = aVar3;
            this.f18382d.e(viewGroup.getId(), aVar3, "android:switcher:" + viewGroup.getId() + ":" + j10, 1);
            sVar = aVar3;
        }
        if (sVar != this.f18383e) {
            sVar.X(false);
            sVar.Y(false);
        }
        return sVar;
    }

    @Override // z1.a
    public final boolean g(View view, Object obj) {
        return ((s) obj).S == view;
    }

    @Override // z1.a
    public final /* bridge */ /* synthetic */ void i(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // z1.a
    public final /* bridge */ /* synthetic */ Parcelable j() {
        return null;
    }

    @Override // z1.a
    public final void k(Object obj) {
        s sVar = (s) obj;
        s sVar2 = this.f18383e;
        if (sVar != sVar2) {
            if (sVar2 != null) {
                sVar2.X(false);
                this.f18383e.Y(false);
            }
            sVar.X(true);
            sVar.Y(true);
            this.f18383e = sVar;
        }
    }

    @Override // z1.a
    public final void m(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
