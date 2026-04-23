package j6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a0 f14370d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f14371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashSet f14372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f14373c;

    public static boolean a(Context context) {
        Intent intent = new Intent("org.torproject.android.intent.action.START");
        intent.setPackage("org.torproject.android");
        intent.putExtra("org.torproject.android.intent.extra.PACKAGE_NAME", context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0;
    }

    public static a0 b() {
        if (f14370d == null) {
            a0 a0Var = new a0();
            a0Var.f14372b = new HashSet();
            a0Var.f14373c = new z(a0Var);
            f14370d = a0Var;
        }
        return f14370d;
    }

    public final synchronized void c(x xVar) {
        this.f14372b.remove(xVar);
        if (this.f14372b.size() == 0) {
            this.f14371a.unregisterReceiver(this.f14373c);
        }
    }
}
