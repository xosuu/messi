package m2;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    static {
        c2.n.l("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z9) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z9 ? 1 : 2, 1);
            c2.n nVarI = c2.n.i();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z9 ? "enabled" : "disabled";
            String.format("%s %s", objArr);
            nVarI.g(new Throwable[0]);
        } catch (Exception e10) {
            c2.n nVarI2 = c2.n.i();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z9 ? "enabled" : "disabled";
            String.format("%s could not be %s", objArr2);
            nVarI2.g(e10);
        }
    }
}
