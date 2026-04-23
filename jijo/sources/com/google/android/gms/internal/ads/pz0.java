package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class pz0 extends t3.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f8039b;

    public pz0(uz0 uz0Var) {
        this.f8039b = uz0Var;
    }

    @Override // t3.i
    public final Map E() {
        return new TreeMap(this.f8039b);
    }
}
