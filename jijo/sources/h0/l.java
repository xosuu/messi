package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f13924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f13925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f13926d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i10 = this.f13923a;
        Drawable.ConstantState constantState = this.f13924b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        k kVar = new k(this, resources);
        if (k.f13922t == null) {
            try {
                k.f13922t = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return kVar;
    }
}
