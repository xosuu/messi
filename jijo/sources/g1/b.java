package g1;

import b7.j0;
import b7.k;
import b7.k0;
import b7.x;
import b7.y;
import java.util.concurrent.CancellationException;
import l6.f;
import t.h;
import t.i;
import t.j;
import t6.l;
import u6.e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f13626b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f13627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, x xVar) {
        super(1);
        this.f13626b = iVar;
        this.f13627d = xVar;
    }

    @Override // t6.l
    public final Object d(Object obj) throws Throwable {
        j0 j0Var;
        Throwable th = (Throwable) obj;
        i iVar = this.f13626b;
        if (th == null) {
            Object objO = ((y) this.f13627d).o();
            if (!(!(objO instanceof j0))) {
                throw new IllegalStateException("This job has not completed yet".toString());
            }
            if (objO instanceof k) {
                throw ((k) objO).f1424a;
            }
            k0 k0Var = objO instanceof k0 ? (k0) objO : null;
            if (k0Var != null && (j0Var = k0Var.f1425a) != null) {
                objO = j0Var;
            }
            iVar.f16799d = true;
            t.k kVar = iVar.f16797b;
            if (kVar != null) {
                j jVar = kVar.f16802b;
                jVar.getClass();
                if (objO == null) {
                    objO = h.f16792s;
                }
                if (h.f16791q.e(jVar, null, objO)) {
                    h.c(jVar);
                    iVar.f16796a = null;
                    iVar.f16797b = null;
                    iVar.f16798c = null;
                }
            }
        } else if (th instanceof CancellationException) {
            iVar.f16799d = true;
            t.k kVar2 = iVar.f16797b;
            if (kVar2 != null && kVar2.f16802b.cancel(true)) {
                iVar.f16796a = null;
                iVar.f16797b = null;
                iVar.f16798c = null;
            }
        } else {
            iVar.f16799d = true;
            t.k kVar3 = iVar.f16797b;
            if (kVar3 != null && kVar3.f16802b.h(th)) {
                iVar.f16796a = null;
                iVar.f16797b = null;
                iVar.f16798c = null;
            }
        }
        return f.f15231a;
    }
}
