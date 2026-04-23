package h2;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13940d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13937a == aVar.f13937a && this.f13938b == aVar.f13938b && this.f13939c == aVar.f13939c && this.f13940d == aVar.f13940d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z9 = this.f13938b;
        ?? r12 = this.f13937a;
        int i10 = r12;
        if (z9) {
            i10 = r12 + 16;
        }
        int i11 = i10;
        if (this.f13939c) {
            i11 = i10 + NotificationCompat.FLAG_LOCAL_ONLY;
        }
        return this.f13940d ? i11 + NotificationCompat.FLAG_BUBBLE : i11;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f13937a), Boolean.valueOf(this.f13938b), Boolean.valueOf(this.f13939c), Boolean.valueOf(this.f13940d));
    }
}
