package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hz0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hz0 f5442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ hz0[] f5443b;

    static {
        hz0 hz0Var = new hz0("INSTANCE", 0);
        f5442a = hz0Var;
        f5443b = new hz0[]{hz0Var};
    }

    public static hz0[] values() {
        return (hz0[]) f5443b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        en1.M0("no calls to next() since the last call to remove()", false);
    }
}
