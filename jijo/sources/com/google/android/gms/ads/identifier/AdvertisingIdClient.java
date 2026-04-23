package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import c4.b;
import c4.c;
import c4.d;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class AdvertisingIdClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s3.a f1938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f1939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h3.a f1942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f1943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1944g;

    public static final class Info {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f1946b;

        @Deprecated
        public Info(String str, boolean z9) {
            this.f1945a = str;
            this.f1946b = z9;
        }

        public String getId() {
            return this.f1945a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f1946b;
        }

        public String toString() {
            String str = this.f1945a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(this.f1946b);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public static void b(Info info, long j10, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (info != null) {
                map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
                String id = info.getId();
                if (id != null) {
                    map.put("ad_id_size", Integer.toString(id.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j10));
            new a(map).start();
        }
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.a(false);
            Info infoC = advertisingIdClient.c();
            b(infoC, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            return infoC;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean z9;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.a(false);
            z3.a.k("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.f1940c) {
                        synchronized (advertisingIdClient.f1941d) {
                            h3.a aVar = advertisingIdClient.f1942e;
                            if (aVar == null || !aVar.f13948f) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.a(false);
                            if (!advertisingIdClient.f1940c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e10) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                        }
                    }
                    z3.a.l(advertisingIdClient.f1938a);
                    z3.a.l(advertisingIdClient.f1939b);
                    try {
                        b bVar = (b) advertisingIdClient.f1939b;
                        bVar.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel parcelM = bVar.m(parcelObtain, 6);
                        int i10 = c4.a.f1563a;
                        z9 = parcelM.readInt() != 0;
                        parcelM.recycle();
                    } catch (RemoteException unused) {
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.d();
            return z9;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z9) {
    }

    public final void a(boolean z9) {
        z3.a.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f1940c) {
                    zza();
                }
                Context context = this.f1943f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = s3.d.f16687b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    s3.a aVar = new s3.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!x3.b.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f1938a = aVar;
                        try {
                            IBinder iBinderA = aVar.a(TimeUnit.MILLISECONDS);
                            int i10 = c.f1565a;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f1939b = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new b(iBinderA);
                            this.f1940c = true;
                            if (z9) {
                                d();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Info c() {
        Info info;
        z3.a.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f1940c) {
                    synchronized (this.f1941d) {
                        h3.a aVar = this.f1942e;
                        if (aVar == null || !aVar.f13948f) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        a(false);
                        if (!this.f1940c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                z3.a.l(this.f1938a);
                z3.a.l(this.f1939b);
                try {
                    b bVar = (b) this.f1939b;
                    bVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelM = bVar.m(parcelObtain, 1);
                    String string = parcelM.readString();
                    parcelM.recycle();
                    b bVar2 = (b) this.f1939b;
                    bVar2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i10 = c4.a.f1563a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelM2 = bVar2.m(parcelObtain2, 2);
                    boolean z9 = parcelM2.readInt() != 0;
                    parcelM2.recycle();
                    info = new Info(string, z9);
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d();
        return info;
    }

    public final void d() {
        synchronized (this.f1941d) {
            h3.a aVar = this.f1942e;
            if (aVar != null) {
                aVar.f13947d.countDown();
                try {
                    this.f1942e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f1944g;
            if (j10 > 0) {
                this.f1942e = new h3.a(this, j10);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return c();
    }

    public void start() {
        a(true);
    }

    public final void zza() {
        z3.a.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f1943f == null || this.f1938a == null) {
                    return;
                }
                try {
                    if (this.f1940c) {
                        x3.b.a().b(this.f1943f, this.f1938a);
                    }
                } catch (Throwable unused) {
                }
                this.f1940c = false;
                this.f1939b = null;
                this.f1938a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public AdvertisingIdClient(Context context, long j10, boolean z9, boolean z10) {
        Context applicationContext;
        this.f1941d = new Object();
        z3.a.l(context);
        if (z9 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f1943f = context;
        this.f1940c = false;
        this.f1944g = j10;
    }
}
