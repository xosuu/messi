package t2;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f16819c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f16820a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f16821b = new AtomicInteger();

    public static a a() {
        if (f16819c == null) {
            synchronized (a.class) {
                try {
                    if (f16819c == null) {
                        f16819c = new a();
                    }
                } finally {
                }
            }
        }
        return f16819c;
    }
}
