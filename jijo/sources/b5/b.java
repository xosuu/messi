package b5;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import d5.j;
import d5.u;
import h0.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable implements u, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f1334a;

    public b(a aVar) {
        this.f1334a = aVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a aVar = this.f1334a;
        if (aVar.f1333b) {
            aVar.f1332a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1334a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f1334a.f1332a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1334a = new a(this.f1334a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1334a.f1332a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f1334a.f1332a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zC = d.c(iArr);
        a aVar = this.f1334a;
        if (aVar.f1333b == zC) {
            return zOnStateChange;
        }
        aVar.f1333b = zC;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f1334a.f1332a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1334a.f1332a.setColorFilter(colorFilter);
    }

    @Override // d5.u
    public final void setShapeAppearanceModel(j jVar) {
        this.f1334a.f1332a.setShapeAppearanceModel(jVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        this.f1334a.f1332a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f1334a.f1332a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f1334a.f1332a.setTintMode(mode);
    }
}
