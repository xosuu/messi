package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class xg implements x, qe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10548b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10549d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10550f;

    public /* synthetic */ xg(int i10, sr srVar, sr srVar2) {
        this.f10547a = 6;
        this.f10548b = i10;
        this.f10549d = srVar;
        this.f10550f = srVar2;
    }

    public static xg b(long j10, String str) {
        return new xg(Long.valueOf(j10), str, 2);
    }

    public static xg f(String str, String str2) {
        return new xg(str2, str, 4);
    }

    public static xg j(String str, boolean z9) {
        return new xg(Boolean.valueOf(z9), str, 1);
    }

    public final void a(Object obj, Object obj2) {
        int i10 = this.f10548b + 1;
        Object[] objArr = (Object[]) this.f10549d;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f10549d = Arrays.copyOf(objArr, vy0.d(length, i11));
        }
        tp1.c0(obj, obj2);
        Object[] objArr2 = (Object[]) this.f10549d;
        int i12 = this.f10548b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f10548b = i12 + 1;
    }

    public final void c(ac acVar) {
        synchronized (this.f10550f) {
            try {
                if (((List) this.f10549d).size() >= 10) {
                    zzm.zze("Queue is full, current size = " + ((List) this.f10549d).size());
                    ((List) this.f10549d).remove(0);
                }
                int i10 = this.f10548b;
                this.f10548b = i10 + 1;
                acVar.f2647l = i10;
                acVar.d();
                ((List) this.f10549d).add(acVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    @Override // com.google.android.gms.internal.ads.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.w d(com.google.android.gms.internal.ads.h0 r25, long r26) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xg.d(com.google.android.gms.internal.ads.h0, long):com.google.android.gms.internal.ads.w");
    }

    public final long e(h0 h0Var) {
        int iL;
        while (h0Var.zze() < h0Var.zzd() - 6) {
            m0 m0Var = (m0) this.f10549d;
            int i10 = this.f10548b;
            k0 k0Var = (k0) this.f10550f;
            long jZze = h0Var.zze();
            byte[] bArr = new byte[2];
            a0 a0Var = (a0) h0Var;
            a0Var.m(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                h0Var.zzj();
                a0Var.i((int) (jZze - h0Var.zzf()), false);
            } else {
                ik0 ik0Var = new ik0(16);
                System.arraycopy(bArr, 0, ik0Var.f5633a, 0, 2);
                byte[] bArr2 = ik0Var.f5633a;
                int i11 = 0;
                while (i11 < 14 && (iL = h0Var.l(2 + i11, bArr2, 14 - i11)) != -1) {
                    i11 += iL;
                }
                ik0Var.h(i11);
                h0Var.zzj();
                a0Var.i((int) (jZze - h0Var.zzf()), false);
                if (z3.a.f0(ik0Var, m0Var, i10, k0Var)) {
                    break;
                }
            }
            a0Var.i(1, false);
        }
        if (h0Var.zze() < h0Var.zzd() - 6) {
            return ((k0) this.f10550f).f6130a;
        }
        ((a0) h0Var).i((int) (h0Var.zzd() - h0Var.zze()), false);
        return ((m0) this.f10549d).f6793j;
    }

    public final b01 g() {
        cz0 cz0Var = (cz0) this.f10550f;
        if (cz0Var != null) {
            throw cz0Var.a();
        }
        b01 b01VarC = b01.c(this.f10548b, (Object[]) this.f10549d, this);
        cz0 cz0Var2 = (cz0) this.f10550f;
        if (cz0Var2 == null) {
            return b01VarC;
        }
        throw cz0Var2.a();
    }

    public final synchronized void h() {
        ((ExecutorService) ((v3.d0) this.f10550f).f17737f).execute(new s9(7, this));
    }

    public final void i(ac acVar) {
        synchronized (this.f10550f) {
            try {
                Iterator it = ((List) this.f10549d).iterator();
                while (it.hasNext()) {
                    ac acVar2 = (ac) it.next();
                    if (zzu.zzo().d().zzP()) {
                        if (!zzu.zzo().d().zzQ() && !acVar.equals(acVar2) && acVar2.f2652q.equals(acVar.f2652q)) {
                            it.remove();
                            return;
                        }
                    } else if (!acVar.equals(acVar2) && acVar2.f2650o.equals(acVar.f2650o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object k() {
        bg bgVar = (bg) ai.f2685a.get();
        if (bgVar == null) {
            fb1.t(ai.f2686b.get());
            return this.f10550f;
        }
        int i10 = this.f10548b - 1;
        SharedPreferences sharedPreferences = bgVar.f3017a;
        if (i10 == 0) {
            String str = (String) this.f10549d;
            boolean zBooleanValue = ((Boolean) this.f10550f).booleanValue();
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, zBooleanValue));
            } catch (ClassCastException unused) {
                return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(zBooleanValue)));
            }
        }
        if (i10 == 1) {
            try {
                return Long.valueOf(sharedPreferences.getLong((String) this.f10549d, ((Long) this.f10550f).longValue()));
            } catch (ClassCastException unused2) {
                return Long.valueOf(sharedPreferences.getInt(r1, (int) r2));
            }
        }
        if (i10 != 2) {
            return sharedPreferences.getString((String) this.f10549d, (String) this.f10550f);
        }
        try {
            return Double.valueOf(sharedPreferences.getFloat(r1, (float) r2));
        } catch (ClassCastException unused3) {
            return Double.valueOf(sharedPreferences.getString((String) this.f10549d, String.valueOf(((Double) this.f10550f).doubleValue())));
        }
    }

    @Override // com.google.android.gms.internal.ads.qe0
    /* JADX INFO: renamed from: zza */
    public final void mo0zza(Object obj) {
        int i10 = ui1.V;
        ((dk1) obj).J(this.f10548b, (sr) this.f10549d, (sr) this.f10550f);
    }

    @Override // com.google.android.gms.internal.ads.x
    public final void zzb() {
        switch (this.f10547a) {
            case 1:
                break;
            default:
                byte[] bArr = yn0.f10949f;
                int length = bArr.length;
                ((ik0) this.f10550f).g(bArr, 0);
                break;
        }
    }

    public /* synthetic */ xg(m0 m0Var, int i10) {
        this.f10547a = 1;
        this.f10549d = m0Var;
        this.f10548b = i10;
        this.f10550f = new k0();
    }

    public xg(y1 y1Var, String str) {
        this.f10547a = 7;
        this.f10550f = y1Var;
        this.f10548b = 0;
        this.f10549d = str;
    }

    public xg(Object obj, String str, int i10) {
        this.f10547a = 0;
        this.f10549d = str;
        this.f10550f = obj;
        this.f10548b = i10;
    }

    public /* synthetic */ xg(v3.d0 d0Var, byte[] bArr) {
        this.f10547a = 4;
        this.f10550f = d0Var;
        this.f10549d = bArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xg(int i10, int i11) {
        this(4);
        this.f10547a = i10;
        if (i10 == 5) {
        } else {
            this.f10550f = new Object();
            this.f10549d = new LinkedList();
        }
    }

    public xg(int i10, nn0 nn0Var) {
        this.f10547a = 2;
        this.f10548b = i10;
        this.f10549d = nn0Var;
        this.f10550f = new ik0();
    }

    public xg(int i10) {
        this.f10547a = 5;
        this.f10549d = new Object[i10 + i10];
        this.f10548b = 0;
    }
}
