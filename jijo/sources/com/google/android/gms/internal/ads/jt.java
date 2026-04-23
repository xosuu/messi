package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jasypt.digest.StandardStringDigester;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class jt {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static jt f6071j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f6077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f6079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f6080i;

    public jt(kr0 kr0Var, fr0 fr0Var, z40 z40Var, d50 d50Var, kq0 kq0Var, h40 h40Var, d60 d60Var, f50 f50Var, l70 l70Var) {
        this.f6072a = kr0Var;
        this.f6073b = fr0Var;
        this.f6074c = z40Var;
        this.f6075d = d50Var;
        this.f6076e = kq0Var;
        this.f6077f = h40Var;
        this.f6078g = d60Var;
        this.f6079h = f50Var;
        this.f6080i = l70Var;
    }

    public static synchronized jt e(Context context) {
        try {
            jt jtVar = f6071j;
            if (jtVar != null) {
                return jtVar;
            }
            Context applicationContext = context.getApplicationContext();
            eg.a(applicationContext);
            zzj zzjVarD = zzu.zzo().d();
            zzjVarD.zzs(applicationContext);
            xq xqVar = new xq((vq) null);
            applicationContext.getClass();
            xqVar.f10630b = applicationContext;
            y3.a aVarZzB = zzu.zzB();
            aVarZzB.getClass();
            xqVar.f10631d = aVarZzB;
            xqVar.f10632f = zzjVarD;
            xqVar.f10633h = zzu.zzn();
            jt jtVarA = xqVar.A();
            f6071j = jtVarA;
            et etVar = (et) ((nh1) jtVarA.f6075d).zzb();
            SharedPreferences sharedPreferences = etVar.f4290b;
            sharedPreferences.registerOnSharedPreferenceChangeListener(etVar);
            etVar.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
            if (((Boolean) zzba.zzc().a(eg.f4124s0)).booleanValue()) {
                etVar.onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
            } else {
                etVar.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
            }
            pt ptVar = (pt) ((nh1) f6071j.f6080i).zzb();
            if (((Boolean) zzba.zzc().a(eg.f4055l0)).booleanValue()) {
                zzu.zzp();
                Map mapZzv = zzt.zzv((String) zzba.zzc().a(eg.f4065m0));
                Iterator it = mapZzv.keySet().iterator();
                while (it.hasNext()) {
                    ptVar.a((String) it.next());
                }
                ptVar.b(new nt(ptVar, mapZzv));
            }
            return f6071j;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final String g(String str) {
        try {
            return new JSONObject(str).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        } catch (JSONException unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    public static final String i(String str, String str2, String str3, cd0 cd0Var) {
        if (!TextUtils.isEmpty(str3)) {
            Boolean bool = new JSONObject(str3).optString("is_gbid").equals("true") ? Boolean.TRUE : Boolean.FALSE;
            if (bool.booleanValue()) {
                int iLastIndexOf = str.lastIndexOf("&");
                String string = null;
                String strSubstring = iLastIndexOf != -1 ? str.substring(0, iLastIndexOf) : null;
                if (!TextUtils.isEmpty(strSubstring)) {
                    try {
                        byte[] bArrDecode = Base64.decode(strSubstring, 11);
                        byte[] bytes = str2.getBytes(StandardStringDigester.MESSAGE_CHARSET);
                        try {
                            string = new JSONObject(str3).getString("arek");
                        } catch (JSONException e10) {
                            zze.zza("Failed to get key from QueryJSONMap".concat(e10.toString()));
                            zzu.zzo().i("CryptoUtils.getKeyFromQueryJsonMap", e10);
                        }
                        return rr0.a(bArrDecode, bytes, string, cd0Var);
                    } catch (UnsupportedEncodingException e11) {
                        zze.zza("Failed to decode the adResponse. ".concat(e11.toString()));
                        zzu.zzo().i("PreloadedLoader.decryptAdResponseIfNecessary", e11);
                    }
                }
            }
        }
        return str;
    }

    public final d2.l a() {
        d2.l lVar = new d2.l();
        lVar.f12346t = new c2.j();
        lVar.C = new n2.i();
        lVar.D = null;
        lVar.f12339a = (Context) this.f6072a;
        lVar.f12345s = (o2.a) this.f6075d;
        lVar.f12348v = (k2.a) this.f6074c;
        lVar.f12340b = (String) this.f6078g;
        lVar.f12341d = (List) this.f6079h;
        lVar.f12342f = (ur0) this.f6080i;
        lVar.f12344q = (ListenableWorker) this.f6073b;
        lVar.f12347u = (c2.b) this.f6076e;
        WorkDatabase workDatabase = (WorkDatabase) this.f6077f;
        lVar.f12349w = workDatabase;
        lVar.f12350x = workDatabase.n();
        lVar.f12351y = workDatabase.i();
        lVar.f12352z = workDatabase.o();
        return lVar;
    }

    public final synchronized u21 b(kr0 kr0Var) {
        try {
            if (!((AtomicBoolean) this.f6078g).getAndSet(true)) {
                if (((List) kr0Var.f6383b.f10630b).isEmpty()) {
                    ((u21) this.f6077f).g(new zzeir(3, wj0.a(kr0Var)));
                } else {
                    this.f6080i = kr0Var;
                    this.f6079h = new jj0(kr0Var, (tj0) this.f6075d, (u21) this.f6077f);
                    ((tj0) this.f6075d).e((List) kr0Var.f6383b.f10630b);
                    fr0 fr0VarA = ((jj0) this.f6079h).a();
                    while (fr0VarA != null) {
                        h(fr0VarA);
                        fr0VarA = ((jj0) this.f6079h).a();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (u21) this.f6077f;
    }

    public final LinkedHashMap c(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap3.get(str);
            ig igVar = (ig) ((Map) this.f6074c).get(str);
            if (igVar == null) {
                igVar = ig.f5587a;
            }
            linkedHashMap3.put(str, igVar.a(str3, str2));
        }
        return linkedHashMap3;
    }

    public final r11 d(String str, String str2) {
        bt0 bt0VarD = tc1.d((Context) this.f6073b, 11);
        bt0VarD.zzi();
        fn fnVarA = zzu.zzf().a((Context) this.f6073b, (VersionInfoParcel) this.f6074c, ((gy) this.f6072a).d());
        pe peVar = en.f4244b;
        r11 r11VarQ0 = tc1.q0(tc1.q0(tc1.q0(tc1.d0(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new jn(str, str2, 7), (Executor) this.f6076e), new if0(0, fnVarA.a("google.afma.response.normalize", peVar, peVar)), (Executor) this.f6076e), new if0(10, this), (Executor) this.f6076e);
        tc1.b0(r11VarQ0, (ft0) this.f6078g, bt0VarD, false);
        return r11VarQ0;
    }

    public final String f(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put((String) this.f6077f));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            zzm.zzj("Failed to update the ad types for rendering. ".concat(e10.toString()));
            return str;
        }
    }

    public final void h(fr0 fr0Var) {
        n5.a aVarZ;
        synchronized (this) {
            Iterator it = fr0Var.f4600a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVarZ = tc1.Z(new zzdwl(3));
                    break;
                }
                ci0 ci0VarA = ((t20) this.f6074c).a(fr0Var.f4602b, (String) it.next());
                if (ci0VarA != null && ci0VarA.b((kr0) this.f6080i, fr0Var)) {
                    aVarZ = tc1.r0(ci0VarA.a((kr0) this.f6080i, fr0Var), fr0Var.R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f6073b);
                    break;
                }
            }
        }
        ((tj0) this.f6075d).b((kr0) this.f6080i, fr0Var, aVarZ, (ut0) this.f6076e);
        tc1.u0(aVarZ, new m20(this, fr0Var, 29, 0), (Executor) this.f6072a);
    }

    public final void j(LinkedHashMap linkedHashMap, kg kgVar) throws Throwable {
        FileOutputStream fileOutputStream;
        String str;
        String str2;
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f6075d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (kgVar != null) {
            StringBuilder sb = new StringBuilder(string);
            int i10 = kgVar.f6278a;
            switch (i10) {
                case 0:
                    str = kgVar.f6279b;
                    break;
                default:
                    str = kgVar.f6279b;
                    break;
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append("&it=");
                switch (i10) {
                    case 0:
                        str2 = kgVar.f6279b;
                        break;
                    default:
                        str2 = kgVar.f6279b;
                        break;
                }
                sb.append(str2);
            }
            if (!TextUtils.isEmpty(kgVar.f6280d)) {
                sb.append("&blat=");
                sb.append(kgVar.f6280d);
            }
            string = sb.toString();
        }
        if (!((AtomicBoolean) this.f6079h).get()) {
            zzu.zzp();
            zzt.zzL((Context) this.f6076e, (String) this.f6077f, string);
            return;
        }
        File file = (File) this.f6080i;
        if (file == null) {
            zzm.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            fileOutputStream.write(string.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e11) {
                zzm.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
            }
        } catch (IOException e12) {
            e = e12;
            fileOutputStream2 = fileOutputStream;
            zzm.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e13) {
                    zzm.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e14) {
                    zzm.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e14);
                }
            }
            throw th;
        }
    }

    public jt(int i10) {
        if (i10 == 7) {
            this.f6076e = Collections.emptyMap();
            this.f6080i = Collections.emptyList();
        } else {
            this.f6072a = new ArrayBlockingQueue(100);
            this.f6073b = new LinkedHashMap();
            this.f6074c = new HashMap();
            this.f6078g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
        }
    }
}
