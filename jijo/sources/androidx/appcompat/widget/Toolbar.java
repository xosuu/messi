package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.ur0;
import g4.d0;
import j.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.c0;
import k.m;
import k.o;
import k.q;
import k.r;
import l.e4;
import l.o1;
import l.s3;
import l.t3;
import l.u3;
import l.v3;
import l.w2;
import l.w3;
import l.x3;
import l.z;
import o0.e0;
import o0.g0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public w2 F;
    public int G;
    public int H;
    public final int I;
    public CharSequence J;
    public CharSequence K;
    public ColorStateList L;
    public ColorStateList M;
    public boolean N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public final int[] R;
    public final ur0 S;
    public ArrayList T;
    public w3 U;
    public final q V;
    public x3 W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f343a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public b f344a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatTextView f345b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public u3 f346b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public c0 f347c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppCompatTextView f348d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public m f349d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f350e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z f351f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public OnBackInvokedCallback f352f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public OnBackInvokedDispatcher f353g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AppCompatImageView f354h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f355h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final androidx.activity.e f356i0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Drawable f357q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Context f361v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f363x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f364y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f365z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new i();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f366d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f367f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f366d = parcel.readInt();
            this.f367f = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f570a, i10);
            parcel.writeInt(this.f366d);
            parcel.writeInt(this.f367f ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j(getContext());
    }

    public static v3 h() {
        v3 v3Var = new v3(-2, -2);
        v3Var.f15039b = 0;
        v3Var.f12789a = 8388627;
        return v3Var;
    }

    public static v3 i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof v3) {
            v3 v3Var = (v3) layoutParams;
            v3 v3Var2 = new v3(v3Var);
            v3Var2.f15039b = 0;
            v3Var2.f15039b = v3Var.f15039b;
            return v3Var2;
        }
        if (layoutParams instanceof f.a) {
            v3 v3Var3 = new v3((f.a) layoutParams);
            v3Var3.f15039b = 0;
            return v3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            v3 v3Var4 = new v3(layoutParams);
            v3Var4.f15039b = 0;
            return v3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        v3 v3Var5 = new v3(marginLayoutParams);
        v3Var5.f15039b = 0;
        ((ViewGroup.MarginLayoutParams) v3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) v3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) v3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) v3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return v3Var5;
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return o0.m.b(marginLayoutParams) + o0.m.c(marginLayoutParams);
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        WeakHashMap weakHashMap = v0.f16075a;
        boolean z9 = e0.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, e0.d(this));
        arrayList.clear();
        if (!z9) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                v3 v3Var = (v3) childAt.getLayoutParams();
                if (v3Var.f15039b == 0 && u(childAt) && j(v3Var.f12789a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            v3 v3Var2 = (v3) childAt2.getLayoutParams();
            if (v3Var2.f15039b == 0 && u(childAt2) && j(v3Var2.f12789a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        v3 v3VarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (v3) layoutParams;
        v3VarH.f15039b = 1;
        if (!z9 || this.f360u == null) {
            addView(view, v3VarH);
        } else {
            view.setLayoutParams(v3VarH);
            this.Q.add(view);
        }
    }

    public final void c() {
        if (this.f359t == null) {
            z zVar = new z(getContext(), null, R.attr.a6q);
            this.f359t = zVar;
            zVar.setImageDrawable(this.f357q);
            this.f359t.setContentDescription(this.f358s);
            v3 v3VarH = h();
            v3VarH.f12789a = (this.f365z & 112) | 8388611;
            v3VarH.f15039b = 2;
            this.f359t.setLayoutParams(v3VarH);
            this.f359t.setOnClickListener(new f.b(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof v3);
    }

    public final void d() {
        if (this.F == null) {
            w2 w2Var = new w2();
            w2Var.f15042a = 0;
            w2Var.f15043b = 0;
            w2Var.f15044c = Integer.MIN_VALUE;
            w2Var.f15045d = Integer.MIN_VALUE;
            w2Var.f15046e = 0;
            w2Var.f15047f = 0;
            w2Var.f15048g = false;
            w2Var.f15049h = false;
            this.F = w2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f343a;
        if (actionMenuView.B == null) {
            o oVar = (o) actionMenuView.getMenu();
            if (this.f346b0 == null) {
                this.f346b0 = new u3(this);
            }
            this.f343a.setExpandedActionViewsExclusive(true);
            oVar.b(this.f346b0, this.f361v);
            w();
        }
    }

    public final void f() {
        if (this.f343a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f343a = actionMenuView;
            actionMenuView.setPopupTheme(this.f362w);
            this.f343a.setOnMenuItemClickListener(this.V);
            ActionMenuView actionMenuView2 = this.f343a;
            c0 c0Var = this.f347c0;
            m2.f fVar = new m2.f(7, this);
            actionMenuView2.G = c0Var;
            actionMenuView2.H = fVar;
            v3 v3VarH = h();
            v3VarH.f12789a = (this.f365z & 112) | 8388613;
            this.f343a.setLayoutParams(v3VarH);
            b(this.f343a, false);
        }
    }

    public final void g() {
        if (this.f351f == null) {
            this.f351f = new z(getContext(), null, R.attr.a6q);
            v3 v3VarH = h();
            v3VarH.f12789a = (this.f365z & 112) | 8388611;
            this.f351f.setLayoutParams(v3VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        z zVar = this.f359t;
        if (zVar != null) {
            return zVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        z zVar = this.f359t;
        if (zVar != null) {
            return zVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        w2 w2Var = this.F;
        if (w2Var != null) {
            return w2Var.f15048g ? w2Var.f15042a : w2Var.f15043b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.H;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        w2 w2Var = this.F;
        if (w2Var != null) {
            return w2Var.f15042a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        w2 w2Var = this.F;
        if (w2Var != null) {
            return w2Var.f15043b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        w2 w2Var = this.F;
        if (w2Var != null) {
            return w2Var.f15048g ? w2Var.f15043b : w2Var.f15042a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.G;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        o oVar;
        ActionMenuView actionMenuView = this.f343a;
        return (actionMenuView == null || (oVar = actionMenuView.B) == null || !oVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.H, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = v0.f16075a;
        return e0.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = v0.f16075a;
        return e0.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.G, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f354h;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f354h;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f343a.getMenu();
    }

    public View getNavButtonView() {
        return this.f351f;
    }

    public CharSequence getNavigationContentDescription() {
        z zVar = this.f351f;
        if (zVar != null) {
            return zVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        z zVar = this.f351f;
        if (zVar != null) {
            return zVar.getDrawable();
        }
        return null;
    }

    public b getOuterActionMenuPresenter() {
        return this.f344a0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f343a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f361v;
    }

    public int getPopupTheme() {
        return this.f362w;
    }

    public CharSequence getSubtitle() {
        return this.K;
    }

    public final TextView getSubtitleTextView() {
        return this.f348d;
    }

    public CharSequence getTitle() {
        return this.J;
    }

    public int getTitleMarginBottom() {
        return this.E;
    }

    public int getTitleMarginEnd() {
        return this.C;
    }

    public int getTitleMarginStart() {
        return this.B;
    }

    public int getTitleMarginTop() {
        return this.D;
    }

    public final TextView getTitleTextView() {
        return this.f345b;
    }

    public o1 getWrapper() {
        if (this.W == null) {
            this.W = new x3(this, true);
        }
        return this.W;
    }

    public final int j(int i10) {
        WeakHashMap weakHashMap = v0.f16075a;
        int iD = e0.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, iD) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : iD == 1 ? 5 : 3;
    }

    public final int k(View view, int i10) {
        v3 v3Var = (v3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = v3Var.f12789a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.I & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) v3Var).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) v3Var).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) v3Var).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    public final void n() {
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.S.f9601d).iterator();
        if (it2.hasNext()) {
            fb1.t(it2.next());
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.T = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.Q.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f356i0);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.O = false;
        }
        if (!this.O) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.O = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.O = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0293 A[LOOP:0: B:104:0x0291->B:105:0x0293, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02af A[LOOP:1: B:107:0x02ad->B:108:0x02af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ce A[LOOP:2: B:110:0x02cc->B:111:0x02ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x031c A[LOOP:3: B:119:0x031a->B:120:0x031c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int iL;
        int iMax;
        int iCombineMeasuredStates;
        int iL2;
        int iCombineMeasuredStates2;
        int iMax2;
        int iM;
        boolean zA = e4.a(this);
        int i12 = !zA ? 1 : 0;
        int i13 = 0;
        if (u(this.f351f)) {
            t(this.f351f, i10, 0, i11, this.A);
            iL = l(this.f351f) + this.f351f.getMeasuredWidth();
            iMax = Math.max(0, m(this.f351f) + this.f351f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f351f.getMeasuredState());
        } else {
            iL = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (u(this.f359t)) {
            t(this.f359t, i10, 0, i11, this.A);
            iL = l(this.f359t) + this.f359t.getMeasuredWidth();
            iMax = Math.max(iMax, m(this.f359t) + this.f359t.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f359t.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iL);
        int iMax4 = Math.max(0, currentContentInsetStart - iL);
        int[] iArr = this.R;
        iArr[zA ? 1 : 0] = iMax4;
        if (u(this.f343a)) {
            t(this.f343a, i10, iMax3, i11, this.A);
            iL2 = l(this.f343a) + this.f343a.getMeasuredWidth();
            iMax = Math.max(iMax, m(this.f343a) + this.f343a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f343a.getMeasuredState());
        } else {
            iL2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = Math.max(currentContentInsetEnd, iL2) + iMax3;
        iArr[i12] = Math.max(0, currentContentInsetEnd - iL2);
        if (u(this.f360u)) {
            iMax5 += s(this.f360u, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, m(this.f360u) + this.f360u.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f360u.getMeasuredState());
        }
        if (u(this.f354h)) {
            iMax5 += s(this.f354h, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, m(this.f354h) + this.f354h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f354h.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((v3) childAt.getLayoutParams()).f15039b == 0 && u(childAt)) {
                iMax5 += s(childAt, i10, iMax5, i11, 0, iArr);
                iMax = Math.max(iMax, m(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i15 = this.D + this.E;
        int i16 = this.B + this.C;
        if (u(this.f345b)) {
            s(this.f345b, i10, iMax5 + i16, i11, i15, iArr);
            int iL3 = l(this.f345b) + this.f345b.getMeasuredWidth();
            iM = m(this.f345b) + this.f345b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f345b.getMeasuredState());
            iMax2 = iL3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iM = 0;
        }
        if (u(this.f348d)) {
            iMax2 = Math.max(iMax2, s(this.f348d, i10, iMax5 + i16, i11, iM + i15, iArr));
            iM += m(this.f348d) + this.f348d.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f348d.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iM);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.f350e0) {
            i13 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i13 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i13);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f570a);
        ActionMenuView actionMenuView = this.f343a;
        o oVar = actionMenuView != null ? actionMenuView.B : null;
        int i10 = savedState.f366d;
        if (i10 != 0 && this.f346b0 != null && oVar != null && (menuItemFindItem = oVar.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f367f) {
            androidx.activity.e eVar = this.f356i0;
            removeCallbacks(eVar);
            post(eVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        w2 w2Var = this.F;
        boolean z9 = i10 == 1;
        if (z9 == w2Var.f15048g) {
            return;
        }
        w2Var.f15048g = z9;
        if (!w2Var.f15049h) {
            w2Var.f15042a = w2Var.f15046e;
            w2Var.f15043b = w2Var.f15047f;
            return;
        }
        if (z9) {
            int i11 = w2Var.f15045d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = w2Var.f15046e;
            }
            w2Var.f15042a = i11;
            int i12 = w2Var.f15044c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = w2Var.f15047f;
            }
            w2Var.f15043b = i12;
            return;
        }
        int i13 = w2Var.f15044c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = w2Var.f15046e;
        }
        w2Var.f15042a = i13;
        int i14 = w2Var.f15045d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = w2Var.f15047f;
        }
        w2Var.f15043b = i14;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        r rVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        u3 u3Var = this.f346b0;
        if (u3Var != null && (rVar = u3Var.f15027b) != null) {
            savedState.f366d = rVar.f14588a;
        }
        savedState.f367f = p();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.N = false;
        }
        if (!this.N) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.N = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.N = false;
        }
        return true;
    }

    public final boolean p() {
        b bVar;
        ActionMenuView actionMenuView = this.f343a;
        return (actionMenuView == null || (bVar = actionMenuView.F) == null || !bVar.i()) ? false : true;
    }

    public final int q(View view, int i10, int i11, int[] iArr) {
        v3 v3Var = (v3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) v3Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int iK = k(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iK, iMax + measuredWidth, view.getMeasuredHeight() + iK);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) v3Var).rightMargin + iMax;
    }

    public final int r(View view, int i10, int i11, int[] iArr) {
        v3 v3Var = (v3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) v3Var).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iK = k(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iK, iMax, view.getMeasuredHeight() + iK);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) v3Var).leftMargin);
    }

    public final int s(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z9) {
        if (this.f355h0 != z9) {
            this.f355h0 = z9;
            w();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(p7.q.g(getContext(), i10));
    }

    public void setCollapsible(boolean z9) {
        this.f350e0 = z9;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.H) {
            this.H = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.G) {
            this.G = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(p7.q.g(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(p7.q.g(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f351f.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(w3 w3Var) {
        this.U = w3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f343a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f362w != i10) {
            this.f362w = i10;
            if (i10 == 0) {
                this.f361v = getContext();
            } else {
                this.f361v = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.E = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.C = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.B = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.D = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final void t(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean v() {
        b bVar;
        ActionMenuView actionMenuView = this.f343a;
        return (actionMenuView == null || (bVar = actionMenuView.F) == null || !bVar.o()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = t3.a(this);
            u3 u3Var = this.f346b0;
            boolean z9 = false;
            int i10 = 1;
            if (((u3Var == null || u3Var.f15027b == null) ? false : true) && onBackInvokedDispatcherA != null) {
                WeakHashMap weakHashMap = v0.f16075a;
                if (g0.b(this) && this.f355h0) {
                    z9 = true;
                }
            }
            if (z9 && this.f353g0 == null) {
                if (this.f352f0 == null) {
                    this.f352f0 = t3.b(new s3(this, i10));
                }
                t3.c(onBackInvokedDispatcherA, this.f352f0);
                this.f353g0 = onBackInvokedDispatcherA;
                return;
            }
            if (z9 || (onBackInvokedDispatcher = this.f353g0) == null) {
                return;
            }
            t3.d(onBackInvokedDispatcher, this.f352f0);
            this.f353g0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.a6r);
        this.I = 8388627;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new int[2];
        this.S = new ur0(new s3(this, 0));
        this.T = new ArrayList();
        this.V = new q(2, this);
        this.f356i0 = new androidx.activity.e(4, this);
        Context context2 = getContext();
        int[] iArr = e.a.f12619z;
        ur0 ur0VarK = ur0.K(context2, attributeSet, iArr, R.attr.a6r);
        v0.p(this, context, iArr, attributeSet, (TypedArray) ur0VarK.f9601d, R.attr.a6r);
        this.f363x = ur0VarK.D(28, 0);
        this.f364y = ur0VarK.D(19, 0);
        this.I = ((TypedArray) ur0VarK.f9601d).getInteger(0, 8388627);
        this.f365z = ((TypedArray) ur0VarK.f9601d).getInteger(2, 48);
        int iW = ur0VarK.w(22, 0);
        iW = ur0VarK.H(27) ? ur0VarK.w(27, iW) : iW;
        this.E = iW;
        this.D = iW;
        this.C = iW;
        this.B = iW;
        int iW2 = ur0VarK.w(25, -1);
        if (iW2 >= 0) {
            this.B = iW2;
        }
        int iW3 = ur0VarK.w(24, -1);
        if (iW3 >= 0) {
            this.C = iW3;
        }
        int iW4 = ur0VarK.w(26, -1);
        if (iW4 >= 0) {
            this.D = iW4;
        }
        int iW5 = ur0VarK.w(23, -1);
        if (iW5 >= 0) {
            this.E = iW5;
        }
        this.A = ur0VarK.x(13, -1);
        int iW6 = ur0VarK.w(9, Integer.MIN_VALUE);
        int iW7 = ur0VarK.w(5, Integer.MIN_VALUE);
        int iX = ur0VarK.x(7, 0);
        int iX2 = ur0VarK.x(8, 0);
        d();
        w2 w2Var = this.F;
        w2Var.f15049h = false;
        if (iX != Integer.MIN_VALUE) {
            w2Var.f15046e = iX;
            w2Var.f15042a = iX;
        }
        if (iX2 != Integer.MIN_VALUE) {
            w2Var.f15047f = iX2;
            w2Var.f15043b = iX2;
        }
        if (iW6 != Integer.MIN_VALUE || iW7 != Integer.MIN_VALUE) {
            w2Var.a(iW6, iW7);
        }
        this.G = ur0VarK.w(10, Integer.MIN_VALUE);
        this.H = ur0VarK.w(6, Integer.MIN_VALUE);
        this.f357q = ur0VarK.y(4);
        this.f358s = ur0VarK.G(3);
        CharSequence charSequenceG = ur0VarK.G(21);
        if (!TextUtils.isEmpty(charSequenceG)) {
            setTitle(charSequenceG);
        }
        CharSequence charSequenceG2 = ur0VarK.G(18);
        if (!TextUtils.isEmpty(charSequenceG2)) {
            setSubtitle(charSequenceG2);
        }
        this.f361v = getContext();
        setPopupTheme(ur0VarK.D(17, 0));
        Drawable drawableY = ur0VarK.y(16);
        if (drawableY != null) {
            setNavigationIcon(drawableY);
        }
        CharSequence charSequenceG3 = ur0VarK.G(15);
        if (!TextUtils.isEmpty(charSequenceG3)) {
            setNavigationContentDescription(charSequenceG3);
        }
        Drawable drawableY2 = ur0VarK.y(11);
        if (drawableY2 != null) {
            setLogo(drawableY2);
        }
        CharSequence charSequenceG4 = ur0VarK.G(12);
        if (!TextUtils.isEmpty(charSequenceG4)) {
            setLogoDescription(charSequenceG4);
        }
        if (ur0VarK.H(29)) {
            setTitleTextColor(ur0VarK.v(29));
        }
        if (ur0VarK.H(20)) {
            setSubtitleTextColor(ur0VarK.v(20));
        }
        if (ur0VarK.H(14)) {
            getMenuInflater().inflate(ur0VarK.D(14, 0), getMenu());
        }
        ur0VarK.M();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        v3 v3Var = new v3(context, attributeSet);
        v3Var.f12789a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a.f12595b);
        v3Var.f12789a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        v3Var.f15039b = 0;
        return v3Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        z zVar = this.f359t;
        if (zVar != null) {
            zVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f359t.setImageDrawable(drawable);
        } else {
            z zVar = this.f359t;
            if (zVar != null) {
                zVar.setImageDrawable(this.f357q);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f354h == null) {
                this.f354h = new AppCompatImageView(getContext(), null);
            }
            if (!o(this.f354h)) {
                b(this.f354h, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f354h;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.f354h);
                this.Q.remove(this.f354h);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f354h;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f354h == null) {
            this.f354h = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f354h;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        z zVar = this.f351f;
        if (zVar != null) {
            zVar.setContentDescription(charSequence);
            d0.j(this.f351f, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f351f)) {
                b(this.f351f, true);
            }
        } else {
            z zVar = this.f351f;
            if (zVar != null && o(zVar)) {
                removeView(this.f351f);
                this.Q.remove(this.f351f);
            }
        }
        z zVar2 = this.f351f;
        if (zVar2 != null) {
            zVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f348d;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.f348d);
                this.Q.remove(this.f348d);
            }
        } else {
            if (this.f348d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f348d = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f348d.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f364y;
                if (i10 != 0) {
                    this.f348d.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.M;
                if (colorStateList != null) {
                    this.f348d.setTextColor(colorStateList);
                }
            }
            if (!o(this.f348d)) {
                b(this.f348d, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f348d;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.K = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.M = colorStateList;
        AppCompatTextView appCompatTextView = this.f348d;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f345b;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.f345b);
                this.Q.remove(this.f345b);
            }
        } else {
            if (this.f345b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f345b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f345b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f363x;
                if (i10 != 0) {
                    this.f345b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.L;
                if (colorStateList != null) {
                    this.f345b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f345b)) {
                b(this.f345b, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f345b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.J = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        AppCompatTextView appCompatTextView = this.f345b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
