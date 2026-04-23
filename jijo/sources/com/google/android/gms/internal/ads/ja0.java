package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ja0 implements q90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo f5867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v40 f5868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j40 f5869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p70 f5870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f5871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fr0 f5872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f5873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final or0 f5874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5875i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5876j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5877k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ao f5878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bo f5879m;

    public ja0(ao aoVar, bo boVar, eo eoVar, v40 v40Var, j40 j40Var, p70 p70Var, Context context, fr0 fr0Var, VersionInfoParcel versionInfoParcel, or0 or0Var) {
        this.f5878l = aoVar;
        this.f5879m = boVar;
        this.f5867a = eoVar;
        this.f5868b = v40Var;
        this.f5869c = j40Var;
        this.f5870d = p70Var;
        this.f5871e = context;
        this.f5872f = fr0Var;
        this.f5873g = versionInfoParcel;
        this.f5874h = or0Var;
    }

    public static final HashMap r(Map map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            synchronized (map) {
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        View view = (View) ((WeakReference) entry.getValue()).get();
                        if (view != null) {
                            map2.put((String) entry.getKey(), view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final JSONObject b(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void c(dk dkVar) {
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void d(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void e(View view, View view2, Map map, Map map2, boolean z9, ImageView.ScaleType scaleType, int i10) {
        if (!this.f5876j) {
            zzm.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f5872f.L) {
            q(view2);
        } else {
            zzm.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void f(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.f5875i) {
                this.f5875i = zzu.zzs().zzn(this.f5871e, this.f5873g.afmaVersion, this.f5872f.C.toString(), this.f5874h.f7646f);
            }
            if (this.f5877k) {
                eo eoVar = this.f5867a;
                v40 v40Var = this.f5868b;
                if (eoVar != null && !eoVar.zzB()) {
                    eoVar.zzx();
                    v40Var.zza();
                    return;
                }
                ao aoVar = this.f5878l;
                if (aoVar != null) {
                    Parcel parcelT = aoVar.t(aoVar.m(), 13);
                    ClassLoader classLoader = qb.f8146a;
                    boolean z9 = parcelT.readInt() != 0;
                    parcelT.recycle();
                    if (!z9) {
                        aoVar.a0(aoVar.m(), 10);
                        v40Var.zza();
                        return;
                    }
                }
                bo boVar = this.f5879m;
                if (boVar != null) {
                    Parcel parcelT2 = boVar.t(boVar.m(), 11);
                    ClassLoader classLoader2 = qb.f8146a;
                    boolean z10 = parcelT2.readInt() != 0;
                    parcelT2.recycle();
                    if (z10) {
                        return;
                    }
                    boVar.a0(boVar.m(), 8);
                    v40Var.zza();
                }
            }
        } catch (RemoteException e10) {
            zzm.zzk("Failed to call recordImpression", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final boolean g(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void h(View view) {
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void i(MotionEvent motionEvent, View view) {
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7 A[Catch: RemoteException -> 0x0035, JSONException -> 0x0053, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0053, blocks: (B:47:0x00bc, B:48:0x00d1, B:50:0x00d7), top: B:71:0x00bc }] */
    @Override // com.google.android.gms.internal.ads.q90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.view.View r16, java.util.Map r17, java.util.Map r18, android.view.View.OnTouchListener r19, android.view.View.OnClickListener r20) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ja0.j(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void k(View view) {
        try {
            a4.b bVar = new a4.b(view);
            eo eoVar = this.f5867a;
            if (eoVar != null) {
                eoVar.T0(bVar);
                return;
            }
            ao aoVar = this.f5878l;
            if (aoVar != null) {
                Parcel parcelM = aoVar.m();
                qb.e(parcelM, bVar);
                aoVar.a0(parcelM, 16);
            } else {
                bo boVar = this.f5879m;
                if (boVar != null) {
                    Parcel parcelM2 = boVar.m();
                    qb.e(parcelM2, bVar);
                    boVar.a0(parcelM2, 14);
                }
            }
        } catch (RemoteException e10) {
            zzm.zzk("Failed to call untrackView", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void l(String str) {
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void m(zzcw zzcwVar) {
        zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final JSONObject n(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void o(View view, View view2, Map map, Map map2, boolean z9, ImageView.ScaleType scaleType) {
        if (this.f5876j && this.f5872f.L) {
            return;
        }
        q(view);
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void p(Bundle bundle) {
    }

    public final void q(View view) {
        eo eoVar = this.f5867a;
        p70 p70Var = this.f5870d;
        j40 j40Var = this.f5869c;
        if (eoVar != null) {
            try {
                if (!eoVar.zzA()) {
                    eoVar.d0(new a4.b(view));
                    j40Var.onAdClicked();
                    if (((Boolean) zzba.zzc().a(eg.R9)).booleanValue()) {
                        p70Var.L();
                        return;
                    }
                    return;
                }
            } catch (RemoteException e10) {
                zzm.zzk("Failed to call handleClick", e10);
                return;
            }
        }
        ao aoVar = this.f5878l;
        if (aoVar != null) {
            Parcel parcelT = aoVar.t(aoVar.m(), 14);
            ClassLoader classLoader = qb.f8146a;
            boolean z9 = parcelT.readInt() != 0;
            parcelT.recycle();
            if (!z9) {
                a4.b bVar = new a4.b(view);
                Parcel parcelM = aoVar.m();
                qb.e(parcelM, bVar);
                aoVar.a0(parcelM, 11);
                j40Var.onAdClicked();
                if (((Boolean) zzba.zzc().a(eg.R9)).booleanValue()) {
                    p70Var.L();
                    return;
                }
                return;
            }
        }
        bo boVar = this.f5879m;
        if (boVar != null) {
            Parcel parcelT2 = boVar.t(boVar.m(), 12);
            ClassLoader classLoader2 = qb.f8146a;
            boolean z10 = parcelT2.readInt() != 0;
            parcelT2.recycle();
            if (z10) {
                return;
            }
            a4.b bVar2 = new a4.b(view);
            Parcel parcelM2 = boVar.m();
            qb.e(parcelM2, bVar2);
            boVar.a0(parcelM2, 9);
            j40Var.onAdClicked();
            if (((Boolean) zzba.zzc().a(eg.R9)).booleanValue()) {
                p70Var.L();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final boolean zzB() {
        return this.f5872f.L;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.q90
    public final void zzv() {
        this.f5876j = true;
    }
}
