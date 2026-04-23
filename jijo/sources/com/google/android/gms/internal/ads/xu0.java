package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class xu0 extends yu0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f10652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f10653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10654e;

    public xu0(ok0 ok0Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(ok0Var);
        this.f10652c = new HashSet(hashSet);
        this.f10653d = jSONObject;
        this.f10654e = j10;
    }
}
