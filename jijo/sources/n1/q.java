package n1;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class q implements r1.e, Closeable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final TreeMap f15872u = new TreeMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f15873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f15874b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f15875d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f15876f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[][] f15877h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f15878q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f15879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15880t;

    public q(int i10) {
        this.f15879s = i10;
        int i11 = i10 + 1;
        this.f15878q = new int[i11];
        this.f15874b = new long[i11];
        this.f15875d = new double[i11];
        this.f15876f = new String[i11];
        this.f15877h = new byte[i11][];
    }

    public static q a(int i10, String str) {
        TreeMap treeMap = f15872u;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    q qVar = new q(i10);
                    qVar.f15873a = str;
                    qVar.f15880t = i10;
                    return qVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                q qVar2 = (q) entryCeilingEntry.getValue();
                qVar2.f15873a = str;
                qVar2.f15880t = i10;
                return qVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A(int i10) {
        this.f15878q[i10] = 1;
    }

    public final void D(int i10, String str) {
        this.f15878q[i10] = 4;
        this.f15876f[i10] = str;
    }

    public final void E() {
        TreeMap treeMap = f15872u;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f15879s), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }

    @Override // r1.e
    public final String c() {
        return this.f15873a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void e(int i10, long j10) {
        this.f15878q[i10] = 2;
        this.f15874b[i10] = j10;
    }

    @Override // r1.e
    public final void u(s1.f fVar) {
        for (int i10 = 1; i10 <= this.f15880t; i10++) {
            int i11 = this.f15878q[i10];
            if (i11 == 1) {
                fVar.u(i10);
            } else if (i11 == 2) {
                fVar.e(i10, this.f15874b[i10]);
            } else if (i11 == 3) {
                fVar.c(i10, this.f15875d[i10]);
            } else if (i11 == 4) {
                fVar.A(i10, this.f15876f[i10]);
            } else if (i11 == 5) {
                fVar.a(this.f15877h[i10], i10);
            }
        }
    }
}
