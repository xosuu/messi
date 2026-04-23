package u3;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17629b;

    public /* synthetic */ x(int i10, Object obj) {
        this.f17628a = i10;
        this.f17629b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17628a;
        Object obj = this.f17629b;
        switch (i10) {
            case 0:
                ((y) obj).f17637s.a(new ConnectionResult(4));
                break;
            case 1:
                ((o) obj).e();
                break;
            default:
                v3.h hVar = ((n) obj).f17591a.f17593b;
                hVar.disconnect(hVar.getClass().getName().concat(" disconnecting because it was signed out."));
                break;
        }
    }
}
