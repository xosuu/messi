package b2;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.y9;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1244b;

    public /* synthetic */ h(int i10, Object obj) {
        this.f1243a = i10;
        this.f1244b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f1243a;
        Object obj = this.f1244b;
        switch (i10) {
            case 0:
                i iVar = new i();
                iVar.f1245a = (JsReplyProxyBoundaryInterface) obj;
                return iVar;
            default:
                zzt zztVar = (zzt) obj;
                String str = zztVar.f2236a.afmaVersion;
                Context context = zztVar.f2239f;
                x9.k(context, false);
                return new y9(new x9(context, str, false));
        }
    }
}
