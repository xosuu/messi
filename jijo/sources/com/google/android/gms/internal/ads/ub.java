package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f9445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9448e;

    public ub(String str, VersionInfoParcel versionInfoParcel, String str2, JSONObject jSONObject, boolean z9) {
        this.f9447d = versionInfoParcel.afmaVersion;
        this.f9445b = jSONObject;
        this.f9446c = str;
        this.f9444a = str2;
        this.f9448e = z9;
    }
}
