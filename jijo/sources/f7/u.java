package f7;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u extends t3.i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f13336f = s.a("multipart/mixed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f13337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f13338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f13339i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7.h f13340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f13341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13343e = -1;

    static {
        s.a("multipart/alternative");
        s.a("multipart/digest");
        s.a("multipart/parallel");
        f13337g = s.a("multipart/form-data");
        f13338h = new byte[]{13, 10};
        f13339i = new byte[]{45, 45};
    }

    public u(p7.h hVar, s sVar, List list) {
        this.f13340b = hVar;
        this.f13341c = s.a(sVar + "; boundary=" + hVar.o());
        this.f13342d = g7.b.l(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long X(p7.f fVar, boolean z9) {
        p7.e eVar;
        Object obj = null;
        if (z9) {
            fVar = new p7.e();
            eVar = fVar;
        } else {
            eVar = 0;
        }
        List list = this.f13342d;
        int size = list.size();
        p7.h hVar = this.f13340b;
        byte[] bArr = f13339i;
        byte[] bArr2 = f13338h;
        if (size > 0) {
            ((t) list.get(0)).getClass();
            fVar.q(bArr);
            fVar.s(hVar);
            fVar.q(bArr2);
            obj.getClass();
            throw null;
        }
        fVar.q(bArr);
        fVar.s(hVar);
        fVar.q(bArr);
        fVar.q(bArr2);
        if (!z9) {
            return 0L;
        }
        long j10 = eVar.f16276b;
        eVar.a();
        return j10;
    }

    @Override // t3.i
    public final long h() {
        long j10 = this.f13343e;
        if (j10 != -1) {
            return j10;
        }
        long jX = X(null, true);
        this.f13343e = jX;
        return jX;
    }

    @Override // t3.i
    public final s i() {
        return this.f13341c;
    }

    @Override // t3.i
    public final void z(p7.f fVar) {
        X(fVar, false);
    }
}
