package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f132e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f133a;

    @Override // androidx.lifecycle.o
    public final void a(androidx.lifecycle.q qVar, androidx.lifecycle.k kVar) {
        if (kVar != androidx.lifecycle.k.ON_DESTROY) {
            return;
        }
        if (f129b == 0) {
            try {
                f129b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f131d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f132e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f130c = declaredField3;
                declaredField3.setAccessible(true);
                f129b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f129b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f133a.getSystemService("input_method");
            try {
                Object obj = f130c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f131d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f132e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
