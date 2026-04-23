package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class qy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bz0 f8316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bz0 f8317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bz0 f8318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zx f8319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public bz0 f8320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f8322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f8323k;

    public qy() {
        this.f8313a = Integer.MAX_VALUE;
        this.f8314b = Integer.MAX_VALUE;
        this.f8315c = true;
        zy0 zy0Var = bz0.f3132b;
        wz0 wz0Var = wz0.f10382h;
        this.f8316d = wz0Var;
        this.f8317e = wz0Var;
        this.f8318f = wz0Var;
        this.f8319g = zx.f11332a;
        this.f8320h = wz0Var;
        this.f8321i = 0;
        this.f8322j = new HashMap();
        this.f8323k = new HashSet();
    }

    public qy(xy xyVar) {
        this.f8313a = xyVar.f10674a;
        this.f8314b = xyVar.f10675b;
        this.f8315c = xyVar.f10676c;
        this.f8316d = xyVar.f10677d;
        this.f8317e = xyVar.f10678e;
        this.f8318f = xyVar.f10679f;
        this.f8319g = xyVar.f10680g;
        this.f8320h = xyVar.f10681h;
        this.f8321i = xyVar.f10682i;
        this.f8323k = new HashSet(xyVar.f10684k);
        this.f8322j = new HashMap(xyVar.f10683j);
    }
}
