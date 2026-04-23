package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ia implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ja f5547b;

    public /* synthetic */ ia(ja jaVar, int i10) {
        this.f5546a = i10;
        this.f5547b = jaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5546a) {
            case 0:
                ja jaVar = this.f5547b;
                jaVar.getClass();
                try {
                    if (jaVar.f5855f == null && jaVar.f5858i) {
                        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(jaVar.f5850a);
                        advertisingIdClient.start();
                        jaVar.f5855f = advertisingIdClient;
                        break;
                    }
                } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
                    jaVar.f5855f = null;
                    return;
                }
                break;
            default:
                eg.a(this.f5547b.f5850a);
                break;
        }
    }
}
