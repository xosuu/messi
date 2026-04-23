package team.dev.epro.apkcustom.activities;

import android.os.Bundle;
import androidx.activity.result.c;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import f.b;
import f.q;
import h6.d;
import java.io.File;
import java.util.UUID;
import team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class GeneratedConfig extends q {
    public static final /* synthetic */ int T = 0;
    public String G;
    public CodeView H;
    public d I;
    public FloatingActionMenu J;
    public FloatingActionButton K;
    public FloatingActionButton L;
    public File M;
    public File N;
    public UUID O;
    public boolean P;
    public final b Q = new b(8, this);
    public String R;
    public c S;

    static {
        NativeUtil.classesInit0(16);
    }

    public static native void w(int i10, String str);

    @Override // androidx.fragment.app.w, androidx.activity.i, androidx.core.app.k, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onPause();

    @Override // androidx.fragment.app.w, androidx.activity.i, android.app.Activity
    public final native void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);

    @Override // androidx.fragment.app.w, android.app.Activity
    public final native void onResume();

    public final native void u();

    public final native void v(String str);
}
