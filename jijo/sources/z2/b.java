package z2;

import com.balsikandar.crashreporter.utils.CrashReporterNotInitializedException;
import java.io.File;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20684a = 0;

    public static String a() {
        StringBuilder sb = new StringBuilder();
        if (i.f16852a == null) {
            try {
                throw new CrashReporterNotInitializedException("Initialize CrashReporter : call CrashReporter.initialize(context, crashReportPath)");
            } catch (Exception unused) {
            }
        }
        sb.append(i.f16852a.getExternalFilesDir(null).getAbsolutePath());
        String strR = g1.a.r(sb, File.separator, "crashReports");
        new File(strR).mkdirs();
        return strR;
    }
}
