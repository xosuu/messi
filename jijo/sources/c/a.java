package c;

import android.content.Context;
import com.google.android.gms.internal.ads.f7;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f1490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1491b;

    public a(Context context) {
        this.f1491b = context;
    }

    public final Logger a() {
        Logger logger = (Logger) this.f1490a;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = (Logger) this.f1490a;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.f1491b);
                this.f1490a = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0129  */
    @Override // com.google.android.gms.internal.ads.f7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.h7 zza(com.google.android.gms.internal.ads.i7 r15) throws com.google.android.gms.internal.ads.zzapq {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.zza(com.google.android.gms.internal.ads.i7):com.google.android.gms.internal.ads.h7");
    }

    public a(Class cls) {
        this.f1491b = cls.getName();
    }

    public a() {
        this.f1491b = new CopyOnWriteArraySet();
    }
}
