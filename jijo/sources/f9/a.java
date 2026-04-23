package f9;

import android.os.FileObserver;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class a extends FileObserver {
    static {
        NativeUtil.classesInit0(221);
    }

    @Override // android.os.FileObserver
    public final native void onEvent(int i10, String str);
}
