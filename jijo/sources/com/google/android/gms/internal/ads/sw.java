package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class sw extends rt0 implements w71 {
    public static final Pattern F = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference G = new AtomicReference();
    public long A;
    public long B;
    public long C;
    public int D;
    public final HashSet E;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rw f8974h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f8975q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8977t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final yz f8978u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public HttpURLConnection f8979v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InputStream f8980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8981x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8982y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f8983z;

    public sw(String str, yw ywVar, int i10, int i11, int i12) {
        super(true);
        this.f8974h = new rw(this);
        this.E = new HashSet();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f8977t = str;
        this.f8978u = new yz();
        this.f8975q = i10;
        this.f8976s = i11;
        this.D = i12;
        if (ywVar != null) {
            a(ywVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:7:0x000e, B:9:0x0016, B:12:0x001e, B:14:0x0026, B:17:0x003c, B:18:0x0046, B:19:0x004b, B:20:0x004c, B:21:0x0051, B:22:0x0052, B:25:0x0058, B:27:0x0060, B:30:0x006b, B:31:0x0071, B:33:0x0079, B:36:0x0080, B:37:0x0085, B:38:0x0086), top: B:42:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086 A[Catch: IOException -> 0x001b, TRY_LEAVE, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:7:0x000e, B:9:0x0016, B:12:0x001e, B:14:0x0026, B:17:0x003c, B:18:0x0046, B:19:0x004b, B:20:0x004c, B:21:0x0051, B:22:0x0052, B:25:0x0058, B:27:0x0060, B:30:0x006b, B:31:0x0071, B:33:0x0079, B:36:0x0080, B:37:0x0085, B:38:0x0086), top: B:42:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.nl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r11, byte[] r12, int r13) throws com.google.android.gms.internal.ads.zzgl {
        /*
            r10 = this;
            long r0 = r10.B     // Catch: java.io.IOException -> L1b
            long r2 = r10.f8983z     // Catch: java.io.IOException -> L1b
            r4 = 0
            r5 = -1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto Lb
            goto L55
        Lb:
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.gms.internal.ads.sw.G
            r1 = 0
            java.lang.Object r1 = r0.getAndSet(r1)     // Catch: java.io.IOException -> L1b
            byte[] r1 = (byte[]) r1     // Catch: java.io.IOException -> L1b
            if (r1 != 0) goto L1e
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L1b
            goto L1e
        L1b:
            r11 = move-exception
            goto L90
        L1e:
            long r2 = r10.B     // Catch: java.io.IOException -> L1b
            long r6 = r10.f8983z     // Catch: java.io.IOException -> L1b
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L52
            int r8 = r1.length     // Catch: java.io.IOException -> L1b
            long r6 = r6 - r2
            long r2 = (long) r8     // Catch: java.io.IOException -> L1b
            long r2 = java.lang.Math.min(r6, r2)     // Catch: java.io.IOException -> L1b
            int r3 = (int) r2     // Catch: java.io.IOException -> L1b
            java.io.InputStream r2 = r10.f8980w     // Catch: java.io.IOException -> L1b
            int r2 = r2.read(r1, r4, r3)     // Catch: java.io.IOException -> L1b
            boolean r3 = java.lang.Thread.interrupted()     // Catch: java.io.IOException -> L1b
            if (r3 != 0) goto L4c
            if (r2 == r5) goto L46
            long r6 = r10.B     // Catch: java.io.IOException -> L1b
            long r8 = (long) r2     // Catch: java.io.IOException -> L1b
            long r6 = r6 + r8
            r10.B = r6     // Catch: java.io.IOException -> L1b
            r10.c(r2)     // Catch: java.io.IOException -> L1b
            goto L1e
        L46:
            java.io.EOFException r11 = new java.io.EOFException     // Catch: java.io.IOException -> L1b
            r11.<init>()     // Catch: java.io.IOException -> L1b
            throw r11     // Catch: java.io.IOException -> L1b
        L4c:
            java.io.InterruptedIOException r11 = new java.io.InterruptedIOException     // Catch: java.io.IOException -> L1b
            r11.<init>()     // Catch: java.io.IOException -> L1b
            throw r11     // Catch: java.io.IOException -> L1b
        L52:
            r0.set(r1)     // Catch: java.io.IOException -> L1b
        L55:
            if (r13 != 0) goto L58
            goto L8f
        L58:
            long r0 = r10.A     // Catch: java.io.IOException -> L1b
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L71
            long r6 = r10.C     // Catch: java.io.IOException -> L1b
            long r0 = r0 - r6
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L6b
        L69:
            r4 = -1
            goto L8f
        L6b:
            long r6 = (long) r13     // Catch: java.io.IOException -> L1b
            long r0 = java.lang.Math.min(r6, r0)     // Catch: java.io.IOException -> L1b
            int r13 = (int) r0     // Catch: java.io.IOException -> L1b
        L71:
            java.io.InputStream r0 = r10.f8980w     // Catch: java.io.IOException -> L1b
            int r4 = r0.read(r12, r11, r13)     // Catch: java.io.IOException -> L1b
            if (r4 != r5) goto L86
            long r11 = r10.A     // Catch: java.io.IOException -> L1b
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 != 0) goto L80
            goto L69
        L80:
            java.io.EOFException r11 = new java.io.EOFException     // Catch: java.io.IOException -> L1b
            r11.<init>()     // Catch: java.io.IOException -> L1b
            throw r11     // Catch: java.io.IOException -> L1b
        L86:
            long r11 = r10.C     // Catch: java.io.IOException -> L1b
            long r0 = (long) r4     // Catch: java.io.IOException -> L1b
            long r11 = r11 + r0
            r10.C = r11     // Catch: java.io.IOException -> L1b
            r10.c(r4)     // Catch: java.io.IOException -> L1b
        L8f:
            return r4
        L90:
            com.google.android.gms.internal.ads.zzgl r12 = new com.google.android.gms.internal.ads.zzgl
            r13 = 2000(0x7d0, float:2.803E-42)
            r0 = 2
            r12.<init>(r11, r13, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sw.b(int, byte[], int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0235 A[Catch: IOException -> 0x003b, TryCatch #4 {IOException -> 0x003b, blocks: (B:3:0x000d, B:11:0x0028, B:13:0x0032, B:16:0x003e, B:17:0x0056, B:19:0x005c, B:32:0x00bb, B:34:0x00c4, B:35:0x00cb, B:48:0x00f5, B:101:0x022a, B:103:0x0235, B:105:0x0246, B:108:0x024f, B:109:0x025e, B:111:0x0265, B:112:0x026c, B:28:0x0087, B:30:0x00a3, B:31:0x00b4, B:113:0x026d, B:114:0x0283), top: B:125:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4 A[Catch: IOException -> 0x003b, TryCatch #4 {IOException -> 0x003b, blocks: (B:3:0x000d, B:11:0x0028, B:13:0x0032, B:16:0x003e, B:17:0x0056, B:19:0x005c, B:32:0x00bb, B:34:0x00c4, B:35:0x00cb, B:48:0x00f5, B:101:0x022a, B:103:0x0235, B:105:0x0246, B:108:0x024f, B:109:0x025e, B:111:0x0265, B:112:0x026c, B:28:0x0087, B:30:0x00a3, B:31:0x00b4, B:113:0x026d, B:114:0x0283), top: B:125:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cb  */
    @Override // com.google.android.gms.internal.ads.hw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long g(com.google.android.gms.internal.ads.iz0 r21) throws com.google.android.gms.internal.ads.zzgl {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sw.g(com.google.android.gms.internal.ads.iz0):long");
    }

    public final void o() {
        HttpURLConnection httpURLConnection = this.f8979v;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                zzm.zzh("Unexpected error while disconnecting", e10);
            }
            this.f8979v = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f8979v;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() {
        HashSet hashSet = this.E;
        try {
            InputStream inputStream = this.f8980w;
            if (inputStream != null) {
                int i10 = yn0.f10944a;
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzgl(e10, 2000, 3);
                }
            }
        } finally {
            this.f8980w = null;
            o();
            if (this.f8981x) {
                this.f8981x = false;
                i();
            }
            hashSet.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.rt0, com.google.android.gms.internal.ads.hw0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f8979v;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
