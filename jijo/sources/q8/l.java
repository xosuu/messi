package q8;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.b f16466b;

    static {
        NativeUtil.classesInit0(53);
    }

    public /* synthetic */ l(f.b bVar, int i10) {
        this.f16465a = i10;
        this.f16466b = bVar;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
