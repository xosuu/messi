package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzca;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.ak;
import com.google.android.gms.internal.ads.yj;
import com.google.android.gms.internal.ads.zj;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzcb f1934b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IBinder f1935d;

    @Deprecated
    public static final class Builder {
        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            return this;
        }
    }

    public PublisherAdViewOptions(boolean z9, IBinder iBinder, IBinder iBinder2) {
        this.f1933a = z9;
        this.f1934b = iBinder != null ? zzca.zzd(iBinder) : null;
        this.f1935d = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f1933a ? 1 : 0);
        zzcb zzcbVar = this.f1934b;
        d0.m(parcel, 2, zzcbVar == null ? null : zzcbVar.asBinder());
        d0.m(parcel, 3, this.f1935d);
        d0.u(parcel, iT);
    }

    public final zzcb zza() {
        return this.f1934b;
    }

    public final ak zzb() {
        IBinder iBinder = this.f1935d;
        if (iBinder == null) {
            return null;
        }
        int i10 = zj.f11250a;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof ak ? (ak) iInterfaceQueryLocalInterface : new yj(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public final boolean zzc() {
        return this.f1933a;
    }
}
