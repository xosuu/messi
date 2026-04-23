package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u00 implements wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v00 f9332b;

    public /* synthetic */ u00(v00 v00Var, int i10) {
        this.f9331a = i10;
        this.f9332b = v00Var;
    }

    @Override // com.google.android.gms.internal.ads.wk
    public final void b(Object obj, Map map) {
        int i10 = this.f9331a;
        v00 v00Var = this.f9332b;
        switch (i10) {
            case 0:
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str) && str.equals(v00Var.f9713a)) {
                        v00Var.f9715c.execute(new s9(19, this));
                        break;
                    }
                }
                break;
            default:
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2) && str2.equals(v00Var.f9713a)) {
                        v00Var.f9715c.execute(new s9(20, this));
                        break;
                    }
                }
                break;
        }
    }
}
