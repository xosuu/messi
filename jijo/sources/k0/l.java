package k0;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
