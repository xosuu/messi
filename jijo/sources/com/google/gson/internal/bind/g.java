package com.google.gson.internal.bind;

import com.google.android.gms.internal.ads.fb1;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.i;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import l.a0;
import u.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final y A;
    public static final y B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f12154a = new TypeAdapters$31(Class.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$1
        @Override // com.google.gson.x
        public final Object b(s5.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.x
        public final void c(s5.b bVar, Object obj) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
        }
    }.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f12155b = new TypeAdapters$31(BitSet.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$2
        @Override // com.google.gson.x
        public final Object b(s5.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.a();
            int iT = aVar.T();
            int i10 = 0;
            while (iT != 2) {
                int iB = h.b(iT);
                if (iB == 5 || iB == 6) {
                    int iL = aVar.L();
                    if (iL != 0) {
                        if (iL != 1) {
                            throw new JsonSyntaxException("Invalid bitset value " + iL + ", expected 0 or 1; at path " + aVar.F(true));
                        }
                        bitSet.set(i10);
                    } else {
                        continue;
                    }
                } else {
                    if (iB != 7) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + a0.u(iT) + "; at path " + aVar.F(false));
                    }
                    if (aVar.J()) {
                        bitSet.set(i10);
                    }
                }
                i10++;
                iT = aVar.T();
            }
            aVar.A();
            return bitSet;
        }

        @Override // com.google.gson.x
        public final void c(s5.b bVar, Object obj) throws IOException {
            BitSet bitSet = (BitSet) obj;
            bVar.c();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                bVar.K(bitSet.get(i10) ? 1L : 0L);
            }
            bVar.A();
        }
    }.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f12156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f12157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f12158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f12159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y f12160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y f12161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y f12162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y f12163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x f12164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final y f12165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x f12166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final x f12167n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x f12168o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final y f12169p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final y f12170q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y f12171r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y f12172s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y f12173t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final y f12174u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f12175v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final y f12176w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final y f12177x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final y f12178y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final x f12179z;

    static {
        x xVar = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$3
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                int iT = aVar.T();
                if (iT != 9) {
                    return iT == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.R())) : Boolean.valueOf(aVar.J());
                }
                aVar.P();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                bVar.L((Boolean) obj);
            }
        };
        f12156c = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$4
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) {
                if (aVar.T() != 9) {
                    return Boolean.valueOf(aVar.R());
                }
                aVar.P();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                Boolean bool = (Boolean) obj;
                bVar.N(bool == null ? "null" : bool.toString());
            }
        };
        f12157d = new TypeAdapters$32(Boolean.TYPE, Boolean.class, xVar);
        f12158e = new TypeAdapters$32(Byte.TYPE, Byte.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$5
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                if (aVar.T() == 9) {
                    aVar.P();
                    return null;
                }
                try {
                    int iL = aVar.L();
                    if (iL <= 255 && iL >= -128) {
                        return Byte.valueOf((byte) iL);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + iL + " to byte; at path " + aVar.F(true));
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    bVar.G();
                } else {
                    bVar.K(r4.byteValue());
                }
            }
        });
        f12159f = new TypeAdapters$32(Short.TYPE, Short.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$6
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                if (aVar.T() == 9) {
                    aVar.P();
                    return null;
                }
                try {
                    int iL = aVar.L();
                    if (iL <= 65535 && iL >= -32768) {
                        return Short.valueOf((short) iL);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + iL + " to short; at path " + aVar.F(true));
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    bVar.G();
                } else {
                    bVar.K(r4.shortValue());
                }
            }
        });
        f12160g = new TypeAdapters$32(Integer.TYPE, Integer.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$7
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) {
                if (aVar.T() == 9) {
                    aVar.P();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.L());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    bVar.G();
                } else {
                    bVar.K(r4.intValue());
                }
            }
        });
        f12161h = new TypeAdapters$31(AtomicInteger.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$8
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) {
                try {
                    return new AtomicInteger(aVar.L());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                bVar.K(((AtomicInteger) obj).get());
            }
        }.a());
        f12162i = new TypeAdapters$31(AtomicBoolean.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$9
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) {
                return new AtomicBoolean(aVar.J());
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                bVar.O(((AtomicBoolean) obj).get());
            }
        }.a());
        f12163j = new TypeAdapters$31(AtomicIntegerArray.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$10
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.G()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.L()));
                    } catch (NumberFormatException e10) {
                        throw new JsonSyntaxException(e10);
                    }
                }
                aVar.A();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                bVar.c();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i10 = 0; i10 < length; i10++) {
                    bVar.K(r6.get(i10));
                }
                bVar.A();
            }
        }.a());
        f12164k = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$11
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) {
                if (aVar.T() == 9) {
                    aVar.P();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.M());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.G();
                } else {
                    bVar.K(number.longValue());
                }
            }
        };
        new x() { // from class: com.google.gson.internal.bind.TypeAdapters$12
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) {
                if (aVar.T() != 9) {
                    return Float.valueOf((float) aVar.K());
                }
                aVar.P();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    bVar.G();
                    return;
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(numberValueOf.floatValue());
                }
                bVar.M(numberValueOf);
            }
        };
        new x() { // from class: com.google.gson.internal.bind.TypeAdapters$13
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) {
                if (aVar.T() != 9) {
                    return Double.valueOf(aVar.K());
                }
                aVar.P();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.G();
                } else {
                    bVar.J(number.doubleValue());
                }
            }
        };
        f12165l = new TypeAdapters$32(Character.TYPE, Character.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$14
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                if (aVar.T() == 9) {
                    aVar.P();
                    return null;
                }
                String strR = aVar.R();
                if (strR.length() == 1) {
                    return Character.valueOf(strR.charAt(0));
                }
                StringBuilder sbK = fb1.k("Expecting character, got: ", strR, "; at ");
                sbK.append(aVar.F(true));
                throw new JsonSyntaxException(sbK.toString());
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                Character ch = (Character) obj;
                bVar.N(ch == null ? null : String.valueOf(ch));
            }
        });
        x xVar2 = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$15
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                int iT = aVar.T();
                if (iT != 9) {
                    return iT == 8 ? Boolean.toString(aVar.J()) : aVar.R();
                }
                aVar.P();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                bVar.N((String) obj);
            }
        };
        f12166m = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$16
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                if (aVar.T() == 9) {
                    aVar.P();
                    return null;
                }
                String strR = aVar.R();
                try {
                    return new BigDecimal(strR);
                } catch (NumberFormatException e10) {
                    StringBuilder sbK = fb1.k("Failed parsing '", strR, "' as BigDecimal; at path ");
                    sbK.append(aVar.F(true));
                    throw new JsonSyntaxException(sbK.toString(), e10);
                }
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                bVar.M((BigDecimal) obj);
            }
        };
        f12167n = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$17
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                if (aVar.T() == 9) {
                    aVar.P();
                    return null;
                }
                String strR = aVar.R();
                try {
                    return new BigInteger(strR);
                } catch (NumberFormatException e10) {
                    StringBuilder sbK = fb1.k("Failed parsing '", strR, "' as BigInteger; at path ");
                    sbK.append(aVar.F(true));
                    throw new JsonSyntaxException(sbK.toString(), e10);
                }
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                bVar.M((BigInteger) obj);
            }
        };
        f12168o = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$18
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) {
                if (aVar.T() != 9) {
                    return new com.google.gson.internal.f(aVar.R());
                }
                aVar.P();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                bVar.M((com.google.gson.internal.f) obj);
            }
        };
        f12169p = new TypeAdapters$31(String.class, xVar2);
        f12170q = new TypeAdapters$31(StringBuilder.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$19
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) {
                if (aVar.T() != 9) {
                    return new StringBuilder(aVar.R());
                }
                aVar.P();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                StringBuilder sb = (StringBuilder) obj;
                bVar.N(sb == null ? null : sb.toString());
            }
        });
        f12171r = new TypeAdapters$31(StringBuffer.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$20
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) {
                if (aVar.T() != 9) {
                    return new StringBuffer(aVar.R());
                }
                aVar.P();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                StringBuffer stringBuffer = (StringBuffer) obj;
                bVar.N(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        f12172s = new TypeAdapters$31(URL.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$21
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                if (aVar.T() == 9) {
                    aVar.P();
                    return null;
                }
                String strR = aVar.R();
                if ("null".equals(strR)) {
                    return null;
                }
                return new URL(strR);
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                URL url = (URL) obj;
                bVar.N(url == null ? null : url.toExternalForm());
            }
        });
        f12173t = new TypeAdapters$31(URI.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$22
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                if (aVar.T() == 9) {
                    aVar.P();
                    return null;
                }
                try {
                    String strR = aVar.R();
                    if ("null".equals(strR)) {
                        return null;
                    }
                    return new URI(strR);
                } catch (URISyntaxException e10) {
                    throw new JsonIOException(e10);
                }
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                URI uri = (URI) obj;
                bVar.N(uri == null ? null : uri.toASCIIString());
            }
        });
        final x xVar3 = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$23
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) {
                if (aVar.T() != 9) {
                    return InetAddress.getByName(aVar.R());
                }
                aVar.P();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                InetAddress inetAddress = (InetAddress) obj;
                bVar.N(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        f12174u = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$34
            @Override // com.google.gson.y
            public final x a(j jVar, r5.a aVar) {
                final Class<?> cls2 = aVar.f16536a;
                if (cls.isAssignableFrom(cls2)) {
                    return new x() { // from class: com.google.gson.internal.bind.TypeAdapters$34.1
                        @Override // com.google.gson.x
                        public final Object b(s5.a aVar2) {
                            Object objB = xVar3.b(aVar2);
                            if (objB != null) {
                                Class cls3 = cls2;
                                if (!cls3.isInstance(objB)) {
                                    throw new JsonSyntaxException("Expected a " + cls3.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar2.F(true));
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.x
                        public final void c(s5.b bVar, Object obj) {
                            xVar3.c(bVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + xVar3 + "]";
            }
        };
        f12175v = new TypeAdapters$31(UUID.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$24
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                if (aVar.T() == 9) {
                    aVar.P();
                    return null;
                }
                String strR = aVar.R();
                try {
                    return UUID.fromString(strR);
                } catch (IllegalArgumentException e10) {
                    StringBuilder sbK = fb1.k("Failed parsing '", strR, "' as UUID; at path ");
                    sbK.append(aVar.F(true));
                    throw new JsonSyntaxException(sbK.toString(), e10);
                }
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                UUID uuid = (UUID) obj;
                bVar.N(uuid == null ? null : uuid.toString());
            }
        });
        f12176w = new TypeAdapters$31(Currency.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$25
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                String strR = aVar.R();
                try {
                    return Currency.getInstance(strR);
                } catch (IllegalArgumentException e10) {
                    StringBuilder sbK = fb1.k("Failed parsing '", strR, "' as Currency; at path ");
                    sbK.append(aVar.F(true));
                    throw new JsonSyntaxException(sbK.toString(), e10);
                }
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                bVar.N(((Currency) obj).getCurrencyCode());
            }
        }.a());
        final x xVar4 = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                if (aVar.T() == 9) {
                    aVar.P();
                    return null;
                }
                aVar.c();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (aVar.T() != 4) {
                    String strN = aVar.N();
                    int iL = aVar.L();
                    if ("year".equals(strN)) {
                        i10 = iL;
                    } else if ("month".equals(strN)) {
                        i11 = iL;
                    } else if ("dayOfMonth".equals(strN)) {
                        i12 = iL;
                    } else if ("hourOfDay".equals(strN)) {
                        i13 = iL;
                    } else if ("minute".equals(strN)) {
                        i14 = iL;
                    } else if ("second".equals(strN)) {
                        i15 = iL;
                    }
                }
                aVar.D();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                if (((Calendar) obj) == null) {
                    bVar.G();
                    return;
                }
                bVar.e();
                bVar.E("year");
                bVar.K(r4.get(1));
                bVar.E("month");
                bVar.K(r4.get(2));
                bVar.E("dayOfMonth");
                bVar.K(r4.get(5));
                bVar.E("hourOfDay");
                bVar.K(r4.get(11));
                bVar.E("minute");
                bVar.K(r4.get(12));
                bVar.E("second");
                bVar.K(r4.get(13));
                bVar.D();
            }
        };
        f12177x = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$33

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Class f12126a = Calendar.class;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Class f12127b = GregorianCalendar.class;

            @Override // com.google.gson.y
            public final x a(j jVar, r5.a aVar) {
                Class cls2 = aVar.f16536a;
                if (cls2 == this.f12126a || cls2 == this.f12127b) {
                    return xVar4;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + this.f12126a.getName() + "+" + this.f12127b.getName() + ",adapter=" + xVar4 + "]";
            }
        };
        f12178y = new TypeAdapters$31(Locale.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$27
            @Override // com.google.gson.x
            public final Object b(s5.a aVar) {
                if (aVar.T() == 9) {
                    aVar.P();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.R(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                Locale locale = (Locale) obj;
                bVar.N(locale == null ? null : locale.toString());
            }
        });
        final x xVar5 = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$28
            public static m d(s5.a aVar, int i10) {
                if (i10 == 0) {
                    throw null;
                }
                int i11 = i10 - 1;
                if (i11 == 5) {
                    return new p(aVar.R());
                }
                if (i11 == 6) {
                    return new p(new com.google.gson.internal.f(aVar.R()));
                }
                if (i11 == 7) {
                    return new p(Boolean.valueOf(aVar.J()));
                }
                if (i11 != 8) {
                    throw new IllegalStateException("Unexpected token: ".concat(a0.u(i10)));
                }
                aVar.P();
                return n.f12256a;
            }

            public static void e(m mVar, s5.b bVar) throws IOException {
                if (mVar == null || (mVar instanceof n)) {
                    bVar.G();
                    return;
                }
                boolean z9 = mVar instanceof p;
                if (z9) {
                    if (!z9) {
                        throw new IllegalStateException("Not a JSON Primitive: " + mVar);
                    }
                    p pVar = (p) mVar;
                    Serializable serializable = pVar.f12258a;
                    if (serializable instanceof Number) {
                        bVar.M(pVar.b());
                        return;
                    } else if (serializable instanceof Boolean) {
                        bVar.O(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(pVar.c()));
                        return;
                    } else {
                        bVar.N(pVar.c());
                        return;
                    }
                }
                boolean z10 = mVar instanceof l;
                if (z10) {
                    bVar.c();
                    if (!z10) {
                        throw new IllegalStateException("Not a JSON Array: " + mVar);
                    }
                    Iterator it = ((l) mVar).f12255a.iterator();
                    while (it.hasNext()) {
                        e((m) it.next(), bVar);
                    }
                    bVar.A();
                    return;
                }
                boolean z11 = mVar instanceof o;
                if (!z11) {
                    throw new IllegalArgumentException("Couldn't write " + mVar.getClass());
                }
                bVar.e();
                if (!z11) {
                    throw new IllegalStateException("Not a JSON Object: " + mVar);
                }
                Iterator it2 = ((com.google.gson.internal.h) ((o) mVar).f12257a.entrySet()).iterator();
                while (((i) it2).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((com.google.gson.internal.g) it2).next();
                    bVar.E((String) entry.getKey());
                    e((m) entry.getValue(), bVar);
                }
                bVar.D();
            }

            @Override // com.google.gson.x
            public final Object b(s5.a aVar) throws IOException {
                m lVar;
                m lVar2;
                int iT = aVar.T();
                if (iT == 0) {
                    throw null;
                }
                int i10 = iT - 1;
                if (i10 == 0) {
                    aVar.a();
                    lVar = new l();
                } else if (i10 != 2) {
                    lVar = null;
                } else {
                    aVar.c();
                    lVar = new o();
                }
                if (lVar == null) {
                    return d(aVar, iT);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.G()) {
                        String strN = lVar instanceof o ? aVar.N() : null;
                        int iT2 = aVar.T();
                        if (iT2 == 0) {
                            throw null;
                        }
                        int i11 = iT2 - 1;
                        if (i11 == 0) {
                            aVar.a();
                            lVar2 = new l();
                        } else if (i11 != 2) {
                            lVar2 = null;
                        } else {
                            aVar.c();
                            lVar2 = new o();
                        }
                        boolean z9 = lVar2 != null;
                        if (lVar2 == null) {
                            lVar2 = d(aVar, iT2);
                        }
                        if (lVar instanceof l) {
                            ((l) lVar).f12255a.add(lVar2);
                        } else {
                            o oVar = (o) lVar;
                            oVar.getClass();
                            oVar.f12257a.put(strN, lVar2);
                        }
                        if (z9) {
                            arrayDeque.addLast(lVar);
                            lVar = lVar2;
                        }
                    } else {
                        if (lVar instanceof l) {
                            aVar.A();
                        } else {
                            aVar.D();
                        }
                        if (arrayDeque.isEmpty()) {
                            return lVar;
                        }
                        lVar = (m) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.x
            public final /* bridge */ /* synthetic */ void c(s5.b bVar, Object obj) throws IOException {
                e((m) obj, bVar);
            }
        };
        f12179z = xVar5;
        final Class<m> cls2 = m.class;
        A = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$34
            @Override // com.google.gson.y
            public final x a(j jVar, r5.a aVar) {
                final Class cls22 = aVar.f16536a;
                if (cls2.isAssignableFrom(cls22)) {
                    return new x() { // from class: com.google.gson.internal.bind.TypeAdapters$34.1
                        @Override // com.google.gson.x
                        public final Object b(s5.a aVar2) {
                            Object objB = xVar5.b(aVar2);
                            if (objB != null) {
                                Class cls3 = cls22;
                                if (!cls3.isInstance(objB)) {
                                    throw new JsonSyntaxException("Expected a " + cls3.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar2.F(true));
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.x
                        public final void c(s5.b bVar, Object obj) {
                            xVar5.c(bVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + xVar5 + "]";
            }
        };
        B = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$29
            @Override // com.google.gson.y
            public final x a(j jVar, r5.a aVar) {
                final Class superclass = aVar.f16536a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new x(superclass) { // from class: com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final HashMap f12133a = new HashMap();

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final HashMap f12134b = new HashMap();

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final HashMap f12135c = new HashMap();

                    {
                        try {
                            for (Field field : (Field[]) AccessController.doPrivileged(new f(superclass))) {
                                Enum r42 = (Enum) field.get(null);
                                String strName = r42.name();
                                String string = r42.toString();
                                o5.b bVar = (o5.b) field.getAnnotation(o5.b.class);
                                if (bVar != null) {
                                    strName = bVar.value();
                                    for (String str : bVar.alternate()) {
                                        this.f12133a.put(str, r42);
                                    }
                                }
                                this.f12133a.put(strName, r42);
                                this.f12134b.put(string, r42);
                                this.f12135c.put(r42, strName);
                            }
                        } catch (IllegalAccessException e10) {
                            throw new AssertionError(e10);
                        }
                    }

                    @Override // com.google.gson.x
                    public final Object b(s5.a aVar2) throws IOException {
                        if (aVar2.T() == 9) {
                            aVar2.P();
                            return null;
                        }
                        String strR = aVar2.R();
                        Enum r02 = (Enum) this.f12133a.get(strR);
                        return r02 == null ? (Enum) this.f12134b.get(strR) : r02;
                    }

                    @Override // com.google.gson.x
                    public final void c(s5.b bVar, Object obj) throws IOException {
                        Enum r32 = (Enum) obj;
                        bVar.N(r32 == null ? null : (String) this.f12135c.get(r32));
                    }
                };
            }
        };
    }

    public static y a(Class cls, x xVar) {
        return new TypeAdapters$31(cls, xVar);
    }

    public static y b(Class cls, Class cls2, x xVar) {
        return new TypeAdapters$32(cls, cls2, xVar);
    }

    public static y c(final r5.a aVar, final x xVar) {
        return new y() { // from class: com.google.gson.internal.bind.TypeAdapters$30
            @Override // com.google.gson.y
            public final x a(j jVar, r5.a aVar2) {
                if (aVar2.equals(aVar)) {
                    return xVar;
                }
                return null;
            }
        };
    }
}
