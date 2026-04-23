package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mg0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n5.a f6935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n5.a f6936c;

    public /* synthetic */ mg0(n5.a aVar, m21 m21Var, int i10) {
        this.f6934a = i10;
        this.f6935b = aVar;
        this.f6936c = m21Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f6934a;
        n5.a aVar = this.f6936c;
        n5.a aVar2 = this.f6935b;
        switch (i10) {
            case 0:
                return new rg0((vg0) aVar2.get(), ((qg0) aVar.get()).f8175b, ((qg0) aVar.get()).f8174a);
            default:
                return new io0(1, (String) aVar2.get(), (String) aVar.get());
        }
    }
}
