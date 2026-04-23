package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class de0 extends fw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SensorManager f3622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sensor f3623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3624c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f3625d = Float.valueOf(0.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public le0 f3630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3631j;

    public de0(Context context) {
        ((y3.b) zzu.zzB()).getClass();
        this.f3626e = System.currentTimeMillis();
        this.f3627f = 0;
        this.f3628g = false;
        this.f3629h = false;
        this.f3630i = null;
        this.f3631j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f3622a = sensorManager;
        if (sensorManager != null) {
            this.f3623b = sensorManager.getDefaultSensor(4);
        } else {
            this.f3623b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) zzba.zzc().a(eg.f4042j8)).booleanValue()) {
            ((y3.b) zzu.zzB()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f3626e + ((long) ((Integer) zzba.zzc().a(eg.f4063l8)).intValue()) < jCurrentTimeMillis) {
                this.f3627f = 0;
                this.f3626e = jCurrentTimeMillis;
                this.f3628g = false;
                this.f3629h = false;
                this.f3624c = this.f3625d.floatValue();
            }
            Float fValueOf = Float.valueOf(this.f3625d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f3625d = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f10 = this.f3624c;
            xf xfVar = eg.f4052k8;
            if (fFloatValue > ((Float) zzba.zzc().a(xfVar)).floatValue() + f10) {
                this.f3624c = this.f3625d.floatValue();
                this.f3629h = true;
            } else if (this.f3625d.floatValue() < this.f3624c - ((Float) zzba.zzc().a(xfVar)).floatValue()) {
                this.f3624c = this.f3625d.floatValue();
                this.f3628g = true;
            }
            if (this.f3625d.isInfinite()) {
                this.f3625d = Float.valueOf(0.0f);
                this.f3624c = 0.0f;
            }
            if (this.f3628g && this.f3629h) {
                zze.zza("Flick detected.");
                this.f3626e = jCurrentTimeMillis;
                int i10 = this.f3627f + 1;
                this.f3627f = i10;
                this.f3628g = false;
                this.f3629h = false;
                le0 le0Var = this.f3630i;
                if (le0Var != null) {
                    if (i10 == ((Integer) zzba.zzc().a(eg.f4073m8)).intValue()) {
                        le0Var.d(new j3.r(2), ke0.f6265d);
                    }
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.f3631j && (sensorManager = this.f3622a) != null && (sensor = this.f3623b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f3631j = false;
                    zze.zza("Stopped listening for flick gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) zzba.zzc().a(eg.f4042j8)).booleanValue()) {
                    if (!this.f3631j && (sensorManager = this.f3622a) != null && (sensor = this.f3623b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f3631j = true;
                        zze.zza("Listening for flick gestures.");
                    }
                    if (this.f3622a == null || this.f3623b == null) {
                        zzm.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
