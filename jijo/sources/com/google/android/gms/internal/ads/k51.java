package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class k51 extends rt0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RandomAccessFile f6193h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Uri f6194q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6196t;

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) throws zzgi {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f6195s;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f6193h;
            int i12 = yn0.f10944a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i13 > 0) {
                this.f6195s -= (long) i13;
                c(i13);
            }
            return i13;
        } catch (IOException e10) {
            throw new zzgi(2000, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final long g(iz0 iz0Var) throws zzgi {
        Uri uri = iz0Var.f5730a;
        long j10 = iz0Var.f5732c;
        this.f6194q = uri;
        j(iz0Var);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f6193h = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long length = iz0Var.f5733d;
                if (length == -1) {
                    length = this.f6193h.length() - j10;
                }
                this.f6195s = length;
                if (length < 0) {
                    throw new zzgi(2008, null, null);
                }
                this.f6196t = true;
                n(iz0Var);
                return this.f6195s;
            } catch (IOException e10) {
                throw new zzgi(2000, e10);
            }
        } catch (FileNotFoundException e11) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgi(1004, String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11);
            }
            int i10 = yn0.f10944a;
            throw new zzgi(true != o41.b(e11.getCause()) ? 2005 : 2006, e11);
        } catch (SecurityException e12) {
            throw new zzgi(2006, e12);
        } catch (RuntimeException e13) {
            throw new zzgi(2000, e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        return this.f6194q;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() {
        this.f6194q = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f6193h;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f6193h = null;
                if (this.f6196t) {
                    this.f6196t = false;
                    i();
                }
            } catch (IOException e10) {
                throw new zzgi(2000, e10);
            }
        } catch (Throwable th) {
            this.f6193h = null;
            if (this.f6196t) {
                this.f6196t = false;
                i();
            }
            throw th;
        }
    }
}
