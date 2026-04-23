package androidx.activity;

import androidx.fragment.app.e0;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class o implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f165b;

    public o(p pVar, e0 e0Var) {
        this.f165b = pVar;
        this.f164a = e0Var;
    }

    @Override // androidx.activity.a
    public final void cancel() {
        p pVar = this.f165b;
        ArrayDeque arrayDeque = pVar.f167b;
        e0 e0Var = this.f164a;
        arrayDeque.remove(e0Var);
        e0Var.f765b.remove(this);
        if (p7.q.m()) {
            e0Var.f766c = null;
            pVar.c();
        }
    }
}
