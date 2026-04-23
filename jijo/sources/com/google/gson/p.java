package com.google.gson;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class p extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f12258a;

    public p(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f12258a = bool;
    }

    public static boolean d(p pVar) {
        Serializable serializable = pVar.f12258a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final Number b() {
        Serializable serializable = this.f12258a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new com.google.gson.internal.f((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String c() {
        Serializable serializable = this.f12258a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return b().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        Serializable serializable = this.f12258a;
        Serializable serializable2 = pVar.f12258a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (d(this) && d(pVar)) {
            return b().longValue() == pVar.b().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = b().doubleValue();
        double dDoubleValue2 = pVar.b().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f12258a;
        if (serializable == null) {
            return 31;
        }
        if (d(this)) {
            jDoubleToLongBits = b().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(b().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public p(Number number) {
        Objects.requireNonNull(number);
        this.f12258a = number;
    }

    public p(String str) {
        Objects.requireNonNull(str);
        this.f12258a = str;
    }
}
