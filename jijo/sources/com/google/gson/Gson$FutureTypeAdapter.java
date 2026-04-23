package com.google.gson;

import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;

/* JADX INFO: loaded from: classes.dex */
class Gson$FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f12051a;

    @Override // com.google.gson.x
    public final Object b(s5.a aVar) {
        x xVar = this.f12051a;
        if (xVar != null) {
            return xVar.b(aVar);
        }
        throw new IllegalStateException("Delegate has not been set yet");
    }

    @Override // com.google.gson.x
    public final void c(s5.b bVar, Object obj) {
        x xVar = this.f12051a;
        if (xVar == null) {
            throw new IllegalStateException("Delegate has not been set yet");
        }
        xVar.c(bVar, obj);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final x d() {
        x xVar = this.f12051a;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("Delegate has not been set yet");
    }
}
