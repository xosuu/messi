package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class qb1 extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lj0 f8155a;

    public qb1(lj0 lj0Var) {
        this.f8155a = lj0Var;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        lj0 lj0Var = this.f8155a;
        try {
            eb1 eb1Var = eb1.f3897c;
            Mac mac = (Mac) eb1Var.f3898a.zza((String) lj0Var.f6645d);
            mac.init((Key) lj0Var.f6646f);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
