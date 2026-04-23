package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik0 f8341a;

    public r0(int i10) {
        if (i10 != 1) {
            this.f8341a = new ik0(10);
        } else {
            this.f8341a = new ik0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzbk a(com.google.android.gms.internal.ads.h0 r17, com.google.android.gms.internal.ads.qz r18) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r0.a(com.google.android.gms.internal.ads.h0, com.google.android.gms.internal.ads.qz):com.google.android.gms.internal.ads.zzbk");
    }

    @Override // com.google.android.gms.internal.ads.c4
    public final void c(byte[] bArr, int i10, int i11, e4 e4Var) {
        c60 c60VarA;
        ik0 ik0Var = this.f8341a;
        ik0Var.g(bArr, i10 + i11);
        ik0Var.i(i10);
        ArrayList arrayList = new ArrayList();
        while (ik0Var.n() > 0) {
            tc1.Q("Incomplete Mp4Webvtt Top Level box header found.", ik0Var.n() >= 8);
            int iQ = ik0Var.q() - 8;
            if (ik0Var.q() == 1987343459) {
                CharSequence charSequenceA = null;
                n50 n50VarA = null;
                while (iQ > 0) {
                    tc1.Q("Incomplete vtt cue box header found.", iQ >= 8);
                    int iQ2 = ik0Var.q();
                    int iQ3 = ik0Var.q();
                    int i12 = iQ - 8;
                    int i13 = iQ2 - 8;
                    byte[] bArr2 = ik0Var.f5633a;
                    int i14 = ik0Var.f5634b;
                    int i15 = yn0.f10944a;
                    String str = new String(bArr2, i14, i13, fx0.f4681c);
                    ik0Var.j(i13);
                    if (iQ3 == 1937011815) {
                        i5 i5Var = new i5();
                        j5.f(str, i5Var);
                        n50VarA = i5Var.a();
                    } else if (iQ3 == 1885436268) {
                        charSequenceA = j5.a(null, str.trim(), Collections.emptyList());
                    }
                    iQ = i12 - i13;
                }
                if (charSequenceA == null) {
                    charSequenceA = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                if (n50VarA != null) {
                    n50VarA.f7160a = charSequenceA;
                    c60VarA = n50VarA.a();
                } else {
                    i5 i5Var2 = new i5();
                    i5Var2.f5487c = charSequenceA;
                    c60VarA = i5Var2.a().a();
                }
                arrayList.add(c60VarA);
            } else {
                ik0Var.j(iQ);
            }
        }
        e4Var.mo0zza(new y3(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.c4
    public final /* synthetic */ void zzb() {
    }
}
