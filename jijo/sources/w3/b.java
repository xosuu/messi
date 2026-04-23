package w3;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import l.a0;
import t3.f;
import t3.i;
import v3.g;
import v3.h;
import v3.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18153b;

    public b(int i10) {
        this.f18153b = i10;
    }

    @Override // t3.i
    public final h a(Context context, Looper looper, g gVar, t3.b bVar, f fVar, t3.g gVar2) {
        int i10 = this.f18153b;
        switch (i10) {
            case 2:
                Integer num = gVar.f17771h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", gVar.f17764a);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new j4.a(context, looper, gVar, bundle, fVar, gVar2);
            case 3:
                a0.q(bVar);
                throw null;
            default:
                switch (i10) {
                    case 0:
                        return new d(context, looper, gVar, (l) bVar, fVar, gVar2);
                    case 1:
                        return new d4.b(context, looper, 300, gVar, fVar, gVar2);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
        }
    }
}
