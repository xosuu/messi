package p1;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f16199e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f16200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lock f16201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f16203d;

    public a(String str, File file, boolean z9) {
        Lock reentrantLock;
        File file2 = new File(file, g1.a.y(str, ".lck"));
        this.f16200a = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap map = f16199e;
        synchronized (map) {
            try {
                reentrantLock = (Lock) map.get(absolutePath);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(absolutePath, reentrantLock);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16201b = reentrantLock;
        this.f16202c = z9;
    }

    public final void a() {
        FileChannel fileChannel = this.f16203d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f16201b.unlock();
    }
}
