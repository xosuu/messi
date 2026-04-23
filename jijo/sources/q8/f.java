package q8;

import team.dev.epro.apkcustom.activities.ResponseChecker;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ResponseChecker f16450b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16451d;

    static {
        NativeUtil.classesInit0(4);
    }

    public /* synthetic */ f(ResponseChecker responseChecker, String str, int i10) {
        this.f16449a = i10;
        this.f16450b = responseChecker;
        this.f16451d = str;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
