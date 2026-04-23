package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes.dex */
public final class wr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f10317a = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f10318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p21 f10319c;

    public wr0(rb0 rb0Var, mu muVar) {
        this.f10318b = rb0Var;
        this.f10319c = muVar;
    }

    public final synchronized n5.a a() {
        c(1);
        return (n5.a) this.f10317a.poll();
    }

    public final synchronized void b(m21 m21Var) {
        this.f10317a.addFirst(m21Var);
    }

    public final synchronized void c(int i10) {
        int size = i10 - this.f10317a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f10317a.add(((q11) this.f10319c).b(this.f10318b));
        }
    }
}
