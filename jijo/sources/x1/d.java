package x1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f18301a;

    public d(Drawable.ConstantState constantState) {
        this.f18301a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f18301a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f18301a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f18301a.newDrawable();
        eVar.f18309a = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f18307q);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f18301a.newDrawable(resources);
        eVar.f18309a = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f18307q);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f18301a.newDrawable(resources, theme);
        eVar.f18309a = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f18307q);
        return eVar;
    }
}
