package com.google.android.gms.ads.internal.offline.buffering;

import a4.b;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import c2.f;
import c2.j;
import c2.l;
import c2.m;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.pn;

/* JADX INFO: loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final aq f2069s;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2069s = zzay.zza().zzm(context, new pn());
    }

    @Override // androidx.work.Worker
    public final m doWork() {
        try {
            this.f2069s.M(new b(getApplicationContext()), new zza(getInputData().b("uri"), getInputData().b("gws_query_id"), getInputData().b("image_url")));
            return new l(f.f1526b);
        } catch (RemoteException unused) {
            return new j();
        }
    }
}
