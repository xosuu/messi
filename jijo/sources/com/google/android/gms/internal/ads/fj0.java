package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class fj0 implements ei0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rc0 f4537a;

    public fj0(rc0 rc0Var) {
        this.f4537a = rc0Var;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final fi0 a(JSONObject jSONObject, String str) {
        return new fi0(this.f4537a.b(jSONObject, str), new zi0(), str);
    }
}
