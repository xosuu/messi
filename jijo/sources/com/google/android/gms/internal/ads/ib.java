package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public abstract class ib implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja f5552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j8 f5555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f5556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5558g;

    public ib(ja jaVar, String str, String str2, j8 j8Var, int i10, int i11) {
        this.f5552a = jaVar;
        this.f5553b = str;
        this.f5554c = str2;
        this.f5555d = j8Var;
        this.f5557f = i10;
        this.f5558g = i11;
    }

    public abstract void a();

    public void b() {
        int i10;
        ja jaVar = this.f5552a;
        try {
            long jNanoTime = System.nanoTime();
            Method methodC = jaVar.c(this.f5553b, this.f5554c);
            this.f5556e = methodC;
            if (methodC == null) {
                return;
            }
            a();
            u9 u9Var = jaVar.f5861l;
            if (u9Var == null || (i10 = this.f5557f) == Integer.MIN_VALUE) {
                return;
            }
            u9Var.a(this.f5558g, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
