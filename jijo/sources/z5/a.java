package z5;

import b7.u;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.lq;
import com.trilead.ssh2.HTTPProxyException;
import com.trilead.ssh2.crypto.CryptoWishList;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import l.j;
import org.jasypt.salt.RandomSaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecureRandom f20701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a6.a f20702b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b6.c f20705e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f6.i f20710j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20703c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20704d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CryptoWishList f20706f = new CryptoWishList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f20707g = new d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f20711k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Vector f20712l = new Vector();

    public a(String str, int i10) {
        this.f20708h = str;
        this.f20709i = i10;
    }

    public final synchronized void a(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("cmon argument is null");
        }
        this.f20712l.addElement(cVar);
        f6.i iVar = this.f20710j;
        if (iVar != null) {
            iVar.o(this.f20712l);
        }
    }

    public final synchronized boolean b(String str, String str2) {
        boolean zC;
        try {
            f6.i iVar = this.f20710j;
            if (iVar == null) {
                throw new IllegalStateException("Connection is not established!");
            }
            if (this.f20703c) {
                throw new IllegalStateException("Connection is already authenticated!");
            }
            if (this.f20702b == null) {
                this.f20702b = new a6.a(iVar);
            }
            if (this.f20705e == null) {
                this.f20705e = new b6.c(this.f20710j);
            }
            if (str == null) {
                throw new IllegalArgumentException("user argument is null");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("password argument is null");
            }
            zC = this.f20702b.c(str, str2);
            this.f20703c = zC;
        } catch (Throwable th) {
            throw th;
        }
        return zC;
    }

    public final void c(Throwable th) {
        Vector vector;
        b6.c cVar = this.f20705e;
        if (cVar != null) {
            c6.a aVar = b6.c.f1363h;
            aVar.getClass();
            aVar.b(50, "Closing all channels");
            synchronized (cVar.f1366c) {
                vector = (Vector) cVar.f1366c.clone();
            }
            for (int i10 = 0; i10 < vector.size(); i10++) {
                try {
                    cVar.e((b6.a) vector.elementAt(i10), "Closing all channels");
                } catch (IOException unused) {
                }
            }
        }
        f6.i iVar = this.f20710j;
        if (iVar != null) {
            iVar.c(th, true);
            this.f20710j = null;
        }
        this.f20702b = null;
        this.f20705e = null;
        this.f20703c = false;
    }

    public final synchronized b d(i iVar, int i10, int i11) {
        SecureRandom secureRandom;
        b bVarF;
        try {
            if (this.f20710j != null) {
                throw new IOException("Connection to " + this.f20708h + " is already in connected state!");
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("connectTimeout must be non-negative!");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("kexTimeout must be non-negative!");
            }
            lq lqVar = new lq();
            lqVar.f6694c = this;
            lqVar.f6692a = false;
            lqVar.f6693b = false;
            g6.a aVarA = null;
            f6.i iVar2 = new f6.i(this.f20709i, this.f20708h, null);
            this.f20710j = iVar2;
            iVar2.o(this.f20712l);
            f6.i iVar3 = this.f20710j;
            boolean z9 = this.f20704d;
            iVar3.f13194p = z9;
            if (!z9) {
                CryptoWishList cryptoWishList = this.f20706f;
                cryptoWishList.c2s_comp_algos = new String[]{"none"};
                cryptoWishList.s2c_comp_algos = new String[]{"none"};
            }
            synchronized (iVar3) {
            }
            if (i11 > 0) {
                try {
                    try {
                        aVarA = g6.b.a(new j(this, 28, lqVar), System.currentTimeMillis() + ((long) i11));
                    } catch (IOException e10) {
                        c(new Throwable("There was a problem during connect.").initCause(e10));
                        synchronized (lqVar) {
                            if (lqVar.f6693b) {
                                throw new SocketTimeoutException("The kexTimeout (" + i11 + " ms) expired.");
                            }
                            if (e10 instanceof HTTPProxyException) {
                                throw e10;
                            }
                            throw ((IOException) new IOException("There was a problem while connecting to " + this.f20708h + ":" + this.f20709i).initCause(e10));
                        }
                    }
                } catch (SocketTimeoutException e11) {
                    throw e11;
                }
            }
            g6.a aVar = aVarA;
            try {
                f6.i iVar4 = this.f20710j;
                CryptoWishList cryptoWishList2 = this.f20706f;
                d dVar = this.f20707g;
                if (this.f20701a == null) {
                    try {
                        secureRandom = SecureRandom.getInstance(RandomSaltGenerator.DEFAULT_SECURE_RANDOM_ALGORITHM);
                    } catch (NoSuchAlgorithmException unused) {
                        secureRandom = new SecureRandom();
                    }
                    this.f20701a = secureRandom;
                }
                iVar4.h(cryptoWishList2, iVar, dVar, i10, this.f20701a, this.f20711k);
                this.f20710j.f13184f.setTcpNoDelay(false);
                bVarF = this.f20710j.f();
                if (aVar != null) {
                    g6.b.b(aVar);
                    synchronized (lqVar) {
                        try {
                            if (lqVar.f6693b) {
                                throw new IOException("This exception will be replaced by the one below =)");
                            }
                            lqVar.f6692a = true;
                        } finally {
                        }
                    }
                }
                u.r(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] Key exchange algorithm: " + ((String) bVarF.f20714b));
                u.r(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] Using algorithm: " + ((String) bVarF.f20715c) + " " + ((String) bVarF.f20717e));
            } catch (SocketTimeoutException e12) {
                throw ((SocketTimeoutException) new SocketTimeoutException("The connect() operation on the socket timed out.").initCause(e12));
            }
        } catch (Throwable th) {
            throw th;
        }
        return bVarF;
    }

    public final synchronized void e(i iVar, int i10, int i11) {
        d(iVar, i10, i11);
    }

    public final synchronized e f() {
        if (this.f20710j == null) {
            throw new IllegalStateException("Cannot forward ports, you need to establish a connection first.");
        }
        if (!this.f20703c) {
            throw new IllegalStateException("Cannot forward ports, connection is not authenticated.");
        }
        return new e(this.f20705e);
    }

    public final synchronized String[] g(String str) {
        a6.a aVar;
        try {
            if (str == null) {
                throw new IllegalArgumentException("user argument may not be NULL!");
            }
            f6.i iVar = this.f20710j;
            if (iVar == null) {
                throw new IllegalStateException("Connection is not established!");
            }
            if (this.f20703c) {
                throw new IllegalStateException("Connection is already authenticated!");
            }
            if (this.f20702b == null) {
                this.f20702b = new a6.a(iVar);
            }
            if (this.f20705e == null) {
                this.f20705e = new b6.c(this.f20710j);
            }
            aVar = this.f20702b;
            aVar.e(str);
        } catch (Throwable th) {
            throw th;
        }
        return aVar.f47e;
    }

    public final synchronized boolean h(String str) {
        for (String str2 : g(str)) {
            if (str2.compareTo("password") == 0) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean i() {
        return this.f20703c;
    }

    public final synchronized void j() {
        if (this.f20710j != null) {
            throw new IOException("Connection to " + this.f20708h + " is already in connected state!");
        }
        this.f20704d = true;
    }

    public final synchronized void k(h hVar) {
        this.f20711k = hVar;
    }
}
