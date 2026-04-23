package team.dev.epro.apkcustom.dialogs;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import f.q;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class PackageName extends q {
    public static final /* synthetic */ int J = 0;
    public ImageView G;
    public EditText H;
    public Button I;

    static {
        NativeUtil.classesInit0(114);
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onResume();
}
