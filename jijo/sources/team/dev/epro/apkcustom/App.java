package team.dev.epro.apkcustom;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import team.dev.epro.apkcustom.widgets.f;
import team.dev.epro.apkcustom.widgets.i;
import team.dev.epro.apkcustom.widgets.j;
import v8.a;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public class App extends Application {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static App f17099v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static f f17100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static j f17101x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static String f17102y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static com.google.gson.j f17103z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17105b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17106d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17107f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f17108h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17109q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f17110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f17111t = Crypt.xrc("#,*\u00146.;04\u001e6=%");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f9.a f17112u;

    static {
        NativeUtil.classesInit0(30);
        System.loadLibrary(xyz.easypro.ecrypt.utils.a.a("瓘凖⋉콹䓑Ê\u001a"));
    }

    public static native App b();

    public static native SharedPreferences d();

    public static native i f();

    public static native void l(String str);

    public final native String[] a();

    @Override // android.content.ContextWrapper
    public final native void attachBaseContext(Context context);

    public final native String c();

    public final native String e();

    public final native boolean g();

    public final native void h(String str);

    public final native void i(String str);

    public final native void j(String[] strArr);

    public final native void k(String str);

    @Override // android.app.Application
    public final native void onCreate();
}
