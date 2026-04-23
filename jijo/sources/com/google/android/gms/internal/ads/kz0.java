package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class kz0 extends l01 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6439b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractList f6440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f6439b = i10;
        this.f6440d = abstractList;
    }

    @Override // com.google.android.gms.internal.ads.k01
    public final Object a(Object obj) {
        int i10 = this.f6439b;
        AbstractList abstractList = this.f6440d;
        switch (i10) {
            case 0:
                return ((lz0) abstractList).f6779b.apply(obj);
            default:
                return ((mz0) abstractList).f7081b.apply(obj);
        }
    }
}
