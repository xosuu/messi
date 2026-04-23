package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f12106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f12107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r5.a f12108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f12109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile x f12111f;

    public static final class SingleTypeFactory implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r5.a f12112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f12113b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Class f12114d = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final q f12115f;

        public SingleTypeFactory(q qVar, r5.a aVar, boolean z9) {
            this.f12115f = qVar;
            this.f12112a = aVar;
            this.f12113b = z9;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            if (r7.f12114d.isAssignableFrom(r9.f16536a) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        
            if (r0.f16537b == r9.f16536a) goto L13;
         */
        @Override // com.google.gson.y
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.google.gson.x a(com.google.gson.j r8, r5.a r9) {
            /*
                r7 = this;
                r5.a r0 = r7.f12112a
                if (r0 == 0) goto L15
                boolean r1 = r0.equals(r9)
                if (r1 != 0) goto L1f
                boolean r1 = r7.f12113b
                if (r1 == 0) goto L2c
                java.lang.Class r1 = r9.f16536a
                java.lang.reflect.Type r0 = r0.f16537b
                if (r0 != r1) goto L2c
                goto L1f
            L15:
                java.lang.Class r0 = r9.f16536a
                java.lang.Class r1 = r7.f12114d
                boolean r0 = r1.isAssignableFrom(r0)
                if (r0 == 0) goto L2c
            L1f:
                com.google.gson.internal.bind.TreeTypeAdapter r0 = new com.google.gson.internal.bind.TreeTypeAdapter
                com.google.gson.q r2 = r7.f12115f
                r6 = 1
                r1 = r0
                r3 = r8
                r4 = r9
                r5 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                goto L2d
            L2c:
                r0 = 0
            L2d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TreeTypeAdapter.SingleTypeFactory.a(com.google.gson.j, r5.a):com.google.gson.x");
        }
    }

    public TreeTypeAdapter(q qVar, j jVar, r5.a aVar, y yVar, boolean z9) {
        this.f12106a = qVar;
        this.f12107b = jVar;
        this.f12108c = aVar;
        this.f12109d = yVar;
        this.f12110e = z9;
    }

    public static y f(r5.a aVar, q qVar) {
        return new SingleTypeFactory(qVar, aVar, aVar.f16537b == aVar.f16536a);
    }

    @Override // com.google.gson.x
    public final Object b(s5.a aVar) {
        return e().b(aVar);
    }

    @Override // com.google.gson.x
    public final void c(s5.b bVar, Object obj) throws IOException {
        q qVar = this.f12106a;
        if (qVar == null) {
            e().c(bVar, obj);
            return;
        }
        if (this.f12110e && obj == null) {
            bVar.G();
            return;
        }
        Type type = this.f12108c.f16537b;
        g.f12179z.c(bVar, qVar.a(obj));
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final x d() {
        return this.f12106a != null ? this : e();
    }

    public final x e() {
        x xVar = this.f12111f;
        if (xVar != null) {
            return xVar;
        }
        x xVarD = this.f12107b.d(this.f12109d, this.f12108c);
        this.f12111f = xVarD;
        return xVarD;
    }
}
