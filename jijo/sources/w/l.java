package w;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList f18070q0;

    @Override // w.d
    public void D() {
        this.f18070q0.clear();
        super.D();
    }

    @Override // w.d
    public final void G(j2.h hVar) {
        super.G(hVar);
        int size = this.f18070q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f18070q0.get(i10)).G(hVar);
        }
    }

    public abstract void S();
}
