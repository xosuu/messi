package f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.i10;
import com.google.android.gms.internal.ads.m20;
import com.google.android.gms.internal.ads.nu;
import com.google.android.gms.internal.ads.p80;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.su;
import com.google.android.gms.internal.ads.t51;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.tu;
import com.google.android.gms.internal.ads.u51;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12846b;

    public h0(m20 m20Var, zzj zzjVar) {
        this.f12846b = m20Var;
        this.f12845a = zzjVar;
    }

    public final void a() {
        Object obj = this.f12845a;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((k0) this.f12846b).f12912w.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f12845a = null;
        }
    }

    public final void b() {
        androidx.fragment.app.b1 b1Var = (androidx.fragment.app.b1) this.f12845a;
        k0.b bVar = (k0.b) this.f12846b;
        HashSet hashSet = b1Var.f736e;
        if (hashSet.remove(bVar) && hashSet.isEmpty()) {
            b1Var.b();
        }
    }

    public abstract IntentFilter c();

    public abstract int d();

    public abstract Object e(IBinder iBinder);

    public final Object f(Context context) throws RemoteCreator$RemoteCreatorException {
        Context contextCreatePackageContext;
        if (this.f12846b == null) {
            z3.a.l(context);
            AtomicBoolean atomicBoolean = s3.f.f16689a;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new RemoteCreator$RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.f12846b = e((IBinder) contextCreatePackageContext.getClassLoader().loadClass((String) this.f12845a).newInstance());
            } catch (ClassNotFoundException e10) {
                throw new RemoteCreator$RemoteCreatorException("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new RemoteCreator$RemoteCreatorException("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new RemoteCreator$RemoteCreatorException("Could not instantiate creator.", e12);
            }
        }
        return this.f12846b;
    }

    public final boolean g() {
        int iC = g1.a.c(((androidx.fragment.app.b1) this.f12845a).f734c.S);
        int i10 = ((androidx.fragment.app.b1) this.f12845a).f732a;
        return iC == i10 || !(iC == 2 || i10 == 2);
    }

    public abstract void h();

    public final void i() {
        a();
        IntentFilter intentFilterC = c();
        if (intentFilterC == null || intentFilterC.countActions() == 0) {
            return;
        }
        if (((BroadcastReceiver) this.f12845a) == null) {
            this.f12845a = new g0(0, this);
        }
        ((k0) this.f12846b).f12912w.registerReceiver((BroadcastReceiver) this.f12845a, intentFilterC);
    }

    public final byte[] j(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i10;
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((u51) this.f12846b).a(bArr, 0).get(bArr4);
            int length = bArr2.length;
            int i11 = length & 15;
            int i12 = i11 == 0 ? length : (length + 16) - i11;
            int iRemaining = byteBuffer.remaining();
            int i13 = iRemaining % 16;
            int i14 = (i13 == 0 ? iRemaining : (iRemaining + 16) - i13) + i12;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i14 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i12);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i14);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(en1.Z(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            u51 u51Var = (u51) this.f12845a;
            u51Var.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            int length2 = bArr.length;
            int i15 = 12;
            int i16 = ((t51) u51Var).f9056c;
            switch (i16) {
                case 0:
                    i10 = 12;
                    break;
                default:
                    i10 = 24;
                    break;
            }
            if (length2 != i10) {
                switch (i16) {
                    case 0:
                        break;
                    default:
                        i15 = 24;
                        break;
                }
                throw new GeneralSecurityException(fb1.g("The nonce length (in bytes) must be ", i15));
            }
            int iRemaining2 = byteBuffer.remaining();
            int i17 = iRemaining2 / 64;
            for (int i18 = 0; i18 < i17 + 1; i18++) {
                ByteBuffer byteBufferA = u51Var.a(bArr, u51Var.f9383b + i18);
                if (i18 == i17) {
                    tc1.k(byteBufferAllocate, byteBuffer, byteBufferA, iRemaining2 % 64);
                } else {
                    tc1.k(byteBufferAllocate, byteBuffer, byteBufferA, 64);
                }
            }
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e10) {
            throw new AEADBadTagException(e10.toString());
        }
    }

    public final int k() {
        return ((AtomicInteger) this.f12846b).get();
    }

    public final void l() {
        ((qu) this.f12845a).c(new Exception());
    }

    public final void m(String str, Throwable th) {
        ((qu) this.f12845a).c(th);
        if (((Boolean) zzba.zzc().a(eg.S6)).booleanValue()) {
            zzu.zzo().h(str, th);
        }
    }

    public final void n(tu tuVar, su suVar) {
        tc1.u0((qu) this.f12845a, new p80(tuVar, suVar, 12, 0), nu.f7388f);
    }

    public h0(String str) {
        this.f12845a = str;
    }

    public h0() {
        this.f12845a = new qu();
        this.f12846b = new AtomicInteger(0);
        tc1.u0((qu) this.f12845a, new i10(11, this), nu.f7388f);
    }

    public h0(androidx.fragment.app.b1 b1Var, k0.b bVar) {
        this.f12845a = b1Var;
        this.f12846b = bVar;
    }

    public h0(k0 k0Var) {
        this.f12846b = k0Var;
    }
}
