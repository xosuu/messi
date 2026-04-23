package p8;

import android.app.ProgressDialog;
import android.os.Build;
import android.os.Handler;
import com.google.android.gms.ads.RequestConfiguration;
import dev.epro.v2ray.util.Utils;
import f.s0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HttpsURLConnection;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.sockets.udp.UDPService;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16329b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16330d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16331f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16332h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f16333q;

    public /* synthetic */ f(Object obj, String str, int i10, int[] iArr, ExecutorService executorService, int i11) {
        this.f16328a = i11;
        this.f16331f = obj;
        this.f16329b = str;
        this.f16330d = i10;
        this.f16332h = iArr;
        this.f16333q = executorService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2;
        HttpsURLConnection httpsURLConnection3;
        int i10 = this.f16328a;
        String strA = Crypt.a(Crypt.xrc("Kko\u001b<<\u001d;>J>k@;;H=oIhc\u0019<mN;cK=j\u001dm"));
        final int i11 = 0;
        Object obj = this.f16333q;
        Object obj2 = this.f16332h;
        int i12 = this.f16330d;
        String str = this.f16329b;
        Object obj3 = this.f16331f;
        switch (i10) {
            case 0:
                MainActivity mainActivity = (MainActivity) obj3;
                ProgressDialog progressDialog = (ProgressDialog) obj2;
                Handler handler = (Handler) obj;
                a9.b bVar = MainActivity.N0;
                mainActivity.getClass();
                String strA2 = Crypt.a(Crypt.xrc("\u001enoKfnM>iMfc\u001bh8KhmA;lO=o\u001ai8\u001b:>\u001a9nOnb\u001eoh\u001d=lOonMgbJmjJn<OhlIooLinN99\u001e;;OloOojI=8L>k\u0019;<\u001d:kKhn@9>M=l"));
                try {
                    if (!MainActivity.H(progressDialog, str)) {
                        if (progressDialog.isShowing()) {
                            progressDialog.dismiss();
                        }
                        handler.post(new Runnable() { // from class: p8.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        a9.b bVar2 = MainActivity.N0;
                                        App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, Crypt.a(Crypt.xrc("Jj;Al>\u001dh>Ohi\u001b;b\u001ah?Hn?Nhb\u001dg8Mio\u001ei<@i8\u001dm?\u001bfn\u001agk\u001d;kA:n\u001b9jA=?HjkLnbOnmK;jKkkIo9\u0019jcMibJfiNmoJh8Im>O;<")));
                                        break;
                                    default:
                                        a9.b bVar3 = MainActivity.N0;
                                        App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, Crypt.a(Crypt.xrc("\u001dj9\u0019n?JjnM:8Kj>Oml@h>Mf8M9hK<jLnc\u0019<oM9;M<iO9;O:k\u001d<?OgnM:>O:jIg>@")));
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    progressDialog.setMessage(Crypt.a(Crypt.xrc("Jnb\u001clk\u001ajc\u001en9Om8J<9\u001dhj\u001b9bIm;Nm;\u001c<o\u001c;l\u001d<8\u001ahh@fn\u001cnc\u001c>iKj?O;j\u001dg>\u001dhoM")));
                    URLConnection uRLConnectionOpenConnection = new URL(strA2 + Utils.urlEncode(str)).openConnection();
                    uRLConnectionOpenConnection.setConnectTimeout(10000);
                    uRLConnectionOpenConnection.setReadTimeout(10000);
                    uRLConnectionOpenConnection.setRequestProperty(Crypt.a(Crypt.xrc("J<;@i;H:;KhoNo;JjiK;kM<?\u001d><\u001d;o\u001ef")), Crypt.a(Crypt.xrc("J9mAfiN:<Ijn\u001dmh\u0019imMfo\u001eklMh;A;m@k;AflHfi\u001cg>Lok\u001ell\u001c9?\u001e<i\u001bic\u001agj\u001dhkM")));
                    uRLConnectionOpenConnection.setRequestProperty(Crypt.a(Crypt.xrc("Kl9Oo>\u001e>lIf>@;m\u001b>nAhb\u001d>o\u001c>mNocM;")), String.valueOf(i12));
                    uRLConnectionOpenConnection.setRequestProperty(Crypt.a(Crypt.xrc("MmjL;o\u001di?\u001ekc\u0019=>Nf?K:8H9m\u0019inK<9\u001e=")), String.valueOf(Build.VERSION.SDK_INT));
                    uRLConnectionOpenConnection.setRequestProperty(Crypt.a(Crypt.xrc("A9kJ9j\u001efb\u001e<>\u001a=c\u0019i?K:k\u001e:<\u001ek<\u001e:mLo")), Build.VERSION.RELEASE);
                    uRLConnectionOpenConnection.setRequestProperty(Crypt.a(Crypt.xrc("@nmJgj\u001do9K:kO>kJjm@gc\u001a;m\u001c<oK<iIo")), Build.MANUFACTURER);
                    uRLConnectionOpenConnection.setRequestProperty(Crypt.a(Crypt.xrc("Kf9AnkJfm\u001b>kMf>\u001d<cNl8N<hJ=mIl<K;")), Build.MODEL);
                    uRLConnectionOpenConnection.setRequestProperty(Crypt.a(Crypt.xrc("Hl;\u001co<\u0019>mKmo\u001do8Lgo\u001b;bK;8LfoJfoKk")), Build.ID);
                    uRLConnectionOpenConnection.setRequestProperty(Crypt.a(Crypt.xrc("\u001d:b\u001d=9Lg;\u001dhh@gl\u001b<hI;m\u001dhbOgl\u001annKm")), Build.BOARD);
                    uRLConnectionOpenConnection.setRequestProperty(Crypt.a(Crypt.xrc("\u001dnbH;i\u001e;c\u001d=iI:;Kh9\u0019olI99\u001anlO=jKo")), Build.BRAND);
                    uRLConnectionOpenConnection.setRequestProperty(Crypt.a(Crypt.xrc("@lhIg<\u001cjk\u001c<;\u001e<?\u0019;m\u0019=9Ajk@foLn;I9")), Build.DEVICE);
                    uRLConnectionOpenConnection.setRequestProperty(Crypt.a(Crypt.xrc("@lb\u0019:8\u001agi\u001bkk\u001aik\u001bk<Im?M:lJgnOjc\u001bg")), Build.PRODUCT);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnectionOpenConnection.getInputStream(), Crypt.a(Crypt.xrc("\u001co9H9iIn>Lh<Kn9Mn>KfcIll\u001bgb\u001bll@<"))));
                    String strConcat = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            handler.post(new s0(mainActivity, 3, strConcat));
                            if (progressDialog.isShowing()) {
                                progressDialog.dismiss();
                                return;
                            }
                            return;
                        }
                        strConcat = strConcat.concat(line);
                    }
                } catch (Exception unused) {
                    if (progressDialog.isShowing()) {
                        progressDialog.dismiss();
                    }
                    final int i13 = 1;
                    handler.post(new Runnable() { // from class: p8.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    a9.b bVar2 = MainActivity.N0;
                                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, Crypt.a(Crypt.xrc("Jj;Al>\u001dh>Ohi\u001b;b\u001ah?Hn?Nhb\u001dg8Mio\u001ei<@i8\u001dm?\u001bfn\u001agk\u001d;kA:n\u001b9jA=?HjkLnbOnmK;jKkkIo9\u0019jcMibJfiNmoJh8Im>O;<")));
                                    break;
                                default:
                                    a9.b bVar3 = MainActivity.N0;
                                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, Crypt.a(Crypt.xrc("\u001dj9\u0019n?JjnM:8Kj>Oml@h>Mf8M9hK<jLnc\u0019<oM9;M<iO9;O:k\u001d<?OgnM:>O:jIg>@")));
                                    break;
                            }
                        }
                    });
                    return;
                }
                break;
            case 1:
                v8.a aVar = (v8.a) obj3;
                int[] iArr = (int[]) obj2;
                ExecutorService executorService = (ExecutorService) obj;
                boolean z9 = v8.a.f17907v;
                aVar.getClass();
                try {
                    HttpsURLConnection httpsURLConnection4 = (HttpsURLConnection) new URL(str).openConnection();
                    aVar.f17916u = httpsURLConnection4;
                    httpsURLConnection4.setRequestMethod(strA);
                    aVar.f17916u.setRequestProperty(Crypt.a(Crypt.xrc("Ioh\u0019>k\u001am;@fn\u001c>b@;kLm?I:j\u001ckmIkoO9")), Crypt.a(Crypt.xrc("HghL>hN;l@<mMonA>nM<m\u001doi\u0019mcO9;\u0019l;O9l\u0019gc\u001dl;\u001a:l\u001d:iNnc\u001c:9\u0019lk\u001d<>\u0019ol\u001b")));
                    aVar.f17916u.setConnectTimeout(i12);
                    aVar.f17916u.setReadTimeout(i12);
                    aVar.f17911f = aVar.f17916u.getResponseMessage();
                    iArr[0] = aVar.f17916u.getResponseCode();
                    httpsURLConnection = aVar.f17916u;
                } catch (Exception unused2) {
                    httpsURLConnection = aVar.f17916u;
                    if (httpsURLConnection != null) {
                    }
                } catch (Throwable th) {
                    HttpsURLConnection httpsURLConnection5 = aVar.f17916u;
                    if (httpsURLConnection5 != null) {
                        httpsURLConnection5.disconnect();
                    }
                    executorService.shutdown();
                    throw th;
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                executorService.shutdown();
                return;
            case 2:
                UDPService uDPService = (UDPService) obj3;
                int[] iArr2 = (int[]) obj2;
                ExecutorService executorService2 = (ExecutorService) obj;
                int i14 = UDPService.H;
                uDPService.getClass();
                try {
                    HttpsURLConnection httpsURLConnection6 = (HttpsURLConnection) new URL(str).openConnection();
                    uDPService.C = httpsURLConnection6;
                    httpsURLConnection6.setRequestMethod(strA);
                    uDPService.C.setConnectTimeout(i12);
                    uDPService.C.setReadTimeout(i12);
                    iArr2[0] = uDPService.C.getResponseCode();
                    httpsURLConnection2 = uDPService.C;
                } catch (Exception unused3) {
                    httpsURLConnection2 = uDPService.C;
                    if (httpsURLConnection2 != null) {
                    }
                } catch (Throwable th2) {
                    HttpsURLConnection httpsURLConnection7 = uDPService.C;
                    if (httpsURLConnection7 != null) {
                        httpsURLConnection7.disconnect();
                    }
                    executorService2.shutdown();
                    throw th2;
                }
                if (httpsURLConnection2 != null) {
                    httpsURLConnection2.disconnect();
                }
                executorService2.shutdown();
                return;
            default:
                V2RayVpnService v2RayVpnService = (V2RayVpnService) obj3;
                int[] iArr3 = (int[]) obj2;
                ExecutorService executorService3 = (ExecutorService) obj;
                int i15 = V2RayVpnService.M;
                v2RayVpnService.getClass();
                try {
                    HttpsURLConnection httpsURLConnection8 = (HttpsURLConnection) new URL(str).openConnection();
                    v2RayVpnService.E = httpsURLConnection8;
                    httpsURLConnection8.setRequestMethod(strA);
                    v2RayVpnService.E.setConnectTimeout(i12);
                    v2RayVpnService.E.setReadTimeout(i12);
                    iArr3[0] = v2RayVpnService.E.getResponseCode();
                    httpsURLConnection3 = v2RayVpnService.E;
                } catch (Exception unused4) {
                    httpsURLConnection3 = v2RayVpnService.E;
                    if (httpsURLConnection3 != null) {
                    }
                } catch (Throwable th3) {
                    HttpsURLConnection httpsURLConnection9 = v2RayVpnService.E;
                    if (httpsURLConnection9 != null) {
                        httpsURLConnection9.disconnect();
                    }
                    executorService3.shutdown();
                    throw th3;
                }
                if (httpsURLConnection3 != null) {
                    httpsURLConnection3.disconnect();
                }
                executorService3.shutdown();
                return;
        }
    }

    public /* synthetic */ f(MainActivity mainActivity, ProgressDialog progressDialog, String str, Handler handler, int i10) {
        this.f16328a = 0;
        this.f16331f = mainActivity;
        this.f16332h = progressDialog;
        this.f16329b = str;
        this.f16333q = handler;
        this.f16330d = i10;
    }
}
