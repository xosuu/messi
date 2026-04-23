package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class kh0 extends rh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f6291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzm f6292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6294d;

    public kh0(Activity activity, zzm zzmVar, String str, String str2) {
        this.f6291a = activity;
        this.f6292b = zzmVar;
        this.f6293c = str;
        this.f6294d = str2;
    }

    public final boolean equals(Object obj) {
        zzm zzmVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rh0) {
            rh0 rh0Var = (rh0) obj;
            if (this.f6291a.equals(((kh0) rh0Var).f6291a) && ((zzmVar = this.f6292b) != null ? zzmVar.equals(((kh0) rh0Var).f6292b) : ((kh0) rh0Var).f6292b == null) && ((str = this.f6293c) != null ? str.equals(((kh0) rh0Var).f6293c) : ((kh0) rh0Var).f6293c == null) && ((str2 = this.f6294d) != null ? str2.equals(((kh0) rh0Var).f6294d) : ((kh0) rh0Var).f6294d == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6291a.hashCode() ^ 1000003;
        zzm zzmVar = this.f6292b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.f6293c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f6294d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = l.a0.l("OfflineUtilsParams{activity=", this.f6291a.toString(), ", adOverlay=", String.valueOf(this.f6292b), ", gwsQueryId=");
        sbL.append(this.f6293c);
        sbL.append(", uri=");
        return g1.a.r(sbL, this.f6294d, "}");
    }
}
