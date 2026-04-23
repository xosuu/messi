package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f14861a;

    public h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.zo);
        o3.a(getContext(), this);
        f0 f0Var = new f0(this);
        this.f14861a = f0Var;
        f0Var.a(attributeSet, R.attr.zo);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = this.f14861a.f14854b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
