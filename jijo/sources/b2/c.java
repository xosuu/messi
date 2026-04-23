package b2;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f1239c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1241b;

    public c(String str, String str2) {
        this.f1240a = str;
        this.f1241b = str2;
        f1239c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f1237a;
        String str = this.f1241b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ("eng".equals(str2) || "userdebug".equals(str2)) {
                if (hashSet.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }
}
