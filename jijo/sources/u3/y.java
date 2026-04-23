package u3;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class y extends j4.c implements t3.f, t3.g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final w3.b f17630t = i4.b.f14174a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f17632b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w3.b f17633d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f17634f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v3.g f17635h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i4.c f17636q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q f17637s;

    public y(Context context, e4.e eVar, v3.g gVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f17631a = context;
        this.f17632b = eVar;
        this.f17635h = gVar;
        this.f17634f = gVar.f17765b;
        this.f17633d = f17630t;
    }

    @Override // u3.c
    public final void a0() {
        this.f17636q.b(this);
    }

    @Override // u3.c
    public final void m(int i10) {
        this.f17636q.disconnect();
    }

    @Override // u3.h
    public final void t(ConnectionResult connectionResult) {
        this.f17637s.a(connectionResult);
    }
}
