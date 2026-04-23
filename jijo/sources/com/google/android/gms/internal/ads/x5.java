package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f10429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f10439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10441m;

    public x5(b1 b1Var) {
        this.f10429a = b1Var;
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
    public final void a(int i10) {
        long j10 = this.f10440l;
        if (j10 == -9223372036854775807L) {
            return;
        }
        boolean z9 = this.f10441m;
        long j11 = this.f10430b - this.f10439k;
        this.f10429a.e(j10, z9 ? 1 : 0, (int) j11, i10, null);
    }
}
