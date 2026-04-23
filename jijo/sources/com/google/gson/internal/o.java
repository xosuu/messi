package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f12211a;

    static {
        o mVar;
        if (e.f12183a >= 9) {
            try {
                mVar = new m(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                mVar = null;
            }
        } else {
            mVar = null;
        }
        if (mVar == null) {
            mVar = new n();
        }
        f12211a = mVar;
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
