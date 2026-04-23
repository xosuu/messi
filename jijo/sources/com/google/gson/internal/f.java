package com.google.gson.internal;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12184a;

    public f(String str) {
        this.f12184a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f12184a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Object obj2 = ((f) obj).f12184a;
        String str = this.f12184a;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f12184a);
    }

    public final int hashCode() {
        return this.f12184a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f12184a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f12184a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f12184a;
    }
}
