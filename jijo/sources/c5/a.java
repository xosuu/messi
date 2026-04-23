package c5;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f1566i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f1567j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f1568k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f1569l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f1570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f1571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f1572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f1576g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f1577h;

    public a() {
        Paint paint = new Paint();
        this.f1577h = paint;
        Paint paint2 = new Paint();
        this.f1570a = paint2;
        this.f1573d = g0.a.d(-16777216, 68);
        this.f1574e = g0.a.d(-16777216, 20);
        this.f1575f = g0.a.d(-16777216, 0);
        paint2.setColor(this.f1573d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f1571b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f1572c = new Paint(paint3);
    }
}
