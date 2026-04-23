package f;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.fe;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.k21;
import com.google.android.gms.internal.ads.kd;
import com.google.android.gms.internal.ads.lf;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.qf;
import com.google.android.gms.internal.ads.rf;
import com.google.android.gms.internal.ads.rs0;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.vd;
import com.google.android.gms.internal.ads.wd;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zd;
import com.google.android.gms.internal.ads.zzgyn;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements k.c0, k21, rs0, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12985b;

    public /* synthetic */ x0(Object obj, boolean z9) {
        this.f12984a = z9;
        this.f12985b = obj;
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        zzm.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4a(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.x0.mo4a(java.lang.Object):void");
    }

    @Override // k.c0
    public final void b(k.o oVar, boolean z9) {
        androidx.appcompat.widget.b bVar;
        if (this.f12984a) {
            return;
        }
        this.f12984a = true;
        y0 y0Var = (y0) this.f12985b;
        ActionMenuView actionMenuView = y0Var.f12988c.f15068a.f343a;
        if (actionMenuView != null && (bVar = actionMenuView.F) != null) {
            bVar.e();
            l.h hVar = bVar.G;
            if (hVar != null && hVar.b()) {
                hVar.f14498j.dismiss();
            }
        }
        y0Var.f12989d.onPanelClosed(108, oVar);
        this.f12984a = false;
    }

    public final void c(int i10) {
        tc1.W(!this.f12984a);
        ((SparseBooleanArray) this.f12985b).append(i10, true);
    }

    @Override // j9.a
    public final void d() {
        t8.a0 a0Var = (t8.a0) this.f12985b;
        if (a0Var.M0.size() != 0) {
            a0Var.C0.setVisibility(8);
        } else if (a0Var.f17028l0.isShown()) {
            a0Var.C0.setVisibility(0);
        }
        r8.g gVar = new r8.g(a0Var.c(), a0Var.M0);
        a0Var.f17026j0 = gVar;
        gVar.f16569q = a0Var;
        a0Var.f17027k0.setAdapter(gVar);
    }

    public final com.google.android.gms.internal.ads.p e() {
        tc1.W(!this.f12984a);
        this.f12984a = true;
        return new com.google.android.gms.internal.ads.p((SparseBooleanArray) this.f12985b);
    }

    @Override // j9.a
    public final void g() {
        boolean z9 = this.f12984a;
        Object obj = this.f12985b;
        if (z9) {
            t8.a0 a0Var = (t8.a0) obj;
            a0Var.M0 = a0Var.L0.a("ASC");
            return;
        }
        t8.a0 a0Var2 = (t8.a0) obj;
        if (a0Var2.M0 != null || a0Var2.f17029m0.isShown()) {
            return;
        }
        a0Var2.M0 = a0Var2.L0.a("ASC");
    }

    @Override // k.c0
    public final boolean i(k.o oVar) {
        ((y0) this.f12985b).f12989d.onMenuOpened(108, oVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final Object zza(Object obj) {
        long j10;
        xq xqVar = (xq) this.f12985b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f12984a) {
            ((Context) xqVar.f10630b).deleteDatabase("OfflineUpload.db");
        } else {
            xqVar.getClass();
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(vd.Q(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgyn e10) {
                    zzm.zzg("Unable to deserialize proto from offline signals database:");
                    zzm.zzg(e10.getMessage());
                }
            }
            cursorQuery.close();
            Context context = (Context) xqVar.f10630b;
            wd wdVarI = zd.I();
            String packageName = context.getPackageName();
            wdVarI.d();
            zd.E((zd) wdVarI.f9462b, packageName);
            String str = Build.MODEL;
            wdVarI.d();
            zd.F((zd) wdVarI.f9462b, str);
            int iL = en1.L(sQLiteDatabase, 0);
            wdVarI.d();
            zd.B((zd) wdVarI.f9462b, iL);
            wdVarI.d();
            zd.A((zd) wdVarI.f9462b, arrayList);
            int iL2 = en1.L(sQLiteDatabase, 1);
            wdVarI.d();
            zd.C((zd) wdVarI.f9462b, iL2);
            int iL3 = en1.L(sQLiteDatabase, 3);
            wdVarI.d();
            zd.H((zd) wdVarI.f9462b, iL3);
            ((y3.b) zzu.zzB()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            wdVarI.d();
            zd.D((zd) wdVarI.f9462b, jCurrentTimeMillis);
            Cursor cursorG0 = en1.G0(sQLiteDatabase, 2);
            if (cursorG0.getCount() > 0) {
                cursorG0.moveToNext();
                j10 = cursorG0.getLong(cursorG0.getColumnIndexOrThrow("value"));
            } else {
                j10 = 0;
            }
            cursorG0.close();
            wdVarI.d();
            zd.G((zd) wdVarI.f9462b, j10);
            zd zdVar = (zd) wdVarI.b();
            int size = arrayList.size();
            long jN = 0;
            for (int i10 = 0; i10 < size; i10++) {
                vd vdVar = (vd) arrayList.get(i10);
                if (vdVar.O() == qf.ENUM_TRUE && vdVar.N() > jN) {
                    jN = vdVar.N();
                }
            }
            if (jN != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(jN));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            kd kdVar = (kd) xqVar.f10631d;
            synchronized (kdVar) {
                if (kdVar.f6261c) {
                    try {
                        rf rfVar = kdVar.f6260b;
                        rfVar.d();
                        sf.H((sf) rfVar.f9462b, zdVar);
                    } catch (NullPointerException e11) {
                        zzu.zzo().i("AdMobClearcutLogger.modify", e11);
                    }
                }
            }
            VersionInfoParcel versionInfoParcel = (VersionInfoParcel) xqVar.f10633h;
            fe feVarB = ge.B();
            int i11 = versionInfoParcel.buddyApkVersion;
            feVarB.d();
            ge.C((ge) feVarB.f9462b, i11);
            int i12 = ((VersionInfoParcel) xqVar.f10633h).clientJarVersion;
            feVarB.d();
            ge.D((ge) feVarB.f9462b, i12);
            int i13 = true != ((VersionInfoParcel) xqVar.f10633h).isClientJar ? 2 : 0;
            feVarB.d();
            ge.A((ge) feVarB.f9462b, i13);
            ge geVar = (ge) feVarB.b();
            kd kdVar2 = (kd) xqVar.f10631d;
            synchronized (kdVar2) {
                if (kdVar2.f6261c) {
                    try {
                        rf rfVar2 = kdVar2.f6260b;
                        lf lfVar = (lf) ((sf) rfVar2.f9462b).K().o();
                        lfVar.d();
                        mf.A((mf) lfVar.f9462b, geVar);
                        rfVar2.d();
                        sf.D((sf) rfVar2.f9462b, (mf) lfVar.b());
                    } catch (NullPointerException e12) {
                        zzu.zzo().i("AdMobClearcutLogger.modify", e12);
                    }
                }
            }
            ((kd) xqVar.f10631d).b(10004);
            sQLiteDatabase.delete("offline_signal_contents", null, null);
            en1.K0(sQLiteDatabase, "failed_requests");
            en1.K0(sQLiteDatabase, "total_requests");
            en1.K0(sQLiteDatabase, "completed_requests");
        }
        return null;
    }

    public x0() {
        this.f12985b = new SparseBooleanArray();
    }

    public x0(String str, boolean z9) {
        this.f12984a = z9;
        this.f12985b = str;
    }

    public x0(y0 y0Var) {
        this.f12985b = y0Var;
    }
}
