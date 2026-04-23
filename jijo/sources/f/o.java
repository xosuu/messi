package f;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o implements q1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12946a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12947b;

    public o(q1.d dVar) {
        g4.a0.f(dVar, "registry");
        this.f12947b = new LinkedHashSet();
        dVar.b("androidx.savedstate.Restarter", this);
    }

    @Override // q1.c
    public final Bundle a() {
        int i10 = this.f12946a;
        Object obj = this.f12947b;
        switch (i10) {
            case 0:
                Bundle bundle = new Bundle();
                ((q) obj).q().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((Set) obj));
                return bundle2;
        }
    }

    public o(q qVar) {
        this.f12947b = qVar;
    }
}
