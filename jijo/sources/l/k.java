package l;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class k extends a2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14886v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f14887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ View f14888x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(View view, View view2, Object obj, int i10) {
        super(view2);
        this.f14886v = i10;
        this.f14888x = view;
        this.f14887w = obj;
    }

    @Override // l.a2
    public final k.h0 b() {
        switch (this.f14886v) {
            case 0:
                h hVar = ((l) this.f14888x).f14929f.F;
                if (hVar == null) {
                    return null;
                }
                return hVar.a();
            default:
                return (r0) this.f14887w;
        }
    }

    @Override // l.a2
    public final boolean c() {
        int i10 = this.f14886v;
        View view = this.f14888x;
        switch (i10) {
            case 0:
                ((l) view).f14929f.o();
                break;
            default:
                androidx.appcompat.widget.c cVar = (androidx.appcompat.widget.c) view;
                if (!cVar.getInternalPopup().a()) {
                    cVar.f393q.m(m0.b(cVar), m0.a(cVar));
                }
                break;
        }
        return true;
    }

    @Override // l.a2
    public final boolean d() {
        switch (this.f14886v) {
            case 0:
                androidx.appcompat.widget.b bVar = ((l) this.f14888x).f14929f;
                if (bVar.H == null) {
                    bVar.e();
                    break;
                }
                break;
            default:
                super.d();
                break;
        }
        return true;
    }
}
