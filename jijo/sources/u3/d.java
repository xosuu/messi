package u3;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.ads.fb1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Handler.Callback {
    public static final Status A = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status B = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object C = new Object();
    public static d D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17568b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TelemetryData f17569d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w3.c f17570f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f17571h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s3.c f17572q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f.f f17573s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicInteger f17574t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicInteger f17575u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ConcurrentHashMap f17576v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s.c f17577w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s.c f17578x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4.e f17579y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f17580z;

    public d(Context context, Looper looper) {
        s3.c cVar = s3.c.f16685d;
        this.f17567a = 10000L;
        this.f17568b = false;
        this.f17574t = new AtomicInteger(1);
        this.f17575u = new AtomicInteger(0);
        this.f17576v = new ConcurrentHashMap(5, 0.75f, 1);
        this.f17577w = new s.c(0);
        this.f17578x = new s.c(0);
        this.f17580z = true;
        this.f17571h = context;
        e4.e eVar = new e4.e(looper, this);
        this.f17579y = eVar;
        this.f17572q = cVar;
        this.f17573s = new f.f();
        PackageManager packageManager = context.getPackageManager();
        if (y3.c.f20457f == null) {
            y3.c.f20457f = Boolean.valueOf(z3.a.K() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (y3.c.f20457f.booleanValue()) {
            this.f17580z = false;
        }
        eVar.sendMessage(eVar.obtainMessage(6));
    }

    public static Status c(a aVar, ConnectionResult connectionResult) {
        String str = (String) aVar.f17553b.f9602f;
        String strValueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(17, sb.toString(), connectionResult.f2471d, connectionResult);
    }

    public static d e(Context context) {
        d dVar;
        synchronized (C) {
            try {
                if (D == null) {
                    Looper looper = v3.c0.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = s3.c.f16684c;
                    D = new d(applicationContext, looper);
                }
                dVar = D;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final boolean a() {
        if (this.f17568b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = v3.j.a().f17774a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f2516b) {
            return false;
        }
        int i10 = ((SparseIntArray) this.f17573s.f12832b).get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    public final boolean b(ConnectionResult connectionResult, int i10) {
        s3.c cVar = this.f17572q;
        cVar.getClass();
        Context context = this.f17571h;
        if (z3.a.N(context)) {
            return false;
        }
        int i11 = connectionResult.f2470b;
        PendingIntent activity = connectionResult.f2471d;
        if (!((i11 == 0 || activity == null) ? false : true)) {
            activity = null;
            Intent intentB = cVar.b(i11, context, null);
            if (intentB != null) {
                activity = PendingIntent.getActivity(context, 0, intentB, f4.c.f13089a | 134217728);
            }
        }
        if (activity == null) {
            return false;
        }
        int i12 = GoogleApiActivity.f2477b;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", true);
        cVar.g(context, i11, PendingIntent.getActivity(context, 0, intent, e4.d.f12718a | 134217728));
        return true;
    }

    public final o d(t3.e eVar) {
        a aVar = eVar.f16848e;
        ConcurrentHashMap concurrentHashMap = this.f17576v;
        o oVar = (o) concurrentHashMap.get(aVar);
        if (oVar == null) {
            oVar = new o(this, eVar);
            concurrentHashMap.put(aVar, oVar);
        }
        if (oVar.f17593b.requiresSignIn()) {
            this.f17578x.add(aVar);
        }
        oVar.j();
        return oVar;
    }

    public final void f(ConnectionResult connectionResult, int i10) {
        if (b(connectionResult, i10)) {
            return;
        }
        e4.e eVar = this.f17579y;
        eVar.sendMessage(eVar.obtainMessage(5, i10, 0, connectionResult));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        o oVar;
        Feature[] featureArrB;
        switch (message.what) {
            case 1:
                this.f17567a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f17579y.removeMessages(12);
                for (a aVar : this.f17576v.keySet()) {
                    e4.e eVar = this.f17579y;
                    eVar.sendMessageDelayed(eVar.obtainMessage(12, aVar), this.f17567a);
                }
                return true;
            case 2:
                fb1.t(message.obj);
                throw null;
            case 3:
                for (o oVar2 : this.f17576v.values()) {
                    z3.a.i(oVar2.f17604y.f17579y);
                    oVar2.f17602w = null;
                    oVar2.j();
                }
                return true;
            case 4:
            case 8:
            case 13:
                w wVar = (w) message.obj;
                o oVarD = (o) this.f17576v.get(wVar.f17627c.f16848e);
                if (oVarD == null) {
                    oVarD = d(wVar.f17627c);
                }
                if (!oVarD.f17593b.requiresSignIn() || this.f17575u.get() == wVar.f17626b) {
                    oVarD.k(wVar.f17625a);
                } else {
                    wVar.f17625a.c(A);
                    oVarD.n();
                }
                return true;
            case 5:
                int i10 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it = this.f17576v.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        oVar = (o) it.next();
                        if (oVar.f17598s == i10) {
                        }
                    } else {
                        oVar = null;
                    }
                }
                if (oVar != null) {
                    int i11 = connectionResult.f2470b;
                    if (i11 == 13) {
                        this.f17572q.getClass();
                        AtomicBoolean atomicBoolean = s3.f.f16689a;
                        String strB = ConnectionResult.b(i11);
                        String str = connectionResult.f2472f;
                        StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 69 + String.valueOf(str).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(strB);
                        sb.append(": ");
                        sb.append(str);
                        oVar.b(new Status(17, sb.toString(), null, null));
                    } else {
                        oVar.b(c(oVar.f17594d, connectionResult));
                    }
                } else {
                    new Exception();
                }
                return true;
            case 6:
                if (this.f17571h.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f17571h.getApplicationContext();
                    b bVar = b.f17557h;
                    synchronized (bVar) {
                        try {
                            if (!bVar.f17561f) {
                                application.registerActivityLifecycleCallbacks(bVar);
                                application.registerComponentCallbacks(bVar);
                                bVar.f17561f = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    bVar.a(new m(this));
                    AtomicBoolean atomicBoolean2 = bVar.f17559b;
                    boolean z9 = atomicBoolean2.get();
                    AtomicBoolean atomicBoolean3 = bVar.f17558a;
                    if (!z9) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean3.set(true);
                        }
                    }
                    if (!atomicBoolean3.get()) {
                        this.f17567a = 300000L;
                    }
                }
                return true;
            case 7:
                d((t3.e) message.obj);
                return true;
            case 9:
                if (this.f17576v.containsKey(message.obj)) {
                    o oVar3 = (o) this.f17576v.get(message.obj);
                    z3.a.i(oVar3.f17604y.f17579y);
                    if (oVar3.f17600u) {
                        oVar3.j();
                    }
                }
                return true;
            case 10:
                Iterator it2 = this.f17578x.iterator();
                while (it2.hasNext()) {
                    o oVar4 = (o) this.f17576v.remove((a) it2.next());
                    if (oVar4 != null) {
                        oVar4.n();
                    }
                }
                this.f17578x.clear();
                return true;
            case 11:
                if (this.f17576v.containsKey(message.obj)) {
                    o oVar5 = (o) this.f17576v.get(message.obj);
                    d dVar = oVar5.f17604y;
                    z3.a.i(dVar.f17579y);
                    boolean z10 = oVar5.f17600u;
                    if (z10) {
                        if (z10) {
                            d dVar2 = oVar5.f17604y;
                            e4.e eVar2 = dVar2.f17579y;
                            a aVar2 = oVar5.f17594d;
                            eVar2.removeMessages(11, aVar2);
                            dVar2.f17579y.removeMessages(9, aVar2);
                            oVar5.f17600u = false;
                        }
                        oVar5.b(dVar.f17572q.c(dVar.f17571h, s3.d.f16686a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        oVar5.f17593b.disconnect("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.f17576v.containsKey(message.obj)) {
                    o oVar6 = (o) this.f17576v.get(message.obj);
                    z3.a.i(oVar6.f17604y.f17579y);
                    v3.h hVar = oVar6.f17593b;
                    if (hVar.isConnected() && oVar6.f17597q.size() == 0) {
                        f.f fVar = oVar6.f17595f;
                        if (((Map) fVar.f12832b).isEmpty() && ((Map) fVar.f12833d).isEmpty()) {
                            hVar.disconnect("Timing out service connection.");
                        } else {
                            oVar6.g();
                        }
                    }
                }
                return true;
            case 14:
                fb1.t(message.obj);
                throw null;
            case 15:
                p pVar = (p) message.obj;
                if (this.f17576v.containsKey(pVar.f17605a)) {
                    o oVar7 = (o) this.f17576v.get(pVar.f17605a);
                    if (oVar7.f17601v.contains(pVar) && !oVar7.f17600u) {
                        if (oVar7.f17593b.isConnected()) {
                            oVar7.d();
                        } else {
                            oVar7.j();
                        }
                    }
                }
                return true;
            case 16:
                p pVar2 = (p) message.obj;
                if (this.f17576v.containsKey(pVar2.f17605a)) {
                    o oVar8 = (o) this.f17576v.get(pVar2.f17605a);
                    if (oVar8.f17601v.remove(pVar2)) {
                        d dVar3 = oVar8.f17604y;
                        dVar3.f17579y.removeMessages(15, pVar2);
                        dVar3.f17579y.removeMessages(16, pVar2);
                        Feature feature = pVar2.f17606b;
                        LinkedList<t> linkedList = oVar8.f17592a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (t tVar : linkedList) {
                            if ((tVar instanceof t) && (featureArrB = tVar.b(oVar8)) != null) {
                                int length = featureArrB.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length) {
                                    }
                                    if (!b7.u.i(featureArrB[i12], feature)) {
                                        i12++;
                                    } else if (i12 >= 0) {
                                        arrayList.add(tVar);
                                    }
                                    break;
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            t tVar2 = (t) arrayList.get(i13);
                            linkedList.remove(tVar2);
                            tVar2.d(new UnsupportedApiCallException(feature));
                        }
                    }
                }
                return true;
            case 17:
                TelemetryData telemetryData = this.f17569d;
                if (telemetryData != null) {
                    if (telemetryData.f2520a > 0 || a()) {
                        if (this.f17570f == null) {
                            this.f17570f = new w3.c(this.f17571h, w3.c.f18154i, v3.l.f17777c, t3.d.f16842b);
                        }
                        this.f17570f.d(telemetryData);
                    }
                    this.f17569d = null;
                }
                return true;
            case 18:
                v vVar = (v) message.obj;
                if (vVar.f17623c == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(vVar.f17622b, Arrays.asList(vVar.f17621a));
                    if (this.f17570f == null) {
                        this.f17570f = new w3.c(this.f17571h, w3.c.f18154i, v3.l.f17777c, t3.d.f16842b);
                    }
                    this.f17570f.d(telemetryData2);
                } else {
                    TelemetryData telemetryData3 = this.f17569d;
                    if (telemetryData3 != null) {
                        List list = telemetryData3.f2521b;
                        if (telemetryData3.f2520a != vVar.f17622b || (list != null && list.size() >= vVar.f17624d)) {
                            this.f17579y.removeMessages(17);
                            TelemetryData telemetryData4 = this.f17569d;
                            if (telemetryData4 != null) {
                                if (telemetryData4.f2520a > 0 || a()) {
                                    if (this.f17570f == null) {
                                        this.f17570f = new w3.c(this.f17571h, w3.c.f18154i, v3.l.f17777c, t3.d.f16842b);
                                    }
                                    this.f17570f.d(telemetryData4);
                                }
                                this.f17569d = null;
                            }
                        } else {
                            TelemetryData telemetryData5 = this.f17569d;
                            MethodInvocation methodInvocation = vVar.f17621a;
                            if (telemetryData5.f2521b == null) {
                                telemetryData5.f2521b = new ArrayList();
                            }
                            telemetryData5.f2521b.add(methodInvocation);
                        }
                    }
                    if (this.f17569d == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(vVar.f17621a);
                        this.f17569d = new TelemetryData(vVar.f17622b, arrayList2);
                        e4.e eVar3 = this.f17579y;
                        eVar3.sendMessageDelayed(eVar3.obtainMessage(17), vVar.f17623c);
                    }
                }
                return true;
            case 19:
                this.f17568b = false;
                return true;
            default:
                return false;
        }
    }
}
