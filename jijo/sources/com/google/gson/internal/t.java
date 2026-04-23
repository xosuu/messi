package com.google.gson.internal;

/* JADX INFO: loaded from: classes.dex */
public final class t extends u {
    @Override // com.google.gson.internal.u
    public final Object a(Class cls) {
        throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    }
}
