package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class o31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7500a = 0;

    static {
        Logger.getLogger(o31.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(a31.class);
        hashSet.add(b31.class);
        hashSet.add(p31.class);
        hashSet.add(d31.class);
        hashSet.add(c31.class);
        hashSet.add(k31.class);
        hashSet.add(j81.class);
        hashSet.add(m31.class);
        hashSet.add(n31.class);
        Collections.unmodifiableSet(hashSet);
    }

    public static Object a(z91 z91Var, Class cls) throws GeneralSecurityException {
        String strE = z91Var.E();
        ec1 ec1VarD = z91Var.D();
        e61 e61VarC = z51.f11154d.c(strE);
        boolean zEquals = e61VarC.f3874b.equals(cls);
        Class cls2 = e61VarC.f3874b;
        if (zEquals) {
            ua1 ua1Var = ua1.RAW;
            return s61.f8810b.b(t61.f9074b.a(f71.a(e61VarC.f3873a, ec1VarD, e61VarC.f3875c, ua1Var, null)), cls2);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(e61.class);
        String string = cls2.toString();
        StringBuilder sbL = l.a0.l("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbL.append(string);
        throw new GeneralSecurityException(sbL.toString());
    }
}
