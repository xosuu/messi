package w8;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import l.a0;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f18204r = {-1, 4, -1, -1, 16};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f18205s = {5, 0};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public DatagramSocket f18206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public DatagramPacket f18207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InetAddress f18208o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18209p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte f18210q;

    public static InetAddress s(byte b10, byte[] bArr) {
        if (b10 == 1) {
            return c.l(bArr);
        }
        if (b10 != 3) {
            return null;
        }
        if (bArr[0] <= 0) {
            z3.a.c(Crypt.a(Crypt.xrc("I<;\u001bko\u001ai?\u001bi;Hg?Hfb\u001bfbOlcKjlM:l\u001bfc\u001bj8NhoIo>Jmn@fl\u001eg;\u0019fo\u001c=k@=hJh<\u0019ll@hc\u001a:lOkmMmkI9cNhjA<l\u001ehbKo>\u001d>o")) + ((int) bArr[0]));
            return null;
        }
        String string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        for (int i10 = 1; i10 <= bArr[0]; i10++) {
            StringBuilder sbS = g1.a.s(string);
            sbS.append((char) bArr[i10]);
            string = sbS.toString();
        }
        try {
            return InetAddress.getByName(string);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // w8.c
    public final void a(byte b10) throws Exception {
        this.f18193a = b10;
        if (b10 != 5) {
            q(Crypt.a(Crypt.xrc("H=l\u001bk9If;AhmMjn\u001ck?Inb@koJnl\u001d>;K9hLim\u001dhn\u0019ohAo>I:?Ho;OkmAf;\u0019g9Il<I")) + ((int) this.f18193a));
            throw new Exception(a0.h(new StringBuilder(Crypt.a(Crypt.xrc("\u001ci>\u0019fl\u001dhiL:<AnbHgjM:b\u0019>cO=;MhjLg?\u001eic\u001en?@<hIkhKolIln\u001e;;InnAo?\u0019ooJ"))), this.f18193a, Crypt.a(Crypt.xrc("NflJhbJkj\u001agj\u001co;\u001coi\u001en;\u001dm?@i<@9lI<"))));
        }
        byte bF = f();
        String string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        for (int i10 = 0; i10 < bF; i10++) {
            StringBuilder sbK = a0.k(string, Crypt.a(Crypt.xrc("Nlk\u001akiLlh\u001a>oMk>Nfc\u001b;jNhl\u001bhiOi?Ok")));
            sbK.append((int) f());
            sbK.append('-');
            string = sbK.toString();
        }
        if (string.indexOf(Crypt.a(Crypt.xrc("Oo?\u001bml\u001ejh\u001ajbAfl\u001bmb\u001e9i\u001ag;Ho9@>n\u001ch"))) == -1 && string.indexOf(Crypt.a(Crypt.xrc("I>;\u001afcK=j\u001e<bHfb\u001cj9Jim\u001blh\u001aijLfbI:"))) == -1) {
            q(Crypt.a(Crypt.xrc("\u001ej?\u001a:jNhk\u001ajlN:mO>lL>8\u0019h<I<8K<<\u001cl?Khl\u001cn8M<kKnkNhhI;j\u0019hjAolN:lKj<H")));
            throw new Exception(Crypt.a(Crypt.xrc("\u001ej?\u001a:jNhk\u001ajlN:mO>lL>8\u0019h<I<8K<<\u001clcMi?\u001bl>\u001b:lIfi@:;@mnO>9A<8\u001ajj\u001c>o@")));
        }
        z3.a.e(Crypt.a(Crypt.xrc("MikJ9c\u001dim\u001aonJm8Jjm\u001eg9K;mMjb\u001c:k\u001e9lNfnOl;\u001bn<\u001bn8LkiMmnK=>\u001a=bI:m\u001b>?\u001d")));
        byte[] bArr = f18205s;
        bArr[0] = this.f18193a;
        a aVar = this.f18194b;
        aVar.getClass();
        aVar.g(bArr, 2);
    }

    @Override // w8.c
    public final void b(byte b10, InetAddress inetAddress, int i10) {
        byte[] address = {0, 0, 0, 0};
        z3.a.e(Crypt.a(Crypt.xrc("A<8H;m\u001el>\u001d=h\u001b<cIjh\u001bonMli\u001bob\u001c<oLfk\u0019hoK=k@loIj?Hji\u001amcH:8J<9Jni\u001bi9\u001d")) + c.i(b10) + Crypt.a(Crypt.xrc("\u001dom@hnJ>o\u001c<8\u001binMol@:?\u001boh\u001dj8Ioc\u001d;")));
        byte[] bArr = new byte[10];
        if (inetAddress != null) {
            address = inetAddress.getAddress();
        }
        bArr[0] = 5;
        bArr[1] = (byte) (b10 - 90);
        bArr[2] = 0;
        bArr[3] = 1;
        bArr[4] = address[0];
        bArr[5] = address[1];
        bArr[6] = address[2];
        bArr[7] = address[3];
        bArr[8] = (byte) ((65280 & i10) >> 8);
        bArr[9] = (byte) (i10 & 255);
        a aVar = this.f18194b;
        if (aVar.f18170f == null || aVar.f18171h == null) {
            z3.a.e(Crypt.a(Crypt.xrc("\u001dfjL9<O=?A<cA<;H:kA=kIihAncH<c\u001cibKm9Hf?\u001a=b\u001enm\u001bg?H=;\u001chbJh8\u001bnkMhl\u0019")));
        } else {
            aVar.g(bArr, 10);
        }
    }

    @Override // w8.c
    public final boolean d() {
        this.f18199g = s(this.f18210q, this.f18197e);
        byte[] bArr = this.f18196d;
        int i10 = bArr[0];
        int i11 = bArr[1];
        if (i10 < 0) {
            i10 += NotificationCompat.FLAG_LOCAL_ONLY;
        }
        int i12 = i10 << 8;
        if (i11 < 0) {
            i11 += NotificationCompat.FLAG_LOCAL_ONLY;
        }
        this.f18200h = i11 | i12;
        a aVar = this.f18194b;
        this.f18201i = aVar.f18170f.getInetAddress();
        this.f18202j = aVar.f18170f.getPort();
        return this.f18199g != null && this.f18200h >= 0;
    }

    @Override // w8.c
    public final void g() throws Exception {
        this.f18193a = f();
        this.f18195c = f();
        f();
        byte bF = f();
        this.f18210q = bF;
        int i10 = f18204r[bF];
        this.f18197e[0] = f();
        if (this.f18210q == 3) {
            i10 = this.f18197e[0] + 1;
        }
        for (int i11 = 1; i11 < i10; i11++) {
            this.f18197e[i11] = f();
        }
        byte bF2 = f();
        byte[] bArr = this.f18196d;
        bArr[0] = bF2;
        bArr[1] = f();
        if (this.f18193a != 5) {
            String strA = Crypt.a(Crypt.xrc("H=l\u001bk9If;AhmMjn\u001ck?Inb@koJnl\u001d>;K9?@=lK:>\u001b;;\u001ej>Mm;M;>@nj\u001ef<L=bHjbNfkJmn\u001bkn\u001en9\u001enkAo8\u001b=9\u001e>8K=cAohLlk"));
            z3.a.e(strA + ((int) this.f18193a));
            h((byte) -1);
            throw new Exception(strA + ((int) this.f18193a));
        }
        byte b10 = this.f18195c;
        String strA2 = Crypt.a(Crypt.xrc("\u001dom@hnJ>o\u001c<8\u001binMol@:?\u001boh\u001dj8Ioc\u001d;"));
        if (b10 < 1 || b10 > 3) {
            z3.a.c(Crypt.a(Crypt.xrc("@ojA;<M99OfhMj?\u001aobIonN<>Kio\u001bnkMjiA;iKlk\u0019hcLib\u001d=n\u0019n?@nh@9n\u001cnoJlcNgh\u001b=<Hl?\u001bj;Lf?I;kJ;c\u001bkl\u001b<n\u001a=<I9<")) + c.m(this.f18195c) + strA2);
            h((byte) 7);
            throw new Exception(a0.h(new StringBuilder(Crypt.a(Crypt.xrc("\u001b>>Anb\u001ah>\u001bknK>h\u001emhNg8H:h\u001e:>\u001c=jL<jO<?Jll\u001a;?M<oNj8\u001djl\u001cfiKli\u001d<iA9bK"))), this.f18195c, strA2));
        }
        byte b11 = this.f18210q;
        if (b11 == 4) {
            z3.a.c(Crypt.a(Crypt.xrc("@ojA;<M99OfhMj?\u001aobIonN<>Kio\u001bnkMjiA;iKlk\u0019hcLib\u001d=n\u0019n?@nh@9n\u001cnoJlcNji\u001djn@9k\u001a;oAl<\u001d>nLf?\u001e>iH;>A>?HlkOljJ<<\u001c;<\u001dfk\u001e9j\u001d>9M;hH=8K:lMih\u001eh")));
            h((byte) 8);
            throw new Exception(Crypt.a(Crypt.xrc("\u001emh\u001ao9Of>\u001eo>\u0019f9\u001djoIo?LliNfc\u001di9\u0019<8\u001c;>@9lKkbA=m\u001bkl\u001co8L<lAm?\u0019j>A<kH:jLhmHfj\u001af9\u001b<;N:kHm;InbHhjKmoK9;")));
        }
        if (b11 >= 4 || b11 <= 0) {
            z3.a.c(Crypt.a(Crypt.xrc("@ojA;<M99OfhMj?\u001aobIonN<>Kio\u001bnkMjiA;iKlk\u0019hcLib\u001d=n\u0019n?@nh@9n\u001cnoJlcNh8\u001e>8HijNk<Jk;\u001bhb\u001chmK9iA;m\u001bnb\u001c;;")) + ((int) this.f18210q));
            h((byte) 8);
            throw new Exception(Crypt.a(Crypt.xrc("\u001emh\u001ao9Of>\u001eo>\u0019f9\u001djoIo?LliNfc\u001di9\u0019<k@i;I=jK;b\u001d:n\u001bim\u001bhh\u0019liOlhKfk\u0019fbI")) + ((int) this.f18210q));
        }
        if (d()) {
            z3.a.e(Crypt.a(Crypt.xrc("\u001e9n\u001ak>\u001akm\u001egj\u0019il@ncJ=8\u0019=j\u001b>iNfm\u001b<<N:jJ>i\u0019g9Jki\u001ck<@li\u001e>n\u0019i;Nmo\u001bkkL")) + c.m(this.f18195c) + strA2);
            return;
        }
        h((byte) 4);
        throw new Exception(Crypt.a(Crypt.xrc("\u001ehl\u001c>hMnn\u0019n>\u001djnM:8L;?Nm9IkoA;8NgmIinO9nJmn\u001elbLlb@llK<?\u001bh;M:o\u001eklM")) + this.f18199g.toString() + Crypt.a(Crypt.xrc("NflJhbJkj\u001agj\u001co;\u001coi\u001en;\u001dm?@i<@9lI<")));
    }

    @Override // w8.c
    public final void j(byte b10) {
        int localPort;
        z3.a.e(Crypt.a(Crypt.xrc("O9c\u0019<?O9jM<h\u001b>c@mcOjcMniAi<\u0019f>Hl>H=<\u001eihHfl\u001ci8\u001c=b\u001all\u001d;m\u001e=;IfmInmK")) + c.i(b10) + Crypt.a(Crypt.xrc("\u001dom@hnJ>o\u001c<8\u001binMol@:?\u001boh\u001dj8Ioc\u001d;")));
        byte[] bArr = new byte[10];
        byte[] bArr2 = new byte[4];
        a aVar = this.f18194b;
        Socket socket = aVar.f18171h;
        if (socket != null) {
            socket.getInetAddress().toString();
            localPort = aVar.f18171h.getLocalPort();
        } else {
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            bArr2[3] = 0;
            localPort = 0;
        }
        bArr[0] = 5;
        bArr[1] = b10;
        bArr[2] = 0;
        bArr[3] = 1;
        bArr[4] = bArr2[0];
        bArr[5] = bArr2[1];
        bArr[6] = bArr2[2];
        bArr[7] = bArr2[3];
        bArr[8] = (byte) ((65280 & localPort) >> 8);
        bArr[9] = (byte) (localPort & 255);
        aVar.g(bArr, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0180  */
    @Override // w8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.d.k():void");
    }

    @Override // w8.c
    public final byte n() {
        return (byte) 4;
    }

    @Override // w8.c
    public final byte o() {
        return (byte) 0;
    }

    public final void p() throws SocketException {
        this.f18206m.setSoTimeout(a.A);
        a aVar = this.f18194b;
        aVar.getClass();
        aVar.f18172q = new byte[NotificationCompat.FLAG_BUBBLE];
        byte[] bArr = aVar.f18172q;
        aVar.getClass();
        this.f18207n = new DatagramPacket(bArr, NotificationCompat.FLAG_BUBBLE);
    }

    public final void q(String str) {
        z3.a.e(Crypt.a(Crypt.xrc("AncOob\u001bgc\u001c9iKg;M;>A:>Lm<Oko\u001d;c\u001dgk\u001a9>\u001akjOg9\u001bncJ>>\u001dmn\u0019g?N<;KfnNn>\u001c")) + str + Crypt.a(Crypt.xrc("NflJhbJkj\u001agj\u001co;\u001coi\u001en;\u001dm?@i<@9lI<")));
        byte[] bArr = c.f18192l;
        a aVar = this.f18194b;
        aVar.getClass();
        aVar.g(bArr, 2);
    }

    public final void r(DatagramPacket datagramPacket) {
        String str = datagramPacket.getAddress() + Crypt.a(Crypt.xrc("\u0019nm\u001em9Lj>\u001a>lNl9@gjJ:c\u001eh>\u001a<iK9?\u0019m")) + datagramPacket.getPort() + Crypt.a(Crypt.xrc("Am<@ncA>cK:n@nn\u001egkNoi\u001ck?Kf9@fbMm")) + datagramPacket.getLength() + Crypt.a(Crypt.xrc("\u001agcNmbKkn\u001e=oKin\u001dmi\u0019oi\u0019>?Mk?\u001con\u0019o"));
        try {
            this.f18206m.send(datagramPacket);
        } catch (IOException unused) {
            z3.a.e(Crypt.a(Crypt.xrc("Afc\u001c=k\u001c<8\u001c>9\u001a>j\u001efh\u001bhj\u001choOnlOhj\u001emhIf;MhhJmkOh?Ak;J<?\u001b:oNllIh8J<iKn8Hhi@ljJih\u001di>Ng?Kh8\u001dlh\u001c;<L98\u001al9\u001blmHhkIkoHo>\u001choKgnK>jNi8Jkh\u001d9;N=")) + str);
        }
    }
}
