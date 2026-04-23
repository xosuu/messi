package g6;

import b4.e;
import java.util.Collections;
import java.util.LinkedList;
import l.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c6.a f13883a = c6.a.a(b.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedList f13884b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Thread f13885c = null;

    public static final a a(j jVar, long j10) {
        a aVar = new a();
        aVar.f13881a = j10;
        aVar.f13882b = jVar;
        LinkedList linkedList = f13884b;
        synchronized (linkedList) {
            try {
                linkedList.add(aVar);
                Collections.sort(linkedList);
                Thread thread = f13885c;
                if (thread != null) {
                    thread.interrupt();
                } else {
                    e eVar = new e();
                    f13885c = eVar;
                    eVar.setDaemon(true);
                    f13885c.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static final void b(a aVar) {
        LinkedList linkedList = f13884b;
        synchronized (linkedList) {
            try {
                linkedList.remove(aVar);
                Thread thread = f13885c;
                if (thread != null) {
                    thread.interrupt();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
