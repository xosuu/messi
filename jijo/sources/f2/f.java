package f2;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c2.n;
import com.google.android.gms.internal.ads.ur0;
import m2.k;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f13075b;

    public /* synthetic */ f(h hVar, int i10) {
        this.f13074a = i10;
        this.f13075b = hVar;
    }

    private void a() {
        h hVar;
        f fVar;
        synchronized (this.f13075b.f13084t) {
            h hVar2 = this.f13075b;
            hVar2.f13085u = (Intent) hVar2.f13084t.get(0);
        }
        Intent intent = this.f13075b.f13085u;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f13075b.f13085u.getIntExtra("KEY_START_ID", 0);
            n nVarI = n.i();
            int i10 = h.f13076w;
            int i11 = 1;
            String.format("Processing command %s, %s", this.f13075b.f13085u, Integer.valueOf(intExtra));
            nVarI.g(new Throwable[0]);
            PowerManager.WakeLock wakeLockA = k.a(this.f13075b.f13077a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
            try {
                n nVarI2 = n.i();
                String.format("Acquiring operation wake lock (%s) %s", action, wakeLockA);
                nVarI2.g(new Throwable[0]);
                wakeLockA.acquire();
                h hVar3 = this.f13075b;
                hVar3.f13082q.e(hVar3.f13085u, intExtra, hVar3);
                n nVarI3 = n.i();
                String.format("Releasing operation wake lock (%s) %s", action, wakeLockA);
                nVarI3.g(new Throwable[0]);
                wakeLockA.release();
                hVar = this.f13075b;
                fVar = new f(hVar, i11);
            } catch (Throwable th) {
                try {
                    n nVarI4 = n.i();
                    int i12 = h.f13076w;
                    nVarI4.h(th);
                    n nVarI5 = n.i();
                    String.format("Releasing operation wake lock (%s) %s", action, wakeLockA);
                    nVarI5.g(new Throwable[0]);
                    wakeLockA.release();
                    hVar = this.f13075b;
                    fVar = new f(hVar, i11);
                } catch (Throwable th2) {
                    n nVarI6 = n.i();
                    int i13 = h.f13076w;
                    String.format("Releasing operation wake lock (%s) %s", action, wakeLockA);
                    nVarI6.g(new Throwable[0]);
                    wakeLockA.release();
                    h hVar4 = this.f13075b;
                    hVar4.f(new f(hVar4, i11));
                    throw th2;
                }
            }
            hVar.f(fVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13074a) {
            case 0:
                a();
                return;
            default:
                h hVar = this.f13075b;
                hVar.getClass();
                n nVarI = n.i();
                int i10 = h.f13076w;
                nVarI.g(new Throwable[0]);
                hVar.c();
                synchronized (hVar.f13084t) {
                    try {
                        if (hVar.f13085u != null) {
                            n nVarI2 = n.i();
                            String.format("Removing command %s", hVar.f13085u);
                            nVarI2.g(new Throwable[0]);
                            if (!((Intent) hVar.f13084t.remove(0)).equals(hVar.f13085u)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            hVar.f13085u = null;
                        }
                        m2.i iVar = (m2.i) ((ur0) hVar.f13078b).f9600b;
                        if (!hVar.f13082q.d() && hVar.f13084t.isEmpty() && !iVar.a()) {
                            n.i().g(new Throwable[0]);
                            g gVar = hVar.f13086v;
                            if (gVar != null) {
                                ((SystemAlarmService) gVar).b();
                            }
                        } else if (!hVar.f13084t.isEmpty()) {
                            hVar.g();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
