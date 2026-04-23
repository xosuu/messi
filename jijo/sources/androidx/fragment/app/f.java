package androidx.fragment.app;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class f extends f.h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f770e;

    public final z o(Context context) {
        if (this.f769d) {
            return this.f770e;
        }
        b1 b1Var = (b1) this.f12845a;
        z zVarO = t3.i.o(context, b1Var.f734c, b1Var.f732a == 2, this.f768c);
        this.f770e = zVarO;
        this.f769d = true;
        return zVarO;
    }
}
