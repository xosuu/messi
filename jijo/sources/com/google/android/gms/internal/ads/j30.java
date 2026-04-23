package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class j30 implements e30 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e20 f5787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e20 f5788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e20 f5789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e20 f5790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f5791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f5792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5793h;

    public j30() {
        ByteBuffer byteBuffer = e30.f3848a;
        this.f5791f = byteBuffer;
        this.f5792g = byteBuffer;
        e20 e20Var = e20.f3817e;
        this.f5789d = e20Var;
        this.f5790e = e20Var;
        this.f5787b = e20Var;
        this.f5788c = e20Var;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final e20 a(e20 e20Var) {
        this.f5789d = e20Var;
        this.f5790e = c(e20Var);
        return zzg() ? this.f5790e : e20.f3817e;
    }

    public abstract e20 c(e20 e20Var);

    public final ByteBuffer d(int i10) {
        if (this.f5791f.capacity() < i10) {
            this.f5791f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f5791f.clear();
        }
        ByteBuffer byteBuffer = this.f5791f;
        this.f5792g = byteBuffer;
        return byteBuffer;
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    @Override // com.google.android.gms.internal.ads.e30
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f5792g;
        this.f5792g = e30.f3848a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final void zzc() {
        this.f5792g = e30.f3848a;
        this.f5793h = false;
        this.f5787b = this.f5789d;
        this.f5788c = this.f5790e;
        e();
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final void zzd() {
        this.f5793h = true;
        f();
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final void zzf() {
        zzc();
        this.f5791f = e30.f3848a;
        e20 e20Var = e20.f3817e;
        this.f5789d = e20Var;
        this.f5790e = e20Var;
        this.f5787b = e20Var;
        this.f5788c = e20Var;
        g();
    }

    @Override // com.google.android.gms.internal.ads.e30
    public boolean zzg() {
        return this.f5790e != e20.f3817e;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public boolean zzh() {
        return this.f5793h && this.f5792g == e30.f3848a;
    }
}
