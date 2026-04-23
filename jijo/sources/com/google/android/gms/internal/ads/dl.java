package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class dl implements el {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qu f3692b;

    public /* synthetic */ dl(qu quVar, int i10) {
        this.f3691a = i10;
        this.f3692b = quVar;
    }

    @Override // com.google.android.gms.internal.ads.el
    public final void a(JSONObject jSONObject) {
        int i10 = this.f3691a;
        qu quVar = this.f3692b;
        switch (i10) {
            case 0:
                quVar.b(jSONObject);
                break;
            default:
                try {
                    quVar.b(jSONObject);
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e10) {
                    quVar.c(e10);
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.el
    public final void zza(String str) {
        int i10 = this.f3691a;
        qu quVar = this.f3692b;
        switch (i10) {
            case 0:
                quVar.c(new zzbnd(str));
                break;
            default:
                try {
                    if (str == null) {
                        quVar.c(new zzbnd());
                    } else {
                        quVar.c(new zzbnd(str));
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
                break;
        }
    }
}
