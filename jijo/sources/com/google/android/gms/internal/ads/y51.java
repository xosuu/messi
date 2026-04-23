package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class y51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f10786a = Logger.getLogger(y51.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f10787b = new AtomicBoolean(false);

    public static boolean a() {
        return f10787b.get();
    }
}
