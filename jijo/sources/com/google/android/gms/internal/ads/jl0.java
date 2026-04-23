package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class jl0 implements l90 {
    public final tm0 a(Looper looper, Handler.Callback callback) {
        return new tm0(new Handler(looper, callback));
    }
}
