package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l7 implements xp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6524b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6525d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f6526f;

    public l7(Context context) {
        this.f6524b = new Object();
        this.f6526f = context;
    }

    public static /* bridge */ /* synthetic */ void d(l7 l7Var) {
        synchronized (l7Var.f6524b) {
            try {
                cd cdVar = (cd) l7Var.f6525d;
                if (cdVar == null) {
                    return;
                }
                cdVar.disconnect();
                l7Var.f6525d = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xp1
    public final wz0 S(int i10, ow owVar, int[] iArr) {
        op1 op1Var = new op1((aq1) this.f6524b);
        int i11 = ((int[]) this.f6526f)[i10];
        Object[] objArrCopyOf = new Object[4];
        int i12 = 0;
        int i13 = 0;
        while (i12 < owVar.f7685a) {
            int i14 = i12;
            pp1 pp1Var = new pp1(i10, owVar, i14, (up1) this.f6525d, iArr[i12], this.f6523a, op1Var);
            int i15 = i13 + 1;
            int length = objArrCopyOf.length;
            if (length < i15) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, vy0.d(length, i15));
            }
            objArrCopyOf[i13] = pp1Var;
            i12++;
            i13 = i15;
        }
        return bz0.j(i13, objArrCopyOf);
    }

    public final void a(aq1 aq1Var, Looper looper) {
        if (((Spatializer.OnSpatializerStateChangedListener) this.f6526f) == null && ((Handler) this.f6525d) == null) {
            this.f6526f = new vp1(aq1Var);
            Handler handler = new Handler(looper);
            this.f6525d = handler;
            ((Spatializer) this.f6524b).addOnSpatializerStateChangedListener(new lu(2, handler), (Spatializer.OnSpatializerStateChangedListener) this.f6526f);
        }
    }

    public final boolean b() {
        return ((zzapq) this.f6526f) == null;
    }

    public final boolean c(y1 y1Var, ce1 ce1Var) {
        boolean zEquals = "audio/eac3-joc".equals(y1Var.f10714m);
        int i10 = y1Var.f10727z;
        if (zEquals && i10 == 16) {
            i10 = 12;
        }
        int iO = yn0.o(i10);
        if (iO == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iO);
        int i11 = y1Var.A;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return ((Spatializer) this.f6524b).canBeSpatialized((AudioAttributes) ce1Var.a().f2626b, channelMask.build());
    }

    public l7(zzapq zzapqVar) {
        this.f6523a = false;
        this.f6524b = null;
        this.f6525d = null;
        this.f6526f = zzapqVar;
    }

    public /* synthetic */ l7(aq1 aq1Var, up1 up1Var, boolean z9, int[] iArr) {
        this.f6524b = aq1Var;
        this.f6525d = up1Var;
        this.f6523a = z9;
        this.f6526f = iArr;
    }

    public l7(Object obj, z6 z6Var) {
        this.f6523a = false;
        this.f6524b = obj;
        this.f6525d = z6Var;
        this.f6526f = null;
    }

    public l7(Spatializer spatializer) {
        this.f6524b = spatializer;
        this.f6523a = spatializer.getImmersiveAudioLevel() != 0;
    }
}
