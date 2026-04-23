package com.google.android.gms.ads.internal.client;

import a4.b;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.jb;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.vm;
import com.google.android.gms.internal.ads.zzbkv;
import j3.k;
import j3.q;
import j3.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import z3.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzej {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static zzej f2025i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zzco f2031f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2026a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2028c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2029d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2030e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OnAdInspectorClosedListener f2032g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RequestConfiguration f2033h = new RequestConfiguration.Builder().build();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2027b = new ArrayList();

    public static jb b(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbkv zzbkvVar = (zzbkv) it.next();
            map.put(zzbkvVar.f11500a, new am(zzbkvVar.f11501b ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbkvVar.f11503f, zzbkvVar.f11502d));
        }
        return new jb(map);
    }

    public static zzej zzf() {
        zzej zzejVar;
        synchronized (zzej.class) {
            try {
                if (f2025i == null) {
                    f2025i = new zzej();
                }
                zzejVar = f2025i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzejVar;
    }

    public final void a(Context context) {
        if (this.f2031f == null) {
            this.f2031f = (zzco) new k(zzay.zza(), context).d(context, false);
        }
    }

    public final void c(Context context) {
        try {
            if (rk0.f8629d == null) {
                rk0.f8629d = new rk0(7);
            }
            String str = null;
            if (((AtomicBoolean) rk0.f8629d.f8631b).compareAndSet(false, true)) {
                new Thread(new vm(context, str)).start();
            }
            this.f2031f.zzk();
            this.f2031f.zzl(null, new b(null));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("MobileAdsSettingManager initialization failed", e10);
        }
    }

    public final float zza() {
        synchronized (this.f2030e) {
            zzco zzcoVar = this.f2031f;
            float fZze = 1.0f;
            if (zzcoVar == null) {
                return 1.0f;
            }
            try {
                fZze = zzcoVar.zze();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get app volume.", e10);
            }
            return fZze;
        }
    }

    public final RequestConfiguration zzc() {
        return this.f2033h;
    }

    public final InitializationStatus zze() {
        jb jbVarB;
        synchronized (this.f2030e) {
            try {
                a.n("MobileAds.initialize() must be called prior to getting initialization status.", this.f2031f != null);
                try {
                    jbVarB = b(this.f2031f.zzg());
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to get Initialization status.");
                    return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeb
                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map getAdapterStatusMap() {
                            HashMap map = new HashMap();
                            map.put("com.google.android.gms.ads.MobileAds", new q());
                            return map;
                        }
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jbVarB;
    }

    public final String zzh() {
        String strZzf;
        synchronized (this.f2030e) {
            try {
                a.n("MobileAds.initialize() must be called prior to getting version string.", this.f2031f != null);
                try {
                    strZzf = this.f2031f.zzf();
                    if (strZzf == null) {
                        strZzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get internal version.", e10);
                    return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strZzf;
    }

    public final void zzl(Context context) {
        synchronized (this.f2030e) {
            a(context);
            try {
                this.f2031f.zzi();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae A[Catch: all -> 0x005c, TryCatch #2 {all -> 0x005c, RemoteException -> 0x005f, blocks: (B:25:0x0033, B:27:0x0053, B:41:0x007a, B:43:0x008c, B:45:0x009e, B:52:0x00e1, B:46:0x00ae, B:48:0x00bc, B:50:0x00ce, B:51:0x00d9, B:34:0x0061, B:35:0x0063, B:38:0x006f, B:40:0x0075), top: B:60:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9 A[Catch: all -> 0x005c, TryCatch #2 {all -> 0x005c, RemoteException -> 0x005f, blocks: (B:25:0x0033, B:27:0x0053, B:41:0x007a, B:43:0x008c, B:45:0x009e, B:52:0x00e1, B:46:0x00ae, B:48:0x00bc, B:50:0x00ce, B:51:0x00d9, B:34:0x0061, B:35:0x0063, B:38:0x006f, B:40:0x0075), top: B:60:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzm(final android.content.Context r3, java.lang.String r4, com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzej.zzm(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    public final void zzp(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.f2030e) {
            a(context);
            this.f2032g = onAdInspectorClosedListener;
            try {
                this.f2031f.zzm(new r(0));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzq(Context context, String str) {
        synchronized (this.f2030e) {
            a.n("MobileAds.initialize() must be called prior to opening debug menu.", this.f2031f != null);
            try {
                this.f2031f.zzn(new b(context), str);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to open debug menu.", e10);
            }
        }
    }

    public final void zzr(Class cls) {
        synchronized (this.f2030e) {
            try {
                this.f2031f.zzh(cls.getCanonicalName());
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to register RtbAdapter", e10);
            }
        }
    }

    public final void zzs(boolean z9) {
        synchronized (this.f2030e) {
            a.n("MobileAds.initialize() must be called prior to setting app muted state.", this.f2031f != null);
            try {
                this.f2031f.zzp(z9);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set app mute state.", e10);
            }
        }
    }

    public final void zzt(float f10) {
        boolean z9 = true;
        if (!(f10 >= 0.0f && f10 <= 1.0f)) {
            throw new IllegalArgumentException("The app volume must be a value between 0 and 1 inclusive.");
        }
        synchronized (this.f2030e) {
            if (this.f2031f == null) {
                z9 = false;
            }
            a.n("MobileAds.initialize() must be called prior to setting the app volume.", z9);
            try {
                this.f2031f.zzq(f10);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set app volume.", e10);
            }
        }
    }

    public final void zzu(String str) {
        synchronized (this.f2030e) {
            a.n("MobileAds.initialize() must be called prior to setting the plugin.", this.f2031f != null);
            try {
                this.f2031f.zzt(str);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set plugin.", e10);
            }
        }
    }

    public final void zzv(RequestConfiguration requestConfiguration) {
        if (!(requestConfiguration != null)) {
            throw new IllegalArgumentException("Null passed to setRequestConfiguration.");
        }
        synchronized (this.f2030e) {
            try {
                RequestConfiguration requestConfiguration2 = this.f2033h;
                this.f2033h = requestConfiguration;
                if (this.f2031f == null) {
                    return;
                }
                if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                    try {
                        this.f2031f.zzu(new zzff(requestConfiguration));
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set request configuration parcel.", e10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzw() {
        synchronized (this.f2030e) {
            zzco zzcoVar = this.f2031f;
            boolean zZzv = false;
            if (zzcoVar == null) {
                return false;
            }
            try {
                zZzv = zzcoVar.zzv();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get app mute state.", e10);
            }
            return zZzv;
        }
    }

    public final boolean zzx(boolean z9) {
        synchronized (this.f2030e) {
            try {
                a.n("MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.", this.f2031f != null);
                try {
                    this.f2031f.zzj(z9);
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to " + (z9 ? "enable" : "disable") + " the publisher first-party ID.", e10);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
