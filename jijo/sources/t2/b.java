package t2;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.um1;
import com.google.android.gms.internal.ads.vm1;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16822a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16823b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(vm1 vm1Var, Looper looper) {
        super(looper);
        this.f16823b = vm1Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        um1 um1Var;
        switch (this.f16822a) {
            case 0:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                s2.a aVar = (s2.a) this.f16823b;
                if (aVar != null) {
                    u2.a aVar2 = (u2.a) message.obj;
                    aVar.a(aVar2.f17550a, aVar2.f17551b);
                    return;
                }
                return;
            case 1:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                q2.b bVar = (q2.b) this.f16823b;
                if (bVar != null) {
                    u2.a aVar3 = (u2.a) message.obj;
                    bVar.a(aVar3.f17550a, aVar3.f17551b);
                    return;
                }
                return;
            default:
                vm1 vm1Var = (vm1) this.f16823b;
                ArrayDeque arrayDeque = vm1.f9917s;
                int i10 = message.what;
                if (i10 != 0) {
                    if (i10 != 1) {
                        um1Var = null;
                        if (i10 == 2) {
                            vm1Var.f9923h.c();
                        } else if (i10 != 3) {
                            tc1.m(vm1Var.f9922f, new IllegalStateException(String.valueOf(message.what)));
                        } else {
                            try {
                                vm1Var.f9919a.setParameters((Bundle) message.obj);
                            } catch (RuntimeException e10) {
                                tc1.m(vm1Var.f9922f, e10);
                            }
                        }
                    } else {
                        um1Var = (um1) message.obj;
                        int i11 = um1Var.f9535a;
                        MediaCodec.CryptoInfo cryptoInfo = um1Var.f9537c;
                        long j10 = um1Var.f9538d;
                        int i12 = um1Var.f9539e;
                        try {
                            synchronized (vm1.f9918t) {
                                vm1Var.f9919a.queueSecureInputBuffer(i11, 0, cryptoInfo, j10, i12);
                            }
                        } catch (RuntimeException e11) {
                            tc1.m(vm1Var.f9922f, e11);
                        }
                    }
                    break;
                } else {
                    um1Var = (um1) message.obj;
                    try {
                        vm1Var.f9919a.queueInputBuffer(um1Var.f9535a, 0, um1Var.f9536b, um1Var.f9538d, um1Var.f9539e);
                    } catch (RuntimeException e12) {
                        tc1.m(vm1Var.f9922f, e12);
                    }
                    break;
                }
                if (um1Var != null) {
                    ArrayDeque arrayDeque2 = vm1.f9917s;
                    synchronized (arrayDeque2) {
                        arrayDeque2.add(um1Var);
                        break;
                    }
                    return;
                }
                return;
        }
    }

    public b(q2.b bVar) {
        super(Looper.getMainLooper());
        this.f16823b = bVar;
    }

    public b(q2.b bVar, int i10) {
        super(Looper.getMainLooper());
        this.f16823b = bVar;
    }
}
