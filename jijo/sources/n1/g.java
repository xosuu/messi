package n1;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.qv0;
import com.google.android.gms.internal.ads.sv0;
import com.google.android.gms.internal.ads.tv0;
import com.google.android.gms.internal.ads.zzfpm;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g implements v3.b, v3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15832b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15833d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15834f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f15835h;

    public g(Context context, Looper looper, qv0 qv0Var) {
        this.f15835h = new Object();
        this.f15831a = false;
        this.f15832b = false;
        this.f15834f = qv0Var;
        this.f15833d = new sv0(context, looper, this, this, 12800000);
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (this.f15831a && !this.f15832b) {
                    int length = ((long[]) this.f15833d).length;
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 >= length) {
                            this.f15832b = true;
                            this.f15831a = false;
                            return (int[]) this.f15835h;
                        }
                        boolean z9 = ((long[]) this.f15833d)[i10] > 0;
                        Object obj = this.f15834f;
                        if (z9 != ((boolean[]) obj)[i10]) {
                            int[] iArr = (int[]) this.f15835h;
                            if (!z9) {
                                i11 = 2;
                            }
                            iArr[i10] = i11;
                        } else {
                            ((int[]) this.f15835h)[i10] = 0;
                        }
                        ((boolean[]) obj)[i10] = z9;
                        i10++;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public final void b() {
        synchronized (this.f15835h) {
            try {
                if (((sv0) this.f15833d).isConnected() || ((sv0) this.f15833d).isConnecting()) {
                    ((sv0) this.f15833d).disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v3.b
    public final void m(int i10) {
    }

    @Override // v3.b
    public final void r(Bundle bundle) {
        synchronized (this.f15835h) {
            try {
                if (this.f15832b) {
                    return;
                }
                this.f15832b = true;
                try {
                    tv0 tv0VarN = ((sv0) this.f15833d).n();
                    zzfpm zzfpmVar = new zzfpm(((qv0) this.f15834f).d(), 1);
                    Parcel parcelM = tv0VarN.m();
                    qb.c(parcelM, zzfpmVar);
                    tv0VarN.a0(parcelM, 2);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    b();
                    throw th;
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v3.c
    public final void t(ConnectionResult connectionResult) {
    }

    public g(int i10) {
        long[] jArr = new long[i10];
        this.f15833d = jArr;
        boolean[] zArr = new boolean[i10];
        this.f15834f = zArr;
        this.f15835h = new int[i10];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }
}
