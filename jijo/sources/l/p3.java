package l;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class p3 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f14968a = new Object();

    public static void a(Context context) {
        if (context.getResources() instanceof r3) {
            return;
        }
        context.getResources();
        int i10 = c4.f14838a;
    }
}
