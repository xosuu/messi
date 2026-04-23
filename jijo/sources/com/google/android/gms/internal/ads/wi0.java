package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class wi0 implements ci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10196a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10200e;

    public wi0(Context context, Executor executor, i80 i80Var, er0 er0Var) {
        this.f10197b = context;
        this.f10198c = i80Var;
        this.f10199d = executor;
        this.f10200e = er0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    @Override // com.google.android.gms.internal.ads.ci0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n5.a a(com.google.android.gms.internal.ads.kr0 r23, com.google.android.gms.internal.ads.fr0 r24) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wi0.a(com.google.android.gms.internal.ads.kr0, com.google.android.gms.internal.ads.fr0):n5.a");
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final boolean b(kr0 kr0Var, fr0 fr0Var) {
        String string;
        ir0 ir0Var;
        int i10 = this.f10196a;
        Object obj = this.f10197b;
        switch (i10) {
            case 0:
                Context context = (Context) obj;
                if (!(context instanceof Activity) || !pg.a(context)) {
                    return false;
                }
                try {
                    string = fr0Var.f4642v.getString("tab_url");
                    break;
                } catch (Exception unused) {
                    string = null;
                }
                return !TextUtils.isEmpty(string);
            case 1:
                return !fr0Var.f4638t.isEmpty();
            default:
                return (((og) obj) == null || (ir0Var = fr0Var.f4636s) == null || ir0Var.f5679a == null) ? false : true;
        }
    }

    public wi0(xs0 xs0Var, p21 p21Var, og ogVar, jp0 jp0Var) {
        this.f10199d = xs0Var;
        this.f10198c = p21Var;
        this.f10197b = ogVar;
        this.f10200e = jp0Var;
    }

    public wi0(xs0 xs0Var, p21 p21Var, ei0 ei0Var, hi0 hi0Var) {
        this.f10199d = xs0Var;
        this.f10200e = p21Var;
        this.f10198c = hi0Var;
        this.f10197b = ei0Var;
    }
}
