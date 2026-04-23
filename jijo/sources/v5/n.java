package v5;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class n extends w5.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, int i10) {
        super(str);
        this.f17840b = i10;
    }

    @Override // w5.c
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        switch (this.f17840b) {
        }
        return d((View) obj);
    }

    public final Integer d(View view) {
        switch (this.f17840b) {
            case 0:
                View view2 = (View) x5.a.e(view).f18484a.get();
                return Integer.valueOf(view2 != null ? view2.getScrollX() : 0);
            default:
                View view3 = (View) x5.a.e(view).f18484a.get();
                return Integer.valueOf(view3 != null ? view3.getScrollY() : 0);
        }
    }
}
