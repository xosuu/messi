package g;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import s.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j {
    public static final /* synthetic */ int K = 0;
    public s.e I;
    public l J;

    public b(b bVar, e eVar, Resources resources) {
        super(bVar, eVar, resources);
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f13552g.length][];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
        } else {
            this.I = new s.e();
            this.J = new l();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
