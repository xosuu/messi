package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.gms.internal.ads.ur0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f14889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f14890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f14891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f14892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14894i;

    public k0(SeekBar seekBar) {
        super(seekBar);
        this.f14891f = null;
        this.f14892g = null;
        this.f14893h = false;
        this.f14894i = false;
        this.f14889d = seekBar;
    }

    @Override // l.f0
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, R.attr.a0f);
        SeekBar seekBar = this.f14889d;
        Context context = seekBar.getContext();
        int[] iArr = e.a.f12600g;
        ur0 ur0VarK = ur0.K(context, attributeSet, iArr, R.attr.a0f);
        o0.v0.p(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) ur0VarK.f9601d, R.attr.a0f);
        Drawable drawableZ = ur0VarK.z(0);
        if (drawableZ != null) {
            seekBar.setThumb(drawableZ);
        }
        Drawable drawableY = ur0VarK.y(1);
        Drawable drawable = this.f14890e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f14890e = drawableY;
        if (drawableY != null) {
            drawableY.setCallback(seekBar);
            g4.z.A(drawableY, o0.e0.d(seekBar));
            if (drawableY.isStateful()) {
                drawableY.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (ur0VarK.H(3)) {
            this.f14892g = r1.c(ur0VarK.B(3, -1), this.f14892g);
            this.f14894i = true;
        }
        if (ur0VarK.H(2)) {
            this.f14891f = ur0VarK.v(2);
            this.f14893h = true;
        }
        ur0VarK.M();
        c();
    }

    public final void c() {
        Drawable drawable = this.f14890e;
        if (drawable != null) {
            if (this.f14893h || this.f14894i) {
                Drawable drawableI = g4.z.I(drawable.mutate());
                this.f14890e = drawableI;
                if (this.f14893h) {
                    h0.b.h(drawableI, this.f14891f);
                }
                if (this.f14894i) {
                    h0.b.i(this.f14890e, this.f14892g);
                }
                if (this.f14890e.isStateful()) {
                    this.f14890e.setState(this.f14889d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f14890e != null) {
            int max = this.f14889d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f14890e.getIntrinsicWidth();
                int intrinsicHeight = this.f14890e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f14890e.setBounds(-i10, -i11, i10, i11);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f14890e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
