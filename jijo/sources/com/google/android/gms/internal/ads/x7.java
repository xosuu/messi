package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class x7 extends zg1 {
    static {
        q7.b.v(x7.class);
    }

    public x7(zv zvVar, bw bwVar) {
        ByteBuffer byteBuffer = zvVar.f11328a;
        long jLimit = byteBuffer.limit();
        this.f11235b = zvVar;
        this.f11237f = zvVar.c();
        byteBuffer.position((int) (zvVar.c() + jLimit));
        this.f11238h = zvVar.c();
        this.f11234a = bwVar;
    }

    @Override // com.google.android.gms.internal.ads.zg1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final String toString() {
        String string = this.f11235b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
