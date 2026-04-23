package n8;

import android.app.Dialog;
import android.content.Context;
import androidx.lifecycle.h;
import com.google.android.gms.internal.ads.gp0;
import f.n0;
import l.o0;
import z.f;

/* JADX INFO: loaded from: classes.dex */
public class d extends n0 {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public b f15992x0;

    @Override // androidx.fragment.app.m, androidx.fragment.app.s
    public final void F() {
        super.F();
        this.f15992x0 = null;
    }

    @Override // f.n0, androidx.fragment.app.m
    public final Dialog b0() {
        this.f824n0 = false;
        Dialog dialog = this.f829s0;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        f fVar = new f(this.f893s);
        o0 o0Var = new o0(this, fVar, this.f15992x0);
        Context contextL = l();
        int i10 = fVar.f20531a;
        gp0 gp0Var = i10 > 0 ? new gp0(contextL, i10) : new gp0(contextL);
        gp0Var.m();
        gp0Var.p((String) fVar.f20533c, o0Var);
        gp0Var.o((String) fVar.f20534d, o0Var);
        gp0Var.n((String) fVar.f20535e);
        return gp0Var.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.m, androidx.fragment.app.s
    public final void z(Context context) {
        super.z(context);
        h hVar = this.H;
        if (hVar != null && (hVar instanceof b)) {
            this.f15992x0 = (b) hVar;
        }
        if (context instanceof b) {
            this.f15992x0 = (b) context;
        }
    }
}
