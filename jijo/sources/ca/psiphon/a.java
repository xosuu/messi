package ca.psiphon;

import ca.psiphon.PsiphonTunnel;
import p2.f;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PsiphonTunnel f1607a;

    public a(PsiphonTunnel psiphonTunnel) {
        this.f1607a = psiphonTunnel;
    }

    public final void a() {
        PsiphonTunnel psiphonTunnel = this.f1607a;
        try {
            psiphonTunnel.reconnectPsiphon();
        } catch (PsiphonTunnel.Exception e10) {
            ((PsiphonVPNService) psiphonTunnel.mHostService).k("reconnect error: " + e10);
        }
    }
}
