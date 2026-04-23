package z7;

import f8.y;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7.e f20736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f20737b;

    public d(x7.e eVar, y yVar) {
        this.f20736a = eVar;
        this.f20737b = yVar;
    }

    @Override // z7.h
    public final String a() {
        StringBuilder sb = new StringBuilder("NSEC ");
        sb.append((Object) this.f20737b.f13522a);
        sb.append(" does nat match question for ");
        x7.e eVar = this.f20736a;
        sb.append(eVar.f18553b);
        sb.append(" at ");
        sb.append((Object) eVar.f18552a);
        return sb.toString();
    }
}
