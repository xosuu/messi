package k1;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import g4.a0;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopicsManager f14648b;

    public g(TopicsManager topicsManager) {
        a0.f(topicsManager, "mTopicsManager");
        this.f14648b = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object Y(k1.g r7, k1.a r8, n6.e r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof k1.f
            if (r0 == 0) goto L13
            r0 = r9
            k1.f r0 = (k1.f) r0
            int r1 = r0.f14647s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14647s = r1
            goto L18
        L13:
            k1.f r0 = new k1.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f14645h
            o6.a r1 = o6.a.f16110a
            int r2 = r0.f14647s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            k1.g r7 = r0.f14644f
            com.google.android.gms.internal.ads.en1.K(r9)
            goto L5f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            com.google.android.gms.internal.ads.en1.K(r9)
            android.adservices.topics.GetTopicsRequest r8 = r7.X(r8)
            r0.f14644f = r7
            r0.f14647s = r3
            b7.d r9 = new b7.d
            n6.e r0 = com.google.android.gms.internal.ads.en1.u(r0)
            r9.<init>(r0)
            r9.l()
            j1.c r0 = new j1.c
            r2 = 6
            r0.<init>(r2)
            k0.d r2 = new k0.d
            r2.<init>(r9)
            android.adservices.topics.TopicsManager r3 = r7.f14648b
            j1.b.q(r3, r8, r0, r2)
            java.lang.Object r9 = r9.k()
            if (r9 != r1) goto L5f
            return r1
        L5f:
            android.adservices.topics.GetTopicsResponse r8 = j1.b.h(r9)
            r7.getClass()
            java.lang.String r7 = "response"
            g4.a0.f(r8, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r8 = j1.b.l(r8)
            java.util.Iterator r8 = r8.iterator()
        L78:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r8.next()
            android.adservices.topics.Topic r9 = j1.b.i(r9)
            k1.c r6 = new k1.c
            long r1 = j1.b.b(r9)
            long r3 = j1.b.r(r9)
            int r5 = j1.b.a(r9)
            r0 = r6
            r0.<init>(r1, r3, r5)
            r7.add(r6)
            goto L78
        L9c:
            k1.b r8 = new k1.b
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.g.Y(k1.g, k1.a, n6.e):java.lang.Object");
    }

    public GetTopicsRequest X(a aVar) {
        a0.f(aVar, "request");
        GetTopicsRequest getTopicsRequestBuild = j1.b.d().setAdsSdkName(aVar.f14638a).build();
        a0.e(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    @Override // t3.i
    public Object l(a aVar, n6.e eVar) {
        return Y(this, aVar, eVar);
    }
}
