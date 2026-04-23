package v3;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    public boolean A;
    public volatile zzk B;
    public final AtomicInteger C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile String f17743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d0 f17744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f17745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Looper f17746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c0 f17747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s3.d f17748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f17749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f17750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f17751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s f17752o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f17753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IInterface f17754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f17755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w f17756s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17757t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f17758u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f17759v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f17760w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f17761x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile String f17762y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ConnectionResult f17763z;
    public static final Feature[] D = new Feature[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Context context, Looper looper, int i10, b bVar, c cVar) {
        c0 c0VarA = c0.a(context);
        s3.d dVar = s3.d.f16687b;
        z3.a.l(bVar);
        z3.a.l(cVar);
        this(context, looper, c0VarA, dVar, i10, bVar, cVar, null);
    }

    public static /* bridge */ /* synthetic */ void k(f fVar) {
        int i10;
        int i11;
        synchronized (fVar.f17750m) {
            i10 = fVar.f17757t;
        }
        if (i10 == 3) {
            fVar.A = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        u uVar = fVar.f17749l;
        uVar.sendMessage(uVar.obtainMessage(i11, fVar.C.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean l(f fVar, int i10, int i11, IInterface iInterface) {
        synchronized (fVar.f17750m) {
            try {
                if (fVar.f17757t != i10) {
                    return false;
                }
                fVar.m(i11, iInterface);
                return true;
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iC = this.f17748k.c(this.f17745h, getMinApkVersion());
        int i10 = 23;
        if (iC == 0) {
            connect(new m2.f(i10, this));
            return;
        }
        m(1, null);
        this.f17753p = new m2.f(i10, this);
        int i11 = this.C.get();
        u uVar = this.f17749l;
        uVar.sendMessage(uVar.obtainMessage(3, i11, iC, null));
    }

    public void connect(d dVar) {
        if (dVar == null) {
            throw new NullPointerException("Connection progress callbacks cannot be null.");
        }
        this.f17753p = dVar;
        m(2, null);
    }

    public abstract IInterface d(IBinder iBinder);

    public void disconnect() {
        this.C.incrementAndGet();
        synchronized (this.f17755r) {
            try {
                int size = this.f17755r.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q) this.f17755r.get(i10)).d();
                }
                this.f17755r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f17751n) {
            this.f17752o = null;
        }
        m(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        s sVar;
        synchronized (this.f17750m) {
            i10 = this.f17757t;
            iInterface = this.f17754q;
        }
        synchronized (this.f17751n) {
            sVar = this.f17752o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) h()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (sVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(sVar.f17792a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f17740c > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f17740c;
            printWriterAppend.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.f17739b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f17738a;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f17739b;
            printWriterAppend2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.f17742e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) p7.q.k(this.f17741d));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f17742e;
            printWriterAppend3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    public void e() {
    }

    public Bundle f() {
        return new Bundle();
    }

    public Set g() {
        return Collections.emptySet();
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return D;
    }

    public final Feature[] getAvailableFeatures() {
        zzk zzkVar = this.B;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f2532b;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.f17745h;
    }

    public String getEndpointPackageName() {
        d0 d0Var;
        if (!isConnected() || (d0Var = this.f17744g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) d0Var.f17737f;
    }

    public int getGCoreServiceId() {
        return this.f17760w;
    }

    public String getLastDisconnectMessage() {
        return this.f17743f;
    }

    public final Looper getLooper() {
        return this.f17746i;
    }

    public int getMinApkVersion() {
        return s3.d.f16686a;
    }

    public void getRemoteService(i iVar, Set<Scope> set) {
        Bundle bundleF = f();
        String str = this.f17762y;
        int i10 = s3.d.f16686a;
        Scope[] scopeArr = GetServiceRequest.A;
        Bundle bundle = new Bundle();
        int i11 = this.f17760w;
        Feature[] featureArr = GetServiceRequest.B;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i11, i10, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f2495f = this.f17745h.getPackageName();
        getServiceRequest.f2498s = bundleF;
        if (set != null) {
            getServiceRequest.f2497q = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.f2499t = account;
            if (iVar != null) {
                getServiceRequest.f2496h = iVar.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f2499t = getAccount();
        }
        getServiceRequest.f2500u = D;
        getServiceRequest.f2501v = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.f2504y = true;
        }
        try {
            try {
                synchronized (this.f17751n) {
                    try {
                        s sVar = this.f17752o;
                        if (sVar != null) {
                            sVar.m(new v(this, this.C.get()), getServiceRequest);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                int i12 = this.C.get();
                x xVar = new x(this, 8, null, null);
                u uVar = this.f17749l;
                uVar.sendMessage(uVar.obtainMessage(1, i12, -1, xVar));
            }
        } catch (DeadObjectException unused2) {
            triggerConnectionSuspended(3);
        } catch (SecurityException e10) {
            throw e10;
        }
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.f17750m) {
            try {
                if (this.f17757t == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f17754q;
                z3.a.m(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.f17751n) {
            try {
                s sVar = this.f17752o;
                if (sVar == null) {
                    return null;
                }
                return sVar.f17792a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzk zzkVar = this.B;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f2534f;
    }

    public abstract String h();

    public boolean hasConnectionInfo() {
        return this.B != null;
    }

    public abstract String i();

    public boolean isConnected() {
        boolean z9;
        synchronized (this.f17750m) {
            z9 = this.f17757t == 4;
        }
        return z9;
    }

    public boolean isConnecting() {
        boolean z9;
        synchronized (this.f17750m) {
            int i10 = this.f17757t;
            z9 = true;
            if (i10 != 2 && i10 != 3) {
                z9 = false;
            }
        }
        return z9;
    }

    public boolean j() {
        return getMinApkVersion() >= 211700000;
    }

    public final void m(int i10, IInterface iInterface) {
        d0 d0Var;
        if ((i10 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f17750m) {
            try {
                this.f17757t = i10;
                this.f17754q = iInterface;
                if (i10 == 1) {
                    w wVar = this.f17756s;
                    if (wVar != null) {
                        c0 c0Var = this.f17747j;
                        String str = (String) this.f17744g.f17736d;
                        z3.a.l(str);
                        String str2 = (String) this.f17744g.f17737f;
                        if (this.f17761x == null) {
                            this.f17745h.getClass();
                        }
                        c0Var.c(str, str2, wVar, this.f17744g.f17735b);
                        this.f17756s = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    w wVar2 = this.f17756s;
                    if (wVar2 != null && (d0Var = this.f17744g) != null) {
                        Object obj = d0Var.f17736d;
                        c0 c0Var2 = this.f17747j;
                        String str3 = (String) obj;
                        z3.a.l(str3);
                        String str4 = (String) this.f17744g.f17737f;
                        if (this.f17761x == null) {
                            this.f17745h.getClass();
                        }
                        c0Var2.c(str3, str4, wVar2, this.f17744g.f17735b);
                        this.C.incrementAndGet();
                    }
                    w wVar3 = new w(this, this.C.get());
                    this.f17756s = wVar3;
                    d0 d0Var2 = new d0(i(), j());
                    this.f17744g = d0Var2;
                    if (d0Var2.f17735b && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f17744g.f17736d)));
                    }
                    c0 c0Var3 = this.f17747j;
                    String str5 = (String) this.f17744g.f17736d;
                    z3.a.l(str5);
                    String str6 = (String) this.f17744g.f17737f;
                    String name = this.f17761x;
                    if (name == null) {
                        name = this.f17745h.getClass().getName();
                    }
                    boolean z9 = this.f17744g.f17735b;
                    e();
                    if (!c0Var3.d(new z(str5, str6, z9), wVar3, name, null)) {
                        Object obj2 = this.f17744g.f17736d;
                        int i11 = this.C.get();
                        y yVar = new y(this, 16);
                        u uVar = this.f17749l;
                        uVar.sendMessage(uVar.obtainMessage(7, i11, -1, yVar));
                    }
                } else if (i10 == 4) {
                    z3.a.l(iInterface);
                    this.f17740c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public void onUserSignOut(e eVar) {
        u3.n nVar = (u3.n) eVar;
        nVar.f17591a.f17604y.f17579y.post(new u3.x(2, nVar));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.f17762y = str;
    }

    public void triggerConnectionSuspended(int i10) {
        int i11 = this.C.get();
        u uVar = this.f17749l;
        uVar.sendMessage(uVar.obtainMessage(6, i11, i10));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public f(Context context, Looper looper, c0 c0Var, s3.d dVar, int i10, b bVar, c cVar, String str) {
        this.f17743f = null;
        this.f17750m = new Object();
        this.f17751n = new Object();
        this.f17755r = new ArrayList();
        this.f17757t = 1;
        this.f17763z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        }
        this.f17745h = context;
        if (looper == null) {
            throw new NullPointerException("Looper must not be null");
        }
        this.f17746i = looper;
        if (c0Var != null) {
            this.f17747j = c0Var;
            z3.a.m(dVar, "API availability must not be null");
            this.f17748k = dVar;
            this.f17749l = new u(this, looper);
            this.f17760w = i10;
            this.f17758u = bVar;
            this.f17759v = cVar;
            this.f17761x = str;
            return;
        }
        throw new NullPointerException("Supervisor must not be null");
    }

    public void disconnect(String str) {
        this.f17743f = str;
        disconnect();
    }
}
