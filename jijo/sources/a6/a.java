package a6;

import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.i2;
import d6.b;
import f6.d;
import f6.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Vector;
import l.a0;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f43a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f46d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vector f44b = new Vector();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f47e = new String[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f48f = false;

    public a(i iVar) {
        this.f43a = iVar;
    }

    @Override // f6.d
    public final void a(IOException iOException) {
        synchronized (this.f44b) {
            this.f45c = true;
            this.f44b.notifyAll();
        }
    }

    @Override // f6.d
    public final void b(byte[] bArr, int i10) {
        synchronized (this.f44b) {
            try {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, 0, bArr2, 0, i10);
                this.f44b.addElement(bArr2);
                this.f44b.notifyAll();
                if (this.f44b.size() > 5) {
                    this.f45c = true;
                    throw new IOException("Error, peer is flooding us with authentication packets.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(String str, String str2) throws IOException {
        i iVar = this.f43a;
        try {
            e(str);
            String[] strArr = this.f47e;
            if (strArr != null) {
                for (String str3 : strArr) {
                    if (str3.compareTo("password") == 0) {
                        b bVar = new b();
                        bVar.c(50);
                        bVar.g(str);
                        bVar.g("ssh-connection");
                        bVar.g("password");
                        bVar.b(false);
                        bVar.g(str2);
                        iVar.n(bVar.a());
                        byte[] bArrD = d();
                        byte b10 = bArrD[0];
                        if (b10 == 52) {
                            iVar.k(this);
                            return true;
                        }
                        if (b10 != 51) {
                            throw new IOException("Unexpected SSH message (type " + ((int) bArrD[0]) + ")");
                        }
                        int length = bArrD.length;
                        System.arraycopy(bArrD, 0, new byte[length], 0, length);
                        i2 i2Var = new i2(bArrD, 0, length);
                        int iB = i2Var.b();
                        if (iB != 51) {
                            throw new IOException("This is not a SSH_MSG_USERAUTH_FAILURE! (" + iB + ")");
                        }
                        String[] strArrF = i2Var.f();
                        i2Var.a();
                        if (i2Var.j() != 0) {
                            throw new IOException("Padding in SSH_MSG_USERAUTH_FAILURE packet!");
                        }
                        this.f47e = strArrF;
                        return false;
                    }
                }
            }
            throw new IOException("Authentication method password not supported by the server at this stage.");
        } catch (IOException e10) {
            iVar.c(e10, false);
            throw new IOException("Password authentication failed.", e10);
        }
    }

    public final byte[] d() throws IOException {
        byte[] bArr;
        while (true) {
            synchronized (this.f44b) {
                while (this.f44b.size() == 0) {
                    if (this.f45c) {
                        throw new IOException("The connection is closed.", this.f43a.g());
                    }
                    try {
                        this.f44b.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                bArr = (byte[]) this.f44b.firstElement();
                this.f44b.removeElementAt(0);
            }
            if (bArr[0] != 53) {
                return bArr;
            }
            int length = bArr.length;
            System.arraycopy(bArr, 0, new byte[length], 0, length);
            i2 i2Var = new i2(bArr, 0, length);
            int iB = i2Var.b();
            if (iB != 53) {
                throw new IOException(fb1.h("This is not a SSH_MSG_USERAUTH_BANNER! (", iB, ")"));
            }
            String strH = i2Var.h(StandardStringDigester.MESSAGE_CHARSET);
            i2Var.g();
            if (i2Var.j() != 0) {
                throw new IOException("Padding in SSH_MSG_USERAUTH_REQUEST packet!");
            }
            this.f46d = strH;
        }
    }

    public final void e(String str) throws IOException {
        if (this.f48f) {
            return;
        }
        i iVar = this.f43a;
        iVar.j(this, 0, 255);
        b bVar = new b();
        bVar.c(5);
        bVar.g("ssh-userauth");
        iVar.n(bVar.a());
        b bVar2 = new b();
        bVar2.c(50);
        bVar2.g(str);
        bVar2.g("ssh-connection");
        bVar2.g("none");
        iVar.n(bVar2.a());
        byte[] bArrD = d();
        int length = bArrD.length;
        System.arraycopy(bArrD, 0, new byte[length], 0, length);
        i2 i2Var = new i2(bArrD, 0, length);
        int iB = i2Var.b();
        if (iB != 6) {
            throw new IOException(fb1.h("This is not a SSH_MSG_SERVICE_ACCEPT! (", iB, ")"));
        }
        if (i2Var.j() > 0) {
            i2Var.g();
        }
        if (i2Var.j() != 0) {
            throw new IOException("Padding in SSH_MSG_SERVICE_ACCEPT packet!");
        }
        byte[] bArrD2 = d();
        this.f48f = true;
        byte b10 = bArrD2[0];
        if (b10 == 52) {
            iVar.k(this);
            return;
        }
        if (b10 != 51) {
            throw new IOException(a0.h(new StringBuilder("Unexpected SSH message (type "), bArrD2[0], ")"));
        }
        int length2 = bArrD2.length;
        System.arraycopy(bArrD2, 0, new byte[length2], 0, length2);
        i2 i2Var2 = new i2(bArrD2, 0, length2);
        int iB2 = i2Var2.b();
        if (iB2 != 51) {
            throw new IOException(fb1.h("This is not a SSH_MSG_USERAUTH_FAILURE! (", iB2, ")"));
        }
        String[] strArrF = i2Var2.f();
        i2Var2.a();
        if (i2Var2.j() != 0) {
            throw new IOException("Padding in SSH_MSG_USERAUTH_FAILURE packet!");
        }
        this.f47e = strArrF;
    }
}
