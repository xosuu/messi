package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum yd implements yc1 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10854a;

    yd(int i10) {
        this.f10854a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f10854a);
    }
}
