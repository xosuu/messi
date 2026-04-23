package t8;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f17089b;

    static {
        NativeUtil.classesInit0(167);
    }

    public /* synthetic */ u(v vVar, int i10) {
        this.f17088a = i10;
        this.f17089b = vVar;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
