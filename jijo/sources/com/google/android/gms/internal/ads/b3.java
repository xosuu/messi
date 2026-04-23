package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b3 implements gx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2884a;

    public /* synthetic */ b3(int i10) {
        this.f2884a = i10;
    }

    @Override // com.google.android.gms.internal.ads.gx0
    public final Object apply(Object obj) {
        int i10 = 3;
        int i11 = 5;
        String str = null;
        switch (this.f2884a) {
            case 0:
                return (k3) obj;
            case 1:
                return (k3) obj;
            case 2:
                Throwable th = (Throwable) obj;
                rk rkVar = vk.f9877a;
                if (((Boolean) kh.f6290i.k()).booleanValue()) {
                    zzu.zzo().i("prepareClickUrl.attestation1", th);
                }
                return "failure_click_attok";
            case 3:
                List list = ct.f3410l;
                return null;
            case 4:
                return "failure_click_attok";
            case 5:
                return new u20((List) obj);
            case 6:
                return new u20((r20) obj);
            case 7:
                ArrayList arrayList = new ArrayList();
                for (fi fiVar : (List) obj) {
                    if (fiVar != null) {
                        arrayList.add(fiVar);
                    }
                }
                return arrayList;
            case 8:
                ArrayList arrayList2 = new ArrayList();
                for (za0 za0Var : (List) obj) {
                    if (za0Var != null) {
                        arrayList2.add(za0Var);
                    }
                }
                return arrayList2;
            case 9:
                return Collections.singletonList(tc1.d0((i90) obj));
            case 10:
                ArrayList arrayList3 = (ArrayList) obj;
                if (arrayList3.isEmpty()) {
                    return null;
                }
                return new lm0(1, arrayList3);
            case 11:
                q3.b bVar = (q3.b) obj;
                return new vm0(bVar.f16426a, bVar.f16427b, 0);
            case 12:
                zzay zzayVar = (zzay) obj;
                return zzayVar != null ? new dm0(zzayVar.zza, i10) : new dm0(str, i10);
            case 13:
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (Exception) obj);
                return new dm0(str, i10);
            case 14:
                return new dm0((String) obj, 4);
            case 15:
                String str2 = (String) obj;
                if (str2 == null) {
                    return null;
                }
                return new dm0(str2, i11);
            case 16:
                return new mm0(5, (Bundle) obj);
            case 17:
                String str3 = (String) obj;
                if (str3 == null) {
                    return null;
                }
                return new dm0(str3, 6);
            case 18:
                return null;
            case 19:
                return (jq0) obj;
            case 20:
                String str4 = ((lr0) obj).f6695a;
                return TextUtils.isEmpty(str4) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzl.zzk() ? "fakeForAdDebugLog" : str4;
            case sf.zzm /* 21 */:
                String str5 = ((lr0) obj).f6696b;
                return TextUtils.isEmpty(str5) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzl.zzk() ? "fakeForAdDebugLog" : str5;
            case 22:
                return new nk1((l90) obj);
            case 23:
                return ((g0) obj).zzc().getClass().getSimpleName();
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                kp1 kp1VarZzi = ((io1) obj).zzi();
                kp1VarZzi.getClass();
                return bz0.k(tp1.V(kp1VarZzi.f6366b, new b3(25)));
            default:
                kp1 kp1Var = kp1.f6364d;
                return Integer.valueOf(((ow) obj).f7687c);
        }
    }
}
