package d2;

import android.content.Context;
import android.os.Build;
import c2.n;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f12326a;

    static {
        n.l("WrkDbPathHelper");
        f12326a = new String[]{"-journal", "-shm", "-wal"};
    }

    public static void a(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || !databasePath.exists()) {
            return;
        }
        n.i().g(new Throwable[0]);
        HashMap map = new HashMap();
        if (i10 >= 23) {
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            File databasePath3 = i10 < 23 ? context.getDatabasePath("androidx.work.workdb") : new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            map.put(databasePath2, databasePath3);
            for (String str : f12326a) {
                map.put(new File(databasePath2.getPath() + str), new File(databasePath3.getPath() + str));
            }
        }
        for (File file : map.keySet()) {
            File file2 = (File) map.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    String.format("Over-writing contents of %s", file2);
                    n.i().n(new Throwable[0]);
                }
                if (file.renameTo(file2)) {
                    String.format("Migrated %s to %s", file, file2);
                } else {
                    String.format("Renaming %s to %s failed", file, file2);
                }
                n.i().g(new Throwable[0]);
            }
        }
    }
}
