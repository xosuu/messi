package g4;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f13821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f13822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f13823g;

    public y(int i10) {
        if (i10 != 1) {
            this.f13817a = 1;
            this.f13822f = Collections.emptyList();
            this.f13823g = Collections.emptyList();
            this.f13818b = 1;
            return;
        }
        this.f13817a = 64;
        this.f13818b = 5;
        this.f13821e = new ArrayDeque();
        this.f13822f = new ArrayDeque();
        this.f13823g = new ArrayDeque();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g4.y d(android.util.JsonReader r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.y.d(android.util.JsonReader):g4.y");
    }

    public final synchronized void a(f7.y yVar) {
        ((Deque) this.f13823g).add(yVar);
    }

    public final void b(f7.y yVar) {
        int iC;
        Runnable runnable;
        Deque deque = (Deque) this.f13823g;
        synchronized (this) {
            if (!deque.remove(yVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            iC = c();
            runnable = (Runnable) this.f13819c;
        }
        if (iC != 0 || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final synchronized int c() {
        return ((Deque) this.f13822f).size() + ((Deque) this.f13823g).size();
    }
}
