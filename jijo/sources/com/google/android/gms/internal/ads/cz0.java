package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class cz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3523c;

    public cz0(Object obj, Object obj2, Object obj3) {
        this.f3521a = obj;
        this.f3522b = obj2;
        this.f3523c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f3521a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f3522b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f3523c);
        StringBuilder sbL = l.a0.l("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and ");
        sbL.append(strValueOf3);
        sbL.append("=");
        sbL.append(strValueOf4);
        return new IllegalArgumentException(sbL.toString());
    }
}
