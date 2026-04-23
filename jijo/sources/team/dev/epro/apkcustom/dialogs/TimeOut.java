package team.dev.epro.apkcustom.dialogs;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import f.q;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public class TimeOut extends q {
    public static final /* synthetic */ int J = 0;
    public EditText G;
    public ImageView H;
    public final int I = App.f17100w.f17415a.getInt(Crypt.a(Crypt.xrc("KfiNjoKm<H:cO>mOmk\u0019ohO9lHhmAgl\u0019o")), 10);

    static {
        NativeUtil.classesInit0(37);
    }

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onResume();
}
