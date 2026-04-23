package q1;

import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import androidx.lifecycle.s;
import androidx.savedstate.Recreator;
import g4.a0;
import java.util.Map;
import n.g;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f16384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f16385b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16386c;

    public e(f fVar) {
        this.f16384a = fVar;
    }

    public final void a() {
        f fVar = this.f16384a;
        s sVarH = fVar.h();
        a0.e(sVarH, "owner.lifecycle");
        if (sVarH.f993e != l.f981b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        sVarH.a(new Recreator(fVar));
        final d dVar = this.f16385b;
        dVar.getClass();
        if (!(!dVar.f16379b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        sVarH.a(new o() { // from class: q1.a
            @Override // androidx.lifecycle.o
            public final void a(q qVar, k kVar) {
                d dVar2 = dVar;
                a0.f(dVar2, "this$0");
                if (kVar == k.ON_START) {
                    dVar2.f16383f = true;
                } else if (kVar == k.ON_STOP) {
                    dVar2.f16383f = false;
                }
            }
        });
        dVar.f16379b = true;
        this.f16386c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f16386c) {
            a();
        }
        s sVarH = this.f16384a.h();
        a0.e(sVarH, "owner.lifecycle");
        if (!(!sVarH.f993e.a(l.f983f))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + sVarH.f993e).toString());
        }
        d dVar = this.f16385b;
        if (!dVar.f16379b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!dVar.f16381d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        dVar.f16380c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f16381d = true;
    }

    public final void c(Bundle bundle) {
        a0.f(bundle, "outBundle");
        d dVar = this.f16385b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = dVar.f16380c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        g gVar = dVar.f16378a;
        gVar.getClass();
        n.d dVar2 = new n.d(gVar);
        gVar.f15818d.put(dVar2, Boolean.FALSE);
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
