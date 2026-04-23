package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xk implements wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final le0 f10595b;

    public xk(le0 le0Var, int i10) {
        this.f10594a = i10;
        if (i10 != 1) {
            if (le0Var == null) {
                throw new NullPointerException("The Inspector Manager must not be null");
            }
            this.f10595b = le0Var;
        } else {
            if (le0Var == null) {
                throw new NullPointerException("The Inspector Manager must not be null");
            }
            this.f10595b = le0Var;
        }
    }

    private final void a(Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        le0 le0Var = this.f10595b;
        String str = (String) map.get("persistentData");
        synchronized (le0Var) {
            le0Var.f6601x = str;
            zzu.zzo().d().zzH(le0Var.f6601x);
        }
    }

    @Override // com.google.android.gms.internal.ads.wk
    public final void b(Object obj, Map map) {
        switch (this.f10594a) {
            case 0:
                a(map);
                return;
            default:
                if (map == null || !map.containsKey("extras")) {
                    return;
                }
                long j10 = Long.MAX_VALUE;
                if (map.containsKey("expires")) {
                    try {
                        j10 = Long.parseLong((String) map.get("expires"));
                        break;
                    } catch (NumberFormatException unused) {
                    }
                }
                le0 le0Var = this.f10595b;
                String str = (String) map.get("extras");
                synchronized (le0Var) {
                    le0Var.f6592o = str;
                    le0Var.f6594q = j10;
                    le0Var.j();
                }
                return;
        }
    }
}
