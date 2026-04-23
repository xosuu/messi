package m3;

import team.dev.epro.apkcustom.sockets.udp.UDPService;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15739b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f15738a = i10;
        this.f15739b = obj;
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        switch (this.f15738a) {
            case 3:
                UDPService uDPService = (UDPService) this.f15739b;
                b9.a aVar = uDPService.f17337v;
                if (aVar != null) {
                    aVar.f1489d = true;
                    aVar.interrupt();
                    uDPService.f17337v = null;
                }
                b9.a aVar2 = uDPService.f17338w;
                if (aVar2 != null) {
                    aVar2.f1489d = true;
                    aVar2.interrupt();
                    uDPService.f17338w = null;
                }
                Process process = uDPService.f17336u;
                if (process != null) {
                    process.destroy();
                    uDPService.f17336u = null;
                }
                super.interrupt();
                break;
            default:
                super.interrupt();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x030c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0162  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a.run():void");
    }

    public a(String str) {
        this.f15738a = 0;
        this.f15739b = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(UDPService uDPService) {
        this(3, uDPService);
        this.f15738a = 3;
    }
}
