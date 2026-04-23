package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.Signature;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class mb1 implements nb1, qd1, qx0, qe0, bf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6898a;

    public mb1() {
        this.f6898a = 5;
    }

    public static final dd1 a(long j10, Object obj) {
        dd1 dd1Var = (dd1) pe1.k(j10, obj);
        if (((wb1) dd1Var).f10152a) {
            return dd1Var;
        }
        int size = dd1Var.size();
        dd1 dd1VarA = dd1Var.a(size == 0 ? 10 : size + size);
        pe1.s(obj, j10, dd1VarA);
        return dd1VarA;
    }

    public static final boolean b(Object obj) {
        return !((nd1) obj).f7249a;
    }

    public static final nd1 d(Object obj, Object obj2) {
        nd1 nd1VarB = (nd1) obj;
        nd1 nd1Var = (nd1) obj2;
        if (!nd1Var.isEmpty()) {
            if (!nd1VarB.f7249a) {
                nd1VarB = nd1VarB.b();
            }
            nd1VarB.e();
            if (!nd1Var.isEmpty()) {
                nd1VarB.putAll(nd1Var);
            }
        }
        return nd1VarB;
    }

    public static String e(int i10, byte[] bArr, int i11) {
        int i12;
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i13 = i10 + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (i10 < i13) {
            byte b10 = bArr[i10];
            if (b10 < 0) {
                break;
            }
            i10++;
            cArr[i14] = (char) b10;
            i14++;
        }
        while (i10 < i13) {
            int i15 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 >= 0) {
                cArr[i14] = (char) b11;
                i14++;
                i10 = i15;
                while (i10 < i13) {
                    byte b12 = bArr[i10];
                    if (b12 >= 0) {
                        i10++;
                        cArr[i14] = (char) b12;
                        i14++;
                    }
                }
            } else {
                if (b11 < -32) {
                    if (i15 >= i13) {
                        throw zzgyn.b();
                    }
                    i12 = i14 + 1;
                    i10 += 2;
                    tp1.g0(b11, bArr[i15], cArr, i14);
                } else if (b11 < -16) {
                    if (i15 >= i13 - 1) {
                        throw zzgyn.b();
                    }
                    i12 = i14 + 1;
                    int i16 = i10 + 2;
                    i10 += 3;
                    tp1.X(b11, bArr[i15], bArr[i16], cArr, i14);
                } else {
                    if (i15 >= i13 - 2) {
                        throw zzgyn.b();
                    }
                    byte b13 = bArr[i15];
                    int i17 = i10 + 3;
                    byte b14 = bArr[i10 + 2];
                    i10 += 4;
                    tp1.F(b11, b13, b14, bArr[i17], cArr, i14);
                    i14 += 2;
                }
                i14 = i12;
            }
        }
        return new String(cArr, 0, i14);
    }

    public static final String f(ByteBuffer byteBuffer, int i10, int i11) throws zzgyn {
        int i12;
        if ((((byteBuffer.limit() - i10) - i11) | i10 | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i13 = i10 + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (i10 < i13) {
            byte b10 = byteBuffer.get(i10);
            if (b10 < 0) {
                break;
            }
            i10++;
            cArr[i14] = (char) b10;
            i14++;
        }
        int i15 = i14;
        while (i10 < i13) {
            int i16 = i10 + 1;
            byte b11 = byteBuffer.get(i10);
            if (b11 >= 0) {
                cArr[i15] = (char) b11;
                i15++;
                i10 = i16;
                while (i10 < i13) {
                    byte b12 = byteBuffer.get(i10);
                    if (b12 >= 0) {
                        i10++;
                        cArr[i15] = (char) b12;
                        i15++;
                    }
                }
            } else {
                if (b11 < -32) {
                    if (i16 >= i13) {
                        throw zzgyn.b();
                    }
                    i12 = i15 + 1;
                    i10 += 2;
                    tp1.g0(b11, byteBuffer.get(i16), cArr, i15);
                } else if (b11 < -16) {
                    if (i16 >= i13 - 1) {
                        throw zzgyn.b();
                    }
                    i12 = i15 + 1;
                    int i17 = i10 + 2;
                    i10 += 3;
                    tp1.X(b11, byteBuffer.get(i16), byteBuffer.get(i17), cArr, i15);
                } else {
                    if (i16 >= i13 - 2) {
                        throw zzgyn.b();
                    }
                    byte b13 = byteBuffer.get(i16);
                    int i18 = i10 + 3;
                    byte b14 = byteBuffer.get(i10 + 2);
                    i10 += 4;
                    tp1.F(b11, b13, b14, byteBuffer.get(i18), cArr, i15);
                    i15 += 2;
                }
                i15 = i12;
            }
        }
        return new String(cArr, 0, i15);
    }

    @Override // com.google.android.gms.internal.ads.bf0
    public final void G(Object obj, p pVar) {
    }

    @Override // com.google.android.gms.internal.ads.nb1
    public final /* bridge */ /* synthetic */ Object c(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    @Override // com.google.android.gms.internal.ads.qd1
    public final pd1 j(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // com.google.android.gms.internal.ads.qd1
    public final boolean n(Class cls) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public final Object mo3zza() {
        return new ai1();
    }

    public /* synthetic */ mb1(int i10) {
        this.f6898a = i10;
    }

    @Override // com.google.android.gms.internal.ads.qe0
    /* JADX INFO: renamed from: zza */
    public final void mo0zza(Object obj) {
        switch (this.f6898a) {
            case 8:
                ((dk1) obj).N(new zzhw(2, new zzjy(1), 1003));
                break;
            case 9:
            default:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case sf.zzm /* 21 */:
                break;
            case 22:
                break;
            case 23:
                break;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
    }

    public /* synthetic */ mb1(int i10, int i11) {
        this.f6898a = i10;
    }
}
