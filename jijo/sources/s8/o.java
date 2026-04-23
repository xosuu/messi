package s8;

import android.widget.CompoundButton;
import team.dev.epro.apkcustom.dialogs.UdpCustom;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UdpCustom f16770b;

    static {
        NativeUtil.classesInit0(137);
    }

    public /* synthetic */ o(UdpCustom udpCustom, int i10) {
        this.f16769a = i10;
        this.f16770b = udpCustom;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final native void onCheckedChanged(CompoundButton compoundButton, boolean z9);
}
