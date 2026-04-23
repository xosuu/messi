package h3;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f13945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13946b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CountDownLatch f13947d = new CountDownLatch(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13948f = false;

    public a(AdvertisingIdClient advertisingIdClient, long j10) {
        this.f13945a = new WeakReference(advertisingIdClient);
        this.f13946b = j10;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.f13945a;
        try {
            if (this.f13947d.await(this.f13946b, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.f13948f = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f13948f = true;
            }
        }
    }
}
