package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class il0 implements fq0, x11, k21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5636a;

    public /* synthetic */ il0(int i10) {
        this.f5636a = i10;
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo4a(Object obj) {
        zze.zza("Notification of cache hit successful.");
    }

    @Override // com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        switch (this.f5636a) {
            case 0:
                ((zzbh) obj).zzi();
                return;
            case 1:
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc();
                return;
            case 2:
                ((zzbh) obj).zzh();
                return;
            case 3:
                ((zzbh) obj).zzk();
                return;
            case 4:
                ((zzbh) obj).zzj();
                return;
            case 5:
                ((zzci) obj).zzf();
                return;
            case 6:
                ((zzci) obj).zze();
                return;
            case 7:
                ((zzbh) obj).zzc();
                return;
            case 8:
            case 18:
            default:
                ds dsVar = (ds) ((es) obj);
                dsVar.a0(dsVar.m(), 4);
                return;
            case 9:
                ((xc) obj).zzf();
                return;
            case 10:
                ((xc) obj).zze();
                return;
            case 11:
                ((zzp) obj).zzdq();
                return;
            case 12:
                ((xc) obj).zzb();
                return;
            case 13:
                g1.a.u(obj);
                throw null;
            case 14:
                ((xc) obj).zzc();
                return;
            case 15:
                ((k50) obj).zzg();
                return;
            case 16:
                ((zzp) obj).zzdt();
                return;
            case 17:
                ((zzp) obj).zzdr();
                return;
            case 19:
                ds dsVar2 = (ds) ((es) obj);
                dsVar2.a0(dsVar2.m(), 3);
                return;
            case 20:
                ((qs) obj).zzj();
                return;
            case sf.zzm /* 21 */:
                ds dsVar3 = (ds) ((es) obj);
                dsVar3.a0(dsVar3.m(), 2);
                return;
            case 22:
                ((qs) obj).zzf();
                return;
            case 23:
                ((us) obj).zzg();
                return;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                ds dsVar4 = (ds) ((es) obj);
                dsVar4.a0(dsVar4.m(), 1);
                return;
            case 25:
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                return;
            case 26:
                ((qs) obj).zze();
                return;
            case 27:
                ds dsVar5 = (ds) ((es) obj);
                dsVar5.a0(dsVar5.m(), 8);
                return;
            case 28:
                ((qs) obj).zzg();
                return;
        }
    }

    public /* synthetic */ il0(int i10, int i11) {
        this.f5636a = i10;
    }

    @Override // com.google.android.gms.internal.ads.x11
    /* JADX INFO: renamed from: zza */
    public final n5.a mo2zza() {
        return tc1.d0(null);
    }
}
