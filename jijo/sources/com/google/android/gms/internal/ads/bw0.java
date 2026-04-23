package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class bw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3121a = 0;

    static {
        byte b10 = (byte) (((byte) (0 | 1)) | 2);
        if (b10 == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((b10 & 2) == 0) {
            sb.append(" skipChecks");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
