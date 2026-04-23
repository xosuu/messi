package s8;

import android.view.View;
import team.dev.epro.apkcustom.dialogs.ServerMessage;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServerMessage f16762b;

    static {
        NativeUtil.classesInit0(141);
    }

    public /* synthetic */ k(ServerMessage serverMessage, int i10) {
        this.f16761a = i10;
        this.f16762b = serverMessage;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
