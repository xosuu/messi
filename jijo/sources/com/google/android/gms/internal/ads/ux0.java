package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ux0 extends m01 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9639b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9640d;

    public ux0() {
        super(0);
        this.f9640d = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i10 = this.f9640d;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int i11 = i10 - 1;
        Object obj = null;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f9640d = 4;
            gz0 gz0Var = (gz0) this;
            int i12 = gz0Var.f5116f;
            Object obj2 = gz0Var.f5118q;
            Iterator it = gz0Var.f5117h;
            switch (i12) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((ix0) obj2).zza(next)) {
                            obj = next;
                            break;
                        }
                    }
                    gz0Var.f9640d = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        Set set = ((f01) obj2).f4348b;
                        next = it.next();
                        if (set.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    gz0Var.f9640d = 3;
                    break;
            }
            this.f9639b = obj;
            if (this.f9640d != 3) {
                this.f9640d = 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.m01, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9640d = 2;
        Object obj = this.f9639b;
        this.f9639b = null;
        return obj;
    }
}
