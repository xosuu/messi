package team.dev.epro.apkcustom.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import f.q;
import n8.a;
import n8.b;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ConfigImport extends q implements b {
    public Uri G;
    public Intent H;

    static {
        NativeUtil.classesInit0(93);
    }

    @a(1922)
    private native void methodRequiresReadWrite();

    public static native void u(ConfigImport configImport, String str);

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final native void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);

    public final native void v();

    public final native void w();
}
