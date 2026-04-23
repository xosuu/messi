package w8;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import l.q;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {
    public static final int A = App.f17100w.f17415a.getInt(Crypt.a(Crypt.xrc("KfiNjoKm<H:cO>mOmk\u0019ohO9lHhmAgl\u0019o")), 10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f18169d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Socket f18170f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f18172q;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f18177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f18178x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f18179y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f18168b = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Socket f18171h = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InputStream f18173s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public OutputStream f18174t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InputStream f18175u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public OutputStream f18176v = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c f18180z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f18167a = this;

    public a(b bVar, Socket socket) {
        this.f18170f = null;
        this.f18172q = null;
        this.f18177w = false;
        this.f18178x = null;
        this.f18179y = 0;
        this.f18169d = bVar;
        if (bVar == null) {
            b();
            return;
        }
        this.f18170f = socket;
        if (socket != null) {
            try {
                socket.setSoTimeout(A);
            } catch (SocketException unused) {
                z3.a.c(Crypt.a(Crypt.xrc("J=;\u001af?Iio\u0019=>\u001e<oJ:kAjmNfhKjlJ=b@hiIghJhj\u001bjiA;m\u001dli\u0019nmNg>@=nK=bAmhMjk@hi\u001a9bI:kIobA<cJ<?In;\u001bg>Ho>\u001cl?")));
            }
        }
        b bVar2 = this.f18169d;
        bVar2.getClass();
        this.f18177w = true;
        this.f18178x = bVar2.f18188t;
        this.f18179y = bVar2.f18189u;
        this.f18172q = new byte[NotificationCompat.FLAG_BUBBLE];
    }

    public final int a() {
        synchronized (this.f18167a) {
            InputStream inputStream = this.f18173s;
            if (inputStream == null) {
                return -1;
            }
            try {
                int i10 = inputStream.read(this.f18172q, 0, NotificationCompat.FLAG_BUBBLE);
                if (i10 < 0) {
                    b();
                }
                return i10;
            } catch (InterruptedIOException unused) {
                return 0;
            } catch (IOException unused2) {
                b();
                return -1;
            }
        }
    }

    public final void b() {
        try {
            OutputStream outputStream = this.f18174t;
            if (outputStream != null) {
                outputStream.flush();
                this.f18174t.close();
            }
        } catch (IOException unused) {
        }
        try {
            OutputStream outputStream2 = this.f18176v;
            if (outputStream2 != null) {
                outputStream2.flush();
                this.f18176v.close();
            }
        } catch (IOException unused2) {
        }
        try {
            Socket socket = this.f18170f;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException unused3) {
        }
        try {
            Socket socket2 = this.f18171h;
            if (socket2 != null) {
                socket2.close();
            }
        } catch (IOException unused4) {
        }
        this.f18171h = null;
        this.f18170f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.a.c(int, java.lang.String):void");
    }

    public final void d() {
        String str = this.f18178x;
        int i10 = this.f18179y;
        b bVar = this.f18169d;
        try {
            ((x8.c) new q(x8.b.f18558a, str, i10, bVar.f18190v, bVar.f18191w).f14975g).a(this.f18171h, this.f18180z.f18199g.getHostAddress(), this.f18180z.f18200h, A * 1000);
        } catch (IOException unused) {
        }
    }

    public final void e() {
        synchronized (this.f18167a) {
            this.f18175u = this.f18171h.getInputStream();
            this.f18176v = this.f18171h.getOutputStream();
        }
    }

    public final void f() {
        int i10;
        boolean z9 = true;
        while (z9) {
            int iA = a();
            if (iA < 0) {
                z9 = false;
            }
            if (iA > 0) {
                z3.a.e(Crypt.a(Crypt.xrc("K;i\u001chm\u001c<k\u001e9nLnj\u001akm\u001cfbM=<\u001b;<O;k\u001dl")) + z3.a.E(this.f18170f) + Crypt.a(Crypt.xrc("\u001bo;Akb\u001e:mL>l\u0019fbO;9M99\u001dfn\u001ai>K;iN>")) + this.f18180z.f18199g.getHostName() + Crypt.a(Crypt.xrc("J=8\u0019nm\u001bfjK<?H<;Aii\u0019j8Oi?\u001e>oHio\u001ai")) + this.f18180z.f18199g.getHostAddress() + Crypt.a(Crypt.xrc("\u0019nm\u001em9Lj>\u001a>lNl9@gjJ:c\u001eh>\u001a<iK9?\u0019m")) + this.f18180z.f18200h + Crypt.a(Crypt.xrc("Am<@ncA>cK:n@nn\u001egkNoi\u001ck?Kf9@fbMm")) + iA + Crypt.a(Crypt.xrc("Om;Ahc\u001cmhA<iJhkL=m\u0019i>\u0019ijHn>I9;Lg")));
                byte[] bArr = this.f18172q;
                OutputStream outputStream = this.f18176v;
                if (outputStream != null && iA > 0 && iA <= bArr.length) {
                    try {
                        outputStream.write(bArr, 0, iA);
                        this.f18176v.flush();
                    } catch (IOException unused) {
                        z3.a.c(Crypt.a(Crypt.xrc("\u001c9bA>cAmmNmnL<mKkkJmmIioMjm\u001d:nL;9H<>N9<\u001dniOoi@g>Oo>\u001en<Ahn\u001ej>Nkj\u001e")));
                    }
                }
            }
            synchronized (this.f18167a) {
                InputStream inputStream = this.f18175u;
                i10 = -1;
                if (inputStream != null) {
                    try {
                        i10 = inputStream.read(this.f18172q, 0, NotificationCompat.FLAG_BUBBLE);
                        if (i10 < 0) {
                            b();
                        }
                    } catch (InterruptedIOException unused2) {
                        i10 = 0;
                    } catch (IOException unused3) {
                        b();
                    }
                }
            }
            if (i10 < 0) {
                z9 = false;
            }
            if (i10 > 0) {
                z3.a.e(Crypt.a(Crypt.xrc("Hib\u001d9;KhlKnk\u001dol\u001e:?\u001c;8\u001emcMn?Jhk\u001cm")) + z3.a.E(this.f18170f) + Crypt.a(Crypt.xrc("JiiL:bMknL9k\u001e=j\u001b>?IhlHin\u0019lbAgbK<")) + this.f18180z.f18199g.getHostName() + Crypt.a(Crypt.xrc("J=8\u0019nm\u001bfjK<?H<;Aii\u0019j8Oi?\u001e>oHio\u001ai")) + this.f18180z.f18199g.getHostAddress() + Crypt.a(Crypt.xrc("\u0019nm\u001em9Lj>\u001a>lNl9@gjJ:c\u001eh>\u001a<iK9?\u0019m")) + this.f18180z.f18200h + Crypt.a(Crypt.xrc("Am<@ncA>cK:n@nn\u001egkNoi\u001ck?Kf9@fbMm")) + i10 + Crypt.a(Crypt.xrc("Om;Ahc\u001cmhA<iJhkL=m\u0019i>\u0019ijHn>I9;Lg")));
                g(this.f18172q, i10);
            }
            Thread.currentThread();
            Thread.yield();
        }
    }

    public final void g(byte[] bArr, int i10) {
        OutputStream outputStream = this.f18174t;
        if (outputStream != null && i10 > 0 && i10 <= bArr.length) {
            try {
                outputStream.write(bArr, 0, i10);
                this.f18174t.flush();
            } catch (IOException unused) {
                z3.a.c(Crypt.a(Crypt.xrc("\u001c9bA>cAmmNmnL<mKkkJmmIioMjm\u001d:nL;>\u001cn8Kg<MoiOm9Jgb\u001c>;\u001cmnI9k\u001blbAio\u0019")));
            }
        }
    }

    public final void h() {
        Thread thread = new Thread(this);
        this.f18168b = thread;
        thread.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b10;
        String strA = Crypt.a(Crypt.xrc("\u001bh8ImmL>jH9iO9nL9>IikHfbAh8\u001dkh\u001b="));
        this.f18167a = this;
        Socket socket = this.f18170f;
        if (socket != null) {
            try {
                this.f18173s = socket.getInputStream();
                this.f18174t = this.f18170f.getOutputStream();
                String strA2 = Crypt.a(Crypt.xrc("JhhK<<Kom\u001amcH;>O:k\u001b<j\u001c<cA<>\u001bl9Ih<K:lO:cM<?J>n\u001e>lH9o\u0019kj\u001b9oN9h\u001el<\u001c"));
                String strA3 = Crypt.a(Crypt.xrc("KjcI:h\u0019gh\u001d9n@;c\u001a;mIlj\u001djcK=j\u001bh8Hf"));
                while (this.f18170f != null) {
                    try {
                        try {
                            b10 = (byte) this.f18173s.read();
                        } catch (InterruptedIOException unused) {
                            Thread.yield();
                        }
                    } catch (Exception e10) {
                        z3.a.e(strA + e10.toString());
                    }
                    if (b10 == 4) {
                        this.f18180z = new c(this);
                    } else {
                        if (b10 != 5) {
                            z3.a.c(strA2 + ((int) b10));
                            b();
                            return;
                        }
                        d dVar = new d(this);
                        dVar.f18206m = null;
                        dVar.f18207n = null;
                        dVar.f18208o = null;
                        dVar.f18209p = 0;
                        dVar.f18197e = new byte[255];
                        this.f18180z = dVar;
                    }
                    z3.a.e(strA3 + ((int) b10) + Crypt.a(Crypt.xrc("\u001bjhLi>Oo;Ifb\u001bm8A;k\u001cioA9?M;9Noh\u0019m")));
                    this.f18180z.a(b10);
                    this.f18180z.g();
                    c cVar = this.f18180z;
                    byte b11 = cVar.f18195c;
                    if (b11 == 1) {
                        cVar.e();
                        f();
                    } else if (b11 == 2) {
                        cVar.c();
                        f();
                    } else if (b11 == 3) {
                        cVar.k();
                    }
                    b();
                    return;
                }
                throw new Exception(Crypt.a(Crypt.xrc("Min\u001dkoI>o\u001cnc\u0019:lM<<K<;Ioi\u001d;<L:j\u001dgk@98\u0019;8\u001b:>\u001b9>Jom\u001cil@=?\u0019joNmmMi>Lh?@:cM=?\u001e=c@>;H=lL;b\u001d9n\u0019=<\u001ejn@fi")));
            } catch (IOException e11) {
                z3.a.c(Crypt.a(Crypt.xrc("\u001bkc\u001dkj\u001df9\u001ahjLihA=;\u001e99M9mNiiKkcOj?O>;@l8Kl8N:c\u00199>\u001bn9\u001dgkHfmLgnH;b\u0019")));
                z3.a.e(strA + e11.toString());
            }
        }
        z3.a.c(Crypt.a(Crypt.xrc("I=<A<mAmlH:8IkbM<>Jm9\u001d<c@nl\u001aol@:8Jo<\u001cgbN<hN9bJkbHgiKk<\u001b;9K:nI>oI")));
    }
}
