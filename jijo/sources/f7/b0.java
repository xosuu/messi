package f7;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f13219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f13220b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13221d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13222f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f13223h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f13224q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d0 f13225s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b0 f13226t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b0 f13227u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b0 f13228v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f13229w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f13230x;

    public b0(a0 a0Var) {
        this.f13219a = a0Var.f13206a;
        this.f13220b = a0Var.f13207b;
        this.f13221d = a0Var.f13208c;
        this.f13222f = a0Var.f13209d;
        this.f13223h = a0Var.f13210e;
        e eVar = a0Var.f13211f;
        eVar.getClass();
        this.f13224q = new p(eVar);
        this.f13225s = a0Var.f13212g;
        this.f13226t = a0Var.f13213h;
        this.f13227u = a0Var.f13214i;
        this.f13228v = a0Var.f13215j;
        this.f13229w = a0Var.f13216k;
        this.f13230x = a0Var.f13217l;
    }

    public final String a(String str) {
        String strA = this.f13224q.a(str);
        if (strA != null) {
            return strA;
        }
        return null;
    }

    public final a0 c() {
        a0 a0Var = new a0();
        a0Var.f13206a = this.f13219a;
        a0Var.f13207b = this.f13220b;
        a0Var.f13208c = this.f13221d;
        a0Var.f13209d = this.f13222f;
        a0Var.f13210e = this.f13223h;
        a0Var.f13211f = this.f13224q.c();
        a0Var.f13212g = this.f13225s;
        a0Var.f13213h = this.f13226t;
        a0Var.f13214i = this.f13227u;
        a0Var.f13215j = this.f13228v;
        a0Var.f13216k = this.f13229w;
        a0Var.f13217l = this.f13230x;
        return a0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d0 d0Var = this.f13225s;
        if (d0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        d0Var.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f13220b + ", code=" + this.f13221d + ", message=" + this.f13222f + ", url=" + this.f13219a.f13396a + '}';
    }
}
