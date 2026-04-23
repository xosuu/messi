package o0;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f16009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16011d;

    public b0(int i10, Class cls, int i11, int i12) {
        this.f16008a = i10;
        this.f16009b = cls;
        this.f16011d = i11;
        this.f16010c = i12;
    }

    public final Object a(View view) {
        if (Build.VERSION.SDK_INT < this.f16010c) {
            Object tag = view.getTag(this.f16008a);
            if (this.f16009b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
        int i10 = ((z) this).f16088e;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(o0.d(view));
                    default:
                        return Boolean.valueOf(o0.c(view));
                }
            case 1:
                switch (i10) {
                    case 1:
                        return o0.b(view);
                    default:
                        return q0.a(view);
                }
            case 2:
                switch (i10) {
                    case 1:
                        return o0.b(view);
                    default:
                        return q0.a(view);
                }
            default:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(o0.d(view));
                    default:
                        return Boolean.valueOf(o0.c(view));
                }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0065. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.b0.b(android.view.View, java.lang.Object):void");
    }
}
