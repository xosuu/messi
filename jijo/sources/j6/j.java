package j6;

import android.content.Intent;
import android.os.IInterface;
import de.blinkt.openvpn.core.ConnectionStatus;
import de.blinkt.openvpn.core.LogItem;

/* JADX INFO: loaded from: classes.dex */
public interface j extends IInterface {
    void Q0(LogItem logItem);

    void U0(String str, String str2, int i10, ConnectionStatus connectionStatus, Intent intent);

    void n0(long j10, long j11);

    void r1(String str);
}
