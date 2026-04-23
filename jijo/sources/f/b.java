package f;

import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.ArrayAdapter;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.material.internal.NavigationMenuItemView;
import dev.epro.v2ray.util.Utils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import l.u3;
import org.jasypt.digest.StandardStringDigester;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.activities.GeneratedConfig;
import team.dev.epro.apkcustom.activities.MobileIPHunter;
import team.dev.epro.apkcustom.activities.PsiphonSettings;
import team.dev.epro.apkcustom.activities.ResponseChecker;
import team.dev.epro.apkcustom.activities.SimpleMaker;
import team.dev.epro.apkcustom.activities.V2raySettings;
import team.dev.epro.apkcustom.dialogs.TimeOut;
import team.dev.epro.apkcustom.models.VPNServer;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;
import team.dev.epro.apkcustom.sockets.socks.SocksVPNService;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;
import team.dev.epro.apkcustom.widgets.logger.LogView;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12793b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f12792a = i10;
        this.f12793b = obj;
    }

    private void c() {
        String string;
        String str;
        String str2;
        Object obj = this.f12793b;
        SimpleMaker simpleMaker = (SimpleMaker) obj;
        String strTrim = simpleMaker.N.getText().toString().trim();
        String strConcat = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        simpleMaker.f17153h0 = strTrim.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : simpleMaker.N.getText().toString();
        try {
            ((SimpleMaker) obj).f17154i0 = Integer.parseInt(((SimpleMaker) obj).O.getText().toString().trim());
        } catch (NumberFormatException unused) {
            simpleMaker.f17154i0 = 2;
        }
        simpleMaker.f17149d0 = simpleMaker.X.isChecked() ? "DELAY" : simpleMaker.K.getText().toString();
        simpleMaker.f17148c0 = simpleMaker.G.getSelectedItem().toString();
        if (simpleMaker.L.getText().toString().equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
            string = "eprodev.org";
        } else if (simpleMaker.L.getText().toString().startsWith("http")) {
            string = simpleMaker.L.getText().toString();
        } else {
            string = "http://" + simpleMaker.L.getText().toString();
        }
        simpleMaker.f17150e0 = string;
        if (simpleMaker.f17150e0.endsWith("/")) {
            simpleMaker.f17158m0 = simpleMaker.f17150e0.substring(0, simpleMaker.f17150e0.length() - 1).replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        } else {
            simpleMaker.f17158m0 = simpleMaker.f17150e0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        simpleMaker.f17151f0 = simpleMaker.M.getText().toString().equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : simpleMaker.M.getText().toString();
        if (simpleMaker.f17151f0.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
            simpleMaker.f17151f0 = simpleMaker.f17158m0;
        }
        if (simpleMaker.W.isChecked()) {
            if (!simpleMaker.P.getText().toString().trim().isEmpty()) {
                if (simpleMaker.P.getText().toString().trim().contains(";")) {
                    simpleMaker.f17148c0 = "[rotation_method=" + simpleMaker.P.getText().toString().trim().toUpperCase() + "]";
                } else {
                    simpleMaker.f17148c0 = simpleMaker.P.getText().toString().trim().toUpperCase();
                }
            }
            StringBuilder sb = new StringBuilder("[rotation=");
            sb.append(simpleMaker.f17151f0.endsWith("/") ? simpleMaker.f17151f0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).replace("/", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : simpleMaker.f17151f0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            sb.append("]");
            simpleMaker.f17150e0 = sb.toString();
            StringBuilder sb2 = new StringBuilder("[rotation=");
            sb2.append(simpleMaker.f17151f0.endsWith("/") ? simpleMaker.f17151f0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).replace("/", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : simpleMaker.f17151f0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            sb2.append("]");
            simpleMaker.f17158m0 = sb2.toString();
            StringBuilder sb3 = new StringBuilder("[rotation=");
            sb3.append(simpleMaker.f17151f0.endsWith("/") ? simpleMaker.f17151f0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).replace("/", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : simpleMaker.f17151f0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            sb3.append("]");
            simpleMaker.f17151f0 = sb3.toString();
        }
        simpleMaker.f17152g0 = simpleMaker.I.getSelectedItem().toString();
        if (simpleMaker.f17152g0.equals("Firefox")) {
            simpleMaker.f17157l0 = "User-Agent: Mozilla/5.0 (Android; Mobile; rv:35.0) Gecko/35.0 Firefox/35.0\r\n";
        } else if (simpleMaker.f17152g0.equals("Chrome")) {
            simpleMaker.f17157l0 = "User-Agent: Mozilla/5.0 (Linux; Android 4.4.2; SAMSUNG-SM-T537A Build/KOT49H) AppleWebKit/537.36 (KHTML like Gecko) Chrome/35.0.1916.141 Safari/537.36\r\n";
        } else if (simpleMaker.f17152g0.equals("Opera Mini")) {
            simpleMaker.f17157l0 = "User-Agent: Mozilla/5.0 (Linux; Android 5.1.1; Nexus 7 Build/LMY47V) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.78 Safari/537.36 OPR/30.0.1856.93524\r\n";
        } else if (simpleMaker.f17152g0.equals("Puffin")) {
            simpleMaker.f17157l0 = "User-Agent: Mozilla/5.0 (X11; U; Linux x86_64; en-gb) AppleWebKit/534.35 (KHTML, like Gecko) Chrome/11.0.696.65 Safari/534.35 Puffin/2.9174AP\r\n";
        } else if (simpleMaker.f17152g0.equals("Safari")) {
            simpleMaker.f17157l0 = "User-Agent: Mozilla/5.0 (Linux; U; Android 2.0; en-us; Droid Build/ESD20) AppleWebKit/530.17 (KHTML, like Gecko) Version/4.0 Mobile Safari/530.17\r\n";
        } else if (simpleMaker.f17152g0.equals("UCBrowser")) {
            simpleMaker.f17157l0 = "User-Agent: Mozilla/5.0 (Linux; U; Android 2.3.3; en-us ; LS670 Build/GRI40) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1/UCBrowser/8.6.1.262/145/355\r\n";
        } else if (simpleMaker.f17152g0.equals("Default")) {
            simpleMaker.f17157l0 = "User-Agent: [ua]\r\n";
        }
        if (simpleMaker.Q.isChecked()) {
            simpleMaker.f17159n0 = Crypt.a(Crypt.xrc("Klk\u001bh8\u001d=n\u0019flNol\u001clb\u0019f9I>nA:<\u00199?MmcL=j@j?\u001bh<Lko\u001cnm\u001emk\u001bik\u001ahc\u001e;kOfjJ>m\u001ekoKkl\u001e<l@<?L9n\u001coh\u001bmoJhk\u001bgmI=m@inNfk\u001dm>L>b\u001bhbAm;I>oIkmAlj\u001e9?A:"));
        }
        if (simpleMaker.R.isChecked()) {
            simpleMaker.f17160o0 = "X-Forwarded-For: " + simpleMaker.f17151f0 + "\r\n";
        }
        if (simpleMaker.S.isChecked()) {
            simpleMaker.f17161p0 = "X-Online-Host: " + simpleMaker.f17151f0 + "\r\n";
        }
        if (simpleMaker.T.isChecked()) {
            simpleMaker.f17162q0 = "X-Forward-Host: " + simpleMaker.f17151f0 + "\r\n";
        }
        if (simpleMaker.f17149d0.equals("MERGER")) {
            if (simpleMaker.H.getSelectedItemId() == 2) {
                if (simpleMaker.U.isChecked()) {
                    StringBuilder sb4 = new StringBuilder("[netData]");
                    sb4.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "\\r\n".concat(SimpleMaker.j0(simpleMaker)));
                    sb4.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                    sb4.append(simpleMaker.f17148c0);
                    sb4.append(" ");
                    sb4.append(simpleMaker.f17150e0);
                    sb4.append(" HTTP/1.1\\r\nHost: ");
                    sb4.append(simpleMaker.f17158m0);
                    sb4.append("\\r\n");
                    sb4.append(simpleMaker.f17159n0);
                    sb4.append(simpleMaker.f17160o0);
                    sb4.append(simpleMaker.f17161p0);
                    sb4.append(simpleMaker.f17162q0);
                    sb4.append(simpleMaker.f17157l0);
                    sb4.append("\\r\n");
                    simpleMaker.f17155j0 = sb4.toString();
                } else {
                    StringBuilder sb5 = new StringBuilder("CONNECT [host_port] [protocol]");
                    sb5.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "\\r\n".concat(SimpleMaker.j0(simpleMaker)));
                    sb5.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                    sb5.append(simpleMaker.f17148c0);
                    sb5.append(" ");
                    sb5.append(simpleMaker.f17150e0);
                    sb5.append(" HTTP/1.1\\r\nHost: ");
                    sb5.append(simpleMaker.f17158m0);
                    sb5.append("\\r\n");
                    sb5.append(simpleMaker.f17159n0);
                    sb5.append(simpleMaker.f17160o0);
                    sb5.append(simpleMaker.f17161p0);
                    sb5.append(simpleMaker.f17162q0);
                    sb5.append(simpleMaker.f17157l0);
                    sb5.append("\\r\n");
                    simpleMaker.f17155j0 = sb5.toString();
                }
            } else if (simpleMaker.H.getSelectedItemId() == 1) {
                if (simpleMaker.U.isChecked()) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(simpleMaker.f17148c0);
                    sb6.append(" ");
                    sb6.append(simpleMaker.f17150e0);
                    sb6.append(" HTTP/1.1\\r\nHost: ");
                    sb6.append(simpleMaker.f17158m0);
                    sb6.append("\\r\n");
                    sb6.append(simpleMaker.f17159n0);
                    sb6.append(simpleMaker.f17160o0);
                    sb6.append(simpleMaker.f17161p0);
                    sb6.append(simpleMaker.f17162q0);
                    sb6.append(simpleMaker.f17157l0);
                    sb6.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0 - 1));
                    sb6.append("[netData]\\r\n");
                    if (SimpleMaker.j0(simpleMaker).isEmpty()) {
                        str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else {
                        str2 = "\\r\n" + SimpleMaker.j0(simpleMaker) + "\\r\n";
                    }
                    sb6.append(str2);
                    sb6.append("\\r\n");
                    simpleMaker.f17155j0 = sb6.toString();
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(simpleMaker.f17148c0);
                    sb7.append(" ");
                    sb7.append(simpleMaker.f17150e0);
                    sb7.append(" HTTP/1.1\\r\nHost: ");
                    sb7.append(simpleMaker.f17158m0);
                    sb7.append("\\r\n");
                    sb7.append(simpleMaker.f17159n0);
                    sb7.append(simpleMaker.f17160o0);
                    sb7.append(simpleMaker.f17161p0);
                    sb7.append(simpleMaker.f17162q0);
                    sb7.append(simpleMaker.f17157l0);
                    sb7.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0 - 1));
                    sb7.append("CONNECT [host_port] [protocol]\\r\n");
                    if (SimpleMaker.j0(simpleMaker).isEmpty()) {
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else {
                        str = "\\r\n" + SimpleMaker.j0(simpleMaker) + "\\r\n";
                    }
                    sb7.append(str);
                    sb7.append("\\r\n");
                    simpleMaker.f17155j0 = sb7.toString();
                }
            } else if (simpleMaker.H.getSelectedItemId() == 3) {
                if (simpleMaker.U.isChecked()) {
                    StringBuilder sb8 = new StringBuilder("[");
                    sb8.append(simpleMaker.f17150e0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                    sb8.append("@netData]");
                    sb8.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "\\r\n".concat(SimpleMaker.j0(simpleMaker)));
                    sb8.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                    sb8.append(simpleMaker.f17148c0);
                    sb8.append(" ");
                    sb8.append(simpleMaker.f17150e0);
                    sb8.append(" HTTP/1.1\\r\nHost: ");
                    sb8.append(simpleMaker.f17158m0);
                    sb8.append("\\r\n");
                    sb8.append(simpleMaker.f17159n0);
                    sb8.append(simpleMaker.f17160o0);
                    sb8.append(simpleMaker.f17161p0);
                    sb8.append(simpleMaker.f17162q0);
                    sb8.append(simpleMaker.f17157l0);
                    sb8.append("\\r\n");
                    simpleMaker.f17155j0 = sb8.toString();
                } else {
                    StringBuilder sb9 = new StringBuilder("CONNECT ");
                    sb9.append(simpleMaker.f17150e0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                    sb9.append("@[host_port] [protocol]");
                    sb9.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "\\r\n".concat(SimpleMaker.j0(simpleMaker)));
                    sb9.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                    sb9.append(simpleMaker.f17148c0);
                    sb9.append(" ");
                    sb9.append(simpleMaker.f17150e0);
                    sb9.append(" HTTP/1.1\\r\nHost: ");
                    sb9.append(simpleMaker.f17158m0);
                    sb9.append("\\r\n");
                    sb9.append(simpleMaker.f17159n0);
                    sb9.append(simpleMaker.f17160o0);
                    sb9.append(simpleMaker.f17161p0);
                    sb9.append(simpleMaker.f17162q0);
                    sb9.append(simpleMaker.f17157l0);
                    sb9.append("\\r\n");
                    simpleMaker.f17155j0 = sb9.toString();
                }
            } else if (simpleMaker.H.getSelectedItemId() == 4) {
                if (simpleMaker.U.isChecked()) {
                    StringBuilder sb10 = new StringBuilder("[netData@");
                    sb10.append(simpleMaker.f17150e0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                    sb10.append("]");
                    sb10.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "\\r\n".concat(SimpleMaker.j0(simpleMaker)));
                    sb10.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                    sb10.append(simpleMaker.f17148c0);
                    sb10.append(" ");
                    sb10.append(simpleMaker.f17150e0);
                    sb10.append(" HTTP/1.1\\r\nHost: ");
                    sb10.append(simpleMaker.f17158m0);
                    sb10.append("\\r\n");
                    sb10.append(simpleMaker.f17159n0);
                    sb10.append(simpleMaker.f17160o0);
                    sb10.append(simpleMaker.f17161p0);
                    sb10.append(simpleMaker.f17162q0);
                    sb10.append(simpleMaker.f17157l0);
                    sb10.append("\\r\n");
                    simpleMaker.f17155j0 = sb10.toString();
                } else {
                    StringBuilder sb11 = new StringBuilder("CONNECT [host_port]@");
                    sb11.append(simpleMaker.f17150e0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                    sb11.append(" [protocol]");
                    sb11.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "\\r\n".concat(SimpleMaker.j0(simpleMaker)));
                    sb11.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                    sb11.append(simpleMaker.f17148c0);
                    sb11.append(" ");
                    sb11.append(simpleMaker.f17150e0);
                    sb11.append(" HTTP/1.1\\r\nHost: ");
                    sb11.append(simpleMaker.f17158m0);
                    sb11.append("\\r\n");
                    sb11.append(simpleMaker.f17159n0);
                    sb11.append(simpleMaker.f17160o0);
                    sb11.append(simpleMaker.f17161p0);
                    sb11.append(simpleMaker.f17162q0);
                    sb11.append(simpleMaker.f17157l0);
                    sb11.append("\\r\n");
                    simpleMaker.f17155j0 = sb11.toString();
                }
            } else if (simpleMaker.H.getSelectedItemId() == 0) {
                simpleMaker.f17149d0 = "MERGER";
                if (simpleMaker.U.isChecked()) {
                    StringBuilder sb12 = new StringBuilder("[netData]\\r\n");
                    sb12.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : SimpleMaker.j0(simpleMaker).concat("\\r\n"));
                    sb12.append("Host: ");
                    sb12.append(simpleMaker.f17158m0);
                    sb12.append("\\r\n");
                    sb12.append(simpleMaker.f17159n0);
                    sb12.append(simpleMaker.f17160o0);
                    sb12.append(simpleMaker.f17161p0);
                    sb12.append(simpleMaker.f17162q0);
                    sb12.append(simpleMaker.f17157l0);
                    sb12.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0 - 1));
                    simpleMaker.f17155j0 = sb12.toString();
                } else {
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(simpleMaker.f17148c0);
                    sb13.append(" [host_port] [protocol]\\r\n");
                    sb13.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : SimpleMaker.j0(simpleMaker).concat("\\r\n"));
                    sb13.append("Host: ");
                    sb13.append(simpleMaker.f17158m0);
                    sb13.append("\\r\n");
                    sb13.append(simpleMaker.f17159n0);
                    sb13.append(simpleMaker.f17160o0);
                    sb13.append(simpleMaker.f17161p0);
                    sb13.append(simpleMaker.f17162q0);
                    sb13.append(simpleMaker.f17157l0);
                    sb13.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0 - 1));
                    simpleMaker.f17155j0 = sb13.toString();
                }
            } else if (simpleMaker.H.getSelectedItemId() == 5) {
                if (simpleMaker.U.isChecked()) {
                    StringBuilder sb14 = new StringBuilder("[netData]\\r\n");
                    sb14.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : SimpleMaker.j0(simpleMaker).concat("\\r\n"));
                    sb14.append("Host: ");
                    sb14.append(simpleMaker.f17158m0);
                    sb14.append("\\r\nUpgrade: websocket\\r\n");
                    sb14.append(simpleMaker.f17159n0);
                    sb14.append(simpleMaker.f17160o0);
                    sb14.append(simpleMaker.f17161p0);
                    sb14.append(simpleMaker.f17162q0);
                    sb14.append(simpleMaker.f17157l0);
                    sb14.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0 - 1));
                    simpleMaker.f17155j0 = sb14.toString();
                } else {
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append(simpleMaker.f17148c0);
                    sb15.append(" / [protocol]\\r\n");
                    sb15.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : SimpleMaker.j0(simpleMaker).concat("\\r\n"));
                    sb15.append("Host: ");
                    sb15.append(simpleMaker.f17158m0);
                    sb15.append("\\r\nUpgrade: websocket\\r\n");
                    sb15.append(simpleMaker.f17159n0);
                    sb15.append(simpleMaker.f17160o0);
                    sb15.append(simpleMaker.f17161p0);
                    sb15.append(simpleMaker.f17162q0);
                    sb15.append(simpleMaker.f17157l0);
                    sb15.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0 - 1));
                    simpleMaker.f17155j0 = sb15.toString();
                }
            }
            simpleMaker.f17156k0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else if (simpleMaker.H.getSelectedItemId() == 2) {
            if (simpleMaker.U.isChecked()) {
                StringBuilder sb16 = new StringBuilder("[netData]");
                sb16.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "\\r\n".concat(SimpleMaker.j0(simpleMaker)));
                sb16.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                simpleMaker.f17155j0 = sb16.toString();
            } else {
                StringBuilder sb17 = new StringBuilder("CONNECT [host_port] [protocol]");
                sb17.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "\\r\n".concat(SimpleMaker.j0(simpleMaker)));
                sb17.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                simpleMaker.f17155j0 = sb17.toString();
            }
            simpleMaker.f17156k0 = simpleMaker.f17148c0 + " " + simpleMaker.f17150e0 + " HTTP/1.1\\r\nHost: " + simpleMaker.f17158m0 + "\\r\n" + simpleMaker.f17159n0 + simpleMaker.f17160o0 + simpleMaker.f17161p0 + simpleMaker.f17162q0 + simpleMaker.f17157l0 + "\\r\n";
        } else if (simpleMaker.H.getSelectedItemId() == 1) {
            if (simpleMaker.U.isChecked()) {
                StringBuilder sb18 = new StringBuilder("[netData]\\r\n");
                sb18.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : SimpleMaker.j0(simpleMaker).concat("\\r\n"));
                sb18.append("\\r\n");
                simpleMaker.f17156k0 = sb18.toString();
            } else {
                StringBuilder sb19 = new StringBuilder("CONNECT [host_port] [protocol]\\r\n");
                sb19.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : SimpleMaker.j0(simpleMaker).concat("\\r\n"));
                sb19.append("\\r\n");
                simpleMaker.f17156k0 = sb19.toString();
            }
            simpleMaker.f17155j0 = simpleMaker.f17148c0 + " " + simpleMaker.f17150e0 + " HTTP/1.1\\r\nHost: " + simpleMaker.f17158m0 + "\\r\n" + simpleMaker.f17159n0 + simpleMaker.f17160o0 + simpleMaker.f17161p0 + simpleMaker.f17162q0 + simpleMaker.f17157l0 + SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0 - 1);
        } else if (simpleMaker.H.getSelectedItemId() == 3) {
            if (simpleMaker.U.isChecked()) {
                StringBuilder sb20 = new StringBuilder("[");
                sb20.append(simpleMaker.f17150e0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                sb20.append("@netData]");
                sb20.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "\\r\n".concat(SimpleMaker.j0(simpleMaker)));
                sb20.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                simpleMaker.f17155j0 = sb20.toString();
            } else {
                StringBuilder sb21 = new StringBuilder("CONNECT ");
                sb21.append(simpleMaker.f17150e0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                sb21.append("@[host_port] [protocol]");
                sb21.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "\\r\n".concat(SimpleMaker.j0(simpleMaker)));
                sb21.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                simpleMaker.f17155j0 = sb21.toString();
            }
            simpleMaker.f17156k0 = simpleMaker.f17148c0 + " " + simpleMaker.f17150e0 + " HTTP/1.1\\r\nHost: " + simpleMaker.f17158m0 + "\\r\n" + simpleMaker.f17159n0 + simpleMaker.f17160o0 + simpleMaker.f17161p0 + simpleMaker.f17162q0 + simpleMaker.f17157l0 + "\\r\n";
        } else if (simpleMaker.H.getSelectedItemId() == 4) {
            if (simpleMaker.U.isChecked()) {
                StringBuilder sb22 = new StringBuilder("[netData@");
                sb22.append(simpleMaker.f17150e0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                sb22.append("]\\r\n");
                sb22.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : SimpleMaker.j0(simpleMaker).concat("\\r\n"));
                sb22.append("\\r\n");
                simpleMaker.f17156k0 = sb22.toString();
            } else {
                StringBuilder sb23 = new StringBuilder("CONNECT [host_port]@");
                sb23.append(simpleMaker.f17150e0.replace("http://", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                sb23.append(" [protocol]\\r\n");
                sb23.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : SimpleMaker.j0(simpleMaker).concat("\\r\n"));
                sb23.append("\\r\n");
                simpleMaker.f17156k0 = sb23.toString();
            }
            simpleMaker.f17155j0 = simpleMaker.f17148c0 + " " + simpleMaker.f17150e0 + " HTTP/1.1\\r\nHost: " + simpleMaker.f17158m0 + "\\r\n" + simpleMaker.f17159n0 + simpleMaker.f17160o0 + simpleMaker.f17161p0 + simpleMaker.f17162q0 + simpleMaker.f17157l0 + SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0 - 1);
        } else if (simpleMaker.H.getSelectedItemId() == 0) {
            simpleMaker.f17149d0 = "MERGER";
            if (simpleMaker.U.isChecked()) {
                StringBuilder sb24 = new StringBuilder("[netData]\\r\n");
                sb24.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : SimpleMaker.j0(simpleMaker).concat("\\r\n"));
                sb24.append("Host: ");
                sb24.append(simpleMaker.f17158m0);
                sb24.append("\\r\n");
                sb24.append(simpleMaker.f17159n0);
                sb24.append(simpleMaker.f17160o0);
                sb24.append(simpleMaker.f17161p0);
                sb24.append(simpleMaker.f17162q0);
                sb24.append(simpleMaker.f17157l0);
                sb24.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0 - 1));
                simpleMaker.f17155j0 = sb24.toString();
            } else {
                StringBuilder sb25 = new StringBuilder();
                sb25.append(simpleMaker.f17148c0);
                sb25.append(" [host_port] [protocol]\\r\n");
                sb25.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : SimpleMaker.j0(simpleMaker).concat("\\r\n"));
                sb25.append("Host: ");
                sb25.append(simpleMaker.f17158m0);
                sb25.append("\\r\n");
                sb25.append(simpleMaker.f17159n0);
                sb25.append(simpleMaker.f17160o0);
                sb25.append(simpleMaker.f17161p0);
                sb25.append(simpleMaker.f17162q0);
                sb25.append(simpleMaker.f17157l0);
                sb25.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0 - 1));
                simpleMaker.f17155j0 = sb25.toString();
            }
            simpleMaker.f17156k0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else if (simpleMaker.H.getSelectedItemId() == 5) {
            if (simpleMaker.U.isChecked()) {
                StringBuilder sb26 = new StringBuilder("[netData]\\r\n");
                sb26.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : SimpleMaker.j0(simpleMaker).concat("\\r\n"));
                sb26.append("Host: ");
                sb26.append(simpleMaker.f17158m0);
                sb26.append("\\r\nUpgrade: websocket\\r\n");
                sb26.append(simpleMaker.f17159n0);
                sb26.append(simpleMaker.f17160o0);
                sb26.append(simpleMaker.f17161p0);
                sb26.append(simpleMaker.f17162q0);
                sb26.append(simpleMaker.f17157l0);
                sb26.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0 - 1));
                simpleMaker.f17155j0 = sb26.toString();
            } else {
                StringBuilder sb27 = new StringBuilder();
                sb27.append(simpleMaker.f17148c0);
                sb27.append(" / [protocol]\\r\n");
                sb27.append(SimpleMaker.j0(simpleMaker).isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : SimpleMaker.j0(simpleMaker).concat("\\r\n"));
                sb27.append("Host: ");
                sb27.append(simpleMaker.f17158m0);
                sb27.append("\\r\nUpgrade: websocket\\r\n");
                sb27.append(simpleMaker.f17159n0);
                sb27.append(simpleMaker.f17160o0);
                sb27.append(simpleMaker.f17161p0);
                sb27.append(simpleMaker.f17162q0);
                sb27.append(simpleMaker.f17157l0);
                sb27.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0 - 1));
                simpleMaker.f17155j0 = sb27.toString();
            }
            simpleMaker.f17156k0 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (simpleMaker.V.isChecked()) {
            if (simpleMaker.f17156k0.isEmpty()) {
                if (simpleMaker.U.isChecked()) {
                    StringBuilder sb28 = new StringBuilder("[netData]");
                    if (!SimpleMaker.j0(simpleMaker).isEmpty()) {
                        strConcat = "\\r\n".concat(SimpleMaker.j0(simpleMaker));
                    }
                    sb28.append(strConcat);
                    sb28.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                    simpleMaker.f17155j0 += ((Object) sb28.toString());
                } else {
                    StringBuilder sb29 = new StringBuilder();
                    sb29.append(simpleMaker.f17148c0);
                    sb29.append(" [host_port] [protocol]");
                    if (!SimpleMaker.j0(simpleMaker).isEmpty()) {
                        strConcat = "\\r\n".concat(SimpleMaker.j0(simpleMaker));
                    }
                    sb29.append(strConcat);
                    sb29.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                    simpleMaker.f17155j0 += ((Object) sb29.toString());
                }
            } else if (simpleMaker.U.isChecked()) {
                StringBuilder sb30 = new StringBuilder("[netData]");
                if (!SimpleMaker.j0(simpleMaker).isEmpty()) {
                    strConcat = "\\r\n".concat(SimpleMaker.j0(simpleMaker));
                }
                sb30.append(strConcat);
                sb30.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                simpleMaker.f17156k0 += ((Object) sb30.toString());
            } else {
                StringBuilder sb31 = new StringBuilder();
                sb31.append(simpleMaker.f17148c0);
                sb31.append(" [host_port] [protocol]");
                if (!SimpleMaker.j0(simpleMaker).isEmpty()) {
                    strConcat = "\\r\n".concat(SimpleMaker.j0(simpleMaker));
                }
                sb31.append(strConcat);
                sb31.append(SimpleMaker.k0(simpleMaker, simpleMaker.f17154i0));
                simpleMaker.f17156k0 += ((Object) sb31.toString());
            }
        }
        String str3 = simpleMaker.f17149d0;
        simpleMaker.getClass();
        SimpleMaker.s0("mergerSplit", str3);
        String strReplace = simpleMaker.f17155j0.replace("\r", "\\r");
        simpleMaker.getClass();
        SimpleMaker.s0("data1", strReplace);
        String strReplace2 = simpleMaker.f17156k0.replace("\r", "\\r");
        simpleMaker.getClass();
        SimpleMaker.s0("data2", strReplace2);
        String str4 = simpleMaker.f17153h0;
        simpleMaker.getClass();
        SimpleMaker.s0("proxyGenerator", str4);
        SimpleMaker.o0(simpleMaker);
        simpleMaker.finish();
    }

    public final /* synthetic */ void a() {
        int i10 = this.f12792a;
        Object obj = this.f12793b;
        switch (i10) {
            case 9:
                MobileIPHunter mobileIPHunter = (MobileIPHunter) obj;
                mobileIPHunter.H.setEnabled(true);
                mobileIPHunter.H.setText("Search");
                break;
            case 10:
            default:
                int i11 = t8.a0.Z0;
                ((t8.a0) obj).s0();
                break;
            case 11:
                try {
                    ((ResponseChecker) obj).V.close();
                } catch (IOException unused) {
                    return;
                }
                break;
        }
    }

    public final /* synthetic */ void b() {
        int i10 = this.f12792a;
        Object obj = this.f12793b;
        switch (i10) {
            case 9:
                int i11 = MobileIPHunter.P;
                ((MobileIPHunter) obj).v("Waiting for service...\n");
                break;
            case 10:
            default:
                int i12 = t8.a0.Z0;
                ((t8.a0) obj).s0();
                break;
            case 11:
                ((ResponseChecker) obj).H.setText("Start");
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Exception {
        Message message;
        Message message2;
        Message message3;
        HttpsURLConnection httpsURLConnection;
        final int i10 = 0;
        final int i11 = 1;
        switch (this.f12792a) {
            case 0:
                p8.p pVar = (p8.p) this.f12793b;
                if (pVar.f16353e) {
                    DrawerLayout drawerLayout = pVar.f16350b;
                    int iH = drawerLayout.h(8388611);
                    View viewE = drawerLayout.e(8388611);
                    if (viewE != null && DrawerLayout.p(viewE) && iH != 2) {
                        drawerLayout.c();
                        return;
                    }
                    if (iH != 1) {
                        View viewE2 = drawerLayout.e(8388611);
                        if (viewE2 == null) {
                            throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.k(8388611));
                        }
                        drawerLayout.q(viewE2);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m mVar = (m) this.f12793b;
                Message messageObtain = (view != mVar.f12927k || (message3 = mVar.f12929m) == null) ? (view != mVar.f12931o || (message2 = mVar.f12933q) == null) ? (view != mVar.f12935s || (message = mVar.f12937u) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                mVar.K.obtainMessage(1, mVar.f12918b).sendToTarget();
                return;
            case 2:
                u3 u3Var = ((Toolbar) this.f12793b).f346b0;
                k.r rVar = u3Var == null ? null : u3Var.f15027b;
                if (rVar != null) {
                    rVar.collapseActionView();
                    return;
                }
                return;
            case 3:
                FloatingActionButton floatingActionButton = (FloatingActionButton) this.f12793b;
                View.OnClickListener onClickListener = floatingActionButton.B;
                if (onClickListener != null) {
                    onClickListener.onClick(floatingActionButton);
                    return;
                }
                return;
            case 4:
                FloatingActionMenu floatingActionMenu = (FloatingActionMenu) this.f12793b;
                boolean z9 = floatingActionMenu.f1816a0;
                boolean z10 = floatingActionMenu.f1845v;
                if (z10) {
                    floatingActionMenu.a(z9);
                    return;
                }
                if (z10) {
                    return;
                }
                if (floatingActionMenu.f1837q0 != 0) {
                    floatingActionMenu.f1834o0.start();
                }
                if (floatingActionMenu.f1827h0) {
                    AnimatorSet animatorSet = floatingActionMenu.f1820d;
                    if (animatorSet != null) {
                        animatorSet.start();
                    } else {
                        floatingActionMenu.f1817b.cancel();
                        floatingActionMenu.f1815a.start();
                    }
                }
                floatingActionMenu.f1846w = true;
                int childCount = floatingActionMenu.getChildCount() - 1;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    Handler handler = floatingActionMenu.f1847x;
                    if (childCount < 0) {
                        handler.postDelayed(new g3.g(floatingActionMenu, i10), (i12 + 1) * floatingActionMenu.U);
                        return;
                    }
                    View childAt = floatingActionMenu.getChildAt(childCount);
                    if ((childAt instanceof FloatingActionButton) && childAt.getVisibility() != 8) {
                        i12++;
                        handler.postDelayed(new g3.f(floatingActionMenu, (FloatingActionButton) childAt, z9, i10), i13);
                        i13 += floatingActionMenu.U;
                    }
                    childCount--;
                }
                break;
            case 5:
                zzm zzmVar = (zzm) this.f12793b;
                zzmVar.H = 2;
                zzmVar.f2071a.finish();
                return;
            case 6:
                com.google.android.material.datepicker.l lVar = (com.google.android.material.datepicker.l) this.f12793b;
                int i14 = lVar.f11883l0;
                if (i14 == 2) {
                    lVar.b0(1);
                    return;
                } else {
                    if (i14 == 1) {
                        lVar.b0(2);
                        return;
                    }
                    return;
                }
            case 7:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                x4.q qVar = (x4.q) this.f12793b;
                x4.i iVar = qVar.f18442h;
                if (iVar != null) {
                    iVar.f18431h = true;
                }
                k.r itemData = navigationMenuItemView.getItemData();
                boolean zQ = qVar.f18440d.q(itemData, qVar, 0);
                if (itemData != null && itemData.isCheckable() && zQ) {
                    qVar.f18442h.i(itemData);
                } else {
                    i11 = 0;
                }
                x4.i iVar2 = qVar.f18442h;
                if (iVar2 != null) {
                    iVar2.f18431h = false;
                }
                if (i11 != 0) {
                    qVar.h();
                    return;
                }
                return;
            case 8:
                int id = view.getId();
                Object obj = this.f12793b;
                if (id != R.id.iv) {
                    if (id != R.id.iz) {
                        return;
                    }
                    GeneratedConfig generatedConfig = (GeneratedConfig) obj;
                    generatedConfig.J.a(true);
                    if (generatedConfig.H.getText().toString().isEmpty()) {
                        GeneratedConfig.w(team.dev.epro.apkcustom.widgets.a.f17391d, generatedConfig.getString(R.string.h9));
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.TEXT", generatedConfig.H.getText().toString());
                    intent.putExtra("android.intent.extra.SUBJECT", generatedConfig.getString(R.string.hw));
                    intent.setType("text/plain");
                    generatedConfig.startActivity(Intent.createChooser(intent, generatedConfig.getString(R.string.hv)));
                    return;
                }
                GeneratedConfig generatedConfig2 = (GeneratedConfig) obj;
                generatedConfig2.J.a(true);
                if (generatedConfig2.H.getText().toString().isEmpty()) {
                    GeneratedConfig.w(team.dev.epro.apkcustom.widgets.a.f17391d, generatedConfig2.getString(R.string.h8));
                    return;
                }
                try {
                    ((GeneratedConfig) obj).v(((GeneratedConfig) obj).H.getText().toString());
                    if (Build.VERSION.SDK_INT < 30) {
                        GeneratedConfig generatedConfig3 = (GeneratedConfig) obj;
                        String str = String.format(((GeneratedConfig) obj).getString(R.string.xs), ((GeneratedConfig) obj).N);
                        int i15 = team.dev.epro.apkcustom.widgets.a.f17393f;
                        generatedConfig3.getClass();
                        GeneratedConfig.w(i15, str);
                        return;
                    }
                    return;
                } catch (IOException unused) {
                    GeneratedConfig.w(team.dev.epro.apkcustom.widgets.a.f17391d, generatedConfig2.getString(R.string.h8));
                    return;
                }
            case 9:
                if (TextUtils.isEmpty(((MobileIPHunter) this.f12793b).G.getText())) {
                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, "IP target is empty");
                    return;
                }
                int i16 = Build.VERSION.SDK_INT;
                if (!App.f17101x.a0()) {
                    if (i16 < 23) {
                        App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, "Ups sorry for lollipop above, requirement root access");
                        return;
                    }
                    ComponentName componentNameA = team.dev.epro.apkcustom.widgets.e.a((MobileIPHunter) this.f12793b);
                    if (!(componentNameA != null ? componentNameA.getPackageName() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(((MobileIPHunter) this.f12793b).getPackageName())) {
                        Intent intent2 = new Intent("android.settings.VOICE_INPUT_SETTINGS");
                        intent2.addFlags(268435456);
                        ((MobileIPHunter) this.f12793b).startActivity(intent2);
                        return;
                    }
                }
                if (App.f17101x.Y(App.f17099v, SSHTunnelService.class) || de.blinkt.openvpn.core.c.e() || App.f17101x.Y(App.f17099v, V2RayVpnService.class) || App.f17101x.Y(App.f17099v, PsiphonVPNService.class)) {
                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, "You need disconnected before do it");
                    return;
                }
                if (((MobileIPHunter) this.f12793b).H.getText().toString().equalsIgnoreCase("searching...")) {
                    ((MobileIPHunter) this.f12793b).K = true;
                    ((MobileIPHunter) this.f12793b).H.setText("Stopping...");
                    ((MobileIPHunter) this.f12793b).H.setEnabled(false);
                    return;
                }
                if (!App.f17101x.W((MobileIPHunter) this.f12793b)) {
                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, "Only work when you use mobile data connection");
                    return;
                }
                Editable text = ((MobileIPHunter) this.f12793b).G.getText();
                String[] strArrSplit = new String[0];
                if (text != null) {
                    strArrSplit = text.toString().split(";", -1);
                }
                ((MobileIPHunter) this.f12793b).L.clear();
                for (String str2 : strArrSplit) {
                    if (!str2.isEmpty()) {
                        ((MobileIPHunter) this.f12793b).L.add(str2);
                    }
                }
                ((MobileIPHunter) this.f12793b).H.setText("Searching...");
                ((MobileIPHunter) this.f12793b).K = false;
                ((MobileIPHunter) this.f12793b).J = false;
                Handler handler2 = new Handler(((MobileIPHunter) this.f12793b).getMainLooper());
                ((MobileIPHunter) this.f12793b).M = Executors.newSingleThreadExecutor();
                ((MobileIPHunter) this.f12793b).M.execute(new s0(this, 4, handler2));
                return;
            case 10:
                SharedPreferences.Editor editorEdit = App.f17100w.f17415a.edit();
                PsiphonSettings psiphonSettings = (PsiphonSettings) this.f12793b;
                editorEdit.putString("Authorizations", psiphonSettings.H.getText().toString().trim()).apply();
                App.f17100w.f17415a.edit().putString("TargetServerEntry", psiphonSettings.I.getText().toString().trim()).apply();
                App.f17100w.f17415a.edit().putString("proto_psi", psiphonSettings.K.f17416a.getSelectedItem().toString()).apply();
                App.f17100w.f17415a.edit().putString("protocol", (String) psiphonSettings.M.get(psiphonSettings.K.f17416a.getSelectedItem().toString())).apply();
                App.f17100w.f17415a.edit().putString("region", psiphonSettings.J.f17416a.getSelectedItem().toString()).apply();
                psiphonSettings.finish();
                return;
            case 11:
                ResponseChecker responseChecker = (ResponseChecker) this.f12793b;
                Editable text2 = responseChecker.I.getText();
                Objects.requireNonNull(text2);
                if (text2.toString().isEmpty()) {
                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, "Host is empty");
                    return;
                }
                if (!App.f17101x.W(App.f17099v) && !App.f17101x.e0()) {
                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, "You aren't connect to internet");
                    return;
                }
                if (responseChecker.H.getText().toString().equalsIgnoreCase("loading...")) {
                    responseChecker.H.setText("Start");
                    if (responseChecker.V != null) {
                        new Thread(new q8.l(this, 0)).start();
                    }
                    HttpsURLConnection httpsURLConnection2 = responseChecker.W;
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                        httpsURLConnection = null;
                        responseChecker.W = null;
                    } else {
                        httpsURLConnection = null;
                    }
                    HttpsURLConnection httpsURLConnection3 = responseChecker.Y;
                    if (httpsURLConnection3 != null) {
                        httpsURLConnection3.disconnect();
                        responseChecker.Y = httpsURLConnection;
                    }
                    HttpURLConnection httpURLConnection = responseChecker.U;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        responseChecker.U = httpsURLConnection;
                    }
                    ExecutorService executorService = responseChecker.R;
                    if (executorService != null) {
                        executorService.shutdownNow();
                    }
                    HttpURLConnection httpURLConnection2 = responseChecker.f17144c0;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                        responseChecker.f17144c0 = null;
                    }
                    responseChecker.y();
                    return;
                }
                responseChecker.P.clear();
                responseChecker.O.clear();
                responseChecker.S.clear();
                responseChecker.S.notifyDataSetChanged();
                Editable text3 = responseChecker.I.getText();
                String[] strArrSplit2 = new String[0];
                if (text3 != null) {
                    strArrSplit2 = text3.toString().split(";|\\n|\\s+", -1);
                }
                for (String str3 : strArrSplit2) {
                    if (!str3.isEmpty()) {
                        responseChecker.P.add(str3);
                    }
                }
                if (responseChecker.L.isChecked()) {
                    responseChecker.Q.clear();
                    Editable text4 = responseChecker.J.getText();
                    String[] strArrSplit3 = new String[0];
                    if (text4 != null) {
                        strArrSplit3 = text4.toString().split(";|\\n|\\s+", -1);
                    }
                    int length = strArrSplit3.length;
                    while (i10 < length) {
                        String str4 = strArrSplit3[i10];
                        if (!str4.isEmpty()) {
                            responseChecker.Q.add(str4);
                        }
                        i10++;
                    }
                }
                responseChecker.H.setText("Loading...");
                Handler handler3 = new Handler(responseChecker.getMainLooper());
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                responseChecker.R = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new s0(this, 7, handler3));
                return;
            case 12:
                c();
                return;
            case 13:
                int id2 = view.getId();
                Object obj2 = this.f12793b;
                if (id2 == R.id.iv) {
                    V2raySettings v2raySettings = (V2raySettings) obj2;
                    v2raySettings.I.a(true);
                    if (v2raySettings.H.getText().toString().isEmpty()) {
                        App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, "Export to clipboard failed");
                        return;
                    } else if (Utils.share2Clipboard(v2raySettings, v2raySettings.H.getText().toString()) == 0) {
                        App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17393f, "Export to clipboard success");
                        return;
                    } else {
                        App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, "Export to clipboard failed");
                        return;
                    }
                }
                if (id2 != R.id.iz) {
                    return;
                }
                V2raySettings v2raySettings2 = (V2raySettings) obj2;
                v2raySettings2.I.a(true);
                if (v2raySettings2.H.getText().toString().isEmpty()) {
                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, v2raySettings2.getString(R.string.h9));
                    return;
                }
                String strShareConfig_ = Utils.shareConfig_(v2raySettings2.H.getText().toString());
                Intent intent3 = new Intent("android.intent.action.SEND");
                intent3.putExtra("android.intent.extra.TEXT", strShareConfig_);
                intent3.putExtra("android.intent.extra.SUBJECT", "V2ray Config");
                intent3.setType("text/plain");
                v2raySettings2.startActivity(Intent.createChooser(intent3, "Share"));
                return;
            case 14:
                if (de.blinkt.openvpn.core.c.e()) {
                    team.dev.epro.apkcustom.widgets.j jVar = App.f17101x;
                    View view2 = ((r8.g) this.f12793b).f16570s;
                    jVar.v0("Please disconnect VPN before do it!!!", team.dev.epro.apkcustom.widgets.a.f17391d);
                    return;
                }
                if (SSHTunnelService.Y || SSHTunnelService.W || SSHTunnelService.X) {
                    team.dev.epro.apkcustom.widgets.j jVar2 = App.f17101x;
                    View view3 = ((r8.g) this.f12793b).f16570s;
                    jVar2.v0("Please disconnect SSH before do it!!!", team.dev.epro.apkcustom.widgets.a.f17391d);
                    return;
                }
                r8.h hVar = (r8.h) view.getTag();
                RecyclerView recyclerView = hVar.f15462r;
                int iF = recyclerView == null ? -1 : recyclerView.F(hVar);
                r8.g gVar = (r8.g) this.f12793b;
                t8.a0 a0Var = gVar.f16569q;
                VPNServer vPNServer = (VPNServer) gVar.f16568h.get(iF);
                if (a0Var.c() == null) {
                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, "Activity not ready, " + App.f17099v.getString(R.string.h_));
                    return;
                }
                try {
                    byte[] bArrDecode = Base64.decode(vPNServer.b(), 0);
                    App.f17100w.f17415a.edit().putString("cfgVPN", new String(bArrDecode, StandardStringDigester.MESSAGE_CHARSET)).commit();
                    boolean zJ0 = a0Var.j0(bArrDecode);
                    a0Var.O0 = zJ0;
                    if (zJ0) {
                        App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17393f, a0Var.r().getString(R.string.vh, vPNServer.c()));
                    }
                    break;
                } catch (IOException unused2) {
                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, a0Var.v(R.string.h_));
                }
                a0Var.q0();
                a0Var.f17032p0.setVisibility(8);
                fb1.s(App.f17100w.f17415a, "isFreeVPNSelected", true);
                return;
            case 15:
                SharedPreferences.Editor editorEdit2 = App.f17100w.f17415a.edit();
                TimeOut timeOut = (TimeOut) this.f12793b;
                editorEdit2.putInt("setTimeout", timeOut.G.getText().toString().trim().isEmpty() ? 10 : Integer.parseInt(timeOut.G.getText().toString().trim())).apply();
                timeOut.finish();
                return;
            case 16:
                t8.c cVar = (t8.c) this.f12793b;
                LogView logView = cVar.f17045i0;
                ArrayAdapter arrayAdapter = logView.f17451b;
                arrayAdapter.clear();
                logView.getAdapter();
                arrayAdapter.notifyDataSetChanged();
                t8.b bVar = cVar.f17044h0;
                if (bVar != null) {
                    ((MainActivity) bVar).G(cVar.f17045i0);
                    return;
                }
                return;
            case 17:
                team.dev.epro.apkcustom.widgets.j jVar3 = App.f17101x;
                t8.m mVar2 = (t8.m) this.f12793b;
                if (jVar3.Y(mVar2.c(), SocksVPNService.class)) {
                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, "Direct proxy is running, please stop first!!!");
                    return;
                }
                if (Build.VERSION.SDK_INT < 33) {
                    if (mVar2.f17075u0.isChecked()) {
                        mVar2.p0();
                        return;
                    }
                    if (mVar2.f17076v0.isChecked()) {
                        mVar2.r0();
                        return;
                    } else if (mVar2.f17077w0.isChecked()) {
                        mVar2.q0();
                        return;
                    } else {
                        mVar2.o0();
                        return;
                    }
                }
                if (d0.f.a(mVar2.S(), "android.permission.POST_NOTIFICATIONS") != 0) {
                    mVar2.K0.a("android.permission.POST_NOTIFICATIONS");
                    return;
                }
                if (mVar2.f17075u0.isChecked()) {
                    mVar2.p0();
                    return;
                }
                if (mVar2.f17076v0.isChecked()) {
                    mVar2.r0();
                    return;
                } else if (mVar2.f17077w0.isChecked()) {
                    mVar2.q0();
                    return;
                } else {
                    mVar2.o0();
                    return;
                }
            default:
                team.dev.epro.apkcustom.widgets.j jVar4 = App.f17101x;
                t8.a0 a0Var2 = (t8.a0) this.f12793b;
                if (jVar4.Y(a0Var2.c(), SocksVPNService.class)) {
                    App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, "Direct proxy is running, please stop first!!!");
                    return;
                }
                if (Build.VERSION.SDK_INT < 33) {
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: t8.y

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f.b f17098b;

                        static {
                            NativeUtil.classesInit0(162);
                        }

                        {
                            this.f17098b = this;
                        }

                        @Override // java.lang.Runnable
                        public final native void run();
                    });
                    return;
                } else if (d0.f.a(a0Var2.S(), "android.permission.POST_NOTIFICATIONS") == 0) {
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: t8.y

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f.b f17098b;

                        static {
                            NativeUtil.classesInit0(162);
                        }

                        {
                            this.f17098b = this;
                        }

                        @Override // java.lang.Runnable
                        public final native void run();
                    });
                    return;
                } else {
                    a0Var2.U0.a("android.permission.POST_NOTIFICATIONS");
                    return;
                }
        }
    }
}
