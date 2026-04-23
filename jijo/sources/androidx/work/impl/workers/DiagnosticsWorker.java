package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import c2.f;
import c2.m;
import c2.n;
import com.google.android.gms.internal.ads.ur0;
import d2.k;
import g4.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import l2.c;
import l2.e;
import l2.j;
import l2.l;
import n1.p;
import n1.q;
import z3.a;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    static {
        n.l("DiagnosticsWrkr");
    }

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(c cVar, c cVar2, ur0 ur0Var, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            e eVarF = ur0Var.F(jVar.f15142a);
            Integer numValueOf = eVarF != null ? Integer.valueOf(eVarF.f15133b) : null;
            String str = jVar.f15142a;
            cVar.getClass();
            q qVarA = q.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                qVarA.A(1);
            } else {
                qVarA.D(1, str);
            }
            p pVar = cVar.f15128a;
            pVar.b();
            Cursor cursorG = pVar.g(qVarA);
            try {
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList2.add(cursorG.getString(0));
                }
                cursorG.close();
                qVarA.E();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", jVar.f15142a, jVar.f15144c, numValueOf, jVar.f15143b.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", cVar2.c(jVar.f15142a))));
            } catch (Throwable th) {
                cursorG.close();
                qVarA.E();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final m doWork() throws Throwable {
        q qVar;
        int iL;
        int iL2;
        int iL3;
        int iL4;
        int iL5;
        int iL6;
        int iL7;
        int iL8;
        int iL9;
        int iL10;
        int iL11;
        int iL12;
        int iL13;
        int iL14;
        ArrayList arrayList;
        ur0 ur0Var;
        c cVar;
        c cVar2;
        int i10;
        WorkDatabase workDatabase = k.s0(getApplicationContext()).f12332e;
        l lVarN = workDatabase.n();
        c cVarL = workDatabase.l();
        c cVarO = workDatabase.o();
        ur0 ur0VarK = workDatabase.k();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        lVarN.getClass();
        q qVarA = q.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        qVarA.e(1, jCurrentTimeMillis);
        p pVar = (p) lVarN.f15161a;
        pVar.b();
        Cursor cursorG = pVar.g(qVarA);
        try {
            iL = z.l(cursorG, "required_network_type");
            iL2 = z.l(cursorG, "requires_charging");
            iL3 = z.l(cursorG, "requires_device_idle");
            iL4 = z.l(cursorG, "requires_battery_not_low");
            iL5 = z.l(cursorG, "requires_storage_not_low");
            iL6 = z.l(cursorG, "trigger_content_update_delay");
            iL7 = z.l(cursorG, "trigger_max_content_delay");
            iL8 = z.l(cursorG, "content_uri_triggers");
            iL9 = z.l(cursorG, "id");
            iL10 = z.l(cursorG, "state");
            iL11 = z.l(cursorG, "worker_class_name");
            iL12 = z.l(cursorG, "input_merger_class_name");
            iL13 = z.l(cursorG, "input");
            iL14 = z.l(cursorG, "output");
            qVar = qVarA;
        } catch (Throwable th) {
            th = th;
            qVar = qVarA;
        }
        try {
            int iL15 = z.l(cursorG, "initial_delay");
            int iL16 = z.l(cursorG, "interval_duration");
            int iL17 = z.l(cursorG, "flex_duration");
            int iL18 = z.l(cursorG, "run_attempt_count");
            int iL19 = z.l(cursorG, "backoff_policy");
            int iL20 = z.l(cursorG, "backoff_delay_duration");
            int iL21 = z.l(cursorG, "period_start_time");
            int iL22 = z.l(cursorG, "minimum_retention_duration");
            int iL23 = z.l(cursorG, "schedule_requested_at");
            int iL24 = z.l(cursorG, "run_in_foreground");
            int iL25 = z.l(cursorG, "out_of_quota_policy");
            int i11 = iL14;
            ArrayList arrayList2 = new ArrayList(cursorG.getCount());
            while (true) {
                arrayList = arrayList2;
                if (!cursorG.moveToNext()) {
                    break;
                }
                String string = cursorG.getString(iL9);
                String string2 = cursorG.getString(iL11);
                int i12 = iL11;
                c2.c cVar3 = new c2.c();
                int i13 = iL;
                cVar3.f1515a = a.H(cursorG.getInt(iL));
                cVar3.f1516b = cursorG.getInt(iL2) != 0;
                cVar3.f1517c = cursorG.getInt(iL3) != 0;
                cVar3.f1518d = cursorG.getInt(iL4) != 0;
                cVar3.f1519e = cursorG.getInt(iL5) != 0;
                int i14 = iL2;
                int i15 = iL3;
                cVar3.f1520f = cursorG.getLong(iL6);
                cVar3.f1521g = cursorG.getLong(iL7);
                cVar3.f1522h = a.g(cursorG.getBlob(iL8));
                j jVar = new j(string, string2);
                jVar.f15143b = a.J(cursorG.getInt(iL10));
                jVar.f15145d = cursorG.getString(iL12);
                jVar.f15146e = f.a(cursorG.getBlob(iL13));
                int i16 = i11;
                jVar.f15147f = f.a(cursorG.getBlob(i16));
                i11 = i16;
                int i17 = iL12;
                int i18 = iL15;
                jVar.f15148g = cursorG.getLong(i18);
                int i19 = iL13;
                int i20 = iL16;
                jVar.f15149h = cursorG.getLong(i20);
                int i21 = iL10;
                int i22 = iL17;
                jVar.f15150i = cursorG.getLong(i22);
                int i23 = iL18;
                jVar.f15152k = cursorG.getInt(i23);
                int i24 = iL19;
                jVar.f15153l = a.G(cursorG.getInt(i24));
                iL17 = i22;
                int i25 = iL20;
                jVar.f15154m = cursorG.getLong(i25);
                int i26 = iL21;
                jVar.f15155n = cursorG.getLong(i26);
                iL21 = i26;
                int i27 = iL22;
                jVar.f15156o = cursorG.getLong(i27);
                int i28 = iL23;
                jVar.f15157p = cursorG.getLong(i28);
                int i29 = iL24;
                jVar.f15158q = cursorG.getInt(i29) != 0;
                int i30 = iL25;
                jVar.f15159r = a.I(cursorG.getInt(i30));
                jVar.f15151j = cVar3;
                arrayList.add(jVar);
                iL25 = i30;
                iL13 = i19;
                iL2 = i14;
                iL16 = i20;
                iL18 = i23;
                iL23 = i28;
                iL24 = i29;
                iL22 = i27;
                iL15 = i18;
                iL12 = i17;
                iL3 = i15;
                iL = i13;
                arrayList2 = arrayList;
                iL11 = i12;
                iL20 = i25;
                iL10 = i21;
                iL19 = i24;
            }
            cursorG.close();
            qVar.E();
            ArrayList arrayListC = lVarN.c();
            ArrayList arrayListA = lVarN.a();
            if (arrayList.isEmpty()) {
                ur0Var = ur0VarK;
                cVar = cVarL;
                cVar2 = cVarO;
                i10 = 0;
            } else {
                i10 = 0;
                n.i().j(new Throwable[0]);
                n nVarI = n.i();
                ur0Var = ur0VarK;
                cVar = cVarL;
                cVar2 = cVarO;
                a(cVar, cVar2, ur0Var, arrayList);
                nVarI.j(new Throwable[0]);
            }
            if (!arrayListC.isEmpty()) {
                n.i().j(new Throwable[i10]);
                n nVarI2 = n.i();
                a(cVar, cVar2, ur0Var, arrayListC);
                nVarI2.j(new Throwable[i10]);
            }
            if (!arrayListA.isEmpty()) {
                n.i().j(new Throwable[i10]);
                n nVarI3 = n.i();
                a(cVar, cVar2, ur0Var, arrayListA);
                nVarI3.j(new Throwable[i10]);
            }
            return new c2.l(f.f1526b);
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            qVar.E();
            throw th;
        }
    }
}
