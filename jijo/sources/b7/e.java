package b7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1408c = AtomicIntegerFieldUpdater.newUpdater(e.class, "_resumed");
    private volatile int _resumed;

    public e(n6.e eVar, Throwable th) {
        super(th, false);
        this._resumed = 0;
    }
}
