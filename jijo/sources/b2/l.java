package b2;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f1247d;

    public l() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f1247d = Pattern.compile("\\A\\d+");
    }

    @Override // b2.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // b2.c
    public final boolean b() {
        int i10;
        PackageInfo packageInfoA;
        boolean zB = super.b();
        if (!zB || (i10 = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        int i11 = a2.c.f10a;
        if (i10 >= 26) {
            packageInfoA = d.a();
        } else {
            try {
                packageInfoA = a2.c.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoA = null;
            }
        }
        if (packageInfoA == null) {
            return false;
        }
        Matcher matcher = this.f1247d.matcher(packageInfoA.versionName);
        return matcher.find() && Integer.parseInt(packageInfoA.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
