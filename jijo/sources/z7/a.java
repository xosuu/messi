package z7;

import f8.y;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Exception f20729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f20730c;

    public a(v7.b bVar, y yVar, Exception exc) {
        this.f20728a = bVar.f17892a;
        this.f20730c = yVar;
        this.f20729b = exc;
    }

    @Override // z7.h
    public final String a() {
        return "DS algorithm " + this.f20728a + " threw exception while verifying " + ((Object) this.f20730c.f13522a) + ": " + this.f20729b;
    }
}
