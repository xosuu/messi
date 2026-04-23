package n1;

import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.ads.fb1;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f15836j = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f15838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f15839c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile s1.g f15842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f15843g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15840d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f15841e = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n.g f15844h = new n.g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.activity.e f15845i = new androidx.activity.e(10, this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15837a = new HashMap();

    public i(p pVar, HashMap map, HashMap map2, String... strArr) {
        this.f15839c = pVar;
        this.f15843g = new g(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f15838b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f15837a.put(lowerCase, Integer.valueOf(i10));
            String str2 = (String) map.get(strArr[i10]);
            if (str2 != null) {
                this.f15838b[i10] = str2.toLowerCase(locale);
            } else {
                this.f15838b[i10] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f15837a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.f15837a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        r1.a aVar = this.f15839c.f15863a;
        if (!(aVar != null && ((s1.b) aVar).f16664a.isOpen())) {
            return false;
        }
        if (!this.f15841e) {
            this.f15839c.f15865c.y();
        }
        return this.f15841e;
    }

    public final void b(r1.a aVar, int i10) {
        s1.b bVar = (s1.b) aVar;
        bVar.e(fb1.h("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i10, ", 0)"));
        String str = this.f15838b[i10];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f15836j;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i10);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.e(sb.toString());
        }
    }

    public final void c(r1.a aVar) {
        if (((s1.b) aVar).f16664a.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock lock = this.f15839c.f15870h.readLock();
                lock.lock();
                try {
                    int[] iArrA = this.f15843g.a();
                    if (iArrA == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrA.length;
                    s1.b bVar = (s1.b) aVar;
                    bVar.a();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = iArrA[i10];
                            if (i11 == 1) {
                                b(aVar, i10);
                            } else if (i11 == 2) {
                                String str = this.f15838b[i10];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f15836j;
                                for (int i12 = 0; i12 < 3; i12++) {
                                    String str2 = strArr[i12];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    ((s1.b) aVar).e(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            bVar.c();
                            throw th;
                        }
                    }
                    bVar.D();
                    bVar.c();
                    g gVar = this.f15843g;
                    synchronized (gVar) {
                        gVar.f15832b = false;
                    }
                    lock.unlock();
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException unused) {
                return;
            }
        }
    }
}
