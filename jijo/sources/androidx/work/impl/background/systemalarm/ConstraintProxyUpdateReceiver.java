package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c2.n;
import com.google.android.gms.internal.ads.ur0;
import d2.k;
import k.g;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1188a = 0;

    static {
        n.l("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            ((ur0) k.s0(context).f12333f).s(new g(this, intent, context, goAsync(), 2));
            return;
        }
        n nVarI = n.i();
        String.format("Ignoring unknown action %s", action);
        nVarI.g(new Throwable[0]);
    }
}
