package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.zzu;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ou implements k21, s60, rs0, jd, qx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7670a;

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return fb1.x(str, " : ", str2);
    }

    @Override // com.google.android.gms.internal.ads.k21
    public void E(Throwable th) {
        zzu.zzo().i(this.f7670a, th);
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public void mo4a(Object obj) {
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            f(this.f7670a, str, objArr);
        }
    }

    public void c(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            f(this.f7670a, str, objArr);
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            f(this.f7670a, str, objArr);
        }
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            f(this.f7670a, str, objArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.jd
    public void k(rf rfVar) {
        String str = this.f7670a;
        rfVar.d();
        sf.A((sf) rfVar.f9462b, str);
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public Object mo3zza() {
        HandlerThread handlerThread = new HandlerThread(this.f7670a, 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    public /* synthetic */ ou(String str, int i10) {
        if (i10 == 1) {
            this.f7670a = "MalformedJson";
            return;
        }
        if (i10 != 3) {
            this.f7670a = str;
            return;
        }
        this.f7670a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public Object zza(Object obj) {
        int i10 = lh0.f6626d;
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.f7670a, Integer.toString(0)});
        return null;
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public void mo5zza(Object obj) {
        ((d70) obj).zza(this.f7670a);
    }
}
