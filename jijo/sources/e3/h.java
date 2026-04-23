package e3;

import android.view.KeyEvent;
import android.view.View;
import b7.u;

/* JADX INFO: loaded from: classes.dex */
public final class h implements View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f12699a;

    public h(j jVar) {
        this.f12699a = jVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1) {
            return false;
        }
        int i11 = j.f12702h1;
        j jVar = this.f12699a;
        jVar.getClass();
        if (i10 == 111 || i10 == 4) {
            jVar.Z(false, false);
        } else if (i10 == 61) {
            if (!jVar.Y0) {
                return false;
            }
            if (jVar.l0()) {
                jVar.h0(true);
            }
        } else if (i10 == 66) {
            if (!jVar.Y0) {
                jVar.g0();
            } else if (jVar.l0()) {
                jVar.h0(false);
                jVar.g0();
            }
        } else {
            if (i10 == 67) {
                if (!jVar.Y0 || jVar.Z0.isEmpty()) {
                    return false;
                }
                int iF0 = jVar.f0();
                u.B(jVar.G0, String.format(jVar.X0, iF0 == jVar.i0(0) ? jVar.K0 : iF0 == jVar.i0(1) ? jVar.L0 : String.format("%d", Integer.valueOf(j.k0(iF0)))));
                jVar.s0(true);
                return false;
            }
            if (i10 != 7 && i10 != 8 && i10 != 9 && i10 != 10 && i10 != 11 && i10 != 12 && i10 != 13 && i10 != 14 && i10 != 15 && i10 != 16) {
                if (jVar.P0.booleanValue()) {
                    return false;
                }
                if (i10 != jVar.i0(0) && i10 != jVar.i0(1)) {
                    return false;
                }
            }
            if (jVar.Y0) {
                if (jVar.e0(i10)) {
                    jVar.s0(false);
                }
            } else if (jVar.G0 != null) {
                jVar.Z0.clear();
                jVar.q0(i10);
            }
        }
        return true;
    }
}
