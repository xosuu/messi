package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzagv implements zzbj {
    public static final Parcelable.Creator<zzagv> CREATOR = new a2(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11458a;

    public zzagv(ArrayList arrayList) {
        this.f11458a = arrayList;
        boolean z9 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((zzagu) arrayList.get(0)).f11456b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((zzagu) arrayList.get(i10)).f11455a < j10) {
                    z9 = true;
                    break;
                } else {
                    j10 = ((zzagu) arrayList.get(i10)).f11456b;
                    i10++;
                }
            }
        }
        tc1.K(!z9);
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void a(mi miVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzagv.class != obj.getClass()) {
            return false;
        }
        return this.f11458a.equals(((zzagv) obj).f11458a);
    }

    public final int hashCode() {
        return this.f11458a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f11458a.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f11458a);
    }
}
