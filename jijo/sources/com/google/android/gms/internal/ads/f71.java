package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class f71 implements i71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tb1 f4422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ec1 f4423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ua1 f4425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f4426f;

    public f71(String str, tb1 tb1Var, ec1 ec1Var, int i10, ua1 ua1Var, Integer num) {
        this.f4421a = str;
        this.f4422b = tb1Var;
        this.f4423c = ec1Var;
        this.f4424d = i10;
        this.f4425e = ua1Var;
        this.f4426f = num;
    }

    public static f71 a(String str, ec1 ec1Var, int i10, ua1 ua1Var, Integer num) {
        if (ua1Var == ua1.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new f71(str, n71.a(str), ec1Var, i10, ua1Var, num);
    }
}
