package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class yt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qu f11029b;

    public yt(Context context, qu quVar) {
        this.f11028a = context;
        this.f11029b = quVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qu quVar = this.f11029b;
        try {
            quVar.b(AdvertisingIdClient.getAdvertisingIdInfo(this.f11028a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            quVar.c(e10);
            zzm.zzh("Exception while getting advertising Id info", e10);
        }
    }
}
