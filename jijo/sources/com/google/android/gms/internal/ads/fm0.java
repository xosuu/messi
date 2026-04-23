package com.google.android.gms.internal.ads;

import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class fm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f4572a;

    public final void a() {
        Message message = this.f4572a;
        message.getClass();
        message.sendToTarget();
        this.f4572a = null;
        tm0.d(this);
    }
}
