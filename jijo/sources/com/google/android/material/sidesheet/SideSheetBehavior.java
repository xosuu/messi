package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import b0.b;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.tp1;
import d5.g;
import d5.j;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o0.d0;
import o0.g0;
import o0.j0;
import o0.v0;
import p0.f;
import p0.t;
import v0.e;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4.a f11931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f11932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f11933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f11934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u3.j f11935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f11936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f11939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f11941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11943m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference f11944n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public WeakReference f11945o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f11946p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public VelocityTracker f11947q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11948r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f11949s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e5.b f11950t;

    public SideSheetBehavior() {
        this.f11935e = new u3.j(this);
        this.f11937g = true;
        this.f11938h = 5;
        this.f11941k = 0.1f;
        this.f11946p = -1;
        this.f11949s = new LinkedHashSet();
        this.f11950t = new e5.b(this);
    }

    @Override // b0.b
    public final void c(b0.e eVar) {
        this.f11944n = null;
        this.f11939i = null;
    }

    @Override // b0.b
    public final void f() {
        this.f11944n = null;
        this.f11939i = null;
    }

    @Override // b0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && v0.e(view) == null) || !this.f11937g) {
            this.f11940j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f11947q) != null) {
            velocityTracker.recycle();
            this.f11947q = null;
        }
        if (this.f11947q == null) {
            this.f11947q = VelocityTracker.obtain();
        }
        this.f11947q.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f11948r = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f11940j) {
            this.f11940j = false;
            return false;
        }
        return (this.f11940j || (eVar = this.f11939i) == null || !eVar.q(motionEvent)) ? false : true;
    }

    @Override // b0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11;
        View viewFindViewById;
        WeakHashMap weakHashMap = v0.f16075a;
        if (d0.b(coordinatorLayout) && !d0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int left = 0;
        if (this.f11944n == null) {
            this.f11944n = new WeakReference(view);
            g gVar = this.f11932b;
            if (gVar != null) {
                d0.q(view, gVar);
                g gVar2 = this.f11932b;
                float fI = this.f11936f;
                if (fI == -1.0f) {
                    fI = j0.i(view);
                }
                gVar2.k(fI);
            } else {
                ColorStateList colorStateList = this.f11933c;
                if (colorStateList != null) {
                    v0.s(view, colorStateList);
                }
            }
            int i12 = this.f11938h == 5 ? 4 : 0;
            if (view.getVisibility() != i12) {
                view.setVisibility(i12);
            }
            v();
            if (d0.c(view) == 0) {
                d0.s(view, 1);
            }
            if (v0.e(view) == null) {
                v0.r(view, view.getResources().getString(R.string.wa));
            }
        }
        if (this.f11939i == null) {
            this.f11939i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f11950t);
        }
        this.f11931a.getClass();
        int left2 = view.getLeft();
        coordinatorLayout.p(view, i10);
        this.f11943m = coordinatorLayout.getWidth();
        this.f11942l = view.getWidth();
        int i13 = this.f11938h;
        if (i13 == 1 || i13 == 2) {
            this.f11931a.getClass();
            left = left2 - view.getLeft();
        } else if (i13 != 3) {
            if (i13 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f11938h);
            }
            left = this.f11931a.h();
        }
        v0.j(view, left);
        if (this.f11945o == null && (i11 = this.f11946p) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i11)) != null) {
            this.f11945o = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f11949s.iterator();
        while (it.hasNext()) {
            fb1.t(it.next());
        }
        return true;
    }

    @Override // b0.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // b0.b
    public final void n(View view, Parcelable parcelable) {
        int i10 = ((SavedState) parcelable).f11951d;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f11938h = i10;
    }

    @Override // b0.b
    public final Parcelable o(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // b0.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11938h == 1 && actionMasked == 0) {
            return true;
        }
        if (t()) {
            this.f11939i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f11947q) != null) {
            velocityTracker.recycle();
            this.f11947q = null;
        }
        if (this.f11947q == null) {
            this.f11947q = VelocityTracker.obtain();
        }
        this.f11947q.addMovement(motionEvent);
        if (t() && actionMasked == 2 && !this.f11940j && t()) {
            float fAbs = Math.abs(this.f11948r - motionEvent.getX());
            e eVar = this.f11939i;
            if (fAbs > eVar.f17692b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f11940j;
    }

    public final void s(int i10) {
        View view;
        if (this.f11938h == i10) {
            return;
        }
        this.f11938h = i10;
        WeakReference weakReference = this.f11944n;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = this.f11938h == 5 ? 4 : 0;
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
        Iterator it = this.f11949s.iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            throw null;
        }
        v();
    }

    public final boolean t() {
        return this.f11939i != null && (this.f11937g || this.f11938h == 1);
    }

    public final void u(int i10, View view, boolean z9) {
        int iE;
        x4.a aVar = this.f11931a;
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) aVar.f18391b;
        if (i10 == 3) {
            iE = sideSheetBehavior.f11931a.e();
        } else {
            if (i10 != 5) {
                sideSheetBehavior.getClass();
                throw new IllegalArgumentException(fb1.g("Invalid state to get outward edge offset: ", i10));
            }
            iE = sideSheetBehavior.f11931a.h();
        }
        e eVar = ((SideSheetBehavior) aVar.f18391b).f11939i;
        if (eVar == null || (!z9 ? eVar.r(view, iE, view.getTop()) : eVar.p(iE, view.getTop()))) {
            s(i10);
        } else {
            s(2);
            this.f11935e.a(i10);
        }
    }

    public final void v() {
        View view;
        WeakReference weakReference = this.f11944n;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        v0.n(view, 262144);
        v0.i(view, 0);
        v0.n(view, 1048576);
        v0.i(view, 0);
        final int i10 = 5;
        if (this.f11938h != 5) {
            v0.o(view, f.f16187l, new t() { // from class: e5.a
                /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
                @Override // p0.t
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final boolean f(android.view.View r5) {
                    /*
                        r4 = this;
                        com.google.android.material.sidesheet.SideSheetBehavior r5 = r4.f12719a
                        r5.getClass()
                        r0 = 1
                        int r1 = r2
                        if (r1 == r0) goto L46
                        r2 = 2
                        if (r1 != r2) goto Le
                        goto L46
                    Le:
                        java.lang.ref.WeakReference r2 = r5.f11944n
                        if (r2 == 0) goto L42
                        java.lang.Object r2 = r2.get()
                        if (r2 != 0) goto L19
                        goto L42
                    L19:
                        java.lang.ref.WeakReference r2 = r5.f11944n
                        java.lang.Object r2 = r2.get()
                        android.view.View r2 = (android.view.View) r2
                        f0.n r3 = new f0.n
                        r3.<init>(r1, r0, r5)
                        android.view.ViewParent r5 = r2.getParent()
                        if (r5 == 0) goto L3e
                        boolean r5 = r5.isLayoutRequested()
                        if (r5 == 0) goto L3e
                        java.util.WeakHashMap r5 = o0.v0.f16075a
                        boolean r5 = o0.g0.b(r2)
                        if (r5 == 0) goto L3e
                        r2.post(r3)
                        goto L45
                    L3e:
                        r3.run()
                        goto L45
                    L42:
                        r5.s(r1)
                    L45:
                        return r0
                    L46:
                        java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "STATE_"
                        r2.<init>(r3)
                        if (r1 != r0) goto L54
                        java.lang.String r0 = "DRAGGING"
                        goto L56
                    L54:
                        java.lang.String r0 = "SETTLING"
                    L56:
                        java.lang.String r1 = " should not be set externally."
                        java.lang.String r0 = g1.a.r(r2, r0, r1)
                        r5.<init>(r0)
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e5.a.f(android.view.View):boolean");
                }
            });
        }
        final int i11 = 3;
        if (this.f11938h != 3) {
            v0.o(view, f.f16185j, new t() { // from class: e5.a
                @Override // p0.t
                public final boolean f(View v9) {
                    /*
                        this = this;
                        com.google.android.material.sidesheet.SideSheetBehavior r5 = r4.f12719a
                        r5.getClass()
                        r0 = 1
                        int r1 = r2
                        if (r1 == r0) goto L46
                        r2 = 2
                        if (r1 != r2) goto Le
                        goto L46
                    Le:
                        java.lang.ref.WeakReference r2 = r5.f11944n
                        if (r2 == 0) goto L42
                        java.lang.Object r2 = r2.get()
                        if (r2 != 0) goto L19
                        goto L42
                    L19:
                        java.lang.ref.WeakReference r2 = r5.f11944n
                        java.lang.Object r2 = r2.get()
                        android.view.View r2 = (android.view.View) r2
                        f0.n r3 = new f0.n
                        r3.<init>(r1, r0, r5)
                        android.view.ViewParent r5 = r2.getParent()
                        if (r5 == 0) goto L3e
                        boolean r5 = r5.isLayoutRequested()
                        if (r5 == 0) goto L3e
                        java.util.WeakHashMap r5 = o0.v0.f16075a
                        boolean r5 = o0.g0.b(r2)
                        if (r5 == 0) goto L3e
                        r2.post(r3)
                        goto L45
                    L3e:
                        r3.run()
                        goto L45
                    L42:
                        r5.s(r1)
                    L45:
                        return r0
                    L46:
                        java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "STATE_"
                        r2.<init>(r3)
                        if (r1 != r0) goto L54
                        java.lang.String r0 = "DRAGGING"
                        goto L56
                    L54:
                        java.lang.String r0 = "SETTLING"
                    L56:
                        java.lang.String r1 = " should not be set externally."
                        java.lang.String r0 = g1.a.r(r2, r0, r1)
                        r5.<init>(r0)
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e5.a.f(android.view.View):boolean");
                }
            });
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11951d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11951d = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f570a, i10);
            parcel.writeInt(this.f11951d);
        }

        public SavedState(android.view.AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f11951d = sideSheetBehavior.f11938h;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f11935e = new u3.j(this);
        this.f11937g = true;
        this.f11938h = 5;
        this.f11941k = 0.1f;
        this.f11946p = -1;
        this.f11949s = new LinkedHashSet();
        this.f11950t = new e5.b(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l4.a.A);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f11933c = tp1.g(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f11934d = j.b(context, attributeSet, 0, R.style.zl).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f11946p = resourceId;
            WeakReference weakReference = this.f11945o;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f11945o = null;
            WeakReference weakReference2 = this.f11944n;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = v0.f16075a;
                    if (g0.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        j jVar = this.f11934d;
        if (jVar != null) {
            g gVar = new g(jVar);
            this.f11932b = gVar;
            gVar.j(context);
            ColorStateList colorStateList = this.f11933c;
            if (colorStateList != null) {
                this.f11932b.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f11932b.setTint(typedValue.data);
            }
        }
        this.f11936f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f11937g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f11931a == null) {
            this.f11931a = new x4.a(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
