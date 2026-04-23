package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6130a;

    public final long a(ByteBuffer byteBuffer) {
        b8 b8Var;
        a8 a8Var;
        long j10 = this.f6130a;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            x7 x7Var = new x7(new zv(byteBufferDuplicate), bw.f3120c);
            zv zvVar = x7Var.f11235b;
            ArrayList arrayList = x7Var.f11239q;
            List ch1Var = arrayList;
            if (zvVar != null) {
                ch1Var = arrayList;
                if (x7Var.f11236d != zg1.f11233s) {
                    ch1Var = new ch1(arrayList, x7Var);
                }
            }
            Iterator it = ch1Var.iterator();
            while (true) {
                b8Var = null;
                if (!it.hasNext()) {
                    a8Var = null;
                    break;
                }
                y7 y7Var = (y7) it.next();
                if (y7Var instanceof a8) {
                    a8Var = (a8) y7Var;
                    break;
                }
            }
            zv zvVar2 = a8Var.f11235b;
            ArrayList arrayList2 = a8Var.f11239q;
            List ch1Var2 = arrayList2;
            if (zvVar2 != null) {
                ch1Var2 = arrayList2;
                if (a8Var.f11236d != zg1.f11233s) {
                    ch1Var2 = new ch1(arrayList2, a8Var);
                }
            }
            Iterator it2 = ch1Var2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                y7 y7Var2 = (y7) it2.next();
                if (y7Var2 instanceof b8) {
                    b8Var = (b8) y7Var2;
                    break;
                }
            }
            long j11 = (b8Var.f2937y * 1000) / b8Var.f2936x;
            this.f6130a = j11;
            return j11;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
