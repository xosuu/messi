package d5;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b4.f {
    @Override // b4.f
    public final void m(float f10, float f11, t tVar) {
        tVar.d(f11 * f10, 180.0f, 90.0f);
        float f12 = f11 * 2.0f * f10;
        p pVar = new p(0.0f, 0.0f, f12, f12);
        pVar.f12447f = 180.0f;
        pVar.f12448g = 90.0f;
        tVar.f12460g.add(pVar);
        n nVar = new n(pVar);
        tVar.a(180.0f);
        tVar.f12461h.add(nVar);
        tVar.f12458e = 270.0f;
        float f13 = (0.0f + f12) * 0.5f;
        float f14 = (f12 - 0.0f) / 2.0f;
        double d10 = 270.0f;
        tVar.f12456c = (((float) Math.cos(Math.toRadians(d10))) * f14) + f13;
        tVar.f12457d = (f14 * ((float) Math.sin(Math.toRadians(d10)))) + f13;
    }
}
