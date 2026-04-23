package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class et0 extends rt0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AssetManager f4294h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Uri f4295q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InputStream f4296s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f4297t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4298u;

    public et0(Context context) {
        super(false);
        this.f4294h = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) throws zzfj {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f4297t;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzfj(2000, e10);
            }
        }
        InputStream inputStream = this.f4296s;
        int i12 = yn0.f10944a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f4297t;
        if (j11 != -1) {
            this.f4297t = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final long g(iz0 iz0Var) throws zzfj {
        try {
            Uri uri = iz0Var.f5730a;
            long j10 = iz0Var.f5732c;
            this.f4295q = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            j(iz0Var);
            InputStream inputStreamOpen = this.f4294h.open(path, 1);
            this.f4296s = inputStreamOpen;
            if (inputStreamOpen.skip(j10) < j10) {
                throw new zzfj(2008, null);
            }
            long j11 = iz0Var.f5733d;
            if (j11 != -1) {
                this.f4297t = j11;
            } else {
                long jAvailable = this.f4296s.available();
                this.f4297t = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f4297t = -1L;
                }
            }
            this.f4298u = true;
            n(iz0Var);
            return this.f4297t;
        } catch (zzfj e10) {
            throw e10;
        } catch (IOException e11) {
            throw new zzfj(true != (e11 instanceof FileNotFoundException) ? 2000 : 2005, e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        return this.f4295q;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() {
        this.f4295q = null;
        try {
            try {
                InputStream inputStream = this.f4296s;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f4296s = null;
                if (this.f4298u) {
                    this.f4298u = false;
                    i();
                }
            } catch (IOException e10) {
                throw new zzfj(2000, e10);
            }
        } catch (Throwable th) {
            this.f4296s = null;
            if (this.f4298u) {
                this.f4298u = false;
                i();
            }
            throw th;
        }
    }
}
