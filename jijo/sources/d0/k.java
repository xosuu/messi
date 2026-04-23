package d0;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocusId f12294b;

    public k(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.f12293a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f12294b = j.a(str);
        } else {
            this.f12294b = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        String str = ((k) obj).f12293a;
        String str2 = this.f12293a;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f12293a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.f12293a.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
