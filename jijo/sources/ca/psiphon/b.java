package ca.psiphon;

import psi.PsiphonProvider;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;

/* JADX INFO: loaded from: classes.dex */
public final class b implements PsiphonProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PsiphonTunnel f1608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PsiphonTunnel f1609b;

    public b(PsiphonTunnel psiphonTunnel, PsiphonTunnel psiphonTunnel2) {
        this.f1609b = psiphonTunnel;
        this.f1608a = psiphonTunnel2;
    }

    @Override // psi.PsiphonProvider
    public final String bindToDevice(long j10) {
        return this.f1608a.bindToDevice(j10);
    }

    @Override // psi.PsiphonProvider
    public final String getDNSServersAsString() {
        PsiphonTunnel psiphonTunnel = this.f1609b;
        ((PsiphonVPNService) psiphonTunnel.mHostService).getClass();
        return this.f1608a.getDNSServers(App.f17099v, psiphonTunnel.mHostService);
    }

    @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
    public final String getNetworkID() {
        ((PsiphonVPNService) this.f1609b.mHostService).getClass();
        return PsiphonTunnel.getNetworkID(App.f17099v);
    }

    @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
    public final long hasIPv6Route() {
        PsiphonTunnel psiphonTunnel = this.f1609b;
        ((PsiphonVPNService) psiphonTunnel.mHostService).getClass();
        return PsiphonTunnel.hasIPv6Route(App.f17099v, psiphonTunnel.mHostService);
    }

    @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
    public final long hasNetworkConnectivity() {
        return this.f1608a.hasNetworkConnectivity();
    }

    @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
    public final String iPv6Synthesize(String str) {
        return PsiphonTunnel.iPv6Synthesize(str);
    }

    @Override // psi.PsiphonProvider, psi.PsiphonProviderNoticeHandler
    public final void notice(String str) {
        this.f1608a.notice(str);
    }
}
