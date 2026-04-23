package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.s;
import g4.a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends Dialog implements androidx.lifecycle.q, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f160b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, int i10) {
        super(context, i10);
        a0.f(context, "context");
        this.f160b = new p(new b(1, this));
    }

    public static void b(k kVar) {
        a0.f(kVar, "this$0");
        super.onBackPressed();
    }

    public final s d() {
        s sVar = this.f159a;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        this.f159a = sVar2;
        return sVar2;
    }

    @Override // androidx.lifecycle.q
    public final s h() {
        return d();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f160b.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            p pVar = this.f160b;
            pVar.f170e = onBackInvokedDispatcher;
            pVar.c();
        }
        d().e(androidx.lifecycle.k.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        d().e(androidx.lifecycle.k.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        d().e(androidx.lifecycle.k.ON_DESTROY);
        this.f159a = null;
        super.onStop();
    }
}
