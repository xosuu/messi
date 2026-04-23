package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y00 implements wb, x40, zzp, w40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v00 f10692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w00 f10693b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jn f10695f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f10696h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y3.a f10697q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f10694d = new HashSet();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f10698s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x00 f10699t = new x00();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10700u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WeakReference f10701v = new WeakReference(this);

    public y00(kn knVar, w00 w00Var, Executor executor, v00 v00Var, y3.a aVar) {
        this.f10692a = v00Var;
        Charset charset = en.f4243a;
        knVar.a();
        this.f10695f = new jn(knVar.f6338b);
        this.f10693b = w00Var;
        this.f10696h = executor;
        this.f10697q = aVar;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final synchronized void L(Context context) {
        this.f10699t.f10393b = false;
        a();
    }

    @Override // com.google.android.gms.internal.ads.wb
    public final synchronized void Z(vb vbVar) {
        x00 x00Var = this.f10699t;
        x00Var.f10392a = vbVar.f9827j;
        x00Var.f10396e = vbVar;
        a();
    }

    public final synchronized void a() {
        try {
            if (this.f10701v.get() == null) {
                b();
                return;
            }
            if (this.f10700u || !this.f10698s.get()) {
                return;
            }
            try {
                x00 x00Var = this.f10699t;
                ((y3.b) this.f10697q).getClass();
                x00Var.f10394c = SystemClock.elapsedRealtime();
                JSONObject jSONObjectA = this.f10693b.a(this.f10699t);
                Iterator it = this.f10694d.iterator();
                while (it.hasNext()) {
                    this.f10696h.execute(new vm((fx) it.next(), 19, jSONObjectA));
                }
                jn jnVar = this.f10695f;
                jnVar.getClass();
                jn jnVar2 = new jn(jnVar, 1, jSONObjectA);
                n5.a aVar = (n5.a) jnVar.f6003c;
                mu muVar = nu.f7388f;
                tc1.u0(tc1.q0(aVar, jnVar2, muVar), new pu("ActiveViewListener.callActiveViewJs"), muVar);
            } catch (Exception e10) {
                zze.zzb("Failed to call ActiveViewJS", e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        j();
        this.f10700u = true;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final synchronized void h(Context context) {
        this.f10699t.f10393b = true;
        a();
    }

    public final void j() {
        Iterator it = this.f10694d.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            v00 v00Var = this.f10692a;
            if (!zHasNext) {
                u00 u00Var = v00Var.f9717e;
                kn knVar = v00Var.f9714b;
                n5.a aVar = knVar.f6338b;
                int i10 = 0;
                in inVar = new in(str2, i10, u00Var);
                mu muVar = nu.f7388f;
                s11 s11VarO0 = tc1.o0(aVar, inVar, muVar);
                knVar.f6338b = s11VarO0;
                knVar.f6338b = tc1.o0(s11VarO0, new in(str, i10, v00Var.f9718f), muVar);
                return;
            }
            fx fxVar = (fx) it.next();
            fxVar.M("/updateActiveView", v00Var.f9717e);
            fxVar.M("/untrackActiveViewUnit", v00Var.f9718f);
        }
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final synchronized void z(Context context) {
        this.f10699t.f10395d = "u";
        a();
        j();
        this.f10700u = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdH() {
        this.f10699t.f10393b = false;
        a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdk() {
        this.f10699t.f10393b = true;
        a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.w40
    public final synchronized void zzr() {
        int i10 = 0;
        if (this.f10698s.compareAndSet(false, true)) {
            v00 v00Var = this.f10692a;
            u00 u00Var = v00Var.f9717e;
            kn knVar = v00Var.f9714b;
            knVar.a();
            n5.a aVar = knVar.f6338b;
            jn jnVar = new jn("/updateActiveView", i10, u00Var);
            mu muVar = nu.f7388f;
            knVar.f6338b = tc1.q0(aVar, jnVar, muVar);
            u00 u00Var2 = v00Var.f9718f;
            knVar.a();
            knVar.f6338b = tc1.q0(knVar.f6338b, new jn("/untrackActiveViewUnit", i10, u00Var2), muVar);
            v00Var.f9716d = this;
            a();
        }
    }
}
