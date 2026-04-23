package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzcb;

/* JADX INFO: loaded from: classes.dex */
public final class kg implements b60, s60, fq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6279b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6280d;

    public /* synthetic */ kg(int i10, String str, String str2) {
        this.f6278a = i10;
        this.f6279b = str;
        this.f6280d = str2;
    }

    public static kg a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        return new kg(4, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        switch (this.f6278a) {
            case 1:
                ((kl0) obj).onAppEvent(this.f6279b, this.f6280d);
                break;
            case 2:
                ((d70) obj).a(this.f6279b, this.f6280d);
                break;
            default:
                ((zzcb) obj).zzc(this.f6279b, this.f6280d);
                break;
        }
    }
}
