package d5;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f12457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f12458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f12459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f12460g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f12461h = new ArrayList();

    public t() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10) {
        float f11 = this.f12458e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f12456c;
        float f14 = this.f12457d;
        p pVar = new p(f13, f14, f13, f14);
        pVar.f12447f = this.f12458e;
        pVar.f12448g = f12;
        this.f12461h.add(new n(pVar));
        this.f12458e = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f12460g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void c(float f10, float f11) {
        q qVar = new q();
        qVar.f12449b = f10;
        qVar.f12450c = f11;
        this.f12460g.add(qVar);
        o oVar = new o(qVar, this.f12456c, this.f12457d);
        float fB = oVar.b() + 270.0f;
        float fB2 = oVar.b() + 270.0f;
        a(fB);
        this.f12461h.add(oVar);
        this.f12458e = fB2;
        this.f12456c = f10;
        this.f12457d = f11;
    }

    public final void d(float f10, float f11, float f12) {
        this.f12454a = 0.0f;
        this.f12455b = f10;
        this.f12456c = 0.0f;
        this.f12457d = f10;
        this.f12458e = f11;
        this.f12459f = (f11 + f12) % 360.0f;
        this.f12460g.clear();
        this.f12461h.clear();
    }
}
