package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b20 implements wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx f2877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f2878b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f2879d = new AtomicReference();

    public b20(fx fxVar, Executor executor) {
        this.f2877a = fxVar;
        this.f2878b = executor;
    }

    @Override // com.google.android.gms.internal.ads.wb
    public final synchronized void Z(vb vbVar) {
        if (this.f2877a != null) {
            if (((Boolean) zzba.zzc().a(eg.Fb)).booleanValue()) {
                if (vbVar.f9827j) {
                    AtomicReference atomicReference = this.f2879d;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.f2878b;
                        fx fxVar = this.f2877a;
                        Objects.requireNonNull(fxVar);
                        executor.execute(new mx(fxVar, 1));
                        return;
                    }
                }
                if (!vbVar.f9827j) {
                    AtomicReference atomicReference2 = this.f2879d;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.f2878b;
                        fx fxVar2 = this.f2877a;
                        Objects.requireNonNull(fxVar2);
                        executor2.execute(new mx(fxVar2, 2));
                    }
                }
            }
        }
    }
}
