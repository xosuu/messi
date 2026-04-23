package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class pc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile pc1 f7857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pc1 f7858b = new pc1();

    public pc1() {
        Collections.emptyMap();
    }

    public static pc1 a() {
        yd1 yd1Var = yd1.f10857c;
        return f7858b;
    }

    public static pc1 b() {
        pc1 pc1Var = f7857a;
        if (pc1Var != null) {
            return pc1Var;
        }
        synchronized (pc1.class) {
            try {
                pc1 pc1Var2 = f7857a;
                if (pc1Var2 != null) {
                    return pc1Var2;
                }
                yd1 yd1Var = yd1.f10857c;
                pc1 pc1VarT = tc1.t();
                f7857a = pc1VarT;
                return pc1VarT;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
