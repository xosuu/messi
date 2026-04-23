package g;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends h {
    public boolean A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j f13598z;

    @Override // g.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // g.h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.A) {
            super.mutate();
            b bVar = (b) this.f13598z;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.A = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public abstract boolean onStateChange(int[] iArr);
}
