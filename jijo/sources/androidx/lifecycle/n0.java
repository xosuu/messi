package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f989a = new HashMap();

    public final void a() {
        for (k0 k0Var : this.f989a.values()) {
            HashMap map = k0Var.f978a;
            if (map != null) {
                synchronized (map) {
                    try {
                        for (Object obj : k0Var.f978a.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = k0Var.f979b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : k0Var.f979b) {
                            if (closeable instanceof Closeable) {
                                try {
                                    closeable.close();
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            k0Var.a();
        }
        this.f989a.clear();
    }
}
