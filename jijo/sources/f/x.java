package f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Window;
import l.y1;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class x implements y1, c, k.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f12983a;

    public /* synthetic */ x(k0 k0Var) {
        this.f12983a = k0Var;
    }

    @Override // f.c
    public final void a(g.i iVar, int i10) {
        k0 k0Var = this.f12983a;
        k0Var.E();
        b4.f fVar = k0Var.A;
        if (fVar != null) {
            fVar.K(iVar);
            fVar.J(i10);
        }
    }

    @Override // k.c0
    public final void b(k.o oVar, boolean z9) {
        j0 j0Var;
        k.o oVarK = oVar.k();
        int i10 = 0;
        boolean z10 = oVarK != oVar;
        if (z10) {
            oVar = oVarK;
        }
        k0 k0Var = this.f12983a;
        j0[] j0VarArr = k0Var.X;
        int length = j0VarArr != null ? j0VarArr.length : 0;
        while (true) {
            if (i10 < length) {
                j0Var = j0VarArr[i10];
                if (j0Var != null && j0Var.f12877h == oVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                j0Var = null;
                break;
            }
        }
        if (j0Var != null) {
            if (!z10) {
                k0Var.u(j0Var, z9);
            } else {
                k0Var.s(j0Var.f12870a, j0Var, oVarK);
                k0Var.u(j0Var, true);
            }
        }
    }

    @Override // f.c
    public final boolean d() {
        k0 k0Var = this.f12983a;
        k0Var.E();
        b4.f fVar = k0Var.A;
        return (fVar == null || (fVar.o() & 4) == 0) ? false : true;
    }

    @Override // k.c0
    public final boolean i(k.o oVar) {
        Window.Callback callback;
        if (oVar != oVar.k()) {
            return true;
        }
        k0 k0Var = this.f12983a;
        if (!k0Var.R || (callback = k0Var.f12913x.getCallback()) == null || k0Var.f12894c0) {
            return true;
        }
        callback.onMenuOpened(108, oVar);
        return true;
    }

    @Override // f.c
    public final Drawable k() {
        int resourceId;
        Context contextA = this.f12983a.A();
        TypedArray typedArrayObtainStyledAttributes = contextA.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.ot});
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : p7.q.g(contextA, resourceId);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    @Override // f.c
    public final void l(int i10) {
        k0 k0Var = this.f12983a;
        k0Var.E();
        b4.f fVar = k0Var.A;
        if (fVar != null) {
            fVar.J(i10);
        }
    }

    @Override // f.c
    public final Context o() {
        return this.f12983a.A();
    }
}
