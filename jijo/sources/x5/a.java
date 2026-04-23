package x5;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Animation {
    public static final boolean C;
    public static final WeakHashMap D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f18484a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18486d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18488h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f18489q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f18490s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f18491t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f18492u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f18495x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f18496y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Camera f18485b = new Camera();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18487f = 1.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f18493v = 1.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f18494w = 1.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f18497z = new RectF();
    public final RectF A = new RectF();
    public final Matrix B = new Matrix();

    static {
        C = Integer.valueOf(Build.VERSION.SDK).intValue() < 11;
        D = new WeakHashMap();
    }

    public a(View view) {
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        this.f18484a = new WeakReference(view);
    }

    public static a e(View view) {
        WeakHashMap weakHashMap = D;
        a aVar = (a) weakHashMap.get(view);
        if (aVar != null && aVar == view.getAnimation()) {
            return aVar;
        }
        a aVar2 = new a(view);
        weakHashMap.put(view, aVar2);
        return aVar2;
    }

    public final void a(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        Matrix matrix = this.B;
        matrix.reset();
        d(matrix, view);
        matrix.mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        float f10 = rectF.right;
        float f11 = rectF.left;
        if (f10 < f11) {
            rectF.right = f11;
            rectF.left = f10;
        }
        float f12 = rectF.bottom;
        float f13 = rectF.top;
        if (f12 < f13) {
            rectF.top = f12;
            rectF.bottom = f13;
        }
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        View view = (View) this.f18484a.get();
        if (view != null) {
            transformation.setAlpha(this.f18487f);
            d(transformation.getMatrix(), view);
        }
    }

    public final void b() {
        View view = (View) this.f18484a.get();
        if (view == null || view.getParent() == null) {
            return;
        }
        RectF rectF = this.A;
        a(rectF, view);
        rectF.union(this.f18497z);
        ((View) view.getParent()).invalidate((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void c() {
        View view = (View) this.f18484a.get();
        if (view != null) {
            a(this.f18497z, view);
        }
    }

    public final void d(Matrix matrix, View view) {
        float width = view.getWidth();
        float height = view.getHeight();
        boolean z9 = this.f18486d;
        float f10 = z9 ? this.f18488h : width / 2.0f;
        float f11 = z9 ? this.f18489q : height / 2.0f;
        float f12 = this.f18490s;
        float f13 = this.f18491t;
        float f14 = this.f18492u;
        if (f12 != 0.0f || f13 != 0.0f || f14 != 0.0f) {
            Camera camera = this.f18485b;
            camera.save();
            camera.rotateX(f12);
            camera.rotateY(f13);
            camera.rotateZ(-f14);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f10, -f11);
            matrix.postTranslate(f10, f11);
        }
        float f15 = this.f18493v;
        float f16 = this.f18494w;
        if (f15 != 1.0f || f16 != 1.0f) {
            matrix.postScale(f15, f16);
            matrix.postTranslate(((f15 * width) - width) * (-(f10 / width)), ((f16 * height) - height) * (-(f11 / height)));
        }
        matrix.postTranslate(this.f18495x, this.f18496y);
    }
}
