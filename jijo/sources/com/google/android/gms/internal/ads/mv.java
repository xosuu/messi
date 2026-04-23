package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class mv extends fw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SensorManager f7057a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Display f7059c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f7062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ew0 f7063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public lv f7064h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f7060d = new float[9];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f7061e = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7058b = new Object();

    public mv(Context context) {
        this.f7057a = (SensorManager) context.getSystemService("sensor");
        this.f7059c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f7058b) {
            try {
                if (this.f7062f == null) {
                    this.f7062f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f7060d, fArr);
        int rotation = this.f7059c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f7060d, 2, 129, this.f7061e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f7060d, 129, 130, this.f7061e);
        } else if (rotation != 3) {
            System.arraycopy(this.f7060d, 0, this.f7061e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f7060d, 130, 1, this.f7061e);
        }
        float[] fArr2 = this.f7061e;
        float f10 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f10;
        float f11 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f11;
        float f12 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f12;
        synchronized (this.f7058b) {
            System.arraycopy(this.f7061e, 0, this.f7062f, 0, 9);
        }
        lv lvVar = this.f7064h;
        if (lvVar != null) {
            ((nv) lvVar).a();
        }
    }

    public final void b() {
        if (this.f7063g == null) {
            return;
        }
        this.f7057a.unregisterListener(this);
        this.f7063g.post(new k9(2, 0));
        this.f7063g = null;
    }

    public final boolean c(float[] fArr) {
        synchronized (this.f7058b) {
            try {
                float[] fArr2 = this.f7062f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
