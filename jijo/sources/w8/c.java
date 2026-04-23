package w8;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f18192l = {5, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f18194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f18195c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f18193a = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f18198f = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InetAddress f18199g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18200h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InetAddress f18201i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18202j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f18203k = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f18197e = new byte[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18196d = new byte[2];

    public c(a aVar) {
        this.f18194b = aVar;
    }

    public static String i(byte b10) {
        switch (b10) {
            case 0:
                return Crypt.a(Crypt.xrc("\u001d<>Hkm\u001a>9O=i\u0019goI=h\u001c>bN;bAhc\u001ahcHg"));
            case 1:
                return Crypt.a(Crypt.xrc("J98H=hLj?HklA9>\u001a;oM9nM99Hhm\u001afkHko\u001e;jJnm\u0019<c\u0019=jJm<\u001bl<Hjj\u001b>kAj9JknJ"));
            case 2:
                return Crypt.a(Crypt.xrc("IobK>bNmi\u001a<l\u001cn;O:iIo?JkmK9nN:<L><@mnMnlN>m\u0019noKh;\u001do?\u001afkJi<K;m\u001bfbMocMi9\u001c;lI;l\u001d=hOmhLi9\u001c;jHfmKjm\u001dmk"));
            case 3:
                return Crypt.a(Crypt.xrc("Nm8J;lAihKk9OlhI<mI;c\u001cnkJnk\u001a9kK:8\u001chjKjiInmLgb\u001di>Khm@9>\u001cn<Mgm\u0019nnL"));
            case 4:
                return Crypt.a(Crypt.xrc("\u001an9L<n\u001d9?L=;If9O:;\u001cji\u001dmcI=>@gjJhb\u0019o9Kjo\u001bnbM>j\u001bj<Mo?Ih?@kk\u001efc\u001d=iL"));
            case 5:
                return Crypt.a(Crypt.xrc("\u001d9hO=9I<<\u00199>@:bKm>\u001e;j\u0019<<L98\u001d=;K>8Ahl\u001e>9\u001bhlKl8\u001bm<HncHl;On<Lk8\u001ek;\u0019"));
            case 6:
                return Crypt.a(Crypt.xrc("N=bKm?A<<L;bNknA<h@kiJ<<\u001d=i\u0019inNm"));
            case 7:
                return Crypt.a(Crypt.xrc("\u001ajkAhbI<?JmlHm>NgnJgj\u001bj8L=<Amm\u001e<>N9l\u001a:?L;i\u001chl\u001cg<\u001df8O;k@oh\u001efnJ>kK"));
            case 8:
                return Crypt.a(Crypt.xrc("@nlHmi\u001ejh\u001b9<\u001b=lO=b\u001eml\u0019:iNmk\u001dfo\u0019gbKnk\u001cfjN:iAl9Mn8I9i\u001bmm\u001eg<\u001ef?\u001b:8\u001b"));
            case 9:
                return Crypt.a(Crypt.xrc("HnhO:n@fbJ=mJgcJgh\u001b9m\u001c=o\u0019lkHo?Kil\u0019<cOgc\u001bj;\u001bll\u001dhn\u0019<8A:l\u001a>;A:mKl8L"));
            default:
                switch (b10) {
                    case 90:
                        return Crypt.a(Crypt.xrc("\u0019m<@nbJ;l\u001cl;\u001d=iOjmK<cMh;\u001bj<\u001dj?\u001al"));
                    case 91:
                        return Crypt.a(Crypt.xrc("\u001a:h\u001djcNfbHljAoc\u001egbKmc\u001d9?M=bKfj@fkJkmNmc\u001c9;M:8J=cK;jMfl\u001cnhMn;\u001afc\u001a"));
                    case 92:
                        return Crypt.a(Crypt.xrc("\u001a:h\u001djcNfbHljAoc\u001egbKmc\u001d9?M=bKfj@f?@h>J>jO:l\u001eoj@ji\u0019<bI=>Mf8L<hAji\u001bmkOj8Afn\u001e><Imb\u001e>oA>h\u0019:k\u001b=cJm9N;bM<m@l9Hl?A9?NikMkmA9oOoc\u001ef?L=h\u001d:cIfh\u001e:c\u001a=kOf>\u0019lmIfhIi8Njh\u001bhoL<iH"));
                    case 93:
                        return Crypt.a(Crypt.xrc("\u001a:h\u001djcNfbHljAoc\u001egbKmc\u001d9?M=bKfj@f<\u0019:8Iko\u001cg;Ih;JljJmn\u001cn8\u0019miJo8\u001amn\u001do8I;>Agn@k?Ml9@mo\u001ef8\u001e>9\u001c<c\u001d>?Hm>N<i\u001bnm\u0019<<\u001aib\u001agkKh>\u001bgkLhkL;9\u001ej8Kj"));
                    default:
                        return Crypt.a(Crypt.xrc("@m8M;h\u001e99\u0019k8Nfb\u001dl8\u001el9\u001afo\u001cjj@nc@o"));
                }
        }
    }

    public static InetAddress l(byte[] bArr) {
        if (bArr.length < 4) {
            z3.a.c(Crypt.a(Crypt.xrc("I<;\u001bko\u001ai?\u001bi;Hg?Hfb\u001bfbOlcKjlM:l\u001bfiJ:8@h>@ml\u0019l>\u001cho\u001d;oHjjAo?N:;\u0019=n\u001co;NfcN=cLnoLh8@hjNkcJ<>\u001bim\u001bnlJhh")) + bArr.length + Crypt.a(Crypt.xrc("\u001agcNmbKkn\u001e=oKin\u001dmi\u0019oi\u0019>?Mk?\u001con\u0019o")));
            return null;
        }
        String string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        for (int i10 = 0; i10 < 4; i10++) {
            StringBuilder sbS = g1.a.s(string);
            int i11 = bArr[i10];
            if (i11 < 0) {
                i11 += NotificationCompat.FLAG_LOCAL_ONLY;
            }
            sbS.append(i11);
            string = sbS.toString();
            if (i10 < 3) {
                string = g1.a.y(string, Crypt.a(Crypt.xrc("K:nM:9\u0019i;\u001c<9\u00199c\u001e9?O:<Igl\u001cinAoj\u001df")));
            }
        }
        try {
            return InetAddress.getByName(string);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public static String m(byte b10) {
        return b10 != 1 ? b10 != 2 ? b10 != 3 ? Crypt.a(Crypt.xrc("@m8M;h\u001e99\u0019k8Nfb\u001dl8\u001el9\u001afo\u001cjj@nc@o")) : Crypt.a(Crypt.xrc("\u0019km@ilNml\u001d=;\u001c=8IinNhi\u001b:hMlkNn9Ki")) : Crypt.a(Crypt.xrc("\u001eib@fm\u001djj\u001aklI;mH;i\u0019gb\u001a9oKk<\u001emo\u001bg")) : Crypt.a(Crypt.xrc("Kmc\u001cm;\u001b:iLi<\u001efmHjk@jo\u001bmnLim\u001ai8\u0019>"));
    }

    public void a(byte b10) {
        this.f18193a = b10;
    }

    public void b(byte b10, InetAddress inetAddress, int i10) {
        byte[] address = {0, 0, 0, 0};
        z3.a.e(Crypt.a(Crypt.xrc("O9c\u0019<?O9jM<h\u001b>c@mcOjcMniAi<\u0019f>HlhN9?A9b@fl\u001dkiJihHii\u001agb\u001eobNkkHm9K")) + i(b10) + Crypt.a(Crypt.xrc("\u001dom@hnJ>o\u001c<8\u001binMol@:?\u001boh\u001dj8Ioc\u001d;")));
        byte[] bArr = new byte[8];
        if (inetAddress != null) {
            address = inetAddress.getAddress();
        }
        bArr[0] = 0;
        bArr[1] = b10;
        bArr[2] = (byte) ((65280 & i10) >> 8);
        bArr[3] = (byte) (i10 & 255);
        bArr[4] = address[0];
        bArr[5] = address[1];
        bArr[6] = address[2];
        bArr[7] = address[3];
        a aVar = this.f18194b;
        if (aVar.f18170f == null || aVar.f18171h == null) {
            z3.a.e(Crypt.a(Crypt.xrc("\u001d<kHfb\u0019hb\u001eno\u0019n8\u001akn\u001d<oN><A98HfkH9i@i8LicK=oKmkL:m\u001e;?No;Ngh\u001a>8\u001bojM")));
        } else {
            aVar.g(bArr, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.c.c():void");
    }

    public boolean d() {
        this.f18199g = l(this.f18197e);
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

    public final void e() throws Exception {
        a aVar = this.f18194b;
        z3.a.e(Crypt.a(Crypt.xrc("MkoI;8\u001cnkKj<\u001efj@ocLh9M<h@il\u001coiI9o\u001b9jNim@n?\u0019mnLg8@<<JjlMf;IlmOi8I")));
        try {
            aVar.c(this.f18200h, this.f18199g.getHostAddress());
            j(o());
        } catch (IOException unused) {
            h(n());
            throw new Exception(Crypt.a(Crypt.xrc("N:>Jm;Kh9\u0019;9Nni\u0019;jH<b\u001e9i\u001d;l\u001a;;@kjO>cA<hOjo\u001e<mO<cIgl\u001djkL>c\u001dfl\u001bklN")) + z3.a.E(aVar.f18171h));
        }
    }

    public final byte f() {
        try {
            a aVar = this.f18194b;
            while (aVar.f18170f != null) {
                try {
                    return (byte) aVar.f18173s.read();
                } catch (InterruptedIOException unused) {
                    Thread.yield();
                }
            }
            throw new Exception(Crypt.a(Crypt.xrc("Min\u001dkoI>o\u001cnc\u0019:lM<<K<;Ioi\u001d;<L:j\u001dgk@98\u0019;8\u001b:>\u001b9>Jom\u001cil@=?\u0019joNmmMi>Lh?@:cM=?\u001e=c@>;H=lL;b\u001d9n\u0019=<\u001ejn@fi")));
        } catch (Exception unused2) {
            return (byte) 0;
        }
    }

    public void g() throws Exception {
        this.f18195c = f();
        byte bF = f();
        byte[] bArr = this.f18196d;
        bArr[0] = bF;
        bArr[1] = f();
        for (int i10 = 0; i10 < 4; i10++) {
            this.f18197e[i10] = f();
        }
        while (true) {
            byte bF2 = f();
            if (bF2 == 0) {
                break;
            }
            this.f18198f += ((char) bF2);
        }
        byte[] bytes = (this.f18198f + " ").getBytes();
        bytes[bytes.length - 1] = 0;
        byte b10 = this.f18195c;
        if (b10 < 1 || b10 > 2) {
            h((byte) 91);
            throw new Exception(Crypt.a(Crypt.xrc("\u001b>>Anb\u001ah>\u001bknK>h\u001emhNg8H:h\u001e:>\u001c=jL<>N9oHhlKf8\u001c;l\u001e<k\u001bg8Hn<L>h\u001ammH98\u001e")).concat(m(this.f18195c)));
        }
        if (!d()) {
            h((byte) 92);
            throw new Exception(Crypt.a(Crypt.xrc("\u001ehl\u001c>hMnn\u0019n>\u001djnM:8L;?Nm9IkoA;8NgmIinO9nJmn\u001elbLlb@llK<?\u001bh;M:o\u001eklM")) + this.f18199g.toString());
        }
        z3.a.e(Crypt.a(Crypt.xrc("Amh\u0019l;\u001dg;\u001amiKom\u001e9<\u001df<A=8\u001dk9OjbMf;\u001ennJf8MinM;;O=>Lj>LkjNg;\u001c9mM;9@")) + m(this.f18195c) + Crypt.a(Crypt.xrc("\u001dom@hnJ>o\u001c<8\u001binMol@:?\u001boh\u001dj8Ioc\u001d;")));
    }

    public final void h(byte b10) {
        z3.a.e(Crypt.a(Crypt.xrc("IkhJglHgo@lh\u001e:b\u001eo?K:9\u001dl>Hn9O;oNkoAlmJl;K9cLo<I:i\u001clj\u0019;<Hoi\u0019>kK9jH")) + i(b10) + Crypt.a(Crypt.xrc("\u001dom@hnJ>o\u001c<8\u001binMol@:?\u001boh\u001dj8Ioc\u001d;")));
        j(b10);
    }

    public void j(byte b10) {
        z3.a.e(Crypt.a(Crypt.xrc("\u001boj@9?J<>N<l\u001b9i\u001emi\u001cg<\u001ajm@ik\u001do9I;8\u001c>mNkjAjnIn8\u0019joK:9\u001b<iJilOi;I9jI")) + i(b10) + Crypt.a(Crypt.xrc("\u001dom@hnJ>o\u001c<8\u001binMol@:?\u001boh\u001dj8Ioc\u001d;")));
        byte[] bArr = this.f18196d;
        byte[] bArr2 = this.f18197e;
        byte[] bArr3 = {0, b10, bArr[0], bArr[1], bArr2[0], bArr2[1], bArr2[2], bArr2[3]};
        a aVar = this.f18194b;
        aVar.getClass();
        aVar.g(bArr3, 8);
    }

    public void k() {
        z3.a.e(Crypt.a(Crypt.xrc("\u001blh\u001a<mAob\u001c9?\u001egb\u001ejnKniO>l\u001c;iHh9Kg9H<cHmn\u001blnMgo\u001bfjJni\u0019g<\u001a<n\u001c;iO;oNfmK=oNom\u0019hl\u001d>iAlk\u001b;h\u001e>?\u001bkiA>8\u0019ho")));
        z3.a.e(Crypt.a(Crypt.xrc("\u001c9jNhhJooL>oLn?A:oMm<AmcOk8K>i\u001bjiO9o\u0019=o\u001co;N;h\u0019om@hk\u001d:>\u001cg<I:<Nii\u001e")));
        h((byte) 91);
    }

    public byte n() {
        return (byte) 91;
    }

    public byte o() {
        return (byte) 90;
    }
}
