package f6;

import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.compression.ICompressor;
import com.trilead.ssh2.crypto.cipher.BlockCipher;
import com.trilead.ssh2.crypto.digest.MessageMac;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Vector;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c6.a f13177q = c6.a.a(i.class);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f13178r = Integer.getInteger(i.class.getName().concat(".maxPacketSize"), 65536).intValue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13183e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f13188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f13189k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Thread f13191m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13194p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vector f13179a = new Vector();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f13180b = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Socket f13184f = new Socket();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f13185g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13186h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Throwable f13187i = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Vector f13190l = new Vector();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Vector f13192n = new Vector();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13193o = false;

    public i(int i10, String str, String str2) {
        this.f13182d = str;
        this.f13183e = i10;
        this.f13181c = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r7 <= 255) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress d(java.lang.String r10) throws java.net.UnknownHostException {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            goto L57
        L4:
            r1 = 46
            java.lang.String[] r1 = com.google.android.gms.internal.ads.en1.z(r10, r1)
            int r2 = r1.length
            r3 = 4
            if (r2 == r3) goto Lf
            goto L57
        Lf:
            byte[] r2 = new byte[r3]
            r4 = 0
            r5 = 0
        L13:
            if (r5 >= r3) goto L53
            r6 = r1[r5]
            int r6 = r6.length()
            if (r6 == 0) goto L57
            r6 = r1[r5]
            int r6 = r6.length()
            r7 = 3
            if (r6 <= r7) goto L27
            goto L57
        L27:
            r6 = 0
            r7 = 0
        L29:
            r8 = r1[r5]
            int r8 = r8.length()
            if (r6 >= r8) goto L48
            r8 = r1[r5]
            char r8 = r8.charAt(r6)
            r9 = 48
            if (r8 < r9) goto L57
            r9 = 57
            if (r8 <= r9) goto L40
            goto L57
        L40:
            int r7 = r7 * 10
            int r8 = r8 + (-48)
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L29
        L48:
            r6 = 255(0xff, float:3.57E-43)
            if (r7 <= r6) goto L4d
            goto L57
        L4d:
            byte r6 = (byte) r7
            r2[r5] = r6
            int r5 = r5 + 1
            goto L13
        L53:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r10, r2)
        L57:
            if (r0 == 0) goto L5a
            return r0
        L5a:
            java.net.InetAddress r10 = java.net.InetAddress.getByName(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.i.d(java.lang.String):java.net.InetAddress");
    }

    public static void e(InputStream inputStream, byte[] bArr, int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 <= 0) {
                throw new IOException("Proxy Exception SOCKS5: stream is closed");
            }
            i11 += i12;
        }
    }

    public final void a(BlockCipher blockCipher, MessageMac messageMac) {
        f fVar = this.f13188j;
        fVar.f13154c.changeCipher(blockCipher);
        fVar.f13160i = messageMac;
        fVar.f13161j = new byte[messageMac.size()];
        fVar.f13162k = new byte[messageMac.size()];
        blockCipher.getBlockSize();
    }

    public final void b(ICompressor iCompressor) {
        if (!this.f13194p) {
            this.f13188j.f13163l = null;
            return;
        }
        f fVar = this.f13188j;
        fVar.f13163l = iCompressor;
        if (iCompressor != null) {
            byte[] bArr = new byte[iCompressor.getBufferSize()];
            fVar.f13165n |= fVar.f13163l.canCompressPreauth();
        }
    }

    public final void c(Throwable th, boolean z9) {
        Vector vector;
        if (!z9) {
            try {
                this.f13184f.close();
            } catch (IOException unused) {
            }
        }
        synchronized (this.f13185g) {
            if (this.f13187i == null) {
                if (z9) {
                    try {
                        String message = th.getMessage();
                        d6.b bVar = new d6.b();
                        bVar.c(1);
                        bVar.h(11);
                        bVar.g(message);
                        bVar.g(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        byte[] bArrA = bVar.a();
                        f fVar = this.f13188j;
                        if (fVar != null) {
                            fVar.a(bArrA);
                        }
                    } catch (IOException unused2) {
                    }
                    try {
                        this.f13184f.close();
                    } catch (IOException unused3) {
                    }
                }
                if (th == null) {
                    th = new Exception("Unknown cause");
                }
                this.f13187i = th;
            }
            this.f13185g.notifyAll();
        }
        synchronized (this) {
            try {
                if (this.f13193o) {
                    vector = null;
                } else {
                    this.f13193o = true;
                    vector = (Vector) this.f13192n.clone();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vector != null) {
            for (int i10 = 0; i10 < vector.size(); i10++) {
                try {
                    ((SSHTunnelService) ((z5.c) vector.elementAt(i10))).c(this.f13187i);
                } catch (Exception unused4) {
                }
            }
        }
    }

    public final z5.b f() {
        z5.b bVar;
        a aVar = this.f13189k;
        synchronized (aVar.f13109f) {
            while (true) {
                try {
                    bVar = aVar.f13110g;
                    if (bVar == null || bVar.f20718f < 1) {
                        if (aVar.f13111h) {
                            throw new IOException("Key exchange was not finished, connection is closed.", aVar.f13113j.g());
                        }
                        try {
                            aVar.f13109f.wait();
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bVar;
    }

    public final Throwable g() {
        Throwable th;
        synchronized (this.f13185g) {
            th = this.f13187i;
        }
        return th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x023f, code lost:
    
        if (r7[1] == 0) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(com.trilead.ssh2.crypto.CryptoWishList r18, z5.i r19, z5.d r20, int r21, java.security.SecureRandom r22, z5.h r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.i.h(com.trilead.ssh2.crypto.CryptoWishList, z5.i, z5.d, int, java.security.SecureRandom, z5.h):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0239, code lost:
    
        throw new java.io.IOException(com.google.android.gms.internal.ads.fb1.h("Illegal packet size! (", r8, ")"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.i.i():void");
    }

    public final void j(d dVar, int i10, int i11) {
        h hVar = new h();
        hVar.f13174a = dVar;
        hVar.f13175b = i10;
        hVar.f13176c = i11;
        synchronized (this.f13190l) {
            this.f13190l.addElement(hVar);
        }
    }

    public final void k(d dVar) {
        synchronized (this.f13190l) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= this.f13190l.size()) {
                        break;
                    }
                    h hVar = (h) this.f13190l.elementAt(i10);
                    if (hVar.f13174a == dVar && hVar.f13175b == 0 && hVar.f13176c == 255) {
                        this.f13190l.removeElementAt(i10);
                        break;
                    }
                    i10++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void l(byte[] bArr) {
        synchronized (this.f13179a) {
            try {
                this.f13179a.addElement(bArr);
                if (this.f13179a.size() > 100) {
                    throw new IOException("Error: the peer is not consuming our asynchronous replies.");
                }
                if (this.f13180b == null) {
                    m3.a aVar = new m3.a(1, this);
                    this.f13180b = aVar;
                    aVar.setDaemon(true);
                    this.f13180b.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(byte[] bArr) {
        synchronized (this.f13185g) {
            try {
                if (this.f13187i != null) {
                    throw ((IOException) new IOException("Sorry, this connection is closed.").initCause(this.f13187i));
                }
                this.f13186h = true;
                try {
                    this.f13188j.a(bArr);
                } catch (IOException e10) {
                    c(e10, false);
                    throw e10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(byte[] bArr) {
        if (Thread.currentThread() == this.f13191m) {
            throw new IOException("Assertion error: sendMessage may never be invoked by the receiver thread!");
        }
        synchronized (this.f13185g) {
            while (this.f13187i == null) {
                try {
                    if (this.f13186h) {
                        try {
                            this.f13185g.wait();
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    } else {
                        try {
                            this.f13188j.a(bArr);
                        } catch (IOException e10) {
                            c(e10, false);
                            throw e10;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
                throw th;
            }
            throw ((IOException) new IOException("Sorry, this connection is closed.").initCause(this.f13187i));
        }
    }

    public final void o(Vector vector) {
        synchronized (this) {
            this.f13192n = (Vector) vector.clone();
        }
    }
}
