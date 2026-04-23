package o0;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import com.google.android.gms.internal.ads.rk1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f16066a;

    public s0(u uVar) {
        this.f16066a = uVar;
    }

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        h hVar = new h(new k.q(contentInfo));
        h hVarA = ((s0.t) this.f16066a).a(view, hVar);
        if (hVarA == null) {
            return null;
        }
        if (hVarA == hVar) {
            return contentInfo;
        }
        ContentInfo contentInfoO = hVarA.f16026a.o();
        Objects.requireNonNull(contentInfoO);
        return rk1.m(contentInfoO);
    }
}
