package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class kh1 implements jh1, eh1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kh1 f6295b = new kh1(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6296a;

    public kh1(Object obj) {
        this.f6296a = obj;
    }

    public static kh1 a(Object obj) {
        if (obj != null) {
            return new kh1(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public static kh1 b(Object obj) {
        return obj == null ? f6295b : new kh1(obj);
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        return this.f6296a;
    }
}
