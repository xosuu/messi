package b6;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.i2;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.Vector;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f6.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c6.a f1363h = c6.a.a(c.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f6.i f1365b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1364a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Vector f1366c = new Vector();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1367d = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f1368e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Vector f1369f = new Vector();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1370g = true;

    public c(f6.i iVar) {
        this.f1365b = iVar;
        iVar.j(this, 80, 100);
    }

    public static IOException g(String str, a aVar) {
        Throwable th;
        IOException iOException = new IOException(str);
        synchronized (aVar.f1358q) {
            th = aVar.f1359r;
        }
        return (IOException) iOException.initCause(th);
    }

    @Override // f6.d
    public final void a(IOException iOException) {
        c6.a aVar = f1363h;
        aVar.getClass();
        aVar.b(50, "HandleMessage: got shutdown");
        synchronized (this.f1369f) {
            for (int i10 = 0; i10 < this.f1369f.size(); i10++) {
                e eVar = (e) ((h) this.f1369f.elementAt(i10));
                eVar.getClass();
                try {
                    eVar.f1374b.close();
                } catch (IOException unused) {
                }
            }
            this.f1370g = false;
        }
        synchronized (this.f1366c) {
            for (int i11 = 0; i11 < this.f1366c.size(); i11++) {
                try {
                    a aVar2 = (a) this.f1366c.elementAt(i11);
                    synchronized (aVar2) {
                        aVar2.a();
                        aVar2.f1352k = 4;
                        aVar2.c(new IOException("The connection is being shutdown").initCause(iOException));
                        aVar2.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f1366c.setSize(0);
            this.f1366c.trimToSize();
            this.f1366c.notifyAll();
        }
    }

    @Override // f6.d
    public final void b(byte[] bArr, int i10) throws IOException {
        byte b10 = bArr[0];
        switch (b10) {
            case 80:
                i2 i2Var = new i2(bArr, 0, i10);
                i2Var.b();
                String strG = i2Var.g();
                if (i2Var.a()) {
                    this.f1365b.l(new byte[]{82});
                }
                c6.a aVar = f1363h;
                aVar.getClass();
                aVar.b(80, "Got SSH_MSG_GLOBAL_REQUEST (" + strG + ")");
                return;
            case 81:
                r();
                return;
            case 82:
                q();
                return;
            default:
                switch (b10) {
                    case 90:
                        k(bArr, i10);
                        return;
                    case 91:
                        l(bArr, i10);
                        return;
                    case 92:
                        m(bArr, i10);
                        return;
                    case 93:
                        p(bArr, i10);
                        return;
                    case 94:
                        i(bArr, i10);
                        return;
                    case 95:
                        j(bArr, i10);
                        return;
                    case 96:
                        if (i10 != 5) {
                            throw new IOException(fb1.h("SSH_MSG_CHANNEL_EOF message has wrong size (", i10, ")"));
                        }
                        int i11 = (bArr[4] & 255) | ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8);
                        a aVarF = f(i11);
                        if (aVarF == null) {
                            throw new IOException(fb1.g("Unexpected SSH_MSG_CHANNEL_EOF message for non-existent channel ", i11));
                        }
                        aVarF.a();
                        c6.a aVar2 = f1363h;
                        aVar2.getClass();
                        aVar2.b(50, "Got SSH_MSG_CHANNEL_EOF (channel " + i11 + ")");
                        return;
                    case 97:
                        h(bArr, i10);
                        return;
                    case 98:
                        n(bArr, i10);
                        return;
                    case 99:
                        o(bArr, i10);
                        return;
                    case 100:
                        if (i10 != 5) {
                            throw new IOException(fb1.h("SSH_MSG_CHANNEL_FAILURE message has wrong size (", i10, ")"));
                        }
                        int i12 = (bArr[4] & 255) | ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8);
                        a aVarF2 = f(i12);
                        if (aVarF2 == null) {
                            throw new IOException(fb1.g("Unexpected SSH_MSG_CHANNEL_FAILURE message for non-existent channel ", i12));
                        }
                        synchronized (aVarF2) {
                            aVarF2.notifyAll();
                            break;
                        }
                        c6.a aVar3 = f1363h;
                        aVar3.getClass();
                        aVar3.b(50, "Got SSH_MSG_CHANNEL_FAILURE (channel " + i12 + ")");
                        return;
                    default:
                        throw new IOException("Cannot handle unknown channel message " + (bArr[0] & 255));
                }
        }
    }

    public final int c(a aVar) {
        int i10;
        synchronized (this.f1366c) {
            this.f1366c.addElement(aVar);
            i10 = this.f1367d;
            this.f1367d = i10 + 1;
        }
        return i10;
    }

    public final void d(String str) {
        synchronized (this.f1364a) {
            try {
                if (str != null) {
                    fb1.t(this.f1364a.get(str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(a aVar, String str) {
        byte[] bArr = new byte[5];
        synchronized (aVar) {
            aVar.f1352k = 4;
            aVar.a();
            aVar.c(new IOException(str));
            bArr[0] = 97;
            int i10 = aVar.f1348g;
            bArr[1] = (byte) (i10 >> 24);
            bArr[2] = (byte) (i10 >> 16);
            bArr[3] = (byte) (i10 >> 8);
            bArr[4] = (byte) i10;
            aVar.notifyAll();
        }
        synchronized (aVar.f1349h) {
            try {
                if (aVar.f1350i) {
                    return;
                }
                this.f1365b.n(bArr);
                aVar.f1350i = true;
                c6.a aVar2 = f1363h;
                aVar2.getClass();
                aVar2.b(50, "Sent SSH_MSG_CHANNEL_CLOSE (channel " + aVar.f1347f + ")");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a f(int i10) {
        synchronized (this.f1366c) {
            for (int i11 = 0; i11 < this.f1366c.size(); i11++) {
                try {
                    a aVar = (a) this.f1366c.elementAt(i11);
                    if (aVar.f1347f == i10) {
                        return aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    public final void h(byte[] bArr, int i10) throws IOException {
        if (i10 != 5) {
            throw new IOException(fb1.h("SSH_MSG_CHANNEL_CLOSE message has wrong size (", i10, ")"));
        }
        int i11 = (bArr[4] & 255) | ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8);
        a aVarF = f(i11);
        if (aVarF == null) {
            throw new IOException(fb1.g("Unexpected SSH_MSG_CHANNEL_CLOSE message for non-existent channel ", i11));
        }
        synchronized (aVarF) {
            aVarF.a();
            aVarF.f1352k = 4;
            aVarF.c(new IOException("Close requested by remote"));
            t(aVarF.f1347f);
            aVarF.notifyAll();
        }
        c6.a aVar = f1363h;
        aVar.getClass();
        aVar.b(50, "Got SSH_MSG_CHANNEL_CLOSE (channel " + i11 + ")");
    }

    public final void i(byte[] bArr, int i10) throws IOException {
        if (i10 <= 9) {
            throw new IOException(fb1.h("SSH_MSG_CHANNEL_DATA message has wrong size (", i10, ")"));
        }
        int i11 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
        int i12 = (bArr[8] & 255) | ((bArr[5] & 255) << 24) | ((bArr[6] & 255) << 16) | ((bArr[7] & 255) << 8);
        a aVarF = f(i11);
        if (aVarF == null) {
            throw new IOException(fb1.g("Unexpected SSH_MSG_CHANNEL_DATA message for non-existent channel ", i11));
        }
        int i13 = i10 - 9;
        if (i12 != i13) {
            throw new IOException("SSH_MSG_CHANNEL_DATA message has wrong len (calculated " + i13 + ", got " + i12 + ")");
        }
        c6.a aVar = f1363h;
        aVar.getClass();
        aVar.b(80, "Got SSH_MSG_CHANNEL_DATA (channel " + i11 + ", " + i12 + ")");
        synchronized (aVarF) {
            try {
                int i14 = aVarF.f1352k;
                if (i14 == 4) {
                    return;
                }
                if (i14 != 2) {
                    throw new IOException("Got SSH_MSG_CHANNEL_DATA, but channel is not in correct state (" + aVarF.f1352k + ")");
                }
                int i15 = aVarF.f1353l;
                if (i15 < i12) {
                    throw new IOException("Remote sent too much data, does not fit into window.");
                }
                aVarF.f1353l = i15 - i12;
                aVarF.f1345d.s(bArr, 9, i12);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(byte[] bArr, int i10) throws IOException {
        if (i10 <= 13) {
            throw new IOException(fb1.h("SSH_MSG_CHANNEL_EXTENDED_DATA message has wrong size (", i10, ")"));
        }
        int i11 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
        int i12 = ((bArr[5] & 255) << 24) | ((bArr[6] & 255) << 16) | ((bArr[7] & 255) << 8) | (bArr[8] & 255);
        int i13 = ((bArr[11] & 255) << 8) | ((bArr[9] & 255) << 24) | ((bArr[10] & 255) << 16) | (bArr[12] & 255);
        a aVarF = f(i11);
        if (aVarF == null) {
            throw new IOException(fb1.g("Unexpected SSH_MSG_CHANNEL_EXTENDED_DATA message for non-existent channel ", i11));
        }
        if (i12 != 1) {
            throw new IOException(fb1.h("SSH_MSG_CHANNEL_EXTENDED_DATA message has unknown type (", i12, ")"));
        }
        int i14 = i10 - 13;
        if (i13 != i14) {
            throw new IOException("SSH_MSG_CHANNEL_EXTENDED_DATA message has wrong len (calculated " + i14 + ", got " + i13 + ")");
        }
        c6.a aVar = f1363h;
        aVar.getClass();
        aVar.b(80, "Got SSH_MSG_CHANNEL_EXTENDED_DATA (channel " + i11 + ", " + i13 + ")");
        synchronized (aVarF) {
            try {
                int i15 = aVarF.f1352k;
                if (i15 == 4) {
                    return;
                }
                if (i15 != 2) {
                    throw new IOException("Got SSH_MSG_CHANNEL_EXTENDED_DATA, but channel is not in correct state (" + aVarF.f1352k + ")");
                }
                int i16 = aVarF.f1353l;
                if (i16 < i13) {
                    throw new IOException("Remote sent too much data, does not fit into window.");
                }
                aVarF.f1353l = i16 - i13;
                aVarF.f1346e.s(bArr, 13, i13);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(byte[] bArr, int i10) throws IOException {
        i2 i2Var = new i2(bArr, 0, i10);
        i2Var.b();
        String strG = i2Var.g();
        int i11 = i2Var.i();
        int i12 = i2Var.i();
        int i13 = i2Var.i();
        if ("x11".equals(strG)) {
            synchronized (this.f1364a) {
                try {
                    if (this.f1364a.size() == 0) {
                        f6.i iVar = this.f1365b;
                        d6.b bVar = new d6.b();
                        bVar.c(92);
                        bVar.h(i11);
                        bVar.h(1);
                        bVar.g("X11 forwarding not activated");
                        bVar.g(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        iVar.l(bVar.a());
                        c6.a aVar = f1363h;
                        aVar.getClass();
                        aVar.b(20, "Unexpected X11 request, denying it!");
                        return;
                    }
                    i2Var.g();
                    i2Var.i();
                    a aVar2 = new a(this);
                    synchronized (aVar2) {
                        aVar2.f1348g = i11;
                        aVar2.f1354m = ((long) i12) & 4294967295L;
                        aVar2.f1356o = i13;
                        aVar2.f1347f = c(aVar2);
                    }
                    i iVar2 = new i();
                    iVar2.f1385a = aVar2;
                    iVar2.setDaemon(true);
                    iVar2.start();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!"forwarded-tcpip".equals(strG)) {
            f6.i iVar3 = this.f1365b;
            d6.b bVar2 = new d6.b();
            bVar2.c(92);
            bVar2.h(i11);
            bVar2.h(3);
            bVar2.g("Unknown channel type");
            bVar2.g(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            iVar3.l(bVar2.a());
            c6.a aVar3 = f1363h;
            aVar3.getClass();
            aVar3.b(20, "The peer tried to open an unsupported channel type (" + strG + ")");
            return;
        }
        i2Var.g();
        int i14 = i2Var.i();
        i2Var.g();
        i2Var.i();
        synchronized (this.f1368e) {
            fb1.t(this.f1368e.get(new Integer(i14)));
        }
        f6.i iVar4 = this.f1365b;
        d6.b bVar3 = new d6.b();
        bVar3.c(92);
        bVar3.h(i11);
        bVar3.h(1);
        bVar3.g("No thanks, unknown port in forwarded-tcpip request");
        bVar3.g(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        iVar4.l(bVar3.a());
        c6.a aVar4 = f1363h;
        aVar4.getClass();
        aVar4.b(20, "Unexpected forwarded-tcpip request, denying it!");
    }

    public final void l(byte[] bArr, int i10) throws IOException {
        System.arraycopy(bArr, 0, new byte[i10], 0, i10);
        i2 i2Var = new i2(bArr, 0, i10);
        int iB = i2Var.b();
        if (iB != 91) {
            throw new IOException(fb1.h("This is not a SSH_MSG_CHANNEL_OPEN_CONFIRMATION! (", iB, ")"));
        }
        int i11 = i2Var.i();
        int i12 = i2Var.i();
        int i13 = i2Var.i();
        int i14 = i2Var.i();
        if (i2Var.j() != 0) {
            throw new IOException("Padding in SSH_MSG_CHANNEL_OPEN_CONFIRMATION packet!");
        }
        a aVarF = f(i11);
        if (aVarF == null) {
            throw new IOException(fb1.g("Unexpected SSH_MSG_CHANNEL_OPEN_CONFIRMATION message for non-existent channel ", i11));
        }
        synchronized (aVarF) {
            if (aVarF.f1352k != 1) {
                throw new IOException("Unexpected SSH_MSG_CHANNEL_OPEN_CONFIRMATION message for channel " + i11);
            }
            aVarF.f1348g = i12;
            aVarF.f1354m = ((long) i13) & 4294967295L;
            aVarF.f1356o = i14;
            aVarF.f1352k = 2;
            aVarF.notifyAll();
        }
        c6.a aVar = f1363h;
        aVar.getClass();
        aVar.b(50, "Got SSH_MSG_CHANNEL_OPEN_CONFIRMATION (channel " + i11 + " / remote: " + i12 + ")");
    }

    public final void m(byte[] bArr, int i10) throws IOException {
        if (i10 < 5) {
            throw new IOException(fb1.h("SSH_MSG_CHANNEL_OPEN_FAILURE message has wrong size (", i10, ")"));
        }
        i2 i2Var = new i2(bArr, 0, i10);
        i2Var.b();
        int i11 = i2Var.i();
        a aVarF = f(i11);
        if (aVarF == null) {
            throw new IOException(fb1.g("Unexpected SSH_MSG_CHANNEL_OPEN_FAILURE message for non-existent channel ", i11));
        }
        int i12 = i2Var.i();
        String strH = i2Var.h(StandardStringDigester.MESSAGE_CHARSET);
        String strH2 = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? fb1.h("UNKNOWN REASON CODE (", i12, ")") : "SSH_OPEN_RESOURCE_SHORTAGE" : "SSH_OPEN_UNKNOWN_CHANNEL_TYPE" : "SSH_OPEN_CONNECT_FAILED" : "SSH_OPEN_ADMINISTRATIVELY_PROHIBITED";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strH);
        for (int i13 = 0; i13 < stringBuffer.length(); i13++) {
            char cCharAt = stringBuffer.charAt(i13);
            if (cCharAt < ' ' || cCharAt > '~') {
                stringBuffer.setCharAt(i13, (char) 65533);
            }
        }
        synchronized (aVarF) {
            aVarF.a();
            aVarF.f1352k = 4;
            aVarF.c(new IOException("The server refused to open the channel (" + strH2 + ", '" + stringBuffer.toString() + "')"));
            aVarF.notifyAll();
        }
        c6.a aVar = f1363h;
        aVar.getClass();
        aVar.b(50, "Got SSH_MSG_CHANNEL_OPEN_FAILURE (channel " + i11 + ")");
    }

    public final void n(byte[] bArr, int i10) throws IOException {
        i2 i2Var = new i2(bArr, 0, i10);
        i2Var.b();
        int i11 = i2Var.i();
        a aVarF = f(i11);
        if (aVarF == null) {
            throw new IOException(fb1.g("Unexpected SSH_MSG_CHANNEL_REQUEST message for non-existent channel ", i11));
        }
        String strH = i2Var.h(StandardStringDigester.DIGEST_CHARSET);
        boolean zA = i2Var.a();
        c6.a aVar = f1363h;
        aVar.getClass();
        aVar.b(80, "Got SSH_MSG_CHANNEL_REQUEST (channel " + i11 + ", '" + strH + "')");
        if (strH.equals("exit-status")) {
            if (zA) {
                throw new IOException("Badly formatted SSH_MSG_CHANNEL_REQUEST message, 'want reply' is true");
            }
            int i12 = i2Var.i();
            if (i2Var.j() != 0) {
                throw new IOException("Badly formatted SSH_MSG_CHANNEL_REQUEST message");
            }
            synchronized (aVarF) {
                new Integer(i12);
                aVarF.notifyAll();
            }
            aVar.b(50, "Got EXIT STATUS (channel " + i11 + ", status " + i12 + ")");
            return;
        }
        if (!strH.equals("exit-signal")) {
            if (zA) {
                int i13 = aVarF.f1348g;
                this.f1365b.l(new byte[]{100, (byte) (i13 >> 24), (byte) (i13 >> 16), (byte) (i13 >> 8), (byte) i13});
            }
            aVar.b(50, "Channel request '" + strH + "' is not known, ignoring it");
            return;
        }
        if (zA) {
            throw new IOException("Badly formatted SSH_MSG_CHANNEL_REQUEST message, 'want reply' is true");
        }
        String strH2 = i2Var.h(StandardStringDigester.DIGEST_CHARSET);
        i2Var.a();
        i2Var.g();
        i2Var.g();
        if (i2Var.j() != 0) {
            throw new IOException("Badly formatted SSH_MSG_CHANNEL_REQUEST message");
        }
        synchronized (aVarF) {
            aVarF.notifyAll();
        }
        aVar.b(50, "Got EXIT SIGNAL (channel " + i11 + ", signal " + strH2 + ")");
    }

    public final void o(byte[] bArr, int i10) throws IOException {
        if (i10 != 5) {
            throw new IOException(fb1.h("SSH_MSG_CHANNEL_SUCCESS message has wrong size (", i10, ")"));
        }
        int i11 = (bArr[4] & 255) | ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8);
        a aVarF = f(i11);
        if (aVarF == null) {
            throw new IOException(fb1.g("Unexpected SSH_MSG_CHANNEL_SUCCESS message for non-existent channel ", i11));
        }
        synchronized (aVarF) {
            aVarF.notifyAll();
        }
        c6.a aVar = f1363h;
        aVar.getClass();
        aVar.b(80, "Got SSH_MSG_CHANNEL_SUCCESS (channel " + i11 + ")");
    }

    public final void p(byte[] bArr, int i10) throws IOException {
        if (i10 != 9) {
            throw new IOException(fb1.h("SSH_MSG_CHANNEL_WINDOW_ADJUST message has wrong size (", i10, ")"));
        }
        int i11 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
        int i12 = (bArr[8] & 255) | ((bArr[5] & 255) << 24) | ((bArr[6] & 255) << 16) | ((bArr[7] & 255) << 8);
        a aVarF = f(i11);
        if (aVarF == null) {
            throw new IOException(fb1.g("Unexpected SSH_MSG_CHANNEL_WINDOW_ADJUST message for non-existent channel ", i11));
        }
        synchronized (aVarF) {
            try {
                long j10 = aVarF.f1354m + (((long) i12) & 4294967295L);
                aVarF.f1354m = j10;
                if (j10 > 4294967295L) {
                    aVarF.f1354m = 4294967295L;
                }
                aVarF.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        c6.a aVar = f1363h;
        aVar.getClass();
        aVar.b(80, "Got SSH_MSG_CHANNEL_WINDOW_ADJUST (channel " + i11 + ", " + i12 + ")");
    }

    public final void q() {
        synchronized (this.f1366c) {
            this.f1366c.notifyAll();
        }
        c6.a aVar = f1363h;
        aVar.getClass();
        aVar.b(80, "Got SSH_MSG_REQUEST_FAILURE");
    }

    public final void r() {
        synchronized (this.f1366c) {
            this.f1366c.notifyAll();
        }
        c6.a aVar = f1363h;
        aVar.getClass();
        aVar.b(80, "Got SSH_MSG_REQUEST_SUCCESS");
    }

    public final a s(String str, int i10) {
        int iC;
        a aVar = new a(this);
        synchronized (aVar) {
            iC = c(aVar);
            aVar.f1347f = iC;
        }
        int i11 = aVar.f1353l;
        int i12 = aVar.f1355n;
        f6.i iVar = this.f1365b;
        d6.b bVar = new d6.b();
        bVar.c(90);
        bVar.g("direct-tcpip");
        bVar.h(iC);
        bVar.h(i11);
        bVar.h(i12);
        bVar.g(str);
        bVar.h(i10);
        bVar.g("127.0.0.1");
        bVar.h(0);
        iVar.n(bVar.a());
        v(aVar);
        return aVar;
    }

    public final void t(int i10) {
        synchronized (this.f1366c) {
            int i11 = 0;
            while (true) {
                try {
                    if (i11 >= this.f1366c.size()) {
                        break;
                    }
                    if (((a) this.f1366c.elementAt(i11)).f1347f == i10) {
                        this.f1366c.removeElementAt(i11);
                        break;
                    }
                    i11++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void u(a aVar) {
        synchronized (aVar) {
            try {
                if (aVar.f1352k != 1) {
                    return;
                }
                aVar.f1352k = 2;
                int i10 = aVar.f1348g;
                int i11 = aVar.f1347f;
                int i12 = aVar.f1353l;
                int i13 = aVar.f1355n;
                synchronized (aVar.f1349h) {
                    try {
                        if (aVar.f1350i) {
                            return;
                        }
                        f6.i iVar = this.f1365b;
                        d6.b bVar = new d6.b();
                        bVar.c(91);
                        bVar.h(i10);
                        bVar.h(i11);
                        bVar.h(i12);
                        bVar.h(i13);
                        iVar.n(bVar.a());
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public final void v(a aVar) {
        int i10;
        synchronized (aVar) {
            while (true) {
                i10 = aVar.f1352k;
                if (i10 != 1) {
                    break;
                }
                try {
                    aVar.wait();
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                }
            }
            if (i10 != 2) {
                t(aVar.f1347f);
                throw g("Could not open channel (state:" + aVar.f1352k + ")", aVar);
            }
        }
    }
}
