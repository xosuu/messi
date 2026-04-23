package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ow f5438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f5440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f5441e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public hz(ow owVar, boolean z9, int[] iArr, boolean[] zArr) {
        int i10 = owVar.f7685a;
        this.f5437a = i10;
        tc1.K(i10 == iArr.length && i10 == zArr.length);
        this.f5438b = owVar;
        this.f5439c = z9 && i10 > 1;
        this.f5440d = (int[]) iArr.clone();
        this.f5441e = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f5438b.f7687c;
    }

    public final boolean b() {
        for (boolean z9 : this.f5441e) {
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hz.class == obj.getClass()) {
            hz hzVar = (hz) obj;
            if (this.f5439c == hzVar.f5439c && this.f5438b.equals(hzVar.f5438b) && Arrays.equals(this.f5440d, hzVar.f5440d) && Arrays.equals(this.f5441e, hzVar.f5441e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5441e) + ((Arrays.hashCode(this.f5440d) + (((this.f5438b.hashCode() * 31) + (this.f5439c ? 1 : 0)) * 31)) * 31);
    }
}
