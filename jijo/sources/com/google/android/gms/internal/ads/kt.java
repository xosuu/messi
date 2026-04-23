package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class kt implements wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6386b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6387d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6388f;

    public kt(Context context, String str) {
        this.f6385a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6387d = str;
        this.f6388f = false;
        this.f6386b = new Object();
    }

    @Override // com.google.android.gms.internal.ads.wb
    public final void Z(vb vbVar) {
        a(vbVar.f9827j);
    }

    public final void a(boolean z9) {
        if (zzu.zzn().g(this.f6385a)) {
            synchronized (this.f6386b) {
                try {
                    if (this.f6388f == z9) {
                        return;
                    }
                    this.f6388f = z9;
                    if (TextUtils.isEmpty(this.f6387d)) {
                        return;
                    }
                    if (this.f6388f) {
                        mt mtVarZzn = zzu.zzn();
                        Context context = this.f6385a;
                        String str = this.f6387d;
                        if (mtVarZzn.g(context)) {
                            mtVarZzn.k(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        mt mtVarZzn2 = zzu.zzn();
                        Context context2 = this.f6385a;
                        String str2 = this.f6387d;
                        if (mtVarZzn2.g(context2)) {
                            mtVarZzn2.k(context2, str2, "endAdUnitExposure");
                        }
                    }
                } finally {
                }
            }
        }
    }
}
