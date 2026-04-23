package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public final class s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8815d;

    public s7(long j10, String str, String str2, int i10) {
        this.f8812a = j10;
        this.f8814c = str;
        this.f8815d = str2;
        this.f8813b = i10;
    }

    public static int d(InputStream inputStream) {
        return (m(inputStream) << 24) | m(inputStream) | (m(inputStream) << 8) | (m(inputStream) << 16);
    }

    public static long e(InputStream inputStream) {
        return (((long) m(inputStream)) & 255) | ((((long) m(inputStream)) & 255) << 8) | ((((long) m(inputStream)) & 255) << 16) | ((((long) m(inputStream)) & 255) << 24) | ((((long) m(inputStream)) & 255) << 32) | ((((long) m(inputStream)) & 255) << 40) | ((((long) m(inputStream)) & 255) << 48) | ((((long) m(inputStream)) & 255) << 56);
    }

    public static String g(p01 p01Var) {
        return new String(l(p01Var, e(p01Var)), StandardStringDigester.MESSAGE_CHARSET);
    }

    public static void i(int i10, BufferedOutputStream bufferedOutputStream) throws IOException {
        bufferedOutputStream.write(i10 & 255);
        bufferedOutputStream.write((i10 >> 8) & 255);
        bufferedOutputStream.write((i10 >> 16) & 255);
        bufferedOutputStream.write((i10 >> 24) & 255);
    }

    public static void j(BufferedOutputStream bufferedOutputStream, long j10) throws IOException {
        bufferedOutputStream.write((byte) j10);
        bufferedOutputStream.write((byte) (j10 >>> 8));
        bufferedOutputStream.write((byte) (j10 >>> 16));
        bufferedOutputStream.write((byte) (j10 >>> 24));
        bufferedOutputStream.write((byte) (j10 >>> 32));
        bufferedOutputStream.write((byte) (j10 >>> 40));
        bufferedOutputStream.write((byte) (j10 >>> 48));
        bufferedOutputStream.write((byte) (j10 >>> 56));
    }

    public static void k(String str, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte[] bytes = str.getBytes(StandardStringDigester.MESSAGE_CHARSET);
        int length = bytes.length;
        j(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static byte[] l(p01 p01Var, long j10) throws IOException {
        long j11 = p01Var.f7758b - p01Var.f7759d;
        if (j10 >= 0 && j10 <= j11) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(p01Var).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + j11);
    }

    public static int m(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    public static final String o(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public final synchronized z6 a(String str) {
        q7 q7Var = (q7) ((Map) this.f8814c).get(str);
        if (q7Var == null) {
            return null;
        }
        File fileF = f(str);
        try {
            p01 p01Var = new p01(new BufferedInputStream(new FileInputStream(fileF)), fileF.length(), 1);
            try {
                q7 q7VarA = q7.a(p01Var);
                if (!TextUtils.equals(str, q7VarA.f8124b)) {
                    o7.b("%s: key=%s, found=%s", fileF.getAbsolutePath(), str, q7VarA.f8124b);
                    q7 q7Var2 = (q7) ((Map) this.f8814c).remove(str);
                    if (q7Var2 != null) {
                        this.f8812a -= q7Var2.f8123a;
                    }
                    return null;
                }
                byte[] bArrL = l(p01Var, p01Var.f7758b - p01Var.f7759d);
                z6 z6Var = new z6();
                z6Var.f11157a = bArrL;
                z6Var.f11158b = q7Var.f8125c;
                z6Var.f11159c = q7Var.f8126d;
                z6Var.f11160d = q7Var.f8127e;
                z6Var.f11161e = q7Var.f8128f;
                z6Var.f11162f = q7Var.f8129g;
                List<d7> list = q7Var.f8130h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (d7 d7Var : list) {
                    treeMap.put(d7Var.f3590a, d7Var.f3591b);
                }
                z6Var.f11163g = treeMap;
                z6Var.f11164h = Collections.unmodifiableList(q7Var.f8130h);
                return z6Var;
            } finally {
                p01Var.close();
            }
        } catch (IOException e10) {
            o7.b("%s: %s", fileF.getAbsolutePath(), e10.toString());
            h(str);
            return null;
        }
    }

    public final synchronized void b() {
        long length;
        p01 p01Var;
        File fileMo7zza = ((r7) this.f8815d).mo7zza();
        if (fileMo7zza.exists()) {
            File[] fileArrListFiles = fileMo7zza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        length = file.length();
                        p01Var = new p01(new BufferedInputStream(new FileInputStream(file)), length, 1);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        q7 q7VarA = q7.a(p01Var);
                        q7VarA.f8123a = length;
                        n(q7VarA.f8124b, q7VarA);
                        p01Var.close();
                    } catch (Throwable th) {
                        p01Var.close();
                        throw th;
                    }
                }
            }
        } else if (!fileMo7zza.mkdirs()) {
            o7.b("Unable to create cache dir %s", fileMo7zza.getAbsolutePath());
        }
    }

    public final synchronized void c(String str, z6 z6Var) {
        long j10;
        try {
            long j11 = this.f8812a;
            int length = z6Var.f11157a.length;
            long j12 = j11 + ((long) length);
            int i10 = this.f8813b;
            if (j12 <= i10 || length <= i10 * 0.9f) {
                File fileF = f(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileF));
                    q7 q7Var = new q7(str, z6Var);
                    try {
                        i(538247942, bufferedOutputStream);
                        k(str, bufferedOutputStream);
                        String str2 = q7Var.f8125c;
                        if (str2 == null) {
                            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        k(str2, bufferedOutputStream);
                        j(bufferedOutputStream, q7Var.f8126d);
                        j(bufferedOutputStream, q7Var.f8127e);
                        j(bufferedOutputStream, q7Var.f8128f);
                        j(bufferedOutputStream, q7Var.f8129g);
                        List<d7> list = q7Var.f8130h;
                        if (list != null) {
                            i(list.size(), bufferedOutputStream);
                            for (d7 d7Var : list) {
                                k(d7Var.f3590a, bufferedOutputStream);
                                k(d7Var.f3591b, bufferedOutputStream);
                            }
                        } else {
                            i(0, bufferedOutputStream);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(z6Var.f11157a);
                        bufferedOutputStream.close();
                        q7Var.f8123a = fileF.length();
                        n(str, q7Var);
                        if (this.f8812a >= this.f8813b) {
                            if (o7.f7522a) {
                                o7.a("Pruning old cache entries.", new Object[0]);
                            }
                            long j13 = this.f8812a;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = ((Map) this.f8814c).entrySet().iterator();
                            int i11 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    j10 = jElapsedRealtime;
                                    break;
                                }
                                q7 q7Var2 = (q7) ((Map.Entry) it.next()).getValue();
                                if (f(q7Var2.f8124b).delete()) {
                                    j10 = jElapsedRealtime;
                                    this.f8812a -= q7Var2.f8123a;
                                } else {
                                    j10 = jElapsedRealtime;
                                    String str3 = q7Var2.f8124b;
                                    o7.b("Could not delete cache entry for key=%s, filename=%s", str3, o(str3));
                                }
                                it.remove();
                                i11++;
                                if (this.f8812a < this.f8813b * 0.9f) {
                                    break;
                                } else {
                                    jElapsedRealtime = j10;
                                }
                            }
                            if (o7.f7522a) {
                                o7.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.f8812a - j13), Long.valueOf(SystemClock.elapsedRealtime() - j10));
                            }
                        }
                    } catch (IOException e10) {
                        o7.b("%s", e10.toString());
                        bufferedOutputStream.close();
                        o7.b("Failed to write header for %s", fileF.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileF.delete()) {
                        o7.b("Could not clean up file %s", fileF.getAbsolutePath());
                    }
                    if (!((r7) this.f8815d).mo7zza().exists()) {
                        o7.b("Re-initializing cache after external clearing.", new Object[0]);
                        ((Map) this.f8814c).clear();
                        this.f8812a = 0L;
                        b();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final File f(String str) {
        return new File(((r7) this.f8815d).mo7zza(), o(str));
    }

    public final synchronized void h(String str) {
        boolean zDelete = f(str).delete();
        q7 q7Var = (q7) ((Map) this.f8814c).remove(str);
        if (q7Var != null) {
            this.f8812a -= q7Var.f8123a;
        }
        if (zDelete) {
            return;
        }
        o7.b("Could not delete cache entry for key=%s, filename=%s", str, o(str));
    }

    public final void n(String str, q7 q7Var) {
        if (((Map) this.f8814c).containsKey(str)) {
            this.f8812a = (q7Var.f8123a - ((q7) ((Map) this.f8814c).get(str)).f8123a) + this.f8812a;
        } else {
            this.f8812a += q7Var.f8123a;
        }
        ((Map) this.f8814c).put(str, q7Var);
    }

    public s7(p80 p80Var) {
        this.f8814c = new LinkedHashMap(16, 0.75f, true);
        this.f8812a = 0L;
        this.f8815d = p80Var;
        this.f8813b = 5242880;
    }

    public s7(File file) {
        this.f8814c = new LinkedHashMap(16, 0.75f, true);
        this.f8812a = 0L;
        this.f8815d = new jp0(2, file, 0);
        this.f8813b = 20971520;
    }

    public s7(pc1 pc1Var) {
        pc1Var.getClass();
        this.f8815d = pc1Var;
    }
}
