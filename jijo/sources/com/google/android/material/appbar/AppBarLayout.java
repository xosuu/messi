package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.material.appbar.AppBarLayout;
import d5.g;
import g4.a0;
import g4.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.q;
import n4.f;
import n4.h;
import n4.i;
import o0.d0;
import o0.e0;
import o0.g0;
import o0.j0;
import o0.o;
import o0.t1;
import o0.v0;
import x4.y;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements b0.a {
    public static final /* synthetic */ int J = 0;
    public ValueAnimator A;
    public final n4.a B;
    public final ArrayList C;
    public final long D;
    public final TimeInterpolator E;
    public int[] F;
    public Drawable G;
    public final float H;
    public Behavior I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11695b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11696d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11697f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11698h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11699q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t1 f11700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11701t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11702u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11703v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11704w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11705x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public WeakReference f11706y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ColorStateList f11707z;

    public static class BaseBehavior<T extends AppBarLayout> extends n4.e {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f11708j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f11709k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ValueAnimator f11710l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public SavedState f11711m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public WeakReference f11712n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f11713o;

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new e();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f11714d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f11715f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f11716h;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public float f11717q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public boolean f11718s;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f11714d = parcel.readByte() != 0;
                this.f11715f = parcel.readByte() != 0;
                this.f11716h = parcel.readInt();
                this.f11717q = parcel.readFloat();
                this.f11718s = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeParcelable(this.f570a, i10);
                parcel.writeByte(this.f11714d ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f11715f ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f11716h);
                parcel.writeFloat(this.f11717q);
                parcel.writeByte(this.f11718s ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.f15957f = -1;
            this.f15959h = -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void E(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            La:
                r4 = 0
                if (r3 >= r1) goto L21
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L1e
                goto L22
            L1e:
                int r3 = r3 + 1
                goto La
            L21:
                r5 = r4
            L22:
                if (r5 == 0) goto L5d
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                n4.d r0 = (n4.d) r0
                int r0 = r0.f15951a
                r1 = r0 & 1
                if (r1 == 0) goto L5d
                java.util.WeakHashMap r1 = o0.v0.f16075a
                int r1 = o0.d0.d(r5)
                r3 = 1
                if (r10 <= 0) goto L4b
                r10 = r0 & 12
                if (r10 == 0) goto L4b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L5d
                goto L5e
            L4b:
                r10 = r0 & 2
                if (r10 == 0) goto L5d
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L5d
                goto L5e
            L5d:
                r3 = 0
            L5e:
                boolean r9 = r8.f11704w
                if (r9 == 0) goto L6a
                android.view.View r9 = z(r7)
                boolean r3 = r8.f(r9)
            L6a:
                boolean r9 = r8.e(r3)
                if (r11 != 0) goto Laa
                if (r9 == 0) goto Lad
                j2.h r9 = r7.f427b
                java.lang.Object r9 = r9.f14298b
                s.k r9 = (s.k) r9
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r7 = r7.f429f
                r7.clear()
                if (r9 == 0) goto L88
                r7.addAll(r9)
            L88:
                int r9 = r7.size()
            L8c:
                if (r2 >= r9) goto Lad
                java.lang.Object r10 = r7.get(r2)
                android.view.View r10 = (android.view.View) r10
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                b0.e r10 = (b0.e) r10
                b0.b r10 = r10.f1211a
                boolean r11 = r10 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r11 == 0) goto La7
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r10
                int r7 = r10.f15964f
                if (r7 == 0) goto Lad
                goto Laa
            La7:
                int r2 = r2 + 1
                goto L8c
            Laa:
                r8.jumpDrawablesToCurrentState()
            Lad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.E(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public static void y(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                    if (view.getScrollY() < ((double) view.getMeasuredHeight()) * 0.1d) {
                        appBarLayout.setExpanded(true);
                    }
                } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.setExpanded(false);
                }
            }
        }

        public static View z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof o) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final void A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int downNestedPreScrollRange;
            if (i10 != 0) {
                if (i10 < 0) {
                    int i12 = -appBarLayout.getTotalScrollRange();
                    i11 = i12;
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i12;
                } else {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i11 != downNestedPreScrollRange) {
                    iArr[1] = v(coordinatorLayout, appBarLayout, u() - i10, i11, downNestedPreScrollRange);
                }
            }
            if (appBarLayout.f11704w) {
                appBarLayout.e(appBarLayout.f(view));
            }
        }

        public final SavedState B(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iS = s();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + iS;
                if (childAt.getTop() + iS <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f569b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z9 = iS == 0;
                    savedState.f11715f = z9;
                    savedState.f11714d = !z9 && (-iS) >= appBarLayout.getTotalScrollRange();
                    savedState.f11716h = i10;
                    WeakHashMap weakHashMap = v0.f16075a;
                    savedState.f11718s = bottom == appBarLayout.getTopInset() + d0.d(childAt);
                    savedState.f11717q = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iU = u() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                n4.d dVar = (n4.d) childAt.getLayoutParams();
                if ((dVar.f15951a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i11 = -iU;
                if (top <= i11 && bottom >= i11) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i10);
                n4.d dVar2 = (n4.d) childAt2.getLayoutParams();
                int i12 = dVar2.f15951a;
                if ((i12 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int iD = -childAt2.getBottom();
                    if (i10 == 0) {
                        WeakHashMap weakHashMap = v0.f16075a;
                        if (d0.b(appBarLayout) && d0.b(childAt2)) {
                            topInset -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i12 & 2) == 2) {
                        WeakHashMap weakHashMap2 = v0.f16075a;
                        iD += d0.d(childAt2);
                    } else if ((i12 & 5) == 5) {
                        WeakHashMap weakHashMap3 = v0.f16075a;
                        int iD2 = d0.d(childAt2) + iD;
                        if (iU < iD2) {
                            topInset = iD2;
                        } else {
                            iD = iD2;
                        }
                    }
                    if ((i12 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) dVar2).topMargin;
                        iD -= ((LinearLayout.LayoutParams) dVar2).bottomMargin;
                    }
                    if (iU < (iD + topInset) / 2) {
                        topInset = iD;
                    }
                    x(coordinatorLayout, appBarLayout, g4.d0.d(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void D(androidx.coordinatorlayout.widget.CoordinatorLayout r11, com.google.android.material.appbar.AppBarLayout r12) {
            /*
                r10 = this;
                p0.f r0 = p0.f.f16183h
                int r0 = r0.a()
                o0.v0.n(r11, r0)
                r0 = 0
                o0.v0.i(r11, r0)
                p0.f r1 = p0.f.f16184i
                int r1 = r1.a()
                o0.v0.n(r11, r1)
                o0.v0.i(r11, r0)
                int r1 = r12.getTotalScrollRange()
                if (r1 != 0) goto L20
                return
            L20:
                int r1 = r11.getChildCount()
                r2 = 0
            L25:
                if (r2 >= r1) goto L3c
                android.view.View r3 = r11.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                b0.e r4 = (b0.e) r4
                b0.b r4 = r4.f1211a
                boolean r4 = r4 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r4 == 0) goto L39
            L37:
                r8 = r3
                goto L3e
            L39:
                int r2 = r2 + 1
                goto L25
            L3c:
                r3 = 0
                goto L37
            L3e:
                if (r8 != 0) goto L41
                return
            L41:
                int r1 = r12.getChildCount()
                r2 = 0
            L46:
                if (r2 >= r1) goto Lb1
                android.view.View r3 = r12.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                n4.d r3 = (n4.d) r3
                int r3 = r3.f15951a
                if (r3 == 0) goto Lae
                android.view.View$AccessibilityDelegate r1 = o0.v0.d(r11)
                if (r1 == 0) goto L5d
                goto L65
            L5d:
                com.google.android.material.appbar.b r1 = new com.google.android.material.appbar.b
                r1.<init>(r10)
                o0.v0.q(r11, r1)
            L65:
                int r1 = r10.u()
                int r2 = r12.getTotalScrollRange()
                int r2 = -r2
                r3 = 1
                if (r1 == r2) goto L7c
                p0.f r1 = p0.f.f16183h
                com.google.android.material.appbar.d r2 = new com.google.android.material.appbar.d
                r2.<init>(r12, r0)
                o0.v0.o(r11, r1, r2)
                r0 = 1
            L7c:
                int r1 = r10.u()
                if (r1 == 0) goto Laa
                r1 = -1
                boolean r1 = r8.canScrollVertically(r1)
                if (r1 == 0) goto L9f
                int r1 = r12.getDownNestedPreScrollRange()
                int r9 = -r1
                if (r9 == 0) goto Laa
                p0.f r0 = p0.f.f16184i
                com.google.android.material.appbar.c r1 = new com.google.android.material.appbar.c
                r4 = r1
                r5 = r10
                r6 = r11
                r7 = r12
                r4.<init>(r5, r6, r7, r8, r9)
                o0.v0.o(r11, r0, r1)
                goto Lab
            L9f:
                p0.f r0 = p0.f.f16184i
                com.google.android.material.appbar.d r1 = new com.google.android.material.appbar.d
                r1.<init>(r12, r3)
                o0.v0.o(r11, r0, r1)
                goto Lab
            Laa:
                r3 = r0
            Lab:
                r10.f11713o = r3
                return
            Lae:
                int r2 = r2 + 1
                goto L46
            Lb1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.D(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout):void");
        }

        /* JADX WARN: Type inference failed for: r7v13, types: [n4.b] */
        @Override // n4.g, b0.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            final AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f11711m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z9 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z9) {
                            x(coordinatorLayout, appBarLayout, i11);
                        } else {
                            w(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z9) {
                            x(coordinatorLayout, appBarLayout, 0);
                        } else {
                            w(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f11714d) {
                w(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f11715f) {
                w(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f11716h);
                int i12 = -childAt.getBottom();
                w(coordinatorLayout, appBarLayout, this.f11711m.f11718s ? appBarLayout.getTopInset() + d0.d(childAt) + i12 : Math.round(childAt.getHeight() * this.f11711m.f11717q) + i12);
            }
            appBarLayout.f11699q = 0;
            this.f11711m = null;
            int iD = g4.d0.d(s(), -appBarLayout.getTotalScrollRange(), 0);
            h hVar = this.f15965a;
            if (hVar == null) {
                this.f15966b = iD;
            } else if (hVar.f15970d != iD) {
                hVar.f15970d = iD;
                hVar.a();
            }
            E(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.f11694a = s();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap weakHashMap = v0.f16075a;
                d0.k(appBarLayout);
            }
            D(coordinatorLayout, appBarLayout);
            final View viewZ = z(coordinatorLayout);
            if (viewZ != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    viewZ.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: n4.b
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior baseBehavior = this.f15945a;
                            View view3 = viewZ;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            baseBehavior.getClass();
                            AppBarLayout.BaseBehavior.y(keyEvent, view3, appBarLayout2);
                            return false;
                        }
                    });
                } else {
                    viewZ.setOnKeyListener(new View.OnKeyListener() { // from class: n4.c
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view2, int i13, KeyEvent keyEvent) {
                            this.f15948a.getClass();
                            AppBarLayout.BaseBehavior.y(keyEvent, viewZ, appBarLayout);
                            return false;
                        }
                    });
                }
            }
            return true;
        }

        @Override // b0.b
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((b0.e) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.q(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // b0.b
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            A(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        @Override // b0.b
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                iArr[1] = v(coordinatorLayout, appBarLayout, u() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                D(coordinatorLayout, appBarLayout);
            }
        }

        @Override // b0.b
        public final void n(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.f11711m = (SavedState) parcelable;
            } else {
                this.f11711m = null;
            }
        }

        @Override // b0.b
        public final Parcelable o(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateB = B(absSavedState, (AppBarLayout) view);
            return savedStateB == null ? absSavedState : savedStateB;
        }

        @Override // b0.b
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z9 = (i10 & 2) != 0 && (appBarLayout.f11704w || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z9 && (valueAnimator = this.f11710l) != null) {
                valueAnimator.cancel();
            }
            this.f11712n = null;
            this.f11709k = i11;
            return z9;
        }

        @Override // b0.b
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f11709k == 0 || i10 == 1) {
                C(coordinatorLayout, appBarLayout);
                if (appBarLayout.f11704w) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.f11712n = new WeakReference(view2);
        }

        @Override // n4.e
        public final int u() {
            return s() + this.f11708j;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x019f  */
        @Override // n4.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int v(androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20, int r21, int r22, int r23) {
            /*
                Method dump skipped, instruction units count: 427
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.v(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public final void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(u() - i10);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iU = u();
            if (iU == i10) {
                ValueAnimator valueAnimator = this.f11710l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f11710l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f11710l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f11710l = valueAnimator3;
                valueAnimator3.setInterpolator(m4.a.f15744e);
                this.f11710l.addUpdateListener(new a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f11710l.setDuration(Math.min(iRound, 600));
            this.f11710l.setIntValues(iU, i10);
            this.f11710l.start();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f15957f = -1;
            this.f15959h = -1;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends f {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // b0.b
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // b0.b
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            b0.b bVar = ((b0.e) view2.getLayoutParams()).f1211a;
            if (bVar instanceof BaseBehavior) {
                v0.k(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).f11708j) + this.f15963e) - u(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f11704w) {
                return false;
            }
            appBarLayout.e(appBarLayout.f(view));
            return false;
        }

        @Override // b0.b
        public final void e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                v0.n(coordinatorLayout, p0.f.f16183h.a());
                v0.i(coordinatorLayout, 0);
                v0.n(coordinatorLayout, p0.f.f16184i.a());
                v0.i(coordinatorLayout, 0);
                v0.q(coordinatorLayout, null);
            }
        }

        @Override // b0.b
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z9) {
            AppBarLayout appBarLayoutV = v(coordinatorLayout.j(view));
            if (appBarLayoutV != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.f15961c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayoutV.d(false, !z9, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l4.a.f15212y);
            this.f15964f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(j5.a.a(context, attributeSet, R.attr.at, R.style.vo), attributeSet, R.attr.at);
        this.f11695b = -1;
        this.f11696d = -1;
        this.f11697f = -1;
        int i10 = 0;
        this.f11699q = 0;
        this.C = new ArrayList();
        Context context2 = getContext();
        int i11 = 1;
        setOrientation(1);
        int i12 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayE = y.e(context3, attributeSet, i.f15971a, R.attr.at, R.style.vo, new int[0]);
        try {
            if (typedArrayE.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayE.getResourceId(0, 0)));
            }
            typedArrayE.recycle();
            TypedArray typedArrayE2 = y.e(context2, attributeSet, l4.a.f15188a, R.attr.at, R.style.vo, new int[0]);
            Drawable drawable = typedArrayE2.getDrawable(0);
            WeakHashMap weakHashMap = v0.f16075a;
            d0.q(this, drawable);
            ColorStateList colorStateListG = tp1.g(context2, typedArrayE2, 6);
            this.f11707z = colorStateListG;
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                g gVar = new g();
                gVar.l(ColorStateList.valueOf(colorDrawable.getColor()));
                if (colorStateListG != null) {
                    gVar.setAlpha(this.f11703v ? 255 : 0);
                    gVar.l(colorStateListG);
                    this.B = new n4.a(this, i10, gVar);
                } else {
                    gVar.j(context2);
                    this.B = new n4.a(this, i11, gVar);
                }
                d0.q(this, gVar);
            }
            this.D = a0.w(context2, R.attr.wt, getResources().getInteger(R.integer.c));
            this.E = a0.x(context2, R.attr.xa, m4.a.f15740a);
            if (typedArrayE2.hasValue(4)) {
                d(typedArrayE2.getBoolean(4, false), false, false);
            }
            if (typedArrayE2.hasValue(3)) {
                i.a(this, typedArrayE2.getDimensionPixelSize(3, 0));
            }
            int i13 = 26;
            if (i12 >= 26) {
                if (typedArrayE2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayE2.getBoolean(2, false));
                }
                if (typedArrayE2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayE2.getBoolean(1, false));
                }
            }
            this.H = getResources().getDimension(R.dimen.ce);
            this.f11704w = typedArrayE2.getBoolean(5, false);
            this.f11705x = typedArrayE2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayE2.getDrawable(8));
            typedArrayE2.recycle();
            j0.u(this, new q(i13, this));
        } catch (Throwable th) {
            typedArrayE.recycle();
            throw th;
        }
    }

    public static n4.d b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            n4.d dVar = new n4.d((LinearLayout.LayoutParams) layoutParams);
            dVar.f15951a = 1;
            return dVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            n4.d dVar2 = new n4.d((ViewGroup.MarginLayoutParams) layoutParams);
            dVar2.f15951a = 1;
            return dVar2;
        }
        n4.d dVar3 = new n4.d(layoutParams);
        dVar3.f15951a = 1;
        return dVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n4.d generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        n4.d dVar = new n4.d(context, attributeSet);
        dVar.f15951a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l4.a.f15189b);
        dVar.f15951a = typedArrayObtainStyledAttributes.getInt(1, 0);
        dVar.f15952b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new f.f(25);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            dVar.f15953c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return dVar;
    }

    public final void c() {
        Behavior behavior = this.I;
        BaseBehavior.SavedState savedStateB = (behavior == null || this.f11695b == -1 || this.f11699q != 0) ? null : behavior.B(AbsSavedState.f569b, this);
        this.f11695b = -1;
        this.f11696d = -1;
        this.f11697f = -1;
        if (savedStateB != null) {
            Behavior behavior2 = this.I;
            if (behavior2.f11711m != null) {
                return;
            }
            behavior2.f11711m = savedStateB;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof n4.d;
    }

    public final void d(boolean z9, boolean z10, boolean z11) {
        this.f11699q = (z9 ? 1 : 2) | (z10 ? 4 : 0) | (z11 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.G == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f11694a);
        this.G.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.G;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z9) {
        if (!(!this.f11701t) || this.f11703v == z9) {
            return false;
        }
        this.f11703v = z9;
        refreshDrawableState();
        if (!this.f11704w || !(getBackground() instanceof g)) {
            return true;
        }
        if (this.f11707z != null) {
            h(z9 ? 0.0f : 255.0f, z9 ? 255.0f : 0.0f);
            return true;
        }
        float f10 = this.H;
        h(z9 ? 0.0f : f10, z9 ? f10 : 0.0f);
        return true;
    }

    public final boolean f(View view) {
        int i10;
        if (this.f11706y == null && (i10 = this.f11705x) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f11705x);
            }
            if (viewFindViewById != null) {
                this.f11706y = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f11706y;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean g() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap weakHashMap = v0.f16075a;
        return !d0.b(childAt);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n4.d dVar = new n4.d(-1, -2);
        dVar.f15951a = 1;
        return dVar;
    }

    @Override // b0.a
    public b0.b getBehavior() {
        Behavior behavior = new Behavior();
        this.I = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f11696d
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = 0
        Le:
            if (r0 < 0) goto L69
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L66
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            n4.d r4 = (n4.d) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f15951a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L63
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3f
            java.util.WeakHashMap r4 = o0.v0.f16075a
            int r4 = o0.d0.d(r3)
        L3d:
            int r4 = r4 + r7
            goto L4e
        L3f:
            r4 = r6 & 2
            if (r4 == 0) goto L4c
            java.util.WeakHashMap r4 = o0.v0.f16075a
            int r4 = o0.d0.d(r3)
            int r4 = r5 - r4
            goto L3d
        L4c:
            int r4 = r7 + r5
        L4e:
            if (r0 != 0) goto L61
            java.util.WeakHashMap r6 = o0.v0.f16075a
            boolean r3 = o0.d0.b(r3)
            if (r3 == 0) goto L61
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L61:
            int r2 = r2 + r4
            goto L66
        L63:
            if (r2 <= 0) goto L66
            goto L69
        L66:
            int r0 = r0 + (-1)
            goto Le
        L69:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f11696d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f11697f;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int iD = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                n4.d dVar = (n4.d) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + childAt.getMeasuredHeight();
                int i12 = dVar.f15951a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iD += measuredHeight;
                if ((i12 & 2) != 0) {
                    WeakHashMap weakHashMap = v0.f16075a;
                    iD -= d0.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, iD);
        this.f11697f = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f11705x;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = v0.f16075a;
        int iD = d0.d(this);
        if (iD == 0) {
            int childCount = getChildCount();
            iD = childCount >= 1 ? d0.d(getChildAt(childCount - 1)) : 0;
            if (iD == 0) {
                return getHeight() / 3;
            }
        }
        return (iD * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f11699q;
    }

    public Drawable getStatusBarForeground() {
        return this.G;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        t1 t1Var = this.f11700s;
        if (t1Var != null) {
            return t1Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f11695b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int iD = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                n4.d dVar = (n4.d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = dVar.f15951a;
                if ((i12 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + iD;
                if (i11 == 0) {
                    WeakHashMap weakHashMap = v0.f16075a;
                    if (d0.b(childAt)) {
                        topInset -= getTopInset();
                    }
                }
                iD = topInset;
                if ((i12 & 2) != 0) {
                    WeakHashMap weakHashMap2 = v0.f16075a;
                    iD -= d0.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, iD);
        this.f11695b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void h(float f10, float f11) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.D);
        this.A.setInterpolator(this.E);
        n4.a aVar = this.B;
        if (aVar != null) {
            this.A.addUpdateListener(aVar);
        }
        this.A.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        en1.H(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.F == null) {
            this.F = new int[4];
        }
        int[] iArr = this.F;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z9 = this.f11702u;
        iArr[0] = z9 ? R.attr.a2_ : -2130969648;
        iArr[1] = (z9 && this.f11703v) ? R.attr.a2a : -2130969649;
        iArr[2] = z9 ? R.attr.a26 : -2130969644;
        iArr[3] = (z9 && this.f11703v) ? R.attr.a25 : -2130969643;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f11706y;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f11706y = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        WeakHashMap weakHashMap = v0.f16075a;
        boolean z10 = true;
        if (d0.b(this) && g()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                v0.k(getChildAt(childCount), topInset);
            }
        }
        c();
        this.f11698h = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((n4.d) getChildAt(i14).getLayoutParams()).f15953c != null) {
                this.f11698h = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f11701t) {
            return;
        }
        if (!this.f11704w) {
            int childCount3 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount3) {
                    z10 = false;
                    break;
                }
                int i16 = ((n4.d) getChildAt(i15).getLayoutParams()).f15951a;
                if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        if (this.f11702u != z10) {
            this.f11702u = z10;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = v0.f16075a;
            if (d0.b(this) && g()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = g4.d0.d(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        en1.F(this, f10);
    }

    public void setExpanded(boolean z9) {
        WeakHashMap weakHashMap = v0.f16075a;
        d(z9, g0.c(this), true);
    }

    public void setLiftOnScroll(boolean z9) {
        this.f11704w = z9;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f11705x = -1;
        if (view != null) {
            this.f11706y = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f11706y;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f11706y = null;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f11705x = i10;
        WeakReference weakReference = this.f11706y;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f11706y = null;
    }

    public void setLiftableOverrideEnabled(boolean z9) {
        this.f11701t = z9;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.G = drawableMutate;
            boolean z9 = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.G.setState(getDrawableState());
                }
                Drawable drawable3 = this.G;
                WeakHashMap weakHashMap = v0.f16075a;
                z.A(drawable3, e0.d(this));
                this.G.setVisible(getVisibility() == 0, false);
                this.G.setCallback(this);
            }
            if (this.G != null && getTopInset() > 0) {
                z9 = true;
            }
            setWillNotDraw(true ^ z9);
            WeakHashMap weakHashMap2 = v0.f16075a;
            d0.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(p7.q.g(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        i.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.G;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        n4.d dVar = new n4.d(-1, -2);
        dVar.f15951a = 1;
        return dVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
