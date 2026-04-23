package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class vm1 implements bn1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ArrayDeque f9917s = new ArrayDeque();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f9918t = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f9919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f9920b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t2.b f9921d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f9922f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c8.a f9923h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9924q;

    public vm1(MediaCodec mediaCodec, HandlerThread handlerThread) {
        c8.a aVar = new c8.a(0);
        this.f9919a = mediaCodec;
        this.f9920b = handlerThread;
        this.f9923h = aVar;
        this.f9922f = new AtomicReference();
    }

    public static um1 d() {
        ArrayDeque arrayDeque = f9917s;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new um1();
                }
                return (um1) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void a(long j10, int i10, int i11, int i12) {
        zzc();
        um1 um1VarD = d();
        um1VarD.f9535a = i10;
        um1VarD.f9536b = i11;
        um1VarD.f9538d = j10;
        um1VarD.f9539e = i12;
        t2.b bVar = this.f9921d;
        int i13 = yn0.f10944a;
        bVar.obtainMessage(0, um1VarD).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void b(Bundle bundle) {
        zzc();
        t2.b bVar = this.f9921d;
        int i10 = yn0.f10944a;
        bVar.obtainMessage(3, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void c(int i10, de1 de1Var, long j10) {
        int length;
        int length2;
        int length3;
        int length4;
        zzc();
        um1 um1VarD = d();
        um1VarD.f9535a = i10;
        um1VarD.f9536b = 0;
        um1VarD.f9538d = j10;
        um1VarD.f9539e = 0;
        int i11 = de1Var.f3637f;
        MediaCodec.CryptoInfo cryptoInfo = um1VarD.f9537c;
        cryptoInfo.numSubSamples = i11;
        int[] iArr = de1Var.f3635d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < (length4 = iArr.length)) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = de1Var.f3636e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < (length3 = iArr2.length)) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = de1Var.f3633b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < (length2 = bArr.length)) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, length2);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = de1Var.f3632a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < (length = bArr2.length)) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = de1Var.f3634c;
        if (yn0.f10944a >= 24) {
            kd1.l();
            cryptoInfo.setPattern(kd1.e(de1Var.f3638g, de1Var.f3639h));
        }
        this.f9921d.obtainMessage(1, um1VarD).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void zzb() {
        c8.a aVar = this.f9923h;
        if (this.f9924q) {
            try {
                t2.b bVar = this.f9921d;
                bVar.getClass();
                bVar.removeCallbacksAndMessages(null);
                aVar.b();
                t2.b bVar2 = this.f9921d;
                bVar2.getClass();
                bVar2.obtainMessage(2).sendToTarget();
                synchronized (aVar) {
                    while (!aVar.f1584b) {
                        aVar.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.f9922f.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void zzg() {
        if (this.f9924q) {
            zzb();
            this.f9920b.quit();
        }
        this.f9924q = false;
    }

    @Override // com.google.android.gms.internal.ads.bn1
    public final void zzh() {
        if (this.f9924q) {
            return;
        }
        HandlerThread handlerThread = this.f9920b;
        handlerThread.start();
        this.f9921d = new t2.b(this, handlerThread.getLooper());
        this.f9924q = true;
    }
}
