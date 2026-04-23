package f2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c2.n;
import c2.o;
import com.google.android.gms.internal.ads.ur0;
import d2.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l2.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d2.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13055f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f13057b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13058d = new Object();

    static {
        n.l("CommandHandler");
    }

    public b(Context context) {
        this.f13056a = context;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // d2.a
    public final void a(String str, boolean z9) {
        synchronized (this.f13058d) {
            try {
                d2.a aVar = (d2.a) this.f13057b.remove(str);
                if (aVar != null) {
                    aVar.a(str, z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z9;
        synchronized (this.f13058d) {
            z9 = !this.f13057b.isEmpty();
        }
        return z9;
    }

    public final void e(Intent intent, int i10, h hVar) {
        String action = intent.getAction();
        int i11 = 7;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            n nVarI = n.i();
            String.format("Handling constraints changed %s", intent);
            nVarI.g(new Throwable[0]);
            d dVar = new d(this.f13056a, i10, hVar);
            ArrayList<j> arrayListD = hVar.f13081h.f12332e.n().d();
            int i12 = c.f13059a;
            Iterator it = arrayListD.iterator();
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (it.hasNext()) {
                c2.c cVar = ((j) it.next()).f15151j;
                z9 |= cVar.f1518d;
                z10 |= cVar.f1516b;
                z11 |= cVar.f1519e;
                z12 |= cVar.f1515a != o.f1537a;
                if (z9 && z10 && z11 && z12) {
                    break;
                }
            }
            int i13 = ConstraintProxyUpdateReceiver.f1188a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = dVar.f13061a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z9).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z10).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z12);
            context.sendBroadcast(intent2);
            h2.c cVar2 = dVar.f13063c;
            cVar2.c(arrayListD);
            ArrayList arrayList = new ArrayList(arrayListD.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (j jVar : arrayListD) {
                String str = jVar.f15142a;
                if (jCurrentTimeMillis >= jVar.a() && (!jVar.b() || cVar2.a(str))) {
                    arrayList.add(jVar);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str2 = ((j) it2.next()).f15142a;
                Intent intentB = b(context, str2);
                n nVarI2 = n.i();
                String.format("Creating a delay_met command for workSpec with id (%s)", str2);
                int i14 = d.f13060d;
                nVarI2.g(new Throwable[0]);
                hVar.f(new b.d(hVar, intentB, dVar.f13062b, i11));
            }
            cVar2.d();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            n nVarI3 = n.i();
            String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10));
            nVarI3.g(new Throwable[0]);
            hVar.f13081h.v0();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            n nVarI4 = n.i();
            String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID");
            nVarI4.h(new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            n nVarI5 = n.i();
            String.format("Handling schedule work for %s", string);
            nVarI5.g(new Throwable[0]);
            WorkDatabase workDatabase = hVar.f13081h.f12332e;
            workDatabase.c();
            try {
                j jVarH = workDatabase.n().h(string);
                if (jVarH == null) {
                    n.i().n(new Throwable[0]);
                } else if (jVarH.f15143b.a()) {
                    n.i().n(new Throwable[0]);
                } else {
                    long jA = jVarH.a();
                    boolean zB = jVarH.b();
                    Context context2 = this.f13056a;
                    k kVar = hVar.f13081h;
                    if (zB) {
                        n nVarI6 = n.i();
                        String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jA));
                        nVarI6.g(new Throwable[0]);
                        a.b(context2, kVar, string, jA);
                        Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                        hVar.f(new b.d(hVar, intent3, i10, i11));
                    } else {
                        n nVarI7 = n.i();
                        String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jA));
                        nVarI7.g(new Throwable[0]);
                        a.b(context2, kVar, string, jA);
                    }
                    workDatabase.h();
                }
                workDatabase.f();
                return;
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f13058d) {
                try {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    n nVarI8 = n.i();
                    String.format("Handing delay met for %s", string2);
                    nVarI8.g(new Throwable[0]);
                    if (this.f13057b.containsKey(string2)) {
                        n nVarI9 = n.i();
                        String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2);
                        nVarI9.g(new Throwable[0]);
                    } else {
                        e eVar = new e(this.f13056a, i10, string2, hVar);
                        this.f13057b.put(string2, eVar);
                        eVar.e();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                n nVarI10 = n.i();
                String.format("Ignoring intent %s", intent);
                nVarI10.n(new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z13 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            n nVarI11 = n.i();
            String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10));
            nVarI11.g(new Throwable[0]);
            a(string3, z13);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        n nVarI12 = n.i();
        String.format("Handing stopWork work for %s", string4);
        nVarI12.g(new Throwable[0]);
        hVar.f13081h.x0(string4);
        int i15 = a.f13054a;
        ur0 ur0VarK = hVar.f13081h.f12332e.k();
        l2.e eVarF = ur0VarK.F(string4);
        if (eVarF != null) {
            a.a(eVarF.f15133b, this.f13056a, string4);
            n nVarI13 = n.i();
            String.format("Removing SystemIdInfo for workSpecId (%s)", string4);
            nVarI13.g(new Throwable[0]);
            ur0VarK.N(string4);
        }
        hVar.a(string4, false);
    }
}
