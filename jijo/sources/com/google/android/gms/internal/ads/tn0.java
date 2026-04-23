package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class tn0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f9202b;

    public /* synthetic */ tn0(Boolean bool, int i10) {
        this.f9201a = i10;
        this.f9202b = bool;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f9201a;
        Boolean bool = this.f9202b;
        switch (i10) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (bool != null) {
                    bundle.putBoolean("hw_accel", bool.booleanValue());
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                if (bool == null) {
                    bundle2.putInt("lft", -1);
                } else if (!bool.booleanValue()) {
                    bundle2.putInt("lft", 0);
                } else {
                    bundle2.putInt("lft", 1);
                }
                break;
        }
    }
}
