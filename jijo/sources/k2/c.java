package k2;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import c2.g;
import c2.n;
import com.google.android.gms.internal.ads.ur0;
import d2.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l2.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements h2.b, d2.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f14649v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f14650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o2.a f14651b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14652d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14653f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f14654h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f14655q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashSet f14656s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h2.c f14657t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f14658u;

    static {
        n.l("SystemFgDispatcher");
    }

    public c(Context context) {
        k kVarS0 = k.s0(context);
        this.f14650a = kVarS0;
        o2.a aVar = kVarS0.f12333f;
        this.f14651b = aVar;
        this.f14653f = null;
        this.f14654h = new LinkedHashMap();
        this.f14656s = new HashSet();
        this.f14655q = new HashMap();
        this.f14657t = new h2.c(context, aVar, this);
        kVarS0.f12335h.b(this);
    }

    public static Intent b(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f1528a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f1529b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f1530c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f1528a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f1529b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f1530c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // d2.a
    public final void a(String str, boolean z9) {
        Map.Entry entry;
        synchronized (this.f14652d) {
            try {
                j jVar = (j) this.f14655q.remove(str);
                if (jVar != null && this.f14656s.remove(jVar)) {
                    this.f14657t.c(this.f14656s);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g gVar = (g) this.f14654h.remove(str);
        int i10 = 0;
        if (str.equals(this.f14653f) && this.f14654h.size() > 0) {
            Iterator it = this.f14654h.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f14653f = (String) entry.getKey();
            if (this.f14658u != null) {
                g gVar2 = (g) entry.getValue();
                b bVar = this.f14658u;
                SystemForegroundService systemForegroundService = (SystemForegroundService) bVar;
                systemForegroundService.f1193b.post(new d(systemForegroundService, gVar2.f1528a, gVar2.f1530c, gVar2.f1529b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f14658u;
                systemForegroundService2.f1193b.post(new e(gVar2.f1528a, i10, systemForegroundService2));
            }
        }
        b bVar2 = this.f14658u;
        if (gVar == null || bVar2 == null) {
            return;
        }
        n nVarI = n.i();
        String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(gVar.f1528a), str, Integer.valueOf(gVar.f1529b));
        nVarI.g(new Throwable[0]);
        SystemForegroundService systemForegroundService3 = (SystemForegroundService) bVar2;
        systemForegroundService3.f1193b.post(new e(gVar.f1528a, i10, systemForegroundService3));
    }

    @Override // h2.b
    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n nVarI = n.i();
            String.format("Constraints unmet for WorkSpec %s", str);
            nVarI.g(new Throwable[0]);
            k kVar = this.f14650a;
            ((ur0) kVar.f12333f).s(new m2.j(kVar, str, true));
        }
    }

    @Override // h2.b
    public final void d(List list) {
    }

    public final void f(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        n nVarI = n.i();
        String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2));
        nVarI.g(new Throwable[0]);
        if (notification == null || this.f14658u == null) {
            return;
        }
        g gVar = new g(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.f14654h;
        linkedHashMap.put(stringExtra, gVar);
        if (TextUtils.isEmpty(this.f14653f)) {
            this.f14653f = stringExtra;
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.f14658u;
            systemForegroundService.f1193b.post(new d(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f14658u;
        systemForegroundService2.f1193b.post(new b.d(systemForegroundService2, intExtra, notification, 8));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= ((g) ((Map.Entry) it.next()).getValue()).f1529b;
        }
        g gVar2 = (g) linkedHashMap.get(this.f14653f);
        if (gVar2 != null) {
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.f14658u;
            systemForegroundService3.f1193b.post(new d(systemForegroundService3, gVar2.f1528a, gVar2.f1530c, i10));
        }
    }

    public final void g() {
        this.f14658u = null;
        synchronized (this.f14652d) {
            this.f14657t.d();
        }
        this.f14650a.f12335h.f(this);
    }
}
