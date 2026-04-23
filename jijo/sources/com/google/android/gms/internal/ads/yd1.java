package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yd1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final yd1 f10857c = new yd1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10859b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md1 f10858a = new md1();

    public final ge1 a(Class cls) {
        Charset charset = ed1.f3910a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f10859b;
        ge1 ge1VarZ = (ge1) concurrentHashMap.get(cls);
        if (ge1VarZ == null) {
            md1 md1Var = this.f10858a;
            md1Var.getClass();
            qz qzVar = he1.f5269a;
            wc1.class.isAssignableFrom(cls);
            pd1 pd1VarJ = md1Var.f6920a.j(cls);
            ae1 ae1Var = (ae1) pd1VarJ;
            if ((ae1Var.f2672d & 2) == 2) {
                qz qzVar2 = he1.f5269a;
                qz qzVar3 = qc1.f8157a;
                ge1VarZ = new ud1(qzVar2, ae1Var.f2669a);
            } else {
                int i10 = vd1.f9834a;
                int i11 = id1.f5578a;
                qz qzVar4 = he1.f5269a;
                qz qzVar5 = ae1Var.b() + (-1) != 1 ? qc1.f8157a : null;
                int i12 = od1.f7560a;
                ge1VarZ = td1.z(pd1VarJ, qzVar4, qzVar5);
            }
            ge1 ge1Var = (ge1) concurrentHashMap.putIfAbsent(cls, ge1VarZ);
            if (ge1Var != null) {
                return ge1Var;
            }
        }
        return ge1VarZ;
    }
}
