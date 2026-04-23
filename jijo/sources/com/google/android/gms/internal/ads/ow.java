package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1[] f7688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7689e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public ow(String str, y1... y1VarArr) {
        int length = y1VarArr.length;
        int i10 = 1;
        tc1.K(length > 0);
        this.f7686b = str;
        this.f7688d = y1VarArr;
        this.f7685a = length;
        int iB = xm.b(y1VarArr[0].f10714m);
        this.f7687c = iB == -1 ? xm.b(y1VarArr[0].f10713l) : iB;
        String str2 = y1VarArr[0].f10705d;
        str2 = (str2 == null || str2.equals("und")) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2;
        int i11 = y1VarArr[0].f10707f | 16384;
        while (true) {
            y1[] y1VarArr2 = this.f7688d;
            if (i10 >= y1VarArr2.length) {
                return;
            }
            String str3 = y1VarArr2[i10].f10705d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str3)) {
                y1[] y1VarArr3 = this.f7688d;
                b(i10, "languages", y1VarArr3[0].f10705d, y1VarArr3[i10].f10705d);
                return;
            } else {
                y1[] y1VarArr4 = this.f7688d;
                if (i11 != (y1VarArr4[i10].f10707f | 16384)) {
                    b(i10, "role flags", Integer.toBinaryString(y1VarArr4[0].f10707f), Integer.toBinaryString(this.f7688d[i10].f10707f));
                    return;
                }
                i10++;
            }
        }
    }

    public static void b(int i10, String str, String str2, String str3) {
        StringBuilder sbL = l.a0.l("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbL.append(str3);
        sbL.append("' (track ");
        sbL.append(i10);
        sbL.append(")");
        fg0.d(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new IllegalStateException(sbL.toString()));
    }

    public final y1 a(int i10) {
        return this.f7688d[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ow.class == obj.getClass()) {
            ow owVar = (ow) obj;
            if (this.f7686b.equals(owVar.f7686b) && Arrays.equals(this.f7688d, owVar.f7688d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f7689e;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f7688d) + ((this.f7686b.hashCode() + 527) * 31);
        this.f7689e = iHashCode;
        return iHashCode;
    }
}
