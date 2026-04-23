package l;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u3 implements k.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k.o f15026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k.r f15027b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Toolbar f15028d;

    public u3(Toolbar toolbar) {
        this.f15028d = toolbar;
    }

    @Override // k.d0
    public final void b(k.o oVar, boolean z9) {
    }

    @Override // k.d0
    public final boolean c(k.r rVar) {
        Toolbar toolbar = this.f15028d;
        toolbar.c();
        ViewParent parent = toolbar.f359t.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f359t);
            }
            toolbar.addView(toolbar.f359t);
        }
        View actionView = rVar.getActionView();
        toolbar.f360u = actionView;
        this.f15027b = rVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f360u);
            }
            v3 v3VarH = Toolbar.h();
            v3VarH.f12789a = (toolbar.f365z & 112) | 8388611;
            v3VarH.f15039b = 2;
            toolbar.f360u.setLayoutParams(v3VarH);
            toolbar.addView(toolbar.f360u);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((v3) childAt.getLayoutParams()).f15039b != 2 && childAt != toolbar.f343a) {
                toolbar.removeViewAt(childCount);
                toolbar.Q.add(childAt);
            }
        }
        toolbar.requestLayout();
        rVar.C = true;
        rVar.f14601n.p(false);
        KeyEvent.Callback callback = toolbar.f360u;
        if (callback instanceof j.c) {
            ((j.c) callback).b();
        }
        toolbar.w();
        return true;
    }

    @Override // k.d0
    public final boolean d(k.j0 j0Var) {
        return false;
    }

    @Override // k.d0
    public final boolean f(k.r rVar) {
        Toolbar toolbar = this.f15028d;
        KeyEvent.Callback callback = toolbar.f360u;
        if (callback instanceof j.c) {
            ((j.c) callback).e();
        }
        toolbar.removeView(toolbar.f360u);
        toolbar.removeView(toolbar.f359t);
        toolbar.f360u = null;
        ArrayList arrayList = toolbar.Q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f15027b = null;
        toolbar.requestLayout();
        rVar.C = false;
        rVar.f14601n.p(false);
        toolbar.w();
        return true;
    }

    @Override // k.d0
    public final void g(Parcelable parcelable) {
    }

    @Override // k.d0
    public final void h() {
        if (this.f15027b != null) {
            k.o oVar = this.f15026a;
            if (oVar != null) {
                int size = oVar.f14564f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f15026a.getItem(i10) == this.f15027b) {
                        return;
                    }
                }
            }
            f(this.f15027b);
        }
    }

    @Override // k.d0
    public final int k() {
        return 0;
    }

    @Override // k.d0
    public final void l(Context context, k.o oVar) {
        k.r rVar;
        k.o oVar2 = this.f15026a;
        if (oVar2 != null && (rVar = this.f15027b) != null) {
            oVar2.d(rVar);
        }
        this.f15026a = oVar;
    }

    @Override // k.d0
    public final boolean m() {
        return false;
    }

    @Override // k.d0
    public final Parcelable n() {
        return null;
    }
}
