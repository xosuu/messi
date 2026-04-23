package de.blinkt.openvpn.core;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import de.blinkt.openvpn.core.TrafficHistory;
import j6.f0;
import j6.g0;
import j6.h0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Vector;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f12578e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f12579f = "NOPROCESS";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f12580g = 2131886968;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Intent f12581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f12582i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static TrafficHistory f12584k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f12583j = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f12585l = {-58, -42, -44, -106, 90, -88, -87, -88, -52, -124, 84, 117, 66, 79, -112, -111, -46, 86, -37, 109};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte[] f12586m = {-99, -69, 45, 71, 114, -116, 82, 66, -99, -122, 50, -70, -56, -111, 98, -35, -65, 105, 82, 43};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f12587n = {-116, -115, -118, -89, -116, -112, 120, 55, 79, -8, -119, -23, 106, -114, -85, -56, -4, 105, 26, -57};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f12588o = {-92, 111, -42, -46, 123, -96, -60, 79, -27, -31, 49, 103, 11, -54, -68, -27, 17, 2, 121, 104};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static ConnectionStatus f12589p = ConnectionStatus.f12534q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedList f12574a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Vector f12575b = new Vector();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Vector f12576c = new Vector();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Vector f12577d = new Vector();

    static {
        TrafficHistory trafficHistory = new TrafficHistory();
        trafficHistory.f12564a = new LinkedList();
        trafficHistory.f12565b = new LinkedList();
        trafficHistory.f12566d = new LinkedList();
        f12584k = trafficHistory;
        m();
    }

    public static synchronized void a(f0 f0Var) {
        a aVarC = f12584k.c(null);
        TrafficHistory.TrafficDatapoint trafficDatapoint = aVarC.f12572a;
        long j10 = trafficDatapoint.f12570b;
        f0Var.m(j10, trafficDatapoint.f12571d, Math.max(0L, j10 - aVarC.f12573b.f12570b), Math.max(0L, aVarC.f12572a.f12571d - aVarC.f12573b.f12571d));
        f12577d.add(f0Var);
    }

    public static synchronized void b(h0 h0Var) {
        Vector vector = f12576c;
        if (!vector.contains(h0Var)) {
            vector.add(h0Var);
            String str = f12579f;
            if (str != null) {
                h0Var.t(str, f12578e, f12580g, f12589p, f12581h);
            }
        }
    }

    public static String c(Context context) {
        String strConcat = f12578e;
        if (f12589p.ordinal() == 0) {
            String[] strArrSplit = f12578e.split(",");
            if (strArrSplit.length >= 7) {
                strConcat = String.format(Locale.US, "%s %s", strArrSplit[1], strArrSplit[6]);
            }
        }
        while (strConcat.endsWith(",")) {
            strConcat = strConcat.substring(0, strConcat.length() - 1);
        }
        String str = f12579f;
        if (str.equals("NOPROCESS")) {
            return strConcat;
        }
        int i10 = f12580g;
        if (i10 == R.string.xl) {
            return context.getString(R.string.xl, f12578e);
        }
        String string = context.getString(i10);
        if (f12580g == R.string.z7) {
            strConcat = str.concat(strConcat);
        }
        if (strConcat.length() > 0) {
            string = g1.a.y(string, ": ");
        }
        return g1.a.y(string, strConcat);
    }

    public static synchronized LogItem[] d() {
        LinkedList linkedList;
        linkedList = f12574a;
        return (LogItem[]) linkedList.toArray(new LogItem[linkedList.size()]);
    }

    public static boolean e() {
        ConnectionStatus connectionStatus = f12589p;
        return (connectionStatus == ConnectionStatus.f12536t || connectionStatus == ConnectionStatus.f12534q) ? false : true;
    }

    public static void f(int i10, Object... objArr) {
        r(new LogItem(5, i10, objArr));
    }

    public static void g(String str) {
        r(new LogItem(5, str));
    }

    public static void h(int i10) {
        LogItem logItem = new LogItem();
        logItem.f12540a = null;
        logItem.f12541b = null;
        logItem.f12543f = 1;
        logItem.f12544h = System.currentTimeMillis();
        logItem.f12545q = -1;
        logItem.f12542d = i10;
        logItem.f12543f = 2;
        r(logItem);
    }

    public static void i(int i10, Object... objArr) {
        r(new LogItem(2, i10, objArr));
    }

    public static void j(String str) {
        r(new LogItem(2, str));
    }

    public static void k(int i10, Object... objArr) {
        r(new LogItem(1, i10, objArr));
    }

    public static void l(String str) {
        r(new LogItem(1, str));
    }

    public static void m() {
        String strA;
        try {
            strA = NativeUtils.a();
        } catch (UnsatisfiedLinkError unused) {
            strA = "error";
        }
        k(R.string.mw, Build.MODEL, Build.BOARD, Build.BRAND, Integer.valueOf(Build.VERSION.SDK_INT), strA, Build.VERSION.RELEASE, Build.ID, Build.FINGERPRINT, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public static synchronized void n(String str) {
        r(new LogItem(2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED + str));
    }

    public static void o(int i10, int i11, String str) {
        LogItem logItem = new LogItem();
        logItem.f12540a = null;
        logItem.f12541b = null;
        logItem.f12543f = 1;
        logItem.f12544h = System.currentTimeMillis();
        logItem.f12541b = str;
        logItem.f12543f = i10;
        logItem.f12545q = i11;
        r(logItem);
    }

    public static void p(int i10, Object... objArr) {
        r(new LogItem(3, i10, objArr));
    }

    public static void q(String str) {
        r(new LogItem(3, str));
    }

    public static synchronized void r(LogItem logItem) {
        try {
            LinkedList linkedList = f12574a;
            linkedList.addLast(logItem);
            if (linkedList.size() > 1500) {
                while (true) {
                    LinkedList linkedList2 = f12574a;
                    if (linkedList2.size() <= 1000) {
                        break;
                    } else {
                        linkedList2.removeFirst();
                    }
                }
            }
            Iterator it = f12575b.iterator();
            while (it.hasNext()) {
                ((g0) it.next()).b(logItem);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void s(f0 f0Var) {
        f12577d.remove(f0Var);
    }

    public static synchronized void t(h0 h0Var) {
        f12576c.remove(h0Var);
    }

    public static void u(String str) {
        f12582i = str;
        Iterator it = f12576c.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).a0(str);
        }
    }

    public static synchronized void v(long j10, long j11) {
        a aVarB = f12584k.b(j10, j11);
        Iterator it = f12577d.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).m(j10, j11, Math.max(0L, aVarB.f12572a.f12570b - aVarB.f12573b.f12570b), Math.max(0L, aVarB.f12572a.f12571d - aVarB.f12573b.f12571d));
        }
    }

    public static void w(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            y("NONETWORK", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, R.string.x_, ConnectionStatus.f12533h);
            return;
        }
        ConnectionStatus connectionStatus = ConnectionStatus.f12530b;
        if (i11 == 1) {
            y("USERPAUSE", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, R.string.xj, connectionStatus);
        } else {
            if (i11 != 2) {
                return;
            }
            y("SCREENOFF", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, R.string.xd, connectionStatus);
        }
    }

    public static void x(String str, String str2) {
        int i10;
        ConnectionStatus connectionStatus;
        if (f12589p == ConnectionStatus.f12537u && str.equals("GET_CONFIG")) {
            return;
        }
        str.getClass();
        switch (str) {
            case "CONNECTED":
                i10 = R.string.x5;
                break;
            case "RECONNECTING":
                i10 = R.string.xb;
                break;
            case "AUTH_PENDING":
                i10 = R.string.x4;
                break;
            case "EXITING":
                i10 = R.string.x8;
                break;
            case "GET_CONFIG":
                i10 = R.string.x9;
                break;
            case "CONNECTING":
                i10 = R.string.x6;
                break;
            case "ASSIGN_IP":
                i10 = R.string.x1;
                break;
            case "AUTH":
                i10 = R.string.x2;
                break;
            case "WAIT":
                i10 = R.string.xk;
                break;
            case "TCP_CONNECT":
                i10 = R.string.xe;
                break;
            case "ADD_ROUTES":
                i10 = R.string.x0;
                break;
            case "DISCONNECTED":
                i10 = R.string.x7;
                break;
            case "RESOLVE":
                i10 = R.string.xc;
                break;
            default:
                i10 = R.string.z7;
                break;
        }
        String[] strArr = {"CONNECTING", "WAIT", "RECONNECTING", "RESOLVE", "TCP_CONNECT"};
        String[] strArr2 = {"AUTH", "GET_CONFIG", "ASSIGN_IP", "ADD_ROUTES", "AUTH_PENDING"};
        String[] strArr3 = {"CONNECTED"};
        String[] strArr4 = {"DISCONNECTED", "EXITING"};
        int i11 = 0;
        while (true) {
            if (i11 >= 5) {
                int i12 = 0;
                while (true) {
                    if (i12 < 5) {
                        if (str.equals(strArr2[i12])) {
                            connectionStatus = ConnectionStatus.f12531d;
                        } else {
                            i12++;
                        }
                    } else if (str.equals(strArr3[0])) {
                        connectionStatus = ConnectionStatus.f12529a;
                    } else {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= 2) {
                                connectionStatus = ConnectionStatus.f12538v;
                            } else if (str.equals(strArr4[i13])) {
                                connectionStatus = ConnectionStatus.f12534q;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
            } else if (str.equals(strArr[i11])) {
                connectionStatus = ConnectionStatus.f12532f;
            } else {
                i11++;
            }
        }
        y(str, str2, i10, connectionStatus);
    }

    public static synchronized void y(String str, String str2, int i10, ConnectionStatus connectionStatus) {
        z(str, str2, i10, connectionStatus, null);
    }

    public static synchronized void z(String str, String str2, int i10, ConnectionStatus connectionStatus, Intent intent) {
        try {
            if (f12589p != ConnectionStatus.f12529a || (!str.equals("WAIT") && !str.equals("AUTH"))) {
                f12579f = str;
                f12578e = str2;
                f12580g = i10;
                f12589p = connectionStatus;
                f12581h = intent;
                Iterator it = f12576c.iterator();
                while (it.hasNext()) {
                    ((h0) it.next()).t(str, str2, i10, connectionStatus, intent);
                }
                return;
            }
            r(new LogItem(5, String.format("Ignoring OpenVPN Status in CONNECTED state (%s->%s): %s", str, connectionStatus.toString(), str2)));
        } catch (Throwable th) {
            throw th;
        }
    }
}
