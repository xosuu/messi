package g2;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import c2.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13628b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f13629a;

    static {
        n.l("SystemJobInfoConverter");
    }

    public b(Context context) {
        this.f13629a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
