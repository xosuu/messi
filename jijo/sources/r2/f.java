package r2;

import java.util.concurrent.ThreadFactory;
import l.j;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new j(this, 14, runnable));
    }
}
