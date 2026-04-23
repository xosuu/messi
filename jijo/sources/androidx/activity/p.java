package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.e0;
import androidx.fragment.app.j0;
import androidx.lifecycle.s;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f166a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f170e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f167b = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f171f = false;

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.activity.l] */
    public p(Runnable runnable) {
        this.f166a = runnable;
        if (p7.q.m()) {
            this.f168c = new n0.a() { // from class: androidx.activity.l
                @Override // n0.a
                public final void a(Object obj) {
                    p pVar = this.f161a;
                    pVar.getClass();
                    if (p7.q.m()) {
                        pVar.c();
                    }
                }
            };
            this.f169d = n.a(new b(2, this));
        }
    }

    public final void a(androidx.lifecycle.q qVar, e0 e0Var) {
        s sVarH = qVar.h();
        if (sVarH.f993e == androidx.lifecycle.l.f980a) {
            return;
        }
        e0Var.f765b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, sVarH, e0Var));
        if (p7.q.m()) {
            c();
            e0Var.f766c = this.f168c;
        }
    }

    public final void b() {
        Iterator itDescendingIterator = this.f167b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            e0 e0Var = (e0) itDescendingIterator.next();
            if (e0Var.f764a) {
                j0 j0Var = e0Var.f767d;
                j0Var.x(true);
                if (j0Var.f789h.f764a) {
                    j0Var.M();
                    return;
                } else {
                    j0Var.f788g.b();
                    return;
                }
            }
        }
        Runnable runnable = this.f166a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        boolean z9;
        Iterator itDescendingIterator = this.f167b.descendingIterator();
        while (true) {
            if (!itDescendingIterator.hasNext()) {
                z9 = false;
                break;
            } else if (((e0) itDescendingIterator.next()).f764a) {
                z9 = true;
                break;
            }
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f170e;
        if (onBackInvokedDispatcher != null) {
            OnBackInvokedCallback onBackInvokedCallback = this.f169d;
            if (z9 && !this.f171f) {
                n.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f171f = true;
            } else {
                if (z9 || !this.f171f) {
                    return;
                }
                n.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f171f = false;
            }
        }
    }
}
