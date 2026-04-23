package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AppCompatImageView implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b f14929f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.widget.b bVar, Context context) {
        super(context, null, R.attr.a7);
        this.f14929f = bVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        g4.d0.j(this, getContentDescription());
        setOnTouchListener(new k(this, this, bVar, 0));
    }

    @Override // l.m
    public final boolean a() {
        return false;
    }

    @Override // l.m
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f14929f.o();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            h0.b.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
