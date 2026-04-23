package com.google.android.gms.ads.internal.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzcj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f2171b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f2170a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2172c = new Object();

    public static Integer[] a(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }

    public static List zza(String str) {
        ArrayList arrayList;
        Object obj = f2172c;
        synchronized (obj) {
            HashMap map = f2170a;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    try {
                        if (f2171b == null) {
                            f2171b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        }
                        arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : f2171b) {
                            if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                                HashMap map2 = new HashMap();
                                map2.put("codecName", mediaCodecInfo.getName());
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                ArrayList arrayList2 = new ArrayList();
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                    arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                                }
                                map2.put("profileLevels", arrayList2);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                map2.put("bitRatesBps", a(videoCapabilities.getBitrateRange()));
                                map2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                map2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                map2.put("frameRates", a(videoCapabilities.getSupportedFrameRates()));
                                map2.put("widths", a(videoCapabilities.getSupportedWidths()));
                                map2.put("heights", a(videoCapabilities.getSupportedHeights()));
                                if (Build.VERSION.SDK_INT >= 23) {
                                    map2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                                }
                                arrayList.add(map2);
                            }
                        }
                        f2170a.put(str, arrayList);
                    } finally {
                    }
                }
                return arrayList;
            } catch (LinkageError e10) {
                e = e10;
                HashMap map3 = new HashMap();
                map3.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map3);
                f2170a.put(str, arrayList3);
                return arrayList3;
            } catch (RuntimeException e11) {
                e = e11;
                HashMap map32 = new HashMap();
                map32.put("error", e.getClass().getSimpleName());
                ArrayList arrayList32 = new ArrayList();
                arrayList32.add(map32);
                f2170a.put(str, arrayList32);
                return arrayList32;
            }
        }
    }
}
