package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class v extends z3.a implements androidx.lifecycle.o0, androidx.activity.q, androidx.activity.result.g, l0 {
    public final j0 A;
    public final /* synthetic */ w B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Activity f913x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Context f914y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Handler f915z;

    public v(f.q qVar) {
        this.B = qVar;
        Handler handler = new Handler();
        this.A = new j0();
        this.f913x = qVar;
        this.f914y = qVar;
        this.f915z = handler;
    }

    @Override // z3.a
    public final View S(int i10) {
        return this.B.findViewById(i10);
    }

    @Override // z3.a
    public final boolean T() {
        Window window = this.B.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.fragment.app.l0
    public final void b() {
        this.B.getClass();
    }

    @Override // androidx.lifecycle.o0
    public final androidx.lifecycle.n0 f() {
        return this.B.f();
    }

    @Override // androidx.lifecycle.q
    public final androidx.lifecycle.s h() {
        return this.B.B;
    }
}
