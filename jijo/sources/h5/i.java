package h5;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends d5.g {
    public static final /* synthetic */ int K = 0;
    public final RectF J;

    public i(d5.j jVar) {
        super(jVar == null ? new d5.j() : jVar);
        this.J = new RectF();
    }

    public final void p(float f10, float f11, float f12, float f13) {
        RectF rectF = this.J;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}
