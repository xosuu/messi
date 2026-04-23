package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hk extends UnifiedNativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk f5330a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qi f5332c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5331b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VideoController f5333d = new VideoController();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f5334e = new ArrayList();

    public hk(gk gkVar) {
        pi oiVar;
        IBinder iBinder;
        this.f5330a = gkVar;
        qi qiVar = null;
        try {
            List listZzu = gkVar.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        oiVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        oiVar = iInterfaceQueryLocalInterface instanceof pi ? (pi) iInterfaceQueryLocalInterface : new oi(iBinder);
                    }
                    if (oiVar != null) {
                        this.f5331b.add(new qi(oiVar));
                    }
                }
            }
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
        try {
            List listZzv = this.f5330a.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    zzcw zzcwVarZzb = obj2 instanceof IBinder ? zzcv.zzb((IBinder) obj2) : null;
                    if (zzcwVarZzb != null) {
                        this.f5334e.add(new zzcx(zzcwVarZzb));
                    }
                }
            }
        } catch (RemoteException e11) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
        }
        try {
            pi piVarZzk = this.f5330a.zzk();
            if (piVarZzk != null) {
                qiVar = new qi(piVarZzk);
            }
        } catch (RemoteException e12) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e12);
        }
        this.f5332c = qiVar;
        try {
            if (this.f5330a.zzi() != null) {
                new ki(this.f5330a.zzi());
            }
        } catch (RemoteException e13) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e13);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f5330a.n1(bundle);
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f5330a.m0(bundle);
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f5330a.b1(bundle);
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zza() {
        VideoController videoController = this.f5333d;
        gk gkVar = this.f5330a;
        try {
            if (gkVar.zzh() != null) {
                videoController.zzb(gkVar.zzh());
            }
        } catch (RemoteException e10) {
            zzm.zzh("Exception occurred while getting video controller", e10);
        }
        return videoController;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image zzb() {
        return this.f5332c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double zzc() {
        try {
            double dZze = this.f5330a.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzd() {
        try {
            a4.a aVarZzl = this.f5330a.zzl();
            if (aVarZzl != null) {
                return a4.b.a0(aVarZzl);
            }
            return null;
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zze() {
        try {
            return this.f5330a.zzn();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzf() {
        try {
            return this.f5330a.zzo();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzg() {
        try {
            return this.f5330a.zzp();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzh() {
        try {
            return this.f5330a.zzq();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzi() {
        try {
            return this.f5330a.zzs();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzj() {
        try {
            return this.f5330a.zzt();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzk() {
        return this.f5331b;
    }
}
