package z8;

import androidx.core.app.NotificationCompat;
import b7.u;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Locale;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.widgets.e;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f20748b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OutputStream f20749d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20750f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20751h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f20752q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f20753s;

    public b(InputStream inputStream, OutputStream outputStream, Socket socket, Socket socket2) {
        this.f20747a = 0;
        this.f20750f = 102400;
        this.f20748b = inputStream;
        this.f20749d = outputStream;
        this.f20751h = true;
        this.f20752q = socket;
        this.f20753s = socket2;
    }

    public final void a(int i10) {
        if (this.f20751h && ((Socket) this.f20752q) != null && App.f17100w.f17415a.getBoolean(Crypt.a(Crypt.xrc("\u001a9?Jo?\u001af?MmjOf<\u001dh;\u001b=bA>>@<k\u001afnKj")), false)) {
            StringBuilder sb = new StringBuilder(Crypt.a(Crypt.xrc("L;;\u0019k;L<iNh;Jg>\u001bjm\u001d>8\u001enmLkh@g;@<")));
            g1.a.w(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u0019=?Ank\u001d=o\u001bnhAmn\u001a;hJobJ>cKncAfhJ=")), Locale.getDefault()), sb, Crypt.a(Crypt.xrc("\u001b99\u001ekcMl>\u001d9kA=lL=;@ijNgj\u0019:lIo<Nj")));
            sb.append(team.dev.epro.apkcustom.widgets.a.f17392e);
            sb.append(Crypt.a(Crypt.xrc("OohKf;@><\u001ahoMl8\u001c<b\u001a>nJlkNl<Jk;\u0019j")));
            sb.append(App.f17099v.getString(R.string.bl));
            sb.append(Crypt.a(Crypt.xrc("\u001af9MhnM9k\u001c9l\u001bhnLliLol\u001c:?\u001akb\u0019ok@fkLg?\u001b9>Igc\u001d9h\u001cj8\u001bh>Jjh\u001aonAgcO:hO")));
            sb.append(((Socket) this.f20753s).getInetAddress().getHostName());
            sb.append(Crypt.a(Crypt.xrc("J=8\u0019nm\u001bfjK<?H<;Aii\u0019j8Oi?\u001e>oHio\u001ai")));
            sb.append(((Socket) this.f20753s).getInetAddress().getHostAddress());
            sb.append(Crypt.a(Crypt.xrc("\u0019nm\u001em9Lj>\u001a>lNl9@gjJ:c\u001eh>\u001a<iK9?\u0019m")));
            sb.append(((Socket) this.f20753s).getPort());
            sb.append(Crypt.a(Crypt.xrc("\u0019:jIi>@g>\u001a:n\u001a=kNj;\u001ehc\u001bmk\u001eikK;i\u001co")));
            sb.append(((Socket) this.f20752q).getInetAddress().getHostAddress());
            sb.append(Crypt.a(Crypt.xrc("NinJ>h\u001bjjIibA<n@o8\u001dnhAjb\u001dol\u001d:h\u0019o")));
            sb.append(e.c(i10, new Locale(Crypt.a(Crypt.xrc("\u001eg9\u001eohJhbI9?I9;Hn;\u0019g<Ji?K<b@i?J>")))));
            u.r(Crypt.a(Crypt.xrc("O:<A;mKnc\u001b>iA>c\u00199bJgl\u0019fh@=jJ>8O9")), sb.toString());
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f20747a) {
            case 0:
                byte[] bArr = new byte[this.f20750f];
                int i10 = 0;
                while (this.f20751h && i10 != -1) {
                    try {
                        i10 = this.f20748b.read(bArr, 0, this.f20750f);
                        if (i10 > 0) {
                            a(i10);
                            this.f20749d.write(bArr, 0, i10);
                        }
                        this.f20749d.flush();
                    } catch (Exception unused) {
                    }
                }
                break;
            default:
                long j10 = 0;
                while (true) {
                    try {
                        int i11 = this.f20748b.read((byte[]) this.f20752q);
                        if (i11 == -1) {
                            interrupt();
                            if (this.f20751h) {
                                a9.b.a(Crypt.a(Crypt.xrc("\u001chmOk8A9>Jf9K:k\u001ajl\u001cmhM9mMjb\u001dok\u0019:>\u001d=8@fmJn?Aj<\u001a9mK=iL9?L9nLmbHhh\u0019")) + e.c(j10, new Locale(Crypt.a(Crypt.xrc("\u001eg9\u001eohJhbI9?I9;Hn;\u0019g<Ji?K<b@i?J>")))));
                            }
                            break;
                        } else if (i11 > 0) {
                            this.f20749d.write((byte[]) this.f20752q, 0, i11);
                            this.f20749d.flush();
                            j10 += (long) i11;
                        }
                    } catch (Exception unused2) {
                        interrupt();
                    }
                }
                break;
        }
    }

    public b(a9.a aVar, InputStream inputStream, OutputStream outputStream, boolean z9) {
        this.f20747a = 1;
        this.f20753s = aVar;
        this.f20752q = new byte[NotificationCompat.FLAG_BUBBLE];
        this.f20750f = NotificationCompat.FLAG_BUBBLE;
        this.f20748b = inputStream;
        this.f20749d = outputStream;
        this.f20751h = z9;
    }
}
