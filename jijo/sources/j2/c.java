package j2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c2.n;
import f.g0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0 f14282g;

    static {
        n.l("BrdcstRcvrCnstrntTrckr");
    }

    public c(Context context, o2.a aVar) {
        super(context, aVar);
        this.f14282g = new g0(1, this);
    }

    @Override // j2.d
    public final void d() {
        n nVarI = n.i();
        String.format("%s: registering receiver", getClass().getSimpleName());
        nVarI.g(new Throwable[0]);
        this.f14285b.registerReceiver(this.f14282g, f());
    }

    @Override // j2.d
    public final void e() {
        n nVarI = n.i();
        String.format("%s: unregistering receiver", getClass().getSimpleName());
        nVarI.g(new Throwable[0]);
        this.f14285b.unregisterReceiver(this.f14282g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
