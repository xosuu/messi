package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class z extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f15087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f15088b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p3.a(context);
        this.f15089d = false;
        o3.a(getContext(), this);
        q qVar = new q(this);
        this.f15087a = qVar;
        qVar.h(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f15088b = b0Var;
        b0Var.c(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f15087a;
        if (qVar != null) {
            qVar.b();
        }
        b0 b0Var = this.f15088b;
        if (b0Var != null) {
            b0Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f15087a;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f15087a;
        if (qVar != null) {
            return qVar.f();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        q3 q3Var;
        b0 b0Var = this.f15088b;
        if (b0Var == null || (q3Var = (q3) b0Var.f14792f) == null) {
            return null;
        }
        return (ColorStateList) q3Var.f14980c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        q3 q3Var;
        b0 b0Var = this.f15088b;
        if (b0Var == null || (q3Var = (q3) b0Var.f14792f) == null) {
            return null;
        }
        return (PorterDuff.Mode) q3Var.f14981d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.f15088b.f14790b).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f15087a;
        if (qVar != null) {
            qVar.i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q qVar = this.f15087a;
        if (qVar != null) {
            qVar.j(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        b0 b0Var = this.f15088b;
        if (b0Var != null) {
            b0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        b0 b0Var = this.f15088b;
        if (b0Var != null && drawable != null && !this.f15089d) {
            b0Var.f14789a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (b0Var != null) {
            b0Var.a();
            if (this.f15089d || ((ImageView) b0Var.f14790b).getDrawable() == null) {
                return;
            }
            ((ImageView) b0Var.f14790b).getDrawable().setLevel(b0Var.f14789a);
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f15089d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f15088b.f(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        b0 b0Var = this.f15088b;
        if (b0Var != null) {
            b0Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f15087a;
        if (qVar != null) {
            qVar.n(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f15087a;
        if (qVar != null) {
            qVar.o(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        b0 b0Var = this.f15088b;
        if (b0Var != null) {
            b0Var.h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        b0 b0Var = this.f15088b;
        if (b0Var != null) {
            b0Var.i(mode);
        }
    }
}
