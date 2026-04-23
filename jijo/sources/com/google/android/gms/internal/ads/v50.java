package com.google.android.gms.internal.ads;

import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v50 implements b60, s60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9785a;

    public /* synthetic */ v50() {
        this.f9785a = 3;
    }

    @Override // com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        switch (this.f9785a) {
            case 0:
                ((wq0) obj).onAdMetadataChanged();
                break;
            case 1:
                ((kl0) obj).zzc();
                break;
            case 2:
                ((wq0) obj).zzc();
                break;
            case 3:
                break;
            case 4:
                ((wq0) obj).zze();
                break;
            case 5:
                ((kl0) obj).V();
                break;
            case 6:
                ((sp0) obj).zzdr();
                break;
            case 7:
                ((sp0) obj).zzdq();
                break;
            case 8:
                break;
            case 9:
                ((sp0) obj).zzdt();
                break;
            case 10:
                ((kl0) obj).L();
                break;
            case 11:
                ((sp0) obj).zzg();
                break;
            case 12:
                ((kl0) obj).zzb();
                break;
            case 13:
                ((wq0) obj).zzb();
                break;
            case 14:
                ((ml0) obj).L();
                break;
            case 15:
                ((wq0) obj).L();
                break;
            case 16:
                ((sp0) obj).L();
                break;
            case 17:
                ((kl0) obj).zza();
                break;
            case 18:
                ((wq0) obj).zza();
                break;
            case 19:
                ((f60) obj).zza();
                break;
            case 20:
                ((h60) obj).zzi();
                break;
            case sf.zzm /* 21 */:
                ((h60) obj).zzj();
                break;
            case 22:
                ((p60) obj).zzh();
                break;
            case 23:
                ((r60) obj).zza();
                break;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                ((d70) obj).zzf();
                break;
            case 25:
                ((d70) obj).zze();
                break;
            case 26:
                ((f70) obj).zzl();
                break;
            case 27:
                ((f70) obj).zzk();
                break;
            case 28:
                ((h70) obj).zza();
                break;
            default:
                ((h70) obj).zzb();
                break;
        }
    }

    public /* synthetic */ v50(int i10) {
        this.f9785a = i10;
    }
}
