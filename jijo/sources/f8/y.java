package f8;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.minidns.dnsname.a f13522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f13523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f13524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f13527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient byte[] f13528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient Integer f13529h;

    public y(org.minidns.dnsname.a aVar, x xVar, int i10, long j10, h hVar) {
        this(aVar, xVar, w.NONE, i10, j10, hVar);
    }

    public static void b(AbstractCollection abstractCollection, Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y yVarC = ((y) it.next()).c(cls);
            if (yVarC != null) {
                abstractCollection.add(yVarC);
            }
        }
    }

    public static y e(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        long j10;
        h aVar;
        h tVar;
        h mVar;
        h bVar;
        List listEmptyList;
        h lVar;
        org.minidns.dnsname.a aVarJ = org.minidns.dnsname.a.j(dataInputStream, bArr);
        x xVarA = x.a(dataInputStream.readUnsignedShort());
        int unsignedShort = dataInputStream.readUnsignedShort();
        w wVar = (w) w.f13479h.get(Integer.valueOf(unsignedShort & 32767));
        long unsignedShort2 = (((long) dataInputStream.readUnsignedShort()) << 16) + ((long) dataInputStream.readUnsignedShort());
        int unsignedShort3 = dataInputStream.readUnsignedShort();
        int iOrdinal = xVarA.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                j10 = unsignedShort2;
                mVar = new m(org.minidns.dnsname.a.j(dataInputStream, bArr));
            } else if (iOrdinal == 5) {
                j10 = unsignedShort2;
                mVar = new c(org.minidns.dnsname.a.j(dataInputStream, bArr));
            } else {
                if (iOrdinal != 6) {
                    if (iOrdinal != 12) {
                        if (iOrdinal != 28) {
                            if (iOrdinal == 33) {
                                j10 = unsignedShort2;
                                tVar = new a0(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), org.minidns.dnsname.a.j(dataInputStream, bArr));
                            } else if (iOrdinal == 39) {
                                tVar = new e(org.minidns.dnsname.a.j(dataInputStream, bArr));
                            } else if (iOrdinal == 41) {
                                if (unsignedShort3 == 0) {
                                    listEmptyList = Collections.emptyList();
                                } else {
                                    ArrayList arrayList = new ArrayList(4);
                                    while (unsignedShort3 > 0) {
                                        int unsignedShort4 = dataInputStream.readUnsignedShort();
                                        int unsignedShort5 = dataInputStream.readUnsignedShort();
                                        byte[] bArr2 = new byte[unsignedShort5];
                                        dataInputStream.read(bArr2);
                                        c8.b bVar2 = (c8.b) c8.b.f1587f.get(Integer.valueOf(unsignedShort4));
                                        if (bVar2 == null) {
                                            bVar2 = c8.b.UNKNOWN;
                                        }
                                        arrayList.add(bVar2.ordinal() != 1 ? new c8.f(bArr2, unsignedShort4) : new c8.e(bArr2));
                                        unsignedShort3 -= unsignedShort5 + 4;
                                    }
                                    listEmptyList = arrayList;
                                }
                                tVar = new s(listEmptyList);
                            } else if (iOrdinal == 43) {
                                i iVarE = j.e(dataInputStream, unsignedShort3);
                                tVar = new g(iVarE.f13428b, iVarE.f13429c, iVarE.f13427a, iVarE.f13430d);
                            } else if (iOrdinal == 59) {
                                byte[] bArr3 = new byte[unsignedShort3];
                                dataInputStream.readFully(bArr3);
                                bVar = new r(bArr3);
                            } else if (iOrdinal != 82) {
                                if (iOrdinal == 15) {
                                    lVar = new l(dataInputStream.readUnsignedShort(), org.minidns.dnsname.a.j(dataInputStream, bArr));
                                } else if (iOrdinal != 16) {
                                    switch (iOrdinal) {
                                        case 46:
                                            x xVarA2 = x.a(dataInputStream.readUnsignedShort());
                                            byte b10 = dataInputStream.readByte();
                                            byte b11 = dataInputStream.readByte();
                                            long j11 = ((long) dataInputStream.readInt()) & 4294967295L;
                                            Date date = new Date((((long) dataInputStream.readInt()) & 4294967295L) * 1000);
                                            Date date2 = new Date((((long) dataInputStream.readInt()) & 4294967295L) * 1000);
                                            int unsignedShort6 = dataInputStream.readUnsignedShort();
                                            org.minidns.dnsname.a aVarJ2 = org.minidns.dnsname.a.j(dataInputStream, bArr);
                                            int size = (unsignedShort3 - aVarJ2.size()) - 18;
                                            byte[] bArr4 = new byte[size];
                                            if (dataInputStream.read(bArr4) != size) {
                                                throw new IOException();
                                            }
                                            bVar = new u(xVarA2, b10, b11, j11, date, date2, unsignedShort6, aVarJ2, bArr4);
                                            break;
                                            break;
                                        case 47:
                                            Logger logger = q.f13457q;
                                            org.minidns.dnsname.a aVarJ3 = org.minidns.dnsname.a.j(dataInputStream, bArr);
                                            int size2 = unsignedShort3 - aVarJ3.size();
                                            byte[] bArr5 = new byte[size2];
                                            if (dataInputStream.read(bArr5) != size2) {
                                                throw new IOException();
                                            }
                                            lVar = new q(aVarJ3, q.f(bArr5));
                                            break;
                                            break;
                                        case 48:
                                            short s9 = dataInputStream.readShort();
                                            byte b12 = dataInputStream.readByte();
                                            byte b13 = dataInputStream.readByte();
                                            byte[] bArr6 = new byte[unsignedShort3 - 4];
                                            dataInputStream.readFully(bArr6);
                                            bVar = new f(s9, b12, b13, bArr6);
                                            break;
                                        default:
                                            switch (iOrdinal) {
                                                case 50:
                                                    HashMap map = o.f13443w;
                                                    byte b14 = dataInputStream.readByte();
                                                    byte b15 = dataInputStream.readByte();
                                                    int unsignedShort7 = dataInputStream.readUnsignedShort();
                                                    int unsignedByte = dataInputStream.readUnsignedByte();
                                                    byte[] bArr7 = new byte[unsignedByte];
                                                    if (dataInputStream.read(bArr7) != unsignedByte) {
                                                        throw new IOException();
                                                    }
                                                    int unsignedByte2 = dataInputStream.readUnsignedByte();
                                                    byte[] bArr8 = new byte[unsignedByte2];
                                                    if (dataInputStream.read(bArr8) != unsignedByte2) {
                                                        throw new IOException();
                                                    }
                                                    int i10 = unsignedShort3 - ((unsignedByte + 6) + unsignedByte2);
                                                    byte[] bArr9 = new byte[i10];
                                                    if (dataInputStream.read(bArr9) != i10) {
                                                        throw new IOException();
                                                    }
                                                    bVar = new o(b14, b15, unsignedShort7, bArr7, bArr8, q.f(bArr9));
                                                    break;
                                                    break;
                                                case 51:
                                                    byte b16 = dataInputStream.readByte();
                                                    byte b17 = dataInputStream.readByte();
                                                    int unsignedShort8 = dataInputStream.readUnsignedShort();
                                                    int unsignedByte3 = dataInputStream.readUnsignedByte();
                                                    byte[] bArr10 = new byte[unsignedByte3];
                                                    if (dataInputStream.read(bArr10) != unsignedByte3 && unsignedByte3 != 0) {
                                                        throw new IOException();
                                                    }
                                                    bVar = new p(b16, b17, unsignedShort8, bArr10);
                                                    break;
                                                    break;
                                                case 52:
                                                    HashMap map2 = e0.f13409s;
                                                    byte b18 = dataInputStream.readByte();
                                                    byte b19 = dataInputStream.readByte();
                                                    byte b20 = dataInputStream.readByte();
                                                    int i11 = unsignedShort3 - 3;
                                                    byte[] bArr11 = new byte[i11];
                                                    if (dataInputStream.read(bArr11) != i11) {
                                                        throw new IOException();
                                                    }
                                                    bVar = new e0(b18, b19, b20, bArr11);
                                                    break;
                                                    break;
                                                default:
                                                    tVar = new g0(dataInputStream, unsignedShort3);
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    byte[] bArr12 = new byte[unsignedShort3];
                                    dataInputStream.readFully(bArr12);
                                    bVar = new f0(bArr12);
                                }
                                j10 = unsignedShort2;
                                tVar = lVar;
                            } else {
                                i iVarE2 = j.e(dataInputStream, unsignedShort3);
                                tVar = new d(iVarE2.f13428b, iVarE2.f13429c, iVarE2.f13427a, iVarE2.f13430d);
                            }
                            return new y(aVarJ, xVarA, wVar, unsignedShort, j10, tVar);
                        }
                        byte[] bArr13 = new byte[16];
                        dataInputStream.readFully(bArr13);
                        bVar = new b(bArr13);
                        tVar = bVar;
                    } else {
                        tVar = new t(org.minidns.dnsname.a.j(dataInputStream, bArr));
                    }
                    j10 = unsignedShort2;
                    return new y(aVarJ, xVarA, wVar, unsignedShort, j10, tVar);
                }
                j10 = unsignedShort2;
                aVar = new z(org.minidns.dnsname.a.j(dataInputStream, bArr), org.minidns.dnsname.a.j(dataInputStream, bArr), ((long) dataInputStream.readInt()) & 4294967295L, dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt(), ((long) dataInputStream.readInt()) & 4294967295L);
            }
            tVar = mVar;
            return new y(aVarJ, xVarA, wVar, unsignedShort, j10, tVar);
        }
        j10 = unsignedShort2;
        byte[] bArr14 = new byte[4];
        dataInputStream.readFully(bArr14);
        aVar = new a(bArr14);
        tVar = aVar;
        return new y(aVarJ, xVarA, wVar, unsignedShort, j10, tVar);
    }

    public final y a(Class cls) {
        y yVarC = c(cls);
        if (yVarC != null) {
            return yVarC;
        }
        throw new IllegalArgumentException("The instance " + this + " can not be cast to a Record with" + cls);
    }

    public final y c(Class cls) {
        if (this.f13523b.f13521b == cls) {
            return this;
        }
        return null;
    }

    public final boolean d(x7.e eVar) {
        x xVar = eVar.f18553b;
        if (xVar == this.f13523b || xVar == x.ANY) {
            w wVar = this.f13524c;
            w wVar2 = eVar.f18554c;
            if ((wVar2 == wVar || wVar2 == w.ANY) && eVar.f18552a.equals(this.f13522a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        y yVar = (y) obj;
        return this.f13522a.equals(yVar.f13522a) && this.f13523b == yVar.f13523b && this.f13524c == yVar.f13524c && this.f13527f.equals(yVar.f13527f);
    }

    public final byte[] f() {
        if (this.f13528g == null) {
            int size = this.f13522a.size() + 10;
            h hVar = this.f13527f;
            hVar.d();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(hVar.f13425a.length + size);
            try {
                g(new DataOutputStream(byteArrayOutputStream));
                this.f13528g = byteArrayOutputStream.toByteArray();
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
        return (byte[]) this.f13528g.clone();
    }

    public final void g(DataOutputStream dataOutputStream) throws IOException {
        h hVar = this.f13527f;
        if (hVar == null) {
            throw new IllegalStateException("Empty Record has no byte representation");
        }
        DataOutputStream dataOutputStream2 = new DataOutputStream(dataOutputStream);
        this.f13522a.o(dataOutputStream2);
        dataOutputStream2.writeShort(this.f13523b.f13520a);
        dataOutputStream2.writeShort(this.f13525d);
        dataOutputStream2.writeInt((int) this.f13526e);
        hVar.d();
        dataOutputStream2.writeShort(hVar.f13425a.length);
        hVar.d();
        dataOutputStream2.write(hVar.f13425a);
    }

    public final int hashCode() {
        if (this.f13529h == null) {
            this.f13529h = Integer.valueOf(this.f13527f.hashCode() + ((this.f13524c.hashCode() + ((this.f13523b.hashCode() + ((this.f13522a.hashCode() + 37) * 37)) * 37)) * 37));
        }
        return this.f13529h.intValue();
    }

    public final String toString() {
        return this.f13522a.f16143b + ".\t" + this.f13526e + '\t' + this.f13524c + '\t' + this.f13523b + '\t' + this.f13527f;
    }

    public y(org.minidns.dnsname.a aVar, x xVar, w wVar, int i10, long j10, h hVar) {
        this.f13522a = aVar;
        this.f13523b = xVar;
        this.f13524c = wVar;
        this.f13525d = i10;
        this.f13526e = j10;
        this.f13527f = hVar;
    }
}
