package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f14878a;

    public j0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.a0f);
        o3.a(getContext(), this);
        k0 k0Var = new k0(this);
        this.f14878a = k0Var;
        k0Var.a(attributeSet, R.attr.a0f);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        k0 k0Var = this.f14878a;
        Drawable drawable = k0Var.f14890e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = k0Var.f14889d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14878a.f14890e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f14878a.d(canvas);
    }
}
