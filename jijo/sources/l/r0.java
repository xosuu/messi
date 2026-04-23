package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends k2 implements s0 {
    public CharSequence P;
    public ListAdapter Q;
    public final Rect R;
    public int S;
    public final /* synthetic */ androidx.appcompat.widget.c T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.appcompat.widget.c cVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.a1n, 0);
        this.T = cVar;
        this.R = new Rect();
        this.A = cVar;
        this.K = true;
        this.L.setFocusable(true);
        this.B = new f.i(this, 1, cVar);
    }

    @Override // l.s0
    public final void f(CharSequence charSequence) {
        this.P = charSequence;
    }

    @Override // l.s0
    public final void k(int i10) {
        this.S = i10;
    }

    @Override // l.s0
    public final void m(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        d0 d0Var = this.L;
        boolean zIsShowing = d0Var.isShowing();
        s();
        this.L.setInputMethodMode(2);
        e();
        x1 x1Var = this.f14910d;
        x1Var.setChoiceMode(1);
        m0.d(x1Var, i10);
        m0.c(x1Var, i11);
        androidx.appcompat.widget.c cVar = this.T;
        int selectedItemPosition = cVar.getSelectedItemPosition();
        x1 x1Var2 = this.f14910d;
        if (d0Var.isShowing() && x1Var2 != null) {
            x1Var2.setListSelectionHidden(false);
            x1Var2.setSelection(selectedItemPosition);
            if (x1Var2.getChoiceMode() != 0) {
                x1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = cVar.getViewTreeObserver()) == null) {
            return;
        }
        k.e eVar = new k.e(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(eVar);
        this.L.setOnDismissListener(new q0(this, eVar));
    }

    @Override // l.s0
    public final CharSequence o() {
        return this.P;
    }

    @Override // l.k2, l.s0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.Q = listAdapter;
    }

    public final void s() {
        int i10;
        d0 d0Var = this.L;
        Drawable background = d0Var.getBackground();
        androidx.appcompat.widget.c cVar = this.T;
        if (background != null) {
            background.getPadding(cVar.f395t);
            boolean zA = e4.a(cVar);
            Rect rect = cVar.f395t;
            i10 = zA ? rect.right : -rect.left;
        } else {
            Rect rect2 = cVar.f395t;
            rect2.right = 0;
            rect2.left = 0;
            i10 = 0;
        }
        int paddingLeft = cVar.getPaddingLeft();
        int paddingRight = cVar.getPaddingRight();
        int width = cVar.getWidth();
        int i11 = cVar.f394s;
        if (i11 == -2) {
            int iA = cVar.a((SpinnerAdapter) this.Q, d0Var.getBackground());
            int i12 = cVar.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = cVar.f395t;
            int i13 = (i12 - rect3.left) - rect3.right;
            if (iA > i13) {
                iA = i13;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i11);
        }
        this.f14913q = e4.a(cVar) ? (((width - paddingRight) - this.f14912h) - this.S) + i10 : paddingLeft + this.S + i10;
    }
}
