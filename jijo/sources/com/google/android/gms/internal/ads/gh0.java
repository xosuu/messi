package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzj;

/* JADX INFO: loaded from: classes.dex */
public final class gh0 extends f.h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SparseArray f4918h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g4.c f4920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TelephonyManager f4921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dh0 f4922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qf f4923g;

    static {
        SparseArray sparseArray = new SparseArray();
        f4918h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), yd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        yd ydVar = yd.CONNECTING;
        sparseArray.put(iOrdinal, ydVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), ydVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), ydVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), yd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        yd ydVar2 = yd.DISCONNECTED;
        sparseArray.put(iOrdinal2, ydVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), ydVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), ydVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), ydVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), ydVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), yd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), ydVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), ydVar);
    }

    public gh0(Context context, g4.c cVar, dh0 dh0Var, m20 m20Var, zzj zzjVar) {
        super(m20Var, zzjVar);
        this.f4919c = context;
        this.f4920d = cVar;
        this.f4922f = dh0Var;
        this.f4921e = (TelephonyManager) context.getSystemService("phone");
    }
}
