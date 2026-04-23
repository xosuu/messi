package u1;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f17513a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f17514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f17515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f17516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f17517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f17518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f17519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f17520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f17521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f17523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f17524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f17525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17526n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Path f17527o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f17528p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f17529q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17530r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17531s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17532t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17533u;

    public d() {
        Paint paint = new Paint();
        this.f17514b = paint;
        Paint paint2 = new Paint();
        this.f17515c = paint2;
        Paint paint3 = new Paint();
        this.f17516d = paint3;
        this.f17517e = 0.0f;
        this.f17518f = 0.0f;
        this.f17519g = 0.0f;
        this.f17520h = 5.0f;
        this.f17528p = 1.0f;
        this.f17532t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i10) {
        this.f17522j = i10;
        this.f17533u = this.f17521i[i10];
    }
}
