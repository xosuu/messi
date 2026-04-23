package s8;

import android.content.DialogInterface;
import team.dev.epro.apkcustom.dialogs.RequestBlock;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class i implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RequestBlock f16760b;

    static {
        NativeUtil.classesInit0(99);
    }

    public /* synthetic */ i(RequestBlock requestBlock, int i10) {
        this.f16759a = i10;
        this.f16760b = requestBlock;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final native void onClick(DialogInterface dialogInterface, int i10);
}
