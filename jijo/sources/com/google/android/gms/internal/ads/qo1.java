package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qo1 extends wn1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final fg f8237q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qn1[] f8238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wv[] f8239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f8240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8241n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long[][] f8242o = new long[0][];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public zzuw f8243p;

    static {
        zy0 zy0Var = bz0.f3132b;
        wz0 wz0Var = wz0.f10382h;
        Collections.emptyList();
        f8237q = new fg("MergingMediaSource", new d8(), null, new da(), fk.f4541y, ic.f5559a);
    }

    public qo1(jk1 jk1Var, qn1... qn1VarArr) {
        this.f8238k = qn1VarArr;
        this.f8240m = new ArrayList(Arrays.asList(qn1VarArr));
        this.f8239l = new wv[qn1VarArr.length];
        new HashMap();
        new sz0(new qy0(), new qz0());
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void a(io1 io1Var) {
        po1 po1Var = (po1) io1Var;
        int i10 = 0;
        while (true) {
            qn1[] qn1VarArr = this.f8238k;
            if (i10 >= qn1VarArr.length) {
                return;
            }
            qn1 qn1Var = qn1VarArr[i10];
            io1 io1Var2 = po1Var.f7929a[i10];
            if (io1Var2 instanceof jp1) {
                io1Var2 = ((jp1) io1Var2).f6061a;
            }
            qn1Var.a(io1Var2);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final io1 b(jo1 jo1Var, iq1 iq1Var, long j10) {
        qn1[] qn1VarArr = this.f8238k;
        int length = qn1VarArr.length;
        io1[] io1VarArr = new io1[length];
        wv[] wvVarArr = this.f8239l;
        int iA = wvVarArr[0].a(jo1Var.f6052a);
        for (int i10 = 0; i10 < length; i10++) {
            io1VarArr[i10] = qn1VarArr[i10].b(jo1Var.a(wvVarArr[i10].f(iA)), iq1Var, j10 - this.f8242o[iA][i10]);
        }
        return new po1(this.f8242o[iA], io1VarArr);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final fg c() {
        qn1[] qn1VarArr = this.f8238k;
        return qn1VarArr.length > 0 ? qn1VarArr[0].c() : f8237q;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void j(va1 va1Var) {
        this.f10256j = va1Var;
        int i10 = yn0.f10944a;
        Looper looperMyLooper = Looper.myLooper();
        tc1.A(looperMyLooper);
        this.f10255i = new Handler(looperMyLooper, null);
        int i11 = 0;
        while (true) {
            qn1[] qn1VarArr = this.f8238k;
            if (i11 >= qn1VarArr.length) {
                return;
            }
            t(Integer.valueOf(i11), qn1VarArr[i11]);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.wn1, com.google.android.gms.internal.ads.qn1
    public final void m() {
        super.m();
        Arrays.fill(this.f8239l, (Object) null);
        this.f8241n = -1;
        this.f8243p = null;
        ArrayList arrayList = this.f8240m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f8238k);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void p(fg fgVar) {
        this.f8238k[0].p(fgVar);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void r() throws zzuw {
        zzuw zzuwVar = this.f8243p;
        if (zzuwVar != null) {
            throw zzuwVar;
        }
        Iterator it = this.f10254h.values().iterator();
        while (it.hasNext()) {
            ((vn1) it.next()).f9927a.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final void s(Object obj, qn1 qn1Var, wv wvVar) {
        int iB;
        if (this.f8243p != null) {
            return;
        }
        if (this.f8241n == -1) {
            iB = wvVar.b();
            this.f8241n = iB;
        } else {
            int iB2 = wvVar.b();
            int i10 = this.f8241n;
            if (iB2 != i10) {
                this.f8243p = new zzuw();
                return;
            }
            iB = i10;
        }
        int length = this.f8242o.length;
        wv[] wvVarArr = this.f8239l;
        if (length == 0) {
            this.f8242o = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iB, wvVarArr.length);
        }
        ArrayList arrayList = this.f8240m;
        arrayList.remove(qn1Var);
        wvVarArr[((Integer) obj).intValue()] = wvVar;
        if (arrayList.isEmpty()) {
            k(wvVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final /* bridge */ /* synthetic */ jo1 w(Object obj, jo1 jo1Var) {
        if (((Integer) obj).intValue() == 0) {
            return jo1Var;
        }
        return null;
    }
}
