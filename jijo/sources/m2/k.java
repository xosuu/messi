package m2;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f15709a;

    static {
        c2.n.l("WakeLocks");
        f15709a = new WeakHashMap();
    }

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strQ = g1.a.q("WorkManager: ", str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strQ);
        WeakHashMap weakHashMap = f15709a;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, strQ);
        }
        return wakeLockNewWakeLock;
    }
}
