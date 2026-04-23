package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Base64;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jk1 implements qe0, bf0, qx0, xl1, rm1, kn1, on1, nn1, hb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5986a;

    public jk1() {
        this.f5986a = 18;
    }

    public static int a(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.bf0
    public final void G(Object obj, p pVar) {
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.qe0
    /* JADX INFO: renamed from: zza */
    public final void mo0zza(Object obj) {
        switch (this.f5986a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
            default:
                ((ap1) obj).getClass();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final MediaCodecInfo zzb(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final boolean zze() {
        return false;
    }

    public /* synthetic */ jk1(int i10, Object obj) {
        this.f5986a = i10;
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.on1
    public final int zza(Object obj) {
        Pattern pattern = pn1.f7924a;
        String str = ((cn1) obj).f3343a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (yn0.f10944a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public final Object mo3zza() {
        byte[] bArr = new byte[12];
        pk1.f7905h.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
