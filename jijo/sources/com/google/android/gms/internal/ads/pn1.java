package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class pn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7924a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f7925b = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair a(com.google.android.gms.internal.ads.y1 r26) {
        /*
            Method dump skipped, instruction units count: 2278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pn1.a(com.google.android.gms.internal.ads.y1):android.util.Pair");
    }

    public static String b(y1 y1Var) {
        Pair pairA;
        if ("audio/eac3-joc".equals(y1Var.f10714m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(y1Var.f10714m) || (pairA = a(y1Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairA.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        if (iIntValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    public static synchronized List c(String str, boolean z9, boolean z10) {
        try {
            mn1 mn1Var = new mn1(str, z9, z10);
            HashMap map = f7925b;
            List list = (List) map.get(mn1Var);
            if (list != null) {
                return list;
            }
            int i10 = yn0.f10944a;
            ArrayList arrayListE = e(mn1Var, new gp0(z9, z10));
            if (z9 && arrayListE.isEmpty() && yn0.f10944a <= 23) {
                arrayListE = e(mn1Var, new jk1(27, (ik1) null));
                if (!arrayListE.isEmpty()) {
                    fg0.f("MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((cn1) arrayListE.get(0)).f3343a);
                }
            }
            if ("audio/raw".equals(str)) {
                if (yn0.f10944a < 26 && yn0.f10945b.equals("R9") && arrayListE.size() == 1 && ((cn1) arrayListE.get(0)).f3343a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListE.add(cn1.b("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
                }
                Collections.sort(arrayListE, new ln1(new jk1(26, (Object) null)));
            }
            if (yn0.f10944a < 32 && arrayListE.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((cn1) arrayListE.get(0)).f3343a)) {
                arrayListE.add((cn1) arrayListE.remove(0));
            }
            bz0 bz0VarK = bz0.k(arrayListE);
            map.put(mn1Var, bz0VarK);
            return bz0VarK;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static wz0 d(y1 y1Var, boolean z9, boolean z10) {
        List listC = c(y1Var.f10714m, z9, z10);
        String strB = b(y1Var);
        Iterable iterableC = strB == null ? wz0.f10382h : c(strB, z9, z10);
        yy0 yy0Var = new yy0(4);
        yy0Var.c(listC);
        yy0Var.c(iterableC);
        return yy0Var.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0185 A[Catch: Exception -> 0x0168, TryCatch #2 {Exception -> 0x0168, blocks: (B:80:0x0134, B:86:0x014b, B:93:0x015d, B:95:0x0163, B:103:0x017d, B:105:0x0185, B:106:0x018a, B:108:0x019a, B:110:0x01a2, B:99:0x0174), top: B:144:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018a A[Catch: Exception -> 0x0168, TryCatch #2 {Exception -> 0x0168, blocks: (B:80:0x0134, B:86:0x014b, B:93:0x015d, B:95:0x0163, B:103:0x017d, B:105:0x0185, B:106:0x018a, B:108:0x019a, B:110:0x01a2, B:99:0x0174), top: B:144:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0247 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163 A[Catch: Exception -> 0x0168, TryCatch #2 {Exception -> 0x0168, blocks: (B:80:0x0134, B:86:0x014b, B:93:0x015d, B:95:0x0163, B:103:0x017d, B:105:0x0185, B:106:0x018a, B:108:0x019a, B:110:0x01a2, B:99:0x0174), top: B:144:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0174 A[Catch: Exception -> 0x0168, TryCatch #2 {Exception -> 0x0168, blocks: (B:80:0x0134, B:86:0x014b, B:93:0x015d, B:95:0x0163, B:103:0x017d, B:105:0x0185, B:106:0x018a, B:108:0x019a, B:110:0x01a2, B:99:0x0174), top: B:144:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList e(com.google.android.gms.internal.ads.mn1 r22, com.google.android.gms.internal.ads.nn1 r23) throws com.google.android.gms.internal.ads.zzsw {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pn1.e(com.google.android.gms.internal.ads.mn1, com.google.android.gms.internal.ads.nn1):java.util.ArrayList");
    }

    public static boolean f(MediaCodecInfo mediaCodecInfo, String str) {
        if (yn0.f10944a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if ("audio".equals(xm.h(str))) {
            return true;
        }
        String strG = tc1.g(mediaCodecInfo.getName());
        if (strG.startsWith("arc.")) {
            return false;
        }
        if (strG.startsWith("omx.google.") || strG.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strG.startsWith("omx.sec.") && strG.contains(".sw.")) || strG.equals("omx.qcom.video.decoder.hevcswvdec") || strG.startsWith("c2.android.") || strG.startsWith("c2.google.")) {
            return true;
        }
        return (strG.startsWith("omx.") || strG.startsWith("c2.")) ? false : true;
    }
}
