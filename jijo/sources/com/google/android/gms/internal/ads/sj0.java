package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class sj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f8881e;

    public sj0(String str, String str2, int i10, long j10, Integer num) {
        this.f8877a = str;
        this.f8878b = str2;
        this.f8879c = i10;
        this.f8880d = j10;
        this.f8881e = num;
    }

    public final String toString() {
        Integer num;
        String strX = this.f8877a + "." + this.f8879c + "." + this.f8880d;
        String str = this.f8878b;
        if (!TextUtils.isEmpty(str)) {
            strX = fb1.x(strX, ".", str);
        }
        if (!((Boolean) zzba.zzc().a(eg.f4125s1)).booleanValue() || (num = this.f8881e) == null || TextUtils.isEmpty(str)) {
            return strX;
        }
        return strX + "." + num;
    }
}
