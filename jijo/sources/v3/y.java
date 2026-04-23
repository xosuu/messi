package v3;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class y extends q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f17803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(f fVar, int i10) {
        super(fVar, i10, null);
        this.f17803g = fVar;
    }

    @Override // v3.q
    public final void b(ConnectionResult connectionResult) {
        f fVar = this.f17803g;
        fVar.getClass();
        fVar.f17753p.d(connectionResult);
        fVar.f17741d = connectionResult.f2470b;
        fVar.f17742e = System.currentTimeMillis();
    }

    @Override // v3.q
    public final boolean c() {
        this.f17803g.f17753p.d(ConnectionResult.f2468h);
        return true;
    }
}
