package f;

import android.app.Dialog;

/* JADX INFO: loaded from: classes.dex */
public class n0 extends androidx.fragment.app.m {
    @Override // androidx.fragment.app.m
    public Dialog b0() {
        return new m0(l(), this.f823m0);
    }

    @Override // androidx.fragment.app.m
    public final void c0(Dialog dialog, int i10) {
        if (!(dialog instanceof m0)) {
            super.c0(dialog, i10);
            return;
        }
        m0 m0Var = (m0) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        m0Var.f().i(1);
    }
}
