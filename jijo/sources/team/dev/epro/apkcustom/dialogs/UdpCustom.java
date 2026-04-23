package team.dev.epro.apkcustom.dialogs;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import f.q;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class UdpCustom extends q {
    public static final /* synthetic */ int L = 0;
    public CheckBox G;
    public CheckBox H;
    public EditText I;
    public EditText J;
    public EditText K;

    static {
        NativeUtil.classesInit0(215);
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onResume();
}
