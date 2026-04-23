package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class wa extends ib {
    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        if (this.f5552a.f5862m) {
            c();
            return;
        }
        synchronized (this.f5555d) {
            j8 j8Var = this.f5555d;
            String str = (String) this.f5556e.invoke(null, this.f5552a.f5850a);
            j8Var.d();
            x8.g0((x8) j8Var.f9462b, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void b() {
        ja jaVar = this.f5552a;
        if (jaVar.f5865p) {
            super.b();
        } else if (jaVar.f5862m) {
            c();
        }
    }

    public final void c() {
        Future future;
        ja jaVar = this.f5552a;
        AdvertisingIdClient advertisingIdClient = null;
        if (jaVar.f5856g) {
            if (jaVar.f5855f == null && (future = jaVar.f5857h) != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    jaVar.f5857h = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    jaVar.f5857h.cancel(true);
                }
            }
            advertisingIdClient = jaVar.f5855f;
        }
        if (advertisingIdClient == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = advertisingIdClient.getInfo();
            String id = info.getId();
            char[] cArr = la.f6543a;
            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(id);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                id = Base64.encodeToString(bArr, 11);
            }
            if (id != null) {
                synchronized (this.f5555d) {
                    j8 j8Var = this.f5555d;
                    j8Var.d();
                    x8.g0((x8) j8Var.f9462b, id);
                    j8 j8Var2 = this.f5555d;
                    boolean zIsLimitAdTrackingEnabled = info.isLimitAdTrackingEnabled();
                    j8Var2.d();
                    x8.h0((x8) j8Var2.f9462b, zIsLimitAdTrackingEnabled);
                    j8 j8Var3 = this.f5555d;
                    j8Var3.d();
                    x8.t0((x8) j8Var3.f9462b);
                }
            }
        } catch (IOException unused3) {
        }
    }

    @Override // com.google.android.gms.internal.ads.ib, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
