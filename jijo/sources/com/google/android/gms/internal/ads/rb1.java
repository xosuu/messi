package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class rb1 implements k31 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f8567e = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j81 f8568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f8570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f8571d;

    public rb1(o71 o71Var) {
        this.f8568a = new pb1(((tb1) o71Var.f7528d.f7073a).b());
        r71 r71Var = o71Var.f7527b;
        this.f8569b = r71Var.f8431b;
        this.f8570c = o71Var.f7529f.b();
        if (r71Var.f8432c.equals(q71.f8133d)) {
            this.f8571d = Arrays.copyOf(f8567e, 1);
        } else {
            this.f8571d = new byte[0];
        }
    }

    public rb1(v71 v71Var) {
        String strValueOf = String.valueOf(v71Var.f9795b.f2623d);
        this.f8568a = new lj0("HMAC".concat(strValueOf), new SecretKeySpec(((tb1) v71Var.f9796d.f7073a).b(), "HMAC"));
        a81 a81Var = v71Var.f9795b;
        this.f8569b = a81Var.f2621b;
        this.f8570c = v71Var.f9797f.b();
        if (a81Var.f2622c.equals(z71.f11180d)) {
            this.f8571d = Arrays.copyOf(f8567e, 1);
        } else {
            this.f8571d = new byte[0];
        }
    }

    public rb1(lj0 lj0Var, int i10) throws InvalidAlgorithmParameterException {
        this.f8568a = lj0Var;
        this.f8569b = i10;
        this.f8570c = new byte[0];
        this.f8571d = new byte[0];
        lj0Var.a(new byte[0], i10);
    }
}
