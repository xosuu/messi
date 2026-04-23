package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f876a = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x0 f877b;

    static {
        x0 x0Var;
        try {
            x0Var = (x0) w1.l.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            x0Var = null;
        }
        f877b = x0Var;
    }

    public static void a(s sVar, s sVar2, boolean z9) {
        if (z9) {
            sVar2.getClass();
        } else {
            sVar.getClass();
        }
    }

    public static void b(int i10, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i10);
        }
    }
}
