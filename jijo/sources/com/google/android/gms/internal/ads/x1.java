package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x1 implements h0, i0, rs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10399b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10400d;

    public x1() {
        this.f10398a = 6;
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) {
        return ((h0) this.f10400d).b(i10, bArr, i11);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final void c(int i10) {
        ((a0) ((h0) this.f10400d)).i(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final void d(int i10) {
        ((a0) ((h0) this.f10400d)).j(i10);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final void e(int i10, byte[] bArr, int i11) {
        ((a0) ((h0) this.f10400d)).m(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final void f(int i10, byte[] bArr, int i11) {
        ((a0) ((h0) this.f10400d)).h(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final boolean h(byte[] bArr, int i10, int i11, boolean z9) {
        return ((h0) this.f10400d).h(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.i0
    public final void i() {
        ((i0) this.f10400d).i();
    }

    @Override // com.google.android.gms.internal.ads.i0
    public final b1 j(int i10, int i11) {
        return ((i0) this.f10400d).j(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final int k(int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final int l(int i10, byte[] bArr, int i11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final boolean m(byte[] bArr, int i10, int i11, boolean z9) {
        return ((h0) this.f10400d).m(bArr, 0, 8, true);
    }

    public final long n() {
        switch (this.f10398a) {
            case 3:
                Iterator it = ((ArrayList) this.f10400d).iterator();
                while (it.hasNext()) {
                    for (Map.Entry entry : ((f41) it.next()).zze().entrySet()) {
                        try {
                            if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                                this.f10399b = Math.max(this.f10399b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                            }
                        } catch (RuntimeException unused) {
                        }
                    }
                    it.remove();
                }
                break;
        }
        return this.f10399b;
    }

    public final void o(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f10400d) == null) {
            this.f10400d = exc;
            this.f10399b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f10399b) {
            Exception exc2 = (Exception) this.f10400d;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f10400d;
            this.f10400d = null;
            throw exc3;
        }
    }

    @Override // com.google.android.gms.internal.ads.i0
    public final void p(v0 v0Var) {
        ((i0) this.f10400d).p(new z1(this, v0Var, v0Var));
    }

    public final boolean q() {
        return ((String) this.f10400d) != null && this.f10399b >= 0;
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final Object zza(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((zzg) ((eh0) this.f10400d).f12845a).zzS()) {
            return null;
        }
        long j10 = this.f10399b;
        ud udVarP = vd.P();
        udVarP.d();
        vd.M((vd) udVarP.f9462b, j10);
        byte[] bArrD = ((vd) udVarP.b()).d();
        en1.E0(sQLiteDatabase, false, false);
        en1.r0(sQLiteDatabase, j10, bArrD);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final long zzd() {
        return ((h0) this.f10400d).zzd() - this.f10399b;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final long zze() {
        return ((h0) this.f10400d).zze() - this.f10399b;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final long zzf() {
        return ((h0) this.f10400d).zzf() - this.f10399b;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final void zzj() {
        ((h0) this.f10400d).zzj();
    }

    public /* synthetic */ x1(long j10, Object obj, int i10) {
        this.f10398a = i10;
        this.f10399b = j10;
        this.f10400d = obj;
    }

    public x1(h0 h0Var, long j10) {
        this.f10398a = 1;
        this.f10400d = h0Var;
        tc1.K(h0Var.zzf() >= j10);
        this.f10399b = j10;
    }

    public /* synthetic */ x1(Object obj, long j10, int i10) {
        this.f10398a = i10;
        this.f10400d = obj;
        this.f10399b = j10;
    }

    public x1(int i10) {
        this.f10398a = i10;
        if (i10 != 5) {
            this.f10400d = new ArrayList();
        } else {
            this.f10400d = null;
            this.f10399b = -1L;
        }
    }
}
