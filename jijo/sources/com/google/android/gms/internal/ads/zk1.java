package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zk1 {
    public static bl1 a(AudioManager audioManager, ce1 ce1Var) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) ce1Var.a().f2626b);
        HashMap map = new HashMap();
        map.put(2, new HashSet(tp1.q0(12)));
        int i10 = 0;
        for (int i11 = 0; i11 < directProfilesForAttributes.size(); i11++) {
            AudioProfile audioProfileF = rk1.f(directProfilesForAttributes.get(i11));
            if (audioProfileF.getEncapsulationType() != 1) {
                int format = audioProfileF.getFormat();
                if (yn0.d(format) || bl1.f3056e.containsKey(Integer.valueOf(format))) {
                    Integer numValueOf = Integer.valueOf(format);
                    if (map.containsKey(numValueOf)) {
                        Set set = (Set) map.get(numValueOf);
                        set.getClass();
                        set.addAll(tp1.q0(audioProfileF.getChannelMasks()));
                    } else {
                        map.put(numValueOf, new HashSet(tp1.q0(audioProfileF.getChannelMasks())));
                    }
                }
            }
        }
        Object[] objArrCopyOf = new Object[4];
        for (Map.Entry entry : map.entrySet()) {
            al1 al1Var = new al1(((Integer) entry.getKey()).intValue(), (Set) entry.getValue());
            int i12 = i10 + 1;
            int length = objArrCopyOf.length;
            if (length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, vy0.d(length, i12));
            }
            objArrCopyOf[i10] = al1Var;
            i10 = i12;
        }
        return new bl1(bz0.j(i10, objArrCopyOf));
    }

    public static fl1 b(AudioManager audioManager, ce1 ce1Var) {
        audioManager.getClass();
        try {
            List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) ce1Var.a().f2626b);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new fl1(android.support.v4.media.c.g(audioDevicesForAttributes.get(0)));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
