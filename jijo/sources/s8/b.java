package s8;

import android.view.View;
import team.dev.epro.apkcustom.dialogs.DestPing;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DestPing f16744b;

    static {
        NativeUtil.classesInit0(103);
    }

    public /* synthetic */ b(DestPing destPing, int i10) {
        this.f16743a = i10;
        this.f16744b = destPing;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
