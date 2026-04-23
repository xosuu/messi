package z5;

import android.view.View;
import androidx.fragment.app.s;
import b7.u;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.i2;
import com.trilead.ssh2.crypto.CryptoWishList;
import f7.b0;
import f7.z;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import t8.a0;
import t8.m;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.widgets.j;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class e implements j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20723b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20724d;

    public /* synthetic */ e(int i10, s sVar, String str) {
        this.f20722a = i10;
        this.f20724d = sVar;
        this.f20723b = str;
    }

    public final f6.b a() {
        return (f6.b) this.f20724d;
    }

    public final byte[] b() {
        if (((byte[]) this.f20723b) == null) {
            d6.b bVar = new d6.b();
            bVar.c(20);
            bVar.d(((f6.b) this.f20724d).f13118a, 16);
            bVar.f(((f6.b) this.f20724d).f13119b);
            bVar.f(((f6.b) this.f20724d).f13120c);
            bVar.f(((f6.b) this.f20724d).f13121d);
            bVar.f(((f6.b) this.f20724d).f13122e);
            bVar.f(((f6.b) this.f20724d).f13123f);
            bVar.f(((f6.b) this.f20724d).f13124g);
            bVar.f(((f6.b) this.f20724d).f13125h);
            bVar.f(((f6.b) this.f20724d).f13126i);
            bVar.f(((f6.b) this.f20724d).f13127j);
            bVar.f(((f6.b) this.f20724d).f13128k);
            bVar.b(((f6.b) this.f20724d).f13129l);
            bVar.h(((f6.b) this.f20724d).f13130m);
            this.f20723b = bVar.a();
        }
        return (byte[]) this.f20723b;
    }

    public final boolean c() {
        return ((f6.b) this.f20724d).f13129l;
    }

    @Override // j9.a
    public final void d() {
        switch (this.f20722a) {
            case 5:
                j jVar = App.f17101x;
                m mVar = (m) this.f20724d;
                View view = mVar.S;
                jVar.v0(mVar.v(R.string.u8), team.dev.epro.apkcustom.widgets.a.f17391d);
                break;
            default:
                j jVar2 = App.f17101x;
                a0 a0Var = (a0) this.f20724d;
                View view2 = a0Var.S;
                jVar2.v0(a0Var.v(R.string.u8), team.dev.epro.apkcustom.widgets.a.f17393f);
                break;
        }
    }

    public final void e() {
        if (((AtomicBoolean) this.f20723b).get()) {
            synchronized (this.f20724d) {
                try {
                    this.f20724d.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Override // j9.a
    public final void g() {
        switch (this.f20722a) {
            case 5:
                j jVar = App.f17101x;
                StringBuilder sb = new StringBuilder("ip route del ");
                String hostAddress = ((String) this.f20723b).trim().split("@")[0].split(":")[0];
                try {
                    hostAddress = InetAddress.getByName(hostAddress).getHostAddress();
                    break;
                } catch (UnknownHostException unused) {
                }
                sb.append(hostAddress);
                sb.append(" via ");
                sb.append(App.f17101x.H());
                sb.append(" dev ");
                sb.append(App.f17101x.B());
                jVar.s0(sb.toString());
                int i10 = m.P0;
                StringBuilder sb2 = new StringBuilder("[");
                g1.a.w(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), sb2, "] ip route del ");
                String hostAddress2 = ((String) this.f20723b).trim().split("@")[0].split(":")[0];
                try {
                    hostAddress2 = InetAddress.getByName(hostAddress2).getHostAddress();
                    break;
                } catch (UnknownHostException unused2) {
                }
                sb2.append(hostAddress2);
                sb2.append(" via ");
                sb2.append(App.f17101x.H());
                sb2.append(" dev ");
                sb2.append(App.f17101x.B());
                u.g("m", sb2.toString());
                break;
            default:
                App.f17101x.s0("ip route del " + ((String) this.f20723b).trim().split("@")[0].split(":")[0] + " via " + App.f17101x.H() + " dev " + App.f17101x.B());
                de.blinkt.openvpn.core.c.l("ip route del " + ((String) this.f20723b).trim().split("@")[0].split(":")[0] + " via " + App.f17101x.H() + " dev " + App.f17101x.B());
                break;
        }
    }

    public e(CryptoWishList cryptoWishList, SecureRandom secureRandom) {
        this.f20722a = 2;
        f6.b bVar = new f6.b();
        this.f20724d = bVar;
        byte[] bArr = new byte[16];
        bVar.f13118a = bArr;
        secureRandom.nextBytes(bArr);
        f6.b bVar2 = (f6.b) this.f20724d;
        bVar2.f13119b = cryptoWishList.kexAlgorithms;
        bVar2.f13120c = cryptoWishList.serverHostKeyAlgorithms;
        bVar2.f13121d = cryptoWishList.c2s_enc_algos;
        bVar2.f13122e = cryptoWishList.s2c_enc_algos;
        bVar2.f13123f = cryptoWishList.c2s_mac_algos;
        bVar2.f13124g = cryptoWishList.s2c_mac_algos;
        bVar2.f13125h = cryptoWishList.c2s_comp_algos;
        bVar2.f13126i = cryptoWishList.s2c_comp_algos;
        bVar2.f13127j = new String[0];
        bVar2.f13128k = new String[0];
        bVar2.f13129l = false;
        bVar2.f13130m = 0;
    }

    public e(int i10) {
        this.f20722a = 1;
        this.f20723b = new byte[i10];
    }

    public e() {
        this.f20722a = 7;
        this.f20723b = new AtomicBoolean(false);
        this.f20724d = new Object();
    }

    public e(b6.c cVar) {
        this.f20722a = 0;
        this.f20723b = cVar;
        b6.e eVar = new b6.e();
        eVar.f1373a = cVar;
        eVar.setName("DynamicAcceptThread");
        eVar.f1374b = new ServerSocket(1080);
        this.f20724d = eVar;
        eVar.setDaemon(true);
        ((b6.e) this.f20724d).start();
    }

    public e(byte[] bArr, int i10) throws IOException {
        this.f20722a = 2;
        this.f20724d = new f6.b();
        byte[] bArr2 = new byte[i10];
        this.f20723b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        i2 i2Var = new i2(bArr, 0, i10);
        int iB = i2Var.b();
        if (iB == 20) {
            ((f6.b) this.f20724d).f13118a = i2Var.d(16);
            ((f6.b) this.f20724d).f13119b = i2Var.f();
            ((f6.b) this.f20724d).f13120c = i2Var.f();
            ((f6.b) this.f20724d).f13121d = i2Var.f();
            ((f6.b) this.f20724d).f13122e = i2Var.f();
            ((f6.b) this.f20724d).f13123f = i2Var.f();
            ((f6.b) this.f20724d).f13124g = i2Var.f();
            ((f6.b) this.f20724d).f13125h = i2Var.f();
            ((f6.b) this.f20724d).f13126i = i2Var.f();
            ((f6.b) this.f20724d).f13127j = i2Var.f();
            ((f6.b) this.f20724d).f13128k = i2Var.f();
            ((f6.b) this.f20724d).f13129l = i2Var.a();
            ((f6.b) this.f20724d).f13130m = i2Var.i();
            if (i2Var.j() != 0) {
                throw new IOException("Padding in KexInitPacket!");
            }
            return;
        }
        throw new IOException(fb1.h("This is not a KexInitPacket! (", iB, ")"));
    }

    public e(z zVar, b0 b0Var) {
        this.f20722a = 4;
        this.f20723b = zVar;
        this.f20724d = b0Var;
    }
}
