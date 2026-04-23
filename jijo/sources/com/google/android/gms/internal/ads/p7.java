package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class p7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e5 f7825d = new e5(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7826a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7827b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7828c = 0;

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f7826a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f7827b, bArr, f7825d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f7827b.add(iBinarySearch, bArr);
                this.f7828c += length;
                c();
            }
        }
    }

    public final synchronized byte[] b(int i10) {
        for (int i11 = 0; i11 < this.f7827b.size(); i11++) {
            byte[] bArr = (byte[]) this.f7827b.get(i11);
            int length = bArr.length;
            if (length >= i10) {
                this.f7828c -= length;
                this.f7827b.remove(i11);
                this.f7826a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public final synchronized void c() {
        while (this.f7828c > 4096) {
            byte[] bArr = (byte[]) this.f7826a.remove(0);
            this.f7827b.remove(bArr);
            this.f7828c -= bArr.length;
        }
    }
}
