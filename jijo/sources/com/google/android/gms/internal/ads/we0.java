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
public final class we0 extends fw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SensorManager f10160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Sensor f10161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ve0 f10164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10165g;

    public we0(Context context) {
        this.f10159a = context;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) zzba.zzc().a(eg.f3987e8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            float f13 = f12 * f12;
            if (((float) Math.sqrt(f13 + (f11 * f11) + (f10 * f10))) >= ((Float) zzba.zzc().a(eg.f3998f8)).floatValue()) {
                ((y3.b) zzu.zzB()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f10162d + ((long) ((Integer) zzba.zzc().a(eg.f4009g8)).intValue()) <= jCurrentTimeMillis) {
                    if (this.f10162d + ((long) ((Integer) zzba.zzc().a(eg.f4020h8)).intValue()) < jCurrentTimeMillis) {
                        this.f10163e = 0;
                    }
                    zze.zza("Shake detected.");
                    this.f10162d = jCurrentTimeMillis;
                    int i10 = this.f10163e + 1;
                    this.f10163e = i10;
                    ve0 ve0Var = this.f10164f;
                    if (ve0Var != null) {
                        if (i10 == ((Integer) zzba.zzc().a(eg.f4031i8)).intValue()) {
                            ((le0) ve0Var).d(new j3.r(1), ke0.f6265d);
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (this.f10165g) {
                    SensorManager sensorManager = this.f10160b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f10161c);
                        zze.zza("Stopped listening for shake gestures.");
                    }
                    this.f10165g = false;
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
                if (((Boolean) zzba.zzc().a(eg.f3987e8)).booleanValue()) {
                    if (this.f10160b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f10159a.getSystemService("sensor");
                        this.f10160b = sensorManager2;
                        if (sensorManager2 == null) {
                            zzm.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f10161c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f10165g && (sensorManager = this.f10160b) != null && (sensor = this.f10161c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        ((y3.b) zzu.zzB()).getClass();
                        this.f10162d = System.currentTimeMillis() - ((long) ((Integer) zzba.zzc().a(eg.f4009g8)).intValue());
                        this.f10165g = true;
                        zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
