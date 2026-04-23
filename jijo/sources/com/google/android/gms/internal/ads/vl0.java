package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class vl0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9910b;

    public /* synthetic */ vl0(int i10, boolean z9) {
        this.f9909a = i10;
        this.f9910b = z9;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f9909a;
        boolean z9 = this.f9910b;
        switch (i10) {
            case 0:
                ((Bundle) obj).putString("adid_p", true != z9 ? "0" : "1");
                break;
            case 1:
                ((Bundle) obj).putBoolean("ibrr", z9);
                break;
            default:
                ((Bundle) obj).putBoolean("is_gbid", z9);
                break;
        }
    }
}
