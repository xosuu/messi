package v3;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f17786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f17788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f17790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f17791f;

    public q(f fVar, int i10, Bundle bundle) {
        this.f17791f = fVar;
        Boolean bool = Boolean.TRUE;
        this.f17788c = fVar;
        this.f17786a = bool;
        this.f17787b = false;
        this.f17789d = i10;
        this.f17790e = bundle;
    }

    public final /* bridge */ void a() {
        f fVar = this.f17791f;
        int i10 = this.f17789d;
        if (i10 != 0) {
            fVar.m(1, null);
            Bundle bundle = this.f17790e;
            b(new ConnectionResult(i10, bundle != null ? (PendingIntent) bundle.getParcelable(f.KEY_PENDING_INTENT) : null));
        } else {
            if (c()) {
                return;
            }
            fVar.m(1, null);
            b(new ConnectionResult(8, null));
        }
    }

    public abstract void b(ConnectionResult connectionResult);

    public abstract boolean c();

    public final void d() {
        synchronized (this) {
            this.f17786a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f17788c.f17755r) {
            this.f17788c.f17755r.remove(this);
        }
    }
}
