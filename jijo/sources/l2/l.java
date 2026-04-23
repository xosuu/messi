package l2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import c2.w;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.cq0;
import com.google.android.gms.internal.ads.ft0;
import com.google.android.gms.internal.ads.fz;
import com.google.android.gms.internal.ads.gt0;
import com.google.android.gms.internal.ads.i10;
import com.google.android.gms.internal.ads.m20;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.or0;
import com.google.android.gms.internal.ads.p80;
import com.google.android.gms.internal.ads.qq0;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.s50;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.ads.u60;
import com.google.android.gms.internal.ads.w30;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.xs0;
import com.google.android.gms.internal.ads.z30;
import com.google.android.gms.internal.ads.zy;
import g4.z;
import java.util.ArrayList;
import n1.p;
import n1.q;
import n1.s;

/* JADX INFO: loaded from: classes.dex */
public final class l implements w30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15162b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15163d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f15164f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f15165h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f15166q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f15167s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f15168t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f15169u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f15170v;

    public final ArrayList a() throws Throwable {
        q qVar;
        q qVarA = q.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        qVarA.e(1, 200);
        p pVar = (p) this.f15161a;
        pVar.b();
        Cursor cursorG = pVar.g(qVarA);
        try {
            int iL = z.l(cursorG, "required_network_type");
            int iL2 = z.l(cursorG, "requires_charging");
            int iL3 = z.l(cursorG, "requires_device_idle");
            int iL4 = z.l(cursorG, "requires_battery_not_low");
            int iL5 = z.l(cursorG, "requires_storage_not_low");
            int iL6 = z.l(cursorG, "trigger_content_update_delay");
            int iL7 = z.l(cursorG, "trigger_max_content_delay");
            int iL8 = z.l(cursorG, "content_uri_triggers");
            int iL9 = z.l(cursorG, "id");
            int iL10 = z.l(cursorG, "state");
            int iL11 = z.l(cursorG, "worker_class_name");
            int iL12 = z.l(cursorG, "input_merger_class_name");
            int iL13 = z.l(cursorG, "input");
            int iL14 = z.l(cursorG, "output");
            qVar = qVarA;
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
                int i10 = iL14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iL9);
                    int i11 = iL9;
                    String string2 = cursorG.getString(iL11);
                    int i12 = iL11;
                    c2.c cVar = new c2.c();
                    int i13 = iL;
                    cVar.f1515a = z3.a.H(cursorG.getInt(iL));
                    cVar.f1516b = cursorG.getInt(iL2) != 0;
                    cVar.f1517c = cursorG.getInt(iL3) != 0;
                    cVar.f1518d = cursorG.getInt(iL4) != 0;
                    cVar.f1519e = cursorG.getInt(iL5) != 0;
                    int i14 = iL2;
                    int i15 = iL3;
                    cVar.f1520f = cursorG.getLong(iL6);
                    cVar.f1521g = cursorG.getLong(iL7);
                    cVar.f1522h = z3.a.g(cursorG.getBlob(iL8));
                    j jVar = new j(string, string2);
                    jVar.f15143b = z3.a.J(cursorG.getInt(iL10));
                    jVar.f15145d = cursorG.getString(iL12);
                    jVar.f15146e = c2.f.a(cursorG.getBlob(iL13));
                    int i16 = i10;
                    jVar.f15147f = c2.f.a(cursorG.getBlob(i16));
                    int i17 = iL13;
                    int i18 = iL15;
                    jVar.f15148g = cursorG.getLong(i18);
                    int i19 = iL4;
                    int i20 = iL16;
                    jVar.f15149h = cursorG.getLong(i20);
                    int i21 = iL17;
                    jVar.f15150i = cursorG.getLong(i21);
                    int i22 = iL18;
                    jVar.f15152k = cursorG.getInt(i22);
                    int i23 = iL19;
                    jVar.f15153l = z3.a.G(cursorG.getInt(i23));
                    int i24 = iL20;
                    jVar.f15154m = cursorG.getLong(i24);
                    int i25 = iL21;
                    jVar.f15155n = cursorG.getLong(i25);
                    int i26 = iL22;
                    jVar.f15156o = cursorG.getLong(i26);
                    int i27 = iL23;
                    jVar.f15157p = cursorG.getLong(i27);
                    int i28 = iL24;
                    jVar.f15158q = cursorG.getInt(i28) != 0;
                    int i29 = iL25;
                    jVar.f15159r = z3.a.I(cursorG.getInt(i29));
                    jVar.f15151j = cVar;
                    arrayList.add(jVar);
                    i10 = i16;
                    iL2 = i14;
                    iL15 = i18;
                    iL16 = i20;
                    iL20 = i24;
                    iL21 = i25;
                    iL24 = i28;
                    iL11 = i12;
                    iL = i13;
                    iL25 = i29;
                    iL23 = i27;
                    iL13 = i17;
                    iL9 = i11;
                    iL3 = i15;
                    iL22 = i26;
                    iL4 = i19;
                    iL17 = i21;
                    iL18 = i22;
                    iL19 = i23;
                }
                cursorG.close();
                qVar.E();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                qVar.E();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            qVar = qVarA;
        }
    }

    public final ArrayList b(int i10) throws Throwable {
        q qVar;
        q qVarA = q.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        qVarA.e(1, i10);
        p pVar = (p) this.f15161a;
        pVar.b();
        Cursor cursorG = pVar.g(qVarA);
        try {
            int iL = z.l(cursorG, "required_network_type");
            int iL2 = z.l(cursorG, "requires_charging");
            int iL3 = z.l(cursorG, "requires_device_idle");
            int iL4 = z.l(cursorG, "requires_battery_not_low");
            int iL5 = z.l(cursorG, "requires_storage_not_low");
            int iL6 = z.l(cursorG, "trigger_content_update_delay");
            int iL7 = z.l(cursorG, "trigger_max_content_delay");
            int iL8 = z.l(cursorG, "content_uri_triggers");
            int iL9 = z.l(cursorG, "id");
            int iL10 = z.l(cursorG, "state");
            int iL11 = z.l(cursorG, "worker_class_name");
            int iL12 = z.l(cursorG, "input_merger_class_name");
            int iL13 = z.l(cursorG, "input");
            int iL14 = z.l(cursorG, "output");
            qVar = qVarA;
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
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iL9);
                    int i12 = iL9;
                    String string2 = cursorG.getString(iL11);
                    int i13 = iL11;
                    c2.c cVar = new c2.c();
                    int i14 = iL;
                    cVar.f1515a = z3.a.H(cursorG.getInt(iL));
                    cVar.f1516b = cursorG.getInt(iL2) != 0;
                    cVar.f1517c = cursorG.getInt(iL3) != 0;
                    cVar.f1518d = cursorG.getInt(iL4) != 0;
                    cVar.f1519e = cursorG.getInt(iL5) != 0;
                    int i15 = iL2;
                    int i16 = iL3;
                    cVar.f1520f = cursorG.getLong(iL6);
                    cVar.f1521g = cursorG.getLong(iL7);
                    cVar.f1522h = z3.a.g(cursorG.getBlob(iL8));
                    j jVar = new j(string, string2);
                    jVar.f15143b = z3.a.J(cursorG.getInt(iL10));
                    jVar.f15145d = cursorG.getString(iL12);
                    jVar.f15146e = c2.f.a(cursorG.getBlob(iL13));
                    int i17 = i11;
                    jVar.f15147f = c2.f.a(cursorG.getBlob(i17));
                    int i18 = iL15;
                    int i19 = iL13;
                    jVar.f15148g = cursorG.getLong(i18);
                    int i20 = iL4;
                    int i21 = iL16;
                    jVar.f15149h = cursorG.getLong(i21);
                    int i22 = iL17;
                    jVar.f15150i = cursorG.getLong(i22);
                    int i23 = iL18;
                    jVar.f15152k = cursorG.getInt(i23);
                    int i24 = iL19;
                    jVar.f15153l = z3.a.G(cursorG.getInt(i24));
                    int i25 = iL20;
                    jVar.f15154m = cursorG.getLong(i25);
                    int i26 = iL21;
                    jVar.f15155n = cursorG.getLong(i26);
                    int i27 = iL22;
                    jVar.f15156o = cursorG.getLong(i27);
                    int i28 = iL23;
                    jVar.f15157p = cursorG.getLong(i28);
                    int i29 = iL24;
                    jVar.f15158q = cursorG.getInt(i29) != 0;
                    int i30 = iL25;
                    jVar.f15159r = z3.a.I(cursorG.getInt(i30));
                    jVar.f15151j = cVar;
                    arrayList.add(jVar);
                    i11 = i17;
                    iL2 = i15;
                    iL24 = i29;
                    iL9 = i12;
                    iL11 = i13;
                    iL = i14;
                    iL25 = i30;
                    iL13 = i19;
                    iL15 = i18;
                    iL16 = i21;
                    iL20 = i25;
                    iL21 = i26;
                    iL23 = i28;
                    iL3 = i16;
                    iL22 = i27;
                    iL4 = i20;
                    iL17 = i22;
                    iL18 = i23;
                    iL19 = i24;
                }
                cursorG.close();
                qVar.E();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                qVar.E();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            qVar = qVarA;
        }
    }

    public final ArrayList c() throws Throwable {
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
        q qVarA = q.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        p pVar = (p) this.f15161a;
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
            int i10 = iL14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iL9);
                int i11 = iL9;
                String string2 = cursorG.getString(iL11);
                int i12 = iL11;
                c2.c cVar = new c2.c();
                int i13 = iL;
                cVar.f1515a = z3.a.H(cursorG.getInt(iL));
                cVar.f1516b = cursorG.getInt(iL2) != 0;
                cVar.f1517c = cursorG.getInt(iL3) != 0;
                cVar.f1518d = cursorG.getInt(iL4) != 0;
                cVar.f1519e = cursorG.getInt(iL5) != 0;
                int i14 = iL2;
                int i15 = iL3;
                cVar.f1520f = cursorG.getLong(iL6);
                cVar.f1521g = cursorG.getLong(iL7);
                cVar.f1522h = z3.a.g(cursorG.getBlob(iL8));
                j jVar = new j(string, string2);
                jVar.f15143b = z3.a.J(cursorG.getInt(iL10));
                jVar.f15145d = cursorG.getString(iL12);
                jVar.f15146e = c2.f.a(cursorG.getBlob(iL13));
                int i16 = i10;
                jVar.f15147f = c2.f.a(cursorG.getBlob(i16));
                int i17 = iL13;
                int i18 = iL15;
                jVar.f15148g = cursorG.getLong(i18);
                int i19 = iL4;
                int i20 = iL16;
                jVar.f15149h = cursorG.getLong(i20);
                int i21 = iL17;
                jVar.f15150i = cursorG.getLong(i21);
                int i22 = iL18;
                jVar.f15152k = cursorG.getInt(i22);
                int i23 = iL19;
                jVar.f15153l = z3.a.G(cursorG.getInt(i23));
                int i24 = iL20;
                jVar.f15154m = cursorG.getLong(i24);
                int i25 = iL21;
                jVar.f15155n = cursorG.getLong(i25);
                int i26 = iL22;
                jVar.f15156o = cursorG.getLong(i26);
                int i27 = iL23;
                jVar.f15157p = cursorG.getLong(i27);
                int i28 = iL24;
                jVar.f15158q = cursorG.getInt(i28) != 0;
                int i29 = iL25;
                jVar.f15159r = z3.a.I(cursorG.getInt(i29));
                jVar.f15151j = cVar;
                arrayList.add(jVar);
                i10 = i16;
                iL2 = i14;
                iL15 = i18;
                iL16 = i20;
                iL20 = i24;
                iL21 = i25;
                iL24 = i28;
                iL11 = i12;
                iL = i13;
                iL25 = i29;
                iL23 = i27;
                iL13 = i17;
                iL9 = i11;
                iL3 = i15;
                iL22 = i26;
                iL4 = i19;
                iL17 = i21;
                iL18 = i22;
                iL19 = i23;
            }
            cursorG.close();
            qVar.E();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            qVar.E();
            throw th;
        }
    }

    public final ArrayList d() {
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
        q qVarA = q.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        p pVar = (p) this.f15161a;
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
            int i10 = iL14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iL9);
                int i11 = iL9;
                String string2 = cursorG.getString(iL11);
                int i12 = iL11;
                c2.c cVar = new c2.c();
                int i13 = iL;
                cVar.f1515a = z3.a.H(cursorG.getInt(iL));
                cVar.f1516b = cursorG.getInt(iL2) != 0;
                cVar.f1517c = cursorG.getInt(iL3) != 0;
                cVar.f1518d = cursorG.getInt(iL4) != 0;
                cVar.f1519e = cursorG.getInt(iL5) != 0;
                int i14 = iL2;
                int i15 = iL3;
                cVar.f1520f = cursorG.getLong(iL6);
                cVar.f1521g = cursorG.getLong(iL7);
                cVar.f1522h = z3.a.g(cursorG.getBlob(iL8));
                j jVar = new j(string, string2);
                jVar.f15143b = z3.a.J(cursorG.getInt(iL10));
                jVar.f15145d = cursorG.getString(iL12);
                jVar.f15146e = c2.f.a(cursorG.getBlob(iL13));
                int i16 = i10;
                jVar.f15147f = c2.f.a(cursorG.getBlob(i16));
                int i17 = iL13;
                int i18 = iL15;
                jVar.f15148g = cursorG.getLong(i18);
                int i19 = iL4;
                int i20 = iL16;
                jVar.f15149h = cursorG.getLong(i20);
                int i21 = iL17;
                jVar.f15150i = cursorG.getLong(i21);
                int i22 = iL18;
                jVar.f15152k = cursorG.getInt(i22);
                int i23 = iL19;
                jVar.f15153l = z3.a.G(cursorG.getInt(i23));
                int i24 = iL20;
                jVar.f15154m = cursorG.getLong(i24);
                int i25 = iL21;
                jVar.f15155n = cursorG.getLong(i25);
                int i26 = iL22;
                jVar.f15156o = cursorG.getLong(i26);
                int i27 = iL23;
                jVar.f15157p = cursorG.getLong(i27);
                int i28 = iL24;
                jVar.f15158q = cursorG.getInt(i28) != 0;
                int i29 = iL25;
                jVar.f15159r = z3.a.I(cursorG.getInt(i29));
                jVar.f15151j = cVar;
                arrayList.add(jVar);
                i10 = i16;
                iL2 = i14;
                iL15 = i18;
                iL16 = i20;
                iL20 = i24;
                iL21 = i25;
                iL24 = i28;
                iL11 = i12;
                iL = i13;
                iL25 = i29;
                iL23 = i27;
                iL13 = i17;
                iL9 = i11;
                iL3 = i15;
                iL22 = i26;
                iL4 = i19;
                iL17 = i21;
                iL18 = i22;
                iL19 = i23;
            }
            cursorG.close();
            qVar.E();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            qVar.E();
            throw th;
        }
    }

    public final w e(String str) {
        q qVarA = q.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            qVarA.A(1);
        } else {
            qVarA.D(1, str);
        }
        p pVar = (p) this.f15161a;
        pVar.b();
        Cursor cursorG = pVar.g(qVarA);
        try {
            return cursorG.moveToFirst() ? z3.a.J(cursorG.getInt(0)) : null;
        } finally {
            cursorG.close();
            qVarA.E();
        }
    }

    public final ArrayList f(String str) {
        q qVarA = q.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            qVarA.A(1);
        } else {
            qVarA.D(1, str);
        }
        p pVar = (p) this.f15161a;
        pVar.b();
        Cursor cursorG = pVar.g(qVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            qVarA.E();
        }
    }

    public final ArrayList g(String str) {
        q qVarA = q.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            qVarA.A(1);
        } else {
            qVarA.D(1, str);
        }
        p pVar = (p) this.f15161a;
        pVar.b();
        Cursor cursorG = pVar.g(qVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            qVarA.E();
        }
    }

    public final j h(String str) {
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
        j jVar;
        q qVarA = q.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            qVarA.A(1);
        } else {
            qVarA.D(1, str);
        }
        p pVar = (p) this.f15161a;
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
            if (cursorG.moveToFirst()) {
                String string = cursorG.getString(iL9);
                String string2 = cursorG.getString(iL11);
                c2.c cVar = new c2.c();
                cVar.f1515a = z3.a.H(cursorG.getInt(iL));
                cVar.f1516b = cursorG.getInt(iL2) != 0;
                cVar.f1517c = cursorG.getInt(iL3) != 0;
                cVar.f1518d = cursorG.getInt(iL4) != 0;
                cVar.f1519e = cursorG.getInt(iL5) != 0;
                cVar.f1520f = cursorG.getLong(iL6);
                cVar.f1521g = cursorG.getLong(iL7);
                cVar.f1522h = z3.a.g(cursorG.getBlob(iL8));
                jVar = new j(string, string2);
                jVar.f15143b = z3.a.J(cursorG.getInt(iL10));
                jVar.f15145d = cursorG.getString(iL12);
                jVar.f15146e = c2.f.a(cursorG.getBlob(iL13));
                jVar.f15147f = c2.f.a(cursorG.getBlob(iL14));
                jVar.f15148g = cursorG.getLong(iL15);
                jVar.f15149h = cursorG.getLong(iL16);
                jVar.f15150i = cursorG.getLong(iL17);
                jVar.f15152k = cursorG.getInt(iL18);
                jVar.f15153l = z3.a.G(cursorG.getInt(iL19));
                jVar.f15154m = cursorG.getLong(iL20);
                jVar.f15155n = cursorG.getLong(iL21);
                jVar.f15156o = cursorG.getLong(iL22);
                jVar.f15157p = cursorG.getLong(iL23);
                jVar.f15158q = cursorG.getInt(iL24) != 0;
                jVar.f15159r = z3.a.I(cursorG.getInt(iL25));
                jVar.f15151j = cVar;
            } else {
                jVar = null;
            }
            cursorG.close();
            qVar.E();
            return jVar;
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            qVar.E();
            throw th;
        }
    }

    public final boolean i() {
        boolean z9 = false;
        q qVarA = q.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        p pVar = (p) this.f15161a;
        pVar.b();
        Cursor cursorG = pVar.g(qVarA);
        try {
            if (cursorG.moveToFirst()) {
                if (cursorG.getInt(0) != 0) {
                    z9 = true;
                }
            }
            return z9;
        } finally {
            cursorG.close();
            qVarA.E();
        }
    }

    public final void j(String str) {
        Object obj = this.f15161a;
        p pVar = (p) obj;
        pVar.b();
        s1.g gVarA = ((s) this.f15166q).a();
        if (str == null) {
            gVarA.u(1);
        } else {
            gVarA.A(1, str);
        }
        pVar.c();
        try {
            gVarA.f16678b.executeUpdateDelete();
            ((p) obj).h();
        } finally {
            pVar.f();
            ((s) this.f15166q).c(gVarA);
        }
    }

    public final void k(long j10, String str) {
        Object obj = this.f15161a;
        p pVar = (p) obj;
        pVar.b();
        s1.g gVarA = ((s) this.f15168t).a();
        gVarA.e(1, j10);
        if (str == null) {
            gVarA.u(2);
        } else {
            gVarA.A(2, str);
        }
        pVar.c();
        try {
            gVarA.f16678b.executeUpdateDelete();
            ((p) obj).h();
        } finally {
            pVar.f();
            ((s) this.f15168t).c(gVarA);
        }
    }

    public final void l(String str) {
        Object obj = this.f15161a;
        p pVar = (p) obj;
        pVar.b();
        s1.g gVarA = ((s) this.f15167s).a();
        if (str == null) {
            gVarA.u(1);
        } else {
            gVarA.A(1, str);
        }
        pVar.c();
        try {
            gVarA.f16678b.executeUpdateDelete();
            ((p) obj).h();
        } finally {
            pVar.f();
            ((s) this.f15167s).c(gVarA);
        }
    }

    public final void m(String str, c2.f fVar) throws Throwable {
        Object obj = this.f15161a;
        p pVar = (p) obj;
        pVar.b();
        s1.g gVarA = ((s) this.f15164f).a();
        byte[] bArrC = c2.f.c(fVar);
        if (bArrC == null) {
            gVarA.u(1);
        } else {
            gVarA.a(bArrC, 1);
        }
        if (str == null) {
            gVarA.u(2);
        } else {
            gVarA.A(2, str);
        }
        pVar.c();
        try {
            gVarA.D();
            ((p) obj).h();
        } finally {
            pVar.f();
            ((s) this.f15164f).c(gVarA);
        }
    }

    public final void n(long j10, String str) {
        Object obj = this.f15161a;
        p pVar = (p) obj;
        pVar.b();
        s1.g gVarA = ((s) this.f15165h).a();
        gVarA.e(1, j10);
        if (str == null) {
            gVarA.u(2);
        } else {
            gVarA.A(2, str);
        }
        pVar.c();
        try {
            gVarA.D();
            ((p) obj).h();
        } finally {
            pVar.f();
            ((s) this.f15165h).c(gVarA);
        }
    }

    public final void o(w wVar, String... strArr) {
        Object obj = this.f15161a;
        p pVar = (p) obj;
        pVar.b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb.append("?");
            if (i10 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String string = sb.toString();
        pVar.a();
        pVar.b();
        SQLiteStatement sQLiteStatementCompileStatement = ((s1.b) pVar.f15865c.y()).f16664a.compileStatement(string);
        sQLiteStatementCompileStatement.bindLong(1, z3.a.W(wVar));
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                sQLiteStatementCompileStatement.bindNull(i11);
            } else {
                sQLiteStatementCompileStatement.bindString(i11, str);
            }
            i11++;
        }
        pVar.c();
        try {
            sQLiteStatementCompileStatement.executeUpdateDelete();
            ((p) obj).h();
        } finally {
            pVar.f();
        }
    }

    public final fz p() {
        tp1.h0((u60) this.f15164f, u60.class);
        tp1.h0((z30) this.f15165h, z30.class);
        tp1.h0((rk0) this.f15166q, rk0.class);
        tp1.h0((m20) this.f15167s, m20.class);
        if (((i10) this.f15168t) == null) {
            this.f15168t = new i10();
        }
        tp1.h0((i10) this.f15169u, i10.class);
        tp1.h0((p80) this.f15170v, p80.class);
        return new fz((zy) this.f15161a, (i10) this.f15169u, (p80) this.f15170v, (u60) this.f15164f, (z30) this.f15165h, (i10) this.f15168t, (rk0) this.f15166q, (m20) this.f15167s, (qq0) this.f15162b, (cq0) this.f15163d);
    }

    public l(s50 s50Var, xq xqVar, xs0 xs0Var, or0 or0Var, VersionInfoParcel versionInfoParcel, gt0 gt0Var, ft0 ft0Var, Context context, mu muVar) {
        this.f15161a = s50Var;
        this.f15162b = xqVar;
        this.f15163d = xs0Var;
        this.f15164f = or0Var;
        this.f15165h = versionInfoParcel;
        this.f15166q = gt0Var;
        this.f15167s = ft0Var;
        this.f15168t = context;
        this.f15169u = muVar;
    }

    public l(p pVar) {
        this.f15161a = pVar;
        this.f15162b = new b(this, pVar, 5);
        this.f15163d = new k(pVar, 0);
        this.f15164f = new k(pVar, 1);
        this.f15165h = new k(pVar, 2);
        this.f15166q = new k(pVar, 3);
        this.f15167s = new k(pVar, 4);
        this.f15168t = new k(pVar, 5);
        this.f15169u = new k(pVar, 6);
        this.f15170v = new k(pVar, 7);
    }
}
