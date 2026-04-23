package w4;

import android.content.Context;
import g4.a0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18155f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18160e;

    public a(Context context) {
        boolean zV = a0.v(context, R.attr.ks, false);
        int iH = a0.h(context, R.attr.kr, 0);
        int iH2 = a0.h(context, R.attr.kq, 0);
        int iH3 = a0.h(context, R.attr.ho, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f18156a = zV;
        this.f18157b = iH;
        this.f18158c = iH2;
        this.f18159d = iH3;
        this.f18160e = f10;
    }
}
