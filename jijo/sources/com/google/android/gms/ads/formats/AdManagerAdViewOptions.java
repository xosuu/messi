package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.ak;
import com.google.android.gms.internal.ads.yj;
import com.google.android.gms.internal.ads.zj;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f1917b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1918a = false;

        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this);
        }

        public Builder setManualImpressionsEnabled(boolean z9) {
            this.f1918a = z9;
            return this;
        }
    }

    public AdManagerAdViewOptions(Builder builder) {
        this.f1916a = builder.f1918a;
        this.f1917b = null;
    }

    public boolean getManualImpressionsEnabled() {
        return this.f1916a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        boolean manualImpressionsEnabled = getManualImpressionsEnabled();
        d0.v(parcel, 1, 4);
        parcel.writeInt(manualImpressionsEnabled ? 1 : 0);
        d0.m(parcel, 2, this.f1917b);
        d0.u(parcel, iT);
    }

    public final ak zza() {
        IBinder iBinder = this.f1917b;
        if (iBinder == null) {
            return null;
        }
        int i10 = zj.f11250a;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof ak ? (ak) iInterfaceQueryLocalInterface : new yj(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public AdManagerAdViewOptions(boolean z9, IBinder iBinder) {
        this.f1916a = z9;
        this.f1917b = iBinder;
    }
}
