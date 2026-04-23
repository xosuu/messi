package v8;

import android.net.VpnService;
import android.os.Binder;
import android.os.Parcel;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VpnService f17948b;

    public /* synthetic */ h(VpnService vpnService, int i10) {
        this.f17947a = i10;
        this.f17948b = vpnService;
    }

    public final void a() {
        int i10 = this.f17947a;
        VpnService vpnService = this.f17948b;
        switch (i10) {
            case 0:
                ((SSHTunnelService) vpnService).onRevoke();
                break;
            case 1:
                ((PsiphonVPNService) vpnService).onRevoke();
                break;
            default:
                ((V2RayVpnService) vpnService).onRevoke();
                break;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (this.f17947a) {
            case 0:
                if (i10 == 16777215) {
                    a();
                }
                break;
            case 1:
                if (i10 == 16777215) {
                    a();
                }
                break;
            default:
                if (i10 == 16777215) {
                    a();
                }
                break;
        }
        return super.onTransact(i10, parcel, parcel2, i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(V2RayVpnService v2RayVpnService) {
        this(v2RayVpnService, 2);
        this.f17947a = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(PsiphonVPNService psiphonVPNService) {
        this(psiphonVPNService, 1);
        this.f17947a = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(SSHTunnelService sSHTunnelService) {
        this(sSHTunnelService, 0);
        this.f17947a = 0;
    }
}
