package com.google.android.gms.internal.ads;

import com.google.gson.JsonIOException;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements s60, com.google.gson.internal.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3525b;

    public /* synthetic */ d0(String str) {
        this.f3524a = 0;
        this.f3525b = str;
    }

    public static d0 a(ik0 ik0Var) {
        String str;
        ik0Var.j(2);
        int iV = ik0Var.v();
        int i10 = iV >> 1;
        int i11 = iV & 1;
        int iV2 = ik0Var.v() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        int i12 = iV2 | (i11 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i10);
        sb.append(i12 >= 10 ? "." : ".0");
        sb.append(i12);
        return new d0(sb.toString());
    }

    @Override // com.google.gson.internal.l
    public Object f() {
        int i10 = this.f3524a;
        String str = this.f3525b;
        switch (i10) {
            case 0:
                throw new JsonIOException(str);
            default:
                throw new JsonIOException(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public void mo5zza(Object obj) {
        int i10 = this.f3524a;
        String str = this.f3525b;
        switch (i10) {
            case 1:
                ((d70) obj).X(str);
                break;
            default:
                ((v70) obj).zzf(str);
                break;
        }
    }

    public /* synthetic */ d0(String str, int i10) {
        this.f3524a = i10;
        this.f3525b = str;
    }
}
