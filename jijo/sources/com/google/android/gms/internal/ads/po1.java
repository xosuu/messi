package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class po1 implements io1, ho1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io1[] f7929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentityHashMap f7930b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f7931d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f7932f = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ho1 f7933h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public kp1 f7934q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public io1[] f7935s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public yn1 f7936t;

    public po1(long[] jArr, io1... io1VarArr) {
        this.f7929a = io1VarArr;
        zy0 zy0Var = bz0.f3132b;
        wz0 wz0Var = wz0.f10382h;
        this.f7936t = new yn1(wz0Var, wz0Var);
        this.f7930b = new IdentityHashMap();
        this.f7935s = new io1[0];
        for (int i10 = 0; i10 < io1VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f7929a[i10] = new jp1(io1VarArr[i10], j10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long a(long j10) {
        long jA = this.f7935s[0].a(j10);
        int i10 = 1;
        while (true) {
            io1[] io1VarArr = this.f7935s;
            if (i10 >= io1VarArr.length) {
                return jA;
            }
            if (io1VarArr[i10].a(jA) != jA) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final void b(long j10) {
        this.f7936t.b(j10);
    }

    @Override // com.google.android.gms.internal.ads.ho1
    public final /* bridge */ /* synthetic */ void c(ep1 ep1Var) {
        ho1 ho1Var = this.f7933h;
        ho1Var.getClass();
        ho1Var.c(this);
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void d(long j10) {
        for (io1 io1Var : this.f7935s) {
            io1Var.d(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.ho1
    public final void e(io1 io1Var) {
        io1[] io1VarArr;
        ArrayList arrayList = this.f7931d;
        arrayList.remove(io1Var);
        if (arrayList.isEmpty()) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                io1VarArr = this.f7929a;
                if (i10 >= io1VarArr.length) {
                    break;
                }
                i11 += io1VarArr[i10].zzi().f6365a;
                i10++;
            }
            ow[] owVarArr = new ow[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < io1VarArr.length; i13++) {
                kp1 kp1VarZzi = io1VarArr[i13].zzi();
                int i14 = kp1VarZzi.f6365a;
                int i15 = 0;
                while (i15 < i14) {
                    ow owVarA = kp1VarZzi.a(i15);
                    y1[] y1VarArr = new y1[owVarA.f7685a];
                    for (int i16 = 0; i16 < owVarA.f7685a; i16++) {
                        y1 y1Var = owVarA.f7688d[i16];
                        q0 q0VarB = y1Var.b();
                        String str = y1Var.f10702a;
                        if (str == null) {
                            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        q0VarB.f8041a = i13 + ":" + str;
                        y1VarArr[i16] = new y1(q0VarB);
                    }
                    ow owVar = new ow(i13 + ":" + owVarA.f7686b, y1VarArr);
                    this.f7932f.put(owVar, owVarA);
                    owVarArr[i12] = owVar;
                    i15++;
                    i12++;
                }
            }
            this.f7934q = new kp1(owVarArr);
            ho1 ho1Var = this.f7933h;
            ho1Var.getClass();
            ho1Var.e(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long f(cq1[] cq1VarArr, boolean[] zArr, dp1[] dp1VarArr, boolean[] zArr2, long j10) {
        int length;
        IdentityHashMap identityHashMap;
        ArrayList arrayList;
        int length2 = cq1VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        while (true) {
            length = cq1VarArr.length;
            identityHashMap = this.f7930b;
            if (i10 >= length) {
                break;
            }
            dp1 dp1Var = dp1VarArr[i10];
            Integer num = dp1Var == null ? null : (Integer) identityHashMap.get(dp1Var);
            iArr[i10] = num == null ? -1 : num.intValue();
            cq1 cq1Var = cq1VarArr[i10];
            if (cq1Var != null) {
                String str = cq1Var.zze().f7686b;
                iArr2[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        dp1[] dp1VarArr2 = new dp1[length];
        dp1[] dp1VarArr3 = new dp1[length];
        cq1[] cq1VarArr2 = new cq1[length];
        io1[] io1VarArr = this.f7929a;
        ArrayList arrayList2 = new ArrayList(io1VarArr.length);
        long j11 = j10;
        int i11 = 0;
        while (i11 < io1VarArr.length) {
            int i12 = 0;
            while (i12 < cq1VarArr.length) {
                dp1VarArr3[i12] = iArr[i12] == i11 ? dp1VarArr[i12] : null;
                if (iArr2[i12] == i11) {
                    cq1 cq1Var2 = cq1VarArr[i12];
                    cq1Var2.getClass();
                    arrayList = arrayList2;
                    ow owVar = (ow) this.f7932f.get(cq1Var2.zze());
                    owVar.getClass();
                    cq1VarArr2[i12] = new oo1(cq1Var2, owVar);
                } else {
                    arrayList = arrayList2;
                    cq1VarArr2[i12] = null;
                }
                i12++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i13 = i11;
            io1[] io1VarArr2 = io1VarArr;
            cq1[] cq1VarArr3 = cq1VarArr2;
            dp1[] dp1VarArr4 = dp1VarArr3;
            long jF = io1VarArr[i11].f(cq1VarArr2, zArr, dp1VarArr3, zArr2, j11);
            if (i13 == 0) {
                j11 = jF;
            } else if (jF != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z9 = false;
            for (int i14 = 0; i14 < cq1VarArr.length; i14++) {
                if (iArr2[i14] == i13) {
                    dp1 dp1Var2 = dp1VarArr4[i14];
                    dp1Var2.getClass();
                    dp1VarArr2[i14] = dp1Var2;
                    identityHashMap.put(dp1Var2, Integer.valueOf(i13));
                    z9 = true;
                } else if (iArr[i14] == i13) {
                    tc1.W(dp1VarArr4[i14] == null);
                }
            }
            if (z9) {
                arrayList3.add(io1VarArr2[i13]);
            }
            i11 = i13 + 1;
            arrayList2 = arrayList3;
            io1VarArr = io1VarArr2;
            cq1VarArr2 = cq1VarArr3;
            dp1VarArr3 = dp1VarArr4;
        }
        ArrayList arrayList4 = arrayList2;
        System.arraycopy(dp1VarArr2, 0, dp1VarArr, 0, length);
        this.f7935s = (io1[]) arrayList4.toArray(new io1[0]);
        this.f7936t = new yn1(arrayList4, tp1.V(arrayList4, new b3(24)));
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean g(fj1 fj1Var) {
        ArrayList arrayList = this.f7931d;
        if (arrayList.isEmpty()) {
            return this.f7936t.g(fj1Var);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((io1) arrayList.get(i10)).g(fj1Var);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void h(ho1 ho1Var, long j10) {
        this.f7933h = ho1Var;
        ArrayList arrayList = this.f7931d;
        io1[] io1VarArr = this.f7929a;
        Collections.addAll(arrayList, io1VarArr);
        for (io1 io1Var : io1VarArr) {
            io1Var.h(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long k(long j10, ak1 ak1Var) {
        io1[] io1VarArr = this.f7935s;
        return (io1VarArr.length > 0 ? io1VarArr[0] : this.f7929a[0]).k(j10, ak1Var);
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzb() {
        return this.f7936t.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzc() {
        return this.f7936t.zzc();
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long zzd() {
        long j10 = -9223372036854775807L;
        for (io1 io1Var : this.f7935s) {
            long jZzd = io1Var.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && io1Var.a(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (io1 io1Var2 : this.f7935s) {
                    if (io1Var2 == io1Var) {
                        break;
                    }
                    if (io1Var2.a(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jZzd;
            } else if (jZzd != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final kp1 zzi() {
        kp1 kp1Var = this.f7934q;
        kp1Var.getClass();
        return kp1Var;
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void zzk() {
        int i10 = 0;
        while (true) {
            io1[] io1VarArr = this.f7929a;
            if (i10 >= io1VarArr.length) {
                return;
            }
            io1VarArr[i10].zzk();
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean zzp() {
        return this.f7936t.zzp();
    }
}
