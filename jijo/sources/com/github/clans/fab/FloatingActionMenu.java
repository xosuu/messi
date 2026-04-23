package com.github.clans.fab;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import g3.b;
import g3.f;
import g3.g;
import g3.i;
import g3.k;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionMenu extends ViewGroup {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final ColorStateList E;
    public final float F;
    public final int G;
    public final boolean H;
    public final int I;
    public final int J;
    public final int K;
    public final boolean L;
    public final int M;
    public final float N;
    public final float O;
    public final float P;
    public int Q;
    public int R;
    public int S;
    public final Drawable T;
    public int U;
    public final OvershootInterpolator V;
    public final AnticipateInterpolator W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatorSet f1815a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f1816a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatorSet f1817b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f1818b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final int f1819c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f1820d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f1821d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f1822e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1823f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f1824f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final Typeface f1825g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FloatingActionButton f1826h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f1827h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final ImageView f1828i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Animation f1829j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f1830k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f1831l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final int f1832m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public i f1833n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final ValueAnimator f1834o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ValueAnimator f1835p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1836q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f1837q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f1838r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1839s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ContextThemeWrapper f1840s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1841t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f1842t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1843u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f1844u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1845v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1846w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Handler f1847x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f1848y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f1849z;

    /* JADX WARN: Removed duplicated region for block: B:39:0x0330 A[PHI: r4
      0x0330: PHI (r4v10 float) = (r4v6 float), (r4v12 float) binds: [B:44:0x033c, B:38:0x032e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FloatingActionMenu(android.content.Context r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instruction units count: 949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.clans.fab.FloatingActionMenu.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void setLabelEllipsize(k kVar) {
        int i10 = this.f1819c0;
        if (i10 == 1) {
            kVar.setEllipsize(TextUtils.TruncateAt.START);
            return;
        }
        if (i10 == 2) {
            kVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i10 == 3) {
            kVar.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            if (i10 != 4) {
                return;
            }
            kVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        }
    }

    public final void a(boolean z9) {
        if (!this.f1845v) {
            return;
        }
        if (this.f1837q0 != 0) {
            this.f1835p0.start();
        }
        if (this.f1827h0) {
            AnimatorSet animatorSet = this.f1820d;
            if (animatorSet != null) {
                animatorSet.start();
            } else {
                this.f1817b.start();
                this.f1815a.cancel();
            }
        }
        int i10 = 0;
        this.f1846w = false;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            Handler handler = this.f1847x;
            int i13 = 1;
            if (i10 >= childCount) {
                handler.postDelayed(new g(this, i13), (i11 + 1) * this.U);
                return;
            }
            View childAt = getChildAt(i10);
            if ((childAt instanceof FloatingActionButton) && childAt.getVisibility() != 8) {
                i11++;
                handler.postDelayed(new f(this, (FloatingActionButton) childAt, z9, i13), i12);
                i12 += this.U;
            }
            i10++;
        }
    }

    public final void b() {
        if (getVisibility() == 4) {
            setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimationDelayPerItem() {
        return this.U;
    }

    public AnimatorSet getIconToggleAnimatorSet() {
        return this.f1820d;
    }

    public int getMenuButtonColorNormal() {
        return this.Q;
    }

    public int getMenuButtonColorPressed() {
        return this.R;
    }

    public int getMenuButtonColorRipple() {
        return this.S;
    }

    public String getMenuButtonLabelText() {
        return this.f1842t0;
    }

    public ImageView getMenuIconView() {
        return this.f1828i0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        bringChildToFront(this.f1826h);
        bringChildToFront(this.f1828i0);
        this.f1843u = getChildCount();
        for (int i10 = 0; i10 < this.f1843u; i10++) {
            if (getChildAt(i10) != this.f1828i0) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) getChildAt(i10);
                if (floatingActionButton.getTag(R.id.j1) == null) {
                    String labelText = floatingActionButton.getLabelText();
                    if (!TextUtils.isEmpty(labelText)) {
                        k kVar = new k(this.f1840s0);
                        kVar.f13668q = true;
                        kVar.C = true;
                        kVar.D = new GestureDetector(kVar.getContext(), new b(kVar, 1));
                        kVar.setClickable(true);
                        kVar.setFab(floatingActionButton);
                        kVar.setShowAnimation(AnimationUtils.loadAnimation(getContext(), this.f1848y));
                        kVar.setHideAnimation(AnimationUtils.loadAnimation(getContext(), this.f1849z));
                        if (this.f1824f0 > 0) {
                            kVar.setTextAppearance(getContext(), this.f1824f0);
                            kVar.setShowShadow(false);
                            kVar.setUsingStyle(true);
                        } else {
                            int i11 = this.I;
                            int i12 = this.J;
                            int i13 = this.K;
                            kVar.f13671u = i11;
                            kVar.f13672v = i12;
                            kVar.f13673w = i13;
                            kVar.setShowShadow(this.H);
                            kVar.setCornerRadius(this.G);
                            if (this.f1819c0 > 0) {
                                setLabelEllipsize(kVar);
                            }
                            kVar.setMaxLines(this.f1821d0);
                            kVar.e();
                            kVar.setTextSize(0, this.F);
                            kVar.setTextColor(this.E);
                            int iAbs = this.D;
                            int iAbs2 = this.A;
                            if (this.H) {
                                iAbs += Math.abs(floatingActionButton.getShadowXOffset()) + floatingActionButton.getShadowRadius();
                                iAbs2 += Math.abs(floatingActionButton.getShadowYOffset()) + floatingActionButton.getShadowRadius();
                            }
                            kVar.setPadding(iAbs, iAbs2, this.D, this.A);
                            if (this.f1821d0 < 0 || this.f1818b0) {
                                kVar.setSingleLine(this.f1818b0);
                            }
                        }
                        Typeface typeface = this.f1825g0;
                        if (typeface != null) {
                            kVar.setTypeface(typeface);
                        }
                        kVar.setText(labelText);
                        kVar.setOnClickListener(floatingActionButton.getOnClickListener());
                        addView(kVar);
                        floatingActionButton.setTag(R.id.j1, kVar);
                    }
                    FloatingActionButton floatingActionButton2 = this.f1826h;
                    if (floatingActionButton == floatingActionButton2) {
                        floatingActionButton2.setOnClickListener(new f.b(4, this));
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int paddingRight = this.f1838r0 == 0 ? ((i12 - i10) - (this.f1836q / 2)) - getPaddingRight() : getPaddingLeft() + (this.f1836q / 2);
        boolean z10 = this.f1832m0 == 0;
        int measuredHeight = z10 ? ((i13 - i11) - this.f1826h.getMeasuredHeight()) - getPaddingBottom() : getPaddingTop();
        int measuredWidth = paddingRight - (this.f1826h.getMeasuredWidth() / 2);
        FloatingActionButton floatingActionButton = this.f1826h;
        floatingActionButton.layout(measuredWidth, measuredHeight, floatingActionButton.getMeasuredWidth() + measuredWidth, this.f1826h.getMeasuredHeight() + measuredHeight);
        int measuredWidth2 = paddingRight - (this.f1828i0.getMeasuredWidth() / 2);
        int measuredHeight2 = ((this.f1826h.getMeasuredHeight() / 2) + measuredHeight) - (this.f1828i0.getMeasuredHeight() / 2);
        ImageView imageView = this.f1828i0;
        imageView.layout(measuredWidth2, measuredHeight2, imageView.getMeasuredWidth() + measuredWidth2, this.f1828i0.getMeasuredHeight() + measuredHeight2);
        if (z10) {
            measuredHeight = this.f1823f + this.f1826h.getMeasuredHeight() + measuredHeight;
        }
        for (int i14 = this.f1843u - 1; i14 >= 0; i14--) {
            View childAt = getChildAt(i14);
            if (childAt != this.f1828i0) {
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) childAt;
                if (floatingActionButton2.getVisibility() != 8) {
                    int measuredWidth3 = paddingRight - (floatingActionButton2.getMeasuredWidth() / 2);
                    if (z10) {
                        measuredHeight = (measuredHeight - floatingActionButton2.getMeasuredHeight()) - this.f1823f;
                    }
                    if (floatingActionButton2 != this.f1826h) {
                        floatingActionButton2.layout(measuredWidth3, measuredHeight, floatingActionButton2.getMeasuredWidth() + measuredWidth3, floatingActionButton2.getMeasuredHeight() + measuredHeight);
                        if (!this.f1846w) {
                            floatingActionButton2.g(false);
                        }
                    }
                    View view = (View) floatingActionButton2.getTag(R.id.j1);
                    if (view != null) {
                        int measuredWidth4 = ((this.f1844u0 ? this.f1836q : floatingActionButton2.getMeasuredWidth()) / 2) + this.f1839s;
                        int i15 = this.f1838r0;
                        int i16 = i15 == 0 ? paddingRight - measuredWidth4 : measuredWidth4 + paddingRight;
                        int measuredWidth5 = i15 == 0 ? i16 - view.getMeasuredWidth() : view.getMeasuredWidth() + i16;
                        int i17 = this.f1838r0;
                        int i18 = i17 == 0 ? measuredWidth5 : i16;
                        if (i17 != 0) {
                            i16 = measuredWidth5;
                        }
                        int measuredHeight3 = ((floatingActionButton2.getMeasuredHeight() - view.getMeasuredHeight()) / 2) + (measuredHeight - this.f1841t);
                        view.layout(i18, measuredHeight3, i16, view.getMeasuredHeight() + measuredHeight3);
                        if (!this.f1846w) {
                            view.setVisibility(4);
                        }
                    }
                    measuredHeight = z10 ? measuredHeight - this.f1823f : this.f1823f + childAt.getMeasuredHeight() + measuredHeight;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.f1836q = 0;
        measureChildWithMargins(this.f1828i0, i10, 0, i11, 0);
        for (int i12 = 0; i12 < this.f1843u; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != this.f1828i0) {
                measureChildWithMargins(childAt, i10, 0, i11, 0);
                this.f1836q = Math.max(this.f1836q, childAt.getMeasuredWidth());
            }
        }
        int i13 = 0;
        int i14 = 0;
        int iMax = 0;
        while (true) {
            if (i14 >= this.f1843u) {
                break;
            }
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8 && childAt2 != this.f1828i0) {
                int measuredWidth = childAt2.getMeasuredWidth();
                int measuredHeight = childAt2.getMeasuredHeight() + i13;
                k kVar = (k) childAt2.getTag(R.id.j1);
                if (kVar != null) {
                    int measuredWidth2 = (this.f1836q - childAt2.getMeasuredWidth()) / (this.f1844u0 ? 1 : 2);
                    measureChildWithMargins(kVar, i10, (kVar.f13668q ? Math.abs(kVar.f13664b) + kVar.f13663a : 0) + childAt2.getMeasuredWidth() + this.f1839s + measuredWidth2, i11, 0);
                    iMax = Math.max(iMax, kVar.getMeasuredWidth() + measuredWidth + measuredWidth2);
                }
                i13 = measuredHeight;
            }
            i14++;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + Math.max(this.f1836q, iMax + this.f1839s);
        double paddingBottom = getPaddingBottom() + getPaddingTop() + ((this.f1843u - 1) * this.f1823f) + i13;
        int defaultSize = (int) ((0.03d * paddingBottom) + paddingBottom);
        if (getLayoutParams().width == -1) {
            paddingRight = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
        }
        if (getLayoutParams().height == -1) {
            defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i11);
        }
        setMeasuredDimension(paddingRight, defaultSize);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1831l0) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            return this.f1845v;
        }
        if (action != 1) {
            return false;
        }
        a(this.f1816a0);
        return true;
    }

    public void setAnimated(boolean z9) {
        this.f1816a0 = z9;
        this.f1815a.setDuration(z9 ? 300L : 0L);
        this.f1817b.setDuration(z9 ? 300L : 0L);
    }

    public void setAnimationDelayPerItem(int i10) {
        this.U = i10;
    }

    public void setClosedOnTouchOutside(boolean z9) {
        this.f1831l0 = z9;
    }

    public void setIconAnimated(boolean z9) {
        this.f1827h0 = z9;
    }

    public void setIconAnimationCloseInterpolator(Interpolator interpolator) {
        this.f1817b.setInterpolator(interpolator);
    }

    public void setIconAnimationInterpolator(Interpolator interpolator) {
        this.f1815a.setInterpolator(interpolator);
        this.f1817b.setInterpolator(interpolator);
    }

    public void setIconAnimationOpenInterpolator(Interpolator interpolator) {
        this.f1815a.setInterpolator(interpolator);
    }

    public void setIconToggleAnimatorSet(AnimatorSet animatorSet) {
        this.f1820d = animatorSet;
    }

    public void setMenuButtonColorNormal(int i10) {
        this.Q = i10;
        this.f1826h.setColorNormal(i10);
    }

    public void setMenuButtonColorNormalResId(int i10) {
        this.Q = getResources().getColor(i10);
        this.f1826h.setColorNormalResId(i10);
    }

    public void setMenuButtonColorPressed(int i10) {
        this.R = i10;
        this.f1826h.setColorPressed(i10);
    }

    public void setMenuButtonColorPressedResId(int i10) {
        this.R = getResources().getColor(i10);
        this.f1826h.setColorPressedResId(i10);
    }

    public void setMenuButtonColorRipple(int i10) {
        this.S = i10;
        this.f1826h.setColorRipple(i10);
    }

    public void setMenuButtonColorRippleResId(int i10) {
        this.S = getResources().getColor(i10);
        this.f1826h.setColorRippleResId(i10);
    }

    public void setMenuButtonHideAnimation(Animation animation) {
        this.f1829j0 = animation;
        this.f1826h.setHideAnimation(animation);
    }

    public void setMenuButtonLabelText(String str) {
        this.f1826h.setLabelText(str);
    }

    public void setMenuButtonShowAnimation(Animation animation) {
        this.f1826h.setShowAnimation(animation);
    }

    public void setOnMenuButtonClickListener(View.OnClickListener onClickListener) {
        this.f1826h.setOnClickListener(onClickListener);
    }

    public void setOnMenuButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f1826h.setOnLongClickListener(onLongClickListener);
    }

    public void setOnMenuToggleListener(i iVar) {
        this.f1833n0 = iVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
