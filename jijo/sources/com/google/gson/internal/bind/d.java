package com.google.gson.internal.bind;

import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d extends s5.b {
    public static final c B = new c();
    public static final p C = new p("closed");
    public m A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f12138y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f12139z;

    public d() {
        super(B);
        this.f12138y = new ArrayList();
        this.A = n.f12256a;
    }

    @Override // s5.b
    public final void A() {
        ArrayList arrayList = this.f12138y;
        if (arrayList.isEmpty() || this.f12139z != null) {
            throw new IllegalStateException();
        }
        if (!(Q() instanceof l)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // s5.b
    public final void D() {
        ArrayList arrayList = this.f12138y;
        if (arrayList.isEmpty() || this.f12139z != null) {
            throw new IllegalStateException();
        }
        if (!(Q() instanceof o)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // s5.b
    public final void E(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f12138y.isEmpty() || this.f12139z != null) {
            throw new IllegalStateException();
        }
        if (!(Q() instanceof o)) {
            throw new IllegalStateException();
        }
        this.f12139z = str;
    }

    @Override // s5.b
    public final s5.b G() {
        R(n.f12256a);
        return this;
    }

    @Override // s5.b
    public final void J(double d10) {
        if (this.f16731q || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            R(new p(Double.valueOf(d10)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
    }

    @Override // s5.b
    public final void K(long j10) {
        R(new p(Long.valueOf(j10)));
    }

    @Override // s5.b
    public final void L(Boolean bool) {
        if (bool == null) {
            R(n.f12256a);
        } else {
            R(new p(bool));
        }
    }

    @Override // s5.b
    public final void M(Number number) {
        if (number == null) {
            R(n.f12256a);
            return;
        }
        if (!this.f16731q) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        R(new p(number));
    }

    @Override // s5.b
    public final void N(String str) {
        if (str == null) {
            R(n.f12256a);
        } else {
            R(new p(str));
        }
    }

    @Override // s5.b
    public final void O(boolean z9) {
        R(new p(Boolean.valueOf(z9)));
    }

    public final m Q() {
        return (m) this.f12138y.get(r0.size() - 1);
    }

    public final void R(m mVar) {
        if (this.f12139z != null) {
            if (!(mVar instanceof n) || this.f16734u) {
                o oVar = (o) Q();
                String str = this.f12139z;
                oVar.getClass();
                oVar.f12257a.put(str, mVar);
            }
            this.f12139z = null;
            return;
        }
        if (this.f12138y.isEmpty()) {
            this.A = mVar;
            return;
        }
        m mVarQ = Q();
        if (!(mVarQ instanceof l)) {
            throw new IllegalStateException();
        }
        ((l) mVarQ).f12255a.add(mVar);
    }

    @Override // s5.b
    public final void c() {
        l lVar = new l();
        R(lVar);
        this.f12138y.add(lVar);
    }

    @Override // s5.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f12138y;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(C);
    }

    @Override // s5.b
    public final void e() {
        o oVar = new o();
        R(oVar);
        this.f12138y.add(oVar);
    }

    @Override // s5.b, java.io.Flushable
    public final void flush() {
    }
}
