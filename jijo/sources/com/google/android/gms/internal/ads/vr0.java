package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tn f9963a;

    public vr0(tn tnVar) {
        this.f9963a = tnVar;
    }

    public final boolean a() throws zzffn {
        try {
            return this.f9963a.g();
        } catch (Throwable th) {
            throw new zzffn(th);
        }
    }

    public final void b(Context context, wl wlVar, List list) throws zzffn {
        try {
            this.f9963a.F0(new a4.b(context), wlVar, list);
        } catch (Throwable th) {
            throw new zzffn(th);
        }
    }

    public final void c(boolean z9) {
        try {
            this.f9963a.b0(z9);
        } catch (Throwable th) {
            throw new zzffn(th);
        }
    }
}
