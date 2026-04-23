package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f4855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bz0 f4857c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public /* synthetic */ gb(Uri uri, List list, bz0 bz0Var) {
        this.f4855a = uri;
        ArrayList arrayList = xm.f10605a;
        this.f4856b = list;
        this.f4857c = bz0Var;
        yy0 yy0Var = new yy0();
        if (bz0Var.size() <= 0) {
            yy0Var.g();
        } else {
            fb1.t(bz0Var.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return this.f4855a.equals(gbVar.f4855a) && yn0.c(null, null) && yn0.c(null, null) && yn0.c(null, null) && this.f4856b.equals(gbVar.f4856b) && yn0.c(null, null) && this.f4857c.equals(gbVar.f4857c) && yn0.c(null, null) && yn0.c(-9223372036854775807L, -9223372036854775807L);
    }

    public final int hashCode() {
        return (int) ((((long) ((this.f4857c.hashCode() + ((this.f4856b.hashCode() + (this.f4855a.hashCode() * 923521)) * 961)) * 31)) * 31) - Long.MAX_VALUE);
    }
}
