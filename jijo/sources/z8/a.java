package z8;

import com.google.android.gms.ads.RequestConfiguration;
import java.net.ServerSocket;
import java.net.Socket;
import l.v0;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServerSocket f20743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Socket f20744b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Thread f20745d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v0 f20746f;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String strA = Crypt.a(Crypt.xrc("K:nM:9\u0019i;\u001c<9\u00199c\u001e9?O:<Igl\u001cinAoj\u001df"));
        try {
            this.f20743a = new ServerSocket(1081);
            while (!this.f20743a.isClosed()) {
                Socket socketAccept = this.f20743a.accept();
                this.f20744b = socketAccept;
                if (socketAccept.getInetAddress().getHostAddress() != null && (this.f20744b.getInetAddress().getHostAddress().startsWith(App.f17101x.K().substring(0, App.f17101x.K().lastIndexOf(strA))) || this.f20744b.getInetAddress().getHostAddress().startsWith(App.f17101x.L().substring(0, App.f17101x.L().lastIndexOf(strA))) || this.f20744b.getInetAddress().getHostAddress().startsWith(App.f17101x.J().substring(0, App.f17101x.J().lastIndexOf(strA))) || this.f20744b.getInetAddress().getHostAddress().startsWith(App.f17101x.M().substring(0, App.f17101x.M().lastIndexOf(strA))))) {
                    String hostAddress = this.f20744b.getInetAddress().getHostAddress();
                    if (hostAddress.length() - hostAddress.replace(strA, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).length() == 3) {
                        v0 v0Var = new v0(this.f20744b);
                        this.f20746f = v0Var;
                        Thread thread = new Thread(v0Var);
                        this.f20745d = thread;
                        thread.start();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
