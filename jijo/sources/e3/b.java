package e3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f12656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12657b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12658d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12659f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f12660h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f12661q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12663t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12664u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12665v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12666w;

    public b(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f12656a = paint;
        Resources resources = context.getResources();
        this.f12658d = resources.getColor(R.color.ak);
        this.f12659f = resources.getColor(R.color.s1);
        paint.setAntiAlias(true);
        this.f12662s = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getWidth() == 0 || !this.f12662s) {
            return;
        }
        if (!this.f12663t) {
            this.f12664u = getWidth() / 2;
            this.f12665v = getHeight() / 2;
            int iMin = (int) (Math.min(this.f12664u, r0) * this.f12660h);
            this.f12666w = iMin;
            if (!this.f12657b) {
                this.f12665v -= ((int) (iMin * this.f12661q)) / 2;
            }
            this.f12663t = true;
        }
        Paint paint = this.f12656a;
        paint.setColor(this.f12658d);
        canvas.drawCircle(this.f12664u, this.f12665v, this.f12666w, paint);
        paint.setColor(this.f12659f);
        canvas.drawCircle(this.f12664u, this.f12665v, 2.0f, paint);
    }

    public void setTheme(TypedArray typedArray) {
        this.f12658d = typedArray.getColor(13, d0.f.b(getContext(), R.color.s_));
        this.f12659f = typedArray.getColor(16, d0.f.b(getContext(), R.color.a9));
    }
}
