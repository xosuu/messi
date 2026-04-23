package com.google.gson;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public enum a extends h {
    public a() {
        super("IDENTITY", 0);
    }

    @Override // com.google.gson.i
    public final String a(Field field) {
        return field.getName();
    }
}
