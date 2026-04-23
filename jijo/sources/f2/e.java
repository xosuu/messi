package f2;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c2.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l2.j;
import m2.k;
import m2.q;

/* JADX INFO: loaded from: classes.dex */
public final class e implements h2.b, d2.a, q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f13064v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13066b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13067d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f13068f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h2.c f13069h;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PowerManager.WakeLock f13072t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13073u = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13071s = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f13070q = new Object();

    static {
        n.l("DelayMetCommandHandler");
    }

    public e(Context context, int i10, String str, h hVar) {
        this.f13065a = context;
        this.f13066b = i10;
        this.f13068f = hVar;
        this.f13067d = str;
        this.f13069h = new h2.c(context, hVar.f13078b, this);
    }

    @Override // d2.a
    public final void a(String str, boolean z9) {
        n nVarI = n.i();
        String.format("onExecuted %s, %s", str, Boolean.valueOf(z9));
        nVarI.g(new Throwable[0]);
        b();
        int i10 = 7;
        int i11 = this.f13066b;
        h hVar = this.f13068f;
        Context context = this.f13065a;
        if (z9) {
            hVar.f(new b.d(hVar, b.c(context, this.f13067d), i11, i10));
        }
        if (this.f13073u) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            hVar.f(new b.d(hVar, intent, i11, i10));
        }
    }

    public final void b() {
        synchronized (this.f13070q) {
            try {
                this.f13069h.d();
                this.f13068f.f13079d.b(this.f13067d);
                PowerManager.WakeLock wakeLock = this.f13072t;
                if (wakeLock != null && wakeLock.isHeld()) {
                    n nVarI = n.i();
                    String.format("Releasing wakelock %s for WorkSpec %s", this.f13072t, this.f13067d);
                    nVarI.g(new Throwable[0]);
                    this.f13072t.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h2.b
    public final void c(ArrayList arrayList) {
        f();
    }

    @Override // h2.b
    public final void d(List list) {
        if (list.contains(this.f13067d)) {
            synchronized (this.f13070q) {
                try {
                    if (this.f13071s == 0) {
                        this.f13071s = 1;
                        n nVarI = n.i();
                        String.format("onAllConstraintsMet for %s", this.f13067d);
                        nVarI.g(new Throwable[0]);
                        if (this.f13068f.f13080f.h(this.f13067d, null)) {
                            this.f13068f.f13079d.a(this.f13067d, this);
                        } else {
                            b();
                        }
                    } else {
                        n nVarI2 = n.i();
                        String.format("Already started work for %s", this.f13067d);
                        nVarI2.g(new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e() {
        String str = this.f13067d;
        this.f13072t = k.a(this.f13065a, String.format("%s (%s)", str, Integer.valueOf(this.f13066b)));
        n nVarI = n.i();
        String.format("Acquiring wakelock %s for WorkSpec %s", this.f13072t, str);
        nVarI.g(new Throwable[0]);
        this.f13072t.acquire();
        j jVarH = this.f13068f.f13081h.f12332e.n().h(str);
        if (jVarH == null) {
            f();
            return;
        }
        boolean zB = jVarH.b();
        this.f13073u = zB;
        if (zB) {
            this.f13069h.c(Collections.singletonList(jVarH));
            return;
        }
        n nVarI2 = n.i();
        String.format("No constraints for %s", str);
        nVarI2.g(new Throwable[0]);
        d(Collections.singletonList(str));
    }

    public final void f() {
        synchronized (this.f13070q) {
            try {
                if (this.f13071s < 2) {
                    this.f13071s = 2;
                    n nVarI = n.i();
                    String.format("Stopping work for WorkSpec %s", this.f13067d);
                    nVarI.g(new Throwable[0]);
                    Context context = this.f13065a;
                    String str = this.f13067d;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str);
                    h hVar = this.f13068f;
                    int i10 = 7;
                    hVar.f(new b.d(hVar, intent, this.f13066b, i10));
                    if (this.f13068f.f13080f.e(this.f13067d)) {
                        n nVarI2 = n.i();
                        String.format("WorkSpec %s needs to be rescheduled", this.f13067d);
                        nVarI2.g(new Throwable[0]);
                        Intent intentC = b.c(this.f13065a, this.f13067d);
                        h hVar2 = this.f13068f;
                        hVar2.f(new b.d(hVar2, intentC, this.f13066b, i10));
                    } else {
                        n nVarI3 = n.i();
                        String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f13067d);
                        nVarI3.g(new Throwable[0]);
                    }
                } else {
                    n nVarI4 = n.i();
                    String.format("Already stopped work for %s", this.f13067d);
                    nVarI4.g(new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
