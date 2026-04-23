package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            s5.b bVar = new s5.b(stringWriter);
            bVar.f16731q = true;
            com.google.gson.internal.bind.g.f12179z.c(bVar, this);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
