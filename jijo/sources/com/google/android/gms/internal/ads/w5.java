package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class w5 implements p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j6 f10062a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10066e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f10068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b1 f10069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v5 f10070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10071j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10073l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f10067f = new boolean[3];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1.v f10063b = new m1.v(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1.v f10064c = new m1.v(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m1.v f10065d = new m1.v(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f10072k = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ik0 f10074m = new ik0();

    public w5(j6 j6Var) {
        this.f10062a = j6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        tc1.A(this.f10069h);
        int i10 = yn0.f10944a;
        if (z9) {
            v5 v5Var = this.f10070i;
            long j10 = this.f10066e;
            boolean z10 = v5Var.f9784k;
            boolean z11 = v5Var.f9783j;
            int i11 = v5Var.f9777d;
            char c10 = 1;
            if (i11 != 5 && (!z10 || i11 != 1)) {
                c10 = 0;
            }
            boolean z12 = (z11 ? 1 : 0) | c10;
            v5Var.f9783j = z12;
            v5Var.f9778e = j10;
            long j11 = v5Var.f9782i;
            if (j11 != -9223372036854775807L) {
                long j12 = j10 - v5Var.f9781h;
                v5Var.f9774a.e(j11, z12 ? 1 : 0, (int) j12, 0, null);
            }
            v5Var.f9780g = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
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
    public final void c(com.google.android.gms.internal.ads.ik0 r31) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w5.c(com.google.android.gms.internal.ads.ik0):void");
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void d(i0 i0Var, q2.d dVar) {
        dVar.c();
        dVar.d();
        this.f10068g = dVar.f16416e;
        dVar.d();
        b1 b1VarJ = i0Var.j(dVar.f16414c, 2);
        this.f10069h = b1VarJ;
        this.f10070i = new v5(b1VarJ);
        this.f10062a.b(i0Var, dVar);
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void e(int i10, long j10) {
        this.f10072k = j10;
        int i11 = i10 & 2;
        this.f10073l = (i11 != 0) | this.f10073l;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void zze() {
        this.f10066e = 0L;
        this.f10073l = false;
        this.f10072k = -9223372036854775807L;
        ds0.e(this.f10067f);
        this.f10063b.f();
        this.f10064c.f();
        this.f10065d.f();
        v5 v5Var = this.f10070i;
        if (v5Var != null) {
            v5Var.f9780g = false;
        }
    }
}
