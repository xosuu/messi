package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class w41 extends s31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y41 f10060b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f10061d;

    public w41(y41 y41Var, tb1 tb1Var, Integer num) {
        super(3);
        this.f10060b = y41Var;
        this.f10061d = num;
    }

    public static w41 q(y41 y41Var, Integer num) throws GeneralSecurityException {
        tb1 tb1VarA;
        x41 x41Var = y41Var.f10769b;
        if (x41Var == x41.f10426b) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            tb1VarA = tb1.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (x41Var != x41.f10427c) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(y41Var.f10769b.f10428a));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            tb1VarA = tb1.a(new byte[0]);
        }
        return new w41(y41Var, tb1VarA, num);
    }
}
