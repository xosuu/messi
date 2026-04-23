package f2;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c2.n;
import l2.j;

/* JADX INFO: loaded from: classes.dex */
public final class i implements d2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13087a;

    static {
        n.l("SystemAlarmScheduler");
    }

    public i(Context context) {
        this.f13087a = context.getApplicationContext();
    }

    @Override // d2.c
    public final void b(String str) {
        int i10 = b.f13055f;
        Context context = this.f13087a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(intent);
    }

    @Override // d2.c
    public final void e(j... jVarArr) {
        for (j jVar : jVarArr) {
            n nVarI = n.i();
            String.format("Scheduling work with workSpecId %s", jVar.f15142a);
            nVarI.g(new Throwable[0]);
            String str = jVar.f15142a;
            Context context = this.f13087a;
            context.startService(b.c(context, str));
        }
    }

    @Override // d2.c
    public final boolean f() {
        return true;
    }
}
