package z7;

import f8.y;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20735b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f20734a = i10;
        this.f20735b = obj;
    }

    @Override // z7.h
    public final String a() {
        int i10 = this.f20734a;
        Object obj = this.f20735b;
        switch (i10) {
            case 0:
                return g1.a.r(new StringBuilder("Zone "), ((y) obj).f13522a.f16142a, " is in list of known SEPs, but DNSKEY from response mismatches!");
            default:
                StringBuilder sb = new StringBuilder("No signatures were attached to answer on question for ");
                x7.e eVar = (x7.e) obj;
                sb.append(eVar.f18553b);
                sb.append(" at ");
                sb.append((Object) eVar.f18552a);
                return sb.toString();
        }
    }
}
