package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class xk1 {
    public static boolean a(AudioManager audioManager, fl1 fl1Var) {
        AudioDeviceInfo[] devices;
        if (fl1Var == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{fl1Var.f4571a};
        }
        fz0 fz0VarB = b();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (fz0VarB.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }

    private static fz0 b() {
        ez0 ez0Var = new ez0(4);
        Integer[] numArr = {8, 7};
        if (ez0Var.f4343d != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                ez0Var.g(numArr[i10]);
            }
        } else {
            tp1.a0(2, numArr);
            ez0Var.e(ez0Var.f10007b + 2);
            System.arraycopy(numArr, 0, ez0Var.f10006a, ez0Var.f10007b, 2);
            ez0Var.f10007b += 2;
        }
        int i11 = yn0.f10944a;
        if (i11 >= 31) {
            Integer[] numArr2 = {26, 27};
            if (ez0Var.f4343d != null) {
                for (int i12 = 0; i12 < 2; i12++) {
                    ez0Var.g(numArr2[i12]);
                }
            } else {
                tp1.a0(2, numArr2);
                ez0Var.e(ez0Var.f10007b + 2);
                System.arraycopy(numArr2, 0, ez0Var.f10006a, ez0Var.f10007b, 2);
                ez0Var.f10007b += 2;
            }
        }
        if (i11 >= 33) {
            ez0Var.g(30);
        }
        return ez0Var.i();
    }
}
