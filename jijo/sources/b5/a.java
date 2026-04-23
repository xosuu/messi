package b5;

import android.graphics.drawable.Drawable;
import d5.g;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f1332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1333b;

    public a(a aVar) {
        this.f1332a = (g) aVar.f1332a.f12396a.newDrawable();
        this.f1333b = aVar.f1333b;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new b(new a(this));
    }
}
