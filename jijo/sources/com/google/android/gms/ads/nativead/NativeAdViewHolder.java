package com.google.android.gms.ads.nativead;

import a4.a;
import a4.b;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zi;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class NativeAdViewHolder {
    public static final WeakHashMap zza = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zi f2354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f2355b;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        if (view == null) {
            throw new NullPointerException("ContainerView must not be null");
        }
        if (view instanceof NativeAdView) {
            zzm.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (weakHashMap.get(view) != null) {
            zzm.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap.put(view, this);
        this.f2355b = new WeakReference(view);
        this.f2354a = zzay.zza().zzi(view, map == null ? new HashMap() : new HashMap(map), map2 == null ? new HashMap() : new HashMap(map2));
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f2354a.zzb(new b(view));
        } catch (RemoteException e10) {
            zzm.zzh("Unable to call setClickConfirmingView on delegate", e10);
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        a aVarA = nativeAd.a();
        WeakReference weakReference = this.f2355b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzm.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (!weakHashMap.containsKey(view)) {
            weakHashMap.put(view, this);
        }
        zi ziVar = this.f2354a;
        if (ziVar != null) {
            try {
                ziVar.zzc(aVarA);
            } catch (RemoteException e10) {
                zzm.zzh("Unable to call setNativeAd on delegate", e10);
            }
        }
    }

    public void unregisterNativeAd() {
        zi ziVar = this.f2354a;
        if (ziVar != null) {
            try {
                ziVar.zzd();
            } catch (RemoteException e10) {
                zzm.zzh("Unable to call unregisterNativeAd on delegate", e10);
            }
        }
        WeakReference weakReference = this.f2355b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
