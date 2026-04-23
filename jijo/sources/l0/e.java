package l0;

import android.content.Context;
import java.util.concurrent.Callable;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f15103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f15104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15105e;

    public /* synthetic */ e(String str, Context context, q qVar, int i10, int i11) {
        this.f15101a = i11;
        this.f15102b = str;
        this.f15103c = context;
        this.f15104d = qVar;
        this.f15105e = i10;
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        /*
            r6 = this;
            r0 = -3
            java.lang.String r1 = r6.f15102b
            android.content.Context r2 = r6.f15103c
            l.q r3 = r6.f15104d
            int r4 = r6.f15105e
            int r5 = r6.f15101a
            switch(r5) {
                case 0: goto L22;
                default: goto Le;
            }
        Le:
            switch(r5) {
                case 0: goto L1d;
                default: goto L11;
            }
        L11:
            l0.g r0 = l0.h.a(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L16
            goto L21
        L16:
            l0.g r1 = new l0.g
            r1.<init>(r0)
            r0 = r1
            goto L21
        L1d:
            l0.g r0 = l0.h.a(r1, r2, r3, r4)
        L21:
            return r0
        L22:
            switch(r5) {
                case 0: goto L31;
                default: goto L25;
            }
        L25:
            l0.g r0 = l0.h.a(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L2a
            goto L35
        L2a:
            l0.g r1 = new l0.g
            r1.<init>(r0)
            r0 = r1
            goto L35
        L31:
            l0.g r0 = l0.h.a(r1, r2, r3, r4)
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.e.call():java.lang.Object");
    }
}
