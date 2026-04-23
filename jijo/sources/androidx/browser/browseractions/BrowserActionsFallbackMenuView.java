package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f400b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f399a = getResources().getDimensionPixelOffset(R.dimen.bs);
        this.f400b = getResources().getDimensionPixelOffset(R.dimen.br);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f399a * 2), this.f400b), 1073741824), i11);
    }
}
