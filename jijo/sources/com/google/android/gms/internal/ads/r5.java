package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class r5 implements p5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f8393q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b1 f8395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j6 f8396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik0 f8397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1.v f8398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f8399f = new boolean[4];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q5 f8400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f8404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f8406m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f8407n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8408o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8409p;

    public r5(j6 j6Var) {
        ik0 ik0Var;
        this.f8396c = j6Var;
        q5 q5Var = new q5();
        q5Var.f8113d = new byte[NotificationCompat.FLAG_HIGH_PRIORITY];
        this.f8400g = q5Var;
        if (j6Var != null) {
            this.f8398e = new m1.v(178);
            ik0Var = new ik0();
        } else {
            ik0Var = null;
            this.f8398e = null;
        }
        this.f8397d = ik0Var;
        this.f8405l = -9223372036854775807L;
        this.f8407n = -9223372036854775807L;
    }

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
    public final void b(boolean z9) {
        tc1.A(this.f8395b);
        if (z9) {
            boolean z10 = this.f8408o;
            long j10 = this.f8401h - this.f8406m;
            this.f8395b.e(this.f8407n, z10 ? 1 : 0, (int) j10, 0, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018b  */
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
    public final void c(com.google.android.gms.internal.ads.ik0 r22) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r5.c(com.google.android.gms.internal.ads.ik0):void");
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void d(i0 i0Var, q2.d dVar) {
        dVar.c();
        dVar.d();
        this.f8394a = dVar.f16416e;
        dVar.d();
        this.f8395b = i0Var.j(dVar.f16414c, 2);
        j6 j6Var = this.f8396c;
        if (j6Var != null) {
            j6Var.b(i0Var, dVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void e(int i10, long j10) {
        this.f8405l = j10;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void zze() {
        ds0.e(this.f8399f);
        q5 q5Var = this.f8400g;
        q5Var.f8110a = false;
        q5Var.f8111b = 0;
        q5Var.f8112c = 0;
        m1.v vVar = this.f8398e;
        if (vVar != null) {
            vVar.f();
        }
        this.f8401h = 0L;
        this.f8402i = false;
        this.f8405l = -9223372036854775807L;
        this.f8407n = -9223372036854775807L;
    }
}
