package p6;

import n6.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements n6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f16254a = new b();

    @Override // n6.e
    public final void d(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // n6.e
    public final j getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
