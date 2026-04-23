package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class y30 implements e30 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e20 f10740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e20 f10741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e20 f10742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e20 f10743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o30 f10745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f10746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f10747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f10748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10751p;

    @Override // com.google.android.gms.internal.ads.e30
    public final e20 a(e20 e20Var) throws zzcs {
        if (e20Var.f3820c != 2) {
            throw new zzcs(e20Var);
        }
        int i10 = this.f10737b;
        if (i10 == -1) {
            i10 = e20Var.f3818a;
        }
        this.f10740e = e20Var;
        e20 e20Var2 = new e20(i10, e20Var.f3819b, 2);
        this.f10741f = e20Var2;
        this.f10744i = true;
        return e20Var2;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            o30 o30Var = this.f10745j;
            o30Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f10749n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = o30Var.f7479b;
            int i11 = iRemaining2 / i10;
            int i12 = i11 * i10;
            short[] sArrF = o30Var.f(o30Var.f7487j, o30Var.f7488k, i11);
            o30Var.f7487j = sArrF;
            shortBufferAsShortBuffer.get(sArrF, o30Var.f7488k * i10, (i12 + i12) / 2);
            o30Var.f7488k += i11;
            o30Var.e();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final ByteBuffer zzb() {
        o30 o30Var = this.f10745j;
        if (o30Var != null) {
            int i10 = o30Var.f7490m;
            int i11 = o30Var.f7479b;
            int i12 = i10 * i11;
            int i13 = i12 + i12;
            if (i13 > 0) {
                if (this.f10746k.capacity() < i13) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i13).order(ByteOrder.nativeOrder());
                    this.f10746k = byteBufferOrder;
                    this.f10747l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f10746k.clear();
                    this.f10747l.clear();
                }
                ShortBuffer shortBuffer = this.f10747l;
                int iMin = Math.min(shortBuffer.remaining() / i11, o30Var.f7490m);
                int i14 = iMin * i11;
                shortBuffer.put(o30Var.f7489l, 0, i14);
                int i15 = o30Var.f7490m - iMin;
                o30Var.f7490m = i15;
                short[] sArr = o30Var.f7489l;
                System.arraycopy(sArr, i14, sArr, 0, i15 * i11);
                this.f10750o += (long) i13;
                this.f10746k.limit(i13);
                this.f10748m = this.f10746k;
            }
        }
        ByteBuffer byteBuffer = this.f10748m;
        this.f10748m = e30.f3848a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final void zzc() {
        if (zzg()) {
            e20 e20Var = this.f10740e;
            this.f10742g = e20Var;
            e20 e20Var2 = this.f10741f;
            this.f10743h = e20Var2;
            if (this.f10744i) {
                this.f10745j = new o30(e20Var.f3818a, e20Var.f3819b, this.f10738c, this.f10739d, e20Var2.f3818a);
            } else {
                o30 o30Var = this.f10745j;
                if (o30Var != null) {
                    o30Var.f7488k = 0;
                    o30Var.f7490m = 0;
                    o30Var.f7492o = 0;
                    o30Var.f7493p = 0;
                    o30Var.f7494q = 0;
                    o30Var.f7495r = 0;
                    o30Var.f7496s = 0;
                    o30Var.f7497t = 0;
                    o30Var.f7498u = 0;
                    o30Var.f7499v = 0;
                }
            }
        }
        this.f10748m = e30.f3848a;
        this.f10749n = 0L;
        this.f10750o = 0L;
        this.f10751p = false;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final void zzd() {
        o30 o30Var = this.f10745j;
        if (o30Var != null) {
            int i10 = o30Var.f7488k;
            int i11 = o30Var.f7490m;
            float f10 = o30Var.f7492o;
            float f11 = o30Var.f7480c;
            float f12 = o30Var.f7481d;
            int i12 = i11 + ((int) ((((i10 / (f11 / f12)) + f10) / (o30Var.f7482e * f12)) + 0.5f));
            int i13 = o30Var.f7485h;
            int i14 = i13 + i13;
            o30Var.f7487j = o30Var.f(o30Var.f7487j, i10, i14 + i10);
            int i15 = 0;
            while (true) {
                int i16 = o30Var.f7479b;
                if (i15 >= i14 * i16) {
                    break;
                }
                o30Var.f7487j[(i16 * i10) + i15] = 0;
                i15++;
            }
            o30Var.f7488k += i14;
            o30Var.e();
            if (o30Var.f7490m > i12) {
                o30Var.f7490m = i12;
            }
            o30Var.f7488k = 0;
            o30Var.f7495r = 0;
            o30Var.f7492o = 0;
        }
        this.f10751p = true;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final void zzf() {
        this.f10738c = 1.0f;
        this.f10739d = 1.0f;
        e20 e20Var = e20.f3817e;
        this.f10740e = e20Var;
        this.f10741f = e20Var;
        this.f10742g = e20Var;
        this.f10743h = e20Var;
        ByteBuffer byteBuffer = e30.f3848a;
        this.f10746k = byteBuffer;
        this.f10747l = byteBuffer.asShortBuffer();
        this.f10748m = byteBuffer;
        this.f10737b = -1;
        this.f10744i = false;
        this.f10745j = null;
        this.f10749n = 0L;
        this.f10750o = 0L;
        this.f10751p = false;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final boolean zzg() {
        if (this.f10741f.f3818a != -1) {
            return Math.abs(this.f10738c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f10739d + (-1.0f)) >= 1.0E-4f || this.f10741f.f3818a != this.f10740e.f3818a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final boolean zzh() {
        if (!this.f10751p) {
            return false;
        }
        o30 o30Var = this.f10745j;
        if (o30Var == null) {
            return true;
        }
        int i10 = o30Var.f7490m * o30Var.f7479b;
        return i10 + i10 == 0;
    }
}
