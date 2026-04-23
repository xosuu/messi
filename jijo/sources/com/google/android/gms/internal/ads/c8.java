package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class c8 extends yg1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3228u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(String str, int i10) {
        super(str);
        this.f3228u = i10;
        if (i10 != 1) {
        } else {
            super("eof ");
        }
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void c(ByteBuffer byteBuffer) {
        switch (this.f3228u) {
            case 0:
                byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
                break;
        }
    }
}
