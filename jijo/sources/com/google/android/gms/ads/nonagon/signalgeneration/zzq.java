package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.cd0;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.hd0;
import com.google.android.gms.internal.ads.nu;
import com.google.android.gms.internal.ads.or0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzq {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.it0 zza(android.os.Bundle r2) {
        /*
            java.lang.String r0 = "com.google.ads.mediation.admob.AdMobAdapter"
            android.os.Bundle r0 = r2.getBundle(r0)
            if (r0 == 0) goto L9
            r2 = r0
        L9:
            java.lang.String r0 = "query_info_type"
            java.lang.String r2 = r2.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            com.google.android.gms.internal.ads.it0 r1 = com.google.android.gms.internal.ads.it0.SCAR_REQUEST_TYPE_UNSPECIFIED
            if (r0 == 0) goto L18
            return r1
        L18:
            int r0 = r2.hashCode()
            switch(r0) {
                case 1743582862: goto L71;
                case 1743582863: goto L67;
                case 1743582864: goto L5d;
                case 1743582865: goto L53;
                case 1743582866: goto L49;
                case 1743582867: goto L3f;
                case 1743582868: goto L35;
                case 1743582869: goto L2b;
                case 1743582870: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L7b
        L20:
            java.lang.String r0 = "requester_type_8"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L7b
            r2 = 8
            goto L7c
        L2b:
            java.lang.String r0 = "requester_type_7"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L7b
            r2 = 7
            goto L7c
        L35:
            java.lang.String r0 = "requester_type_6"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L7b
            r2 = 6
            goto L7c
        L3f:
            java.lang.String r0 = "requester_type_5"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L7b
            r2 = 5
            goto L7c
        L49:
            java.lang.String r0 = "requester_type_4"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L7b
            r2 = 4
            goto L7c
        L53:
            java.lang.String r0 = "requester_type_3"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L7b
            r2 = 3
            goto L7c
        L5d:
            java.lang.String r0 = "requester_type_2"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L7b
            r2 = 2
            goto L7c
        L67:
            java.lang.String r0 = "requester_type_1"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L7b
            r2 = 1
            goto L7c
        L71:
            java.lang.String r0 = "requester_type_0"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L7b
            r2 = 0
            goto L7c
        L7b:
            r2 = -1
        L7c:
            switch(r2) {
                case 0: goto L98;
                case 1: goto L95;
                case 2: goto L92;
                case 3: goto L8f;
                case 4: goto L8c;
                case 5: goto L89;
                case 6: goto L86;
                case 7: goto L83;
                case 8: goto L80;
                default: goto L7f;
            }
        L7f:
            return r1
        L80:
            com.google.android.gms.internal.ads.it0 r2 = com.google.android.gms.internal.ads.it0.SCAR_REQUEST_TYPE_GAM_S2S
            return r2
        L83:
            com.google.android.gms.internal.ads.it0 r2 = com.google.android.gms.internal.ads.it0.SCAR_REQUEST_TYPE_GUILDER
            return r2
        L86:
            com.google.android.gms.internal.ads.it0 r2 = com.google.android.gms.internal.ads.it0.SCAR_REQUEST_TYPE_PAW
            return r2
        L89:
            com.google.android.gms.internal.ads.it0 r2 = com.google.android.gms.internal.ads.it0.SCAR_REQUEST_TYPE_UNITY
            return r2
        L8c:
            com.google.android.gms.internal.ads.it0 r2 = com.google.android.gms.internal.ads.it0.SCAR_REQUEST_TYPE_YAVIN
            return r2
        L8f:
            com.google.android.gms.internal.ads.it0 r2 = com.google.android.gms.internal.ads.it0.SCAR_REQUEST_TYPE_GOLDENEYE
            return r2
        L92:
            com.google.android.gms.internal.ads.it0 r2 = com.google.android.gms.internal.ads.it0.SCAR_REQUEST_TYPE_GBID
            return r2
        L95:
            com.google.android.gms.internal.ads.it0 r2 = com.google.android.gms.internal.ads.it0.SCAR_REQUEST_TYPE_INBOUND_MEDIATION
            return r2
        L98:
            com.google.android.gms.internal.ads.it0 r2 = com.google.android.gms.internal.ads.it0.SCAR_REQUEST_TYPE_ADMOB
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzq.zza(android.os.Bundle):com.google.android.gms.internal.ads.it0");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String zzb(java.lang.String r1) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = "unspecified"
            return r1
        L9:
            int r0 = r1.hashCode()
            switch(r0) {
                case 1743582862: goto L62;
                case 1743582863: goto L58;
                case 1743582864: goto L4e;
                case 1743582865: goto L44;
                case 1743582866: goto L3a;
                case 1743582867: goto L30;
                case 1743582868: goto L26;
                case 1743582869: goto L1c;
                case 1743582870: goto L11;
                default: goto L10;
            }
        L10:
            goto L6c
        L11:
            java.lang.String r0 = "requester_type_8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 8
            goto L6d
        L1c:
            java.lang.String r0 = "requester_type_7"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 7
            goto L6d
        L26:
            java.lang.String r0 = "requester_type_6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 6
            goto L6d
        L30:
            java.lang.String r0 = "requester_type_5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 5
            goto L6d
        L3a:
            java.lang.String r0 = "requester_type_4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 4
            goto L6d
        L44:
            java.lang.String r0 = "requester_type_3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 3
            goto L6d
        L4e:
            java.lang.String r0 = "requester_type_2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 2
            goto L6d
        L58:
            java.lang.String r0 = "requester_type_1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 1
            goto L6d
        L62:
            java.lang.String r0 = "requester_type_0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 0
            goto L6d
        L6c:
            r0 = -1
        L6d:
            switch(r0) {
                case 0: goto L89;
                case 1: goto L86;
                case 2: goto L83;
                case 3: goto L80;
                case 4: goto L7d;
                case 5: goto L7a;
                case 6: goto L77;
                case 7: goto L74;
                case 8: goto L71;
                default: goto L70;
            }
        L70:
            return r1
        L71:
            java.lang.String r1 = "8"
            return r1
        L74:
            java.lang.String r1 = "7"
            return r1
        L77:
            java.lang.String r1 = "6"
            return r1
        L7a:
            java.lang.String r1 = "5"
            return r1
        L7d:
            java.lang.String r1 = "4"
            return r1
        L80:
            java.lang.String r1 = "3"
            return r1
        L83:
            java.lang.String r1 = "2"
            return r1
        L86:
            java.lang.String r1 = "1"
            return r1
        L89:
            java.lang.String r1 = "0"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzq.zzb(java.lang.String):java.lang.String");
    }

    public static String zzc(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        return (zzlVar == null || (bundle = zzlVar.zzc) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void zzd(final hd0 hd0Var, cd0 cd0Var, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4091o6)).booleanValue()) {
            final cd0 cd0Var2 = null;
            nu.f7383a.execute(new Runnable(cd0Var2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                public final /* synthetic */ String zzb;
                public final /* synthetic */ Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    hd0 hd0Var2 = this.zza;
                    String str2 = this.zzb;
                    Pair[] pairArr2 = this.zzc;
                    hd0Var2.getClass();
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(hd0Var2.f5568a);
                    if (!TextUtils.isEmpty("action") && !TextUtils.isEmpty(str2)) {
                        concurrentHashMap.put("action", str2);
                    }
                    for (Pair pair : pairArr2) {
                        String str3 = (String) pair.first;
                        String str4 = (String) pair.second;
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                            concurrentHashMap.put(str3, str4);
                        }
                    }
                    hd0Var2.a(concurrentHashMap, false);
                }
            });
        }
    }

    public static int zzf(or0 or0Var) {
        if (or0Var.f7658r) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzl zzlVar = or0Var.f7644d;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        if (zzcVar == null && zzlVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzlVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }
}
