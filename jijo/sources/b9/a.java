package b9;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import r0.c;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f1487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BufferedReader f1488b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1489d;

    static {
        NativeUtil.classesInit0(27);
    }

    public a(InputStream inputStream, c cVar) {
        this.f1488b = new BufferedReader(new InputStreamReader(inputStream));
        this.f1487a = cVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final native void run();
}
