package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class Gson$1 extends x {
    @Override // com.google.gson.x
    public final Object b(s5.a aVar) {
        if (aVar.T() != 9) {
            return Double.valueOf(aVar.K());
        }
        aVar.P();
        return null;
    }

    @Override // com.google.gson.x
    public final void c(s5.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.G();
            return;
        }
        double dDoubleValue = number.doubleValue();
        j.a(dDoubleValue);
        bVar.J(dDoubleValue);
    }
}
