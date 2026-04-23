package team.dev.epro.apkcustom.activities;

import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import f.b;
import f.q;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.NativeUtil;
import z5.e;

/* JADX INFO: loaded from: classes.dex */
public class MobileIPHunter extends q {
    public static final /* synthetic */ int P = 0;
    public TextInputEditText G;
    public Button H;
    public TextView I;
    public volatile boolean J;
    public volatile boolean K;
    public ArrayList L;
    public ExecutorService M;
    public e N;
    public final b O = new b(9, this);

    static {
        NativeUtil.classesInit0(105);
    }

    public static native void u(MobileIPHunter mobileIPHunter, App app, Handler handler);

    @Override // android.app.Activity, android.view.Window.Callback
    public final native boolean dispatchTouchEvent(MotionEvent motionEvent);

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // f.q, androidx.fragment.app.w, android.app.Activity
    public final native void onDestroy();

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onPause();

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onResume();

    public final native void v(String str);
}
