package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class gn implements el {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tm f4996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qu f4997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hn f4998c;

    public gn(hn hnVar, tm tmVar, qu quVar) {
        this.f4998c = hnVar;
        this.f4996a = tmVar;
        this.f4997b = quVar;
    }

    @Override // com.google.android.gms.internal.ads.el
    public final void a(JSONObject jSONObject) {
        tm tmVar = this.f4996a;
        qu quVar = this.f4997b;
        try {
            try {
                quVar.b(((cn) this.f4998c.f5350c).i(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e10) {
                quVar.c(e10);
            }
        } finally {
            tmVar.o();
        }
    }

    @Override // com.google.android.gms.internal.ads.el
    public final void zza(String str) {
        tm tmVar = this.f4996a;
        qu quVar = this.f4997b;
        try {
            if (str == null) {
                quVar.c(new zzbnd());
            } else {
                quVar.c(new zzbnd(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            tmVar.o();
            throw th;
        }
        tmVar.o();
    }
}
