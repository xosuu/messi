package l6;

import androidx.lifecycle.g0;
import g4.a0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t6.a f15227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f15228b = e.f15230a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15229d = this;

    public d(g0 g0Var) {
        this.f15227a = g0Var;
    }

    public final Object a() {
        Object objA;
        Object obj = this.f15228b;
        e eVar = e.f15230a;
        if (obj != eVar) {
            return obj;
        }
        synchronized (this.f15229d) {
            objA = this.f15228b;
            if (objA == eVar) {
                t6.a aVar = this.f15227a;
                a0.c(aVar);
                objA = aVar.a();
                this.f15228b = objA;
                this.f15227a = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f15228b != e.f15230a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
