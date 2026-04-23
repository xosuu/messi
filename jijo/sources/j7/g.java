package j7;

import f7.b0;
import f7.n;
import f7.r;
import f7.y;
import f7.z;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7.d f14452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f14453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i7.b f14454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f14456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f14457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f14458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14462l;

    public g(List list, i7.d dVar, d dVar2, i7.b bVar, int i10, z zVar, y yVar, n nVar, int i11, int i12, int i13) {
        this.f14451a = list;
        this.f14454d = bVar;
        this.f14452b = dVar;
        this.f14453c = dVar2;
        this.f14455e = i10;
        this.f14456f = zVar;
        this.f14457g = yVar;
        this.f14458h = nVar;
        this.f14459i = i11;
        this.f14460j = i12;
        this.f14461k = i13;
    }

    public final b0 a(z zVar) {
        return b(zVar, this.f14452b, this.f14453c, this.f14454d);
    }

    public final b0 b(z zVar, i7.d dVar, d dVar2, i7.b bVar) {
        List list = this.f14451a;
        int size = list.size();
        int i10 = this.f14455e;
        if (i10 >= size) {
            throw new AssertionError();
        }
        this.f14462l++;
        d dVar3 = this.f14453c;
        if (dVar3 != null) {
            if (!this.f14454d.j(zVar.f13396a)) {
                throw new IllegalStateException("network interceptor " + list.get(i10 - 1) + " must retain the same host and port");
            }
        }
        if (dVar3 != null && this.f14462l > 1) {
            throw new IllegalStateException("network interceptor " + list.get(i10 - 1) + " must call proceed() exactly once");
        }
        List list2 = this.f14451a;
        g gVar = new g(list2, dVar, dVar2, bVar, i10 + 1, zVar, this.f14457g, this.f14458h, this.f14459i, this.f14460j, this.f14461k);
        r rVar = (r) list2.get(i10);
        b0 b0VarA = rVar.a(gVar);
        if (dVar2 != null && i10 + 1 < list.size() && gVar.f14462l != 1) {
            throw new IllegalStateException("network interceptor " + rVar + " must call proceed() exactly once");
        }
        if (b0VarA == null) {
            throw new NullPointerException("interceptor " + rVar + " returned null");
        }
        if (b0VarA.f13225s != null) {
            return b0VarA;
        }
        throw new IllegalStateException("interceptor " + rVar + " returned a response with no body");
    }
}
