package com.google.android.gms.internal.ads;

import android.os.IInterface;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qz implements q, v, b0, i0, z0, u3, a4, zzo, bd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8334a;

    public qz() {
        this.f8334a = 12;
    }

    public static ArrayList h(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new d7((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static boolean l(Object obj, jc1 jc1Var) throws zzgyn {
        int i10 = jc1Var.f5906b;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        ic1 ic1Var = jc1Var.f5905a;
        if (i12 == 0) {
            jc1Var.q(0);
            ((ke1) obj).c(i11 << 3, Long.valueOf(ic1Var.r()));
            return true;
        }
        if (i12 == 1) {
            jc1Var.q(1);
            ((ke1) obj).c((i11 << 3) | 1, Long.valueOf(ic1Var.q()));
            return true;
        }
        if (i12 == 2) {
            ((ke1) obj).c((i11 << 3) | 2, jc1Var.u());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw zzgyn.a();
            }
            jc1Var.q(5);
            ((ke1) obj).c((i11 << 3) | 5, Integer.valueOf(ic1Var.k()));
            return true;
        }
        ke1 ke1VarB = ke1.b();
        int i13 = i11 << 3;
        while (jc1Var.t() != Integer.MAX_VALUE && l(ke1VarB, jc1Var)) {
        }
        if ((i13 | 4) != jc1Var.f5906b) {
            throw new zzgyn("Protocol message end-group tag did not match expected tag.");
        }
        if (ke1VarB.f6273e) {
            ke1VarB.f6273e = false;
        }
        ((ke1) obj).c(i13 | 3, ke1VarB);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.u3
    public final void b(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.q
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.u3
    public final long d(h0 h0Var) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.q
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.v
    public final long f(long j10) {
        return j10;
    }

    public final Constructor g() {
        switch (this.f8334a) {
            case 5:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(g0.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(g0.class).getConstructor(new Class[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.i0
    public final void i() {
        switch (this.f8334a) {
            case 7:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.ads.i0
    public final b1 j(int i10, int i11) {
        switch (this.f8334a) {
            case 7:
                return new f0();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void k(Object obj) {
        ke1 ke1Var = ((wc1) obj).zzt;
        if (ke1Var.f6273e) {
            ke1Var.f6273e = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.i0
    public final void p(v0 v0Var) {
        switch (this.f8334a) {
            case 7:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.internal.util.client.zzo
    public final Object zza(Object obj) {
        switch (this.f8334a) {
            case 2:
                wc1 wc1Var = (wc1) obj;
                ke1 ke1Var = wc1Var.zzt;
                if (ke1Var != ke1.f6268f) {
                    return ke1Var;
                }
                ke1 ke1VarB = ke1.b();
                wc1Var.zzt = ke1VarB;
                return ke1VarB;
            default:
                int i10 = sb.f8836a;
                if (obj == 0) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                return iInterfaceQueryLocalInterface instanceof tb ? (tb) iInterfaceQueryLocalInterface : new rb(obj, "com.google.android.gms.ads.clearcut.IClearcut");
        }
    }

    @Override // com.google.android.gms.internal.ads.u3
    public final v0 zze() {
        return new l0(-9223372036854775807L, 0L);
    }

    public qz(int i10) {
        this.f8334a = i10;
    }

    public /* synthetic */ qz(int i10, g1.a aVar) {
        this.f8334a = i10;
    }

    public qz(int[] iArr) {
        this.f8334a = 13;
        if (iArr != null) {
            int length = Arrays.copyOf(iArr, iArr.length).length;
        }
    }
}
