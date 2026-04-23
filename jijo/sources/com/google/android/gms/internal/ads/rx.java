package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rx extends zzdp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pv f8705a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8707d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8708f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8709h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public zzdt f8710q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8711s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f8713u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f8714v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f8715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8717y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public sj f8718z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8706b = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8712t = true;

    public rx(pv pvVar, float f10, boolean z9, boolean z10) {
        this.f8705a = pvVar;
        this.f8713u = f10;
        this.f8707d = z9;
        this.f8708f = z10;
    }

    public final void u1(float f10, float f11, int i10, boolean z9, float f12) {
        boolean z10;
        boolean z11;
        int i11;
        synchronized (this.f8706b) {
            try {
                z10 = true;
                if (f11 == this.f8713u && f12 == this.f8715w) {
                    z10 = false;
                }
                this.f8713u = f11;
                if (!((Boolean) zzba.zzc().a(eg.Pb)).booleanValue()) {
                    this.f8714v = f10;
                }
                z11 = this.f8712t;
                this.f8712t = z9;
                i11 = this.f8709h;
                this.f8709h = i10;
                float f13 = this.f8715w;
                this.f8715w = f12;
                if (Math.abs(f12 - f13) > 1.0E-4f) {
                    this.f8705a.d().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            try {
                sj sjVar = this.f8718z;
                if (sjVar != null) {
                    sjVar.a0(sjVar.m(), 2);
                }
            } catch (RemoteException e10) {
                zzm.zzl("#007 Could not call remote method.", e10);
            }
        }
        nu.f7387e.execute(new qx(this, i11, i10, z11, z9));
    }

    public final void v1(zzfk zzfkVar) {
        Object obj = this.f8706b;
        boolean z9 = zzfkVar.zza;
        boolean z10 = zzfkVar.zzb;
        boolean z11 = zzfkVar.zzc;
        synchronized (obj) {
            this.f8716x = z10;
            this.f8717y = z11;
        }
        String str = true != z9 ? "0" : "1";
        String str2 = true != z10 ? "0" : "1";
        String str3 = true != z11 ? "0" : "1";
        s.b bVar = new s.b(3);
        bVar.put("muteStart", str);
        bVar.put("customControlsRequested", str2);
        bVar.put("clickToExpandRequested", str3);
        w1("initialState", Collections.unmodifiableMap(bVar));
    }

    public final void w1(String str, Map map) {
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        nu.f7387e.execute(new vm(this, 17, map2));
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        float f10;
        synchronized (this.f8706b) {
            f10 = this.f8715w;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        float f10;
        synchronized (this.f8706b) {
            f10 = this.f8714v;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        float f10;
        synchronized (this.f8706b) {
            f10 = this.f8713u;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        int i10;
        synchronized (this.f8706b) {
            i10 = this.f8709h;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() {
        zzdt zzdtVar;
        synchronized (this.f8706b) {
            zzdtVar = this.f8710q;
        }
        return zzdtVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z9) {
        w1(true != z9 ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        w1("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        w1("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdtVar) {
        synchronized (this.f8706b) {
            this.f8710q = zzdtVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        w1("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        boolean z9;
        Object obj = this.f8706b;
        boolean zZzp = zzp();
        synchronized (obj) {
            z9 = false;
            if (!zZzp) {
                try {
                    if (this.f8717y && this.f8708f) {
                        z9 = true;
                    }
                } finally {
                }
            }
        }
        return z9;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        boolean z9;
        synchronized (this.f8706b) {
            try {
                z9 = false;
                if (this.f8707d && this.f8716x) {
                    z9 = true;
                }
            } finally {
            }
        }
        return z9;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        boolean z9;
        synchronized (this.f8706b) {
            z9 = this.f8712t;
        }
        return z9;
    }

    public final void zzu() {
        boolean z9;
        int i10;
        int i11;
        synchronized (this.f8706b) {
            z9 = this.f8712t;
            i10 = this.f8709h;
            i11 = 3;
            this.f8709h = 3;
        }
        nu.f7387e.execute(new qx(this, i10, i11, z9, z9));
    }
}
