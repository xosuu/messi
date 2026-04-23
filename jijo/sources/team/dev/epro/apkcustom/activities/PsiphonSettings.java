package team.dev.epro.apkcustom.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import b3.n;
import f.b;
import f.q;
import java.util.HashMap;
import team.dev.epro.apkcustom.widgets.g;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class PsiphonSettings extends q {
    public Button G;
    public EditText H;
    public EditText I;
    public g J;
    public g K;
    public n L;
    public HashMap M;
    public final b N = new b(10, this);

    static {
        NativeUtil.classesInit0(34);
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onPause();
}
