package v3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l implements t3.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f17777c = new l(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17778b;

    public /* synthetic */ l(String str) {
        this.f17778b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return b7.u.i(this.f17778b, ((l) obj).f17778b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17778b});
    }
}
