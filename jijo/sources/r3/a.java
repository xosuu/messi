package r3;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f16505c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f16506d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f16507a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f16508b;

    public a(Context context) {
        this.f16508b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        z3.a.l(context);
        ReentrantLock reentrantLock = f16505c;
        reentrantLock.lock();
        try {
            if (f16506d == null) {
                f16506d = new a(context.getApplicationContext());
            }
            a aVar = f16506d;
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final String b(String str) {
        ReentrantLock reentrantLock = this.f16507a;
        reentrantLock.lock();
        try {
            return this.f16508b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
