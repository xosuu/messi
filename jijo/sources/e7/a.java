package e7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f12741u = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f12742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u6.i f12743b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12744d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12745f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12746h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12747q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f12749t;
    private volatile int workerCtl;

    public a(b bVar, int i10) {
        this.f12749t = bVar;
        setDaemon(true);
        this.f12742a = new l();
        this.f12743b = new u6.i();
        this.f12744d = 4;
        this.nextParkedWorker = b.f12753w;
        v6.d.f17883a.getClass();
        this.f12747q = v6.d.f17884b.a();
        f(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = e7.l.f12780d.get(r10);
        r0 = e7.l.f12779c.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (e7.l.f12781e.get(r10) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r10.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r9 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e7.h a(boolean r12) {
        /*
            r11 = this;
            int r0 = r11.f12744d
            e7.b r7 = r11.f12749t
            r8 = 1
            r9 = 0
            e7.l r10 = r11.f12742a
            if (r0 != r8) goto Lc
            goto L85
        Lc:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = e7.b.f12751u
        Le:
            long r3 = r0.get(r7)
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r3
            r5 = 42
            long r1 = r1 >> r5
            int r2 = (int) r1
            if (r2 != 0) goto L73
            r10.getClass()
        L21:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = e7.l.f12778b
            java.lang.Object r0 = r12.get(r10)
            e7.h r0 = (e7.h) r0
            if (r0 != 0) goto L2c
            goto L41
        L2c:
            c2.n r1 = r0.f12767b
            int r1 = r1.f1536a
            if (r1 != r8) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r10, r0, r9)
            if (r1 == 0) goto L3a
            r9 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r10)
            if (r1 == r0) goto L32
            goto L21
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = e7.l.f12780d
            int r12 = r12.get(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = e7.l.f12779c
            int r0 = r0.get(r10)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = e7.l.f12781e
            int r1 = r1.get(r10)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            e7.h r1 = r10.c(r0, r8)
            if (r1 == 0) goto L4d
            r9 = r1
        L61:
            if (r9 != 0) goto L72
            e7.e r12 = r7.f12759q
            java.lang.Object r12 = r12.d()
            r9 = r12
            e7.h r9 = (e7.h) r9
            if (r9 != 0) goto L72
            e7.h r9 = r11.i(r8)
        L72:
            return r9
        L73:
            r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = e7.b.f12751u
            r2 = r7
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto Le
            r11.f12744d = r8
        L85:
            if (r12 == 0) goto Lb9
            int r12 = r7.f12754a
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L92
            goto L93
        L92:
            r8 = 0
        L93:
            if (r8 == 0) goto L9c
            e7.h r12 = r11.e()
            if (r12 == 0) goto L9c
            goto Lc5
        L9c:
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = e7.l.f12778b
            java.lang.Object r12 = r12.getAndSet(r10, r9)
            e7.h r12 = (e7.h) r12
            if (r12 != 0) goto Lad
            e7.h r12 = r10.b()
        Lad:
            if (r12 == 0) goto Lb0
            goto Lc5
        Lb0:
            if (r8 != 0) goto Lc0
            e7.h r12 = r11.e()
            if (r12 == 0) goto Lc0
            goto Lc5
        Lb9:
            e7.h r12 = r11.e()
            if (r12 == 0) goto Lc0
            goto Lc5
        Lc0:
            r12 = 3
            e7.h r12 = r11.i(r12)
        Lc5:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a.a(boolean):e7.h");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i10) {
        int i11 = this.f12747q;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f12747q = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
    }

    public final h e() {
        int iD = d(2);
        b bVar = this.f12749t;
        if (iD == 0) {
            h hVar = (h) bVar.f12758h.d();
            return hVar != null ? hVar : (h) bVar.f12759q.d();
        }
        h hVar2 = (h) bVar.f12759q.d();
        return hVar2 != null ? hVar2 : (h) bVar.f12758h.d();
    }

    public final void f(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12749t.f12757f);
        sb.append("-worker-");
        sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i10) {
        int i11 = this.f12744d;
        boolean z9 = i11 == 1;
        if (z9) {
            b.f12751u.addAndGet(this.f12749t, 4398046511104L);
        }
        if (i11 != i10) {
            this.f12744d = i10;
        }
        return z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e7.h i(int r24) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a.i(int):e7.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a.run():void");
    }
}
