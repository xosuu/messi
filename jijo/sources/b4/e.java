package b4;

import android.os.Process;
import java.util.LinkedList;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1325a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
        this.f1325a = 0;
    }

    private final void a() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    private static void b() {
        synchronized (g6.b.f13884b) {
            while (true) {
                try {
                    LinkedList linkedList = g6.b.f13884b;
                    if (linkedList.size() == 0) {
                        g6.b.f13885c = null;
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        g6.a aVar = (g6.a) linkedList.getFirst();
                        long j10 = aVar.f13881a;
                        if (j10 > jCurrentTimeMillis) {
                            try {
                                linkedList.wait(j10 - jCurrentTimeMillis);
                            } catch (InterruptedException unused) {
                            }
                        } else {
                            linkedList.removeFirst();
                            try {
                                aVar.f13882b.run();
                            } catch (Exception e10) {
                                g6.b.f13883a.f1578a.log(Level.FINE, "Exception in Timeout handler", (Throwable) e10);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001c, code lost:
    
        r1.m();
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r3 = this;
            int r0 = r3.f1325a
            switch(r0) {
                case 0: goto L26;
                case 1: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.Class<p7.c> r0 = p7.c.class
            monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L5
            p7.c r1 = p7.c.h()     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            goto L5
        L10:
            r1 = move-exception
            goto L20
        L12:
            p7.c r2 = p7.c.f16268j     // Catch: java.lang.Throwable -> L10
            if (r1 != r2) goto L1b
            r1 = 0
            p7.c.f16268j = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r1.m()     // Catch: java.lang.InterruptedException -> L5
            goto L5
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.InterruptedException -> L5
        L22:
            b()
            return
        L26:
            r3.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.e.run():void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e() {
        this(1);
        this.f1325a = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10) {
        super("Okio Watchdog");
        this.f1325a = i10;
        if (i10 != 2) {
            return;
        }
        setDaemon(true);
    }
}
