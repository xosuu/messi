package team.dev.epro.apkcustom.widgets;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import java.util.Map;
import java.util.Set;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class f implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MMKV f17415a;

    static {
        NativeUtil.classesInit0(196);
    }

    public f(Context context, String str) {
        MMKV mmkvC;
        MMKV.b(context, context.getFilesDir().getAbsolutePath() + Crypt.a(Crypt.xrc("Lkm\u001afjAkj\u001d;8\u001dn>I9l\u001eohJhbIhn@9m\u001eh")));
        String strA = Crypt.a(Crypt.xrc("Nfb\u001chkMg?A<?\u001c=k\u001e;?Of9Mo9M><Am>\u001e:"));
        if (TextUtils.isEmpty(strA)) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            String strA2 = Crypt.a(Crypt.xrc("MkjHgiAh?\u001b=8Lm>Jo8J9cLolAglOk;O>"));
            mmkvC = zIsEmpty ? MMKV.c(strA2, a(context)) : MMKV.c(strA2, str);
        } else {
            mmkvC = TextUtils.isEmpty(str) ? MMKV.c(strA, a(context)) : MMKV.c(strA, str);
        }
        this.f17415a = mmkvC;
    }

    public static native String a(Context context);

    @Override // android.content.SharedPreferences
    public final native boolean contains(String str);

    @Override // android.content.SharedPreferences
    public final native SharedPreferences.Editor edit();

    @Override // android.content.SharedPreferences
    public final native Map getAll();

    @Override // android.content.SharedPreferences
    public final native boolean getBoolean(String str, boolean z9);

    @Override // android.content.SharedPreferences
    public final native float getFloat(String str, float f10);

    @Override // android.content.SharedPreferences
    public final native int getInt(String str, int i10);

    @Override // android.content.SharedPreferences
    public final native long getLong(String str, long j10);

    @Override // android.content.SharedPreferences
    public final native String getString(String str, String str2);

    @Override // android.content.SharedPreferences
    public final native Set getStringSet(String str, Set set);

    @Override // android.content.SharedPreferences
    public final native void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener);

    @Override // android.content.SharedPreferences
    public final native void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener);
}
