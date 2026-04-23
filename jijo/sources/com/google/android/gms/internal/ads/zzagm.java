package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzagm extends zzagd {
    public static final Parcelable.Creator<zzagm> CREATOR = new a2(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11446b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bz0 f11447d;

    public zzagm(String str, String str2, wz0 wz0Var) {
        super(str);
        tc1.K(!wz0Var.isEmpty());
        this.f11446b = str2;
        bz0 bz0VarK = bz0.k(wz0Var);
        this.f11447d = bz0VarK;
    }

    public static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
    @Override // com.google.android.gms.internal.ads.zzagd, com.google.android.gms.internal.ads.zzbj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.mi r9) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagm.a(com.google.android.gms.internal.ads.mi):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagm.class == obj.getClass()) {
            zzagm zzagmVar = (zzagm) obj;
            if (yn0.c(this.f11435a, zzagmVar.f11435a) && yn0.c(this.f11446b, zzagmVar.f11446b) && this.f11447d.equals(zzagmVar.f11447d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f11435a.hashCode() + 527;
        String str = this.f11446b;
        return this.f11447d.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final String toString() {
        return this.f11435a + ": description=" + this.f11446b + ": values=" + String.valueOf(this.f11447d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11435a);
        parcel.writeString(this.f11446b);
        parcel.writeStringArray((String[]) this.f11447d.toArray(new String[0]));
    }
}
