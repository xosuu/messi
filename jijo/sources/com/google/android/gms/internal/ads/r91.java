package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum r91 implements yc1 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8552a;

    r91(int i10) {
        this.f8552a = i10;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f8552a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
