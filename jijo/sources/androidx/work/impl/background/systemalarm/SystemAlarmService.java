package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.t;
import c2.n;
import f2.g;
import f2.h;
import java.util.HashMap;
import java.util.WeakHashMap;
import m2.k;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends t implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f1189b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1190d;

    static {
        n.l("SystemAlarmService");
    }

    public final void b() {
        this.f1190d = true;
        n.i().g(new Throwable[0]);
        WeakHashMap weakHashMap = k.f15709a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap2 = k.f15709a;
        synchronized (weakHashMap2) {
            map.putAll(weakHashMap2);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                String.format("WakeLock held for %s", map.get(wakeLock));
                n nVarI = n.i();
                WeakHashMap weakHashMap3 = k.f15709a;
                nVarI.n(new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public final void onCreate() {
        super.onCreate();
        h hVar = new h(this);
        this.f1189b = hVar;
        if (hVar.f13086v != null) {
            n.i().h(new Throwable[0]);
        } else {
            hVar.f13086v = this;
        }
        this.f1190d = false;
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1190d = true;
        this.f1189b.e();
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f1190d) {
            n.i().j(new Throwable[0]);
            this.f1189b.e();
            h hVar = new h(this);
            this.f1189b = hVar;
            if (hVar.f13086v != null) {
                n.i().h(new Throwable[0]);
            } else {
                hVar.f13086v = this;
            }
            this.f1190d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1189b.b(i11, intent);
        return 3;
    }
}
