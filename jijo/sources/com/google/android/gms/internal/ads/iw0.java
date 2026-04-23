package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class iw0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static iw0 f5706c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f5708b;

    public iw0(Context context) {
        this.f5707a = context.getPackageName();
        this.f5708b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public final void a(Object obj, String str) throws IOException {
        boolean zCommit;
        boolean z9 = obj instanceof String;
        SharedPreferences sharedPreferences = this.f5708b;
        if (z9) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                String.valueOf(obj.getClass());
                throw new IOException("Failed to store " + str + " for app " + this.f5707a);
            }
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException("Failed to store " + str + " for app " + this.f5707a);
    }

    public final void b(String str) throws IOException {
        if (this.f5708b.edit().remove(str).commit()) {
            return;
        }
        throw new IOException("Failed to remove " + str + " for app " + this.f5707a);
    }
}
