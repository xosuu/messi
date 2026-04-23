package v0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import o0.v0;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f17690x = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17692b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f17694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f17695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f17696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f17697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f17698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f17699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f17700j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f17702l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f17703m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f17704n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17705o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f17706p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OverScroller f17708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f17709s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f17710t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17711u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f17712v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17693c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final androidx.activity.e f17713w = new androidx.activity.e(6, this);

    public e(Context context, ViewGroup viewGroup, i iVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (iVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f17712v = viewGroup;
        this.f17709s = iVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f17706p = i10;
        this.f17705o = i10;
        this.f17692b = viewConfiguration.getScaledTouchSlop();
        this.f17703m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f17704n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f17708r = new OverScroller(context, f17690x);
    }

    public final void a() {
        this.f17693c = -1;
        float[] fArr = this.f17694d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f17695e, 0.0f);
            Arrays.fill(this.f17696f, 0.0f);
            Arrays.fill(this.f17697g, 0.0f);
            Arrays.fill(this.f17698h, 0);
            Arrays.fill(this.f17699i, 0);
            Arrays.fill(this.f17700j, 0);
            this.f17701k = 0;
        }
        VelocityTracker velocityTracker = this.f17702l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17702l = null;
        }
    }

    public final void b(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f17712v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f17710t = view;
        this.f17693c = i10;
        this.f17709s.r(view, i10);
        o(1);
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f17698h[i10] & i11) != i11 || (this.f17707q & i11) == 0 || (this.f17700j[i10] & i11) == i11 || (this.f17699i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f17692b;
        if (fAbs <= i12 && fAbs2 <= i12) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f17709s.getClass();
        }
        return (this.f17699i[i10] & i11) == 0 && fAbs > ((float) this.f17692b);
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        i iVar = this.f17709s;
        boolean z9 = iVar.m(view) > 0;
        boolean z10 = iVar.n() > 0;
        if (!z9 || !z10) {
            return z9 ? Math.abs(f10) > ((float) this.f17692b) : z10 && Math.abs(f11) > ((float) this.f17692b);
        }
        float f12 = (f11 * f11) + (f10 * f10);
        int i10 = this.f17692b;
        return f12 > ((float) (i10 * i10));
    }

    public final void e(int i10) {
        float[] fArr = this.f17694d;
        if (fArr != null) {
            int i11 = this.f17701k;
            int i12 = 1 << i10;
            if ((i11 & i12) != 0) {
                fArr[i10] = 0.0f;
                this.f17695e[i10] = 0.0f;
                this.f17696f[i10] = 0.0f;
                this.f17697g[i10] = 0.0f;
                this.f17698h[i10] = 0;
                this.f17699i[i10] = 0;
                this.f17700j[i10] = 0;
                this.f17701k = (~i12) & i11;
            }
        }
    }

    public final int f(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        float width = this.f17712v.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f17691a == 2) {
            OverScroller overScroller = this.f17708r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f17710t.getLeft();
            int top = currY - this.f17710t.getTop();
            if (left != 0) {
                v0.j(this.f17710t, left);
            }
            if (top != 0) {
                v0.k(this.f17710t, top);
            }
            if (left != 0 || top != 0) {
                this.f17709s.t(this.f17710t, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
            } else if (!zComputeScrollOffset) {
            }
            this.f17712v.post(this.f17713w);
        }
        return this.f17691a == 2;
    }

    public final View h(int i10, int i11) {
        ViewGroup viewGroup = this.f17712v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f17709s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f17710t.getLeft();
        int top = this.f17710t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f17708r;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            o(0);
            return false;
        }
        View view = this.f17710t;
        int i16 = (int) this.f17704n;
        int i17 = (int) this.f17703m;
        int iAbs = Math.abs(i12);
        if (iAbs < i16) {
            i12 = 0;
        } else if (iAbs > i17) {
            i12 = i12 > 0 ? i17 : -i17;
        }
        int i18 = (int) this.f17704n;
        int iAbs2 = Math.abs(i13);
        if (iAbs2 < i18) {
            i13 = 0;
        } else if (iAbs2 > i17) {
            i13 = i13 > 0 ? i17 : -i17;
        }
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int iAbs5 = Math.abs(i12);
        int iAbs6 = Math.abs(i13);
        int i19 = iAbs5 + iAbs6;
        int i20 = iAbs3 + iAbs4;
        if (i12 != 0) {
            f10 = iAbs5;
            f11 = i19;
        } else {
            f10 = iAbs3;
            f11 = i20;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f12 = iAbs6;
            f13 = i19;
        } else {
            f12 = iAbs4;
            f13 = i20;
        }
        float f15 = f12 / f13;
        i iVar = this.f17709s;
        overScroller.startScroll(left, top, i14, i15, (int) ((f(i15, i13, iVar.n()) * f15) + (f(i14, i12, iVar.m(view)) * f14)));
        o(2);
        return true;
    }

    public final void j(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f17702l == null) {
            this.f17702l = VelocityTracker.obtain();
        }
        this.f17702l.addMovement(motionEvent);
        int i10 = 0;
        i iVar = this.f17709s;
        if (actionMasked == 0) {
            float x9 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewH = h((int) x9, (int) y8);
            m(x9, y8, pointerId);
            s(viewH, pointerId);
            if ((this.f17698h[pointerId] & this.f17707q) != 0) {
                iVar.q();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f17691a == 1) {
                k();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f17691a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i10 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i10);
                    if ((this.f17701k & (1 << pointerId2)) != 0) {
                        float x10 = motionEvent.getX(i10);
                        float y9 = motionEvent.getY(i10);
                        float f10 = x10 - this.f17694d[pointerId2];
                        float f11 = y9 - this.f17695e[pointerId2];
                        l(f10, f11, pointerId2);
                        if (this.f17691a != 1) {
                            View viewH2 = h((int) x10, (int) y9);
                            if (d(viewH2, f10, f11) && s(viewH2, pointerId2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i10++;
                }
                n(motionEvent);
                return;
            }
            int i11 = this.f17693c;
            if ((this.f17701k & (1 << i11)) != 0) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float y10 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f17696f;
                int i12 = this.f17693c;
                int i13 = (int) (x11 - fArr[i12]);
                int i14 = (int) (y10 - this.f17697g[i12]);
                int left = this.f17710t.getLeft() + i13;
                int top = this.f17710t.getTop() + i14;
                int left2 = this.f17710t.getLeft();
                int top2 = this.f17710t.getTop();
                if (i13 != 0) {
                    left = iVar.e(this.f17710t, left);
                    v0.j(this.f17710t, left - left2);
                }
                if (i14 != 0) {
                    top = iVar.f(this.f17710t, top);
                    v0.k(this.f17710t, top - top2);
                }
                if (i13 != 0 || i14 != 0) {
                    iVar.t(this.f17710t, left, top);
                }
                n(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f17691a == 1) {
                this.f17711u = true;
                iVar.u(this.f17710t, 0.0f, 0.0f);
                this.f17711u = false;
                if (this.f17691a == 1) {
                    o(0);
                }
            }
            a();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f17691a == 1 && pointerId3 == this.f17693c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i10 >= pointerCount2) {
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (pointerId4 != this.f17693c) {
                        View viewH3 = h((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                        View view = this.f17710t;
                        if (viewH3 == view && s(view, pointerId4)) {
                            if (this.f17693c == -1) {
                                break;
                            }
                        }
                    }
                    i10++;
                }
                k();
            }
            e(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x12 = motionEvent.getX(actionIndex);
        float y11 = motionEvent.getY(actionIndex);
        m(x12, y11, pointerId5);
        if (this.f17691a == 0) {
            s(h((int) x12, (int) y11), pointerId5);
            if ((this.f17698h[pointerId5] & this.f17707q) != 0) {
                iVar.q();
                return;
            }
            return;
        }
        int i15 = (int) x12;
        int i16 = (int) y11;
        View view2 = this.f17710t;
        if (view2 != null && i15 >= view2.getLeft() && i15 < view2.getRight() && i16 >= view2.getTop() && i16 < view2.getBottom()) {
            s(this.f17710t, pointerId5);
        }
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f17702l;
        float f10 = this.f17703m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f17702l.getXVelocity(this.f17693c);
        float f11 = this.f17704n;
        float fAbs = Math.abs(xVelocity);
        float f12 = 0.0f;
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f17702l.getYVelocity(this.f17693c);
        float f13 = this.f17704n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f13) {
            if (fAbs2 > f10) {
                if (yVelocity <= 0.0f) {
                    f10 = -f10;
                }
                f12 = f10;
            } else {
                f12 = yVelocity;
            }
        }
        this.f17711u = true;
        this.f17709s.u(this.f17710t, xVelocity, f12);
        this.f17711u = false;
        if (this.f17691a == 1) {
            o(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [t3.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l(float f10, float f11, int i10) {
        boolean zC = c(f10, f11, i10, 1);
        ?? r02 = zC;
        if (c(f11, f10, i10, 4)) {
            r02 = (zC ? 1 : 0) | 4;
        }
        ?? r03 = r02;
        if (c(f10, f11, i10, 2)) {
            r03 = (r02 == true ? 1 : 0) | 2;
        }
        ?? r04 = r03;
        if (c(f11, f10, i10, 8)) {
            r04 = (r03 == true ? 1 : 0) | 8;
        }
        if (r04 != 0) {
            int[] iArr = this.f17699i;
            iArr[i10] = iArr[i10] | r04;
            this.f17709s.p(r04, i10);
        }
    }

    public final void m(float f10, float f11, int i10) {
        float[] fArr = this.f17694d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f17695e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f17696f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f17697g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f17698h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f17699i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f17700j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f17694d = fArr2;
            this.f17695e = fArr3;
            this.f17696f = fArr4;
            this.f17697g = fArr5;
            this.f17698h = iArr;
            this.f17699i = iArr2;
            this.f17700j = iArr3;
        }
        float[] fArr9 = this.f17694d;
        this.f17696f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f17695e;
        this.f17697g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f17698h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        ViewGroup viewGroup = this.f17712v;
        int i14 = i12 < viewGroup.getLeft() + this.f17705o ? 1 : 0;
        if (i13 < viewGroup.getTop() + this.f17705o) {
            i14 |= 4;
        }
        if (i12 > viewGroup.getRight() - this.f17705o) {
            i14 |= 2;
        }
        if (i13 > viewGroup.getBottom() - this.f17705o) {
            i14 |= 8;
        }
        iArr7[i10] = i14;
        this.f17701k |= 1 << i10;
    }

    public final void n(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if ((this.f17701k & (1 << pointerId)) != 0) {
                float x9 = motionEvent.getX(i10);
                float y8 = motionEvent.getY(i10);
                this.f17696f[pointerId] = x9;
                this.f17697g[pointerId] = y8;
            }
        }
    }

    public final void o(int i10) {
        this.f17712v.removeCallbacks(this.f17713w);
        if (this.f17691a != i10) {
            this.f17691a = i10;
            this.f17709s.s(i10);
            if (this.f17691a == 0) {
                this.f17710t = null;
            }
        }
    }

    public final boolean p(int i10, int i11) {
        if (this.f17711u) {
            return i(i10, i11, (int) this.f17702l.getXVelocity(this.f17693c), (int) this.f17702l.getYVelocity(this.f17693c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.e.q(android.view.MotionEvent):boolean");
    }

    public final boolean r(View view, int i10, int i11) {
        this.f17710t = view;
        this.f17693c = -1;
        boolean zI = i(i10, i11, 0, 0);
        if (!zI && this.f17691a == 0 && this.f17710t != null) {
            this.f17710t = null;
        }
        return zI;
    }

    public final boolean s(View view, int i10) {
        if (view == this.f17710t && this.f17693c == i10) {
            return true;
        }
        if (view == null || !this.f17709s.y(view, i10)) {
            return false;
        }
        this.f17693c = i10;
        b(view, i10);
        return true;
    }
}
