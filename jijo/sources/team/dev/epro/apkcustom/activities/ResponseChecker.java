package team.dev.epro.apkcustom.activities;

import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import androidx.emoji2.text.m;
import b3.n;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import f.b;
import f.q;
import j6.c0;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HttpsURLConnection;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ResponseChecker extends q {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f17141e0 = 0;
    public ListView G;
    public Button H;
    public TextInputEditText I;
    public TextInputEditText J;
    public TextInputLayout K;
    public CheckBox L;
    public CheckBox M;
    public CheckBox N;
    public ArrayList O;
    public ArrayList P;
    public ArrayList Q;
    public ExecutorService R;
    public n S;
    public HttpURLConnection U;
    public Socket V;
    public HttpsURLConnection W;
    public HttpsURLConnection Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public c0 f17142a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ArrayList f17143b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public HttpURLConnection f17144c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public volatile Thread f17145d0;
    public final b T = new b(11, this);
    public boolean X = false;

    static {
        NativeUtil.classesInit0(226);
    }

    public static native void u(ResponseChecker responseChecker, String str, Handler handler, String str2);

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

    public final native HttpsURLConnection v(String str, int i10, Handler handler);

    public final native Map w(URL url);

    public final native m x(Handler handler, String str);

    public final native void y();

    public final native String z(String str);
}
