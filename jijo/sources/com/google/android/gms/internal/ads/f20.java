package com.google.android.gms.internal.ads;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class f20 extends l10 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ak f4357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Runnable f4358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Executor f4359l;

    public f20(jt jtVar, ak akVar, Runnable runnable, Executor executor) {
        super(jtVar);
        this.f4357j = akVar;
        this.f4358k = runnable;
        this.f4359l = executor;
    }

    @Override // com.google.android.gms.internal.ads.r20
    public final void a() {
        this.f4359l.execute(new vm(this, 21, new d20(new AtomicReference(this.f4358k))));
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final int b() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final View d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final com.google.android.gms.ads.internal.client.zzdq e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final gr0 f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final gr0 g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final void i(FrameLayout frameLayout, zzq zzqVar) {
    }
}
