package b6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import team.dev.epro.apkcustom.App;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Thread implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f1373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServerSocket f1374b;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                c cVar = this.f1373a;
                synchronized (cVar.f1369f) {
                    if (!cVar.f1370g) {
                        throw new IOException("Too late, this connection is closed.");
                    }
                    cVar.f1369f.addElement(this);
                }
                while (true) {
                    try {
                        try {
                            Socket socketAccept = this.f1374b.accept();
                            if (socketAccept.getInetAddress().getHostAddress() != null && (socketAccept.getInetAddress().getHostAddress().equals("127.0.0.1") || socketAccept.getInetAddress().getHostAddress().startsWith(App.f17101x.K().substring(0, App.f17101x.K().lastIndexOf("."))) || socketAccept.getInetAddress().getHostAddress().startsWith(App.f17101x.L().substring(0, App.f17101x.L().lastIndexOf("."))) || socketAccept.getInetAddress().getHostAddress().startsWith(App.f17101x.J().substring(0, App.f17101x.J().lastIndexOf("."))) || socketAccept.getInetAddress().getHostAddress().startsWith(App.f17101x.M().substring(0, App.f17101x.M().lastIndexOf("."))) || socketAccept.getInetAddress().getHostAddress().equals(App.f17101x.H()))) {
                                try {
                                    Thread thread = new Thread(new k.g(this, socketAccept));
                                    thread.setDaemon(true);
                                    thread.start();
                                } catch (Error unused) {
                                }
                            }
                        } catch (IOException unused2) {
                            this.f1374b.close();
                            return;
                        }
                    } catch (IOException unused3) {
                        return;
                    }
                }
            } catch (IOException unused4) {
                this.f1374b.close();
            }
        } catch (IOException unused5) {
        }
    }
}
