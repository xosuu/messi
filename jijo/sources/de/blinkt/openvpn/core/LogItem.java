package de.blinkt.openvpn.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.fb1;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Locale;
import java.util.UnknownFormatConversionException;
import org.jasypt.digest.StandardStringDigester;
import u.h;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class LogItem implements Parcelable {
    public static final Parcelable.Creator<LogItem> CREATOR = new j4.b(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f12540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12541b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12542d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12543f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12544h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12545q;

    public LogItem(byte[] bArr, int i10) throws UnsupportedEncodingException {
        this.f12540a = null;
        this.f12541b = null;
        this.f12543f = 1;
        this.f12544h = System.currentTimeMillis();
        this.f12545q = -1;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i10);
        byteBufferWrap.get();
        this.f12544h = byteBufferWrap.getLong();
        this.f12545q = byteBufferWrap.getInt();
        this.f12543f = fb1.a(byteBufferWrap.getInt());
        this.f12542d = byteBufferWrap.getInt();
        int i11 = byteBufferWrap.getInt();
        if (i11 == 0) {
            this.f12541b = null;
        } else {
            if (i11 > byteBufferWrap.remaining()) {
                throw new IndexOutOfBoundsException("String length " + i11 + " is bigger than remaining bytes " + byteBufferWrap.remaining());
            }
            byte[] bArr2 = new byte[i11];
            byteBufferWrap.get(bArr2);
            this.f12541b = new String(bArr2, StandardStringDigester.MESSAGE_CHARSET);
        }
        int i12 = byteBufferWrap.getInt();
        if (i12 > 30) {
            throw new IndexOutOfBoundsException("Too many arguments for Logitem to unmarschal");
        }
        if (i12 == 0) {
            this.f12540a = null;
        } else {
            this.f12540a = new Object[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                char c10 = byteBufferWrap.getChar();
                if (c10 == '0') {
                    this.f12540a[i13] = null;
                } else if (c10 == 'd') {
                    this.f12540a[i13] = Double.valueOf(byteBufferWrap.getDouble());
                } else if (c10 == 'f') {
                    this.f12540a[i13] = Float.valueOf(byteBufferWrap.getFloat());
                } else if (c10 == 'i') {
                    this.f12540a[i13] = Integer.valueOf(byteBufferWrap.getInt());
                } else if (c10 == 'l') {
                    this.f12540a[i13] = Long.valueOf(byteBufferWrap.getLong());
                } else {
                    if (c10 != 's') {
                        throw new UnsupportedEncodingException("Unknown format type: " + c10);
                    }
                    Object[] objArr = this.f12540a;
                    byte[] bArr3 = new byte[byteBufferWrap.getInt()];
                    byteBufferWrap.get(bArr3);
                    objArr[i13] = new String(bArr3, StandardStringDigester.MESSAGE_CHARSET);
                }
            }
        }
        if (byteBufferWrap.hasRemaining()) {
            throw new UnsupportedEncodingException(byteBufferWrap.remaining() + " bytes left after unmarshaling everything");
        }
    }

    public final byte[] b() throws UnsupportedEncodingException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16384);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putLong(this.f12544h);
        byteBufferAllocate.putInt(this.f12545q);
        byteBufferAllocate.putInt(fb1.b(this.f12543f));
        byteBufferAllocate.putInt(this.f12542d);
        String str = this.f12541b;
        if (str == null || str.length() == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byte[] bytes = str.getBytes(StandardStringDigester.MESSAGE_CHARSET);
            byteBufferAllocate.putInt(bytes.length);
            byteBufferAllocate.put(bytes);
        }
        Object[] objArr = this.f12540a;
        if (objArr == null || objArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(objArr.length);
            for (Object obj : objArr) {
                if (obj instanceof String) {
                    byteBufferAllocate.putChar('s');
                    byte[] bytes2 = ((String) obj).getBytes(StandardStringDigester.MESSAGE_CHARSET);
                    byteBufferAllocate.putInt(bytes2.length);
                    byteBufferAllocate.put(bytes2);
                } else if (obj instanceof Integer) {
                    byteBufferAllocate.putChar('i');
                    byteBufferAllocate.putInt(((Integer) obj).intValue());
                } else if (obj instanceof Float) {
                    byteBufferAllocate.putChar('f');
                    byteBufferAllocate.putFloat(((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    byteBufferAllocate.putChar('d');
                    byteBufferAllocate.putDouble(((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    byteBufferAllocate.putChar('l');
                    byteBufferAllocate.putLong(((Long) obj).longValue());
                } else if (obj == null) {
                    byteBufferAllocate.putChar('0');
                } else {
                    c.g("Unknown object for LogItem marschaling " + obj);
                    byteBufferAllocate.putChar('s');
                    byte[] bytes3 = obj.toString().getBytes(StandardStringDigester.MESSAGE_CHARSET);
                    byteBufferAllocate.putInt(bytes3.length);
                    byteBufferAllocate.put(bytes3);
                }
            }
        }
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.rewind();
        return Arrays.copyOf(byteBufferAllocate.array(), iPosition);
    }

    public final String c(Context context) {
        String str;
        context.getPackageManager();
        String string = "error getting package signature";
        try {
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray()));
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(x509Certificate.getEncoded());
            byte[] bArrDigest = messageDigest.digest();
            string = Arrays.equals(bArrDigest, c.f12585l) ? context.getString(R.string.qd) : Arrays.equals(bArrDigest, c.f12586m) ? context.getString(R.string.fw) : Arrays.equals(bArrDigest, c.f12587n) ? "amazon version" : Arrays.equals(bArrDigest, c.f12588o) ? "F-Droid built and signed version" : context.getString(R.string.cx, x509Certificate.getSubjectX500Principal().getName());
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException unused) {
            str = "error getting version";
        }
        Object[] objArr = this.f12540a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[objArrCopyOf.length - 1] = string;
        objArrCopyOf[objArrCopyOf.length - 2] = str;
        return context.getString(R.string.mw, objArrCopyOf);
    }

    public final String d(Context context) {
        try {
            String str = this.f12541b;
            if (str != null) {
                return str;
            }
            int i10 = this.f12542d;
            Object[] objArr = this.f12540a;
            if (context != null) {
                return i10 == R.string.mw ? c(context) : objArr == null ? context.getString(i10) : context.getString(i10, objArr);
            }
            boolean z9 = true;
            String str2 = String.format(Locale.ENGLISH, "Log (no context) resid %d", Integer.valueOf(i10));
            if (objArr == null) {
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : objArr) {
                if (z9) {
                    z9 = false;
                } else {
                    sb2.append((CharSequence) "|");
                }
                sb2.append(obj);
            }
            sb.append(sb2.toString());
            return sb.toString();
        } catch (FormatFlagsConversionMismatchException e10) {
            if (context == null) {
                throw e10;
            }
            throw new FormatFlagsConversionMismatchException(e10.getLocalizedMessage() + d(null), e10.getConversion());
        } catch (UnknownFormatConversionException e11) {
            if (context == null) {
                throw e11;
            }
            throw new UnknownFormatConversionException(e11.getLocalizedMessage() + d(null));
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        int i10 = this.f12545q;
        return i10 == -1 ? fb1.b(this.f12543f) : i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LogItem)) {
            return obj.equals(this);
        }
        LogItem logItem = (LogItem) obj;
        if (Arrays.equals(this.f12540a, logItem.f12540a)) {
            String str = this.f12541b;
            String str2 = logItem.f12541b;
            if (((str2 == null && str == str2) || str.equals(str2)) && this.f12542d == logItem.f12542d) {
                int i10 = logItem.f12543f;
                int i11 = this.f12543f;
                if (((i11 == 0 && i10 == i11) || h.a(i10, i11)) && this.f12545q == logItem.f12545q && this.f12544h == logItem.f12544h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        return d(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeArray(this.f12540a);
        parcel.writeString(this.f12541b);
        parcel.writeInt(this.f12542d);
        parcel.writeInt(fb1.b(this.f12543f));
        parcel.writeInt(this.f12545q);
        parcel.writeLong(this.f12544h);
    }

    public LogItem(int i10, int i11, Object... objArr) {
        this.f12540a = null;
        this.f12541b = null;
        this.f12543f = 1;
        this.f12544h = System.currentTimeMillis();
        this.f12545q = -1;
        this.f12542d = i11;
        this.f12540a = objArr;
        this.f12543f = i10;
    }

    public LogItem(int i10, String str) {
        this.f12540a = null;
        this.f12541b = null;
        this.f12543f = 1;
        this.f12544h = System.currentTimeMillis();
        this.f12545q = -1;
        this.f12543f = i10;
        this.f12541b = str;
    }
}
