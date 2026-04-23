package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2535f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri[] f2537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg[] f2538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f2539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f2540e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
    }

    public a(int i10, int[] iArr, fg[] fgVarArr, long[] jArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = fgVarArr.length;
        int i11 = 0;
        tc1.K(length == length2);
        this.f2536a = i10;
        this.f2539d = iArr;
        this.f2538c = fgVarArr;
        this.f2540e = jArr;
        this.f2537b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f2537b;
            if (i11 >= uriArr.length) {
                return;
            }
            fg fgVar = fgVarArr[i11];
            if (fgVar == null) {
                uri = null;
            } else {
                gb gbVar = fgVar.f4518b;
                gbVar.getClass();
                uri = gbVar.f4855a;
            }
            uriArr[i11] = uri;
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f2536a == aVar.f2536a && Arrays.equals(this.f2538c, aVar.f2538c) && Arrays.equals(this.f2539d, aVar.f2539d) && Arrays.equals(this.f2540e, aVar.f2540e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f2540e) + ((Arrays.hashCode(this.f2539d) + ((Arrays.hashCode(this.f2538c) + (((this.f2536a * 31) - 1) * 961)) * 31)) * 31)) * 961;
    }
}
