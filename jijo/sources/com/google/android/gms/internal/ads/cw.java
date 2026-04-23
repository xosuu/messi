package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzcj;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cw implements wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3461a;

    public static int a(Context context, Map map, String str, int i10) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                zzay.zzb();
                i10 = zzf.zzy(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzm.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (zze.zzc()) {
            StringBuilder sbL = l.a0.l("Parse pixels for ", str, ", got string ", str2, ", int ");
            sbL.append(i10);
            sbL.append(".");
            zze.zza(sbL.toString());
        }
        return i10;
    }

    public static void c(gv gvVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        cv cvVar = gvVar.f5076s;
        if (str != null) {
            try {
                int i10 = Integer.parseInt(str);
                if (cvVar != null) {
                    cvVar.a(i10);
                }
            } catch (NumberFormatException unused) {
                zzm.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            int i11 = Integer.parseInt(str2);
            if (cvVar != null) {
                cvVar.C(i11);
            }
        }
        if (str3 != null) {
            int i12 = Integer.parseInt(str3);
            if (cvVar != null) {
                cvVar.A(i12);
            }
        }
        if (str4 != null) {
            int i13 = Integer.parseInt(str4);
            if (cvVar != null) {
                cvVar.B(i13);
            }
        }
        if (str5 != null) {
            int i14 = Integer.parseInt(str5);
            if (cvVar == null) {
                return;
            }
            cvVar.b(i14);
        }
    }

    @Override // com.google.android.gms.internal.ads.wk
    public final void b(Object obj, Map map) {
        int iMin;
        int iMin2;
        int i10;
        gv gvVar;
        cv cvVar;
        pv pvVar = (pv) obj;
        String str = (String) map.get("action");
        if (str == null) {
            zzm.zzj("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZ = (pvVar.zzo() == null || (gvVar = (gv) pvVar.zzo().f10633h) == null || (cvVar = gvVar.f5076s) == null) ? null : cvVar.z();
        int i11 = 0;
        if (numValueOf2 != null && numZ != null && !numValueOf2.equals(numZ) && !str.equals("load")) {
            zzm.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", numValueOf2, numZ));
            return;
        }
        if (zzm.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzm.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzm.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                pvVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                zzm.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                zzm.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                pvVar.k(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                zzm.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                zzm.zzj("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                map2.put("error", "missingMimeTypes");
                pvVar.j("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            String[] strArrSplit = str4.split(",");
            int length = strArrSplit.length;
            while (i11 < length) {
                String str5 = strArrSplit[i11];
                map3.put(str5, zzcj.zza(str5.trim()));
                i11++;
            }
            HashMap map4 = new HashMap();
            map4.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            map4.put("mimeTypes", map3);
            pvVar.j("onVideoEvent", map4);
            return;
        }
        xq xqVarZzo = pvVar.zzo();
        if (xqVarZzo == null) {
            zzm.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = pvVar.getContext();
            int iA = a(context, map, "x", 0);
            int iA2 = a(context, map, "y", 0);
            int iA3 = a(context, map, "w", -1);
            xf xfVar = eg.f4174x3;
            if (((Boolean) zzba.zzc().a(xfVar)).booleanValue()) {
                iMin = iA3 == -1 ? pvVar.zzh() : Math.min(iA3, pvVar.zzh());
            } else {
                if (zze.zzc()) {
                    zze.zza("Calculate width with original width " + iA3 + ", videoHost.getVideoBoundingWidth() " + pvVar.zzh() + ", x " + iA + ".");
                }
                iMin = Math.min(iA3, pvVar.zzh() - iA);
            }
            int iA4 = a(context, map, "h", -1);
            if (((Boolean) zzba.zzc().a(xfVar)).booleanValue()) {
                iMin2 = iA4 == -1 ? pvVar.zzg() : Math.min(iA4, pvVar.zzg());
            } else {
                if (zze.zzc()) {
                    zze.zza("Calculate height with original height " + iA4 + ", videoHost.getVideoBoundingHeight() " + pvVar.zzg() + ", y " + iA2 + ".");
                }
                iMin2 = Math.min(iA4, pvVar.zzg() - iA2);
            }
            try {
                i10 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i10 = 0;
            }
            boolean z9 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || ((gv) xqVarZzo.f10633h) != null) {
                z3.a.j("The underlay may only be modified from the UI thread.");
                gv gvVar2 = (gv) xqVarZzo.f10633h;
                if (gvVar2 != null) {
                    gvVar2.a(iA, iA2, iMin, iMin2);
                    return;
                }
                return;
            }
            ov ovVar = new ov((String) map.get("flags"));
            if (((gv) xqVarZzo.f10633h) == null) {
                y3.c.i((lg) ((pv) xqVarZzo.f10631d).zzm().f7835d, ((pv) xqVarZzo.f10631d).zzk(), "vpr2");
                Context context2 = (Context) xqVarZzo.f10630b;
                pv pvVar2 = (pv) xqVarZzo.f10631d;
                gv gvVar3 = new gv(context2, pvVar2, i10, z9, (lg) pvVar2.zzm().f7835d, ovVar);
                xqVarZzo.f10633h = gvVar3;
                ((ViewGroup) xqVarZzo.f10632f).addView(gvVar3, 0, new ViewGroup.LayoutParams(-1, -1));
                ((gv) xqVarZzo.f10633h).a(iA, iA2, iMin, iMin2);
                ((pv) xqVarZzo.f10631d).J();
            }
            gv gvVar4 = (gv) xqVarZzo.f10633h;
            if (gvVar4 != null) {
                c(gvVar4, map);
                return;
            }
            return;
        }
        rx rxVarZzq = pvVar.zzq();
        if (rxVarZzq != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    zzm.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float f10 = Float.parseFloat(str6);
                    synchronized (rxVarZzq.f8706b) {
                        rxVarZzq.f8714v = f10;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    zzm.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                rxVarZzq.zzu();
                return;
            }
        }
        gv gvVar5 = (gv) xqVarZzo.f10633h;
        if (gvVar5 == null) {
            HashMap map5 = new HashMap();
            map5.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            pvVar.j("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context3 = pvVar.getContext();
            int iA5 = a(context3, map, "x", 0);
            float fA = a(context3, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iA5, fA, 0);
            cv cvVar2 = gvVar5.f5076s;
            if (cvVar2 != null) {
                cvVar2.dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                zzm.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int i12 = (int) (Float.parseFloat(str7) * 1000.0f);
                cv cvVar3 = gvVar5.f5076s;
                if (cvVar3 == null) {
                    return;
                }
                cvVar3.u(i12);
                return;
            } catch (NumberFormatException unused5) {
                zzm.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            gvVar5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            gvVar5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            cv cvVar4 = gvVar5.f5076s;
            if (cvVar4 == null) {
                return;
            }
            if (TextUtils.isEmpty(gvVar5.f5083z)) {
                gvVar5.c("no_src", new String[0]);
                return;
            } else {
                cvVar4.i(gvVar5.f5083z, gvVar5.A, numValueOf2);
                return;
            }
        }
        if (str.equals("loadControl")) {
            c(gvVar5, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                cv cvVar5 = gvVar5.f5076s;
                if (cvVar5 == null) {
                    return;
                }
                sv svVar = cvVar5.f3455b;
                svVar.f8972e = true;
                svVar.a();
                cvVar5.zzn();
                return;
            }
            cv cvVar6 = gvVar5.f5076s;
            if (cvVar6 == null) {
                return;
            }
            sv svVar2 = cvVar6.f3455b;
            svVar2.f8972e = false;
            svVar2.a();
            cvVar6.zzn();
            return;
        }
        if (str.equals("pause")) {
            cv cvVar7 = gvVar5.f5076s;
            if (cvVar7 == null) {
                return;
            }
            cvVar7.s();
            return;
        }
        if (str.equals("play")) {
            cv cvVar8 = gvVar5.f5076s;
            if (cvVar8 == null) {
                return;
            }
            cvVar8.t();
            return;
        }
        if (str.equals("show")) {
            gvVar5.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    zzm.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    while (i11 < jSONArray.length()) {
                        strArr2[i11] = jSONArray.getString(i11);
                        i11++;
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    zzm.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                pvVar.U(numValueOf.intValue());
            }
            gvVar5.f5083z = str8;
            gvVar5.A = strArr;
            return;
        }
        if (str.equals("touchMove")) {
            Context context4 = pvVar.getContext();
            int iA6 = a(context4, map, "dx", 0);
            int iA7 = a(context4, map, "dy", 0);
            float f11 = iA6;
            float f12 = iA7;
            cv cvVar9 = gvVar5.f5076s;
            if (cvVar9 != null) {
                cvVar9.y(f11, f12);
            }
            if (this.f3461a) {
                return;
            }
            pvVar.zzu();
            this.f3461a = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                gvVar5.i();
                return;
            } else {
                zzm.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            zzm.zzj("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            float f13 = Float.parseFloat(str10);
            cv cvVar10 = gvVar5.f5076s;
            if (cvVar10 == null) {
                return;
            }
            sv svVar3 = cvVar10.f3455b;
            svVar3.f8973f = f13;
            svVar3.a();
            cvVar10.zzn();
        } catch (NumberFormatException unused8) {
            zzm.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
