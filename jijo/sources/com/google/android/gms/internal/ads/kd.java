package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3.d0 f6259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rf f6260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6261c;

    public kd() {
        this.f6260b = sf.L();
        this.f6261c = false;
        this.f6259a = new v3.d0(1);
    }

    public final synchronized void a(jd jdVar) {
        if (this.f6261c) {
            try {
                jdVar.k(this.f6260b);
            } catch (NullPointerException e10) {
                zzu.zzo().i("AdMobClearcutLogger.modify", e10);
            }
        }
    }

    public final synchronized void b(int i10) {
        if (this.f6261c) {
            if (((Boolean) zzba.zzc().a(eg.f4147u4)).booleanValue()) {
                d(i10);
            } else {
                e(i10);
            }
        }
    }

    public final synchronized String c(int i10) {
        ((y3.b) zzu.zzB()).getClass();
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", ((sf) this.f6260b.f9462b).G(), Long.valueOf(SystemClock.elapsedRealtime()), Integer.valueOf(i10 - 1), Base64.encodeToString(((sf) this.f6260b.b()).d(), 3));
    }

    public final synchronized void d(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        int i11 = bw0.f3121a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                try {
                    fileOutputStream.write(c(i10).getBytes());
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                zze.zza("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            zze.zza("Could not find file for Clearcut");
        }
    }

    public final synchronized void e(int i10) {
        rf rfVar = this.f6260b;
        rfVar.d();
        sf.C((sf) rfVar.f9462b);
        List listZzd = zzt.zzd();
        rfVar.d();
        sf.B((sf) rfVar.f9462b, listZzd);
        xg xgVar = new xg(this.f6259a, ((sf) this.f6260b.b()).d());
        int i11 = i10 - 1;
        xgVar.f10548b = i11;
        xgVar.h();
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    public kd(v3.d0 d0Var) {
        this.f6260b = sf.L();
        this.f6259a = d0Var;
        this.f6261c = ((Boolean) zzba.zzc().a(eg.f4138t4)).booleanValue();
    }
}
