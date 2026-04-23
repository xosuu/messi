package u3;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.bl1;
import com.google.android.gms.internal.ads.xl1;

/* JADX INFO: loaded from: classes.dex */
public final class q implements v3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17608b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17609d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f17610f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f17611h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f17612q;

    public q(d dVar, v3.h hVar, a aVar) {
        this.f17612q = dVar;
        this.f17610f = null;
        this.f17611h = null;
        this.f17607a = false;
        this.f17608b = hVar;
        this.f17609d = aVar;
    }

    public final void a(ConnectionResult connectionResult) {
        o oVar = (o) ((d) this.f17612q).f17576v.get((a) this.f17609d);
        if (oVar != null) {
            z3.a.i(oVar.f17604y.f17579y);
            v3.h hVar = oVar.f17593b;
            String name = hVar.getClass().getName();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(strValueOf);
            hVar.disconnect(sb.toString());
            oVar.l(connectionResult, null);
        }
    }

    @Override // v3.d
    public final void d(ConnectionResult connectionResult) {
        ((d) this.f17612q).f17579y.post(new l.j(this, 16, connectionResult));
    }

    public q(Context context) {
        this.f17608b = context;
        this.f17609d = bl1.f3054c;
        this.f17610f = xl1.f10604k;
    }
}
