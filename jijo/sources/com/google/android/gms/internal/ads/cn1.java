package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class cn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f3346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3350h;

    public cn1(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z9, boolean z10, boolean z11) {
        str.getClass();
        this.f3343a = str;
        this.f3344b = str2;
        this.f3345c = str3;
        this.f3346d = codecCapabilities;
        this.f3349g = z9;
        this.f3347e = z10;
        this.f3348f = z11;
        this.f3350h = xm.g(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.cn1 b(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            com.google.android.gms.internal.ads.cn1 r13 = new com.google.android.gms.internal.ads.cn1
            r14 = 1
            r0 = 0
            if (r11 == 0) goto L39
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r11.isFeatureSupported(r1)
            if (r1 == 0) goto L39
            int r1 = com.google.android.gms.internal.ads.yn0.f10944a
            r2 = 22
            if (r1 > r2) goto L27
            java.lang.String r1 = com.google.android.gms.internal.ads.yn0.f10947d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L29
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L27
            goto L29
        L27:
            r6 = 1
            goto L3a
        L29:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L39
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L27
        L39:
            r6 = 0
        L3a:
            if (r11 == 0) goto L43
            int r1 = com.google.android.gms.internal.ads.yn0.f10944a
            java.lang.String r1 = "tunneled-playback"
            r11.isFeatureSupported(r1)
        L43:
            if (r15 != 0) goto L51
            if (r11 == 0) goto L53
            int r15 = com.google.android.gms.internal.ads.yn0.f10944a
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L53
        L51:
            r7 = 1
            goto L54
        L53:
            r7 = 0
        L54:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cn1.b(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.cn1");
    }

    public static Point f(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = yn0.f10944a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public static boolean h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointF = f(videoCapabilities, i10, i11);
        int i12 = pointF.x;
        int i13 = pointF.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    public final xh1 a(y1 y1Var, y1 y1Var2) {
        int i10 = true != yn0.c(y1Var.f10714m, y1Var2.f10714m) ? 8 : 0;
        if (this.f3350h) {
            if (y1Var.f10722u != y1Var2.f10722u) {
                i10 |= 1024;
            }
            if (!this.f3347e && (y1Var.f10719r != y1Var2.f10719r || y1Var.f10720s != y1Var2.f10720s)) {
                i10 |= 512;
            }
            wk1 wk1Var = y1Var.f10726y;
            boolean zD = wk1.d(wk1Var);
            wk1 wk1Var2 = y1Var2.f10726y;
            if ((!zD || !wk1.d(wk1Var2)) && !yn0.c(wk1Var, wk1Var2)) {
                i10 |= 2048;
            }
            if (yn0.f10947d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f3343a) && !y1Var.c(y1Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new xh1(this.f3343a, y1Var, y1Var2, true != y1Var.c(y1Var2) ? 2 : 3, 0);
            }
        } else {
            if (y1Var.f10727z != y1Var2.f10727z) {
                i10 |= NotificationCompat.FLAG_BUBBLE;
            }
            if (y1Var.A != y1Var2.A) {
                i10 |= 8192;
            }
            if (y1Var.B != y1Var2.B) {
                i10 |= 16384;
            }
            String str = this.f3344b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairA = pn1.a(y1Var);
                Pair pairA2 = pn1.a(y1Var2);
                if (pairA != null && pairA2 != null) {
                    int iIntValue = ((Integer) pairA.first).intValue();
                    int iIntValue2 = ((Integer) pairA2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new xh1(this.f3343a, y1Var, y1Var2, 3, 0);
                    }
                }
            }
            if (!y1Var.c(y1Var2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new xh1(this.f3343a, y1Var, y1Var2, 1, 0);
            }
        }
        return new xh1(this.f3343a, y1Var, y1Var2, 0, i10);
    }

    public final boolean c(y1 y1Var) {
        int i10;
        String str = y1Var.f10714m;
        String str2 = this.f3344b;
        if (!(str2.equals(str) || str2.equals(pn1.b(y1Var))) || !i(y1Var, true)) {
            return false;
        }
        if (this.f3350h) {
            int i11 = y1Var.f10719r;
            if (i11 <= 0 || (i10 = y1Var.f10720s) <= 0) {
                return true;
            }
            int i12 = yn0.f10944a;
            return e(i11, i10, y1Var.f10721t);
        }
        int i13 = yn0.f10944a;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f3346d;
        int i14 = y1Var.A;
        if (i14 != -1) {
            if (codecCapabilities == null) {
                g("sampleRate.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i14)) {
                    g("sampleRate.support, " + i14);
                }
            }
            return false;
        }
        int i15 = y1Var.f10727z;
        if (i15 == -1) {
            return true;
        }
        if (codecCapabilities == null) {
            g("channelCount.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                g("channelCount.aCaps");
            } else {
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((yn0.f10944a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i16 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    fg0.f("AssumedMaxChannelAdjustment: " + this.f3343a + ", [" + maxInputChannelCount + " to " + i16 + "]");
                    maxInputChannelCount = i16;
                }
                if (maxInputChannelCount >= i15) {
                    return true;
                }
                g("channelCount.support, " + i15);
            }
        }
        return false;
    }

    public final boolean d(y1 y1Var) {
        if (this.f3350h) {
            return this.f3347e;
        }
        Pair pairA = pn1.a(y1Var);
        return pairA != null && ((Integer) pairA.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(int r9, int r10, double r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cn1.e(int, int, double):boolean");
    }

    public final void g(String str) {
        String str2 = yn0.f10948e;
        StringBuilder sbK = fb1.k("NoSupport [", str, "] [");
        sbK.append(this.f3343a);
        sbK.append(", ");
        sbK.append(this.f3344b);
        sbK.append("] [");
        sbK.append(str2);
        sbK.append("]");
        fg0.b(sbK.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(com.google.android.gms.internal.ads.y1 r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cn1.i(com.google.android.gms.internal.ads.y1, boolean):boolean");
    }

    public final String toString() {
        return this.f3343a;
    }
}
