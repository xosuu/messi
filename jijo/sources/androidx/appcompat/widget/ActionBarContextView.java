package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import k.f0;
import k.o;
import l.e4;
import o0.d0;
import o0.d1;
import o0.v0;
import p7.q;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public TextView A;
    public TextView B;
    public final int C;
    public final int D;
    public boolean E;
    public final int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l.a f236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f237b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionMenuView f238d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f239f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f240h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d1 f241q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f243t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f244u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f245v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f246w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f247x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f248y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinearLayout f249z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.a4);
        this.f236a = new l.a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.e, typedValue, true) || typedValue.resourceId == 0) {
            this.f237b = context;
        } else {
            this.f237b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a.f12597d, R.attr.a4, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : q.g(context, resourceId);
        WeakHashMap weakHashMap = v0.f16075a;
        d0.q(this, drawable);
        this.C = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.D = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f240h = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.F = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    public static int j(int i10, int i11, int i12, View view, boolean z9) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z9) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z9 ? -measuredWidth : measuredWidth;
    }

    public final void c(j.b bVar) {
        View view = this.f246w;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.F, (ViewGroup) this, false);
            this.f246w = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f246w);
        }
        View viewFindViewById = this.f246w.findViewById(R.id.be);
        this.f247x = viewFindViewById;
        viewFindViewById.setOnClickListener(new l.c(this, bVar));
        o oVarC = bVar.c();
        b bVar2 = this.f239f;
        if (bVar2 != null) {
            bVar2.e();
            l.h hVar = bVar2.G;
            if (hVar != null && hVar.b()) {
                hVar.f14498j.dismiss();
            }
        }
        b bVar3 = new b(getContext());
        this.f239f = bVar3;
        bVar3.f385y = true;
        bVar3.f386z = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        oVarC.b(this.f239f, this.f237b);
        b bVar4 = this.f239f;
        f0 f0Var = bVar4.f380t;
        if (f0Var == null) {
            f0 f0Var2 = (f0) bVar4.f376f.inflate(bVar4.f378q, (ViewGroup) this, false);
            bVar4.f380t = f0Var2;
            f0Var2.d(bVar4.f375d);
            bVar4.h();
        }
        f0 f0Var3 = bVar4.f380t;
        if (f0Var != f0Var3) {
            ((ActionMenuView) f0Var3).setPresenter(bVar4);
        }
        ActionMenuView actionMenuView = (ActionMenuView) f0Var3;
        this.f238d = actionMenuView;
        WeakHashMap weakHashMap = v0.f16075a;
        d0.q(actionMenuView, null);
        addView(this.f238d, layoutParams);
    }

    public final void d() {
        if (this.f249z == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f249z = linearLayout;
            this.A = (TextView) linearLayout.findViewById(R.id.b0);
            this.B = (TextView) this.f249z.findViewById(R.id.az);
            int i10 = this.C;
            if (i10 != 0) {
                this.A.setTextAppearance(getContext(), i10);
            }
            int i11 = this.D;
            if (i11 != 0) {
                this.B.setTextAppearance(getContext(), i11);
            }
        }
        this.A.setText(this.f244u);
        this.B.setText(this.f245v);
        boolean z9 = !TextUtils.isEmpty(this.f244u);
        boolean z10 = !TextUtils.isEmpty(this.f245v);
        this.B.setVisibility(z10 ? 0 : 8);
        this.f249z.setVisibility((z9 || z10) ? 0 : 8);
        if (this.f249z.getParent() == null) {
            addView(this.f249z);
        }
    }

    public final void e() {
        removeAllViews();
        this.f248y = null;
        this.f238d = null;
        this.f239f = null;
        View view = this.f247x;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, e.a.f12594a, R.attr.h, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        b bVar = this.f239f;
        if (bVar != null) {
            Configuration configuration2 = bVar.f374b.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            bVar.C = (configuration2.smallestScreenWidthDp > 600 || i10 > 600 || (i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960)) ? 5 : (i10 >= 500 || (i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640)) ? 4 : i10 >= 360 ? 3 : 2;
            o oVar = bVar.f375d;
            if (oVar != null) {
                oVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f241q != null ? this.f236a.f14764b : getVisibility();
    }

    public int getContentHeight() {
        return this.f240h;
    }

    public CharSequence getSubtitle() {
        return this.f245v;
    }

    public CharSequence getTitle() {
        return this.f244u;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f243t = false;
        }
        if (!this.f243t) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f243t = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f243t = false;
        }
        return true;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f242s = false;
        }
        if (!this.f242s) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f242s = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f242s = false;
        }
        return true;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            d1 d1Var = this.f241q;
            if (d1Var != null) {
                d1Var.b();
            }
            super.setVisibility(i10);
        }
    }

    public final d1 l(int i10, long j10) {
        d1 d1Var = this.f241q;
        if (d1Var != null) {
            d1Var.b();
        }
        l.a aVar = this.f236a;
        if (i10 != 0) {
            d1 d1VarA = v0.a(this);
            d1VarA.a(0.0f);
            d1VarA.c(j10);
            aVar.f14765c.f241q = d1VarA;
            aVar.f14764b = i10;
            d1VarA.d(aVar);
            return d1VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        d1 d1VarA2 = v0.a(this);
        d1VarA2.a(1.0f);
        d1VarA2.c(j10);
        aVar.f14765c.f241q = d1VarA2;
        aVar.f14764b = i10;
        d1VarA2.d(aVar);
        return d1VarA2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f239f;
        if (bVar != null) {
            bVar.e();
            l.h hVar = this.f239f.G;
            if (hVar == null || !hVar.b()) {
                return;
            }
            hVar.f14498j.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        boolean zA = e4.a(this);
        int paddingRight = zA ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f246w;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f246w.getLayoutParams();
            int i14 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = zA ? paddingRight - i14 : paddingRight + i14;
            int iJ = j(i16, paddingTop, paddingTop2, this.f246w, zA) + i16;
            paddingRight = zA ? iJ - i15 : iJ + i15;
        }
        LinearLayout linearLayout = this.f249z;
        if (linearLayout != null && this.f248y == null && linearLayout.getVisibility() != 8) {
            paddingRight += j(paddingRight, paddingTop, paddingTop2, this.f249z, zA);
        }
        View view2 = this.f248y;
        if (view2 != null) {
            j(paddingRight, paddingTop, paddingTop2, view2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f238d;
        if (actionMenuView != null) {
            j(paddingLeft, paddingTop, paddingTop2, actionMenuView, !zA);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f240h;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f246w;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f246w.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f238d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f238d, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f249z;
        if (linearLayout != null && this.f248y == null) {
            if (this.E) {
                this.f249z.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f249z.getMeasuredWidth();
                boolean z9 = measuredWidth <= paddingLeft;
                if (z9) {
                    paddingLeft -= measuredWidth;
                }
                this.f249z.setVisibility(z9 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f248y;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f248y.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f240h > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    public void setContentHeight(int i10) {
        this.f240h = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f248y;
        if (view2 != null) {
            removeView(view2);
        }
        this.f248y = view;
        if (view != null && (linearLayout = this.f249z) != null) {
            removeView(linearLayout);
            this.f249z = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f245v = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f244u = charSequence;
        d();
        v0.r(this, charSequence);
    }

    public void setTitleOptional(boolean z9) {
        if (z9 != this.E) {
            requestLayout();
        }
        this.E = z9;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
