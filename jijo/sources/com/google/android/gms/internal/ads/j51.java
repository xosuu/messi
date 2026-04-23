package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j51 extends t31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i51 f5805a;

    public j51(i51 i51Var) {
        this.f5805a = i51Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final boolean a() {
        return this.f5805a != i51.f5499d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j51) && ((j51) obj).f5805a == this.f5805a;
    }

    public final int hashCode() {
        return Objects.hash(j51.class, this.f5805a);
    }

    public final String toString() {
        return fb1.i("XChaCha20Poly1305 Parameters (variant: ", this.f5805a.f5500a, ")");
    }
}
