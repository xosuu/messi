package e3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.google.android.gms.internal.ads.fb1;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class a extends View {
    public int A;
    public int B;
    public int C;
    public int D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f12642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12643b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12644d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12645f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12646h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12647q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f12648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f12649t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f12650u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f12651v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12654y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12655z;

    public a(Context context) {
        super(context);
        this.f12642a = new Paint();
        this.f12652w = false;
    }

    public final int a(float f10, float f11) {
        if (!this.f12653x) {
            return -1;
        }
        int i10 = this.B;
        int i11 = (int) ((f11 - i10) * (f11 - i10));
        int i12 = this.f12655z;
        float f12 = i11;
        if (((int) Math.sqrt(((f10 - i12) * (f10 - i12)) + f12)) <= this.f12654y) {
            return 0;
        }
        int i13 = this.A;
        return ((int) Math.sqrt((double) fb1.c(f10, (float) i13, f10 - ((float) i13), f12))) <= this.f12654y ? 1 : -1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        if (getWidth() == 0 || !this.f12652w) {
            return;
        }
        boolean z9 = this.f12653x;
        Paint paint = this.f12642a;
        if (!z9) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int iMin = (int) (Math.min(width, height) * this.f12648s);
            this.f12654y = (int) (iMin * this.f12649t);
            paint.setTextSize((r5 * 3) / 4);
            int i12 = this.f12654y;
            this.B = (height - (i12 / 2)) + iMin;
            this.f12655z = (width - iMin) + i12;
            this.A = (width + iMin) - i12;
            this.f12653x = true;
        }
        int i13 = this.f12645f;
        int i14 = this.f12644d;
        int i15 = this.C;
        if (i15 == 0) {
            i10 = i13;
            i13 = this.f12647q;
            i11 = i14;
            i14 = this.f12643b;
        } else if (i15 == 1) {
            i10 = this.f12647q;
            i11 = this.f12643b;
        } else {
            i10 = i13;
            i11 = i14;
        }
        int i16 = this.D;
        if (i16 == 0) {
            i13 = this.f12647q;
            i14 = this.f12643b;
        } else if (i16 == 1) {
            i10 = this.f12647q;
            i11 = this.f12643b;
        }
        paint.setColor(i13);
        paint.setAlpha(i14);
        canvas.drawCircle(this.f12655z, this.B, this.f12654y, paint);
        paint.setColor(i10);
        paint.setAlpha(i11);
        canvas.drawCircle(this.A, this.B, this.f12654y, paint);
        paint.setColor(this.f12646h);
        float fAscent = this.B - (((int) (paint.ascent() + paint.descent())) / 2);
        canvas.drawText(this.f12650u, this.f12655z, fAscent, paint);
        canvas.drawText(this.f12651v, this.A, fAscent, paint);
    }

    public void setAmOrPm(int i10) {
        this.C = i10;
    }

    public void setAmOrPmPressed(int i10) {
        this.D = i10;
    }

    public void setTheme(TypedArray typedArray) {
        this.f12645f = typedArray.getColor(0, d0.f.b(getContext(), R.color.a9));
        this.f12647q = typedArray.getColor(0, d0.f.b(getContext(), R.color.a9));
        this.f12646h = typedArray.getColor(1, d0.f.b(getContext(), R.color.ak));
        this.f12643b = 200;
        this.f12644d = 50;
    }
}
