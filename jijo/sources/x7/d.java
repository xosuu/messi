package x7;

import androidx.core.app.NotificationCompat;
import f8.s;
import f8.x;
import f8.y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Logger f18529w = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f18532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f18539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f18540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f18541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f18542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f18543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f18544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c8.c f18545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f18546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f18547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f18548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f18549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d f18550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient Integer f18551v;

    public d(a aVar) {
        this.f18549t = -1L;
        this.f18530a = aVar.f18505a;
        this.f18531b = aVar.f18506b;
        this.f18532c = aVar.f18507c;
        this.f18546q = aVar.f18515k;
        this.f18533d = aVar.f18508d;
        this.f18534e = aVar.f18509e;
        this.f18535f = aVar.f18510f;
        this.f18536g = aVar.f18511g;
        this.f18537h = aVar.f18512h;
        this.f18538i = aVar.f18513i;
        this.f18539j = aVar.f18514j;
        if (aVar.f18516l == null) {
            this.f18540k = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(aVar.f18516l.size());
            arrayList.addAll(aVar.f18516l);
            this.f18540k = Collections.unmodifiableList(arrayList);
        }
        if (aVar.f18517m == null) {
            this.f18541l = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(aVar.f18517m.size());
            arrayList2.addAll(aVar.f18517m);
            this.f18541l = Collections.unmodifiableList(arrayList2);
        }
        if (aVar.f18518n == null) {
            this.f18542m = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(aVar.f18518n.size());
            arrayList3.addAll(aVar.f18518n);
            this.f18542m = Collections.unmodifiableList(arrayList3);
        }
        ArrayList arrayList4 = aVar.f18519o;
        int i10 = 0;
        if (arrayList4 == null && aVar.f18520p == null) {
            this.f18543n = Collections.emptyList();
        } else {
            int size = arrayList4 != null ? arrayList4.size() : 0;
            ArrayList arrayList5 = new ArrayList(aVar.f18520p != null ? size + 1 : size);
            ArrayList arrayList6 = aVar.f18519o;
            if (arrayList6 != null) {
                arrayList5.addAll(arrayList6);
            }
            c8.a aVar2 = aVar.f18520p;
            if (aVar2 != null) {
                c8.c cVar = new c8.c(aVar2);
                this.f18545p = cVar;
                if (cVar.f1595f == null) {
                    long j10 = 0;
                    cVar.f1595f = new y(org.minidns.dnsname.a.f16140u, x.OPT, cVar.f1590a, ((long) cVar.f1592c) | j10 | j10, new s(cVar.f1593d));
                }
                arrayList5.add(cVar.f1595f);
            }
            this.f18543n = Collections.unmodifiableList(arrayList5);
        }
        List list = this.f18543n;
        while (true) {
            if (i10 >= list.size()) {
                i10 = -1;
                break;
            } else if (((y) list.get(i10)).f13523b == x.OPT) {
                break;
            } else {
                i10++;
            }
        }
        this.f18544o = i10;
        if (i10 != -1) {
            do {
                i10++;
                if (i10 >= this.f18543n.size()) {
                    return;
                }
            } while (((y) this.f18543n.get(i10)).f13523b != x.OPT);
            throw new IllegalArgumentException("There must be only one OPT pseudo RR in the additional section");
        }
    }

    public final a a() {
        a aVar = new a();
        aVar.f18506b = b.QUERY;
        c cVar = c.NO_ERROR;
        aVar.f18505a = this.f18530a;
        aVar.f18506b = this.f18531b;
        aVar.f18507c = this.f18532c;
        aVar.f18508d = this.f18533d;
        aVar.f18509e = this.f18534e;
        aVar.f18510f = this.f18535f;
        aVar.f18511g = this.f18536g;
        aVar.f18512h = this.f18537h;
        aVar.f18513i = this.f18538i;
        aVar.f18514j = this.f18539j;
        aVar.f18515k = this.f18546q;
        List list = this.f18540k;
        ArrayList arrayList = new ArrayList(list.size());
        aVar.f18516l = arrayList;
        arrayList.addAll(list);
        List list2 = this.f18541l;
        ArrayList arrayList2 = new ArrayList(list2.size());
        aVar.f18517m = arrayList2;
        arrayList2.addAll(list2);
        List list3 = this.f18542m;
        ArrayList arrayList3 = new ArrayList(list3.size());
        aVar.f18518n = arrayList3;
        arrayList3.addAll(list3);
        List list4 = this.f18543n;
        ArrayList arrayList4 = new ArrayList(list4.size());
        aVar.f18519o = arrayList4;
        arrayList4.addAll(list4);
        return aVar;
    }

    public final ArrayList b(Class cls) {
        List list = this.f18541l;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y yVarC = ((y) it.next()).c(cls);
            if (yVarC != null) {
                arrayList.add(yVarC);
            }
        }
        return arrayList;
    }

    public final HashSet c(e eVar) {
        if (this.f18532c != c.NO_ERROR) {
            return null;
        }
        List<y> list = this.f18541l;
        HashSet hashSet = new HashSet(list.size());
        for (y yVar : list) {
            if (yVar.d(eVar) && !hashSet.add(yVar.f13527f)) {
                f18529w.log(Level.WARNING, "DnsMessage contains duplicate answers. Record: " + yVar + "; DnsMessage: " + this);
            }
        }
        return hashSet;
    }

    public final e d() {
        return (e) this.f18540k.get(0);
    }

    public final byte[] e() {
        byte[] bArr = this.f18547r;
        if (bArr != null) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int i10 = this.f18533d ? 32768 : 0;
        b bVar = this.f18531b;
        if (bVar != null) {
            i10 += bVar.f18524a << 11;
        }
        if (this.f18534e) {
            i10 += 1024;
        }
        if (this.f18535f) {
            i10 += 512;
        }
        if (this.f18536g) {
            i10 += NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (this.f18537h) {
            i10 += NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (this.f18538i) {
            i10 += 32;
        }
        if (this.f18539j) {
            i10 += 16;
        }
        c cVar = this.f18532c;
        if (cVar != null) {
            i10 += cVar.f18528a;
        }
        try {
            dataOutputStream.writeShort((short) this.f18530a);
            dataOutputStream.writeShort((short) i10);
            List list = this.f18540k;
            if (list == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list.size());
            }
            List list2 = this.f18541l;
            if (list2 == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list2.size());
            }
            List list3 = this.f18542m;
            if (list3 == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list3.size());
            }
            List list4 = this.f18543n;
            if (list4 == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list4.size());
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dataOutputStream.write(((e) it.next()).a());
                }
            }
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    dataOutputStream.write(((y) it2.next()).f());
                }
            }
            if (list3 != null) {
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    dataOutputStream.write(((y) it3.next()).f());
                }
            }
            if (list4 != null) {
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    dataOutputStream.write(((y) it4.next()).f());
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.f18547r = byteArray;
            return byteArray;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return Arrays.equals(e(), ((d) obj).e());
    }

    public final int hashCode() {
        if (this.f18551v == null) {
            this.f18551v = Integer.valueOf(Arrays.hashCode(e()));
        }
        return this.f18551v.intValue();
    }

    public final String toString() {
        String str = this.f18548s;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder("DnsMessage");
        a().a(sb);
        String string = sb.toString();
        this.f18548s = string;
        return string;
    }

    public d(byte[] bArr) throws IOException {
        this.f18549t = -1L;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f18530a = dataInputStream.readUnsignedShort();
        int unsignedShort = dataInputStream.readUnsignedShort();
        int i10 = 0;
        this.f18533d = ((unsignedShort >> 15) & 1) == 1;
        int i11 = (unsignedShort >> 11) & 15;
        b bVar = b.QUERY;
        if (i11 >= 0 && i11 <= 15) {
            b[] bVarArr = b.f18522d;
            this.f18531b = i11 >= bVarArr.length ? null : bVarArr[i11];
            this.f18534e = ((unsignedShort >> 10) & 1) == 1;
            this.f18535f = ((unsignedShort >> 9) & 1) == 1;
            this.f18536g = ((unsignedShort >> 8) & 1) == 1;
            this.f18537h = ((unsignedShort >> 7) & 1) == 1;
            this.f18538i = ((unsignedShort >> 5) & 1) == 1;
            this.f18539j = ((unsignedShort >> 4) & 1) == 1;
            int i12 = unsignedShort & 15;
            c cVar = c.NO_ERROR;
            if (i12 >= 0 && i12 <= 65535) {
                this.f18532c = (c) c.f18526d.get(Integer.valueOf(i12));
                this.f18546q = System.currentTimeMillis();
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                int unsignedShort3 = dataInputStream.readUnsignedShort();
                int unsignedShort4 = dataInputStream.readUnsignedShort();
                int unsignedShort5 = dataInputStream.readUnsignedShort();
                this.f18540k = new ArrayList(unsignedShort2);
                for (int i13 = 0; i13 < unsignedShort2; i13++) {
                    this.f18540k.add(new e(dataInputStream, bArr));
                }
                this.f18541l = new ArrayList(unsignedShort3);
                for (int i14 = 0; i14 < unsignedShort3; i14++) {
                    this.f18541l.add(y.e(dataInputStream, bArr));
                }
                this.f18542m = new ArrayList(unsignedShort4);
                for (int i15 = 0; i15 < unsignedShort4; i15++) {
                    this.f18542m.add(y.e(dataInputStream, bArr));
                }
                this.f18543n = new ArrayList(unsignedShort5);
                for (int i16 = 0; i16 < unsignedShort5; i16++) {
                    this.f18543n.add(y.e(dataInputStream, bArr));
                }
                List list = this.f18543n;
                while (true) {
                    if (i10 >= list.size()) {
                        i10 = -1;
                        break;
                    } else if (((y) list.get(i10)).f13523b == x.OPT) {
                        break;
                    } else {
                        i10++;
                    }
                }
                this.f18544o = i10;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public d(d dVar) {
        this.f18549t = -1L;
        this.f18530a = 0;
        this.f18533d = dVar.f18533d;
        this.f18531b = dVar.f18531b;
        this.f18534e = dVar.f18534e;
        this.f18535f = dVar.f18535f;
        this.f18536g = dVar.f18536g;
        this.f18537h = dVar.f18537h;
        this.f18538i = dVar.f18538i;
        this.f18539j = dVar.f18539j;
        this.f18532c = dVar.f18532c;
        this.f18546q = dVar.f18546q;
        this.f18540k = dVar.f18540k;
        this.f18541l = dVar.f18541l;
        this.f18542m = dVar.f18542m;
        this.f18543n = dVar.f18543n;
        this.f18544o = dVar.f18544o;
    }
}
