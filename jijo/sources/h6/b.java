package h6;

import android.content.DialogInterface;
import de.blinkt.openvpn.LaunchVPN;

/* JADX INFO: loaded from: classes.dex */
public final class b implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LaunchVPN f14121a;

    public b(LaunchVPN launchVPN) {
        this.f14121a = launchVPN;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f14121a.finish();
    }
}
