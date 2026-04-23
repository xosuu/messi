package q8;

import team.dev.epro.apkcustom.activities.MobileIPHunter;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileIPHunter f16443b;

    static {
        NativeUtil.classesInit0(7);
    }

    public /* synthetic */ a(MobileIPHunter mobileIPHunter, int i10) {
        this.f16442a = i10;
        this.f16443b = mobileIPHunter;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
