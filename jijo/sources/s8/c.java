package s8;

import android.view.View;
import team.dev.epro.apkcustom.dialogs.Dns;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dns f16746b;

    static {
        NativeUtil.classesInit0(102);
    }

    public /* synthetic */ c(Dns dns, int i10) {
        this.f16745a = i10;
        this.f16746b = dns;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
