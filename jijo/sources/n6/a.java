package n6;

import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.tp1;
import g4.a0;
import t6.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f15972a;

    public a(i iVar) {
        this.f15972a = iVar;
    }

    @Override // n6.j
    public h A(i iVar) {
        return en1.o(this, iVar);
    }

    @Override // n6.j
    public final j c(j jVar) {
        a0.f(jVar, "context");
        return tp1.o(this, jVar);
    }

    @Override // n6.j
    public j e(i iVar) {
        return en1.x(this, iVar);
    }

    @Override // n6.h
    public final i getKey() {
        return this.f15972a;
    }

    @Override // n6.j
    public final Object u(Object obj, p pVar) {
        return pVar.c(obj, this);
    }
}
