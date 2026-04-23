package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dg implements qx0, s60, zm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3645a;

    public /* synthetic */ dg(Context context) {
        this.f3645a = context;
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final an1 b(ym1 ym1Var) throws Exception {
        String str;
        MediaCodec mediaCodecCreateByCodecName;
        bn1 oi1Var;
        tm1 tm1Var;
        Context context;
        int i10 = yn0.f10944a;
        int i11 = 0;
        MediaCodec mediaCodec = null;
        tm1Var = null;
        tm1 tm1Var2 = null;
        mediaCodec = null;
        if (i10 >= 23 && (i10 >= 31 || ((context = this.f3645a) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int iB = xm.b(ym1Var.f10942c.f10714m);
            switch (iB) {
                case -2:
                    str = "none";
                    break;
                case -1:
                    str = "unknown";
                    break;
                case 0:
                    str = "default";
                    break;
                case 1:
                    str = "audio";
                    break;
                case 2:
                    str = "video";
                    break;
                case 3:
                    str = "text";
                    break;
                case 4:
                    str = "image";
                    break;
                case 5:
                    str = "metadata";
                    break;
                default:
                    str = "camera motion";
                    break;
            }
            fg0.e("Creating an asynchronous MediaCodec adapter for track type ".concat(str));
            String str2 = ym1Var.f10940a.f3343a;
            try {
                Trace.beginSection("createCodec:" + str2);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str2);
                try {
                    y1 y1Var = ym1Var.f10942c;
                    if (i10 >= 34 && (i10 >= 35 || xm.g(y1Var.f10714m))) {
                        oi1Var = new oi1(3, mediaCodecCreateByCodecName);
                        i11 = 4;
                    } else {
                        oi1Var = new vm1(mediaCodecCreateByCodecName, new HandlerThread(tm1.l(iB, "ExoPlayer:MediaCodecQueueingThread:")));
                    }
                    tm1Var = new tm1(mediaCodecCreateByCodecName, new HandlerThread(tm1.l(iB, "ExoPlayer:MediaCodecAsyncAdapter:")), oi1Var);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                mediaCodecCreateByCodecName = null;
            }
            try {
                Trace.endSection();
                tm1.j(tm1Var, ym1Var.f10941b, ym1Var.f10943d, i11);
                return tm1Var;
            } catch (Exception e12) {
                e = e12;
                tm1Var2 = tm1Var;
                if (tm1Var2 != null) {
                    tm1Var2.zzl();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }
        try {
            String str3 = ym1Var.f10940a.f3343a;
            Trace.beginSection("createCodec:".concat(str3));
            MediaCodec mediaCodecCreateByCodecName2 = MediaCodec.createByCodecName(str3);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                mediaCodecCreateByCodecName2.configure(ym1Var.f10941b, ym1Var.f10943d, (MediaCrypto) null, 0);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName2.start();
                Trace.endSection();
                return new ks0(mediaCodecCreateByCodecName2);
            } catch (IOException | RuntimeException e13) {
                e = e13;
                mediaCodec = mediaCodecCreateByCodecName2;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e14) {
            e = e14;
        } catch (RuntimeException e15) {
            e = e15;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf A[Catch: all -> 0x006a, Merged into TryCatch #2 {all -> 0x0019, all -> 0x006a, blocks: (B:7:0x0012, B:9:0x0016, B:13:0x001c, B:15:0x0021, B:16:0x0023, B:18:0x0035, B:19:0x0039, B:20:0x003b, B:45:0x00b5, B:46:0x00bc, B:55:0x00ee, B:75:0x0159, B:83:0x0187, B:84:0x018e, B:86:0x0190, B:87:0x0197, B:22:0x0050, B:23:0x0054, B:28:0x0062, B:34:0x006f, B:37:0x007a, B:38:0x0084, B:40:0x008a, B:42:0x009a, B:44:0x00b1, B:48:0x00bf, B:50:0x00c3, B:52:0x00d3, B:54:0x00ea, B:57:0x00f6, B:69:0x014d, B:77:0x0162, B:79:0x0179, B:81:0x017d, B:82:0x0180, B:60:0x0107, B:62:0x0115, B:64:0x011d, B:66:0x013d, B:67:0x0140, B:72:0x0153, B:73:0x0156, B:65:0x0121), top: B:95:0x0012 }, TRY_ENTER] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6 A[Catch: all -> 0x006a, Merged into TryCatch #2 {all -> 0x0019, all -> 0x006a, blocks: (B:7:0x0012, B:9:0x0016, B:13:0x001c, B:15:0x0021, B:16:0x0023, B:18:0x0035, B:19:0x0039, B:20:0x003b, B:45:0x00b5, B:46:0x00bc, B:55:0x00ee, B:75:0x0159, B:83:0x0187, B:84:0x018e, B:86:0x0190, B:87:0x0197, B:22:0x0050, B:23:0x0054, B:28:0x0062, B:34:0x006f, B:37:0x007a, B:38:0x0084, B:40:0x008a, B:42:0x009a, B:44:0x00b1, B:48:0x00bf, B:50:0x00c3, B:52:0x00d3, B:54:0x00ea, B:57:0x00f6, B:69:0x014d, B:77:0x0162, B:79:0x0179, B:81:0x017d, B:82:0x0180, B:60:0x0107, B:62:0x0115, B:64:0x011d, B:66:0x013d, B:67:0x0140, B:72:0x0153, B:73:0x0156, B:65:0x0121), top: B:95:0x0012 }, TRY_ENTER] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0159 A[Catch: all -> 0x0019, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0019, all -> 0x006a, blocks: (B:7:0x0012, B:9:0x0016, B:13:0x001c, B:15:0x0021, B:16:0x0023, B:18:0x0035, B:19:0x0039, B:20:0x003b, B:45:0x00b5, B:46:0x00bc, B:55:0x00ee, B:75:0x0159, B:83:0x0187, B:84:0x018e, B:86:0x0190, B:87:0x0197, B:22:0x0050, B:23:0x0054, B:28:0x0062, B:34:0x006f, B:37:0x007a, B:38:0x0084, B:40:0x008a, B:42:0x009a, B:44:0x00b1, B:48:0x00bf, B:50:0x00c3, B:52:0x00d3, B:54:0x00ea, B:57:0x00f6, B:69:0x014d, B:77:0x0162, B:79:0x0179, B:81:0x017d, B:82:0x0180, B:60:0x0107, B:62:0x0115, B:64:0x011d, B:66:0x013d, B:67:0x0140, B:72:0x0153, B:73:0x0156, B:65:0x0121), top: B:95:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0162 A[Catch: all -> 0x006a, Merged into TryCatch #2 {all -> 0x0019, all -> 0x006a, blocks: (B:7:0x0012, B:9:0x0016, B:13:0x001c, B:15:0x0021, B:16:0x0023, B:18:0x0035, B:19:0x0039, B:20:0x003b, B:45:0x00b5, B:46:0x00bc, B:55:0x00ee, B:75:0x0159, B:83:0x0187, B:84:0x018e, B:86:0x0190, B:87:0x0197, B:22:0x0050, B:23:0x0054, B:28:0x0062, B:34:0x006f, B:37:0x007a, B:38:0x0084, B:40:0x008a, B:42:0x009a, B:44:0x00b1, B:48:0x00bf, B:50:0x00c3, B:52:0x00d3, B:54:0x00ea, B:57:0x00f6, B:69:0x014d, B:77:0x0162, B:79:0x0179, B:81:0x017d, B:82:0x0180, B:60:0x0107, B:62:0x0115, B:64:0x011d, B:66:0x013d, B:67:0x0140, B:72:0x0153, B:73:0x0156, B:65:0x0121), top: B:95:0x0012 }, TRY_ENTER] */
    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3zza() {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dg.mo3zza():java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        ((x40) obj).h(this.f3645a);
    }
}
