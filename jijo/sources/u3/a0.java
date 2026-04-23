package u3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4.e f17556b;

    public a0(k4.e eVar) {
        super(4);
        this.f17556b = eVar;
    }

    @Override // u3.t
    public final boolean a(o oVar) {
        fb1.t(oVar.f17597q.get(null));
        return false;
    }

    @Override // u3.t
    public final Feature[] b(o oVar) {
        fb1.t(oVar.f17597q.get(null));
        return null;
    }

    @Override // u3.t
    public final void c(Status status) {
        this.f17556b.a(new ApiException(status));
    }

    @Override // u3.t
    public final void d(RuntimeException runtimeException) {
        this.f17556b.a(runtimeException);
    }

    @Override // u3.t
    public final void e(o oVar) throws DeadObjectException {
        try {
            h(oVar);
        } catch (DeadObjectException e10) {
            c(t.g(e10));
            throw e10;
        } catch (RemoteException e11) {
            c(t.g(e11));
        } catch (RuntimeException e12) {
            this.f17556b.a(e12);
        }
    }

    @Override // u3.t
    public final /* bridge */ /* synthetic */ void f(f.f fVar, boolean z9) {
    }

    public final void h(o oVar) {
        fb1.t(oVar.f17597q.remove(null));
        k4.e eVar = this.f17556b;
        Boolean bool = Boolean.FALSE;
        k4.l lVar = eVar.f14669a;
        synchronized (lVar.f14682a) {
            try {
                if (lVar.f14684c) {
                    return;
                }
                lVar.f14684c = true;
                lVar.f14686e = bool;
                lVar.f14683b.h(lVar);
            } finally {
            }
        }
    }
}
