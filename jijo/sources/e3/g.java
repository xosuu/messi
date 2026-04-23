package e3;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f12698b;

    public /* synthetic */ g(j jVar, int i10) {
        this.f12697a = i10;
        this.f12698b = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f12697a;
        j jVar = this.f12698b;
        switch (i10) {
            case 0:
                int i11 = j.f12702h1;
                jVar.n0(0, true, false, true);
                jVar.f12711y0.b();
                break;
            case 1:
                int i12 = j.f12702h1;
                jVar.n0(1, true, false, true);
                jVar.f12711y0.b();
                break;
            case 2:
                if (jVar.Y0 && jVar.l0()) {
                    jVar.h0(false);
                } else {
                    jVar.f12711y0.b();
                }
                jVar.g0();
                break;
            case 3:
                jVar.f12711y0.b();
                jVar.Z(false, false);
                break;
            default:
                jVar.f12711y0.b();
                int isCurrentlyAmOrPm = jVar.G0.getIsCurrentlyAmOrPm();
                int i13 = isCurrentlyAmOrPm != 0 ? isCurrentlyAmOrPm == 1 ? 0 : isCurrentlyAmOrPm : 1;
                jVar.r0(i13);
                jVar.G0.setAmOrPm(i13);
                break;
        }
    }
}
