package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class as0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2783c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f2781a = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final os0 f2784d = new os0();

    public as0(int i10, int i11) {
        this.f2782b = i10;
        this.f2783c = i11;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.f2781a;
            if (linkedList.isEmpty()) {
                return;
            }
            es0 es0Var = (es0) linkedList.getFirst();
            ((y3.b) zzu.zzB()).getClass();
            if (System.currentTimeMillis() - es0Var.f4288d < this.f2783c) {
                return;
            }
            os0 os0Var = this.f2784d;
            os0Var.f7666f++;
            os0Var.f7662b.f7380b++;
            linkedList.remove();
        }
    }
}
