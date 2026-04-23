package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ax extends rt0 implements w71 {
    public static final Pattern H = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public final long F;
    public final long G;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2807h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f2808q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f2809s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yz f2810t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public iz0 f2811u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public HttpURLConnection f2812v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayDeque f2813w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InputStream f2814x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2815y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2816z;

    public ax(String str, yw ywVar, int i10, int i11, long j10, long j11) {
        super(true);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f2809s = str;
        this.f2810t = new yz();
        this.f2807h = i10;
        this.f2808q = i11;
        this.f2813w = new ArrayDeque();
        this.F = j10;
        this.G = j11;
        if (ywVar != null) {
            a(ywVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) throws zzgl {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.A;
            long j11 = this.B;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.C + j11;
            long j13 = i11;
            long j14 = j12 + j13 + this.G;
            long j15 = this.E;
            long j16 = j15 + 1;
            if (j14 > j16) {
                long j17 = this.D;
                if (j15 < j17) {
                    long jMin = Math.min(j17, Math.max(((this.F + j16) - r3) - 1, (-1) + j16 + j13));
                    o(j16, jMin, 2);
                    this.E = jMin;
                    j15 = jMin;
                }
            }
            int i12 = this.f2814x.read(bArr, i10, (int) Math.min(j13, ((j15 + 1) - this.C) - this.B));
            if (i12 == -1) {
                throw new EOFException();
            }
            this.B += (long) i12;
            c(i12);
            return i12;
        } catch (IOException e10) {
            throw new zzgl(e10, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final long g(iz0 iz0Var) throws zzgl {
        this.f2811u = iz0Var;
        this.B = 0L;
        long j10 = iz0Var.f5732c;
        long jMin = this.F;
        long j11 = iz0Var.f5733d;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11);
        }
        this.C = j10;
        HttpURLConnection httpURLConnectionO = o(j10, (jMin + j10) - 1, 1);
        this.f2812v = httpURLConnectionO;
        String headerField = httpURLConnectionO.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = H.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j12 = Long.parseLong(matcher.group(2));
                    long j13 = Long.parseLong(matcher.group(3));
                    if (j11 != -1) {
                        this.A = j11;
                        this.D = Math.max(j12, (this.C + j11) - 1);
                    } else {
                        this.A = j13 - this.C;
                        this.D = j13 - 1;
                    }
                    this.E = j12;
                    this.f2815y = true;
                    n(iz0Var);
                    return this.A;
                } catch (NumberFormatException unused) {
                    zzm.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zw("Invalid content range: ".concat(String.valueOf(headerField)), 2000, 1);
    }

    public final HttpURLConnection o(long j10, long j11, int i10) throws zzgl {
        String string = this.f2811u.f5730a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f2807h);
            httpURLConnection.setReadTimeout(this.f2808q);
            for (Map.Entry entry : this.f2810t.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j10 + "-" + j11);
            httpURLConnection.setRequestProperty("User-Agent", this.f2809s);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f2813w.add(httpURLConnection);
            String string2 = this.f2811u.f5730a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f2816z = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    p();
                    throw new zw(fb1.g("Response code: ", this.f2816z), 2000, i10);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f2814x != null) {
                        inputStream = new SequenceInputStream(this.f2814x, inputStream);
                    }
                    this.f2814x = inputStream;
                    return httpURLConnection;
                } catch (IOException e10) {
                    p();
                    throw new zzgl(e10, 2000, i10);
                }
            } catch (IOException e11) {
                p();
                throw new zzgl("Unable to connect to ".concat(String.valueOf(string2)), e11, 2000, i10);
            }
        } catch (IOException e12) {
            throw new zzgl("Unable to connect to ".concat(String.valueOf(string)), e12, 2000, i10);
        }
    }

    public final void p() {
        while (true) {
            ArrayDeque arrayDeque = this.f2813w;
            if (arrayDeque.isEmpty()) {
                this.f2812v = null;
                return;
            } else {
                try {
                    ((HttpURLConnection) arrayDeque.remove()).disconnect();
                } catch (Exception e10) {
                    zzm.zzh("Unexpected error while disconnecting", e10);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f2812v;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() {
        try {
            InputStream inputStream = this.f2814x;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzgl(e10, 2000, 3);
                }
            }
        } finally {
            this.f2814x = null;
            p();
            if (this.f2815y) {
                this.f2815y = false;
                i();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rt0, com.google.android.gms.internal.ads.hw0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f2812v;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
