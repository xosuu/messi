package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class TypeAdapter$1 extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f12052a;

    public TypeAdapter$1(x xVar) {
        this.f12052a = xVar;
    }

    @Override // com.google.gson.x
    public final Object b(s5.a aVar) {
        if (aVar.T() != 9) {
            return this.f12052a.b(aVar);
        }
        aVar.P();
        return null;
    }

    @Override // com.google.gson.x
    public final void c(s5.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.G();
        } else {
            this.f12052a.c(bVar, obj);
        }
    }
}
