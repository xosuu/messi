package n1;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f15888a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f15889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile s1.g f15890c;

    public s(p pVar) {
        this.f15889b = pVar;
    }

    public final s1.g a() {
        this.f15889b.a();
        if (!this.f15888a.compareAndSet(false, true)) {
            String strB = b();
            p pVar = this.f15889b;
            pVar.a();
            pVar.b();
            return new s1.g(((s1.b) pVar.f15865c.y()).f16664a.compileStatement(strB));
        }
        if (this.f15890c == null) {
            String strB2 = b();
            p pVar2 = this.f15889b;
            pVar2.a();
            pVar2.b();
            this.f15890c = new s1.g(((s1.b) pVar2.f15865c.y()).f16664a.compileStatement(strB2));
        }
        return this.f15890c;
    }

    public abstract String b();

    public final void c(s1.g gVar) {
        if (gVar == this.f15890c) {
            this.f15888a.set(false);
        }
    }
}
