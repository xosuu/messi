package y3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Pair;
import b4.f;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.bz0;
import com.google.android.gms.internal.ads.d1;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.ik0;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.qx0;
import com.google.android.gms.internal.ads.t2;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.th;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.ads.v6;
import com.google.android.gms.internal.ads.w6;
import com.google.android.gms.internal.ads.x6;
import com.google.android.gms.internal.ads.y6;
import com.google.android.gms.internal.ads.z4;
import com.google.android.gms.internal.ads.zzafx;
import com.google.android.gms.internal.ads.zzagd;
import com.google.android.gms.internal.ads.zzagm;
import com.google.android.gms.internal.ads.zzaok;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.a0;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f20452a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f20453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f20454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f20455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f20456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f20457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f20458g;

    public static ByteBuffer A(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(fb1.g("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return x(i10, byteBuffer);
        }
        throw new IOException(a0.f("Length-prefixed field longer than remaining buffer. Field length: ", i10, ", remaining: ", byteBuffer.remaining()));
    }

    public static long B(byte b10, byte b11) {
        int i10;
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        int i14 = i13 & 3;
        return ((long) i10) * ((long) (i13 >= 16 ? 2500 << i14 : i13 >= 12 ? 10000 << (i13 & 1) : i14 == 3 ? DateTimeConstants.MILLIS_PER_MINUTE : 10000 << i14));
    }

    public static void C(int i10, byte[] bArr) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    public static byte[] D(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 > byteBuffer.remaining()) {
            throw new IOException(a0.f("Underflow while reading length-prefixed value. Length: ", i10, ", available: ", byteBuffer.remaining()));
        }
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static X509Certificate[] E(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferA = A(byteBuffer);
        ByteBuffer byteBufferA2 = A(byteBuffer);
        byte[] bArrD = D(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrD2 = null;
        byte[] bArrD3 = null;
        int i10 = -1;
        int i11 = 0;
        while (byteBufferA2.hasRemaining()) {
            i11++;
            try {
                ByteBuffer byteBufferA3 = A(byteBufferA2);
                if (byteBufferA3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i12 = byteBufferA3.getInt();
                arrayList.add(Integer.valueOf(i12));
                if (i12 != 513 && i12 != 514 && i12 != 769) {
                    switch (i12) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i10 != -1) {
                    int iP = p(i12);
                    int iP2 = p(i10);
                    if (iP != 1 && iP2 == 1) {
                    }
                }
                bArrD3 = D(byteBufferA3);
                i10 = i12;
            } catch (IOException e10) {
                e = e10;
                throw new SecurityException(fb1.g("Failed to parse signature record #", i11), e);
            } catch (BufferUnderflowException e11) {
                e = e11;
                throw new SecurityException(fb1.g("Failed to parse signature record #", i11), e);
            }
        }
        if (i10 == -1) {
            if (i11 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i10 == 513 || i10 == 514) {
            str = "EC";
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            str = "DSA";
        }
        if (i10 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i10 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrD));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferA);
            if (!signature.verify(bArrD3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferA.clear();
            ByteBuffer byteBufferA4 = A(byteBufferA);
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (byteBufferA4.hasRemaining()) {
                i13++;
                try {
                    ByteBuffer byteBufferA5 = A(byteBufferA4);
                    if (byteBufferA5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i14 = byteBufferA5.getInt();
                    arrayList2.add(Integer.valueOf(i14));
                    if (i14 == i10) {
                        bArrD2 = D(byteBufferA5);
                    }
                } catch (IOException e12) {
                    e = e12;
                    throw new IOException(fb1.g("Failed to parse digest record #", i13), e);
                } catch (BufferUnderflowException e13) {
                    e = e13;
                    throw new IOException(fb1.g("Failed to parse digest record #", i13), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iP3 = p(i10);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iP3), bArrD2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrD2)) {
                throw new SecurityException(u(iP3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferA6 = A(byteBufferA);
            ArrayList arrayList3 = new ArrayList();
            int i15 = 0;
            while (byteBufferA6.hasRemaining()) {
                i15++;
                byte[] bArrD4 = D(byteBufferA6);
                try {
                    arrayList3.add(new y6((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrD4)), bArrD4));
                } catch (CertificateException e14) {
                    throw new SecurityException(fb1.g("Failed to decode certificate #", i15), e14);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrD, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e15) {
            e = e15;
            throw new SecurityException(fb1.i("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e16) {
            e = e16;
            throw new SecurityException(fb1.i("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e17) {
            e = e17;
            throw new SecurityException(fb1.i("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e18) {
            e = e18;
            throw new SecurityException(fb1.i("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e19) {
            e = e19;
            throw new SecurityException(fb1.i("Failed to verify ", str2, " signature"), e);
        }
    }

    public static byte[][] F(int[] iArr, v6[] v6VarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        long j11 = 0;
        long jZza = 0;
        int i11 = 0;
        while (true) {
            j10 = 1048576;
            if (i11 >= 3) {
                break;
            }
            jZza += (v6VarArr[i11].zza() + 1048575) / 1048576;
            i11++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(a0.g("Too many chunks: ", jZza));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i12 = 0;
        while (true) {
            length = iArr.length;
            if (i12 >= length) {
                break;
            }
            int i13 = (int) jZza;
            byte[] bArr2 = new byte[(m(iArr[i12]) * i13) + 5];
            bArr2[0] = 90;
            C(i13, bArr2);
            bArr[i12] = bArr2;
            i12++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String strU = u(iArr[i14]);
            try {
                messageDigestArr[i14] = MessageDigest.getInstance(strU);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strU.concat(" digest not supported"), e10);
            }
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (i10 = 3; i15 < i10; i10 = 3) {
            v6 v6Var = v6VarArr[i15];
            int i18 = i16;
            long j12 = j11;
            int i19 = i15;
            long jZza2 = v6Var.zza();
            while (jZza2 > j11) {
                int iMin = (int) Math.min(jZza2, j10);
                C(iMin, bArr3);
                for (int i20 = 0; i20 < length; i20++) {
                    messageDigestArr[i20].update(bArr3);
                }
                try {
                    v6Var.c(messageDigestArr, j12, iMin);
                    int i21 = 0;
                    while (i21 < iArr.length) {
                        int i22 = iArr[i21];
                        byte[] bArr4 = bArr[i21];
                        int iM = m(i22);
                        v6 v6Var2 = v6Var;
                        MessageDigest messageDigest = messageDigestArr[i21];
                        byte[] bArr5 = bArr3;
                        int iDigest = messageDigest.digest(bArr4, (i18 * iM) + 5, iM);
                        if (iDigest != iM) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i21++;
                        v6Var = v6Var2;
                        bArr3 = bArr5;
                    }
                    v6 v6Var3 = v6Var;
                    long j13 = iMin;
                    j12 += j13;
                    jZza2 -= j13;
                    i18++;
                    v6Var = v6Var3;
                    j11 = 0;
                    j10 = 1048576;
                } catch (IOException e11) {
                    throw new DigestException(a0.f("Failed to digest chunk #", i18, " of section #", i17), e11);
                }
            }
            i16 = i18;
            i17++;
            i15 = i19 + 1;
            j11 = 0;
            j10 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i23 = 0; i23 < iArr.length; i23++) {
            int i24 = iArr[i23];
            byte[] bArr7 = bArr[i23];
            String strU2 = u(i24);
            try {
                bArr6[i23] = MessageDigest.getInstance(strU2).digest(bArr7);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(strU2.concat(" digest not supported"), e12);
            }
        }
        return bArr6;
    }

    public static X509Certificate[][] G(FileChannel fileChannel, x6 x6Var) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferA = A((ByteBuffer) x6Var.f10453d);
                int i10 = 0;
                while (byteBufferA.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(E(A(byteBufferA), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException(fb1.h("Failed to parse/verify signer #", i10, " block"), e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j10 = x6Var.f10450a;
                long j11 = x6Var.f10451b;
                long j12 = x6Var.f10452c;
                ByteBuffer byteBuffer = (ByteBuffer) x6Var.f10454e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                w6 w6Var = new w6(fileChannel, 0L, j10);
                w6 w6Var2 = new w6(fileChannel, j11, j12 - j11);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                f.p0(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j10 < 0 || j10 > 4294967295L) {
                    throw new IllegalArgumentException(a0.g("uint32 value of out range: ", j10));
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j10);
                aa aaVar = new aa(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    iArr[i11] = ((Integer) it.next()).intValue();
                    i11++;
                }
                try {
                    byte[][] bArrF = F(iArr, new v6[]{w6Var, w6Var2, aaVar});
                    for (int i12 = 0; i12 < size; i12++) {
                        int i13 = iArr[i12];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i13)), bArrF[i12])) {
                            throw new SecurityException(u(i13).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e11) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e11);
                }
            } catch (IOException e12) {
                throw new SecurityException("Failed to read list of signers", e12);
            }
        } catch (CertificateException e13) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e13);
        }
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b10 : bArr) {
            char[] cArr2 = f20452a;
            cArr[i10] = cArr2[(b10 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b10 & 15];
            i10 += 2;
        }
        return new String(cArr);
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long c(InputStream inputStream, OutputStream outputStream, boolean z9) {
        byte[] bArr = new byte[1024];
        long j10 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, 1024);
                if (i10 == -1) {
                    break;
                }
                j10 += (long) i10;
                outputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                if (z9) {
                    b(inputStream);
                    b(outputStream);
                }
                throw th;
            }
        }
        if (z9) {
            b(inputStream);
            b(outputStream);
        }
        return j10;
    }

    public static boolean d(Context context) {
        if (f20455d == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z9 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z9 = true;
            }
            f20455d = Boolean.valueOf(z9);
        }
        return f20455d.booleanValue();
    }

    public static boolean e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f20453b == null) {
            f20453b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f20453b.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (k(context)) {
            return !z3.a.K() || z3.a.L();
        }
        return false;
    }

    public static byte[] f(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 2;
            bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
            i10 = i11;
        }
        return bArr;
    }

    public static z4 g(z4 z4Var, String[] strArr, Map map) {
        int length;
        int i10 = 0;
        if (z4Var == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (z4) map.get(strArr[0]);
            }
            if (length2 > 1) {
                z4 z4Var2 = new z4();
                while (i10 < length2) {
                    z4Var2.b((z4) map.get(strArr[i10]));
                    i10++;
                }
                return z4Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                z4Var.b((z4) map.get(strArr[0]));
                return z4Var;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i10 < length) {
                    z4Var.b((z4) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return z4Var;
    }

    public static Object h(qx0 qx0Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return qx0Var.mo3zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void i(lg lgVar, jg jgVar, String... strArr) {
        if (jgVar == null) {
            return;
        }
        ((b) zzu.zzB()).getClass();
        lgVar.c(jgVar, SystemClock.elapsedRealtime(), strArr);
    }

    public static void j(String str) {
        if (((Boolean) th.f9158a.k()).booleanValue()) {
            zzm.zze(str);
        }
    }

    public static boolean k(Context context) {
        if (f20454c == null) {
            f20454c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f20454c.booleanValue();
    }

    public static X509Certificate[][] l(String str) {
        Pair pairO0;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                pairO0 = null;
            } else {
                pairO0 = f.o0(randomAccessFile, 0);
                if (pairO0 == null) {
                    pairO0 = f.o0(randomAccessFile, 65535);
                }
            }
            if (pairO0 == null) {
                throw new zzaok("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairO0.first;
            long jLongValue = ((Long) pairO0.second).longValue();
            long j10 = (-20) + jLongValue;
            if (j10 >= 0) {
                randomAccessFile.seek(j10);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzaok("ZIP64 APK not supported");
                }
            }
            f.p0(byteBuffer);
            long j11 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
            if (j11 >= jLongValue) {
                throw new zzaok("ZIP Central Directory offset out of range: " + j11 + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            f.p0(byteBuffer);
            long j12 = j11;
            if (j12 + (((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L) != jLongValue) {
                throw new zzaok("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j12 < 32) {
                throw new zzaok("APK too small for APK Signing Block. ZIP Central Directory offset: " + j12);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(j12 - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new zzaok("No APK Signing Block before ZIP Central Directory");
            }
            long j13 = byteBufferAllocate.getLong(0);
            if (j13 < byteBufferAllocate.capacity() || j13 > 2147483639) {
                throw new zzaok("APK Signing Block size out of range: " + j13);
            }
            int i10 = (int) (8 + j13);
            long j14 = j12 - ((long) i10);
            if (j14 < 0) {
                throw new zzaok("APK Signing Block offset out of range: " + j14);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i10);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j14);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j15 = byteBufferAllocate2.getLong(0);
            if (j15 != j13) {
                throw new zzaok("APK Signing Block sizes in header and footer do not match: " + j15 + " vs " + j13);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j14));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                int i11 = 0;
                while (byteBufferSlice.hasRemaining()) {
                    i11++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new zzaok("Insufficient data to read size of APK Signing Block entry #" + i11);
                    }
                    long j16 = byteBufferSlice.getLong();
                    if (j16 < 4 || j16 > 2147483647L) {
                        throw new zzaok("APK Signing Block entry #" + i11 + " size out of range: " + j16);
                    }
                    int i12 = (int) j16;
                    int iPosition2 = byteBufferSlice.position() + i12;
                    if (i12 > byteBufferSlice.remaining()) {
                        throw new zzaok("APK Signing Block entry #" + i11 + " size out of range: " + i12 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrG = G(randomAccessFile.getChannel(), new x6(x(i12 - 4, byteBufferSlice), jLongValue2, j12, jLongValue, byteBuffer));
                        randomAccessFile.close();
                        return x509CertificateArrG;
                    }
                    long j17 = j12;
                    byteBufferSlice.position(iPosition2);
                    j12 = j17;
                }
                throw new zzaok("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int m(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(fb1.g("Unknown content digest algorthm: ", i10));
    }

    public static int n(ik0 ik0Var) {
        int iQ = ik0Var.q();
        if (ik0Var.q() == 1684108385) {
            ik0Var.j(8);
            int i10 = iQ - 16;
            if (i10 == 1) {
                return ik0Var.v();
            }
            if (i10 == 2) {
                return ik0Var.z();
            }
            if (i10 == 3) {
                return ik0Var.x();
            }
            if (i10 == 4 && (ik0Var.f5633a[ik0Var.f5634b] & 128) == 0) {
                return ik0Var.y();
            }
        }
        fg0.f("Failed to parse data atom to int");
        return -1;
    }

    public static final Intent o(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static int p(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    public static int q(d1 d1Var, int i10, int i11, int i12) {
        tc1.K(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        tp1.s(tp1.s(i13, i14), 1 << i12);
        if (d1Var.a() < i10) {
            return -1;
        }
        int iE = d1Var.e(i10);
        if (iE != i13) {
            return iE;
        }
        if (d1Var.a() < i11) {
            return -1;
        }
        int iE2 = d1Var.e(i11);
        int i15 = iE + iE2;
        if (iE2 != i14) {
            return i15;
        }
        if (d1Var.a() < i12) {
            return -1;
        }
        return i15 + d1Var.e(i12);
    }

    public static zzagd r(int i10, String str, ik0 ik0Var, boolean z9, boolean z10) {
        int iN = n(ik0Var);
        if (z10) {
            iN = Math.min(1, iN);
        }
        if (iN >= 0) {
            return z9 ? new zzagm(str, null, bz0.n(Integer.toString(iN))) : new zzafx("und", str, Integer.toString(iN));
        }
        fg0.f("Failed to parse uint8 attribute: ".concat(t2.c(i10)));
        return null;
    }

    public static final ResolveInfo s(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= listQueryIntentActivities.size()) {
                        break;
                    }
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                    i10++;
                }
            }
            arrayList.addAll(listQueryIntentActivities);
        } catch (Throwable th) {
            zzu.zzo().i("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th);
        }
        return resolveInfo;
    }

    public static zzagm t(int i10, String str, ik0 ik0Var) {
        int iQ = ik0Var.q();
        if (ik0Var.q() == 1684108385 && iQ >= 22) {
            ik0Var.j(10);
            int iZ = ik0Var.z();
            if (iZ > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iZ);
                String string = sb.toString();
                int iZ2 = ik0Var.z();
                if (iZ2 > 0) {
                    string = string + "/" + iZ2;
                }
                return new zzagm(str, null, bz0.n(string));
            }
        }
        fg0.f("Failed to parse index/count attribute: ".concat(t2.c(i10)));
        return null;
    }

    public static String u(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(fb1.g("Unknown content digest algorthm: ", i10));
    }

    public static void v(d1 d1Var) {
        d1Var.m(3);
        d1Var.m(8);
        boolean zO = d1Var.o();
        boolean zO2 = d1Var.o();
        if (zO) {
            d1Var.m(5);
        }
        if (zO2) {
            d1Var.m(6);
        }
    }

    public static zzagm w(int i10, String str, ik0 ik0Var) {
        int iQ = ik0Var.q();
        if (ik0Var.q() == 1684108385) {
            ik0Var.j(8);
            return new zzagm(str, null, bz0.n(ik0Var.I(iQ - 16)));
        }
        fg0.f("Failed to parse text attribute: ".concat(t2.c(i10)));
        return null;
    }

    public static ByteBuffer x(int i10, ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ArrayList y(byte[] bArr) {
        long j10 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j10 * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void z(d1 d1Var) {
        int iE;
        int iE2 = d1Var.e(2);
        if (iE2 == 0) {
            d1Var.m(6);
            return;
        }
        int iQ = q(d1Var, 5, 8, 16) + 1;
        if (iE2 == 1) {
            d1Var.m(iQ * 7);
            return;
        }
        if (iE2 == 2) {
            boolean zO = d1Var.o();
            int i10 = true != zO ? 5 : 1;
            int i11 = true == zO ? 7 : 5;
            int i12 = true == zO ? 8 : 6;
            int i13 = 0;
            while (i13 < iQ) {
                if (d1Var.o()) {
                    d1Var.m(7);
                    iE = 0;
                } else {
                    if (d1Var.e(2) == 3 && d1Var.e(i11) * i10 != 0) {
                        d1Var.l();
                    }
                    iE = d1Var.e(i12) * i10;
                    if (iE != 0 && iE != 180) {
                        d1Var.l();
                    }
                    d1Var.l();
                }
                if (iE != 0 && iE != 180 && d1Var.o()) {
                    i13++;
                }
                i13++;
            }
        }
    }
}
