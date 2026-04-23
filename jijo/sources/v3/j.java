package v3;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static j f17772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final RootTelemetryConfiguration f17773c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RootTelemetryConfiguration f17774a;

    public static synchronized j a() {
        try {
            if (f17772b == null) {
                f17772b = new j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17772b;
    }
}
