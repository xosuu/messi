package com.google.gson.internal.bind;

import com.google.gson.y;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12136b = new a(Date.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f12137a;

    public b(Class cls) {
        this.f12137a = cls;
    }

    public final y a(int i10, int i11) {
        DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, i10, i11);
        y yVar = g.f12154a;
        return new TypeAdapters$31(this.f12137a, defaultDateTypeAdapter);
    }

    public abstract Date b(Date date);
}
