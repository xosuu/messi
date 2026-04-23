package s8;

import android.view.View;
import team.dev.epro.apkcustom.dialogs.UdpCustom;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UdpCustom f16768b;

    static {
        NativeUtil.classesInit0(139);
    }

    public /* synthetic */ n(UdpCustom udpCustom, int i10) {
        this.f16767a = i10;
        this.f16768b = udpCustom;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
