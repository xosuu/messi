package team.dev.epro.apkcustom.widgets;

import androidx.annotation.Keep;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class SystemNative {
    private static final String TAG = "DetectMagisk";
    private static final String[] blackListedMountPaths;

    static {
        NativeUtil.classesInit0(90);
        System.loadLibrary(Crypt.a(Crypt.xrc("IgoJ:<\u001dg8\u001cihAgj\u0019li\u001eo>\u0019fcJjjOil@<")));
        blackListedMountPaths = new String[]{Crypt.a(Crypt.xrc("KijLnb\u001cl?\u0019jc\u0019>>\u001c9m\u001a<cL=>\u001ef?\u001ei8Mi")), Crypt.a(Crypt.xrc("Ihl\u001ah>\u001bki@h<Ln?\u0019=8Kfc\u0019>bNo>J<i\u001c><JhmN;>\u001d<;\u001anbJhlO:9LmkN=>Ak8In;\u0019")), Crypt.a(Crypt.xrc("Joc\u0019:jN>l@hkH=;I;h\u001a>>\u0019hlA:j\u001a=b\u001af")), Crypt.a(Crypt.xrc("JgmA;hJjbI<i\u001akcJi?\u001cnnKfoI:mNkoH=b\u001dojOh;A;l\u001c:m\u0019h<O>iJl;\u001d<8@jh\u0019=oL"))};
    }

    public static native String abc(String str, int i10);

    public static native String abc(String str, int i10, int i11);

    public static native String abc(String str, int i10, int i11, String str2);

    public static native void az(int i10);

    public static native String getCpuinfo();

    public static native boolean isMagiskPresent();

    public static native boolean isMagiskPresentNative();
}
