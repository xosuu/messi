package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class kp1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kp1 f6364d = new kp1(new ow[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wz0 f6366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6367c;

    static {
        Integer.toString(0, 36);
    }

    public kp1(ow... owVarArr) {
        this.f6366b = bz0.l(owVarArr);
        this.f6365a = owVarArr.length;
        int i10 = 0;
        while (i10 < this.f6366b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f6366b.size(); i12++) {
                if (((ow) this.f6366b.get(i10)).equals(this.f6366b.get(i12))) {
                    fg0.d(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final ow a(int i10) {
        return (ow) this.f6366b.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kp1.class == obj.getClass()) {
            kp1 kp1Var = (kp1) obj;
            if (this.f6365a == kp1Var.f6365a && this.f6366b.equals(kp1Var.f6366b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f6367c;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f6366b.hashCode();
        this.f6367c = iHashCode;
        return iHashCode;
    }
}
