package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class to {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final to f9205d = new to(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9208c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public to(float f10, float f11) {
        tc1.K(f10 > 0.0f);
        tc1.K(f11 > 0.0f);
        this.f9206a = f10;
        this.f9207b = f11;
        this.f9208c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && to.class == obj.getClass()) {
            to toVar = (to) obj;
            if (this.f9206a == toVar.f9206a && this.f9207b == toVar.f9207b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f9207b) + ((Float.floatToRawIntBits(this.f9206a) + 527) * 31);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f9206a), Float.valueOf(this.f9207b));
    }
}
