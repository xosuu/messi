package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class Gson$2 extends x {
    @Override // com.google.gson.x
    public final Object b(s5.a aVar) {
        if (aVar.T() != 9) {
            return Float.valueOf((float) aVar.K());
        }
        aVar.P();
        return null;
    }

    @Override // com.google.gson.x
    public final void c(s5.b bVar, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            bVar.G();
            return;
        }
        float fFloatValue = numberValueOf.floatValue();
        j.a(fFloatValue);
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(fFloatValue);
        }
        bVar.M(numberValueOf);
    }
}
