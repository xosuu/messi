package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzu;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bl0 extends pb implements dp {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f3049h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu f3050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f3051b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3052d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3053f;

    public bl0(String str, bp bpVar, qu quVar, long j10) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.f3051b = jSONObject;
        this.f3053f = false;
        this.f3050a = quVar;
        this.f3052d = j10;
        try {
            jSONObject.put("adapter_version", bpVar.zzf().toString());
            jSONObject.put("sdk_version", bpVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final synchronized void H(zze zzeVar) {
        u1(2, zzeVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final synchronized void a(String str) {
        if (this.f3053f) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.f3051b.put("signals", str);
            if (((Boolean) zzba.zzc().a(eg.f4115r1)).booleanValue()) {
                JSONObject jSONObject = this.f3051b;
                ((y3.b) zzu.zzB()).getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f3052d);
            }
            if (((Boolean) zzba.zzc().a(eg.f4105q1)).booleanValue()) {
                this.f3051b.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f3050a.b(this.f3051b);
        this.f3053f = true;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            String string = parcel.readString();
            qb.b(parcel);
            a(string);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            qb.b(parcel);
            zzf(string2);
        } else {
            if (i10 != 3) {
                return false;
            }
            zze zzeVar = (zze) qb.a(parcel, zze.CREATOR);
            qb.b(parcel);
            H(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void u1(int i10, String str) {
        try {
            if (this.f3053f) {
                return;
            }
            try {
                this.f3051b.put("signal_error", str);
                if (((Boolean) zzba.zzc().a(eg.f4115r1)).booleanValue()) {
                    JSONObject jSONObject = this.f3051b;
                    ((y3.b) zzu.zzB()).getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f3052d);
                }
                if (((Boolean) zzba.zzc().a(eg.f4105q1)).booleanValue()) {
                    this.f3051b.put("signal_error_code", i10);
                }
            } catch (JSONException unused) {
            }
            this.f3050a.b(this.f3051b);
            this.f3053f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd() {
        if (this.f3053f) {
            return;
        }
        try {
            if (((Boolean) zzba.zzc().a(eg.f4105q1)).booleanValue()) {
                this.f3051b.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f3050a.b(this.f3051b);
        this.f3053f = true;
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final synchronized void zzf(String str) {
        u1(2, str);
    }
}
