package x8;

import com.google.android.gms.internal.ads.fb1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.q;
import team.dev.epro.apkcustom.sockets.http2socks.socksshttp.proxy.ProxyException;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f18556b = Pattern.compile(Crypt.a(Crypt.xrc("\u001d:h\u001c>cM=?LmjIilI;hN>iN><\u001amlIo?\u001ek>\u001bgj\u001bg>O=cJ=bAjlLhbH;hH<kH9lI;?\u001d")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f18557a;

    public a(q qVar) {
        this.f18557a = qVar;
    }

    @Override // x8.c
    public final void a(Socket socket, String str, int i10, int i11) throws IOException {
        b bVar;
        String strA;
        if (str.equals(Crypt.a(Crypt.xrc("HllAhmO=bJ<l\u0019=>M:;\u001ej>\u0019m<\u001bmiH<n\u001eo")))) {
            return;
        }
        q qVar = this.f18557a;
        String str2 = (String) qVar.f14971c;
        socket.connect(new InetSocketAddress(str2, qVar.f14970b));
        StringBuilder sb = new StringBuilder(Crypt.a(Crypt.xrc("I:hI;nL>oN<i\u001b=<Mk9\u0019=bOfbIgn\u001amlLn")));
        sb.append(str);
        String strA2 = Crypt.a(Crypt.xrc("\u0019nm\u001em9Lj>\u001a>lNl9@gjJ:c\u001eh>\u001a<iK9?\u0019m"));
        sb.append(strA2);
        sb.append(i10);
        String string = sb.toString();
        String str3 = (String) qVar.f14972d;
        if (str3 != null) {
            fb1.x(str3, strA2, (String) qVar.f14973e).getBytes(StandardCharsets.UTF_8);
            throw null;
        }
        socket.getOutputStream().write((string + Crypt.a(Crypt.xrc("\u001aj8N:bH9kMij@9k\u001agn@i8\u001bnmK;?MnlNgk\u001e;k\u001e:;\u0019l<Li8A=iO9?J:iJ:kHi<\u001clo\u001d")) + str + strA2 + i10 + Crypt.a(Crypt.xrc("Nk9KhhNokNlj@j9@98\u001bn;H<c\u001alo\u001cj;\u001ek"))).getBytes(Crypt.a(Crypt.xrc("\u001co9H9iIn>Lh<Kn9Mn>KfcIll\u001bgb\u001bll@<"))));
        InputStream inputStream = socket.getInputStream();
        StringBuilder sb2 = new StringBuilder(100);
        int i12 = 0;
        do {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw new ProxyException(Crypt.a(Crypt.xrc("H:o\u001amlL98Jhn\u001a;>\u001encO>k@h?@hkNg;\u001ch?O<>Lj;Lo>M99O9kM=bN<<\u001am?@;mN=m\u001e>cHhiLm>Ij8H><\u001dlnI;<\u0019kkK9cNio\u001bl;")));
            }
            char c10 = (char) i13;
            sb2.append(c10);
            int length = sb2.length();
            bVar = b.f18558a;
            strA = Crypt.a(Crypt.xrc("M<>\u0019nk@h<\u001ahbMkb\u0019kh@<;Jl>O>k\u001b=oNhi\u001ci9AfoLg;\u0019m8\u001bf;A;h\u00199o\u001d9<Lol\u001bg>I"));
            if (length > 1024) {
                throw new ProxyException(bVar, fb1.i(Crypt.a(Crypt.xrc("\u001e>mI:l\u001c9>\u001cgc\u001bhlOgnKo<\u001dhh\u0019h<Ig;\u001d9oNh;M>9Imh\u001ejb\u001dkm\u001dn>Kn>M=8\u0019g?KiiJ:b\u001agnI:m\u001ehh\u001dio\u001cin@o9\u001d>jMj9\u001dh<Akn")), str2, strA));
            }
            i12 = (((i12 == 0 || i12 == 2) && c10 == '\r') || ((i12 == 1 || i12 == 3) && c10 == '\n')) ? i12 + 1 : 0;
        } while (i12 != 4);
        if (i12 != 4) {
            throw new ProxyException(bVar, fb1.i(Crypt.a(Crypt.xrc("HhlLkkMl;LlbJoi\u001b=b@=8\u001ci;\u001c<j@o9\u001d>bJgnI;?Ho;A>k\u001c<o\u001b9?K9iAjoJlk\u001cmjN")), str2, strA));
        }
        String line = new BufferedReader(new StringReader(sb2.toString())).readLine();
        if (line == null) {
            throw new ProxyException(bVar, fb1.i(Crypt.a(Crypt.xrc("K;;\u001a>l\u0019mcAh;Jni\u001e:mM=?\u001d<oJnc\u001a:k\u001bfoL;bMfo@i?Ho8Lo8\u001ao>IghMhlAgh@jh\u001e")), str2, Crypt.a(Crypt.xrc("Afh\u001ag9\u001af<\u001cn9L>hM<hL:hA;cMm>IkbL:"))));
        }
        Matcher matcher = f18556b.matcher(line);
        if (matcher.matches()) {
            int i14 = Integer.parseInt(matcher.group(1));
            if (i14 != 200) {
                throw new ProxyException(bVar, fb1.g(Crypt.a(Crypt.xrc("JhjL><Jj8I9i\u001b=mL9lKlk@;j\u001ej?\u00199kJ=jMn?O=;Anh\u001eljI;>\u001bm9\u001ambH=nImk\u001aib\u001b")), i14));
            }
        } else {
            throw new ProxyException(bVar, Crypt.a(Crypt.xrc("Mg>LgmMg<NiiAh9I9;\u001ckb\u0019g?An;Lgl\u001b9mL:?\u001ahk\u001aioI=8\u001e;;\u0019;;Ikm\u001ag?IgbI>cH")) + str2 + Crypt.a(Crypt.xrc("\u001dn9\u001e;?Nnm\u001b9;Lk8Ah<Ao9AfiOih\u001d=hO>")) + line);
        }
    }
}
