package team.dev.epro.apkcustom.widgets;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class FreshDownloadView extends View {
    public AnimatorSet A;
    public float B;
    public float C;
    public float D;
    public boolean E;
    public float F;
    public float G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public final Path L;
    public final Paint M;
    public final Path N;
    public final Path O;
    public final Path P;
    public final PathMeasure Q;
    public final PathMeasure R;
    public final PathMeasure S;
    public float T;
    public float U;
    public float V;
    public float W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f17366a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f17367a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17368b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public DashPathEffect f17369b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public DashPathEffect f17370c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17371d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public DashPathEffect f17372d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public d f17373e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f17374f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public AnimatorSet f17375f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f17376g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f17377h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f17378h0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f17379q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RectF f17380s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f17381t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17382u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f17383v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f17384w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f17385x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f17386y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AnimatorSet f17387z;

    static {
        NativeUtil.classesInit0(186);
    }

    public FreshDownloadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f17382u = false;
        this.K = false;
        this.L = new Path();
        this.f17373e0 = d.f17400a;
        this.f17377h = getResources().getDimension(R.dimen.e0);
        this.f17379q = new Rect();
        this.f17380s = new RectF();
        Paint paint = new Paint();
        this.M = paint;
        this.N = new Path();
        this.O = new Path();
        this.P = new Path();
        this.Q = new PathMeasure();
        this.R = new PathMeasure();
        this.S = new PathMeasure();
        this.f17385x = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k9.a.f14760a);
        if (typedArrayObtainStyledAttributes != null) {
            try {
                setRadius(typedArrayObtainStyledAttributes.getDimension(2, getResources().getDimension(R.dimen.cc)));
                setCircularColor(typedArrayObtainStyledAttributes.getColor(0, getResources().getColor(R.color.c0)));
                setProgressColor(typedArrayObtainStyledAttributes.getColor(1, getResources().getColor(R.color.bf)));
                setCircularWidth(typedArrayObtainStyledAttributes.getDimension(3, getResources().getDimension(R.dimen.cb)));
                setProgressTextSize(typedArrayObtainStyledAttributes.getDimension(4, getResources().getDimension(R.dimen.cd)));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(getCircularWidth());
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
    }

    private native int getCurrentHeight();

    private native int getCurrentWidth();

    private native AnimatorSet getDownLoadErrorAnimator();

    private native AnimatorSet getDownloadOkAnimator();

    private native AnimatorSet getPrepareAnimator();

    public final native void a(Canvas canvas, float f10);

    public final native void b();

    public final native void c();

    public final native void d();

    public final native void e();

    public native int getCircularColor();

    public native float getCircularWidth();

    public native int getProgressColor();

    public native float getProgressTextSize();

    public native float getRadius();

    @Override // android.view.View
    public final native void onAttachedToWindow();

    @Override // android.view.View
    public final native void onDetachedFromWindow();

    @Override // android.view.View
    public final native void onDraw(Canvas canvas);

    @Override // android.view.View
    public final native void onMeasure(int i10, int i11);

    @Override // android.view.View
    public final native void onRestoreInstanceState(Parcelable parcelable);

    @Override // android.view.View
    public final native Parcelable onSaveInstanceState();

    @Override // android.view.View
    public final native void onSizeChanged(int i10, int i11, int i12, int i13);

    public native void setCircularColor(int i10);

    public native void setCircularWidth(float f10);

    public native void setProgressColor(int i10);

    public native synchronized void setProgressInternal(float f10);

    public native void setProgressTextSize(float f10);

    public native void setRadius(float f10);
}
