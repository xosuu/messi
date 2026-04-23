package dev.epro.v2ray.util;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Semaphore;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class GuardProcess {
    private List<String> cmd;
    private volatile Thread guardThread;
    private volatile boolean isDestroyed;
    private volatile boolean isRestart = false;
    private volatile Process process;

    /* JADX INFO: renamed from: dev.epro.v2ray.util.GuardProcess$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ Context val$context;
        final /* synthetic */ Callback val$restartCallback;
        final /* synthetic */ Semaphore val$semaphore;

        static {
            NativeUtil.classesInit0(171);
        }

        public AnonymousClass1(Context context, Callback callback, Semaphore semaphore) {
            this.val$context = context;
            this.val$restartCallback = callback;
            this.val$semaphore = semaphore;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    static {
        NativeUtil.classesInit0(190);
    }

    public GuardProcess(List<String> list) {
        this.cmd = list;
    }

    public native void destroy();

    public native synchronized void restart();

    public native GuardProcess start(Callback callback, Context context);

    public native int waitFor();
}
