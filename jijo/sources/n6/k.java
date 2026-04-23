package n6;

import g4.a0;
import java.io.Serializable;
import t6.p;

/* JADX INFO: loaded from: classes.dex */
public final class k implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f15981a = new k();

    @Override // n6.j
    public final h A(i iVar) {
        a0.f(iVar, "key");
        return null;
    }

    @Override // n6.j
    public final j c(j jVar) {
        a0.f(jVar, "context");
        return jVar;
    }

    @Override // n6.j
    public final j e(i iVar) {
        a0.f(iVar, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // n6.j
    public final Object u(Object obj, p pVar) {
        return obj;
    }
}
