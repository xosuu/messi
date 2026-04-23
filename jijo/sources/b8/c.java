package b8;

import b7.u;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f1481f = new c(c.class.getSimpleName(), 1000);

    @Override // b8.d
    public final List b() {
        ArrayList arrayList;
        InetAddress byName;
        String hostAddress;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            arrayList = new ArrayList(5);
            String[] strArr = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str = (String) method.invoke(null, strArr[i10]);
                if (str != null && str.length() != 0 && !arrayList.contains(str) && (byName = InetAddress.getByName(str)) != null && (hostAddress = byName.getHostAddress()) != null && hostAddress.length() != 0 && !arrayList.contains(hostAddress)) {
                    arrayList.add(hostAddress);
                }
            }
        } catch (Exception e10) {
            a.f1477d.log(Level.WARNING, "Exception in findDNSByReflection", (Throwable) e10);
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    @Override // b8.d
    public final boolean c() {
        return u.s();
    }
}
