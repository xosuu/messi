package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f00 implements y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4346a;

    public /* synthetic */ f00(int i10) {
        this.f4346a = i10;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final n5.a zza(Object obj) throws JSONException, IOException {
        int i10 = 7;
        int i11 = this.f4346a;
        int i12 = 0;
        int i13 = -1;
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        int i14 = 1;
        String str2 = null;
        switch (i11) {
            case 0:
                Throwable th = (Throwable) obj;
                if (((Boolean) zzba.zzc().a(eg.A9)).booleanValue()) {
                    zzu.zzo().j("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                } else {
                    zzu.zzo().h("GetTopicsApiWithRecordObservationActionHandler", th);
                }
                zy0 zy0Var = bz0.f3132b;
                return tc1.d0(new k1.b(wz0.f10382h));
            case 1:
                return (n5.a) obj;
            case 2:
                zze.zzb("Error during loading assets.", (Exception) obj);
                return tc1.d0(null);
            case 3:
                return tc1.Z(((ExecutionException) obj).getCause());
            case 4:
                return tc1.Z(new zzdwl(5));
            case 5:
                return tc1.d0(null);
            case 6:
                return tc1.d0(((yf0) obj).f10868a);
            case 7:
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return tc1.Z(cause);
            case 8:
                Throwable cause2 = (ExecutionException) obj;
                if (cause2.getCause() != null) {
                    cause2 = cause2.getCause();
                }
                return tc1.Z(cause2);
            case 9:
                Throwable cause3 = (ExecutionException) obj;
                if (cause3.getCause() != null) {
                    cause3 = cause3.getCause();
                }
                return tc1.Z(cause3);
            case 10:
                return tc1.d0(null);
            case 11:
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return tc1.d0(jSONObject);
                }
                try {
                    zzu.zzp();
                    jSONObject = new JSONObject(zzt.zzN(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e10) {
                    zzu.zzo().i("AdsServiceSignalTask.startAdsServiceSignalTask", e10);
                }
                return tc1.d0(jSONObject);
            case 12:
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                nu.f7383a.execute(new vh0((InputStream) obj, i10, parcelFileDescriptorArrCreatePipe[1]));
                return tc1.d0(parcelFileDescriptor);
            case 13:
                vg0 vg0Var = (vg0) obj;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("response", vg0Var.f9840a);
                    JSONObject jSONObject3 = new JSONObject();
                    for (String str3 : vg0Var.f9841b.keySet()) {
                        if (str3 != null) {
                            List<String> list = (List) vg0Var.f9841b.get(str3);
                            JSONArray jSONArray = new JSONArray();
                            for (String str4 : list) {
                                if (str4 != null) {
                                    jSONArray.put(str4);
                                }
                            }
                            jSONObject3.put(str3, jSONArray);
                        }
                    }
                    jSONObject2.put("headers", jSONObject3);
                    Object obj2 = vg0Var.f9842c;
                    if (obj2 != null) {
                        jSONObject2.put("body", obj2);
                    }
                    jSONObject2.put("latency", vg0Var.f9843d);
                    return tc1.d0(new ByteArrayInputStream(jSONObject2.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e11) {
                    zzm.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e11.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e11.getCause())));
                }
            case 14:
                return tc1.d0(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            case 15:
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe2 = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe2[0];
                nu.f7383a.execute(new vh0((InputStream) obj, i10, parcelFileDescriptorArrCreatePipe2[1]));
                return tc1.d0(parcelFileDescriptor2);
            case 16:
                return tc1.d0(new dm0((String) obj, 1));
            case 17:
                return ((Throwable) obj) instanceof TimeoutException ? tc1.d0(new gm0(0)) : tc1.d0(new gm0(1));
            case 18:
                q3.b bVar = (q3.b) obj;
                return bVar == null ? tc1.d0(new vm0(str2, i13, i12)) : tc1.d0(new vm0(bVar.f16426a, bVar.f16427b, i12));
            case 19:
                k1.b bVar2 = (k1.b) obj;
                if (bVar2 == null) {
                    return tc1.d0(new vm0(str, i14));
                }
                ve1 ve1VarA = we1.A();
                for (k1.c cVar : bVar2.f14640a) {
                    te1 te1VarA = ue1.A();
                    int i15 = cVar.f14643c;
                    te1VarA.d();
                    ((ue1) te1VarA.f9462b).zzc = i15;
                    te1VarA.d();
                    ((ue1) te1VarA.f9462b).zzd = cVar.f14642b;
                    te1VarA.d();
                    ((ue1) te1VarA.f9462b).zze = cVar.f14641a;
                    ue1 ue1Var = (ue1) te1VarA.b();
                    ve1VarA.d();
                    we1.B((we1) ve1VarA.f9462b, ue1Var);
                }
                return tc1.d0(new vm0(Base64.encodeToString(((we1) ve1VarA.b()).d(), 1), i14));
            case 20:
                q3.b bVar3 = (q3.b) obj;
                int i16 = 2;
                return bVar3 == null ? tc1.d0(new vm0(str2, i13, i16)) : tc1.d0(new vm0(bVar3.f16426a, bVar3.f16427b, i16));
            case sf.zzm /* 21 */:
                return m21.f6811b;
            default:
                return tc1.d0(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }

    public /* synthetic */ f00(int i10, int i11) {
        this.f4346a = i10;
    }
}
