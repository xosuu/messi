package a9;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.Locale;
import java.util.Vector;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.widgets.e;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Socket f62a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Socket f63b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f64d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InputStream f65f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public OutputStream f66h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public OutputStream f67q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f68s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f69t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f70u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f71v;

    public final synchronized void a() {
        try {
            try {
                Socket socket = this.f62a;
                if (socket != null && socket.isConnected()) {
                    this.f62a.close();
                }
                this.f62a = null;
            } catch (Throwable th) {
                throw th;
            }
        } catch (Exception unused) {
        }
        try {
            Socket socket2 = this.f63b;
            if (socket2 != null && socket2.isConnected()) {
                this.f63b.close();
            }
            this.f63b = null;
        } catch (Exception unused2) {
        }
        b.f72h.remove(this);
    }

    public final void b(int i10, String str) {
        b.a(Crypt.a(Crypt.xrc("ImkM99Nf>\u001bo9\u001ch?Om9\u001dg>Oi?\u001b<j\u001a<m@f")) + str + Crypt.a(Crypt.xrc("\u0019nm\u001em9Lj>\u001a>lNl9@gjJ:c\u001eh>\u001a<iK9?\u0019m")) + i10);
        Socket socket = new Socket(str, i10);
        this.f63b = socket;
        this.f65f = socket.getInputStream();
        this.f67q = this.f63b.getOutputStream();
    }

    public final void c(String str, String str2) throws InterruptedException, IOException {
        String[] strArrSplit = str2.split(" ");
        if (strArrSplit.length != 3) {
            f(505, Crypt.a(Crypt.xrc("J;j\u001b<9\u0019:o@<;\u001ef;\u001efm\u001bh>Ji?\u001ehi@jc\u001e=n@lo\u001e:i@fcKmh\u001e9hJio\u001b:j\u001e:n@g;\u001diiO")));
            return;
        }
        b(Integer.valueOf(strArrSplit[1].substring(strArrSplit[1].indexOf(58) + 1)).intValue(), str);
        this.f66h.write(Crypt.a(Crypt.xrc("\u001cf<AlbAj9O:i\u001akiAkoJ<>IhoLm;\u001ak8Kkb@oc\u00199bNnm@=>\u001dfj\u001998MolN;>MilOocO")).getBytes());
        this.f66h.flush();
        z8.b bVar = new z8.b(this, this.f65f, this.f66h, true);
        z8.b bVar2 = new z8.b(this, this.f64d, this.f67q, false);
        bVar.start();
        bVar2.start();
        bVar.join();
        bVar2.join();
        this.f68s = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x010d A[Catch: Exception -> 0x00e9, IOException -> 0x00eb, UnknownHostException -> 0x00ee, TryCatch #2 {UnknownHostException -> 0x00ee, IOException -> 0x00eb, Exception -> 0x00e9, blocks: (B:16:0x00cd, B:18:0x00e2, B:32:0x0105, B:34:0x010d, B:35:0x011f, B:37:0x012f, B:39:0x0135, B:41:0x013b, B:43:0x0151, B:44:0x0154, B:26:0x00f1, B:28:0x00f7, B:29:0x00fe), top: B:50:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f A[Catch: Exception -> 0x00e9, IOException -> 0x00eb, UnknownHostException -> 0x00ee, TryCatch #2 {UnknownHostException -> 0x00ee, IOException -> 0x00eb, Exception -> 0x00e9, blocks: (B:16:0x00cd, B:18:0x00e2, B:32:0x0105, B:34:0x010d, B:35:0x011f, B:37:0x012f, B:39:0x0135, B:41:0x013b, B:43:0x0151, B:44:0x0154, B:26:0x00f1, B:28:0x00f7, B:29:0x00fe), top: B:50:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135 A[Catch: Exception -> 0x00e9, IOException -> 0x00eb, UnknownHostException -> 0x00ee, TryCatch #2 {UnknownHostException -> 0x00ee, IOException -> 0x00eb, Exception -> 0x00e9, blocks: (B:16:0x00cd, B:18:0x00e2, B:32:0x0105, B:34:0x010d, B:35:0x011f, B:37:0x012f, B:39:0x0135, B:41:0x013b, B:43:0x0151, B:44:0x0154, B:26:0x00f1, B:28:0x00f7, B:29:0x00fe), top: B:50:0x00cd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.a.d(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x019e, code lost:
    
        r5 = r5 + ((long) r8.length());
        r9 = r8.indexOf(xyz.easypro.ecrypt.utils.Crypt.a(xyz.easypro.ecrypt.utils.Crypt.xrc("LmiOo8\u001bjhJljKhi\u001dlh\u001dgnImm\u001blcJnlJ:")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b3, code lost:
    
        if (r9 != (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b5, code lost:
    
        r9 = r8.length() - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ba, code lost:
    
        r9 = java.lang.Integer.valueOf(r8.substring(0, r9), r2).intValue();
        r22.f66h.write(r8.getBytes());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cf, code lost:
    
        if (r9 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d1, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d3, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d4, code lost:
    
        r9 = r9 + 2;
        r5 = r5 + ((long) r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d8, code lost:
    
        if (r9 <= 4096) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01da, code lost:
    
        r10 = androidx.core.app.NotificationCompat.FLAG_BUBBLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01dd, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01de, code lost:
    
        r11 = new byte[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e0, code lost:
    
        if (r9 == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e2, code lost:
    
        r12 = r22.f65f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e4, code lost:
    
        if (r9 > 4096) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e6, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e8, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e9, code lost:
    
        r2 = r12.read(r11, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ee, code lost:
    
        if (r2 == (-1)) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f0, code lost:
    
        if (r2 <= 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f2, code lost:
    
        r9 = r9 - r2;
        r22.f66h.write(r11, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0200, code lost:
    
        throw new java.lang.Exception(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0201, code lost:
    
        r22.f66h.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0206, code lost:
    
        if (r8 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0208, code lost:
    
        r11 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.a.e(java.lang.String):void");
    }

    public final void f(int i10, String str) throws IOException {
        b.a(Crypt.a(Crypt.xrc("Ak;\u001b=m\u001bj8Hk8OohHho@:mK9k\u001agiOfh\u001b9")) + i10 + " " + str);
        String str2 = Crypt.a(Crypt.xrc("\u001embMno\u001conIhm\u001bol\u0019h<K=?\u001ejb\u001a;<@gh\u001a>")) + i10 + " " + str + Crypt.a(Crypt.xrc("No<\u0019knO;?L;nHmhH<lMoi@gc\u001d=>N:9\u001co"));
        this.f66h.write((Crypt.a(Crypt.xrc("Ajk\u0019;c\u001bf>\u001d;j\u0019;kHo8H:kImhNl8NfkM:")) + i10 + " " + str + Crypt.a(Crypt.xrc("Kf>\u0019g;Jf9\u0019f9@hnMkjH<hAi;K9?JnbIi?Im?\u0019mh\u0019;cNokJ>;J9k\u001anhHl;A<;Lgm\u001d")) + str2.length() + Crypt.a(Crypt.xrc("Nk9KhhNokNlj@j9@98\u001bn;H<c\u001alo\u001cj;\u001ek"))).getBytes());
        this.f66h.write(str2.getBytes());
        this.f66h.flush();
    }

    public final void g(String[] strArr) throws Exception {
        int i10;
        long jIntValue = -1;
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (strArr[i11].regionMatches(true, 0, Crypt.a(Crypt.xrc("JibNimNmkHfkOj8I<j@<iM;;Lg<I;oOihI>l\u001ei<Hmk\u001amb\u001c:hJo?M;jJfb\u0019lo@jbM")), 0, 16)) {
                String str = strArr[i11];
                jIntValue = Integer.valueOf(str.substring(16, str.length())).intValue();
                b.a(Crypt.a(Crypt.xrc("LlkM9k\u001ak?Kgb\u0019gmJ;9@:>I;oHk<\u001bf?J<nKii\u001bfhK:b\u0019fcMokKo?Lmj\u001dmh\u001e;b\u001ali\u001b")) + e.c(jIntValue, new Locale(Crypt.a(Crypt.xrc("\u001eg9\u001eohJhbI9?I9;Hn;\u0019g<Ji?K<b@i?J>")))));
            }
        }
        if (jIntValue == -1) {
            throw new Exception(Crypt.a(Crypt.xrc("MocH=?Ao8\u001bji\u001a9?\u001a9?\u001b>?\u001c=<I;?@hmL<mLmbL9m@:8H>;\u001e>oNn>Mj>Hhj\u001amiLoi\u0019")));
        }
        byte[] bArr = new byte[NotificationCompat.FLAG_BUBBLE];
        int i12 = 0;
        while (i12 < jIntValue && (i10 = this.f64d.read(bArr)) > 0) {
            i12 += i10;
            this.f67q.write(bArr, 0, i10);
            this.f67q.flush();
        }
    }

    public final void h(String[] strArr) throws IOException {
        String strY = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        int i10 = 0;
        while (true) {
            int length = strArr.length;
            String strA = Crypt.a(Crypt.xrc("JnbKfn@mlN9hI9n\u001bgiOkiJ9nKhn\u0019:?Kf"));
            if (i10 >= length) {
                this.f67q.write(g1.a.y(strY, strA).getBytes());
                this.f67q.flush();
                return;
            }
            if (i10 == 0) {
                String str = strArr[i10];
                String[] strArrSplit = str.split(" ");
                if (strArrSplit.length == 3) {
                    String str2 = strArrSplit[1];
                    if (str2.startsWith(Crypt.a(Crypt.xrc("Am;Om>@gm\u001bj;Kim\u001b:8\u001dhn\u001bn;\u001bjiI9bIk"))) || str2.startsWith(Crypt.a(Crypt.xrc("\u001cim\u001b=hL<k\u0019:o@j?\u001b>bJk;\u001djk\u001bk;NfhLi")))) {
                        str = strArrSplit[0] + " " + new URL(str2).getFile() + " " + strArrSplit[2];
                    }
                }
                strArr[i10] = str;
            }
            StringBuilder sbS = g1.a.s(strY);
            sbS.append(strArr[i10]);
            strY = g1.a.y(sbS.toString(), strA);
            i10++;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String strA;
        String str;
        Exception e10;
        Vector vector = b.f72h;
        vector.add(this);
        System.currentTimeMillis();
        this.f62a.getPort();
        this.f69t = this.f62a.getInetAddress().getHostAddress();
        String strA2 = Crypt.a(Crypt.xrc("Lo<Jn;LjmK=bNhlJnk\u001a>8Lm?I;j\u001ag<Af"));
        StringBuilder sb = new StringBuilder(strA2);
        sb.append(team.dev.epro.apkcustom.widgets.a.f17392e);
        String strA3 = Crypt.a(Crypt.xrc("OohKf;@><\u001ahoMl8\u001c<b\u001a>nJlkNl<Jk;\u0019j"));
        sb.append(strA3);
        sb.append(App.f17099v.getString(R.string.bl));
        sb.append(Crypt.a(Crypt.xrc("M9mMliIil\u001e<i\u001c:m\u001efl\u0019io\u001a:8\u001bocK:oA>")));
        int i10 = this.f71v;
        if (i10 == 1) {
            strA = Crypt.a(Crypt.xrc("\u001d;j\u001e;m\u001c=bMjkHolJnmLibL<oMh8IocOn"));
        } else {
            strA = Crypt.a(Crypt.xrc("AgjI;<@fl@jc\u001em8\u001aioHj?K>9\u001dml\u001amnAg")) + i10;
        }
        sb.append(strA);
        String strA4 = Crypt.a(Crypt.xrc("H<k\u001dfhIokHjjLgm@jb\u001b:9OhmLfhJ;lLnlK<iOm9\u001bl?\u001e;h\u001a>nIg9N9;Lkj@:b\u0019:9@"));
        sb.append(strA4);
        sb.append(vector.size());
        String strA5 = Crypt.a(Crypt.xrc("Jn9O><MhcK<h\u001cm8Ahi\u001elm\u001e:jMnc\u001bkk@f"));
        sb.append(strA5);
        sb.append(this.f69t);
        b.a(sb.toString());
        try {
            this.f64d = this.f62a.getInputStream();
            this.f66h = this.f62a.getOutputStream();
            do {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                do {
                    try {
                        int i11 = this.f64d.read();
                        if (i11 == -1) {
                            throw new Exception(Crypt.a(Crypt.xrc("Hk>L9?\u0019fj\u001cj8K>oLlnKho\u001anc\u0019o?Hg;\u0019:")));
                        }
                        str = str + ((char) i11);
                    } catch (Exception e11) {
                        e10 = e11;
                        if (str.length() > 0) {
                            b.b(e10);
                        }
                    }
                } while (!str.endsWith(Crypt.a(Crypt.xrc("Nk9KhhNokNlj@j9@98\u001bn;H<c\u001alo\u001cj;\u001ek"))));
                System.currentTimeMillis();
                Vector vector2 = b.f72h;
                d(str);
            } while (!this.f68s);
            interrupt();
            this.f62a.close();
        } catch (Exception e12) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            e10 = e12;
        }
        b.a(strA2 + team.dev.epro.apkcustom.widgets.a.f17392e + strA3 + App.f17099v.getString(R.string.bl) + Crypt.a(Crypt.xrc("L9;M<cHo?Ak8Nh?\u001b:8L;bLhm\u0019:iH>oAf?AgmOfl\u001ekjO9lN>>LmiI9i\u001ehn\u0019o;Lin\u001c")) + i10 + strA4 + b.f72h.size() + strA5 + this.f69t);
        a();
    }
}
