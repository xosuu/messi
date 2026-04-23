package v8;

import team.dev.epro.apkcustom.sockets.SSHTunnelService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SSHTunnelService f17940b;

    public /* synthetic */ f(SSHTunnelService sSHTunnelService, int i10) {
        this.f17939a = i10;
        this.f17940b = sSHTunnelService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17939a;
        SSHTunnelService sSHTunnelService = this.f17940b;
        switch (i10) {
            case 0:
                boolean z9 = SSHTunnelService.W;
                sSHTunnelService.i();
                break;
            default:
                boolean z10 = SSHTunnelService.W;
                sSHTunnelService.i();
                break;
        }
    }
}
