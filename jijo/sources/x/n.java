package x;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import z.s;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f18257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f18258h;

    public n(o oVar, w.d dVar, u.d dVar2, int i10) {
        this.f18258h = oVar;
        this.f18257g = new WeakReference(dVar);
        w.c cVar = dVar.I;
        dVar2.getClass();
        this.f18251a = u.d.n(cVar);
        this.f18252b = u.d.n(dVar.J);
        this.f18253c = u.d.n(dVar.K);
        this.f18254d = u.d.n(dVar.L);
        this.f18255e = u.d.n(dVar.M);
        this.f18256f = i10;
    }

    public static boolean a(int i10, int i11, int i12) {
        if (i10 == i11) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i10);
        View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
        }
        return false;
    }

    public final void b(w.d dVar, b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int i10;
        int iMakeMeasureSpec3;
        boolean z9;
        int measuredWidth;
        int baseline;
        int i11;
        if (dVar == null) {
            return;
        }
        if (dVar.f17995g0 == 8) {
            bVar.f18215e = 0;
            bVar.f18216f = 0;
            bVar.f18217g = 0;
            return;
        }
        if (dVar.T == null) {
            return;
        }
        int i12 = bVar.f18211a;
        int i13 = bVar.f18212b;
        int i14 = bVar.f18213c;
        int i15 = bVar.f18214d;
        int i16 = this.f18251a + this.f18252b;
        int i17 = this.f18253c;
        View view = (View) dVar.f17993f0;
        int iB = u.h.b(i12);
        w.c cVar = dVar.K;
        w.c cVar2 = dVar.I;
        if (iB == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        } else if (iB == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f18255e, i17, -2);
        } else if (iB == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f18255e, i17, -2);
            boolean z10 = dVar.f18015r == 1;
            int i18 = bVar.f18220j;
            if (i18 == 1 || i18 == 2) {
                boolean z11 = view.getMeasuredHeight() == dVar.l();
                if (bVar.f18220j == 2 || !z10 || ((z10 && z11) || dVar.B())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.r(), 1073741824);
                }
            }
        } else if (iB != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i19 = this.f18255e;
            int i20 = cVar2 != null ? cVar2.f17979g : 0;
            if (cVar != null) {
                i20 += cVar.f17979g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i19, i17 + i20, -1);
        }
        int iB2 = u.h.b(i13);
        if (iB2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else if (iB2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f18256f, i16, -2);
        } else if (iB2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f18256f, i16, -2);
            boolean z12 = dVar.f18016s == 1;
            int i21 = bVar.f18220j;
            if (i21 == 1 || i21 == 2) {
                boolean z13 = view.getMeasuredWidth() == dVar.r();
                if (bVar.f18220j == 2 || !z12 || ((z12 && z13) || dVar.C())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.l(), 1073741824);
                }
            }
        } else if (iB2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i22 = this.f18256f;
            int i23 = cVar2 != null ? dVar.J.f17979g : 0;
            if (cVar != null) {
                i23 += dVar.L.f17979g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i22, i16 + i23, -1);
        }
        w.e eVar = (w.e) dVar.T;
        Object obj = this.f18258h;
        if (eVar != null && w.k.b(((ConstraintLayout) obj).f420u, NotificationCompat.FLAG_LOCAL_ONLY) && view.getMeasuredWidth() == dVar.r() && view.getMeasuredWidth() < eVar.r() && view.getMeasuredHeight() == dVar.l() && view.getMeasuredHeight() < eVar.l() && view.getBaseline() == dVar.f17983a0 && !dVar.A() && a(dVar.G, iMakeMeasureSpec, dVar.r()) && a(dVar.H, iMakeMeasureSpec2, dVar.l())) {
            bVar.f18215e = dVar.r();
            bVar.f18216f = dVar.l();
            bVar.f18217g = dVar.f17983a0;
            return;
        }
        boolean z14 = i12 == 3;
        boolean z15 = i13 == 3;
        boolean z16 = i13 == 4 || i13 == 1;
        boolean z17 = i12 == 4 || i12 == 1;
        boolean z18 = z14 && dVar.W > 0.0f;
        boolean z19 = z15 && dVar.W > 0.0f;
        if (view == null) {
            return;
        }
        z.d dVar2 = (z.d) view.getLayoutParams();
        int i24 = bVar.f18220j;
        if (i24 != 1 && i24 != 2 && z14 && dVar.f18015r == 0 && z15 && dVar.f18016s == 0) {
            z9 = false;
            measuredWidth = 0;
            i11 = -1;
            baseline = 0;
            iMax = 0;
        } else {
            if ((view instanceof s) && (dVar instanceof w.g)) {
                ((s) view).j((w.g) dVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            dVar.G = iMakeMeasureSpec;
            dVar.H = iMakeMeasureSpec2;
            dVar.f17994g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i25 = dVar.f18018u;
            int iMax2 = i25 > 0 ? Math.max(i25, measuredWidth2) : measuredWidth2;
            int i26 = dVar.f18019v;
            if (i26 > 0) {
                iMax2 = Math.min(i26, iMax2);
            }
            int i27 = dVar.f18021x;
            iMax = i27 > 0 ? Math.max(i27, measuredHeight) : measuredHeight;
            int i28 = iMakeMeasureSpec;
            int i29 = dVar.f18022y;
            if (i29 > 0) {
                iMax = Math.min(i29, iMax);
            }
            if (!w.k.b(((ConstraintLayout) obj).f420u, 1)) {
                if (z18 && z16) {
                    iMax2 = (int) ((iMax * dVar.W) + 0.5f);
                } else if (z19 && z17) {
                    iMax = (int) ((iMax2 / dVar.W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z9 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    i10 = 1073741824;
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                } else {
                    i10 = 1073741824;
                    iMakeMeasureSpec3 = i28;
                }
                if (measuredHeight != iMax) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, i10);
                }
                view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                dVar.G = iMakeMeasureSpec3;
                dVar.H = iMakeMeasureSpec2;
                z9 = false;
                dVar.f17994g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i11 = -1;
        }
        boolean z20 = baseline != i11;
        if (measuredWidth != bVar.f18213c || iMax != bVar.f18214d) {
            z9 = true;
        }
        bVar.f18219i = z9;
        boolean z21 = dVar2.f20489c0 ? true : z20;
        if (z21 && baseline != -1 && dVar.f17983a0 != baseline) {
            bVar.f18219i = true;
        }
        bVar.f18215e = measuredWidth;
        bVar.f18216f = iMax;
        bVar.f18218h = z21;
        bVar.f18217g = baseline;
    }

    public n(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f18258h = constraintLayout;
        this.f18257g = constraintLayout2;
    }
}
