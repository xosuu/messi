package r2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.ur0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16504b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f16503a = i10;
        this.f16504b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f16503a;
        Object obj = this.f16504b;
        switch (i10) {
            case 0:
                ((Handler) obj).post(runnable);
                break;
            case 1:
                ((Handler) obj).post(runnable);
                break;
            default:
                ((Handler) ((ur0) obj).f9601d).post(runnable);
                break;
        }
    }

    public e() {
        this.f16503a = 0;
        this.f16504b = new Handler(Looper.getMainLooper());
    }
}
