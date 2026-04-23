package u3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f17638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4.e f17639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2.n f17640d;

    public z(int i10, j jVar, k4.e eVar, c2.n nVar) {
        super(i10);
        this.f17639c = eVar;
        this.f17638b = jVar;
        this.f17640d = nVar;
        if (i10 == 2 && jVar.f17586c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // u3.t
    public final boolean a(o oVar) {
        return this.f17638b.f17586c;
    }

    @Override // u3.t
    public final Feature[] b(o oVar) {
        return (Feature[]) this.f17638b.f17585b;
    }

    @Override // u3.t
    public final void c(Status status) {
        this.f17640d.getClass();
        this.f17639c.a(status.f2483d != null ? new ResolvableApiException(status) : new ApiException(status));
    }

    @Override // u3.t
    public final void d(RuntimeException runtimeException) {
        this.f17639c.a(runtimeException);
    }

    @Override // u3.t
    public final void e(o oVar) throws DeadObjectException {
        k4.e eVar = this.f17639c;
        try {
            this.f17638b.b(oVar.f17593b, eVar);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            c(t.g(e11));
        } catch (RuntimeException e12) {
            eVar.a(e12);
        }
    }

    @Override // u3.t
    public final void f(f.f fVar, boolean z9) {
        Map map = (Map) fVar.f12833d;
        Boolean boolValueOf = Boolean.valueOf(z9);
        k4.e eVar = this.f17639c;
        map.put(eVar, boolValueOf);
        k4.l lVar = eVar.f14669a;
        f.f fVar2 = new f.f(fVar, eVar, 18);
        lVar.getClass();
        lVar.f14683b.e(new k4.i(k4.f.f14670a, fVar2));
        lVar.i();
    }
}
