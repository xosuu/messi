package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class sw0 extends xw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f8984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8989f;

    public sw0(IBinder iBinder, String str, int i10, float f10, int i11, String str2) {
        this.f8984a = iBinder;
        this.f8985b = str;
        this.f8986c = i10;
        this.f8987d = f10;
        this.f8988e = i11;
        this.f8989f = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xw0) {
            xw0 xw0Var = (xw0) obj;
            if (this.f8984a.equals(((sw0) xw0Var).f8984a) && ((str = this.f8985b) != null ? str.equals(((sw0) xw0Var).f8985b) : ((sw0) xw0Var).f8985b == null)) {
                sw0 sw0Var = (sw0) xw0Var;
                if (this.f8986c == sw0Var.f8986c && Float.floatToIntBits(this.f8987d) == Float.floatToIntBits(sw0Var.f8987d) && this.f8988e == sw0Var.f8988e) {
                    String str2 = sw0Var.f8989f;
                    String str3 = this.f8989f;
                    if (str3 != null ? str3.equals(str2) : str2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f8984a.hashCode() ^ 1000003;
        String str = this.f8985b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f8986c) * 1000003) ^ Float.floatToIntBits(this.f8987d);
        String str2 = this.f8989f;
        return ((((iHashCode2 * 1525764945) ^ this.f8988e) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        StringBuilder sbK = fb1.k("OverlayDisplayShowRequest{windowToken=", this.f8984a.toString(), ", appId=");
        sbK.append(this.f8985b);
        sbK.append(", layoutGravity=");
        sbK.append(this.f8986c);
        sbK.append(", layoutVerticalMargin=");
        sbK.append(this.f8987d);
        sbK.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sbK.append(this.f8988e);
        sbK.append(", deeplinkUrl=null, adFieldEnifd=");
        return g1.a.r(sbK, this.f8989f, ", thirdPartyAuthCallerId=null}");
    }
}
