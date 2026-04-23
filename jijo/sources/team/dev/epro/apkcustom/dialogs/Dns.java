package team.dev.epro.apkcustom.dialogs;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import f.q;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class Dns extends q {
    public EditText G;
    public EditText H;
    public ImageView I;

    static {
        NativeUtil.classesInit0(87);
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onResume();
}
