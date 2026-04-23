package v8;

import b7.u;
import com.google.android.gms.internal.ads.fb1;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import team.dev.epro.apkcustom.App;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements HandshakeCompletedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f17919a;

    @Override // javax.net.ssl.HandshakeCompletedListener
    public final void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
        String str;
        String str2;
        String str3;
        d dVar = this.f17919a;
        dVar.getClass();
        SSLSession session = handshakeCompletedEvent.getSession();
        if (App.f17100w.f17415a.getBoolean("showLog", true)) {
            str = " (maybe server or SNI not support ssl)";
            fb1.v(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), new StringBuilder("["), "] Handshake finished", "ProxyServer");
        } else {
            str = " (maybe server or SNI not support ssl)";
        }
        try {
            dVar.f17925q.setKeepAlive(true);
            dVar.f17925q.setSoTimeout(0);
        } catch (SocketException unused) {
            if (App.f17100w.f17415a.getBoolean("showLog", true)) {
                StringBuilder sb = new StringBuilder("[");
                g1.a.w(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), sb, "] <font color=");
                sb.append(team.dev.epro.apkcustom.widgets.a.f17390c);
                sb.append(">Set timeout failed");
                u.r("ProxyServer", sb.toString());
            }
        }
        try {
            if (!App.f17100w.f17415a.getBoolean("showLog", true) || Boolean.parseBoolean(dVar.g(App.f17101x.i0())[2]) || Boolean.parseBoolean(dVar.g(App.f17101x.i0())[15])) {
                return;
            }
            try {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()));
                sb2.append("] PeerHost: ");
                sb2.append(session.getPeerHost().equals(dVar.O) ? dVar.H : session.getPeerHost());
                u.r("ProxyServer", sb2.toString());
                u.r("ProxyServer", "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] CipherSuite: " + session.getCipherSuite());
                u.r("ProxyServer", "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] Protocol: " + session.getProtocol());
                u.r("ProxyServer", "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] PeerPrincipal: " + session.getPeerPrincipal().toString());
                return;
            } catch (SSLPeerUnverifiedException e10) {
                StringBuilder sb3 = new StringBuilder("[");
                str2 = "> maybe server name indication not support";
                try {
                    sb3.append(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()));
                    sb3.append("] <font color=");
                    sb3.append(team.dev.epro.apkcustom.widgets.a.f17390c);
                    sb3.append(">");
                    sb3.append(e10.getMessage());
                    str3 = str;
                    try {
                        sb3.append(str3);
                        u.r("ProxyServer", sb3.toString());
                        return;
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    str3 = str;
                }
            } catch (Exception unused4) {
                u.r("ProxyServer", "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] <font color=" + team.dev.epro.apkcustom.widgets.a.f17390c + "> maybe server name indication not support");
                return;
            }
        } catch (Exception unused5) {
            str2 = "> maybe server name indication not support";
        }
        str3 = str;
        if (!App.f17100w.f17415a.getBoolean("showLog", true) || Boolean.parseBoolean(dVar.g(App.f17101x.i0())[2])) {
            return;
        }
        try {
            StringBuilder sb4 = new StringBuilder("[");
            sb4.append(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()));
            sb4.append("] PeerHost: ");
            sb4.append(session.getPeerHost().equals(dVar.O) ? dVar.H : session.getPeerHost());
            u.r("ProxyServer", sb4.toString());
            u.r("ProxyServer", "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] CipherSuite: " + session.getCipherSuite());
            u.r("ProxyServer", "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] Protocol: " + session.getProtocol());
            u.r("ProxyServer", "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] PeerPrincipal: " + session.getPeerPrincipal().toString());
        } catch (SSLPeerUnverifiedException e11) {
            StringBuilder sb5 = new StringBuilder("[");
            g1.a.w(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), sb5, "] <font color=");
            sb5.append(team.dev.epro.apkcustom.widgets.a.f17390c);
            sb5.append(">");
            sb5.append(e11.getMessage());
            sb5.append(str3);
            u.r("ProxyServer", sb5.toString());
        } catch (Exception unused6) {
            StringBuilder sb6 = new StringBuilder("[");
            g1.a.w(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), sb6, "] <font color=");
            sb6.append(team.dev.epro.apkcustom.widgets.a.f17390c);
            sb6.append(str2);
            u.r("ProxyServer", sb6.toString());
        }
    }
}
