package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class sa extends ib {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final jb f8824i = new jb();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f8825h;

    public sa(ja jaVar, j8 j8Var, int i10, Context context) {
        super(jaVar, "LYoHKR17UvbUNibqKPKJklawQJNaw1zk7CnhZAC68YBTzC7x4MYQVXp9Sihs98Ok", "ngqbGKXcQCvq0ft27xRzOzNoEVN+ei+Vq2+CNx9QQMc=", j8Var, i10, 29);
        this.f8825h = context;
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        j8 j8Var = this.f5555d;
        j8Var.d();
        x8.O0((x8) j8Var.f9462b, "E");
        AtomicReference atomicReferenceA = f8824i.a(this.f8825h.getPackageName());
        if (atomicReferenceA.get() == null) {
            synchronized (atomicReferenceA) {
                try {
                    if (atomicReferenceA.get() == null) {
                        atomicReferenceA.set((String) this.f5556e.invoke(null, this.f8825h));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceA.get();
        synchronized (this.f5555d) {
            j8 j8Var2 = this.f5555d;
            String strEncodeToString = Base64.encodeToString(str.getBytes(), 11);
            j8Var2.d();
            x8.O0((x8) j8Var2.f9462b, strEncodeToString);
        }
    }
}
