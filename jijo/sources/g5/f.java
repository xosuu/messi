package g5;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import c2.n;
import com.google.android.gms.internal.ads.en1;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import o0.d0;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends LinearLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13851f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f13852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13853b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TabLayout f13854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TabLayout tabLayout, Context context) {
        super(context);
        this.f13854d = tabLayout;
        this.f13853b = -1;
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        TabLayout tabLayout = this.f13854d;
        if (tabLayout.f11971j0 != 0) {
            return;
        }
        View childAt = getChildAt(i10);
        n nVar = tabLayout.U;
        Drawable drawable = tabLayout.A;
        nVar.getClass();
        RectF rectFE = n.e(tabLayout, childAt);
        drawable.setBounds((int) rectFE.left, drawable.getBounds().top, (int) rectFE.right, drawable.getBounds().bottom);
        tabLayout.f11957a = i10;
    }

    public final void b(int i10) {
        TabLayout tabLayout = this.f13854d;
        Rect bounds = tabLayout.A.getBounds();
        tabLayout.A.setBounds(bounds.left, 0, bounds.right, i10);
        requestLayout();
    }

    public final void c(View view, View view2, float f10) {
        if (view == null || view.getWidth() <= 0) {
            TabLayout tabLayout = this.f13854d;
            Drawable drawable = tabLayout.A;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.A.getBounds().bottom);
        } else {
            TabLayout tabLayout2 = this.f13854d;
            tabLayout2.U.m(tabLayout2, view, view2, f10, tabLayout2.A);
        }
        WeakHashMap weakHashMap = v0.f16075a;
        d0.k(this);
    }

    public final void d(int i10, int i11, boolean z9) {
        TabLayout tabLayout = this.f13854d;
        if (tabLayout.f11957a == i10) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i10);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f11957a = i10;
        e eVar = new e(this, childAt, childAt2);
        if (!z9) {
            this.f13852a.removeAllUpdateListeners();
            this.f13852a.addUpdateListener(eVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f13852a = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.V);
        valueAnimator.setDuration(i11);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(eVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f13854d;
        int iHeight = tabLayout.A.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.A.getIntrinsicHeight();
        }
        int i10 = tabLayout.N;
        if (i10 == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i10 != 1) {
            height = 0;
            if (i10 != 2) {
                iHeight = i10 != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.A.getBounds().width() > 0) {
            Rect bounds = tabLayout.A.getBounds();
            tabLayout.A.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.A.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        ValueAnimator valueAnimator = this.f13852a;
        TabLayout tabLayout = this.f13854d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.f11957a == -1) {
            tabLayout.f11957a = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.f11957a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f13854d;
        if (tabLayout.L == 1 || tabLayout.O == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) en1.n(getContext(), 16)) * 2)) {
                boolean z9 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z9 = true;
                    }
                }
                if (!z9) {
                    return;
                }
            } else {
                tabLayout.L = 0;
                tabLayout.j(false);
            }
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (Build.VERSION.SDK_INT >= 23 || this.f13853b == i10) {
            return;
        }
        requestLayout();
        this.f13853b = i10;
    }
}
