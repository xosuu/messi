package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.x;
import com.google.gson.y;

/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$31 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f12121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f12122b;

    public TypeAdapters$31(Class cls, x xVar) {
        this.f12121a = cls;
        this.f12122b = xVar;
    }

    @Override // com.google.gson.y
    public final x a(j jVar, r5.a aVar) {
        if (aVar.f16536a == this.f12121a) {
            return this.f12122b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f12121a.getName() + ",adapter=" + this.f12122b + "]";
    }
}
