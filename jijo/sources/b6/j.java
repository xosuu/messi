package b6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f1386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f1387b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1388d = new byte[8192];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f1389f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f1390h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Socket f1391q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f1392s;

    public j(a aVar, j jVar, Socket socket, InputStream inputStream, OutputStream outputStream, String str) {
        this.f1387b = inputStream;
        this.f1386a = outputStream;
        this.f1392s = str;
        this.f1389f = aVar;
        this.f1390h = jVar;
        this.f1391q = socket;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte[] bArr = this.f1388d;
        Socket socket = this.f1391q;
        String str = this.f1392s;
        a aVar = this.f1389f;
        InputStream inputStream = this.f1387b;
        OutputStream outputStream = this.f1386a;
        j jVar = this.f1390h;
        while (true) {
            try {
                try {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    } else {
                        outputStream.write(bArr, 0, i10);
                        outputStream.flush();
                    }
                } catch (IOException e10) {
                    try {
                        aVar.f1343b.e(aVar, "Closed due to exception in StreamForwarder (" + str + "): " + e10.getMessage());
                    } catch (IOException unused2) {
                    }
                    try {
                        outputStream.close();
                    } catch (IOException unused3) {
                    }
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                    if (jVar == null) {
                        return;
                    }
                    while (jVar.isAlive()) {
                        try {
                            jVar.join();
                        } catch (InterruptedException unused5) {
                        }
                    }
                    try {
                        aVar.f1343b.e(aVar, "StreamForwarder (" + str + ") is cleaning up the connection");
                    } catch (IOException unused6) {
                    }
                    if (socket == null) {
                        return;
                    }
                }
            } finally {
            }
        }
        outputStream.close();
        try {
            inputStream.close();
        } catch (IOException unused7) {
        }
        if (jVar != null) {
            while (jVar.isAlive()) {
                try {
                    jVar.join();
                } catch (InterruptedException unused8) {
                }
            }
            try {
                aVar.f1343b.e(aVar, "StreamForwarder (" + str + ") is cleaning up the connection");
            } catch (IOException unused9) {
            }
            if (socket == null) {
                return;
            }
            try {
                socket.close();
            } catch (IOException unused10) {
            }
        }
    }
}
