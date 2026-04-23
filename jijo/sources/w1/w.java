package w1;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f18144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f18145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f18146c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f18144a = true;
        f18145b = true;
        f18146c = i10 >= 28;
    }
}
