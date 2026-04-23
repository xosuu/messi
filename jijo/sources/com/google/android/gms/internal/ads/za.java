package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class za extends ib {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f11195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f11196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f11197j;

    public za(ja jaVar, j8 j8Var, int i10, HashMap map, View view, Context context) {
        super(jaVar, "SKSJAjN3UKeguXyEasCGg04d/yJuUN8XZYgactMp4rfMtHcIJcD0mydl5RKvI49M", "lnMUlT0qopStslq/RfZHkyvg0xAUTVuMPsMot4SEaYA=", j8Var, i10, 85);
        this.f11195h = map;
        this.f11196i = view;
        this.f11197j = context;
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        long[] jArr = new long[2];
        Map map = this.f11195h;
        jArr[0] = map.containsKey(1) ? ((Long) map.get(1)).longValue() : Long.MIN_VALUE;
        Map map2 = this.f11195h;
        jArr[1] = map2.containsKey(2) ? ((Long) map2.get(2)).longValue() : Long.MIN_VALUE;
        Context context = this.f11197j;
        if (context == null) {
            context = this.f5552a.f5850a;
        }
        long[] jArr2 = (long[]) this.f5556e.invoke(null, jArr, context, this.f11196i);
        long j10 = jArr2[0];
        this.f11195h.put(1, Long.valueOf(jArr2[1]));
        long j11 = jArr2[2];
        this.f11195h.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f5555d) {
            j8 j8Var = this.f5555d;
            j8Var.d();
            x8.d0((x8) j8Var.f9462b, j10);
            j8 j8Var2 = this.f5555d;
            j8Var2.d();
            x8.e0((x8) j8Var2.f9462b, j11);
        }
    }
}
