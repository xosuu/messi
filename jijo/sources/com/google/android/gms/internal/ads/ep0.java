package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ep0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f4273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f4274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zt f4277f;

    public ep0(zt ztVar, Context context, ScheduledExecutorService scheduledExecutorService, mu muVar, int i10, boolean z9, boolean z10) {
        this.f4277f = ztVar;
        this.f4272a = context;
        this.f4273b = scheduledExecutorService;
        this.f4274c = muVar;
        this.f4275d = z9;
        this.f4276e = z10;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        if (!((Boolean) zzba.zzc().a(eg.L0)).booleanValue()) {
            return tc1.Z(new Exception("Did not ad Ad ID into query param."));
        }
        this.f4277f.getClass();
        qu quVar = new qu();
        zzay.zzb();
        Context context = this.f4272a;
        if (zzf.zzu(context)) {
            nu.f7383a.execute(new yt(context, quVar));
        }
        h21 h21VarR = h21.r(quVar);
        final int i10 = 0;
        gx0 gx0Var = new gx0(this) { // from class: com.google.android.gms.internal.ads.dp0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ep0 f3717b;

            {
                this.f3717b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.gx0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r11) {
                /*
                    r10 = this;
                    int r0 = r2
                    r1 = 5
                    r2 = 0
                    switch(r0) {
                        case 0: goto L2c;
                        default: goto L7;
                    }
                L7:
                    java.lang.Throwable r11 = (java.lang.Throwable) r11
                    com.google.android.gms.internal.ads.ep0 r11 = r10.f3717b
                    r11.getClass()
                    com.google.android.gms.ads.internal.client.zzay.zzb()
                    android.content.Context r11 = r11.f4272a
                    android.content.ContentResolver r11 = r11.getContentResolver()
                    if (r11 != 0) goto L1b
                    r11 = r2
                    goto L21
                L1b:
                    java.lang.String r0 = "android_id"
                    java.lang.String r11 = android.provider.Settings.Secure.getString(r11, r0)
                L21:
                    com.google.android.gms.internal.ads.fp0 r0 = new com.google.android.gms.internal.ads.fp0
                    com.google.android.gms.internal.ads.x1 r3 = new com.google.android.gms.internal.ads.x1
                    r3.<init>(r1)
                    r0.<init>(r2, r11, r3)
                    return r0
                L2c:
                    com.google.android.gms.internal.ads.ep0 r0 = r10.f3717b
                    com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r11 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r11
                    r0.getClass()
                    com.google.android.gms.internal.ads.x1 r3 = new com.google.android.gms.internal.ads.x1
                    r3.<init>(r1)
                    boolean r4 = r0.f4275d
                    if (r4 != 0) goto L4e
                    com.google.android.gms.internal.ads.xf r4 = com.google.android.gms.internal.ads.eg.L2
                    com.google.android.gms.internal.ads.cg r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
                    java.lang.Object r4 = r5.a(r4)
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 != 0) goto L64
                L4e:
                    boolean r4 = r0.f4275d
                    if (r4 == 0) goto Lac
                    com.google.android.gms.internal.ads.xf r4 = com.google.android.gms.internal.ads.eg.M2
                    com.google.android.gms.internal.ads.cg r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
                    java.lang.Object r4 = r5.a(r4)
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 == 0) goto Lac
                L64:
                    android.content.Context r3 = r0.f4272a     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    com.google.android.gms.internal.ads.jw0 r4 = com.google.android.gms.internal.ads.jw0.f(r3)     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.util.Objects.requireNonNull(r11)     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.lang.String r5 = r11.getId()     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.util.Objects.requireNonNull(r5)     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    android.content.Context r3 = r0.f4272a     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.lang.String r6 = r3.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    com.google.android.gms.internal.ads.xf r3 = com.google.android.gms.internal.ads.eg.R2     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    com.google.android.gms.internal.ads.cg r7 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.lang.Object r3 = r7.a(r3)     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    long r7 = r3.longValue()     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    boolean r9 = r0.f4276e     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    r4.getClass()     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.lang.Class<com.google.android.gms.internal.ads.jw0> r0 = com.google.android.gms.internal.ads.jw0.class
                    monitor-enter(r0)     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    com.google.android.gms.internal.ads.x1 r3 = r4.a(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L98
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
                    goto Lac
                L98:
                    r3 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
                    throw r3     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                L9b:
                    r0 = move-exception
                    goto L9e
                L9d:
                    r0 = move-exception
                L9e:
                    java.lang.String r3 = "AdIdInfoSignalSource.getPaidV1"
                    com.google.android.gms.internal.ads.gu r4 = com.google.android.gms.ads.internal.zzu.zzo()
                    r4.i(r3, r0)
                    com.google.android.gms.internal.ads.x1 r3 = new com.google.android.gms.internal.ads.x1
                    r3.<init>(r1)
                Lac:
                    com.google.android.gms.internal.ads.fp0 r0 = new com.google.android.gms.internal.ads.fp0
                    r0.<init>(r11, r2, r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dp0.apply(java.lang.Object):java.lang.Object");
            }
        };
        Executor executor = this.f4274c;
        final int i11 = 1;
        return tc1.P((h21) tc1.r0(tc1.o0(h21VarR, gx0Var, executor), ((Long) zzba.zzc().a(eg.M0)).longValue(), TimeUnit.MILLISECONDS, this.f4273b), Throwable.class, new gx0(this) { // from class: com.google.android.gms.internal.ads.dp0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ep0 f3717b;

            {
                this.f3717b = this;
            }

            @Override // com.google.android.gms.internal.ads.gx0
            public final Object apply(Object v9) {
                /*
                    this = this;
                    int r0 = r2
                    r1 = 5
                    r2 = 0
                    switch(r0) {
                        case 0: goto L2c;
                        default: goto L7;
                    }
                L7:
                    java.lang.Throwable r11 = (java.lang.Throwable) r11
                    com.google.android.gms.internal.ads.ep0 r11 = r10.f3717b
                    r11.getClass()
                    com.google.android.gms.ads.internal.client.zzay.zzb()
                    android.content.Context r11 = r11.f4272a
                    android.content.ContentResolver r11 = r11.getContentResolver()
                    if (r11 != 0) goto L1b
                    r11 = r2
                    goto L21
                L1b:
                    java.lang.String r0 = "android_id"
                    java.lang.String r11 = android.provider.Settings.Secure.getString(r11, r0)
                L21:
                    com.google.android.gms.internal.ads.fp0 r0 = new com.google.android.gms.internal.ads.fp0
                    com.google.android.gms.internal.ads.x1 r3 = new com.google.android.gms.internal.ads.x1
                    r3.<init>(r1)
                    r0.<init>(r2, r11, r3)
                    return r0
                L2c:
                    com.google.android.gms.internal.ads.ep0 r0 = r10.f3717b
                    com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r11 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r11
                    r0.getClass()
                    com.google.android.gms.internal.ads.x1 r3 = new com.google.android.gms.internal.ads.x1
                    r3.<init>(r1)
                    boolean r4 = r0.f4275d
                    if (r4 != 0) goto L4e
                    com.google.android.gms.internal.ads.xf r4 = com.google.android.gms.internal.ads.eg.L2
                    com.google.android.gms.internal.ads.cg r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
                    java.lang.Object r4 = r5.a(r4)
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 != 0) goto L64
                L4e:
                    boolean r4 = r0.f4275d
                    if (r4 == 0) goto Lac
                    com.google.android.gms.internal.ads.xf r4 = com.google.android.gms.internal.ads.eg.M2
                    com.google.android.gms.internal.ads.cg r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
                    java.lang.Object r4 = r5.a(r4)
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 == 0) goto Lac
                L64:
                    android.content.Context r3 = r0.f4272a     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    com.google.android.gms.internal.ads.jw0 r4 = com.google.android.gms.internal.ads.jw0.f(r3)     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.util.Objects.requireNonNull(r11)     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.lang.String r5 = r11.getId()     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.util.Objects.requireNonNull(r5)     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    android.content.Context r3 = r0.f4272a     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.lang.String r6 = r3.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    com.google.android.gms.internal.ads.xf r3 = com.google.android.gms.internal.ads.eg.R2     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    com.google.android.gms.internal.ads.cg r7 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.lang.Object r3 = r7.a(r3)     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    long r7 = r3.longValue()     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    boolean r9 = r0.f4276e     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    r4.getClass()     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    java.lang.Class<com.google.android.gms.internal.ads.jw0> r0 = com.google.android.gms.internal.ads.jw0.class
                    monitor-enter(r0)     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                    com.google.android.gms.internal.ads.x1 r3 = r4.a(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L98
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
                    goto Lac
                L98:
                    r3 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
                    throw r3     // Catch: java.lang.IllegalArgumentException -> L9b java.io.IOException -> L9d
                L9b:
                    r0 = move-exception
                    goto L9e
                L9d:
                    r0 = move-exception
                L9e:
                    java.lang.String r3 = "AdIdInfoSignalSource.getPaidV1"
                    com.google.android.gms.internal.ads.gu r4 = com.google.android.gms.ads.internal.zzu.zzo()
                    r4.i(r3, r0)
                    com.google.android.gms.internal.ads.x1 r3 = new com.google.android.gms.internal.ads.x1
                    r3.<init>(r1)
                Lac:
                    com.google.android.gms.internal.ads.fp0 r0 = new com.google.android.gms.internal.ads.fp0
                    r0.<init>(r11, r2, r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dp0.apply(java.lang.Object):java.lang.Object");
            }
        }, executor);
    }
}
