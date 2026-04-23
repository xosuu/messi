package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.x;
import com.google.gson.y;
import v3.d0;

/* JADX INFO: loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f12081a;

    public JsonAdapterAnnotationTypeAdapterFactory(d0 d0Var) {
        this.f12081a = d0Var;
    }

    public static x b(d0 d0Var, j jVar, r5.a aVar, o5.a aVar2) {
        x treeTypeAdapter;
        Object objF = d0Var.d(new r5.a(aVar2.value())).f();
        boolean zNullSafe = aVar2.nullSafe();
        if (objF instanceof x) {
            treeTypeAdapter = (x) objF;
        } else if (objF instanceof y) {
            treeTypeAdapter = ((y) objF).a(jVar, aVar);
        } else {
            boolean z9 = objF instanceof q;
            if (!z9) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objF.getClass().getName() + " as a @JsonAdapter for " + com.google.gson.internal.d.h(aVar.f16537b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter(z9 ? (q) objF : null, jVar, aVar, null, zNullSafe);
            zNullSafe = false;
        }
        return (treeTypeAdapter == null || !zNullSafe) ? treeTypeAdapter : treeTypeAdapter.a();
    }

    @Override // com.google.gson.y
    public final x a(j jVar, r5.a aVar) {
        o5.a aVar2 = (o5.a) aVar.f16536a.getAnnotation(o5.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f12081a, jVar, aVar, aVar2);
    }
}
