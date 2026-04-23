package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class m50 extends oe1 implements w40, k50 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fr0 f6869b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f6870d;

    public m50(Set set, fr0 fr0Var) {
        super(set);
        this.f6870d = new AtomicBoolean();
        this.f6869b = fr0Var;
    }

    public final void J0() {
        zzs zzsVar;
        if (((Boolean) zzba.zzc().a(eg.Y6)).booleanValue() && this.f6870d.compareAndSet(false, true) && (zzsVar = this.f6869b.f4609e0) != null && zzsVar.zza == 3) {
            I0(new jp0(10, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final void zzg() {
        if (this.f6869b.f4602b == 1) {
            J0();
        }
    }

    @Override // com.google.android.gms.internal.ads.w40
    public final void zzr() {
        int i10 = this.f6869b.f4602b;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            J0();
        }
    }
}
