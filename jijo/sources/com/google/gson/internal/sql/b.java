package com.google.gson.internal.sql;

import com.google.gson.y;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f12224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f12227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f12228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f12229f;

    static {
        boolean z9;
        try {
            Class.forName("java.sql.Date");
            z9 = true;
        } catch (ClassNotFoundException unused) {
            z9 = false;
        }
        f12224a = z9;
        if (z9) {
            f12225b = new a(Date.class, 0);
            f12226c = new a(Timestamp.class, 1);
            f12227d = SqlDateTypeAdapter.f12217b;
            f12228e = SqlTimeTypeAdapter.f12219b;
            f12229f = SqlTimestampTypeAdapter.f12221b;
            return;
        }
        f12225b = null;
        f12226c = null;
        f12227d = null;
        f12228e = null;
        f12229f = null;
    }
}
