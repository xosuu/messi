package l;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends m2.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f14841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(AppCompatTextView appCompatTextView) {
        super(6, appCompatTextView);
        this.f14841d = appCompatTextView;
    }

    @Override // m2.f, l.c1
    public final void h(int i10) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i10);
    }

    @Override // m2.f, l.c1
    public final void l(int i10) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i10);
    }
}
