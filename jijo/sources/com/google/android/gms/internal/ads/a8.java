package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a8 extends zg1 implements y7 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f2619t = "moov";

    @Override // com.google.android.gms.internal.ads.y7
    public final void a(zv zvVar, ByteBuffer byteBuffer, long j10, w7 w7Var) {
        zvVar.c();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f11235b = zvVar;
        this.f11237f = zvVar.c();
        zvVar.f11328a.position((int) (zvVar.c() + j10));
        this.f11238h = zvVar.c();
        this.f11234a = w7Var;
    }

    @Override // com.google.android.gms.internal.ads.y7
    public final String zza() {
        return this.f2619t;
    }
}
