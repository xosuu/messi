package q2;

import com.androidnetworking.error.ANError;
import com.google.android.gms.internal.ads.fb1;
import f7.q;
import f7.s;
import f7.u;
import f7.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p7.h;
import t8.a0;
import t8.w;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f16391t = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f16392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f16396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f16397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap f16398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f16399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f16400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f16402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y f16403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s2.a f16405n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f16406o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f7.d f16407p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Executor f16408q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f7.w f16409r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f16410s;

    static {
        s.a("application/json; charset=utf-8");
        s.a("text/x-markdown; charset=utf-8");
    }

    public final synchronized void a(ANError aNError) {
        w wVar;
        try {
            if (!this.f16404m && (wVar = this.f16406o) != null) {
                int i10 = a0.Z0;
                wVar.f17093a.u0(0, R.string.pg, 100);
                aNError.getClass();
            }
            this.f16404m = true;
        } catch (Exception unused) {
        }
    }

    public final void b() {
        this.f16405n = null;
        this.f16406o = null;
        t2.a aVarA = t2.a.a();
        aVarA.getClass();
        try {
            aVarA.f16820a.remove(this);
        } catch (Exception unused) {
        }
    }

    public final u c() {
        Iterator it;
        d6.a aVar = new d6.a(4);
        s sVar = u.f13337g;
        if (sVar == null) {
            throw new NullPointerException("type == null");
        }
        if (!sVar.f13335b.equals("multipart")) {
            throw new IllegalArgumentException("multipart != " + sVar);
        }
        aVar.f12464b = sVar;
        try {
            it = this.f16397f.entrySet().iterator();
        } catch (Exception unused) {
        }
        if (it.hasNext()) {
            fb1.t(((Map.Entry) it.next()).getValue());
            throw null;
        }
        Iterator it2 = this.f16400i.entrySet().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) ((Map.Entry) it2.next()).getValue()).iterator();
            if (it3.hasNext()) {
                fb1.t(it3.next());
                throw null;
            }
        }
        if (((List) aVar.f12465d).isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        return new u((h) aVar.f12466f, (s) aVar.f12464b, (List) aVar.f12465d);
    }

    public final String d() {
        String strReplace = this.f16394c;
        for (Map.Entry entry : this.f16399h.entrySet()) {
            strReplace = strReplace.replace(g1.a.r(new StringBuilder("{"), (String) entry.getKey(), "}"), String.valueOf(entry.getValue()));
        }
        z5.b bVar = new z5.b(1);
        z5.b bVarG = (bVar.d(null, strReplace) == 1 ? bVar.a() : null).g();
        HashMap map = this.f16398g;
        if (map != null) {
            for (Map.Entry entry2 : map.entrySet()) {
                String str = (String) entry2.getKey();
                List<String> list = (List) entry2.getValue();
                if (list != null) {
                    for (String str2 : list) {
                        if (str == null) {
                            throw new NullPointerException("name == null");
                        }
                        if (((List) bVarG.f20721i) == null) {
                            bVarG.f20721i = new ArrayList();
                        }
                        ((List) bVarG.f20721i).add(q.a(str, 0, str.length(), " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true, null));
                        ((List) bVarG.f20721i).add(str2 != null ? q.a(str2, 0, str2.length(), " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true, null) : null);
                    }
                }
            }
        }
        return bVarG.a().f13331h;
    }

    public final void e() {
        this.f16404m = true;
        if (this.f16406o == null) {
            b();
            return;
        }
        Executor executor = this.f16408q;
        if (executor != null) {
            executor.execute(new a(0, this));
        } else {
            r2.c.a().f16498a.f16502c.execute(new a(1, this));
        }
    }

    public final String toString() {
        return "ANRequest{sequenceNumber='" + this.f16395d + ", mMethod=0, mPriority=" + this.f16392a + ", mRequestType=" + this.f16393b + ", mUrl=" + this.f16394c + '}';
    }
}
