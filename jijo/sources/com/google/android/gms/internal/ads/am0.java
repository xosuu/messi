package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class am0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2735c;

    public am0(VersionInfoParcel versionInfoParcel, mu muVar) {
        this.f2733a = 2;
        this.f2735c = versionInfoParcel;
        this.f2734b = muVar;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        switch (this.f2733a) {
            case 0:
                return 4;
            case 1:
                return 10;
            case 2:
                return 54;
            case 3:
                return 60;
            case 4:
                return 23;
            case 5:
                return 31;
            case 6:
                return 41;
            default:
                return 48;
        }
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        int i10 = this.f2733a;
        int i11 = 10;
        boolean z9 = false;
        Object obj = this.f2735c;
        Object obj2 = this.f2734b;
        switch (i10) {
            case 0:
                ((y3.b) ((y3.a) obj2)).getClass();
                return tc1.d0(new bm0((or0) obj, System.currentTimeMillis()));
            case 1:
                return ((Boolean) zzba.zzc().a(eg.f4154v2)).booleanValue() ? tc1.d0(null) : tc1.o0(((gu) obj).e(), new b3(10), (Executor) obj2);
            case 2:
                return ((q11) ((p21) obj2)).b(new du(i11, this));
            case 3:
                if (!((Boolean) zzba.zzc().a(eg.Qb)).booleanValue()) {
                    return tc1.d0(new tn0(null, 1));
                }
                try {
                    if (((Intent) obj).resolveActivity(((Context) obj2).getPackageManager()) != null) {
                        z9 = true;
                    }
                } catch (Exception e10) {
                    zzu.zzo().i("HsdpMigrationSignal.isHsdpMigrationSupported", e10);
                }
                return tc1.d0(new tn0(Boolean.valueOf(z9), 1));
            case 4:
                return ((q11) ((p21) obj2)).b(new du(18, this));
            case 5:
                return tc1.d0(new io0(0, (String) obj2, (String) obj));
            case 6:
                Executor executor = (Executor) obj2;
                return tc1.V(tc1.o0(tc1.d0((String) obj), new b3(14), executor), Throwable.class, new if0(16, this), executor);
            default:
                return ((q11) ((p21) obj2)).b(new du(28, this));
        }
    }

    public am0(mu muVar, String str) {
        this.f2733a = 6;
        this.f2734b = muVar;
        this.f2735c = str;
    }

    public am0(mu muVar, List list) {
        this.f2733a = 7;
        this.f2734b = muVar;
        this.f2735c = list;
    }

    public /* synthetic */ am0(Object obj, int i10, Object obj2) {
        this.f2733a = i10;
        this.f2734b = obj;
        this.f2735c = obj2;
    }
}
