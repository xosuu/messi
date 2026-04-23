package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m5 implements p5 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f6846w = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6847a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b1 f6853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b1 f6854h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6859m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6863q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6865s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b1 f6867u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f6868v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f6848b = new d1(new byte[7], 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ik0 f6849c = new ik0(Arrays.copyOf(f6846w, 10));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6855i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6856j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6857k = NotificationCompat.FLAG_LOCAL_ONLY;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6860n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6861o = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f6864r = -9223372036854775807L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f6866t = -9223372036854775807L;

    public m5(int i10, String str, boolean z9) {
        this.f6847a = z9;
        this.f6850d = str;
        this.f6851e = i10;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void b(boolean z9) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x027b, code lost:
    
        r19.f6862p = (r6 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0285, code lost:
    
        if (1 == (!(r6 & 1))) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0287, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0289, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x028a, code lost:
    
        r19.f6858l = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x028e, code lost:
    
        if (r19.f6859m != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0290, code lost:
    
        r19.f6855i = 1;
        r19.f6856j = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0296, code lost:
    
        r19.f6855i = 3;
        r19.f6856j = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x029c, code lost:
    
        r20.i(r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e8  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.p5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.ik0 r20) {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m5.c(com.google.android.gms.internal.ads.ik0):void");
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void d(i0 i0Var, q2.d dVar) {
        dVar.c();
        dVar.d();
        this.f6852f = dVar.f16416e;
        dVar.d();
        b1 b1VarJ = i0Var.j(dVar.f16414c, 1);
        this.f6853g = b1VarJ;
        this.f6867u = b1VarJ;
        if (!this.f6847a) {
            this.f6854h = new f0();
            return;
        }
        dVar.c();
        dVar.d();
        b1 b1VarJ2 = i0Var.j(dVar.f16414c, 5);
        this.f6854h = b1VarJ2;
        q0 q0Var = new q0();
        dVar.d();
        q0Var.f8041a = dVar.f16416e;
        q0Var.f("application/id3");
        b1VarJ2.c(new y1(q0Var));
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void e(int i10, long j10) {
        this.f6866t = j10;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void zze() {
        this.f6866t = -9223372036854775807L;
        this.f6859m = false;
        this.f6855i = 0;
        this.f6856j = 0;
        this.f6857k = NotificationCompat.FLAG_LOCAL_ONLY;
    }
}
