package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import c2.n;
import c2.p;
import d2.k;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        n.l("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        n.i().g(new Throwable[0]);
        try {
            k.s0(context).q0(Collections.singletonList(new p(DiagnosticsWorker.class).a()));
        } catch (IllegalStateException e10) {
            n.i().h(e10);
        }
    }
}
