package d5;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b4.f {
    @Override // b4.f
    public final void m(float f10, float f11, t tVar) {
        tVar.d(f11 * f10, 180.0f, 90.0f);
        double d10 = f11;
        double d11 = f10;
        tVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d10 * d11), (float) (Math.sin(Math.toRadians(0.0f)) * d10 * d11));
    }
}
