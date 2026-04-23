package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gb f4518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final da f4519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fk f4520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d8 f4521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ic f4522f;

    static {
        zy0 zy0Var = bz0.f3132b;
        wz0 wz0Var = wz0.f10382h;
        Collections.emptyList();
        ic icVar = ic.f5559a;
        new d8();
        fk fkVar = fk.f4541y;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ fg(String str, d8 d8Var, gb gbVar, da daVar, fk fkVar, ic icVar) {
        this.f4517a = str;
        this.f4518b = gbVar;
        this.f4519c = daVar;
        this.f4520d = fkVar;
        this.f4521e = d8Var;
        this.f4522f = icVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg)) {
            return false;
        }
        fg fgVar = (fg) obj;
        return yn0.c(this.f4517a, fgVar.f4517a) && this.f4521e.equals(fgVar.f4521e) && yn0.c(this.f4518b, fgVar.f4518b) && yn0.c(this.f4519c, fgVar.f4519c) && yn0.c(this.f4520d, fgVar.f4520d) && yn0.c(this.f4522f, fgVar.f4522f);
    }

    public final int hashCode() {
        int iHashCode = this.f4517a.hashCode() * 31;
        gb gbVar = this.f4518b;
        return (this.f4520d.hashCode() + ((this.f4521e.hashCode() + ((this.f4519c.hashCode() + ((iHashCode + (gbVar != null ? gbVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
