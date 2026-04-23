package u3;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.internal.ads.fb1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o implements t3.f, t3.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v3.h f17593b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f17594d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.f f17595f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f17598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f17599t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17600u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f17604y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f17592a = new LinkedList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet f17596h = new HashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f17597q = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f17601v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ConnectionResult f17602w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17603x = 0;

    public o(d dVar, t3.e eVar) {
        this.f17604y = dVar;
        Looper looper = dVar.f17579y.getLooper();
        v3.g gVarC = eVar.b().c();
        t3.i iVar = (t3.i) eVar.f16846c.f9600b;
        z3.a.l(iVar);
        v3.h hVarA = iVar.a(eVar.f16844a, looper, gVarC, eVar.f16847d, this, this);
        String str = eVar.f16845b;
        if (str != null) {
            hVarA.setAttributionTag(str);
        }
        this.f17593b = hVarA;
        this.f17594d = eVar.f16848e;
        this.f17595f = new f.f(19);
        this.f17598s = eVar.f16849f;
        if (!hVarA.requiresSignIn()) {
            this.f17599t = null;
            return;
        }
        this.f17599t = new y(dVar.f17571h, dVar.f17579y, eVar.b().c());
    }

    public final void a(ConnectionResult connectionResult) {
        HashSet hashSet = this.f17596h;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        fb1.t(it.next());
        if (b7.u.i(connectionResult, ConnectionResult.f2468h)) {
            this.f17593b.getEndpointPackageName();
        }
        throw null;
    }

    @Override // u3.c
    public final void a0() {
        Looper looperMyLooper = Looper.myLooper();
        d dVar = this.f17604y;
        if (looperMyLooper == dVar.f17579y.getLooper()) {
            e();
        } else {
            dVar.f17579y.post(new x(1, this));
        }
    }

    public final void b(Status status) {
        z3.a.i(this.f17604y.f17579y);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z9) {
        z3.a.i(this.f17604y.f17579y);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f17592a.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            if (!z9 || tVar.f17615a == 2) {
                if (status != null) {
                    tVar.c(status);
                } else {
                    tVar.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f17592a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = (t) arrayList.get(i10);
            if (!this.f17593b.isConnected()) {
                return;
            }
            if (h(tVar)) {
                linkedList.remove(tVar);
            }
        }
    }

    public final void e() {
        d dVar = this.f17604y;
        z3.a.i(dVar.f17579y);
        this.f17602w = null;
        a(ConnectionResult.f2468h);
        if (this.f17600u) {
            e4.e eVar = dVar.f17579y;
            a aVar = this.f17594d;
            eVar.removeMessages(11, aVar);
            dVar.f17579y.removeMessages(9, aVar);
            this.f17600u = false;
        }
        Iterator it = this.f17597q.values().iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            throw null;
        }
        d();
        g();
    }

    public final void f(int i10) {
        d dVar = this.f17604y;
        z3.a.i(dVar.f17579y);
        this.f17602w = null;
        this.f17600u = true;
        String lastDisconnectMessage = this.f17593b.getLastDisconnectMessage();
        f.f fVar = this.f17595f;
        fVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        fVar.J(true, new Status(20, sb.toString(), null, null));
        e4.e eVar = dVar.f17579y;
        a aVar = this.f17594d;
        eVar.sendMessageDelayed(Message.obtain(eVar, 9, aVar), 5000L);
        e4.e eVar2 = dVar.f17579y;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 11, aVar), 120000L);
        ((SparseIntArray) dVar.f17573s.f12832b).clear();
        Iterator it = this.f17597q.values().iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            throw null;
        }
    }

    public final void g() {
        d dVar = this.f17604y;
        e4.e eVar = dVar.f17579y;
        a aVar = this.f17594d;
        eVar.removeMessages(12, aVar);
        e4.e eVar2 = dVar.f17579y;
        eVar2.sendMessageDelayed(eVar2.obtainMessage(12, aVar), dVar.f17567a);
    }

    public final boolean h(t tVar) {
        Feature feature;
        if (!(tVar instanceof t)) {
            v3.h hVar = this.f17593b;
            tVar.f(this.f17595f, hVar.requiresSignIn());
            try {
                tVar.e(this);
            } catch (DeadObjectException unused) {
                m(1);
                hVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Feature[] featureArrB = tVar.b(this);
        if (featureArrB == null || featureArrB.length == 0) {
            feature = null;
        } else {
            Feature[] availableFeatures = this.f17593b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            s.b bVar = new s.b(availableFeatures.length);
            for (Feature feature2 : availableFeatures) {
                bVar.put(feature2.f2473a, Long.valueOf(feature2.b()));
            }
            int length = featureArrB.length;
            for (int i10 = 0; i10 < length; i10++) {
                feature = featureArrB[i10];
                Long l9 = (Long) bVar.getOrDefault(feature.f2473a, null);
                if (l9 == null || l9.longValue() < feature.b()) {
                    break;
                }
            }
            feature = null;
        }
        if (feature == null) {
            v3.h hVar2 = this.f17593b;
            tVar.f(this.f17595f, hVar2.requiresSignIn());
            try {
                tVar.e(this);
            } catch (DeadObjectException unused2) {
                m(1);
                hVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        new StringBuilder(this.f17593b.getClass().getName().length() + 77 + String.valueOf(feature.f2473a).length());
        if (!this.f17604y.f17580z || !tVar.a(this)) {
            tVar.d(new UnsupportedApiCallException(feature));
            return true;
        }
        p pVar = new p(this.f17594d, feature);
        int iIndexOf = this.f17601v.indexOf(pVar);
        if (iIndexOf >= 0) {
            p pVar2 = (p) this.f17601v.get(iIndexOf);
            this.f17604y.f17579y.removeMessages(15, pVar2);
            e4.e eVar = this.f17604y.f17579y;
            Message messageObtain = Message.obtain(eVar, 15, pVar2);
            this.f17604y.getClass();
            eVar.sendMessageDelayed(messageObtain, 5000L);
        } else {
            this.f17601v.add(pVar);
            e4.e eVar2 = this.f17604y.f17579y;
            Message messageObtain2 = Message.obtain(eVar2, 15, pVar);
            this.f17604y.getClass();
            eVar2.sendMessageDelayed(messageObtain2, 5000L);
            e4.e eVar3 = this.f17604y.f17579y;
            Message messageObtain3 = Message.obtain(eVar3, 16, pVar);
            this.f17604y.getClass();
            eVar3.sendMessageDelayed(messageObtain3, 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (!i(connectionResult)) {
                this.f17604y.b(connectionResult, this.f17598s);
            }
        }
        return false;
    }

    public final boolean i(ConnectionResult connectionResult) {
        synchronized (d.C) {
            this.f17604y.getClass();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [i4.c, v3.h] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j() {
        d dVar = this.f17604y;
        z3.a.i(dVar.f17579y);
        v3.h hVar = this.f17593b;
        if (hVar.isConnected() || hVar.isConnecting()) {
            return;
        }
        try {
            int I = dVar.f17573s.I(dVar.f17571h, hVar);
            if (I != 0) {
                ConnectionResult connectionResult = new ConnectionResult(I, null);
                new StringBuilder(hVar.getClass().getName().length() + 35 + connectionResult.toString().length());
                l(connectionResult, null);
                return;
            }
            q qVar = new q(dVar, hVar, this.f17594d);
            if (hVar.requiresSignIn()) {
                y yVar = this.f17599t;
                z3.a.l(yVar);
                i4.c cVar = yVar.f17636q;
                if (cVar != null) {
                    cVar.disconnect();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(yVar));
                v3.g gVar = yVar.f17635h;
                gVar.f17771h = numValueOf;
                w3.b bVar = yVar.f17633d;
                Context context = yVar.f17631a;
                Handler handler = yVar.f17632b;
                yVar.f17636q = bVar.a(context, handler.getLooper(), gVar, gVar.f17770g, yVar, yVar);
                yVar.f17637s = qVar;
                Set set = yVar.f17634f;
                if (set == null || set.isEmpty()) {
                    handler.post(new x(0, yVar));
                } else {
                    yVar.f17636q.c();
                }
            }
            try {
                hVar.connect(qVar);
            } catch (SecurityException e10) {
                l(new ConnectionResult(10), e10);
            }
        } catch (IllegalStateException e11) {
            l(new ConnectionResult(10), e11);
        }
    }

    public final void k(t tVar) {
        z3.a.i(this.f17604y.f17579y);
        boolean zIsConnected = this.f17593b.isConnected();
        LinkedList linkedList = this.f17592a;
        if (zIsConnected) {
            if (h(tVar)) {
                g();
                return;
            } else {
                linkedList.add(tVar);
                return;
            }
        }
        linkedList.add(tVar);
        ConnectionResult connectionResult = this.f17602w;
        if (connectionResult == null || connectionResult.f2470b == 0 || connectionResult.f2471d == null) {
            j();
        } else {
            l(connectionResult, null);
        }
    }

    public final void l(ConnectionResult connectionResult, RuntimeException runtimeException) {
        i4.c cVar;
        z3.a.i(this.f17604y.f17579y);
        y yVar = this.f17599t;
        if (yVar != null && (cVar = yVar.f17636q) != null) {
            cVar.disconnect();
        }
        z3.a.i(this.f17604y.f17579y);
        this.f17602w = null;
        ((SparseIntArray) this.f17604y.f17573s.f12832b).clear();
        a(connectionResult);
        if ((this.f17593b instanceof w3.d) && connectionResult.f2470b != 24) {
            d dVar = this.f17604y;
            dVar.f17568b = true;
            e4.e eVar = dVar.f17579y;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        if (connectionResult.f2470b == 4) {
            b(d.B);
            return;
        }
        if (this.f17592a.isEmpty()) {
            this.f17602w = connectionResult;
            return;
        }
        if (runtimeException != null) {
            z3.a.i(this.f17604y.f17579y);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f17604y.f17580z) {
            b(d.c(this.f17594d, connectionResult));
            return;
        }
        c(d.c(this.f17594d, connectionResult), null, true);
        if (this.f17592a.isEmpty() || i(connectionResult) || this.f17604y.b(connectionResult, this.f17598s)) {
            return;
        }
        if (connectionResult.f2470b == 18) {
            this.f17600u = true;
        }
        if (!this.f17600u) {
            b(d.c(this.f17594d, connectionResult));
            return;
        }
        e4.e eVar2 = this.f17604y.f17579y;
        Message messageObtain = Message.obtain(eVar2, 9, this.f17594d);
        this.f17604y.getClass();
        eVar2.sendMessageDelayed(messageObtain, 5000L);
    }

    @Override // u3.c
    public final void m(int i10) {
        Looper looperMyLooper = Looper.myLooper();
        d dVar = this.f17604y;
        if (looperMyLooper == dVar.f17579y.getLooper()) {
            f(i10);
        } else {
            dVar.f17579y.post(new k2.e(i10, 1, this));
        }
    }

    public final void n() {
        z3.a.i(this.f17604y.f17579y);
        Status status = d.A;
        b(status);
        f.f fVar = this.f17595f;
        fVar.getClass();
        fVar.J(false, status);
        for (g gVar : (g[]) this.f17597q.keySet().toArray(new g[0])) {
            k(new a0(new k4.e()));
        }
        a(new ConnectionResult(4));
        v3.h hVar = this.f17593b;
        if (hVar.isConnected()) {
            hVar.onUserSignOut(new n(this));
        }
    }

    @Override // u3.h
    public final void t(ConnectionResult connectionResult) {
        l(connectionResult, null);
    }
}
