package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class ar0 implements OnAdMetadataChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IInterface f2779b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pb f2780d;

    public /* synthetic */ ar0(pb pbVar, IInterface iInterface, int i10) {
        this.f2778a = i10;
        this.f2779b = iInterface;
        this.f2780d = pbVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        int i10 = this.f2778a;
        IInterface iInterface = this.f2779b;
        pb pbVar = this.f2780d;
        switch (i10) {
            case 0:
                if (((br0) pbVar).f3091u != null) {
                    try {
                        ((zzdd) iInterface).zze();
                    } catch (RemoteException e10) {
                        zzm.zzl("#007 Could not call remote method.", e10);
                        return;
                    }
                }
                break;
            default:
                if (((cr0) pbVar).f3404f != null) {
                    try {
                        ((zzby) iInterface).zze();
                    } catch (RemoteException e11) {
                        zzm.zzl("#007 Could not call remote method.", e11);
                    }
                }
                break;
        }
    }
}
