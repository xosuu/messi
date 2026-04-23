package org.minidns.dnsname;

import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.minidns.dnslabel.DnsLabel$LabelToLongException;
import org.minidns.dnsname.InvalidDnsNameException;
import w7.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements CharSequence, Serializable, Comparable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f16140u = new a(".", true);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f16141v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16143b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient byte[] f16144d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient String f16145f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient b[] f16146h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public transient b[] f16147q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient int f16148s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16149t = -1;

    static {
        new a("in-addr.arpa", true);
        new a("ip6.arpa", true);
        f16141v = true;
    }

    public a(String str, boolean z9) {
        boolean zIsEmpty = str.isEmpty();
        a aVar = f16140u;
        if (zIsEmpty) {
            this.f16143b = aVar.f16143b;
        } else {
            int length = str.length();
            int i10 = length - 1;
            if (length >= 2 && str.charAt(i10) == '.') {
                str = str.subSequence(0, i10).toString();
            }
            if (z9) {
                this.f16143b = str;
            } else {
                this.f16143b = aVar.f16142a.equals(str) ? aVar.f16142a : IDN.toASCII(str);
            }
        }
        String lowerCase = this.f16143b.toLowerCase(Locale.US);
        this.f16142a = lowerCase;
        if (f16141v) {
            l();
            if (this.f16144d.length > 255) {
                throw new InvalidDnsNameException.DNSNameTooLongException(lowerCase, this.f16144d);
            }
        }
    }

    public static a a(String str) {
        return new a(str, false);
    }

    public static a d(a aVar, a aVar2) {
        aVar.m();
        aVar2.m();
        int length = aVar.f16147q.length;
        b[] bVarArr = aVar2.f16147q;
        b[] bVarArr2 = new b[length + bVarArr.length];
        System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr.length);
        b[] bVarArr3 = aVar.f16147q;
        System.arraycopy(bVarArr3, 0, bVarArr2, aVar2.f16147q.length, bVarArr3.length);
        return new a(bVarArr2, true);
    }

    public static b[] f(String str) {
        String[] strArrSplit = str.split("[.。．｡]", NotificationCompat.FLAG_HIGH_PRIORITY);
        for (int i10 = 0; i10 < strArrSplit.length / 2; i10++) {
            String str2 = strArrSplit[i10];
            int length = (strArrSplit.length - i10) - 1;
            strArrSplit[i10] = strArrSplit[length];
            strArrSplit[length] = str2;
        }
        try {
            b bVar = b.f18162f;
            b[] bVarArr = new b[strArrSplit.length];
            for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                bVarArr[i11] = b.d(strArrSplit[i11]);
            }
            return bVarArr;
        } catch (DnsLabel$LabelToLongException e10) {
            throw new InvalidDnsNameException.LabelTooLongException(str, e10.f16136a);
        }
    }

    public static String i(b[] bVarArr, int i10) {
        StringBuilder sb = new StringBuilder(i10);
        for (int length = bVarArr.length - 1; length >= 0; length--) {
            sb.append((CharSequence) bVarArr[length]);
            sb.append('.');
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static a j(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        int unsignedByte = dataInputStream.readUnsignedByte();
        if ((unsignedByte & 192) == 192) {
            int unsignedByte2 = dataInputStream.readUnsignedByte() + ((unsignedByte & 63) << 8);
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(unsignedByte2));
            return k(bArr, unsignedByte2, hashSet);
        }
        if (unsignedByte == 0) {
            return f16140u;
        }
        byte[] bArr2 = new byte[unsignedByte];
        dataInputStream.readFully(bArr2);
        return d(new a(new String(bArr2, StandardCharsets.US_ASCII), true), j(dataInputStream, bArr));
    }

    public static a k(byte[] bArr, int i10, HashSet hashSet) {
        int i11 = bArr[i10];
        int i12 = i11 & 255;
        if ((i11 & 192) != 192) {
            if (i12 == 0) {
                return f16140u;
            }
            int i13 = i10 + 1;
            return d(new a(new String(bArr, i13, i12, StandardCharsets.US_ASCII), true), k(bArr, i13 + i12, hashSet));
        }
        int i14 = ((i11 & 63) << 8) + (bArr[i10 + 1] & 255);
        if (hashSet.contains(Integer.valueOf(i14))) {
            throw new IllegalStateException("Cyclic offsets detected.");
        }
        hashSet.add(Integer.valueOf(i14));
        return k(bArr, i14, hashSet);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f16142a.charAt(i10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16142a.compareTo(((a) obj).f16142a);
    }

    public final int e() {
        m();
        return this.f16146h.length;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        l();
        aVar.l();
        return Arrays.equals(this.f16144d, aVar.f16144d);
    }

    public final boolean g(a aVar) {
        m();
        aVar.m();
        if (this.f16146h.length < aVar.f16146h.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            b[] bVarArr = aVar.f16146h;
            if (i10 >= bVarArr.length) {
                return true;
            }
            if (!this.f16146h[i10].equals(bVarArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    public final boolean h() {
        String str = this.f16142a;
        return str.isEmpty() || str.equals(".");
    }

    public final int hashCode() {
        if (this.f16148s == 0 && !h()) {
            l();
            this.f16148s = Arrays.hashCode(this.f16144d);
        }
        return this.f16148s;
    }

    public final void l() {
        if (this.f16144d != null) {
            return;
        }
        m();
        b[] bVarArr = this.f16146h;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        int length = bVarArr.length;
        while (true) {
            length--;
            if (length < 0) {
                byteArrayOutputStream.write(0);
                this.f16144d = byteArrayOutputStream.toByteArray();
                return;
            }
            b bVar = bVarArr[length];
            if (bVar.f18166d == null) {
                bVar.f18166d = bVar.f18164a.getBytes(StandardCharsets.US_ASCII);
            }
            byteArrayOutputStream.write(bVar.f18166d.length);
            byte[] bArr = bVar.f18166d;
            byteArrayOutputStream.write(bArr, 0, bArr.length);
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f16142a.length();
    }

    public final void m() {
        if (this.f16146h == null || this.f16147q == null) {
            if (!h()) {
                this.f16146h = f(this.f16142a);
                this.f16147q = f(this.f16143b);
            } else {
                b[] bVarArr = new b[0];
                this.f16146h = bVarArr;
                this.f16147q = bVarArr;
            }
        }
    }

    public final a n(int i10) {
        m();
        b[] bVarArr = this.f16146h;
        if (i10 <= bVarArr.length) {
            return i10 == bVarArr.length ? this : i10 == 0 ? f16140u : new a((b[]) Arrays.copyOfRange(this.f16147q, 0, i10), false);
        }
        throw new IllegalArgumentException();
    }

    public final void o(DataOutputStream dataOutputStream) throws IOException {
        l();
        dataOutputStream.write(this.f16144d);
    }

    public final int size() {
        if (this.f16149t < 0) {
            if (h()) {
                this.f16149t = 1;
            } else {
                this.f16149t = this.f16142a.length() + 2;
            }
        }
        return this.f16149t;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f16142a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f16142a;
    }

    public a(b[] bVarArr, boolean z9) {
        this.f16147q = bVarArr;
        this.f16146h = new b[bVarArr.length];
        int length = 0;
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            length += bVarArr[i10].f18164a.length() + 1;
            this.f16146h[i10] = bVarArr[i10].a();
        }
        this.f16143b = i(bVarArr, length);
        String strI = i(this.f16146h, length);
        this.f16142a = strI;
        if (z9 && f16141v) {
            l();
            if (this.f16144d.length > 255) {
                throw new InvalidDnsNameException.DNSNameTooLongException(strI, this.f16144d);
            }
        }
    }
}
