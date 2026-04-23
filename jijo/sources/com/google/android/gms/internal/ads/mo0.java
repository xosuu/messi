package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class mo0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f7023e;

    public mo0(String str, String str2, String str3, String str4, Long l9) {
        this.f7019a = str;
        this.f7020b = str2;
        this.f7021c = str3;
        this.f7022d = str4;
        this.f7023e = l9;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        tp1.i0("gmp_app_id", bundle, this.f7019a);
        tp1.i0("fbs_aiid", bundle, this.f7020b);
        tp1.i0("fbs_aeid", bundle, this.f7021c);
        tp1.i0("apm_id_origin", bundle, this.f7022d);
        Long l9 = this.f7023e;
        if (l9 != null) {
            bundle.putLong("sai_timeout", l9.longValue());
        }
    }
}
