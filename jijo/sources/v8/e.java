package v8;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile boolean f17934h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f17935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutputStream f17936b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17937d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f17938f;

    static {
        NativeUtil.classesInit0(25);
    }

    public e(d dVar, Socket socket, Socket socket2, boolean z9) {
        this.f17935a = socket.getInputStream();
        this.f17936b = socket2.getOutputStream();
        this.f17937d = z9;
        this.f17938f = dVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final native void run();
}
