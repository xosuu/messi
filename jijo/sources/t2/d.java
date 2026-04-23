package t2;

import android.net.TrafficStats;
import com.androidnetworking.error.ANError;
import f7.b0;
import f7.d0;
import f7.u;
import f7.v;
import f7.w;
import f7.y;
import f7.z;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f16826a;

    static {
        w wVar = f16826a;
        if (wVar == null) {
            v vVar = new v(new w());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            vVar.f13365v = g7.b.c(60L, timeUnit);
            vVar.f13366w = g7.b.c(60L, timeUnit);
            vVar.f13367x = g7.b.c(60L, timeUnit);
            wVar = new w(vVar);
        }
        f16826a = wVar;
    }

    public static void a(n3.b bVar, q2.c cVar) {
        String str = cVar.f16410s;
        if (str != null) {
            f7.e eVar = (f7.e) bVar.f15932d;
            eVar.getClass();
            f7.e.b("User-Agent", str);
            eVar.a("User-Agent", str);
        }
        ArrayList arrayList = new ArrayList(20);
        try {
            HashMap map = cVar.f16396e;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List<String> list = (List) entry.getValue();
                    if (list != null) {
                        for (String str3 : list) {
                            f7.e.b(str2, str3);
                            arrayList.add(str2);
                            arrayList.add(str3.trim());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        f7.e eVar2 = new f7.e();
        Collections.addAll(eVar2.f13250a, strArr);
        bVar.f15932d = eVar2;
        if (cVar.f16410s != null) {
            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
            int length = strArr.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                treeSet.add(strArr[i10 * 2]);
            }
            if (Collections.unmodifiableSet(treeSet).contains("User-Agent")) {
                return;
            }
            String str4 = cVar.f16410s;
            f7.e eVar3 = (f7.e) bVar.f15932d;
            eVar3.getClass();
            f7.e.b("User-Agent", str4);
            eVar3.a("User-Agent", str4);
        }
    }

    public static b0 b(q2.c cVar) throws Throwable {
        w wVar;
        try {
            n3.b bVar = new n3.b(3);
            bVar.h(cVar.d());
            a(bVar, cVar);
            bVar.f("GET", null);
            f7.d dVar = cVar.f16407p;
            if (dVar != null) {
                bVar.d(dVar);
            }
            z zVarB = bVar.b();
            w wVar2 = cVar.f16409r;
            w wVar3 = f16826a;
            int i10 = 0;
            if (wVar2 != null) {
                v vVar = new v(wVar2);
                wVar3.getClass();
                vVar.f13349f.add(new c(cVar, i10));
                wVar = new w(vVar);
            } else {
                wVar3.getClass();
                v vVar2 = new v(wVar3);
                vVar2.f13349f.add(new c(cVar, 1));
                wVar = new w(vVar2);
            }
            cVar.f16403l = y.c(wVar, zVarB, false);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            b0 b0VarA = cVar.f16403l.a();
            g4.z.x(b0VarA, cVar.f16401j, cVar.f16402k);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (b0VarA.f13227u == null) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                d0 d0Var = b0VarA.f13225s;
                q2.d.a().b((totalRxBytes == -1 || totalRxBytes2 == -1) ? d0Var.a() : totalRxBytes2 - totalRxBytes, jCurrentTimeMillis2);
                d0Var.a();
                r2.c.a().f16498a.f16502c.execute(new v2.a());
            }
            return b0VarA;
        } catch (IOException e10) {
            try {
                File file = new File(cVar.f16401j + File.separator + cVar.f16402k);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            throw new ANError(e10);
        }
    }

    public static b0 c(q2.c cVar) throws ANError {
        try {
            n3.b bVar = new n3.b(3);
            bVar.h(cVar.d());
            a(bVar, cVar);
            bVar.f("GET", null);
            f7.d dVar = cVar.f16407p;
            if (dVar != null) {
                bVar.d(dVar);
            }
            z zVarB = bVar.b();
            w wVar = cVar.f16409r;
            w wVar2 = f16826a;
            if (wVar != null) {
                v vVar = new v(wVar);
                wVar2.getClass();
                cVar.f16403l = y.c(new w(vVar), zVarB, false);
            } else {
                wVar2.getClass();
                cVar.f16403l = y.c(wVar2, zVarB, false);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            b0 b0VarA = cVar.f16403l.a();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (b0VarA.f13227u == null) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                d0 d0Var = b0VarA.f13225s;
                q2.d.a().b((totalRxBytes == -1 || totalRxBytes2 == -1) ? d0Var.a() : totalRxBytes2 - totalRxBytes, jCurrentTimeMillis2);
                d0Var.a();
                r2.c.a().f16498a.f16502c.execute(new v2.a());
            }
            return b0VarA;
        } catch (IOException e10) {
            throw new ANError(e10);
        }
    }

    public static b0 d(q2.c cVar) throws ANError {
        try {
            n3.b bVar = new n3.b(3);
            bVar.h(cVar.d());
            a(bVar, cVar);
            u uVarC = cVar.c();
            uVarC.h();
            bVar.f("POST", new g(uVarC, new q2.b(cVar, 0)));
            f7.d dVar = cVar.f16407p;
            if (dVar != null) {
                bVar.d(dVar);
            }
            z zVarB = bVar.b();
            w wVar = cVar.f16409r;
            w wVar2 = f16826a;
            if (wVar != null) {
                v vVar = new v(wVar);
                wVar2.getClass();
                cVar.f16403l = y.c(new w(vVar), zVarB, false);
            } else {
                wVar2.getClass();
                cVar.f16403l = y.c(wVar2, zVarB, false);
            }
            System.currentTimeMillis();
            b0 b0VarA = cVar.f16403l.a();
            System.currentTimeMillis();
            return b0VarA;
        } catch (IOException e10) {
            throw new ANError(e10);
        }
    }
}
