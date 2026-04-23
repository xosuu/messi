package t8;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17095b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f17096d;

    static {
        NativeUtil.classesInit0(158);
    }

    public /* synthetic */ x(a0 a0Var, int i10, int i11) {
        this.f17094a = i11;
        this.f17096d = a0Var;
        this.f17095b = i10;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
