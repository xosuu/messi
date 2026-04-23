package m;

import com.google.android.gms.internal.ads.fb1;
import g4.b0;
import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15368c;

    public /* synthetic */ b(b0 b0Var) {
        this.f15366a = 2;
        this.f15367b = b0Var;
        this.f15368c = "Google consent worker";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i10 = this.f15366a;
        Object obj = this.f15367b;
        switch (i10) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(((AtomicInteger) obj).getAndIncrement())));
                return thread;
            case 1:
                return new Thread(runnable, "AdWorker(" + ((String) this.f15368c) + ") #" + ((AtomicInteger) obj).getAndIncrement());
            default:
                b0 b0Var = (b0) obj;
                Thread thread2 = new Thread(runnable, fb1.g("Google consent worker #", b0Var.f13689a.getAndIncrement()));
                b0Var.f13691d = new WeakReference(thread2);
                return thread2;
        }
    }

    public b(String str) {
        this.f15366a = 1;
        this.f15368c = str;
        this.f15367b = new AtomicInteger(1);
    }

    public b(c cVar) {
        this.f15366a = 0;
        this.f15368c = cVar;
        this.f15367b = new AtomicInteger(0);
    }
}
