package s8;

import android.view.View;
import team.dev.epro.apkcustom.dialogs.SlowDns;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SlowDns f16766b;

    static {
        NativeUtil.classesInit0(142);
    }

    public /* synthetic */ m(SlowDns slowDns, int i10) {
        this.f16765a = i10;
        this.f16766b = slowDns;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
