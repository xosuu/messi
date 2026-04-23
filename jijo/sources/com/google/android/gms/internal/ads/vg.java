package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f9838a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f9839b = "media3.common";

    public static synchronized void a(String str) {
        if (f9838a.add(str)) {
            f9839b = f9839b + ", " + str;
        }
    }
}
