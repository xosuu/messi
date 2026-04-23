package com.google.android.gms.ads.mediation.customevent;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class CustomEventExtras {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2323a = new HashMap();

    public Object getExtra(String str) {
        return this.f2323a.get(str);
    }

    public void setExtra(String str, Object obj) {
        this.f2323a.put(str, obj);
    }
}
