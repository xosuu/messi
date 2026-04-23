package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.ke0;
import com.google.android.gms.internal.ads.le0;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l3.c;
import n5.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2126a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2127b = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2128c = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2129d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2130e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2131f = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public le0 f2132g;

    public static void a(Context context, String str, boolean z9, boolean z10) {
        if (context instanceof Activity) {
            zzt.zza.post(new c(context, str, z9, z10));
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Can not create dialog without Activity Context");
        }
    }

    public static final String b(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", com.google.android.gms.ads.internal.zzu.zzp().zzc(context, str2));
        a aVarZzb = new zzbo(context).zzb(0, str, map, null);
        try {
            return (String) aVarZzb.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4059l4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e10);
            aVarZzb.cancel(true);
            return null;
        } catch (TimeoutException e11) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e11);
            aVarZzb.cancel(true);
            return null;
        } catch (Exception e12) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e12);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[Catch: all -> 0x0031, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:12:0x003a, B:14:0x0042, B:16:0x0057, B:19:0x0069, B:11:0x0033, B:20:0x006e, B:21:0x0070), top: B:26:0x000b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri c(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            android.net.Uri r7 = android.net.Uri.parse(r7)
            android.net.Uri$Builder r7 = r7.buildUpon()
            java.lang.Object r0 = r5.f2126a
            monitor-enter(r0)
            java.lang.String r1 = r5.f2127b     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L6e
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r6.openFileInput(r1)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r4 = 1
            y3.c.c(r1, r3, r4)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            goto L3a
        L31:
            r6 = move-exception
            goto L85
        L33:
            java.lang.String r1 = "Error reading from internal storage."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = ""
        L3a:
            r5.f2127b = r2     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L6e
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L31
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L31
            r5.f2127b = r1     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r5.f2127b     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L68
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L68
            r6.write(r1)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L68
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L68
            goto L6e
        L68:
            r6 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r6)     // Catch: java.lang.Throwable -> L31
        L6e:
            java.lang.String r6 = r5.f2127b     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "linkedDeviceId"
            r7.appendQueryParameter(r0, r6)
            java.lang.String r6 = "adSlotPath"
            r7.appendQueryParameter(r6, r8)
            java.lang.String r6 = "afmaVersion"
            r7.appendQueryParameter(r6, r9)
            android.net.Uri r6 = r7.build()
            return r6
        L85:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzay.c(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    public final le0 zza() {
        return this.f2132g;
    }

    public final String zzb() {
        String str;
        synchronized (this.f2126a) {
            str = this.f2128c;
        }
        return str;
    }

    public final void zzc(Context context) {
        le0 le0Var;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4102p8)).booleanValue() || (le0Var = this.f2132g) == null) {
            return;
        }
        le0Var.d(new l3.a(this, context), ke0.f6266f);
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzu.zzp();
        zzt.zzU(context, c(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4016h4), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = c(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4049k4), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzu.zzp();
        zzt.zzL(context, str, builderBuildUpon.build().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0026, B:11:0x002c, B:13:0x0032, B:16:0x0037, B:17:0x003b, B:19:0x0041, B:22:0x0047), top: B:26:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0026, B:11:0x002c, B:13:0x0032, B:16:0x0037, B:17:0x003b, B:19:0x0041, B:22:0x0047), top: B:26:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2126a
            monitor-enter(r0)
            r3.f2130e = r4     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.xf r1 = com.google.android.gms.internal.ads.eg.f4102p8     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.cg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L45
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            com.google.android.gms.internal.ads.gu r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.ads.internal.util.zzj r1 = r1.d()     // Catch: java.lang.Throwable -> L45
            r1.zzC(r4)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.le0 r1 = r3.f2132g     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            boolean r2 = r1.f6598u     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L30
            if (r4 == 0) goto L3b
            r1.i()     // Catch: java.lang.Throwable -> L45
            goto L32
        L30:
            if (r4 == 0) goto L3b
        L32:
            boolean r4 = r1.f6596s     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L37
            goto L3b
        L37:
            r1.n()     // Catch: java.lang.Throwable -> L45
            goto L47
        L3b:
            boolean r4 = r1.f()     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L47
            r1.m()     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r4 = move-exception
            goto L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzay.zzf(boolean):void");
    }

    public final void zzg(le0 le0Var) {
        this.f2132g = le0Var;
    }

    public final void zzh(boolean z9) {
        synchronized (this.f2126a) {
            this.f2129d = z9;
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String strB = b(context, c(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4038j4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strB)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strB.trim()).optString("debug_mode"));
            zzf(zEquals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4102p8)).booleanValue()) {
                zzj zzjVarD = com.google.android.gms.ads.internal.zzu.zzo().d();
                if (true != zEquals) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                zzjVarD.zzB(str);
            }
            return zEquals;
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to get debug mode response json.", e10);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z9;
        synchronized (this.f2126a) {
            z9 = this.f2130e;
        }
        return z9;
    }

    public final boolean zzm() {
        boolean z9;
        synchronized (this.f2126a) {
            z9 = this.f2129d;
        }
        return z9;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}
