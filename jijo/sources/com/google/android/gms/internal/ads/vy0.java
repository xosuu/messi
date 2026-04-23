package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class vy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f10006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10007b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10008c;

    public vy0(int i10) {
        this.f10006a = new Object[i10];
    }

    public static int d(int i10, int i11) {
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int iHighestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = iHighestOneBit + iHighestOneBit;
        }
        if (i12 < 0) {
            return Integer.MAX_VALUE;
        }
        return i12;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(this.f10007b + 1);
        Object[] objArr = this.f10006a;
        int i10 = this.f10007b;
        this.f10007b = i10 + 1;
        objArr[i10] = obj;
    }

    public abstract vy0 b(Object obj);

    public final void c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size() + this.f10007b);
            if (collection instanceof wy0) {
                this.f10007b = ((wy0) collection).b(this.f10007b, this.f10006a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void e(int i10) {
        Object[] objArr = this.f10006a;
        int length = objArr.length;
        if (length < i10) {
            this.f10006a = Arrays.copyOf(objArr, d(length, i10));
            this.f10008c = false;
        } else if (this.f10008c) {
            this.f10006a = (Object[]) objArr.clone();
            this.f10008c = false;
        }
    }

    public void f(Object obj) {
        a(obj);
    }
}
