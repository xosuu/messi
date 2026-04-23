package u3;

import com.google.android.gms.internal.ads.ur0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ur0 f17553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t3.b f17554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17555d;

    public a(ur0 ur0Var, t3.b bVar, String str) {
        this.f17553b = ur0Var;
        this.f17554c = bVar;
        this.f17555d = str;
        this.f17552a = Arrays.hashCode(new Object[]{ur0Var, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return b7.u.i(this.f17553b, aVar.f17553b) && b7.u.i(this.f17554c, aVar.f17554c) && b7.u.i(this.f17555d, aVar.f17555d);
    }

    public final int hashCode() {
        return this.f17552a;
    }
}
