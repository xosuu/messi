package team.dev.epro.apkcustom.sockets;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ClosingService extends Service {
    static {
        NativeUtil.classesInit0(113);
    }

    @Override // android.app.Service
    public final native IBinder onBind(Intent intent);

    @Override // android.app.Service
    public final native void onTaskRemoved(Intent intent);
}
