package com.google.android.gms.internal.ads;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Base64OutputStream;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class gp0 implements k21, k4.a, qe0, nn1, p0.t, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5025b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5026d;

    public gp0(int i10, int i11) {
        this.f5024a = i11;
        if (i11 == 6) {
            this.f5026d = new long[32];
        } else {
            this.f5026d = new jc();
            this.f5025b = i10;
        }
    }

    public static void h(s1.b bVar) {
        bVar.e("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.e("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.e("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.e("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        bVar.e("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.e("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        bVar.e("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.e("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.e("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.e("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.e("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.e("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.e("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.e("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.e("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static f.x0 k(s1.b bVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new p1.b(1, 1, "work_spec_id", "TEXT", null, true));
        map.put("prerequisite_id", new p1.b(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new p1.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new p1.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new p1.e("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), false));
        hashSet2.add(new p1.e("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), false));
        p1.f fVar = new p1.f("Dependency", map, hashSet, hashSet2);
        p1.f fVarA = p1.f.a(bVar, "Dependency");
        if (!fVar.equals(fVarA)) {
            return new f.x0("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + fVarA, false);
        }
        HashMap map2 = new HashMap(25);
        map2.put("id", new p1.b(1, 1, "id", "TEXT", null, true));
        map2.put("state", new p1.b(0, 1, "state", "INTEGER", null, true));
        map2.put("worker_class_name", new p1.b(0, 1, "worker_class_name", "TEXT", null, true));
        map2.put("input_merger_class_name", new p1.b(0, 1, "input_merger_class_name", "TEXT", null, false));
        map2.put("input", new p1.b(0, 1, "input", "BLOB", null, true));
        map2.put("output", new p1.b(0, 1, "output", "BLOB", null, true));
        map2.put("initial_delay", new p1.b(0, 1, "initial_delay", "INTEGER", null, true));
        map2.put("interval_duration", new p1.b(0, 1, "interval_duration", "INTEGER", null, true));
        map2.put("flex_duration", new p1.b(0, 1, "flex_duration", "INTEGER", null, true));
        map2.put("run_attempt_count", new p1.b(0, 1, "run_attempt_count", "INTEGER", null, true));
        map2.put("backoff_policy", new p1.b(0, 1, "backoff_policy", "INTEGER", null, true));
        map2.put("backoff_delay_duration", new p1.b(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        map2.put("period_start_time", new p1.b(0, 1, "period_start_time", "INTEGER", null, true));
        map2.put("minimum_retention_duration", new p1.b(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        map2.put("schedule_requested_at", new p1.b(0, 1, "schedule_requested_at", "INTEGER", null, true));
        map2.put("run_in_foreground", new p1.b(0, 1, "run_in_foreground", "INTEGER", null, true));
        map2.put("out_of_quota_policy", new p1.b(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        map2.put("required_network_type", new p1.b(0, 1, "required_network_type", "INTEGER", null, false));
        map2.put("requires_charging", new p1.b(0, 1, "requires_charging", "INTEGER", null, true));
        map2.put("requires_device_idle", new p1.b(0, 1, "requires_device_idle", "INTEGER", null, true));
        map2.put("requires_battery_not_low", new p1.b(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        map2.put("requires_storage_not_low", new p1.b(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        map2.put("trigger_content_update_delay", new p1.b(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        map2.put("trigger_max_content_delay", new p1.b(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        map2.put("content_uri_triggers", new p1.b(0, 1, "content_uri_triggers", "BLOB", null, false));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new p1.e("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), false));
        hashSet4.add(new p1.e("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), false));
        p1.f fVar2 = new p1.f("WorkSpec", map2, hashSet3, hashSet4);
        p1.f fVarA2 = p1.f.a(bVar, "WorkSpec");
        if (!fVar2.equals(fVarA2)) {
            return new f.x0("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + fVarA2, false);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new p1.b(1, 1, "tag", "TEXT", null, true));
        map3.put("work_spec_id", new p1.b(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new p1.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new p1.e("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), false));
        p1.f fVar3 = new p1.f("WorkTag", map3, hashSet5, hashSet6);
        p1.f fVarA3 = p1.f.a(bVar, "WorkTag");
        if (!fVar3.equals(fVarA3)) {
            return new f.x0("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + fVarA3, false);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new p1.b(1, 1, "work_spec_id", "TEXT", null, true));
        map4.put("system_id", new p1.b(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new p1.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        p1.f fVar4 = new p1.f("SystemIdInfo", map4, hashSet7, new HashSet(0));
        p1.f fVarA4 = p1.f.a(bVar, "SystemIdInfo");
        if (!fVar4.equals(fVarA4)) {
            return new f.x0("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + fVarA4, false);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new p1.b(1, 1, "name", "TEXT", null, true));
        map5.put("work_spec_id", new p1.b(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new p1.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new p1.e("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), false));
        p1.f fVar5 = new p1.f("WorkName", map5, hashSet8, hashSet9);
        p1.f fVarA5 = p1.f.a(bVar, "WorkName");
        if (!fVar5.equals(fVarA5)) {
            return new f.x0("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + fVarA5, false);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new p1.b(1, 1, "work_spec_id", "TEXT", null, true));
        map6.put(NotificationCompat.CATEGORY_PROGRESS, new p1.b(0, 1, NotificationCompat.CATEGORY_PROGRESS, "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new p1.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        p1.f fVar6 = new p1.f("WorkProgress", map6, hashSet10, new HashSet(0));
        p1.f fVarA6 = p1.f.a(bVar, "WorkProgress");
        if (!fVar6.equals(fVarA6)) {
            return new f.x0("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + fVarA6, false);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new p1.b(1, 1, "key", "TEXT", null, true));
        map7.put("long_value", new p1.b(0, 1, "long_value", "INTEGER", null, false));
        p1.f fVar7 = new p1.f("Preference", map7, new HashSet(0), new HashSet(0));
        p1.f fVarA7 = p1.f.a(bVar, "Preference");
        if (fVar7.equals(fVarA7)) {
            return new f.x0((String) null, true);
        }
        return new f.x0("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + fVarA7, false);
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        zzu.zzo().i("BufferingUrlPinger.attributionReportingManager", th);
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4a(Object obj) {
        int i10 = this.f5025b;
        ((qr0) this.f5026d).b(i10, (String) obj);
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // j9.a
    public final void d() {
    }

    public final f.n e() {
        f.n nVar = new f.n(((f.j) this.f5026d).f12851a, this.f5025b);
        f.j jVar = (f.j) this.f5026d;
        View view = jVar.f12856f;
        int i10 = 0;
        f.m mVar = nVar.f12945h;
        if (view != null) {
            mVar.C = view;
        } else {
            CharSequence charSequence = jVar.f12855e;
            if (charSequence != null) {
                mVar.f12921e = charSequence;
                TextView textView = mVar.A;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = jVar.f12854d;
            if (drawable != null) {
                mVar.f12941y = drawable;
                mVar.f12940x = 0;
                ImageView imageView = mVar.f12942z;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    mVar.f12942z.setImageDrawable(drawable);
                }
            }
            int i11 = jVar.f12853c;
            if (i11 != 0) {
                mVar.f12941y = null;
                mVar.f12940x = i11;
                ImageView imageView2 = mVar.f12942z;
                if (imageView2 != null) {
                    if (i11 != 0) {
                        imageView2.setVisibility(0);
                        mVar.f12942z.setImageResource(mVar.f12940x);
                    } else {
                        imageView2.setVisibility(8);
                    }
                }
            }
        }
        CharSequence charSequence2 = jVar.f12857g;
        if (charSequence2 != null) {
            mVar.f12922f = charSequence2;
            TextView textView2 = mVar.B;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = jVar.f12858h;
        if (charSequence3 != null) {
            mVar.d(-1, charSequence3, jVar.f12859i);
        }
        CharSequence charSequence4 = jVar.f12860j;
        if (charSequence4 != null) {
            mVar.d(-2, charSequence4, jVar.f12861k);
        }
        if (jVar.f12865o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) jVar.f12852b.inflate(mVar.G, (ViewGroup) null);
            int i12 = jVar.f12868r ? mVar.H : mVar.I;
            ListAdapter lVar = jVar.f12865o;
            if (lVar == null) {
                lVar = new f.l(jVar.f12851a, i12, R.id.text1, null);
            }
            mVar.D = lVar;
            mVar.E = jVar.f12869s;
            if (jVar.f12866p != null) {
                alertController$RecycleListView.setOnItemClickListener(new f.i(jVar, i10, mVar));
            }
            if (jVar.f12868r) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            mVar.f12923g = alertController$RecycleListView;
        }
        View view2 = jVar.f12867q;
        if (view2 != null) {
            mVar.f12924h = view2;
            mVar.f12925i = 0;
            mVar.f12926j = false;
        }
        nVar.setCancelable(((f.j) this.f5026d).f12862l);
        if (((f.j) this.f5026d).f12862l) {
            nVar.setCanceledOnTouchOutside(true);
        }
        ((f.j) this.f5026d).getClass();
        nVar.setOnCancelListener(null);
        nVar.setOnDismissListener(((f.j) this.f5026d).f12863m);
        DialogInterface.OnKeyListener onKeyListener = ((f.j) this.f5026d).f12864n;
        if (onKeyListener != null) {
            nVar.setOnKeyListener(onKeyListener);
        }
        return nVar;
    }

    @Override // p0.t
    public final boolean f(View view) {
        ((BottomSheetBehavior) this.f5026d).A(this.f5025b);
        return true;
    }

    @Override // j9.a
    public final void g() {
        Object obj = this.f5026d;
        ((j6.y) obj).f14439s = false;
        System.currentTimeMillis();
        ((j6.y) obj).getClass();
        ((j6.y) this.f5026d).b("hold release\n");
        ((j6.y) this.f5026d).b("bytecount 2\n");
        ((j6.y) this.f5026d).b("state on\n");
        try {
            Thread.sleep(this.f5025b * 1000);
        } catch (InterruptedException unused) {
        }
    }

    @Override // k4.a
    public final Object i(k4.l lVar) {
        if (!lVar.d()) {
            return Boolean.FALSE;
        }
        int i10 = this.f5025b;
        e8 e8Var = (e8) this.f5026d;
        xv0 xv0Var = (xv0) lVar.b();
        byte[] bArrD = ((i8) e8Var.b()).d();
        xv0Var.getClass();
        androidx.activity.result.h hVar = new androidx.activity.result.h();
        hVar.f201f = xv0Var;
        hVar.f200d = bArrD;
        hVar.f199b = i10;
        hVar.a();
        return Boolean.TRUE;
    }

    public final int j() {
        if ((this.f5025b & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
            return ((int[]) this.f5026d)[7];
        }
        return 65535;
    }

    public final void l(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = (int[]) this.f5026d;
            if (i10 >= iArr.length) {
                return;
            }
            this.f5025b = (1 << i10) | this.f5025b;
            iArr[i10] = i11;
        }
    }

    public final void m() {
        ((f.j) this.f5026d).f12862l = false;
    }

    public final void n(CharSequence charSequence) {
        ((f.j) this.f5026d).f12857g = charSequence;
    }

    public final void o(String str, DialogInterface.OnClickListener onClickListener) {
        f.j jVar = (f.j) this.f5026d;
        jVar.f12860j = str;
        jVar.f12861k = onClickListener;
    }

    public final void p(String str, DialogInterface.OnClickListener onClickListener) {
        f.j jVar = (f.j) this.f5026d;
        jVar.f12858h = str;
        jVar.f12859i = onClickListener;
    }

    public final void q(CharSequence charSequence) {
        ((f.j) this.f5026d).f12855e = charSequence;
    }

    public final f.n r() {
        f.n nVarE = e();
        nVarE.show();
        return nVarE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final String s(ArrayList arrayList) {
        gp0 gp0Var = this;
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r32 = 0;
        Object[] objArr = 0;
        for (int i10 = 0; i10 < size; i10++) {
            sb.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        m20 m20Var = new m20(7);
        PriorityQueue priorityQueue = new PriorityQueue(gp0Var.f5025b, new e5(3, objArr == true ? 1 : 0));
        int i11 = 0;
        while (i11 < strArrSplit.length) {
            String[] strArrG0 = b4.f.g0(strArrSplit[i11], r32);
            if (strArrG0.length != 0) {
                int i12 = gp0Var.f5025b;
                int length = strArrG0.length;
                int i13 = 6;
                if (length < 6) {
                    z3.a.g0(i12, z3.a.h0(strArrG0, length), z3.a.e0(strArrG0, r32, length), length, priorityQueue);
                } else {
                    long jH0 = z3.a.h0(strArrG0, 6);
                    z3.a.g0(i12, jH0, z3.a.e0(strArrG0, r32, 6), 6, priorityQueue);
                    long j10 = jH0;
                    int i14 = 1;
                    while (true) {
                        int length2 = strArrG0.length;
                        if (i14 < length2 - 5) {
                            long jW = b4.f.W(strArrG0[i14 - 1]);
                            long jW2 = b4.f.W(strArrG0[i14 + 5]);
                            String strE0 = z3.a.e0(strArrG0, i14, i13);
                            String[] strArr = strArrSplit;
                            long jB0 = (((jW2 + 2147483647L) % 1073807359) + (((((j10 + 1073807359) - ((((jW + 2147483647L) % 1073807359) * z3.a.b0(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            z3.a.g0(i12, jB0, strE0, length2, priorityQueue);
                            i14++;
                            i13 = 6;
                            i11 = i11;
                            j10 = jB0;
                            strArrSplit = strArr;
                        }
                    }
                }
            }
            i11++;
            r32 = 0;
            gp0Var = this;
            strArrSplit = strArrSplit;
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                ((Base64OutputStream) m20Var.f6810d).write(((hc) this.f5026d).i(((kc) it.next()).f6245b));
            } catch (IOException e10) {
                zzm.zzh("Error while writing hash to byteStream", e10);
            }
        }
        return m20Var.toString();
    }

    public final long t(int i10) {
        if (i10 < 0 || i10 >= this.f5025b) {
            throw new IndexOutOfBoundsException(l.a0.f("Invalid index ", i10, ", size is ", this.f5025b));
        }
        return ((long[]) this.f5026d)[i10];
    }

    public final long u(h0 h0Var) {
        int i10;
        a0 a0Var = (a0) h0Var;
        int i11 = 0;
        a0Var.m(((ik0) this.f5026d).f5633a, 0, 1, false);
        int i12 = ((ik0) this.f5026d).f5633a[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = NotificationCompat.FLAG_HIGH_PRIORITY;
        int i14 = 0;
        while (true) {
            i10 = i14 + 1;
            if ((i12 & i13) != 0) {
                break;
            }
            i13 >>= 1;
            i14 = i10;
        }
        int i15 = i12 & (~i13);
        a0Var.m(((ik0) this.f5026d).f5633a, 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (((ik0) this.f5026d).f5633a[i11] & 255) + (i15 << 8);
        }
        this.f5025b += i10;
        return i15;
    }

    public final String v() {
        switch (this.f5024a) {
            case 0:
                return ((zzbuc) this.f5026d).f11555b;
            default:
                return ((zzbvb) this.f5026d).f11577f;
        }
    }

    public final void w(long j10) {
        int i10 = this.f5025b;
        long[] jArr = (long[]) this.f5026d;
        if (i10 == jArr.length) {
            this.f5026d = Arrays.copyOf(jArr, i10 + i10);
        }
        long[] jArr2 = (long[]) this.f5026d;
        int i11 = this.f5025b;
        this.f5025b = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // com.google.android.gms.internal.ads.qe0
    /* JADX INFO: renamed from: zza */
    public final void mo0zza(Object obj) {
        switch (this.f5024a) {
            case 10:
                int i10 = ui1.V;
                ((dk1) obj).t((fg) this.f5026d, this.f5025b);
                break;
            default:
                ((fk1) obj).d(this.f5025b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final MediaCodecInfo zzb(int i10) {
        if (((MediaCodecInfo[]) this.f5026d) == null) {
            this.f5026d = new MediaCodecList(this.f5025b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f5026d)[i10];
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final boolean zze() {
        return true;
    }

    public /* synthetic */ gp0(int i10, int i11, Object obj) {
        this.f5024a = i11;
        this.f5026d = obj;
        this.f5025b = i10;
    }

    public gp0(boolean z9, boolean z10) {
        this.f5024a = 12;
        int i10 = 1;
        if (!z9 && !z10) {
            i10 = 0;
        }
        this.f5025b = i10;
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final int zza() {
        switch (this.f5024a) {
            case 0:
                return this.f5025b;
            case 6:
                return this.f5025b;
            case 7:
                return this.f5025b;
            default:
                if (((MediaCodecInfo[]) this.f5026d) == null) {
                    this.f5026d = new MediaCodecList(this.f5025b).getCodecInfos();
                }
                return ((MediaCodecInfo[]) this.f5026d).length;
        }
    }

    public gp0(int i10) {
        this.f5024a = i10;
        if (i10 != 16) {
            this.f5026d = new ik0(8);
        } else {
            this.f5026d = new int[10];
        }
    }

    public gp0(WorkDatabase_Impl workDatabase_Impl) {
        this.f5024a = 3;
        this.f5026d = workDatabase_Impl;
        this.f5025b = 12;
    }

    public gp0(ArrayList arrayList) {
        this.f5024a = 15;
        this.f5025b = 0;
        this.f5026d = arrayList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gp0(Context context) {
        this(context, f.n.j(context, 0));
        this.f5024a = 1;
    }

    public gp0(Context context, int i10) {
        this.f5024a = 1;
        this.f5026d = new f.j(new ContextThemeWrapper(context, f.n.j(context, i10)));
        this.f5025b = i10;
    }

    public gp0(int i10, l0.i[] iVarArr) {
        this.f5024a = 2;
        this.f5025b = i10;
        this.f5026d = iVarArr;
    }
}
