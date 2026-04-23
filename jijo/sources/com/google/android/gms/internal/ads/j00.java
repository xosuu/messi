package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j00 implements a00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzj f5753b = zzu.zzo().d();

    public j00(Context context) {
        this.f5752a = context;
    }

    @Override // com.google.android.gms.internal.ads.a00
    public final void a(HashMap map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        boolean z9 = Boolean.parseBoolean(str);
        this.f5753b.zzI(z9);
        if (z9) {
            zzad.zzc(this.f5752a);
        }
    }
}
