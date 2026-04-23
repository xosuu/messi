package c2;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f1523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1524b;

    public d(boolean z9, Uri uri) {
        this.f1523a = uri;
        this.f1524b = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1524b == dVar.f1524b && this.f1523a.equals(dVar.f1523a);
    }

    public final int hashCode() {
        return (this.f1523a.hashCode() * 31) + (this.f1524b ? 1 : 0);
    }
}
