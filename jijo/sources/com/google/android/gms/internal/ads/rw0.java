package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class rw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f8698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f8703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f8704g;

    public final sw0 a() {
        IBinder iBinder;
        if (this.f8704g == 31 && (iBinder = this.f8698a) != null) {
            return new sw0(iBinder, this.f8699b, this.f8700c, this.f8701d, this.f8702e, this.f8703f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f8698a == null) {
            sb.append(" windowToken");
        }
        if ((this.f8704g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f8704g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f8704g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f8704g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f8704g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
