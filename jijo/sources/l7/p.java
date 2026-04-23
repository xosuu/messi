package l7;

import com.google.android.gms.internal.ads.gp0;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class p extends m2.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15298d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15299f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f15300h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(p pVar, String str, Object[] objArr, Object obj, int i10) {
        super(str, objArr);
        this.f15298d = i10;
        this.f15299f = pVar;
        this.f15300h = obj;
    }

    @Override // m2.c
    public final void b() throws Throwable {
        a aVar;
        a aVar2 = a.PROTOCOL_ERROR;
        int i10 = this.f15298d;
        Object obj = this.f15300h;
        Object obj2 = this.f15299f;
        switch (i10) {
            case 0:
                try {
                    ((r) ((p) obj2).f15299f).f15303b.b((x) obj);
                    return;
                } catch (IOException e10) {
                    m7.h.f15802a.k(4, "Http2Connection.Listener failure for " + ((r) ((p) obj2).f15299f).f15305f, e10);
                    try {
                        ((x) obj).c(aVar2);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            case 1:
                try {
                    ((r) ((p) obj2).f15299f).D.a((gp0) obj);
                    return;
                } catch (IOException unused2) {
                    r rVar = (r) ((p) obj2).f15299f;
                    ThreadPoolExecutor threadPoolExecutor = r.G;
                    rVar.c();
                    return;
                }
            default:
                a aVar3 = a.INTERNAL_ERROR;
                try {
                    try {
                        try {
                            ((t) obj).e(this);
                            while (((t) obj).c(false, this)) {
                            }
                            aVar = a.NO_ERROR;
                            try {
                                ((r) obj2).a(aVar, a.CANCEL);
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    ((r) obj2).a(aVar, aVar3);
                                    break;
                                } catch (IOException unused3) {
                                }
                                g7.b.d((t) obj);
                                throw th;
                            }
                        } catch (IOException unused4) {
                        }
                    } catch (IOException unused5) {
                        ((r) obj2).a(aVar2, aVar2);
                    }
                    g7.b.d((t) obj);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    aVar = aVar3;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, t tVar) {
        super("OkHttp %s", new Object[]{rVar.f15305f});
        this.f15298d = 2;
        this.f15299f = rVar;
        this.f15300h = tVar;
    }
}
