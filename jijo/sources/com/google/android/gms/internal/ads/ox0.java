package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ox0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7694a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f7696d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7695b = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7697f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7698h = Integer.MAX_VALUE;

    public ox0(CharSequence charSequence) {
        this.f7696d = charSequence;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        int iD;
        int i10 = this.f7695b;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int i11 = i10 - 1;
        String string = null;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f7695b = 4;
            int i12 = this.f7697f;
            while (true) {
                int i13 = this.f7697f;
                if (i13 == -1) {
                    this.f7695b = 3;
                    break;
                }
                int iE = e(i13);
                CharSequence charSequence = this.f7696d;
                if (iE == -1) {
                    iE = charSequence.length();
                    this.f7697f = -1;
                    iD = -1;
                } else {
                    iD = d(iE);
                    this.f7697f = iD;
                }
                if (iD == i12) {
                    int i14 = iD + 1;
                    this.f7697f = i14;
                    if (i14 > charSequence.length()) {
                        this.f7697f = -1;
                    }
                } else {
                    if (i12 < iE) {
                        charSequence.charAt(i12);
                    }
                    if (i12 < iE) {
                        charSequence.charAt(iE - 1);
                    }
                    int i15 = this.f7698h;
                    if (i15 == 1) {
                        iE = charSequence.length();
                        this.f7697f = -1;
                        if (iE > i12) {
                            charSequence.charAt(iE - 1);
                        }
                    } else {
                        this.f7698h = i15 - 1;
                    }
                    string = charSequence.subSequence(i12, iE).toString();
                }
            }
            this.f7694a = string;
            if (this.f7695b != 3) {
                this.f7695b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7695b = 2;
        String str = this.f7694a;
        this.f7694a = null;
        return str;
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    public abstract int d(int i10);

    public abstract int e(int i10);

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
