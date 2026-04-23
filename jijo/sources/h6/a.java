package h6;

import android.content.DialogInterface;
import de.blinkt.openvpn.LaunchVPN;

/* JADX INFO: loaded from: classes.dex */
public final class a implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LaunchVPN f14120a;

    public a(LaunchVPN launchVPN) {
        this.f14120a = launchVPN;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f14120a.finish();
    }
}
