package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* JADX INFO: loaded from: classes.dex */
public abstract class cv extends TextureView implements rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kv f3454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sv f3455b;

    public cv(Context context) {
        super(context);
        this.f3454a = new kv();
        this.f3455b = new sv(context, this);
    }

    public void A(int i10) {
    }

    public void B(int i10) {
    }

    public void C(int i10) {
    }

    public void a(int i10) {
    }

    public void b(int i10) {
    }

    public void i(String str, String[] strArr, Integer num) {
        w(str);
    }

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long q();

    public abstract String r();

    public abstract void s();

    public abstract void t();

    public abstract void u(int i10);

    public abstract void v(bv bvVar);

    public abstract void w(String str);

    public abstract void x();

    public abstract void y(float f10, float f11);

    public Integer z() {
        return null;
    }
}
