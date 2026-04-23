package o0;

import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f16027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f16028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f16029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f16030d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f16027a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f16028b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f16029c = declaredField3;
            declaredField3.setAccessible(true);
            f16030d = true;
        } catch (ReflectiveOperationException e10) {
            e10.getMessage();
        }
    }
}
