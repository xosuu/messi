package s;

import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16607e;

    public f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f16605c = i10;
        this.f16603a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f16603a.get(obj);
                if (obj2 != null) {
                    this.f16606d++;
                    return obj2;
                }
                this.f16607e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f16604b++;
                objPut = this.f16603a.put(obj, obj2);
                if (objPut != null) {
                    this.f16604b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c(this.f16605c);
        return objPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f16604b     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L47
            java.util.LinkedHashMap r0 = r2.f16603a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r2.f16604b     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L47
            goto L14
        L12:
            r3 = move-exception
            goto L66
        L14:
            int r0 = r2.f16604b     // Catch: java.lang.Throwable -> L12
            if (r0 <= r3) goto L45
            java.util.LinkedHashMap r0 = r2.f16603a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L45
        L21:
            java.util.LinkedHashMap r0 = r2.f16603a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r0 = r2.f16603a     // Catch: java.lang.Throwable -> L12
            r0.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r0 = r2.f16604b     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + (-1)
            r2.f16604b = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            goto L0
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            return
        L47:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L12
        L66:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s.f.c(int):void");
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        try {
            i10 = this.f16606d;
            i11 = this.f16607e + i10;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f16605c), Integer.valueOf(this.f16606d), Integer.valueOf(this.f16607e), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }
}
