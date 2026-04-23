package androidx.drawerlayout.widget;

import android.R;
import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.internal.ads.gp0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.q;
import l.a0;
import o0.d0;
import o0.e0;
import o0.j0;
import o0.t1;
import o0.v0;
import p0.f;
import p8.o;
import p8.p;
import s0.i;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.activities.MobileIPHunter;
import team.dev.epro.apkcustom.activities.ResponseChecker;
import team.dev.epro.apkcustom.activities.SimpleMaker;
import team.dev.epro.apkcustom.activities.SmartGuide;
import team.dev.epro.apkcustom.dialogs.Dns;
import team.dev.epro.apkcustom.dialogs.ShortUrl;
import v0.e;
import x0.b;
import x0.c;
import x0.d;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] P = {R.attr.colorPrimaryDark};
    public static final int[] Q = {R.attr.layout_gravity};
    public static final boolean R;
    public static final boolean S;
    public static final boolean T;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public c E;
    public ArrayList F;
    public float G;
    public float H;
    public Drawable I;
    public Object J;
    public boolean K;
    public final ArrayList L;
    public Rect M;
    public Matrix N;
    public final q O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f572b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f573d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f574f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f575h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint f576q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f577s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f578t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x0.e f579u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x0.e f580v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f583y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f584z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f585d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f586f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f587h;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f588q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f589s;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f585d = 0;
            this.f585d = parcel.readInt();
            this.f586f = parcel.readInt();
            this.f587h = parcel.readInt();
            this.f588q = parcel.readInt();
            this.f589s = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f570a, i10);
            parcel.writeInt(this.f585d);
            parcel.writeInt(this.f586f);
            parcel.writeInt(this.f587h);
            parcel.writeInt(this.f588q);
            parcel.writeInt(this.f589s);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        R = true;
        S = true;
        T = i10 >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, xyz.easypro.httpcustom.R.attr.kh);
        this.f571a = new i(1);
        this.f574f = -1728053248;
        this.f576q = new Paint();
        this.f583y = true;
        this.f584z = 3;
        this.A = 3;
        this.B = 3;
        this.C = 3;
        this.O = new q(8, this);
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f573d = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        x0.e eVar = new x0.e(this, 3);
        this.f579u = eVar;
        x0.e eVar2 = new x0.e(this, 5);
        this.f580v = eVar2;
        e eVar3 = new e(getContext(), this, eVar);
        eVar3.f17692b = (int) (eVar3.f17692b * 1.0f);
        this.f577s = eVar3;
        eVar3.f17707q = 1;
        eVar3.f17704n = f11;
        eVar.f18282c = eVar3;
        e eVar4 = new e(getContext(), this, eVar2);
        eVar4.f17692b = (int) (1.0f * eVar4.f17692b);
        this.f578t = eVar4;
        eVar4.f17707q = 2;
        eVar4.f17704n = f11;
        eVar2.f18282c = eVar4;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = v0.f16075a;
        d0.s(this, 1);
        v0.q(this, new b(this));
        setMotionEventSplittingEnabled(false);
        if (d0.b(this)) {
            setOnApplyWindowInsetsListener(new x0.a());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(P);
            try {
                this.I = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, w0.a.f18071a, xyz.easypro.httpcustom.R.attr.kh, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f572b = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f572b = getResources().getDimension(xyz.easypro.httpcustom.R.dimen.ca);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.L = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String k(int i10) {
        return (i10 & 3) == 3 ? "LEFT" : (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    public static boolean l(View view) {
        WeakHashMap weakHashMap = v0.f16075a;
        return (d0.c(view) == 4 || d0.c(view) == 2) ? false : true;
    }

    public static boolean m(View view) {
        return ((d) view.getLayoutParams()).f18277a == 0;
    }

    public static boolean n(View view) {
        if (o(view)) {
            return (((d) view.getLayoutParams()).f18280d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean o(View view) {
        int i10 = ((d) view.getLayoutParams()).f18277a;
        WeakHashMap weakHashMap = v0.f16075a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, e0.d(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static boolean p(View view) {
        if (o(view)) {
            return ((d) view.getLayoutParams()).f18278b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean a(View view, int i10) {
        return (j(view) & i10) == i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        boolean z9 = false;
        while (true) {
            arrayList2 = this.L;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (!o(childAt)) {
                arrayList2.add(childAt);
            } else if (n(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z9 = true;
            }
            i12++;
        }
        if (!z9) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) arrayList2.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (f() != null || o(view)) {
            WeakHashMap weakHashMap = v0.f16075a;
            d0.s(view, 4);
        } else {
            WeakHashMap weakHashMap2 = v0.f16075a;
            d0.s(view, 1);
        }
        if (R) {
            return;
        }
        v0.q(view, this.f571a);
    }

    public final void b(View view) {
        if (!o(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f583y) {
            dVar.f18278b = 0.0f;
            dVar.f18280d = 0;
        } else {
            dVar.f18280d |= 4;
            if (a(view, 3)) {
                this.f577s.r(view, -view.getWidth(), view.getTop());
            } else {
                this.f578t.r(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void c() {
        View viewE = e(8388611);
        if (viewE != null) {
            b(viewE);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + k(8388611));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((d) getChildAt(i10).getLayoutParams()).f18278b);
        }
        this.f575h = fMax;
        boolean zG = this.f577s.g();
        boolean zG2 = this.f578t.g();
        if (zG || zG2) {
            WeakHashMap weakHashMap = v0.f16075a;
            d0.k(this);
        }
    }

    public final void d(boolean z9) {
        boolean zR;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            d dVar = (d) childAt.getLayoutParams();
            if (o(childAt) && (!z9 || dVar.f18279c)) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    int top = childAt.getTop();
                    zR = this.f577s.r(childAt, -width, top);
                } else {
                    zR = this.f578t.r(childAt, getWidth(), childAt.getTop());
                }
                z10 |= zR;
                dVar.f18279c = false;
            }
        }
        x0.e eVar = this.f579u;
        eVar.f18284e.removeCallbacks(eVar.f18283d);
        x0.e eVar2 = this.f580v;
        eVar2.f18284e.removeCallbacks(eVar2.f18283d);
        if (z10) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f575h <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x9 = motionEvent.getX();
        float y8 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (this.M == null) {
                this.M = new Rect();
            }
            childAt.getHitRect(this.M);
            if (this.M.contains((int) x9, (int) y8) && !m(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.N == null) {
                            this.N = new Matrix();
                        }
                        matrix.invert(this.N);
                        motionEventObtain.transform(this.N);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Drawable background;
        int height = getHeight();
        boolean zM = m(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zM) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && o(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        float f10 = this.f575h;
        if (f10 > 0.0f && zM) {
            int i13 = this.f574f;
            Paint paint = this.f576q;
            paint.setColor((((int) ((((-16777216) & i13) >>> 24) * f10)) << 24) | (i13 & 16777215));
            canvas.drawRect(i10, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e(int i10) {
        WeakHashMap weakHashMap = v0.f16075a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, e0.d(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((j(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((d) childAt.getLayoutParams()).f18280d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View g() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (o(childAt) && p(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -1);
        dVar.f18277a = 0;
        return dVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            d dVar = (d) layoutParams;
            d dVar2 = new d(dVar);
            dVar2.f18277a = 0;
            dVar2.f18277a = dVar.f18277a;
            return dVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            d dVar3 = new d((ViewGroup.MarginLayoutParams) layoutParams);
            dVar3.f18277a = 0;
            return dVar3;
        }
        d dVar4 = new d(layoutParams);
        dVar4.f18277a = 0;
        return dVar4;
    }

    public float getDrawerElevation() {
        if (S) {
            return this.f572b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.I;
    }

    public final int h(int i10) {
        WeakHashMap weakHashMap = v0.f16075a;
        int iD = e0.d(this);
        if (i10 == 3) {
            int i11 = this.f584z;
            if (i11 != 3) {
                return i11;
            }
            int i12 = iD == 0 ? this.B : this.C;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.A;
            if (i13 != 3) {
                return i13;
            }
            int i14 = iD == 0 ? this.C : this.B;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.B;
            if (i15 != 3) {
                return i15;
            }
            int i16 = iD == 0 ? this.f584z : this.A;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.C;
        if (i17 != 3) {
            return i17;
        }
        int i18 = iD == 0 ? this.A : this.f584z;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    public final int i(View view) {
        if (o(view)) {
            return h(((d) view.getLayoutParams()).f18277a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int j(View view) {
        int i10 = ((d) view.getLayoutParams()).f18277a;
        WeakHashMap weakHashMap = v0.f16075a;
        return Gravity.getAbsoluteGravity(i10, e0.d(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f583y = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f583y = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.K || this.I == null) {
            return;
        }
        Object obj = this.J;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.I.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.I.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            v0.e r1 = r8.f577s
            boolean r2 = r1.q(r9)
            v0.e r3 = r8.f578t
            boolean r3 = r3.q(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L68
            if (r0 == r3) goto L61
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L61
            goto L66
        L1e:
            float[] r9 = r1.f17694d
            int r9 = r9.length
            r0 = 0
        L22:
            if (r0 >= r9) goto L66
            int r5 = r1.f17701k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L5e
            float[] r5 = r1.f17696f
            r5 = r5[r0]
            float[] r6 = r1.f17694d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.f17697g
            r6 = r6[r0]
            float[] r7 = r1.f17695e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.f17692b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5e
            x0.e r9 = r8.f579u
            androidx.activity.e r0 = r9.f18283d
            androidx.drawerlayout.widget.DrawerLayout r9 = r9.f18284e
            r9.removeCallbacks(r0)
            x0.e r9 = r8.f580v
            androidx.activity.e r0 = r9.f18283d
            androidx.drawerlayout.widget.DrawerLayout r9 = r9.f18284e
            r9.removeCallbacks(r0)
            goto L66
        L5e:
            int r0 = r0 + 1
            goto L22
        L61:
            r8.d(r3)
            r8.D = r4
        L66:
            r9 = 0
            goto L8e
        L68:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.G = r0
            r8.H = r9
            float r5 = r8.f575h
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L8b
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.h(r0, r9)
            if (r9 == 0) goto L8b
            boolean r9 = m(r9)
            if (r9 == 0) goto L8b
            r9 = 1
            goto L8c
        L8b:
            r9 = 0
        L8c:
            r8.D = r4
        L8e:
            if (r2 != 0) goto Lb1
            if (r9 != 0) goto Lb1
            int r9 = r8.getChildCount()
            r0 = 0
        L97:
            if (r0 >= r9) goto Lab
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            x0.d r1 = (x0.d) r1
            boolean r1 = r1.f18279c
            if (r1 == 0) goto La8
            goto Lb1
        La8:
            int r0 = r0 + 1
            goto L97
        Lab:
            boolean r9 = r8.D
            if (r9 == 0) goto Lb0
            goto Lb1
        Lb0:
            r3 = 0
        Lb1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || g() == null) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewG = g();
        if (viewG != null && i(viewG) == 0) {
            d(false);
        }
        return viewG != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        this.f582x = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (m(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) dVar).topMargin, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (dVar.f18278b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        f10 = (i15 - r11) / f12;
                        i14 = i15 - ((int) (dVar.f18278b * f12));
                    }
                    boolean z10 = f10 != dVar.f18278b;
                    int i18 = dVar.f18277a & 112;
                    if (i18 == 16) {
                        int i19 = i13 - i11;
                        int i20 = (i19 - measuredHeight) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight;
                            int i23 = i19 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                            if (i22 > i23) {
                                i20 = i23 - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i20, measuredWidth + i14, measuredHeight + i20);
                    } else if (i18 != 80) {
                        int i24 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        childAt.layout(i14, i24, measuredWidth + i14, measuredHeight + i24);
                    } else {
                        int i25 = i13 - i11;
                        childAt.layout(i14, (i25 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i25 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    }
                    if (z10) {
                        s(childAt, f10);
                    }
                    int i26 = dVar.f18278b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i26) {
                        childAt.setVisibility(i26);
                    }
                }
            }
        }
        if (T && (rootWindowInsets = getRootWindowInsets()) != null) {
            g0.c cVarI = t1.h(rootWindowInsets, null).f16068a.i();
            e eVar = this.f577s;
            eVar.f17705o = Math.max(eVar.f17706p, cVarI.f13601a);
            e eVar2 = this.f578t;
            eVar2.f17705o = Math.max(eVar2.f17706p, cVarI.f13603c);
        }
        this.f582x = false;
        this.f583y = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewE;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f570a);
        int i10 = savedState.f585d;
        if (i10 != 0 && (viewE = e(i10)) != null) {
            q(viewE);
        }
        int i11 = savedState.f586f;
        if (i11 != 3) {
            r(i11, 3);
        }
        int i12 = savedState.f587h;
        if (i12 != 3) {
            r(i12, 5);
        }
        int i13 = savedState.f588q;
        if (i13 != 3) {
            r(i13, 8388611);
        }
        int i14 = savedState.f589s;
        if (i14 != 3) {
            r(i14, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (S) {
            return;
        }
        WeakHashMap weakHashMap = v0.f16075a;
        e0.d(this);
        e0.d(this);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f585d = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            d dVar = (d) getChildAt(i10).getLayoutParams();
            int i11 = dVar.f18280d;
            boolean z9 = i11 == 1;
            boolean z10 = i11 == 2;
            if (z9 || z10) {
                savedState.f585d = dVar.f18277a;
                break;
            }
        }
        savedState.f586f = this.f584z;
        savedState.f587h = this.A;
        savedState.f588q = this.B;
        savedState.f589s = this.C;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            v0.e r0 = r6.f577s
            r0.j(r7)
            v0.e r1 = r6.f578t
            r1.j(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L5c
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            goto L6a
        L1a:
            r6.d(r3)
            r6.D = r2
            goto L6a
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.h(r4, r5)
            if (r4 == 0) goto L57
            boolean r4 = m(r4)
            if (r4 == 0) goto L57
            float r4 = r6.G
            float r1 = r1 - r4
            float r4 = r6.H
            float r7 = r7 - r4
            int r0 = r0.f17692b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L57
            android.view.View r7 = r6.f()
            if (r7 == 0) goto L57
            int r7 = r6.i(r7)
            r0 = 2
            if (r7 != r0) goto L58
        L57:
            r2 = 1
        L58:
            r6.d(r2)
            goto L6a
        L5c:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.G = r0
            r6.H = r7
            r6.D = r2
        L6a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void q(View view) {
        if (!o(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f583y) {
            dVar.f18278b = 1.0f;
            dVar.f18280d = 1;
            u(view, true);
            t(view);
        } else {
            dVar.f18280d |= 2;
            if (a(view, 3)) {
                this.f577s.r(view, 0, view.getTop());
            } else {
                this.f578t.r(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void r(int i10, int i11) {
        View viewE;
        WeakHashMap weakHashMap = v0.f16075a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, e0.d(this));
        if (i11 == 3) {
            this.f584z = i10;
        } else if (i11 == 5) {
            this.A = i10;
        } else if (i11 == 8388611) {
            this.B = i10;
        } else if (i11 == 8388613) {
            this.C = i10;
        }
        if (i10 != 0) {
            (absoluteGravity == 3 ? this.f577s : this.f578t).a();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewE = e(absoluteGravity)) != null) {
                q(viewE);
                return;
            }
            return;
        }
        View viewE2 = e(absoluteGravity);
        if (viewE2 != null) {
            b(viewE2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        if (z9) {
            d(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f582x) {
            return;
        }
        super.requestLayout();
    }

    public final void s(View view, float f10) {
        d dVar = (d) view.getLayoutParams();
        if (f10 == dVar.f18278b) {
            return;
        }
        dVar.f18278b = f10;
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                p pVar = (p) ((c) this.F.get(size));
                if (pVar.f16352d) {
                    pVar.a(Math.min(1.0f, Math.max(0.0f, f10)));
                } else {
                    pVar.a(0.0f);
                }
            }
        }
    }

    public void setDrawerElevation(float f10) {
        this.f572b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (o(childAt)) {
                float f11 = this.f572b;
                WeakHashMap weakHashMap = v0.f16075a;
                j0.s(childAt, f11);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        ArrayList arrayList;
        c cVar2 = this.E;
        if (cVar2 != null && (arrayList = this.F) != null) {
            arrayList.remove(cVar2);
        }
        if (cVar != null) {
            if (this.F == null) {
                this.F = new ArrayList();
            }
            this.F.add(cVar);
        }
        this.E = cVar;
    }

    public void setDrawerLockMode(int i10) {
        r(i10, 3);
        r(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f574f = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.I = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.I = new ColorDrawable(i10);
        invalidate();
    }

    public final void t(View view) {
        f fVar = f.f16187l;
        v0.n(view, fVar.a());
        v0.i(view, 0);
        if (!n(view) || i(view) == 2) {
            return;
        }
        v0.o(view, fVar, this.O);
    }

    public final void u(View view, boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z9 || o(childAt)) && !(z9 && childAt == view)) {
                WeakHashMap weakHashMap = v0.f16075a;
                d0.s(childAt, 4);
            } else {
                WeakHashMap weakHashMap2 = v0.f16075a;
                d0.s(childAt, 1);
            }
        }
    }

    public final void v(View view, int i10) throws Exception {
        int i11;
        View rootView;
        int i12 = this.f577s.f17691a;
        int i13 = this.f578t.f17691a;
        if (i12 == 1 || i13 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (i12 != 2 && i13 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((d) view.getLayoutParams()).f18278b;
            if (f10 == 0.0f) {
                d dVar = (d) view.getLayoutParams();
                if ((dVar.f18280d & 1) == 1) {
                    dVar.f18280d = 0;
                    ArrayList arrayList = this.F;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            final p pVar = (p) ((c) this.F.get(size));
                            MainActivity mainActivity = pVar.f16357i;
                            int i14 = mainActivity.A0;
                            mainActivity.U.a(false);
                            if (i14 == xyz.easypro.httpcustom.R.id.p4) {
                                App.f17101x.f0(SimpleMaker.class);
                            } else if (i14 == xyz.easypro.httpcustom.R.id.p5) {
                                mainActivity.f17116d0.putExtra("req", "payload");
                                mainActivity.startActivityForResult(mainActivity.f17116d0, 19);
                            } else if (i14 == xyz.easypro.httpcustom.R.id.p9) {
                                mainActivity.f17116d0.putExtra("req", "sni");
                                mainActivity.startActivityForResult(mainActivity.f17116d0, 17);
                            } else if (i14 == xyz.easypro.httpcustom.R.id.p_) {
                                mainActivity.f17116d0.putExtra("req", "udpfw");
                                mainActivity.startActivityForResult(mainActivity.f17116d0, 16);
                            } else if (i14 == xyz.easypro.httpcustom.R.id.p8) {
                                if (!App.f17100w.f17415a.getBoolean("mainFragment", true)) {
                                    a0.o(App.f17100w.f17415a, "mainFragment", true);
                                    mainActivity.H.h();
                                    mainActivity.Y.g(false);
                                    if (mainActivity.f17114b0 == 0) {
                                        mainActivity.U.setVisibility(0);
                                        mainActivity.U.b();
                                    }
                                    mainActivity.X.setVisibility(8);
                                    mainActivity.invalidateOptionsMenu();
                                }
                            } else if (i14 == xyz.easypro.httpcustom.R.id.pb) {
                                if (App.f17100w.f17415a.getBoolean("mainFragment", true)) {
                                    a0.o(App.f17100w.f17415a, "mainFragment", false);
                                    mainActivity.H.h();
                                    mainActivity.invalidateOptionsMenu();
                                }
                            } else if (i14 == xyz.easypro.httpcustom.R.id.p1) {
                                App.f17101x.f0(Dns.class);
                            } else if (i14 == xyz.easypro.httpcustom.R.id.p2) {
                                final String strB = team.dev.epro.apkcustom.widgets.e.b();
                                if (strB.equals("Not Valid")) {
                                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, mainActivity.getString(xyz.easypro.httpcustom.R.string.js));
                                } else {
                                    gp0 gp0Var = new gp0(mainActivity, xyz.easypro.httpcustom.R.style.hc);
                                    gp0Var.q("HWID");
                                    gp0Var.n(strB);
                                    gp0Var.m();
                                    gp0Var.p("Copy", new DialogInterface.OnClickListener() { // from class: p8.n
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i15) {
                                            p pVar2 = pVar;
                                            pVar2.getClass();
                                            a9.b bVar = MainActivity.N0;
                                            MainActivity mainActivity2 = pVar2.f16357i;
                                            ((ClipboardManager) mainActivity2.getSystemService(Crypt.a(Crypt.xrc("K<iNj?\u001d>l\u0019>9J9lN9;\u001c;o\u001a;9Aoj\u0019obIg")))).setPrimaryClip(ClipData.newPlainText(mainActivity2.getString(xyz.easypro.httpcustom.R.string.y6), strB));
                                            App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17393f, mainActivity2.getString(xyz.easypro.httpcustom.R.string.jr));
                                        }
                                    });
                                    gp0Var.o("Close", new o());
                                    gp0Var.e().show();
                                }
                            } else if (i14 == xyz.easypro.httpcustom.R.id.oz) {
                                App.f17101x.f0(SmartGuide.class);
                            } else if (i14 == xyz.easypro.httpcustom.R.id.p7) {
                                mainActivity.J0.a(new Intent(mainActivity, (Class<?>) ShortUrl.class));
                            } else if (i14 == xyz.easypro.httpcustom.R.id.p3) {
                                App.f17101x.f0(MobileIPHunter.class);
                            } else if (i14 == xyz.easypro.httpcustom.R.id.p6) {
                                App.f17101x.f0(ResponseChecker.class);
                            } else if (i14 == xyz.easypro.httpcustom.R.id.p0 && Build.VERSION.SDK_INT >= 23) {
                                Intent intent = new Intent();
                                String packageName = mainActivity.getPackageName();
                                PowerManager powerManager = (PowerManager) mainActivity.getSystemService("power");
                                if (powerManager == null || powerManager.isIgnoringBatteryOptimizations(packageName)) {
                                    mainActivity.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
                                } else {
                                    intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                    intent.setData(Uri.parse("package:" + packageName));
                                    mainActivity.startActivity(intent);
                                }
                            }
                            ProgressDialog progressDialog = mainActivity.B0;
                            if (progressDialog != null && progressDialog.isShowing()) {
                                mainActivity.B0.dismiss();
                                mainActivity.B0 = null;
                            }
                            mainActivity.A0 = 0;
                        }
                    }
                    u(view, false);
                    t(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f10 == 1.0f) {
                d dVar2 = (d) view.getLayoutParams();
                if ((dVar2.f18280d & 1) == 0) {
                    dVar2.f18280d = 1;
                    ArrayList arrayList2 = this.F;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            p pVar2 = (p) ((c) this.F.get(size2));
                            pVar2.a(1.0f);
                            if (pVar2.f16353e) {
                                pVar2.f16349a.l(pVar2.f16355g);
                            }
                        }
                    }
                    u(view, true);
                    t(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i11 != this.f581w) {
            this.f581w = i11;
            ArrayList arrayList3 = this.F;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((c) this.F.get(size3)).getClass();
                }
            }
        }
    }

    public void setStatusBarBackground(int i10) {
        Drawable drawableB;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = d0.f.f12287a;
            drawableB = d0.c.b(context, i10);
        } else {
            drawableB = null;
        }
        this.I = drawableB;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f18277a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q);
        dVar.f18277a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return dVar;
    }
}
