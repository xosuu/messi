package team.dev.epro.apkcustom.dialogs;

import android.os.Bundle;
import android.widget.EditText;
import f.q;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class DestPing extends q {
    public static final /* synthetic */ int H = 0;
    public EditText G;

    static {
        NativeUtil.classesInit0(211);
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onResume();
}
