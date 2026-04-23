package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class uv0 extends rt0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public iz0 f9623h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f9624q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9625s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9626t;

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f9626t;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f9624q;
        int i13 = yn0.f10944a;
        System.arraycopy(bArr2, this.f9625s, bArr, i10, iMin);
        this.f9625s += iMin;
        this.f9626t -= iMin;
        c(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final long g(iz0 iz0Var) throws zzbo, zzft {
        j(iz0Var);
        this.f9623h = iz0Var;
        Uri uriNormalizeScheme = iz0Var.f5730a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        tc1.Q("Unsupported scheme: ".concat(String.valueOf(scheme)), "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i10 = yn0.f10944a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new zzbo("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f9624q = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new zzbo("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e10, true, 0);
            }
        } else {
            this.f9624q = URLDecoder.decode(str, fx0.f4679a.name()).getBytes(fx0.f4681c);
        }
        int length = this.f9624q.length;
        long j10 = length;
        long j11 = iz0Var.f5732c;
        if (j11 > j10) {
            this.f9624q = null;
            throw new zzft(2008);
        }
        int i11 = (int) j11;
        this.f9625s = i11;
        int i12 = length - i11;
        this.f9626t = i12;
        long j12 = iz0Var.f5733d;
        if (j12 != -1) {
            this.f9626t = (int) Math.min(i12, j12);
        }
        n(iz0Var);
        return j12 != -1 ? j12 : this.f9626t;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        iz0 iz0Var = this.f9623h;
        if (iz0Var != null) {
            return iz0Var.f5730a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() {
        if (this.f9624q != null) {
            this.f9624q = null;
            i();
        }
        this.f9623h = null;
    }
}
