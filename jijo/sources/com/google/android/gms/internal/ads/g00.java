package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g00 implements a00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4741b;

    public /* synthetic */ g00(int i10, Object obj) {
        this.f4740a = i10;
        this.f4741b = obj;
    }

    @Override // com.google.android.gms.internal.ads.a00
    public final void a(HashMap map) {
        int i10 = this.f4740a;
        Object obj = this.f4741b;
        switch (i10) {
            case 0:
                if (((Boolean) zzba.zzc().a(eg.z9)).booleanValue()) {
                    tc1.V(h21.r(((lf0) obj).b(true)), Throwable.class, new f00(0), nu.f7383a);
                    return;
                }
                return;
            case 1:
                String str = (String) map.get("render_in_browser");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    er0 er0Var = (er0) obj;
                    if (Boolean.parseBoolean(str)) {
                        er0Var.c(1, 2);
                    } else {
                        er0Var.c(2, 1);
                    }
                    return;
                } catch (Exception e10) {
                    throw new IllegalStateException("Invalid render_in_browser state", e10);
                }
            default:
                CookieManager cookieManager = (CookieManager) obj;
                if (cookieManager == null) {
                    return;
                }
                if (((String) map.get("clear")) == null) {
                    String str2 = (String) map.get("cookie");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    cookieManager.setCookie((String) zzba.zzc().a(eg.F0), str2);
                    return;
                }
                String str3 = (String) zzba.zzc().a(eg.F0);
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null) {
                    List listP = ks0.o(new ex0(';')).p(cookie);
                    for (int i11 = 0; i11 < listP.size(); i11++) {
                        String str4 = (String) listP.get(i11);
                        ks0 ks0VarO = ks0.o(new ex0('='));
                        str4.getClass();
                        Iterator itF = ((px0) ks0VarO.f6384a).f(ks0VarO, str4);
                        itF.getClass();
                        if (!itF.hasNext()) {
                            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                        }
                        cookieManager.setCookie(str3, String.valueOf((String) itF.next()).concat(String.valueOf((String) zzba.zzc().a(eg.f4114r0))));
                    }
                    return;
                }
                return;
        }
    }

    public g00(Context context) {
        this.f4740a = 2;
        this.f4741b = zzu.zzq().zza(context);
    }
}
