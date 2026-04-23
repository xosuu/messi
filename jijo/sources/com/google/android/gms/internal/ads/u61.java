package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class u61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tb1 f9405a = tb1.a(new byte[0]);

    public static final tb1 a(int i10) {
        return tb1.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final tb1 b(int i10) {
        return tb1.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
