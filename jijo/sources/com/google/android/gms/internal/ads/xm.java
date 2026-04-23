package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class xm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f10605a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f10606b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xm.a(java.lang.String, java.lang.String):int");
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(h(str))) {
            return 1;
        }
        if (g(str)) {
            return 2;
        }
        if ("text".equals(h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("image".equals(h(str)) || "application/x-image-uri".equals(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f10605a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        fb1.t(arrayList.get(0));
        throw null;
    }

    public static b4.j c(String str) {
        Matcher matcher = f10606b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new b4.j(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 1);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String d(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e(java.lang.String r6) {
        /*
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            java.lang.String r6 = com.google.android.gms.internal.ads.tc1.g(r6)
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 5
            r5 = 1
            switch(r0) {
                case -1007807498: goto L47;
                case -979095690: goto L3d;
                case -586683234: goto L33;
                case -432836268: goto L29;
                case -432836267: goto L1f;
                case 187090231: goto L15;
                default: goto L14;
            }
        L14:
            goto L51
        L15:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = 1
            goto L52
        L1f:
            java.lang.String r0 = "audio/mpeg-l2"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = 5
            goto L52
        L29:
            java.lang.String r0 = "audio/mpeg-l1"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = 4
            goto L52
        L33:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = 2
            goto L52
        L3d:
            java.lang.String r0 = "application/x-mpegurl"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = 3
            goto L52
        L47:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = 0
            goto L52
        L51:
            r0 = -1
        L52:
            if (r0 == 0) goto L6e
            if (r0 == r5) goto L6b
            if (r0 == r2) goto L68
            if (r0 == r1) goto L65
            if (r0 == r3) goto L62
            if (r0 == r4) goto L5f
            return r6
        L5f:
            java.lang.String r6 = "audio/mpeg-L2"
            return r6
        L62:
            java.lang.String r6 = "audio/mpeg-L1"
            return r6
        L65:
            java.lang.String r6 = "application/x-mpegURL"
            return r6
        L68:
            java.lang.String r6 = "audio/wav"
            return r6
        L6b:
            java.lang.String r6 = "audio/mpeg"
            return r6
        L6e:
            java.lang.String r6 = "audio/flac"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xm.e(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(java.lang.String r3, java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xm.f(java.lang.String, java.lang.String):boolean");
    }

    public static boolean g(String str) {
        return "video".equals(h(str));
    }

    public static String h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
