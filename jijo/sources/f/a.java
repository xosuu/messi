package f;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12789a;

    public a(a aVar) {
        super((ViewGroup.MarginLayoutParams) aVar);
        this.f12789a = 0;
        this.f12789a = aVar.f12789a;
    }

    public a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f12789a = 0;
    }
}
