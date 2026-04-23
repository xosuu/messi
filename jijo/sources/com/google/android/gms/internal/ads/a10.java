package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a10 implements wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fx f2555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f2556b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w00 f2557d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y3.a f2558f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2559h = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2560q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x00 f2561s = new x00();

    public a10(Executor executor, w00 w00Var, y3.a aVar) {
        this.f2556b = executor;
        this.f2557d = w00Var;
        this.f2558f = aVar;
    }

    @Override // com.google.android.gms.internal.ads.wb
    public final void Z(vb vbVar) {
        boolean z9 = this.f2560q ? false : vbVar.f9827j;
        x00 x00Var = this.f2561s;
        x00Var.f10392a = z9;
        ((y3.b) this.f2558f).getClass();
        x00Var.f10394c = SystemClock.elapsedRealtime();
        x00Var.f10396e = vbVar;
        if (this.f2559h) {
            a();
        }
    }

    public final void a() {
        try {
            JSONObject jSONObjectA = this.f2557d.a(this.f2561s);
            if (this.f2555a != null) {
                this.f2556b.execute(new vm(this, 20, jSONObjectA));
            }
        } catch (JSONException e10) {
            zze.zzb("Failed to call video active view js", e10);
        }
    }
}
