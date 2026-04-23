package u3;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Feature f17606b;

    public /* synthetic */ p(a aVar, Feature feature) {
        this.f17605a = aVar;
        this.f17606b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof p)) {
            p pVar = (p) obj;
            if (b7.u.i(this.f17605a, pVar.f17605a) && b7.u.i(this.f17606b, pVar.f17606b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17605a, this.f17606b});
    }

    public final String toString() {
        f.f fVar = new f.f(this);
        fVar.g(this.f17605a, "key");
        fVar.g(this.f17606b, "feature");
        return fVar.toString();
    }
}
