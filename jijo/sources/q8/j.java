package q8;

import team.dev.epro.apkcustom.activities.ResponseChecker;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ResponseChecker f16458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16459b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16460d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String[] f16461f;

    static {
        NativeUtil.classesInit0(63);
    }

    public /* synthetic */ j(ResponseChecker responseChecker, String str, int i10, String[] strArr) {
        this.f16458a = responseChecker;
        this.f16459b = str;
        this.f16460d = i10;
        this.f16461f = strArr;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
