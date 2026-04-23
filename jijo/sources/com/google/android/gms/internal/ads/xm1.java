package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class xm1 extends wf1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10620l;

    @Override // com.google.android.gms.internal.ads.wf1
    public final void d() {
        super.d();
        this.f10619k = 0;
    }

    public final boolean h(wf1 wf1Var) {
        ByteBuffer byteBuffer;
        tc1.K(!wf1Var.a(1073741824));
        tc1.K(!wf1Var.a(268435456));
        tc1.K(!wf1Var.a(4));
        if (i()) {
            if (this.f10619k >= this.f10620l) {
                return false;
            }
            ByteBuffer byteBuffer2 = wf1Var.f10171e;
            if (byteBuffer2 != null && (byteBuffer = this.f10171e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.f10619k;
        this.f10619k = i10 + 1;
        if (i10 == 0) {
            this.f10173g = wf1Var.f10173g;
            if (wf1Var.a(1)) {
                this.f9035b = 1;
            }
        }
        ByteBuffer byteBuffer3 = wf1Var.f10171e;
        if (byteBuffer3 != null) {
            e(byteBuffer3.remaining());
            this.f10171e.put(byteBuffer3);
        }
        this.f10618j = wf1Var.f10173g;
        return true;
    }

    public final boolean i() {
        return this.f10619k > 0;
    }
}
