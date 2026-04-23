package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bz0 f10026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10027b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f10028c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10029d;

    public w10(wz0 wz0Var) {
        this.f10026a = wz0Var;
        e20 e20Var = e20.f3817e;
        this.f10029d = false;
    }

    public final e20 a(e20 e20Var) {
        if (e20Var.equals(e20.f3817e)) {
            throw new zzcs(e20Var);
        }
        int i10 = 0;
        while (true) {
            bz0 bz0Var = this.f10026a;
            if (i10 >= bz0Var.size()) {
                return e20Var;
            }
            e30 e30Var = (e30) bz0Var.get(i10);
            e20 e20VarA = e30Var.a(e20Var);
            if (e30Var.zzg()) {
                tc1.W(!e20VarA.equals(e20.f3817e));
                e20Var = e20VarA;
            }
            i10++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f10027b;
        arrayList.clear();
        this.f10029d = false;
        int i10 = 0;
        while (true) {
            bz0 bz0Var = this.f10026a;
            if (i10 >= bz0Var.size()) {
                break;
            }
            e30 e30Var = (e30) bz0Var.get(i10);
            e30Var.zzc();
            if (e30Var.zzg()) {
                arrayList.add(e30Var);
            }
            i10++;
        }
        this.f10028c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= f(); i11++) {
            this.f10028c[i11] = ((e30) arrayList.get(i11)).zzb();
        }
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            bz0 bz0Var = this.f10026a;
            if (i10 >= bz0Var.size()) {
                this.f10028c = new ByteBuffer[0];
                e20 e20Var = e20.f3817e;
                this.f10029d = false;
                return;
            } else {
                e30 e30Var = (e30) bz0Var.get(i10);
                e30Var.zzc();
                e30Var.zzf();
                i10++;
            }
        }
    }

    public final boolean d() {
        return this.f10029d && ((e30) this.f10027b.get(f())).zzh() && !this.f10028c[f()].hasRemaining();
    }

    public final boolean e() {
        return !this.f10027b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w10)) {
            return false;
        }
        w10 w10Var = (w10) obj;
        bz0 bz0Var = this.f10026a;
        if (bz0Var.size() != w10Var.f10026a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < bz0Var.size(); i10++) {
            if (bz0Var.get(i10) != w10Var.f10026a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.f10028c.length - 1;
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean z9;
        do {
            int i10 = 0;
            z9 = false;
            while (i10 <= f()) {
                if (!this.f10028c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f10027b;
                    e30 e30Var = (e30) arrayList.get(i10);
                    if (!e30Var.zzh()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f10028c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : e30.f3848a;
                        long jRemaining = byteBuffer2.remaining();
                        e30Var.b(byteBuffer2);
                        this.f10028c[i10] = e30Var.zzb();
                        boolean z10 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.f10028c[i10].hasRemaining()) {
                            z10 = false;
                        }
                        z9 |= z10;
                    } else if (!this.f10028c[i10].hasRemaining() && i10 < f()) {
                        ((e30) arrayList.get(i10 + 1)).zzd();
                    }
                }
                i10++;
            }
        } while (z9);
    }

    public final int hashCode() {
        return this.f10026a.hashCode();
    }
}
