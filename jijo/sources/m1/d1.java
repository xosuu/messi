package m1;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.iq1;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15435b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OverScroller f15436d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Interpolator f15437f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15438h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15439q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f15440s;

    public d1(RecyclerView recyclerView) {
        this.f15440s = recyclerView;
        e0 e0Var = RecyclerView.I0;
        this.f15437f = e0Var;
        this.f15438h = false;
        this.f15439q = false;
        this.f15436d = new OverScroller(recyclerView.getContext(), e0Var);
    }

    public final void a() {
        if (this.f15438h) {
            this.f15439q = true;
            return;
        }
        RecyclerView recyclerView = this.f15440s;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = o0.v0.f16075a;
        o0.d0.m(recyclerView, this);
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        int iRound;
        RecyclerView recyclerView = this.f15440s;
        if (i12 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z9 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt(0);
            int iSqrt2 = (int) Math.sqrt((i11 * i11) + (i10 * i10));
            int width = z9 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i13 = width / 2;
            float f10 = width;
            float f11 = i13;
            float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z9) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f10) + 1.0f) * 300.0f);
            }
            i12 = Math.min(iRound, 2000);
        }
        int i14 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.I0;
        }
        if (this.f15437f != interpolator) {
            this.f15437f = interpolator;
            this.f15436d = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f15435b = 0;
        this.f15434a = 0;
        recyclerView.setScrollState(2);
        this.f15436d.startScroll(0, 0, i10, i11, i14);
        if (Build.VERSION.SDK_INT < 23) {
            this.f15436d.computeScrollOffset();
        }
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        RecyclerView recyclerView = this.f15440s;
        if (recyclerView.f1074x == null) {
            recyclerView.removeCallbacks(this);
            this.f15436d.abortAnimation();
            return;
        }
        this.f15439q = false;
        this.f15438h = true;
        recyclerView.m();
        OverScroller overScroller = this.f15436d;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currX - this.f15434a;
            int i15 = currY - this.f15435b;
            this.f15434a = currX;
            this.f15435b = currY;
            int[] iArr = recyclerView.A0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zR = recyclerView.r(i14, i15, 1, iArr, null);
            int[] iArr2 = recyclerView.A0;
            if (zR) {
                i14 -= iArr2[0];
                i15 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i14, i15);
            }
            if (recyclerView.f1072w != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.Z(i14, i15, iArr2);
                int i16 = iArr2[0];
                int i17 = iArr2[1];
                int i18 = i14 - i16;
                int i19 = i15 - i17;
                y yVar = recyclerView.f1074x.f15589e;
                if (yVar != null && !yVar.f15666d && yVar.f15667e) {
                    int iB = recyclerView.f1059o0.b();
                    if (iB == 0) {
                        yVar.f();
                    } else if (yVar.f15663a >= iB) {
                        yVar.f15663a = iB - 1;
                        yVar.d(i16, i17);
                    } else {
                        yVar.d(i16, i17);
                    }
                }
                i13 = i16;
                i10 = i18;
                i11 = i19;
                i12 = i17;
            } else {
                i10 = i14;
                i11 = i15;
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.f1076y.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.A0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i20 = i12;
            recyclerView.s(i13, i12, i10, i11, null, 1, iArr3);
            int i21 = i10 - iArr2[0];
            int i22 = i11 - iArr2[1];
            if (i13 != 0 || i20 != 0) {
                recyclerView.t(i13, i20);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z9 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i21 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i22 != 0));
            y yVar2 = recyclerView.f1074x.f15589e;
            if ((yVar2 == null || !yVar2.f15666d) && z9) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i23 = i21 < 0 ? -currVelocity : i21 > 0 ? currVelocity : 0;
                    if (i22 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i22 <= 0) {
                        currVelocity = 0;
                    }
                    if (i23 < 0) {
                        recyclerView.v();
                        if (recyclerView.P.isFinished()) {
                            recyclerView.P.onAbsorb(-i23);
                        }
                    } else if (i23 > 0) {
                        recyclerView.w();
                        if (recyclerView.R.isFinished()) {
                            recyclerView.R.onAbsorb(i23);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.Q.isFinished()) {
                            recyclerView.Q.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.S.isFinished()) {
                            recyclerView.S.onAbsorb(currVelocity);
                        }
                    }
                    if (i23 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = o0.v0.f16075a;
                        o0.d0.k(recyclerView);
                    }
                }
                if (RecyclerView.G0) {
                    iq1 iq1Var = recyclerView.f1058n0;
                    int[] iArr4 = (int[]) iq1Var.f5677c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    iq1Var.f5678d = 0;
                }
            } else {
                a();
                s sVar = recyclerView.f1057m0;
                if (sVar != null) {
                    sVar.a(recyclerView, i13, i20);
                }
            }
        }
        y yVar3 = recyclerView.f1074x.f15589e;
        if (yVar3 != null && yVar3.f15666d) {
            yVar3.d(0, 0);
        }
        this.f15438h = false;
        if (!this.f15439q) {
            recyclerView.setScrollState(0);
            recyclerView.e0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = o0.v0.f16075a;
            o0.d0.m(recyclerView, this);
        }
    }
}
