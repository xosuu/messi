package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.x;
import com.google.gson.y;

/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$32 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f12123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f12124b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f12125d;

    public TypeAdapters$32(Class cls, Class cls2, x xVar) {
        this.f12123a = cls;
        this.f12124b = cls2;
        this.f12125d = xVar;
    }

    @Override // com.google.gson.y
    public final x a(j jVar, r5.a aVar) {
        Class cls = aVar.f16536a;
        if (cls == this.f12123a || cls == this.f12124b) {
            return this.f12125d;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f12124b.getName() + "+" + this.f12123a.getName() + ",adapter=" + this.f12125d + "]";
    }
}
