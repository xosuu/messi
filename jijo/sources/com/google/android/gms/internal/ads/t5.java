package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f9047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9054h;

    public t5(b1 b1Var) {
        this.f9047a = b1Var;
    }

    public final void a(int i10, byte[] bArr, int i11) {
        if (this.f9049c) {
            int i12 = this.f9052f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f9052f = (i11 - i10) + i12;
            } else {
                this.f9050d = ((bArr[i13] & 192) >> 6) == 0;
                this.f9049c = false;
            }
        }
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
    public final void b(int i10, long j10, boolean z9) {
        tc1.W(this.f9054h != -9223372036854775807L);
        if (this.f9051e == 182 && z9 && this.f9048b) {
            this.f9047a.e(this.f9054h, this.f9050d ? 1 : 0, (int) (j10 - this.f9053g), i10, null);
        }
        if (this.f9051e != 179) {
            this.f9053g = j10;
        }
    }
}
