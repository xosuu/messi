package v8;

import android.net.VpnService;
import b7.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Locale;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;
import team.dev.epro.apkcustom.widgets.j;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Thread {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f17941q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Process f17943b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Thread f17944d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f17945f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ VpnService f17946h;

    public /* synthetic */ g(VpnService vpnService, int i10) {
        this.f17942a = i10;
        this.f17946h = vpnService;
    }

    public final void a(String str) {
        boolean z9;
        String str2;
        String str3;
        int i10 = this.f17942a;
        String strA = Crypt.a(Crypt.xrc("NnnN>nHgh\u001a:<Hnk\u001bij\u001doc\u001agbLh9\u001a:;\u0019i"));
        String strA2 = Crypt.a(Crypt.xrc("KglIlm\u001cfk\u001ci8O9l\u0019;k\u001eli@;i@liAik\u0019flOo;L<k\u001a9;MikL<j@;?\u001bf;J;>@ohLj;\u001c"));
        int i11 = 0;
        String strA3 = Crypt.a(Crypt.xrc("OohKf;@><\u001ahoMl8\u001c<b\u001a>nJlkNl<Jk;\u0019j"));
        String strA4 = Crypt.a(Crypt.xrc("\u001b99\u001ekcMl>\u001d9kA=lL=;@ijNgj\u0019:lIo<Nj"));
        String strA5 = Crypt.a(Crypt.xrc("L;;\u0019k;L<iNh;Jg>\u001bjm\u001d>8\u001enmLkh@g;@<"));
        String strA6 = Crypt.a(Crypt.xrc("Aki@ni\u001b9m\u001bn<\u001dno\u001chjA;<H=;Ohi\u001d9>M:"));
        VpnService vpnService = this.f17946h;
        String strA7 = Crypt.a(Crypt.xrc("\u001dm>\u001em?\u001cn8\u001cn<\u001d<nIob\u001d:mOf<\u001a:9Ifj\u001dn"));
        switch (i10) {
            case 0:
                if (str.contains(strA7)) {
                    z9 = true;
                    ((SSHTunnelService) vpnService).U = true;
                } else {
                    z9 = true;
                }
                if (str.contains(strA6)) {
                    SSHTunnelService sSHTunnelService = (SSHTunnelService) vpnService;
                    sSHTunnelService.U = z9;
                    boolean z10 = SSHTunnelService.W;
                    StringBuilder sb = new StringBuilder(strA5);
                    g1.a.w(sSHTunnelService.f17290h, sb, strA4);
                    sb.append(team.dev.epro.apkcustom.widgets.a.f17390c);
                    sb.append(strA3);
                    sb.append(str);
                    u.r(Crypt.a(Crypt.xrc("Ij8\u001em8KlcKmjIhl\u001bjjLhnMi>M:9\u001ah9\u001c:jH;j\u001bm<Kjm\u001blkKk;A=k\u0019hiOgl\u001bhjJ:>\u001d")), sb.toString());
                    sSHTunnelService.m();
                }
                if (str.contains(strA2)) {
                    SSHTunnelService sSHTunnelService2 = (SSHTunnelService) vpnService;
                    if (!sSHTunnelService2.V && (str2 = sSHTunnelService2.K) != null && !str2.equals(strA)) {
                        try {
                            Thread.sleep(1000L);
                            break;
                        } catch (InterruptedException unused) {
                        }
                        sSHTunnelService2.f17295v.interrupt();
                        sSHTunnelService2.f17295v = null;
                        try {
                            Thread.sleep(1000L);
                            break;
                        } catch (InterruptedException unused2) {
                        }
                        g gVar = new g(sSHTunnelService2, i11);
                        sSHTunnelService2.f17295v = gVar;
                        gVar.start();
                        break;
                    }
                }
                break;
            default:
                if (str.contains(strA7)) {
                    ((V2RayVpnService) vpnService).K = true;
                }
                if (str.contains(strA6)) {
                    V2RayVpnService v2RayVpnService = (V2RayVpnService) vpnService;
                    v2RayVpnService.K = true;
                    String string = v2RayVpnService.getString(R.string.bl);
                    StringBuilder sb2 = new StringBuilder(strA5);
                    g1.a.w(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u0019=?Ank\u001d=o\u001bnhAmn\u001a;hJobJ>cKncAfhJ=")), Locale.getDefault()), sb2, strA4);
                    sb2.append(team.dev.epro.apkcustom.widgets.a.f17390c);
                    sb2.append(strA3);
                    sb2.append(str);
                    u.r(string, sb2.toString());
                    App.f17100w.f17415a.edit().putBoolean(Crypt.a(Crypt.xrc("L<jLhk\u001dobL>cNli@kkA98\u001bhcI<oOil\u001df")), false).apply();
                    v2RayVpnService.c();
                }
                if (str.contains(strA2)) {
                    V2RayVpnService v2RayVpnService2 = (V2RayVpnService) vpnService;
                    if (!v2RayVpnService2.L && (str3 = v2RayVpnService2.J) != null && !str3.equals(strA)) {
                        try {
                            Thread.sleep(1000L);
                            break;
                        } catch (InterruptedException unused3) {
                        }
                        v2RayVpnService2.G.interrupt();
                        v2RayVpnService2.G = null;
                        try {
                            Thread.sleep(1000L);
                            break;
                        } catch (InterruptedException unused4) {
                        }
                        g gVar2 = new g(v2RayVpnService2, 1);
                        v2RayVpnService2.G = gVar2;
                        gVar2.start();
                        break;
                    }
                }
                break;
        }
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        switch (this.f17942a) {
            case 0:
                i iVar = (i) this.f17944d;
                if (iVar != null) {
                    iVar.f17951d = true;
                    iVar.interrupt();
                    this.f17944d = null;
                }
                i iVar2 = (i) this.f17945f;
                if (iVar2 != null) {
                    iVar2.f17951d = true;
                    iVar2.interrupt();
                    this.f17945f = null;
                }
                Process process = this.f17943b;
                if (process != null) {
                    process.destroy();
                }
                this.f17943b = null;
                super.interrupt();
                break;
            default:
                team.dev.epro.apkcustom.sockets.v2ray.b bVar = (team.dev.epro.apkcustom.sockets.v2ray.b) this.f17944d;
                if (bVar != null) {
                    bVar.f17360d = true;
                    bVar.interrupt();
                    this.f17944d = null;
                }
                team.dev.epro.apkcustom.sockets.v2ray.b bVar2 = (team.dev.epro.apkcustom.sockets.v2ray.b) this.f17945f;
                if (bVar2 != null) {
                    bVar2.f17360d = true;
                    bVar2.interrupt();
                    this.f17945f = null;
                }
                Process process2 = this.f17943b;
                if (process2 != null) {
                    process2.destroy();
                }
                this.f17943b = null;
                super.interrupt();
                break;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String string;
        String strTrim;
        String string2;
        String string3;
        InetAddress[] inetAddressArr;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String string4;
        InetAddress[] inetAddressArr2;
        String string5;
        String string6;
        String strTrim2;
        String string7;
        InetAddress[] inetAddressArr3;
        String str6;
        String str7;
        String str8;
        String str9;
        String string8;
        InetAddress[] inetAddressArr4;
        String strA = Crypt.a(Crypt.xrc("MlbA<;L9n\u0019ll@=8Ki9KikK>mL;9Oo>\u001bj"));
        String strA2 = Crypt.a(Crypt.xrc("\u0019;o\u001eglI=lAiiH9m@hhMkjJjo\u001ekjKib@:"));
        String strA3 = Crypt.a(Crypt.xrc("N;lIk?Kl?\u0019lmAni\u001d<c\u001bgjJj9\u0019h9On<Ll"));
        String strA4 = Crypt.a(Crypt.xrc("L<iMnmLm8\u0019il\u001a=lL>>\u001af<\u001b<;Kh;Ahi@k"));
        String strA5 = Crypt.a(Crypt.xrc("Jfb@gc\u001ejmL:hK:h\u001djjIm>M=mJj<LkcIo"));
        String strA6 = Crypt.a(Crypt.xrc("\u001blkKjjHn?I:lIgcA9m\u001c;iL=l\u001bnkLhiN9"));
        String strA7 = Crypt.a(Crypt.xrc("N<n\u001c9iKhcLih@:hM>;\u001cmlKimA;8Ik9\u001a="));
        int i10 = this.f17942a;
        String strA8 = Crypt.a(Crypt.xrc("\u0019:nA>?\u001e9o\u001ej8Mlo\u0019;>\u0019g>\u001c=iNmj@kmLn"));
        String strA9 = Crypt.a(Crypt.xrc("\u001e>nM:nOfbN<;Hgo\u001emoN<cOhiOn?Nnc\u001amnA>i@>kM<?KmjAhm\u001a9kL;c\u001aj9Lj<\u001e>jO"));
        String strA10 = Crypt.a(Crypt.xrc("\u001ak9\u001a:8A=m\u001e>lH;8L>l\u001dgm\u001c9h\u0019=c\u001amnA<"));
        String strA11 = Crypt.a(Crypt.xrc("\u0019=iHnb\u001e>oJhiOj?Ng9Ln?L<8\u0019:9Njh\u0019m"));
        String strA12 = Crypt.a(Crypt.xrc("\u001e:8K=j\u0019kcI>iA;i\u001dlm\u001e=cJgo\u001dim\u001ak8\u001cn"));
        VpnService vpnService = this.f17946h;
        String strA13 = Crypt.a(Crypt.xrc("M>8Kho\u001co8OjoI:iH>;Amj\u0019kmMlh@>9K:>Ll;I>hOiiIm9O=>\u0019n;Joc\u001a<8JloKmi\u001d"));
        String strA14 = Crypt.a(Crypt.xrc("AkkKjk@mlN9m\u001c:>\u001am;Noj\u001bom\u001b:mO<?M>"));
        String strA15 = Crypt.a(Crypt.xrc("IgmIflAoiJ>?\u001em8\u001e>>\u001e<lLmoJj?\u001b=m\u001bf"));
        String strA16 = Crypt.a(Crypt.xrc("\u0019nm\u001em9Lj>\u001a>lNl9@gjJ:c\u001eh>\u001a<iK9?\u0019m"));
        String strA17 = Crypt.a(Crypt.xrc("NnnN>nHgh\u001a:<Hnk\u001bij\u001doc\u001agbLh9\u001a:;\u0019i"));
        String strA18 = Crypt.a(Crypt.xrc("Lmo\u001dlcL<i\u001bnb\u001ehc\u001e:m\u001ei;\u001a:o\u001ehcIf>\u001em"));
        String strA19 = Crypt.a(Crypt.xrc("Jj;\u001cmmOo?IinOilL9nN9<\u001dhoNh<\u0019>b\u001cj"));
        String strA20 = Crypt.a(Crypt.xrc("\u001cmmIjl\u0019:c\u001b9l@jl\u001e<n@ijOoo\u001bl8\u001a:?Kl"));
        String strA21 = Crypt.a(Crypt.xrc("Jf9J9>Jjn\u001b:?H9j\u001dn<\u001dnkK>9\u001alcAfj\u001d9"));
        String str10 = strA8;
        switch (i10) {
            case 0:
                j jVar = App.f17101x;
                int i11 = Integer.parseInt(jVar.l0(jVar.i0())[27]);
                int i12 = Integer.parseInt(strA21);
                String str11 = strA9;
                String strA22 = Crypt.a(Crypt.xrc("\u001ann\u001eij\u001e<i@;l\u001anb\u001ai?\u0019;>Ohm\u001e9o\u001e>?Oj"));
                if (i11 >= i12 || App.f17101x.i0().isEmpty()) {
                    if (!App.f17100w.f17415a.getBoolean(strA22, true)) {
                        if (App.f17100w.f17415a.getString(strA13, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                            j jVar2 = App.f17101x;
                            string3 = jVar2.l0(jVar2.i0())[31];
                            if (string3.isEmpty()) {
                                string3 = App.f17100w.f17415a.getString(strA18, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            }
                        } else {
                            string3 = App.f17100w.f17415a.getString(strA13, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                        SSHTunnelService sSHTunnelService = (SSHTunnelService) vpnService;
                        sSHTunnelService.I = string3;
                        if (string3.contains(strA10)) {
                            sSHTunnelService.V = true;
                            sSHTunnelService.J = string3;
                            try {
                                string3 = new URL(string3).getHost();
                                break;
                            } catch (MalformedURLException unused) {
                            }
                        } else {
                            sSHTunnelService.V = false;
                            String[] strArrSplit = string3.split(strA16);
                            if (strArrSplit.length == 2) {
                                string3 = strArrSplit[0];
                                sSHTunnelService.K = strArrSplit[1];
                            } else {
                                String str12 = strArrSplit[0];
                                sSHTunnelService.K = strA17;
                                string3 = str12;
                            }
                            sSHTunnelService.J = string3;
                        }
                        InetAddress[] inetAddressArrH = team.dev.epro.apkcustom.widgets.e.h(string3);
                        if (inetAddressArrH != null) {
                            int length = inetAddressArrH.length;
                            int i13 = 0;
                            while (i13 < length) {
                                InetAddress inetAddress = inetAddressArrH[i13];
                                if (inetAddress instanceof Inet4Address) {
                                    if (sSHTunnelService.V) {
                                        if (inetAddress.getHostAddress() != null) {
                                            str = str11;
                                            if (string3.contains(str)) {
                                                str2 = str10;
                                                sSHTunnelService.J = sSHTunnelService.J.replace(string3, str2);
                                                inetAddressArr = inetAddressArrH;
                                            } else {
                                                str2 = str10;
                                                inetAddressArr = inetAddressArrH;
                                                sSHTunnelService.J = sSHTunnelService.J.replace(string3, inetAddress.getHostAddress());
                                            }
                                        }
                                        str3 = string3;
                                        sSHTunnelService.C.b(new l5.f(inetAddress.getHostAddress(), 32), false);
                                    } else {
                                        sSHTunnelService.J = inetAddress.getHostAddress();
                                    }
                                    inetAddressArr = inetAddressArrH;
                                    str = str11;
                                    str2 = str10;
                                    str3 = string3;
                                    sSHTunnelService.C.b(new l5.f(inetAddress.getHostAddress(), 32), false);
                                } else {
                                    inetAddressArr = inetAddressArrH;
                                    str = str11;
                                    str2 = str10;
                                    str3 = string3;
                                }
                                i13++;
                                str10 = str2;
                                inetAddressArrH = inetAddressArr;
                                string3 = str3;
                                str11 = str;
                            }
                        }
                    }
                    if (App.f17100w.f17415a.getString(strA15, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                        j jVar3 = App.f17101x;
                        string = jVar3.l0(jVar3.i0())[29];
                        if (string.isEmpty()) {
                            string = App.f17100w.f17415a.getString(strA20, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                    } else {
                        string = App.f17100w.f17415a.getString(strA15, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                    strTrim = string;
                    if (App.f17100w.f17415a.getString(strA14, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                        j jVar4 = App.f17101x;
                        string2 = jVar4.l0(jVar4.i0())[30];
                        if (string2.isEmpty()) {
                            string2 = App.f17100w.f17415a.getString(strA19, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                    } else {
                        string2 = App.f17100w.f17415a.getString(strA14, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                } else {
                    if (!App.f17100w.f17415a.getBoolean(strA22, true)) {
                        if (App.f17100w.f17415a.getString(strA13, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                            string4 = App.f17100w.f17415a.getString(strA11, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).split(strA12)[0].split(strA16)[0];
                            if (string4.isEmpty()) {
                                string4 = App.f17100w.f17415a.getString(strA18, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            }
                        } else {
                            string4 = App.f17100w.f17415a.getString(strA13, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                        InetAddress[] inetAddressArrH2 = team.dev.epro.apkcustom.widgets.e.h(string4);
                        if (inetAddressArrH2 != null) {
                            int length2 = inetAddressArrH2.length;
                            int i14 = 0;
                            while (i14 < length2) {
                                InetAddress inetAddress2 = inetAddressArrH2[i14];
                                if (inetAddress2 instanceof Inet4Address) {
                                    SSHTunnelService sSHTunnelService2 = (SSHTunnelService) vpnService;
                                    sSHTunnelService2.J = inetAddress2.getHostAddress();
                                    inetAddressArr2 = inetAddressArrH2;
                                    sSHTunnelService2.C.b(new l5.f(inetAddress2.getHostAddress(), 32), false);
                                } else {
                                    inetAddressArr2 = inetAddressArrH2;
                                }
                                i14++;
                                inetAddressArrH2 = inetAddressArr2;
                            }
                        }
                    }
                    if (App.f17100w.f17415a.getString(strA14, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                        String[] strArrSplit2 = App.f17100w.f17415a.getString(strA11, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).split(strA12)[0].split(strA16);
                        string2 = strArrSplit2.length > 1 ? strArrSplit2[1].trim() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        if (string2.isEmpty()) {
                            string2 = App.f17100w.f17415a.getString(strA19, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                    } else {
                        string2 = App.f17100w.f17415a.getString(strA14, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                    if (App.f17100w.f17415a.getString(strA15, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                        String[] strArrSplit3 = App.f17100w.f17415a.getString(strA11, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).split(strA12);
                        strTrim = strArrSplit3.length > 2 ? strArrSplit3[2].trim() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        if (strTrim.isEmpty()) {
                            strTrim = App.f17100w.f17415a.getString(strA20, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                    } else {
                        strTrim = App.f17100w.f17415a.getString(strA15, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                }
                SSHTunnelService sSHTunnelService3 = (SSHTunnelService) vpnService;
                String[] strArr = new String[7];
                strArr[0] = new File(sSHTunnelService3.getApplicationInfo().nativeLibraryDir, strA7).getAbsolutePath();
                if (sSHTunnelService3.V) {
                    str4 = strA6;
                } else {
                    String str13 = sSHTunnelService3.K;
                    str4 = (str13 == null || str13.trim().equals(strA17)) ? strA4 : strA5;
                }
                strArr[1] = str4;
                strArr[2] = (!sSHTunnelService3.V && ((str5 = sSHTunnelService3.K) == null || str5.trim().equals(strA17))) ? g1.a.r(new StringBuilder(), sSHTunnelService3.J, strA3) : sSHTunnelService3.I;
                strArr[3] = strA2;
                strArr[4] = g1.a.q(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, string2);
                strArr[5] = g1.a.q(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, strTrim);
                strArr[6] = strA;
                try {
                    Process processExec = Runtime.getRuntime().exec(strArr);
                    try {
                        this.f17943b = processExec;
                        r0.c cVar = new r0.c(7, this);
                        this.f17944d = new i(processExec.getInputStream(), cVar);
                        this.f17945f = new i(this.f17943b.getErrorStream(), cVar);
                        Thread thread = this.f17944d;
                        ((i) thread).f17951d = false;
                        ((i) thread).start();
                        Thread thread2 = this.f17945f;
                        ((i) thread2).f17951d = false;
                        ((i) thread2).start();
                        this.f17943b.waitFor();
                    } catch (IOException | InterruptedException unused2) {
                        return;
                    }
                } catch (IOException | InterruptedException unused3) {
                    return;
                }
                break;
            default:
                j jVar5 = App.f17101x;
                if (Integer.parseInt(jVar5.l0(jVar5.i0())[27]) >= Integer.parseInt(strA21) || App.f17101x.i0().isEmpty()) {
                    if (App.f17100w.f17415a.getString(strA13, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                        j jVar6 = App.f17101x;
                        string5 = jVar6.l0(jVar6.i0())[31];
                        if (string5.isEmpty()) {
                            string5 = App.f17100w.f17415a.getString(strA18, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                    } else {
                        string5 = App.f17100w.f17415a.getString(strA13, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                    V2RayVpnService v2RayVpnService = (V2RayVpnService) vpnService;
                    v2RayVpnService.H = string5;
                    if (string5.contains(strA10)) {
                        v2RayVpnService.L = true;
                        v2RayVpnService.I = string5;
                        try {
                            string5 = new URL(string5).getHost();
                            break;
                        } catch (MalformedURLException unused4) {
                        }
                    } else {
                        v2RayVpnService.L = false;
                        String[] strArrSplit4 = string5.split(strA16);
                        if (strArrSplit4.length == 2) {
                            string5 = strArrSplit4[0];
                            v2RayVpnService.J = strArrSplit4[1];
                        } else {
                            String str14 = strArrSplit4[0];
                            v2RayVpnService.J = strA17;
                            string5 = str14;
                        }
                        v2RayVpnService.I = string5;
                        if (v2RayVpnService.J.trim().equals(Crypt.a(Crypt.xrc("@>kA>b\u0019g?\u001agi\u001ajmLhl\u001df;\u001c<j\u001bglIkh\u001ej")))) {
                            v2RayVpnService.L = true;
                        }
                    }
                    InetAddress[] inetAddressArrH3 = team.dev.epro.apkcustom.widgets.e.h(string5);
                    if (inetAddressArrH3 != null) {
                        int length3 = inetAddressArrH3.length;
                        int i15 = 0;
                        while (i15 < length3) {
                            InetAddress inetAddress3 = inetAddressArrH3[i15];
                            if (inetAddress3 instanceof Inet4Address) {
                                if (v2RayVpnService.L) {
                                    if (inetAddress3.getHostAddress() != null) {
                                        if (string5.contains(strA9)) {
                                            str7 = str10;
                                            v2RayVpnService.I = v2RayVpnService.I.replace(string5, str7);
                                            inetAddressArr3 = inetAddressArrH3;
                                        } else {
                                            str7 = str10;
                                            inetAddressArr3 = inetAddressArrH3;
                                            v2RayVpnService.I = v2RayVpnService.I.replace(string5, inetAddress3.getHostAddress());
                                        }
                                    }
                                    str6 = string5;
                                    v2RayVpnService.f17344d.b(new l5.f(inetAddress3.getHostAddress(), 32), false);
                                } else {
                                    v2RayVpnService.I = inetAddress3.getHostAddress();
                                }
                                inetAddressArr3 = inetAddressArrH3;
                                str7 = str10;
                                str6 = string5;
                                v2RayVpnService.f17344d.b(new l5.f(inetAddress3.getHostAddress(), 32), false);
                            } else {
                                inetAddressArr3 = inetAddressArrH3;
                                str6 = string5;
                                str7 = str10;
                            }
                            i15++;
                            str10 = str7;
                            inetAddressArrH3 = inetAddressArr3;
                            string5 = str6;
                        }
                    }
                    if (App.f17100w.f17415a.getString(strA15, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                        j jVar7 = App.f17101x;
                        string6 = jVar7.l0(jVar7.i0())[29];
                        if (string6.isEmpty()) {
                            string6 = App.f17100w.f17415a.getString(strA20, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                    } else {
                        string6 = App.f17100w.f17415a.getString(strA15, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                    strTrim2 = string6;
                    if (App.f17100w.f17415a.getString(strA14, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                        j jVar8 = App.f17101x;
                        string7 = jVar8.l0(jVar8.i0())[30];
                        if (string7.isEmpty()) {
                            string7 = App.f17100w.f17415a.getString(strA19, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                    } else {
                        string7 = App.f17100w.f17415a.getString(strA14, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                } else {
                    if (App.f17100w.f17415a.getString(strA13, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                        string8 = App.f17100w.f17415a.getString(strA11, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).split(strA12)[0].split(strA16)[0];
                        if (string8.isEmpty()) {
                            string8 = App.f17100w.f17415a.getString(strA18, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                    } else {
                        string8 = App.f17100w.f17415a.getString(strA13, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                    InetAddress[] inetAddressArrH4 = team.dev.epro.apkcustom.widgets.e.h(string8);
                    if (inetAddressArrH4 != null) {
                        int length4 = inetAddressArrH4.length;
                        int i16 = 0;
                        while (i16 < length4) {
                            InetAddress inetAddress4 = inetAddressArrH4[i16];
                            if (inetAddress4 instanceof Inet4Address) {
                                V2RayVpnService v2RayVpnService2 = (V2RayVpnService) vpnService;
                                v2RayVpnService2.I = inetAddress4.getHostAddress();
                                inetAddressArr4 = inetAddressArrH4;
                                v2RayVpnService2.f17344d.b(new l5.f(inetAddress4.getHostAddress(), 32), false);
                            } else {
                                inetAddressArr4 = inetAddressArrH4;
                            }
                            i16++;
                            inetAddressArrH4 = inetAddressArr4;
                        }
                    }
                    if (App.f17100w.f17415a.getString(strA14, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                        String[] strArrSplit5 = App.f17100w.f17415a.getString(strA11, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).split(strA12)[0].split(strA16);
                        string7 = strArrSplit5.length > 1 ? strArrSplit5[1].trim() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        if (string7.isEmpty()) {
                            string7 = App.f17100w.f17415a.getString(strA19, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                    } else {
                        string7 = App.f17100w.f17415a.getString(strA14, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                    if (App.f17100w.f17415a.getString(strA15, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                        String[] strArrSplit6 = App.f17100w.f17415a.getString(strA11, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).split(strA12);
                        strTrim2 = strArrSplit6.length > 2 ? strArrSplit6[2].trim() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        if (strTrim2.isEmpty()) {
                            strTrim2 = App.f17100w.f17415a.getString(strA20, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                    } else {
                        strTrim2 = App.f17100w.f17415a.getString(strA15, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                }
                V2RayVpnService v2RayVpnService3 = (V2RayVpnService) vpnService;
                String[] strArr2 = new String[7];
                strArr2[0] = new File(v2RayVpnService3.getApplicationInfo().nativeLibraryDir, strA7).getAbsolutePath();
                if (v2RayVpnService3.L) {
                    str8 = strA6;
                } else {
                    String str15 = v2RayVpnService3.J;
                    str8 = (str15 == null || str15.equals(strA17)) ? strA4 : strA5;
                }
                strArr2[1] = str8;
                strArr2[2] = (!v2RayVpnService3.L && ((str9 = v2RayVpnService3.J) == null || str9.trim().equals(strA17))) ? g1.a.r(new StringBuilder(), v2RayVpnService3.I, strA3) : v2RayVpnService3.H;
                strArr2[3] = strA2;
                strArr2[4] = g1.a.q(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, string7);
                strArr2[5] = g1.a.q(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, strTrim2);
                strArr2[6] = strA;
                try {
                    Process processExec2 = Runtime.getRuntime().exec(strArr2);
                    try {
                        this.f17943b = processExec2;
                        r0.c cVar2 = new r0.c(9, this);
                        this.f17944d = new team.dev.epro.apkcustom.sockets.v2ray.b(processExec2.getInputStream(), cVar2);
                        this.f17945f = new team.dev.epro.apkcustom.sockets.v2ray.b(this.f17943b.getErrorStream(), cVar2);
                        Thread thread3 = this.f17944d;
                        ((team.dev.epro.apkcustom.sockets.v2ray.b) thread3).f17360d = false;
                        ((team.dev.epro.apkcustom.sockets.v2ray.b) thread3).start();
                        Thread thread4 = this.f17945f;
                        ((team.dev.epro.apkcustom.sockets.v2ray.b) thread4).f17360d = false;
                        ((team.dev.epro.apkcustom.sockets.v2ray.b) thread4).start();
                        this.f17943b.waitFor();
                    } catch (IOException | InterruptedException unused5) {
                        return;
                    }
                    break;
                } catch (IOException | InterruptedException unused6) {
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(V2RayVpnService v2RayVpnService) {
        this(v2RayVpnService, 1);
        this.f17942a = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(SSHTunnelService sSHTunnelService) {
        this(sSHTunnelService, 0);
        this.f17942a = 0;
    }
}
