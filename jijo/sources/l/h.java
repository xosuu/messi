package l;

import android.content.Context;
import android.view.View;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k.b0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f14859m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b f14860n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.widget.b bVar, Context context, k.o oVar, l lVar) {
        super(R.attr.a8, 0, context, lVar, oVar, true);
        this.f14860n = bVar;
        this.f14495g = 8388613;
        m2.f fVar = bVar.J;
        this.f14497i = fVar;
        k.y yVar = this.f14498j;
        if (yVar != null) {
            yVar.j(fVar);
        }
    }

    @Override // k.b0
    public final void c() {
        int i10 = this.f14859m;
        androidx.appcompat.widget.b bVar = this.f14860n;
        switch (i10) {
            case 0:
                bVar.G = null;
                bVar.K = 0;
                super.c();
                break;
            default:
                k.o oVar = bVar.f375d;
                if (oVar != null) {
                    oVar.c(true);
                }
                bVar.F = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.widget.b bVar, Context context, k.j0 j0Var, View view) {
        super(R.attr.a8, 0, context, view, j0Var, false);
        this.f14860n = bVar;
        if (!j0Var.A.f()) {
            View view2 = bVar.f382v;
            this.f14494f = view2 == null ? (View) bVar.f380t : view2;
        }
        m2.f fVar = bVar.J;
        this.f14497i = fVar;
        k.y yVar = this.f14498j;
        if (yVar != null) {
            yVar.j(fVar);
        }
    }
}
