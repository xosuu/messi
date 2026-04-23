package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rp extends NativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk f8672a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qp f8674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final op f8675d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8673b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f8676e = new ArrayList();

    public rp(gk gkVar) {
        pi piVarZzk;
        this.f8672a = gkVar;
        op opVar = null;
        try {
            List listZzu = gkVar.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    pi piVarU1 = obj instanceof IBinder ? fi.u1((IBinder) obj) : null;
                    if (piVarU1 != null) {
                        this.f8673b.add(new qp(piVarU1));
                    }
                }
            }
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
        try {
            List listZzv = this.f8672a.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    zzcw zzcwVarZzb = obj2 instanceof IBinder ? zzcv.zzb((IBinder) obj2) : null;
                    if (zzcwVarZzb != null) {
                        this.f8676e.add(new zzcx(zzcwVarZzb));
                    }
                }
            }
        } catch (RemoteException e11) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
        }
        try {
            piVarZzk = this.f8672a.zzk();
        } catch (RemoteException e12) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e12);
        }
        qp qpVar = piVarZzk != null ? new qp(piVarZzk) : null;
        this.f8674c = qpVar;
        try {
            if (this.f8672a.zzi() != null) {
                opVar = new op(this.f8672a.zzi());
            }
        } catch (RemoteException e13) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e13);
        }
        this.f8675d = opVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ a4.a a() {
        a4.a aVarZzm;
        try {
            aVarZzm = this.f8672a.zzm();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            aVarZzm = null;
        }
        return aVarZzm;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.f8672a.b();
        } catch (RemoteException e10) {
            zzm.zzh("Failed to cancelUnconfirmedClick", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.f8672a.zzx();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.f8672a.x0();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f8675d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.f8672a.zzn();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.f8672a.zzo();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.f8672a.zzp();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle getExtras() {
        try {
            Bundle bundleZzf = this.f8672a.zzf();
            if (bundleZzf != null) {
                return bundleZzf;
            }
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.f8672a.zzq();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.Image getIcon() {
        return this.f8674c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List getImages() {
        return this.f8673b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final MediaContent getMediaContent() {
        gk gkVar = this.f8672a;
        try {
            if (gkVar.zzj() != null) {
                return new zzep(gkVar.zzj(), null);
            }
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List getMuteThisAdReasons() {
        return this.f8676e;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.f8672a.zzs();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVarZzg;
        try {
            zzdnVarZzg = this.f8672a.zzg();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            zzdnVarZzg = null;
        }
        return ResponseInfo.zza(zzdnVarZzg);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
        try {
            double dZze = this.f8672a.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.f8672a.zzt();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.f8672a.q();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f8672a.zzH();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        gk gkVar = this.f8672a;
        try {
            try {
                if (gkVar.zzH()) {
                    if (muteThisAdReason == null) {
                        gkVar.e0(null);
                        return;
                    } else if (muteThisAdReason instanceof zzcx) {
                        gkVar.e0(((zzcx) muteThisAdReason).zza());
                        return;
                    } else {
                        zzm.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e10) {
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            }
            zzm.zzg("Ad is not custom mute enabled");
        } catch (RemoteException e11) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f8672a.n1(bundle);
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.f8672a.zzA();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f8672a.m0(bundle);
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f8672a.b1(bundle);
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f8672a.P(new zzct(muteThisAdListener));
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f8672a.E0(new zzfe(onPaidEventListener));
        } catch (RemoteException e10) {
            zzm.zzh("Failed to setOnPaidEventListener", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f8672a.j1(new xp(unconfirmedClickListener));
        } catch (RemoteException e10) {
            zzm.zzh("Failed to setUnconfirmedClickListener", e10);
        }
    }
}
