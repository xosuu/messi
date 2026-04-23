package team.dev.epro.apkcustom.sockets.v2ray;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import r0.c;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f17358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BufferedReader f17359b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17360d;

    static {
        NativeUtil.classesInit0(42);
    }

    public b(InputStream inputStream, c cVar) {
        this.f17359b = new BufferedReader(new InputStreamReader(inputStream));
        this.f17358a = cVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final native void run();
}
