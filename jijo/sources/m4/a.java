package m4;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f15740a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1.b f15741b = new b1.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1.a f15742c = new b1.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b1.c f15743d = new b1.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f15744e = new DecelerateInterpolator();

    public static int a(float f10, int i10, int i11) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }
}
