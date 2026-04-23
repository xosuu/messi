package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class vv0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f9979f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f9981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rv0 f9983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9984e;

    public vv0(Context context, int i10, rv0 rv0Var, boolean z9) {
        this.f9984e = false;
        this.f9980a = context;
        this.f9982c = Integer.toString(i10 - 1);
        this.f9981b = context.getSharedPreferences("pcvmspf", 0);
        this.f9983d = rv0Var;
        this.f9984e = z9;
    }

    public static String d(lb lbVar) {
        mb mbVarD = nb.D();
        String strI = lbVar.B().I();
        mbVarD.d();
        nb.J((nb) mbVarD.f9462b, strI);
        String strH = lbVar.B().H();
        mbVarD.d();
        nb.L((nb) mbVarD.f9462b, strH);
        long jA = lbVar.B().A();
        mbVarD.d();
        nb.N((nb) mbVarD.f9462b, jA);
        long jC = lbVar.B().C();
        mbVarD.d();
        nb.K((nb) mbVarD.f9462b, jC);
        long jB = lbVar.B().B();
        mbVarD.d();
        nb.M((nb) mbVarD.f9462b, jB);
        return y3.c.a(((nb) mbVarD.b()).d());
    }

    public final boolean a(lb lbVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f9979f) {
            try {
                if (!en1.C0(new File(c(lbVar.B().I()), "pcbc"), lbVar.C().b())) {
                    e(4020, jCurrentTimeMillis);
                    return false;
                }
                String strD = d(lbVar);
                SharedPreferences.Editor editorEdit = this.f9981b.edit();
                editorEdit.putString("LATMTD".concat(String.valueOf(this.f9982c)), strD);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    e(5015, jCurrentTimeMillis);
                } else {
                    e(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (com.google.android.gms.internal.ads.f3.a(r7) == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(com.google.android.gms.internal.ads.lb r17, com.google.android.gms.internal.ads.i10 r18) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vv0.b(com.google.android.gms.internal.ads.lb, com.google.android.gms.internal.ads.i10):boolean");
    }

    public final File c(String str) {
        return new File(new File(this.f9980a.getDir("pccache", 0), this.f9982c), str);
    }

    public final void e(int i10, long j10) {
        this.f9983d.b(i10, j10);
    }

    public final nb f(int i10) {
        pc1 pc1VarB;
        String str = this.f9982c;
        SharedPreferences sharedPreferences = this.f9981b;
        String string = i10 == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrF = y3.c.f(string);
            cc1 cc1VarQ = ec1.q(0, bArrF, bArrF.length);
            if (this.f9984e) {
                pc1 pc1Var = pc1.f7857a;
                yd1 yd1Var = yd1.f10857c;
                pc1VarB = pc1.f7858b;
            } else {
                pc1VarB = pc1.b();
            }
            return nb.G(cc1VarQ, pc1VarB);
        } catch (zzgyn unused) {
            return null;
        } catch (NullPointerException unused2) {
            e(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            e(2032, jCurrentTimeMillis);
            return null;
        }
    }
}
