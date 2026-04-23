package w8;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.widgets.f;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f18185h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18186q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f18187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f18188t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f18189u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f18190v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f18191w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f18182b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ServerSocket f18183d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Socket f18184f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f18181a = this;

    static {
        f fVar = App.f17100w;
        String strA = Crypt.a(Crypt.xrc("KfiNjoKm<H:cO>mOmk\u0019ohO9lHhmAgl\u0019o"));
        fVar.getInt(strA, 10);
        App.f17100w.getInt(strA, 10);
    }

    public b(int i10, int i11, String str, String str2, String str3, String str4) {
        this.f18186q = i10;
        this.f18188t = str;
        this.f18189u = i11;
        z3.a.e(Crypt.a(Crypt.xrc("\u001ejoLg<Jk?Ik?I;l\u0019lbOhm\u001afmHin\u0019<b\u001en<AgoOnl\u001bjlIo;JglAfkNgnOfn\u001dgcMmcH")));
        if (str4.startsWith(Crypt.a(Crypt.xrc("InkL<hA=cHkc\u001c=oNkm\u001c=9Ao<\u001ejm@9bM>"))) || str4.startsWith(Crypt.a(Crypt.xrc("A<?K<>O><MfnKf>\u0019mm\u001e>kO>8\u001bln@m?\u001dj")))) {
            z3.a.e(Crypt.a(Crypt.xrc("\u001e98A=kM;j\u001bhlAnbMkiH=k\u001e9nJgoLn<NmbLikN:i\u001c=i@9nK;oMk;\u001enhIjlO=mN;oA")));
        } else if (str4.startsWith(Crypt.a(Crypt.xrc("Jih\u001ein\u001b:kIj?KgcOg>A=mAih\u001ci<J:iN>"))) || str4.startsWith(Crypt.a(Crypt.xrc("\u001d9>OfhL9o\u001e;i\u001bf?\u001en?\u00199m\u001df8\u001di<\u001dinN<")))) {
            z3.a.e(Crypt.a(Crypt.xrc("\u001e98A=kM;j\u001bhlAnbMkiH=k\u001e9nJgoLn<NmmHhc\u001e:oHjk\u001b:9\u0019ncKk?@h?KfbAohIilN")));
        } else {
            z3.a.e(Crypt.a(Crypt.xrc("\u001e98A=kM;j\u001bhlAnbMkiH=k\u001e9nJgoLn<Nm;\u001bjlO>?\u001dfbN=;M9?\u001b=iK;k\u0019lc\u001aji\u001al?\u001e")));
        }
        this.f18187s = str4;
        this.f18190v = str2;
        this.f18191w = str3;
    }

    public final void a() {
        ServerSocket serverSocket = this.f18183d;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
        this.f18183d = null;
        Socket socket = this.f18184f;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused2) {
            }
        }
        this.f18184f = null;
        a aVar = this.f18185h;
        if (aVar != null) {
            aVar.b();
            try {
                Socket socket2 = aVar.f18170f;
                if (socket2 != null) {
                    socket2.close();
                }
                Socket socket3 = aVar.f18171h;
                if (socket3 != null) {
                    socket3.close();
                }
            } catch (IOException unused3) {
            }
            aVar.f18170f = null;
            aVar.f18171h = null;
            aVar.f18168b.interrupt();
        }
        this.f18185h = null;
    }

    public final void b() {
        synchronized (this.f18181a) {
            try {
                ServerSocket serverSocket = new ServerSocket(this.f18186q);
                this.f18183d = serverSocket;
                if (this.f18186q == 0) {
                    this.f18186q = serverSocket.getLocalPort();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        a();
        z3.a.e(Crypt.a(Crypt.xrc("\u001ahk\u001dml\u0019>h\u001emoLghM:>\u001a=9N9mMhbOi?\u001c;9Om9J:>\u001e;>AjiO9c\u001ancO=n\u0019g9\u001c:b\u001bhcJ")));
        this.f18182b.interrupt();
        z3.a.e(Crypt.a(Crypt.xrc("\u001afn\u001dil@<kJk<J:kJ=mIk;Koo@lb\u0019:;\u001eicAj>\u0019=hJ;bJo>\u0019inL;nL=o@fc\u001b<bH;;\u001c")));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18181a = this;
        try {
            b();
            while (this.f18183d != null) {
                synchronized (this.f18181a) {
                    ServerSocket serverSocket = this.f18183d;
                    if (serverSocket != null) {
                        try {
                            Socket socketAccept = serverSocket.accept();
                            this.f18184f = socketAccept;
                            socketAccept.setKeepAlive(true);
                            this.f18184f.setSoTimeout(0);
                            a aVar = new a(this, this.f18184f);
                            this.f18185h = aVar;
                            aVar.h();
                        } catch (InterruptedIOException | Exception unused) {
                        }
                    }
                }
                Thread.yield();
            }
        } catch (BindException | IOException unused2) {
        }
        a();
    }
}
