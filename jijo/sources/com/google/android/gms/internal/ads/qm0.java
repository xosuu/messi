package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class qm0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8227c;

    public /* synthetic */ qm0(int i10, String str, boolean z9) {
        this.f8225a = i10;
        this.f8226b = str;
        this.f8227c = z9;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f8225a;
        boolean z9 = this.f8227c;
        String str = this.f8226b;
        switch (i10) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (str != null) {
                    Bundle bundleU = tp1.u(bundle, "pii");
                    bundleU.putString("afai", str);
                    bundleU.putBoolean("is_afai_lat", z9);
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                bundle2.putString("gct", str);
                if (z9) {
                    bundle2.putString("de", "1");
                }
                break;
        }
    }
}
