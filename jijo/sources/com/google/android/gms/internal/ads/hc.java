package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public abstract class hc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static MessageDigest f5251b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5252a;

    public hc() {
        this.f5252a = new Object();
    }

    public static hc e(Activity activity) {
        if (Build.VERSION.SDK_INT < 23) {
            return new o8.a(1, activity);
        }
        return activity instanceof f.q ? new o8.b(0, (f.q) activity) : new o8.a(0, activity);
    }

    public abstract boolean a();

    public abstract void b(int i10, String... strArr);

    public abstract Context c();

    public boolean d(CharSequence charSequence, int i10) {
        if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
            throw new IllegalArgumentException();
        }
        m0.j jVar = (m0.j) this.f5252a;
        if (jVar == null) {
            return a();
        }
        int iA = jVar.a(charSequence, i10);
        if (iA == 0) {
            return true;
        }
        if (iA != 1) {
            return a();
        }
        return false;
    }

    public abstract boolean f(String str);

    public abstract void g(String str, String str2, String str3, int i10, int i11, String... strArr);

    public MessageDigest h() {
        synchronized (this.f5252a) {
            MessageDigest messageDigest = f5251b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    f5251b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f5251b;
        }
    }

    public abstract byte[] i(String str);

    public /* synthetic */ hc(Object obj) {
        this.f5252a = obj;
    }
}
