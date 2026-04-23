package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public abstract class yk1 {
    public static int a(int i10, int i11, ce1 ce1Var) {
        for (int i12 = 10; i12 > 0; i12--) {
            int iO = yn0.o(i12);
            if (iO != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(iO).build(), (AudioAttributes) ce1Var.a().f2626b)) {
                return i12;
            }
        }
        return 0;
    }

    public static bz0 b(ce1 ce1Var) {
        yy0 yy0Var = new yy0(4);
        b01 b01Var = bl1.f3056e;
        zz0 zz0Var = b01Var.f3768b;
        if (zz0Var == null) {
            zz0 zz0Var2 = new zz0(b01Var, new a01(0, b01Var.f2862q, b01Var.f2861h));
            b01Var.f3768b = zz0Var2;
            zz0Var = zz0Var2;
        }
        m01 m01VarF = zz0Var.f();
        while (m01VarF.hasNext()) {
            int iIntValue = ((Integer) m01VarF.next()).intValue();
            if (yn0.f10944a >= yn0.n(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), (AudioAttributes) ce1Var.a().f2626b)) {
                yy0Var.a(Integer.valueOf(iIntValue));
            }
        }
        yy0Var.a(2);
        return yy0Var.g();
    }
}
