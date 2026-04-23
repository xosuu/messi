package team.dev.epro.apkcustom.widgets;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.net.InetAddress;
import java.util.Locale;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f17405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f17406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f17407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f17408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f17410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f17411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f17412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f17413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f17414j;

    static {
        NativeUtil.classesInit0(197);
        f17405a = Build.VERSION.SDK_INT;
        f17406b = Build.VERSION.RELEASE;
        f17407c = Build.MANUFACTURER;
        f17408d = Build.MODEL;
        f17409e = Build.ID;
        f17410f = Build.BOARD;
        f17411g = Build.BRAND;
        f17412h = Build.DEVICE;
        f17413i = Build.PRODUCT;
        f17414j = new String[]{Crypt.a(Crypt.xrc("Nfn\u001a9?Ho;Afh\u001bn>O:>\u001e;oLfn\u0019l<\u001dno\u001e9")), Crypt.a(Crypt.xrc("JhnAih\u001e:8\u001ejbIo>@m8@loN9>@;cJm<\u001c:")), Crypt.a(Crypt.xrc("Nli\u001bnlM;?\u001b=i\u0019=lOg;L>m\u001c><Ai8\u0019hnH<")), Crypt.a(Crypt.xrc("Aoo\u001enn@jmI>;\u00199nN;cMfiL>>Nji\u001cj?@l")), Crypt.a(Crypt.xrc("\u001bfoLonK=;\u001c<<Nnm\u001dkjM98AhnIf<\u001eh;\u0019l")), Crypt.a(Crypt.xrc("\u001dij\u001b<9H:b\u001a=>\u001e:h\u001a<?\u001cn?\u001dmiKio\u001am>Jl")), Crypt.a(Crypt.xrc("Jg<Jjm\u001c:nA>>Hn8IocM>>M9iJojL<oN;"))};
    }

    public static native ComponentName a(Context context);

    public static native String b();

    public static native String c(long j10, Locale locale);

    public static native boolean d(Context context);

    public static native boolean e(Context context);

    public static native String f(String str);

    public static native InetAddress g(String str);

    public static native InetAddress[] h(String str);
}
