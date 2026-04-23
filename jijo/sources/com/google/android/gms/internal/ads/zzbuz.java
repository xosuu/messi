package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class zzbuz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbuz> CREATOR = new ar(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ParcelFileDescriptor f11572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Parcelable f11573b = null;

    public zzbuz(ParcelFileDescriptor parcelFileDescriptor) {
        this.f11572a = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        if (this.f11572a == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.f11573b.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                } catch (IOException e10) {
                    e = e10;
                    autoCloseOutputStream = null;
                }
                try {
                    nu.f7383a.execute(new vm(autoCloseOutputStream, 12, bArrMarshall));
                    parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                } catch (IOException e11) {
                    e = e11;
                    zzm.zzh("Error transporting the ad response", e);
                    zzu.zzo().i("LargeParcelTeleporter.pipeData.2", e);
                    y3.c.b(autoCloseOutputStream);
                }
                this.f11572a = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.n(parcel, 2, this.f11572a, i10);
        g4.d0.u(parcel, iT);
    }
}
