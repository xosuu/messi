package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class fn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pe f4576b = new pe(11);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pe f4577c = new pe(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ym f4578a;

    public fn(Context context, VersionInfoParcel versionInfoParcel, String str, gt0 gt0Var) {
        this.f4578a = new ym(context, versionInfoParcel, str, gt0Var);
    }

    public final hn a(String str, dn dnVar, cn cnVar) {
        return new hn(this.f4578a, str, dnVar, cnVar);
    }
}
