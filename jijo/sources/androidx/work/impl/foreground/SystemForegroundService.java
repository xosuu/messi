package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.t;
import c2.n;
import com.google.android.gms.internal.ads.ur0;
import d2.k;
import java.util.UUID;
import k2.b;
import k2.c;
import l0.a;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends t implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f1193b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1194d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f1195f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public NotificationManager f1196h;

    static {
        n.l("SystemFgService");
    }

    public final void b() {
        this.f1193b = new Handler(Looper.getMainLooper());
        this.f1196h = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.f1195f = cVar;
        if (cVar.f14658u != null) {
            n.i().h(new Throwable[0]);
        } else {
            cVar.f14658u = this;
        }
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1195f.g();
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        int i12 = 0;
        if (this.f1194d) {
            n.i().j(new Throwable[0]);
            this.f1195f.g();
            b();
            this.f1194d = false;
        }
        if (intent == null) {
            return 3;
        }
        c cVar = this.f1195f;
        cVar.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        int i13 = c.f14649v;
        k kVar = cVar.f14650a;
        if (zEquals) {
            n nVarI = n.i();
            String.format("Started foreground service %s", intent);
            nVarI.j(new Throwable[0]);
            ((ur0) cVar.f14651b).s(new a(cVar, kVar.f12332e, intent.getStringExtra("KEY_WORKSPEC_ID"), 6));
            cVar.f(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            cVar.f(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            n nVarI2 = n.i();
            String.format("Stopping foreground work for %s", intent);
            nVarI2.j(new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra);
            kVar.getClass();
            ((ur0) kVar.f12333f).s(new m2.a(kVar, uuidFromString, i12));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        n.i().j(new Throwable[0]);
        b bVar = cVar.f14658u;
        if (bVar == null) {
            return 3;
        }
        SystemForegroundService systemForegroundService = (SystemForegroundService) bVar;
        systemForegroundService.f1194d = true;
        n.i().g(new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
