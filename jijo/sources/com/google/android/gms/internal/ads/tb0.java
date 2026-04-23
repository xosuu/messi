package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zza f9097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f9098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ed0 f9099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f9100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y9 f9101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f9102g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lh0 f9104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vt0 f9105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qh0 f9106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final pr0 f9107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s11 f9108m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob0 f9096a = new ob0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tk f9103h = new tk();

    public tb0(rb0 rb0Var) {
        this.f9098c = rb0Var.f8558b;
        this.f9100e = rb0Var.f8561e;
        this.f9101f = rb0Var.f8562f;
        this.f9102g = rb0Var.f8563g;
        this.f9097b = rb0Var.f8557a;
        this.f9104i = rb0Var.f8560d;
        this.f9105j = rb0Var.f8564h;
        this.f9099d = rb0Var.f8559c;
        this.f9106k = rb0Var.f8565i;
        this.f9107l = rb0Var.f8566j;
    }

    public final synchronized n5.a a(JSONObject jSONObject, String str) {
        s11 s11Var = this.f9108m;
        if (s11Var == null) {
            return tc1.d0(null);
        }
        return tc1.q0(s11Var, new v20(this, str, jSONObject, 1), this.f9100e);
    }

    public final synchronized void b(Map map) {
        s11 s11Var = this.f9108m;
        if (s11Var == null) {
            return;
        }
        tc1.u0(s11Var, new m20(map), this.f9100e);
    }

    public final synchronized void c(String str, wk wkVar) {
        s11 s11Var = this.f9108m;
        if (s11Var == null) {
            return;
        }
        tc1.u0(s11Var, new m20(str, wkVar, 21), this.f9100e);
    }

    public final synchronized void d(String str, wk wkVar) {
        s11 s11Var = this.f9108m;
        if (s11Var == null) {
            return;
        }
        tc1.u0(s11Var, new p80(str, wkVar, 23, 0), this.f9100e);
    }
}
