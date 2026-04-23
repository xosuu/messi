package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.ur0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c2 extends ViewGroup {
    public int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14824b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14825d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14826f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14827h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14828q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f14829s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14830t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f14831u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f14832v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f14833w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14834x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14835y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f14836z;

    public c2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14823a = true;
        this.f14824b = -1;
        this.f14825d = 0;
        this.f14827h = 8388659;
        int[] iArr = e.a.f12608o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        ur0 ur0Var = new ur0(context, 5, typedArrayObtainStyledAttributes);
        o0.v0.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10);
        int iB = ur0Var.B(1, -1);
        if (iB >= 0) {
            setOrientation(iB);
        }
        int iB2 = ur0Var.B(0, -1);
        if (iB2 >= 0) {
            setGravity(iB2);
        }
        boolean zU = ur0Var.u(2, true);
        if (!zU) {
            setBaselineAligned(zU);
        }
        this.f14829s = ((TypedArray) ur0Var.f9601d).getFloat(4, -1.0f);
        this.f14824b = ur0Var.B(3, -1);
        this.f14830t = ur0Var.u(7, false);
        setDividerDrawable(ur0Var.y(5));
        this.f14836z = ur0Var.B(8, 0);
        this.A = ur0Var.x(6, 0);
        ur0Var.M();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b2;
    }

    public final void f(Canvas canvas, int i10) {
        this.f14833w.setBounds(getPaddingLeft() + this.A, i10, (getWidth() - getPaddingRight()) - this.A, this.f14835y + i10);
        this.f14833w.draw(canvas);
    }

    public final void g(Canvas canvas, int i10) {
        this.f14833w.setBounds(i10, getPaddingTop() + this.A, this.f14834x + i10, (getHeight() - getPaddingBottom()) - this.A);
        this.f14833w.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f14824b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f14824b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f14824b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f14825d;
        if (this.f14826f == 1 && (i10 = this.f14827h & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f14828q) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f14828q;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((b2) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f14824b;
    }

    public Drawable getDividerDrawable() {
        return this.f14833w;
    }

    public int getDividerPadding() {
        return this.A;
    }

    public int getDividerWidth() {
        return this.f14834x;
    }

    public int getGravity() {
        return this.f14827h;
    }

    public int getOrientation() {
        return this.f14826f;
    }

    public int getShowDividers() {
        return this.f14836z;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f14829s;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b2 generateDefaultLayoutParams() {
        int i10 = this.f14826f;
        if (i10 == 0) {
            return new b2(-2, -2);
        }
        if (i10 == 1) {
            return new b2(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b2 generateLayoutParams(AttributeSet attributeSet) {
        return new b2(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public b2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b2(layoutParams);
    }

    public final boolean k(int i10) {
        if (i10 == 0) {
            return (this.f14836z & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f14836z & 4) != 0;
        }
        if ((this.f14836z & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        if (this.f14833w == null) {
            return;
        }
        int i11 = 0;
        if (this.f14826f == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && k(i11)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((b2) childAt.getLayoutParams())).topMargin) - this.f14835y);
                }
                i11++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f14835y : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((b2) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = e4.a(this);
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i11)) {
                b2 b2Var = (b2) childAt3.getLayoutParams();
                g(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) b2Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) b2Var).leftMargin) - this.f14834x);
            }
            i11++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                b2 b2Var2 = (b2) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) b2Var2).leftMargin;
                    i10 = this.f14834x;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) b2Var2).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f14834x;
                right = left - i10;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a4  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c2.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 2202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c2.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z9) {
        this.f14823a = z9;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f14824b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f14833w) {
            return;
        }
        this.f14833w = drawable;
        if (drawable != null) {
            this.f14834x = drawable.getIntrinsicWidth();
            this.f14835y = drawable.getIntrinsicHeight();
        } else {
            this.f14834x = 0;
            this.f14835y = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.A = i10;
    }

    public void setGravity(int i10) {
        if (this.f14827h != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f14827h = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f14827h;
        if ((8388615 & i12) != i11) {
            this.f14827h = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z9) {
        this.f14830t = z9;
    }

    public void setOrientation(int i10) {
        if (this.f14826f != i10) {
            this.f14826f = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f14836z) {
            requestLayout();
        }
        this.f14836z = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f14827h;
        if ((i12 & 112) != i11) {
            this.f14827h = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f14829s = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
