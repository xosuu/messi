package com.google.android.gms.ads.internal.util;

import a4.a;
import android.content.Context;
import android.os.Build;
import c2.b;
import c2.c;
import c2.f;
import c2.o;
import c2.p;
import c2.q;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.internal.ads.ur0;
import d2.k;
import d5.e;
import java.util.Collections;
import java.util.HashMap;
import l2.j;

/* JADX INFO: loaded from: classes.dex */
public class WorkManagerUtil extends zzbq {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    public static void u1(Context context) {
        try {
            k.t0(context.getApplicationContext(), new b(new e()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(a aVar) {
        Context context = (Context) a4.b.a0(aVar);
        u1(context);
        try {
            k kVarS0 = k.s0(context);
            ((ur0) kVarS0.f12333f).s(new m2.a(kVarS0, "offline_ping_sender_work", 1));
            o oVar = o.f1537a;
            c2.e eVar = new c2.e();
            o oVar2 = o.f1538b;
            c cVar = new c();
            cVar.f1515a = oVar;
            cVar.f1520f = -1L;
            cVar.f1521g = -1L;
            cVar.f1522h = new c2.e();
            cVar.f1516b = false;
            int i10 = Build.VERSION.SDK_INT;
            cVar.f1517c = false;
            cVar.f1515a = oVar2;
            cVar.f1518d = false;
            cVar.f1519e = false;
            if (i10 >= 24) {
                cVar.f1522h = eVar;
                cVar.f1520f = -1L;
                cVar.f1521g = -1L;
            }
            p pVar = new p(OfflinePingSender.class);
            pVar.f1555b.f15151j = cVar;
            pVar.f1556c.add("offline_ping_sender_work");
            kVarS0.q0(Collections.singletonList(pVar.a()));
        } catch (IllegalStateException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to instantiate WorkManager.", e10);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(a aVar, String str, String str2) {
        return zzg(aVar, new zza(str, str2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(a aVar, zza zzaVar) throws Throwable {
        Context context = (Context) a4.b.a0(aVar);
        u1(context);
        o oVar = o.f1537a;
        c2.e eVar = new c2.e();
        o oVar2 = o.f1538b;
        c cVar = new c();
        cVar.f1515a = oVar;
        cVar.f1520f = -1L;
        cVar.f1521g = -1L;
        cVar.f1522h = new c2.e();
        cVar.f1516b = false;
        int i10 = Build.VERSION.SDK_INT;
        cVar.f1517c = false;
        cVar.f1515a = oVar2;
        cVar.f1518d = false;
        cVar.f1519e = false;
        if (i10 >= 24) {
            cVar.f1522h = eVar;
            cVar.f1520f = -1L;
            cVar.f1521g = -1L;
        }
        HashMap map = new HashMap();
        map.put("uri", zzaVar.zza);
        map.put("gws_query_id", zzaVar.zzb);
        map.put("image_url", zzaVar.zzc);
        f fVar = new f(map);
        f.c(fVar);
        p pVar = new p(OfflineNotificationPoster.class);
        j jVar = pVar.f1555b;
        jVar.f15151j = cVar;
        jVar.f15146e = fVar;
        pVar.f1556c.add("offline_notification_work");
        q qVarA = pVar.a();
        try {
            k.s0(context).q0(Collections.singletonList(qVarA));
            return true;
        } catch (IllegalStateException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }
}
