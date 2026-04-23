package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.gms.internal.ads.fb1;
import k.c0;
import k.f0;
import k.m;
import k.n;
import k.o;
import k.q;
import k.r;
import l.b2;
import l.c2;
import l.e4;
import l.l;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends c2 implements n, f0 {
    public o B;
    public Context C;
    public int D;
    public boolean E;
    public b F;
    public c0 G;
    public m H;
    public boolean I;
    public int J;
    public final int K;
    public final int L;
    public l.o M;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.K = (int) (56.0f * f10);
        this.L = (int) (f10 * 4.0f);
        this.C = context;
        this.D = 0;
    }

    public static l.n l() {
        l.n nVar = new l.n(-2, -2);
        nVar.f14934a = false;
        ((LinearLayout.LayoutParams) nVar).gravity = 16;
        return nVar;
    }

    public static l.n m(ViewGroup.LayoutParams layoutParams) {
        l.n nVar;
        if (layoutParams == null) {
            return l();
        }
        if (layoutParams instanceof l.n) {
            l.n nVar2 = (l.n) layoutParams;
            nVar = new l.n(nVar2);
            nVar.f14934a = nVar2.f14934a;
        } else {
            nVar = new l.n(layoutParams);
        }
        if (((LinearLayout.LayoutParams) nVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) nVar).gravity = 16;
        }
        return nVar;
    }

    @Override // k.n
    public final boolean a(r rVar) {
        return this.B.q(rVar, null, 0);
    }

    @Override // l.c2, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof l.n;
    }

    @Override // k.f0
    public final void d(o oVar) {
        this.B = oVar;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.c2, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    @Override // l.c2, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.B == null) {
            Context context = getContext();
            o oVar = new o(context);
            this.B = oVar;
            oVar.f14563e = new q(1, this);
            b bVar = new b(context);
            this.F = bVar;
            bVar.f385y = true;
            bVar.f386z = true;
            c0 eVar = this.G;
            if (eVar == null) {
                eVar = new d5.e();
            }
            bVar.f377h = eVar;
            this.B.b(bVar, this.C);
            b bVar2 = this.F;
            bVar2.f380t = this;
            this.B = bVar2.f375d;
        }
        return this.B;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        b bVar = this.F;
        l lVar = bVar.f382v;
        if (lVar != null) {
            return lVar.getDrawable();
        }
        if (bVar.f384x) {
            return bVar.f383w;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.D;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.c2
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ b2 generateDefaultLayoutParams() {
        return l();
    }

    @Override // l.c2
    /* JADX INFO: renamed from: i */
    public final b2 generateLayoutParams(AttributeSet attributeSet) {
        return new l.n(getContext(), attributeSet);
    }

    @Override // l.c2
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ b2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i10) {
        boolean zA = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof l.m)) {
            zA = ((l.m) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof l.m)) ? zA : zA | ((l.m) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b bVar = this.F;
        if (bVar != null) {
            bVar.h();
            if (this.F.i()) {
                this.F.e();
                this.F.o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.F;
        if (bVar != null) {
            bVar.e();
            l.h hVar = bVar.G;
            if (hVar == null || !hVar.b()) {
                return;
            }
            hVar.f14498j.dismiss();
        }
    }

    @Override // l.c2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.I) {
            super.onLayout(z9, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zA = e4.a(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                l.n nVar = (l.n) childAt.getLayoutParams();
                if (nVar.f14934a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) nVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) nVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) nVar).leftMargin) + ((LinearLayout.LayoutParams) nVar).rightMargin;
                    n(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                l.n nVar2 = (l.n) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !nVar2.f14934a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) nVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) nVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            l.n nVar3 = (l.n) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !nVar3.f14934a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) nVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = fb1.e(measuredWidth4, ((LinearLayout.LayoutParams) nVar3).rightMargin, iMax, i27);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // l.c2, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z9;
        int i15;
        int i16;
        int i17;
        int i18;
        ?? r12;
        int i19;
        int i20;
        int i21;
        o oVar;
        boolean z10 = this.I;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.I = z11;
        if (z10 != z11) {
            this.J = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.I && (oVar = this.B) != null && size != this.J) {
            this.J = size;
            oVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.I || childCount <= 0) {
            for (int i22 = 0; i22 < childCount; i22++) {
                l.n nVar = (l.n) getChildAt(i22).getLayoutParams();
                ((LinearLayout.LayoutParams) nVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) nVar).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i23 = size2 - paddingRight;
        int i24 = this.K;
        int i25 = i23 / i24;
        int i26 = i23 % i24;
        if (i25 == 0) {
            setMeasuredDimension(i23, 0);
            return;
        }
        int i27 = (i26 / i25) + i24;
        int childCount2 = getChildCount();
        int i28 = 0;
        int iMax = 0;
        int i29 = 0;
        boolean z12 = false;
        long j10 = 0;
        int i30 = 0;
        int iMax2 = 0;
        while (true) {
            i12 = this.L;
            if (i29 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i29);
            int i31 = size3;
            if (childAt.getVisibility() == 8) {
                i19 = i23;
                i20 = paddingBottom;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                int i32 = i28 + 1;
                if (z13) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                l.n nVar2 = (l.n) childAt.getLayoutParams();
                nVar2.f14939f = false;
                nVar2.f14936c = 0;
                nVar2.f14935b = 0;
                nVar2.f14937d = false;
                ((LinearLayout.LayoutParams) nVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) nVar2).rightMargin = 0;
                nVar2.f14938e = z13 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i33 = nVar2.f14934a ? 1 : i25;
                l.n nVar3 = (l.n) childAt.getLayoutParams();
                i19 = i23;
                i20 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z13 ? (ActionMenuItemView) childAt : null;
                boolean z14 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i33 <= 0 || (z14 && i33 < 2)) {
                    i21 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i33 * i27, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i21 = measuredWidth / i27;
                    if (measuredWidth % i27 != 0) {
                        i21++;
                    }
                    if (z14 && i21 < 2) {
                        i21 = 2;
                    }
                }
                nVar3.f14937d = !nVar3.f14934a && z14;
                nVar3.f14935b = i21;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i21 * i27, 1073741824), iMakeMeasureSpec);
                iMax = Math.max(iMax, i21);
                if (nVar2.f14937d) {
                    i30++;
                }
                if (nVar2.f14934a) {
                    z12 = true;
                }
                i25 -= i21;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (i21 == 1) {
                    j10 |= (long) (1 << i29);
                }
                i28 = i32;
            }
            i29++;
            size3 = i31;
            paddingBottom = i20;
            i23 = i19;
        }
        int i34 = i23;
        int i35 = size3;
        int i36 = iMax2;
        boolean z15 = z12 && i28 == 2;
        boolean z16 = false;
        while (i30 > 0 && i25 > 0) {
            int i37 = Integer.MAX_VALUE;
            int i38 = 0;
            int i39 = 0;
            long j11 = 0;
            while (i39 < childCount2) {
                int i40 = i36;
                l.n nVar4 = (l.n) getChildAt(i39).getLayoutParams();
                boolean z17 = z16;
                if (nVar4.f14937d) {
                    int i41 = nVar4.f14935b;
                    if (i41 < i37) {
                        j11 = 1 << i39;
                        i37 = i41;
                        i38 = 1;
                    } else if (i41 == i37) {
                        i38++;
                        j11 |= 1 << i39;
                    }
                }
                i39++;
                z16 = z17;
                i36 = i40;
            }
            i14 = i36;
            z9 = z16;
            j10 |= j11;
            if (i38 > i25) {
                i13 = mode;
                break;
            }
            int i42 = i37 + 1;
            int i43 = 0;
            while (i43 < childCount2) {
                View childAt2 = getChildAt(i43);
                l.n nVar5 = (l.n) childAt2.getLayoutParams();
                int i44 = mode;
                int i45 = childMeasureSpec;
                int i46 = childCount2;
                long j12 = 1 << i43;
                if ((j11 & j12) != 0) {
                    if (z15 && nVar5.f14938e) {
                        r12 = 1;
                        r12 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i12 + i27, 0, i12, 0);
                        }
                    } else {
                        r12 = 1;
                    }
                    nVar5.f14935b += r12;
                    nVar5.f14939f = r12;
                    i25--;
                } else if (nVar5.f14935b == i42) {
                    j10 |= j12;
                }
                i43++;
                childMeasureSpec = i45;
                mode = i44;
                childCount2 = i46;
            }
            i36 = i14;
            z16 = true;
        }
        i13 = mode;
        i14 = i36;
        z9 = z16;
        int i47 = childMeasureSpec;
        int i48 = childCount2;
        boolean z18 = !z12 && i28 == 1;
        if (i25 <= 0 || j10 == 0 || (i25 >= i28 - 1 && !z18 && iMax <= 1)) {
            i15 = i48;
        } else {
            float fBitCount = Long.bitCount(j10);
            if (!z18) {
                if ((j10 & 1) != 0 && !((l.n) getChildAt(0).getLayoutParams()).f14938e) {
                    fBitCount -= 0.5f;
                }
                int i49 = i48 - 1;
                if ((j10 & ((long) (1 << i49))) != 0 && !((l.n) getChildAt(i49).getLayoutParams()).f14938e) {
                    fBitCount -= 0.5f;
                }
            }
            int i50 = fBitCount > 0.0f ? (int) ((i25 * i27) / fBitCount) : 0;
            i15 = i48;
            for (int i51 = 0; i51 < i15; i51++) {
                if ((j10 & ((long) (1 << i51))) != 0) {
                    View childAt3 = getChildAt(i51);
                    l.n nVar6 = (l.n) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        nVar6.f14936c = i50;
                        nVar6.f14939f = true;
                        if (i51 == 0 && !nVar6.f14938e) {
                            ((LinearLayout.LayoutParams) nVar6).leftMargin = (-i50) / 2;
                        }
                    } else if (nVar6.f14934a) {
                        nVar6.f14936c = i50;
                        nVar6.f14939f = true;
                        ((LinearLayout.LayoutParams) nVar6).rightMargin = (-i50) / 2;
                    } else {
                        if (i51 != 0) {
                            ((LinearLayout.LayoutParams) nVar6).leftMargin = i50 / 2;
                        }
                        if (i51 != i15 - 1) {
                            ((LinearLayout.LayoutParams) nVar6).rightMargin = i50 / 2;
                        }
                    }
                    z9 = true;
                }
            }
        }
        if (z9) {
            int i52 = 0;
            while (i52 < i15) {
                View childAt4 = getChildAt(i52);
                l.n nVar7 = (l.n) childAt4.getLayoutParams();
                if (nVar7.f14939f) {
                    i18 = i47;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((nVar7.f14935b * i27) + nVar7.f14936c, 1073741824), i18);
                } else {
                    i18 = i47;
                }
                i52++;
                i47 = i18;
            }
        }
        if (i13 != 1073741824) {
            i17 = i34;
            i16 = i14;
        } else {
            i16 = i35;
            i17 = i34;
        }
        setMeasuredDimension(i17, i16);
    }

    public void setExpandedActionViewsExclusive(boolean z9) {
        this.F.D = z9;
    }

    public void setOnMenuItemClickListener(l.o oVar) {
        this.M = oVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        b bVar = this.F;
        l lVar = bVar.f382v;
        if (lVar != null) {
            lVar.setImageDrawable(drawable);
        } else {
            bVar.f384x = true;
            bVar.f383w = drawable;
        }
    }

    public void setOverflowReserved(boolean z9) {
        this.E = z9;
    }

    public void setPopupTheme(int i10) {
        if (this.D != i10) {
            this.D = i10;
            if (i10 == 0) {
                this.C = getContext();
            } else {
                this.C = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(b bVar) {
        this.F = bVar;
        bVar.f380t = this;
        this.B = bVar.f375d;
    }

    @Override // l.c2, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new l.n(getContext(), attributeSet);
    }
}
