package v8;

import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f17918b;

    public /* synthetic */ b(d dVar, int i10) {
        this.f17917a = i10;
        this.f17918b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17917a;
        d dVar = this.f17918b;
        switch (i10) {
            case 0:
                Socket socket = dVar.f17924h;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                Socket socket2 = dVar.f17924h;
                if (socket2 != null) {
                    try {
                        socket2.close();
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            default:
                Socket socket3 = dVar.f17925q;
                if (socket3 != null) {
                    try {
                        socket3.close();
                        break;
                    } catch (Exception unused3) {
                    }
                }
                Socket socket4 = dVar.f17922d;
                if (socket4 != null) {
                    try {
                        socket4.close();
                        break;
                    } catch (Exception unused4) {
                    }
                }
                Socket socket5 = dVar.f17924h;
                if (socket5 != null) {
                    try {
                        socket5.close();
                    } catch (Exception unused5) {
                        return;
                    }
                }
                break;
        }
    }
}
