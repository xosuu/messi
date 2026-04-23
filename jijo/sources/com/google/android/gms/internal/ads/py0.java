package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class py0 extends jy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8011b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0 f8012d;

    public py0(qy0 qy0Var, int i10) {
        this.f8012d = qy0Var;
        Object obj = qy0.f8324v;
        this.f8010a = qy0Var.b()[i10];
        this.f8011b = i10;
    }

    public final void a() {
        int i10 = this.f8011b;
        Object obj = this.f8010a;
        qy0 qy0Var = this.f8012d;
        if (i10 != -1 && i10 < qy0Var.size()) {
            if (tp1.P(obj, qy0Var.b()[this.f8011b])) {
                return;
            }
        }
        Object obj2 = qy0.f8324v;
        this.f8011b = qy0Var.h(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8010a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        qy0 qy0Var = this.f8012d;
        Map mapD = qy0Var.d();
        if (mapD != null) {
            return mapD.get(this.f8010a);
        }
        a();
        int i10 = this.f8011b;
        if (i10 == -1) {
            return null;
        }
        return qy0Var.c()[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        qy0 qy0Var = this.f8012d;
        Map mapD = qy0Var.d();
        Object obj2 = this.f8010a;
        if (mapD != null) {
            return mapD.put(obj2, obj);
        }
        a();
        int i10 = this.f8011b;
        if (i10 == -1) {
            qy0Var.put(obj2, obj);
            return null;
        }
        Object obj3 = qy0Var.c()[i10];
        qy0Var.c()[this.f8011b] = obj;
        return obj3;
    }
}
