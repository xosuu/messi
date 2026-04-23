package team.dev.epro.apkcustom.activities;

import android.app.Activity;
import android.content.DialogInterface;
import j6.f;
import n1.k;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class DisconnectVPN extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f17139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f17140b = new k(3, this);

    static {
        NativeUtil.classesInit0(85);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final native void onCancel(DialogInterface dialogInterface);

    @Override // android.content.DialogInterface.OnClickListener
    public final native void onClick(DialogInterface dialogInterface, int i10);

    @Override // android.app.Activity
    public final native void onPause();

    @Override // android.app.Activity
    public final native void onResume();
}
