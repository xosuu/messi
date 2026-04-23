package t8;

import com.google.android.gms.ads.AdListener;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.s f17061b;

    static {
        NativeUtil.classesInit0(155);
    }

    public /* synthetic */ k(int i10, androidx.fragment.app.s sVar) {
        this.f17060a = i10;
        this.f17061b = sVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final native void onAdLoaded();
}
