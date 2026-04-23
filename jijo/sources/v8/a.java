package v8;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import b7.u;
import com.google.android.gms.internal.ads.fb1;
import com.tencent.mmkv.MMKV;
import f.s0;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;
import team.dev.epro.apkcustom.sockets.udp.UDPService;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;
import team.dev.epro.apkcustom.widgets.assist.AssistDroid;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static volatile boolean f17907v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f17908a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17910d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17911f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17913q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17914s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f17915t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public HttpsURLConnection f17916u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17909b = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z5.e f17912h = new z5.e();

    public a(Context context) {
        this.f17915t = context;
    }

    public static void c(Context context, boolean z9) {
        boolean z10;
        boolean zA0 = App.f17101x.a0();
        String strA = Crypt.a(Crypt.xrc("\u0019=?Ank\u001d=o\u001bnhAmn\u001a;hJobJ>cKncAfhJ="));
        String strA2 = Crypt.a(Crypt.xrc("L;;\u0019k;L<iNh;Jg>\u001bjm\u001d>8\u001enmLkh@g;@<"));
        String strA3 = Crypt.a(Crypt.xrc("H>>HgiL=oN9n\u001an9\u001998L<9\u001c;>\u001cmc\u001a>mJn"));
        if (zA0) {
            if (z9) {
                fb1.v(new SimpleDateFormat(strA, Locale.getDefault()), new StringBuilder(strA2), Crypt.a(Crypt.xrc("M9<Lo9L;iH:iIfi\u0019h<@9?\u001df>\u001c<8I>oJo8H=?\u0019>oA;;JgmL>i\u001dkcLk9Mho\u001aj?\u0019ib\u0019")), strA3);
                z10 = true;
            } else {
                fb1.v(new SimpleDateFormat(strA, Locale.getDefault()), new StringBuilder(strA2), Crypt.a(Crypt.xrc("Jm>An;Af8\u001ag;Ioh@=k\u001e:bMglMf9\u001c=oInmH9bNh9@hcHfl\u001bfm\u001d>cHf8K<cK<hA98J")), strA3);
                z10 = false;
            }
            App.f17101x.r0(Crypt.a(Crypt.xrc("Km;\u001ef;\u0019;cAm?\u001agc\u001bf<\u001dglA9;OkhMfc\u001aib\u001ch;J;bAhm@m?Ok?I:cNfn\u001b=;Ah>\u0019;?Oo8\u001c>j@i;K=?OijI:nJflM<;\u001eoo\u001c<k\u001dhl")) + (z9 ? 1 : 0) + Crypt.a(Crypt.xrc("NibM>kOioLgh\u001e>bI:oH<iAh<@:nO;>\u001bfhJ:jI;jL:o\u001b:>\u001c99K;l\u001cfjAo8\u001ehiA:i\u001don\u0019i?\u001ao;MocH:bMmi\u001dl>\u001c;nM>iA9h\u001bgo\u001e>kO:mNk?\u001b9kAhbO=<\u001d9i\u0019f;On8Af;LikKobHgkAo8Lo?Ikm\u0019:<\u001a<i\u001embKoh\u001b=;K")) + z10);
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            fb1.v(new SimpleDateFormat(strA, Locale.getDefault()), new StringBuilder(strA2), Crypt.a(Crypt.xrc("\u0019>mH=kNf8\u001c=b\u001c;8HkmA=iNk9@<kKm9IgbNmlK<b\u0019k9Amo\u001c>hI9m\u001amh\u001a;9@no@f9L")), strA3);
            return;
        }
        if (z9) {
            fb1.v(new SimpleDateFormat(strA, Locale.getDefault()), new StringBuilder(strA2), Crypt.a(Crypt.xrc("M9<Lo9L;iH:iIfi\u0019h<@9?\u001df>\u001c<8I>oJo?\u001bm<O:h@n8Hfn\u001eih\u001akn\u001c=nK;>@>oOocK")), strA3);
        } else {
            fb1.v(new SimpleDateFormat(strA, Locale.getDefault()), new StringBuilder(strA2), Crypt.a(Crypt.xrc("Jm>An;Af8\u001ag;Ioh@=k\u001e:bMglMf9\u001c=oIniO=;\u001c;>Jkb\u001d;oO=c\u001bh;\u001eilKlhKf8H=k\u001a")), strA3);
        }
        Intent intent = new Intent(Crypt.a(Crypt.xrc("MikJh?Hi;\u0019=kLgjHhi\u001d9k\u001elnIoc\u001a>jNg8\u001a;8@gh@jc\u0019k9\u001b>bKo>\u001alm\u001d=jK:j\u001akh\u0019>cIohH99@o8Hj>\u001con@mb\u0019o>\u001a=?LgiO>k")));
        intent.putExtra(Crypt.a(Crypt.xrc("\u0019;o\u001dhjMfjAl>\u001dg<Hln@g8L:b\u001d=oMg9Ag")), Crypt.a(Crypt.xrc("KncLjk@o;L<nJmnA99Il<\u001b>jNn9A=bLf?NjmJh9Knj\u001dl;Ll<LkcM;nH9iOibM9?\u001c>h\u001c>jHn;LihKmkMojKkcN;9\u001b=9Mi;J;>")));
        intent.putExtra(Crypt.a(Crypt.xrc("A=nL<hIi9Iim\u001em>Io?J9;N<;@k<I>oI;<Hnl\u001en8In>Kgl@hoO<8KibIlcO9?\u001ehhA")), z9);
        context.sendBroadcast(intent);
    }

    public final int a(Context context) {
        String string = App.f17100w.f17415a.getString(Crypt.a(Crypt.xrc("\u001ckbLlc\u001c:jAfi\u001ejl\u001aln@nl\u001eil\u001e=nJ;iM=")), Crypt.a(Crypt.xrc("Im<LjiMf9\u001bkcH<hL=;\u0019=l\u0019kjMo?L;9@i")));
        if (!string.startsWith(Crypt.a(Crypt.xrc("Hj8L=j@mi\u001a<l@9nL=kHicA=>@;iKm;@n")))) {
            string = Crypt.a(Crypt.xrc("\u001c<<\u001bicLg<\u001bl?@g?@j;\u0019fjKgj\u001amh\u001c;n@h")).concat(string);
        }
        String str = string;
        int i10 = App.f17100w.f17415a.getInt(Crypt.a(Crypt.xrc("KfiNjoKm<H:cO>mOmk\u0019ohO9lHhmAgl\u0019o")), 10) * 1000;
        int[] iArr = {-1};
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(Crypt.a(Crypt.xrc("N9n\u001a;?N9o@ojL=<O>kNo8\u001ejjMkl\u001cokNk")))).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new p8.f(this, str, i10, iArr, executorServiceNewSingleThreadExecutor, 1));
            do {
                long j10 = i10;
                if (System.currentTimeMillis() - jCurrentTimeMillis <= j10) {
                    if (System.currentTimeMillis() - jCurrentTimeMillis >= j10) {
                        break;
                    }
                }
            } while (iArr[0] == -1);
            HttpsURLConnection httpsURLConnection = this.f17916u;
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            return iArr[0];
        }
        return iArr[0];
    }

    public final void b() {
        z5.e eVar = this.f17912h;
        if (eVar != null) {
            ((AtomicBoolean) eVar.f20723b).set(false);
            synchronized (eVar.f20724d) {
                eVar.f20724d.notify();
            }
        }
    }

    public final void d() {
        this.f17914s = false;
        f17907v = true;
        this.f17913q = true;
        this.f17908a = true;
        start();
    }

    public final void e() {
        this.f17912h = null;
        this.f17908a = false;
        if (isAlive()) {
            interrupt();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j10;
        while (this.f17908a) {
            z5.e eVar = this.f17912h;
            if (eVar != null) {
                eVar.e();
            }
            boolean zA0 = App.f17101x.a0();
            String strA = Crypt.a(Crypt.xrc("\u0019=?Ank\u001d=o\u001bnhAmn\u001a;hJobJ>cKncAfhJ="));
            String strA2 = Crypt.a(Crypt.xrc("L;;\u0019k;L<iNh;Jg>\u001bjm\u001d>8\u001enmLkh@g;@<"));
            String strA3 = Crypt.a(Crypt.xrc("H>>HgiL=oN9n\u001an9\u001998L<9\u001c;>\u001cmc\u001a>mJn"));
            if (!zA0 && Build.VERSION.SDK_INT >= 23 && !App.f17100w.f17415a.getBoolean(Crypt.a(Crypt.xrc("Iin@nmIm<Kfn\u0019;n\u001ehoAm<\u0019nn\u001e=l\u001cncH<")), false)) {
                while (true) {
                    if (App.f17101x.Y(this.f17915t, AssistDroid.class)) {
                        break;
                    }
                    fb1.v(new SimpleDateFormat(strA, Locale.getDefault()), new StringBuilder(strA2), Crypt.a(Crypt.xrc("Am<\u001djoLj>\u001bfj\u0019<8\u0019ihN<lOij@ohJlk\u001dk9\u001egi\u001df<\u001e9lIn?KokOlhA:j\u0019=<AliJ>mI")), strA3);
                    this.f17915t.startService(new Intent(this.f17915t, (Class<?>) AssistDroid.class));
                    try {
                        Thread.sleep(1000L);
                        if (!this.f17908a) {
                            interrupt();
                            break;
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
            MMKV mmkv = App.f17100w.f17415a;
            String strA4 = Crypt.a(Crypt.xrc("O>jLk9\u0019i;\u001eioO<h\u001a>bJocK:8Ko9\u001b>;\u001b9"));
            boolean z9 = mmkv.getBoolean(strA4, false);
            String strA5 = Crypt.a(Crypt.xrc("O=<\u001ehl\u001c;l\u001b9oIfbMibOf;Kg<\u001em<Agb\u0019g"));
            if ((z9 || App.f17100w.f17415a.getBoolean(strA5, false)) && this.f17909b >= 2) {
                this.f17909b = 0;
                this.f17914s = true;
                f17907v = false;
                if (!team.dev.epro.apkcustom.widgets.e.d(this.f17915t)) {
                    fb1.v(new SimpleDateFormat(strA, Locale.getDefault()), new StringBuilder(strA2), Crypt.a(Crypt.xrc("\u0019fi\u001af8@;cL9?I<b\u0019;i\u001b:c\u001do9OohMgmN<")), strA3);
                    c(this.f17915t, true);
                    while (true) {
                        if (team.dev.epro.apkcustom.widgets.e.d(this.f17915t)) {
                            break;
                        }
                        try {
                            Thread.sleep(1000L);
                            fb1.v(new SimpleDateFormat(strA, Locale.getDefault()), new StringBuilder(strA2), Crypt.a(Crypt.xrc("\u0019<iIjh\u001bll\u0019h<Iko\u001b9oIl>\u001cg>\u001dmn\u001cjiJgk\u001bglKnnAh;Ii8\u001a=bH<;K><Mij\u001dh8Kj;N")), strA3);
                            if (!team.dev.epro.apkcustom.widgets.e.d(this.f17915t)) {
                                c(this.f17915t, true);
                                Thread.sleep(1000L);
                            }
                            if (!this.f17908a) {
                                interrupt();
                                break;
                            }
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
                while (team.dev.epro.apkcustom.widgets.e.d(this.f17915t)) {
                    c(this.f17915t, false);
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException unused3) {
                    }
                }
                fb1.v(new SimpleDateFormat(strA, Locale.getDefault()), new StringBuilder(strA2), Crypt.a(Crypt.xrc("I9kK<>Ig8\u001bohK9<K>iO98Nh?KniL;jO;>\u00199i\u001egmMj<\u001b<<NlmI>;\u001d=;IjkAkiM:>M")), strA3);
                if (!App.f17100w.f17415a.getBoolean(strA5, false)) {
                    while (true) {
                        if (f17907v) {
                            break;
                        }
                        try {
                            Thread.sleep(1000L);
                            if (!this.f17908a) {
                                interrupt();
                                break;
                            }
                        } catch (InterruptedException unused4) {
                        }
                    }
                }
            }
            if (App.f17101x.W(this.f17915t) || App.f17101x.e0()) {
                if (this.f17913q) {
                    Thread.sleep(5000L);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f17910d = a(this.f17915t);
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                MMKV mmkv2 = App.f17100w.f17415a;
                String strA6 = Crypt.a(Crypt.xrc("\u001ckbLlc\u001c:jAfi\u001ejl\u001aln@nl\u001eil\u001e=nJ;iM="));
                String strA7 = Crypt.a(Crypt.xrc("Im<LjiMf9\u001bkcH<hL=;\u0019=l\u0019kjMo?L;9@i"));
                if (mmkv2.getString(strA6, strA7).equals(strA7) && jElapsedRealtime2 > 800) {
                    jElapsedRealtime2 %= 100;
                }
                j10 = jElapsedRealtime2;
                if ((App.f17100w.f17415a.getBoolean(strA4, false) || App.f17100w.f17415a.getBoolean(strA5, false)) && this.f17914s) {
                    if (this.f17910d != -1) {
                        this.f17914s = false;
                    } else {
                        if (App.f17100w.f17415a.getBoolean(strA5, false)) {
                            Thread.sleep(1000L);
                            if (f17907v) {
                                this.f17909b = 0;
                                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                executorServiceNewSingleThreadExecutor.execute(new s0(this, 13, executorServiceNewSingleThreadExecutor));
                                z5.e eVar2 = this.f17912h;
                                if (eVar2 != null) {
                                    ((AtomicBoolean) eVar2.f20723b).set(true);
                                }
                            }
                        }
                        int i10 = this.f17909b + 1;
                        this.f17909b = i10;
                        if (i10 >= (App.f17100w.f17415a.getBoolean(strA5, false) ? 3 : 2)) {
                            fb1.v(new SimpleDateFormat(strA, Locale.getDefault()), new StringBuilder(strA2), Crypt.a(Crypt.xrc("Aih\u001d:;Nmo\u0019;c\u001b=8I9?Oo9I;bNn<Agi\u001dfcH:>\u001e98@=;Km9A;n\u001ahoM>l\u001dfiA=8A:hH")), strA3);
                            Thread.sleep(1000L);
                        }
                    }
                }
            } else {
                j10 = 0;
            }
            if (!this.f17908a) {
                interrupt();
                return;
            }
            if (App.f17101x.W(this.f17915t) || App.f17101x.e0()) {
                if (this.f17910d != -1) {
                    boolean z10 = App.f17100w.f17415a.getBoolean(strA5, false);
                    String strA8 = Crypt.a(Crypt.xrc("\u0019o?L9m\u001cmjL;;\u001emh\u001bihJg8LlmN;h\u0019oiKi"));
                    String strA9 = Crypt.a(Crypt.xrc("OohKf;@><\u001ahoMl8\u001c<b\u001a>nJlkNl<Jk;\u0019j"));
                    String strA10 = Crypt.a(Crypt.xrc("LhlJ:9N9<Jj9Lgi@nkIi9JgbKl<\u001bj?A:"));
                    String strA11 = Crypt.a(Crypt.xrc("\u001di?N;c\u001bjn\u001ef?Oni\u001eokO:iOj<\u001aolM9cNh"));
                    if (!z10) {
                        StringBuilder sb = new StringBuilder(strA2);
                        g1.a.w(new SimpleDateFormat(strA, Locale.getDefault()), sb, strA11);
                        sb.append(this.f17910d);
                        sb.append(" ");
                        sb.append(this.f17911f);
                        sb.append(strA10);
                        sb.append(j10 > 550 ? team.dev.epro.apkcustom.widgets.a.f17390c : team.dev.epro.apkcustom.widgets.a.f17389b);
                        sb.append(strA9);
                        sb.append(j10);
                        sb.append(strA8);
                        u.r(strA3, sb.toString());
                    } else if (f17907v) {
                        StringBuilder sb2 = new StringBuilder(strA2);
                        g1.a.w(new SimpleDateFormat(strA, Locale.getDefault()), sb2, strA11);
                        sb2.append(this.f17910d);
                        sb2.append(" ");
                        sb2.append(this.f17911f);
                        sb2.append(strA10);
                        sb2.append(j10 > 550 ? team.dev.epro.apkcustom.widgets.a.f17390c : team.dev.epro.apkcustom.widgets.a.f17389b);
                        sb2.append(strA9);
                        sb2.append(j10);
                        sb2.append(strA8);
                        u.r(strA3, sb2.toString());
                    }
                } else {
                    fb1.v(new SimpleDateFormat(strA, Locale.getDefault()), new StringBuilder(strA2), Crypt.a(Crypt.xrc("AmkN;i\u001af?Lnh@=bKn;M=b\u001ano\u001ehj\u0019<j\u001cn")), strA3);
                    this.f17909b++;
                }
                if (!App.f17101x.Y(this.f17915t, SSHTunnelService.class) && !de.blinkt.openvpn.core.c.e() && !App.f17101x.Y(this.f17915t, PsiphonVPNService.class) && !App.f17101x.Y(this.f17915t, UDPService.class) && !App.f17101x.Y(this.f17915t, V2RayVpnService.class)) {
                    this.f17908a = false;
                }
            }
            this.f17913q = false;
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused5) {
                return;
            }
        }
        interrupt();
    }
}
