package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.h7;
import com.google.android.gms.internal.ads.i7;
import com.google.android.gms.internal.ads.l7;
import com.google.android.gms.internal.ads.qu;
import java.util.Map;
import m2.f;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class zzbn extends i7 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qu f2144y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.client.zzl f2145z;

    public zzbn(String str, Map map, qu quVar) {
        super(0, str, new f(21, quVar));
        this.f2144y = quVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.f2145z = zzlVar;
        zzlVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.i7
    public final l7 a(h7 h7Var) {
        return new l7(h7Var, i.H(h7Var));
    }

    @Override // com.google.android.gms.internal.ads.i7
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        byte[] bArr;
        h7 h7Var = (h7) obj;
        Map map = h7Var.f5227c;
        int i10 = h7Var.f5225a;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.f2145z;
        zzlVar.zzf(map, i10);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk() && (bArr = h7Var.f5226b) != null) {
            zzlVar.zzh(bArr);
        }
        this.f2144y.b(h7Var);
    }
}
