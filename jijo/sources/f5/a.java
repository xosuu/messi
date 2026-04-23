package f5;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            fb1.t(message.obj);
            throw null;
        }
        if (i10 != 1) {
            return false;
        }
        fb1.t(message.obj);
        throw null;
    }
}
