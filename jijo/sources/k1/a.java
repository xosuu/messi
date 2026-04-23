package k1;

import g4.a0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14639b;

    public a(String str, boolean z9) {
        a0.f(str, "adsSdkName");
        this.f14638a = str;
        this.f14639b = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return a0.b(this.f14638a, aVar.f14638a) && this.f14639b == aVar.f14639b;
    }

    public final int hashCode() {
        return (this.f14638a.hashCode() * 31) + (this.f14639b ? 1231 : 1237);
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f14638a + ", shouldRecordObservation=" + this.f14639b;
    }
}
