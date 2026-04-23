package team.dev.epro.apkcustom.dialogs;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import f.q;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class SlowDns extends q {
    public static final /* synthetic */ int L = 0;
    public EditText G;
    public EditText H;
    public EditText I;
    public ImageView J;
    public Button K;

    static {
        NativeUtil.classesInit0(19);
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onPause();
}
