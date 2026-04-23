package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mj1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bo1 f6985b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk1 f6986d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ IOException f6987f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f6988h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f6989q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6990s;

    public /* synthetic */ mj1(Object obj, Object obj2, bo1 bo1Var, gk1 gk1Var, IOException iOException, boolean z9, int i10) {
        this.f6984a = i10;
        this.f6989q = obj;
        this.f6990s = obj2;
        this.f6985b = bo1Var;
        this.f6986d = gk1Var;
        this.f6987f = iOException;
        this.f6988h = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6984a;
        Object obj = this.f6990s;
        Object obj2 = this.f6989q;
        switch (i10) {
            case 0:
                Pair pair = (Pair) obj;
                ((rj1) ((ok0) obj2).f7598d).f8623h.r(((Integer) pair.first).intValue(), (jo1) pair.second, this.f6985b, this.f6986d, this.f6987f, this.f6988h);
                break;
            default:
                ((no1) obj).r(0, ((pm1) obj2).f7921a, this.f6985b, this.f6986d, this.f6987f, this.f6988h);
                break;
        }
    }
}
