package k6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable, Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f14688h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14691d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f14689a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14690b = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14692f = null;

    public static h[][] f(HashSet hashSet) {
        m(hashSet);
        h[][] hVarArr = new h[hashSet.size()][];
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            int i10 = fVar.f14718d;
            Set set = fVar.f14717b;
            h[] hVarArr2 = (h[]) set.toArray(new h[set.size()]);
            i iVar = new i();
            iVar.f14726a = false;
            Arrays.sort(hVarArr2, iVar);
            hVarArr[i10] = hVarArr2;
        }
        return hVarArr;
    }

    public static void m(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            ((f) it.next()).f14718d = i10;
            i10++;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        try {
            a aVar = (a) super.clone();
            if (!i()) {
                HashMap map = new HashMap();
                HashSet<f> hashSetH = h();
                Iterator it = hashSetH.iterator();
                while (it.hasNext()) {
                    map.put((f) it.next(), new f());
                }
                for (f fVar : hashSetH) {
                    f fVar2 = (f) map.get(fVar);
                    fVar2.f14716a = fVar.f14716a;
                    if (fVar == this.f14689a) {
                        aVar.f14689a = fVar2;
                    }
                    for (h hVar : fVar.f14717b) {
                        fVar2.f14717b.add(new h(hVar.f14723a, hVar.f14724b, (f) map.get(hVar.f14725d)));
                    }
                }
            }
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final a b() {
        a aVarClone = clone();
        aVarClone.d();
        return aVarClone;
    }

    public final void c() {
        if (this.f14690b || i()) {
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(this.f14689a);
        char[] cArrG = g();
        HashMap map = new HashMap();
        LinkedList linkedList = new LinkedList();
        HashMap map2 = new HashMap();
        map.put(hashSet, hashSet);
        linkedList.add(hashSet);
        f fVar = new f();
        this.f14689a = fVar;
        map2.put(hashSet, fVar);
        while (linkedList.size() > 0) {
            Set set = (Set) linkedList.removeFirst();
            f fVar2 = (f) map2.get(set);
            Iterator it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((f) it.next()).f14716a) {
                        fVar2.f14716a = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            int i10 = 0;
            while (i10 < cArrG.length) {
                HashSet hashSet2 = new HashSet();
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    for (h hVar : ((f) it2.next()).f14717b) {
                        char c10 = hVar.f14723a;
                        char c11 = cArrG[i10];
                        if (c10 <= c11 && c11 <= hVar.f14724b) {
                            hashSet2.add(hVar.f14725d);
                        }
                    }
                }
                if (!map.containsKey(hashSet2)) {
                    map.put(hashSet2, hashSet2);
                    linkedList.add(hashSet2);
                    map2.put(hashSet2, new f());
                }
                f fVar3 = (f) map2.get(hashSet2);
                char c12 = cArrG[i10];
                i10++;
                fVar2.f14717b.add(new h(c12, i10 < cArrG.length ? (char) (cArrG[i10] - 1) : (char) 65535, fVar3));
            }
        }
        this.f14690b = true;
        k();
    }

    public final void d() {
        if (i()) {
            f fVar = new f();
            this.f14689a = fVar;
            int i10 = 0;
            while (i10 < this.f14692f.length()) {
                f fVar2 = new f();
                fVar.f14717b.add(new h(this.f14692f.charAt(i10), fVar2));
                i10++;
                fVar = fVar2;
            }
            fVar.f14716a = true;
            this.f14690b = true;
            this.f14692f = null;
        }
    }

    public final HashSet e() {
        d();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.f14689a);
        hashSet2.add(this.f14689a);
        while (linkedList.size() > 0) {
            f fVar = (f) linkedList.removeFirst();
            if (fVar.f14716a) {
                hashSet.add(fVar);
            }
            for (h hVar : fVar.f14717b) {
                if (!hashSet2.contains(hVar.f14725d)) {
                    f fVar2 = hVar.f14725d;
                    hashSet2.add(fVar2);
                    linkedList.add(fVar2);
                }
            }
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return (i() && aVar.i()) ? this.f14692f.equals(aVar.f14692f) : hashCode() == aVar.hashCode() && n(aVar) && aVar.n(this);
    }

    public final char[] g() {
        int i10;
        HashSet hashSet = new HashSet();
        Iterator it = h().iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            f fVar = (f) it.next();
            hashSet.add((char) 0);
            for (h hVar : fVar.f14717b) {
                hashSet.add(Character.valueOf(hVar.f14723a));
                char c10 = hVar.f14724b;
                if (c10 < 65535) {
                    hashSet.add(Character.valueOf((char) (c10 + 1)));
                }
            }
        }
        char[] cArr = new char[hashSet.size()];
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            cArr[i10] = ((Character) it2.next()).charValue();
            i10++;
        }
        Arrays.sort(cArr);
        return cArr;
    }

    public final HashSet h() {
        Collection<h> collectionAsList;
        d();
        if (f14688h == null) {
            f14688h = Boolean.valueOf(System.getProperty("dk.brics.automaton.debug") != null);
        }
        HashSet linkedHashSet = f14688h.booleanValue() ? new LinkedHashSet() : new HashSet();
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.f14689a);
        linkedHashSet.add(this.f14689a);
        while (linkedList.size() > 0) {
            f fVar = (f) linkedList.removeFirst();
            if (f14688h == null) {
                f14688h = Boolean.valueOf(System.getProperty("dk.brics.automaton.debug") != null);
            }
            if (f14688h.booleanValue()) {
                Set set = fVar.f14717b;
                h[] hVarArr = (h[]) set.toArray(new h[set.size()]);
                i iVar = new i();
                iVar.f14726a = false;
                Arrays.sort(hVarArr, iVar);
                collectionAsList = Arrays.asList(hVarArr);
            } else {
                collectionAsList = fVar.f14717b;
            }
            for (h hVar : collectionAsList) {
                if (!linkedHashSet.contains(hVar.f14725d)) {
                    f fVar2 = hVar.f14725d;
                    linkedHashSet.add(fVar2);
                    linkedList.add(fVar2);
                }
            }
        }
        return linkedHashSet;
    }

    public final int hashCode() {
        if (this.f14691d == 0) {
            j();
        }
        return this.f14691d;
    }

    public final boolean i() {
        return this.f14692f != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0466  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 1209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.a.j():void");
    }

    public final void k() {
        this.f14691d = 0;
        if (i()) {
            return;
        }
        HashSet<f> hashSetH = h();
        HashMap map = new HashMap();
        Iterator it = hashSetH.iterator();
        while (it.hasNext()) {
            map.put((f) it.next(), new HashSet());
        }
        for (f fVar : hashSetH) {
            Iterator it2 = fVar.f14717b.iterator();
            while (it2.hasNext()) {
                ((Set) map.get(((h) it2.next()).f14725d)).add(fVar);
            }
        }
        HashSet hashSet = new HashSet(e());
        LinkedList linkedList = new LinkedList(hashSet);
        while (linkedList.size() > 0) {
            for (f fVar2 : (Set) map.get((f) linkedList.removeFirst())) {
                if (!hashSet.contains(fVar2)) {
                    hashSet.add(fVar2);
                    linkedList.add(fVar2);
                }
            }
        }
        for (f fVar3 : hashSetH) {
            Set<h> set = fVar3.f14717b;
            fVar3.f14717b = new HashSet();
            for (h hVar : set) {
                if (hashSet.contains(hVar.f14725d)) {
                    fVar3.f14717b.add(hVar);
                }
            }
        }
        if (i()) {
            return;
        }
        HashSet<f> hashSetH2 = h();
        m(hashSetH2);
        for (f fVar4 : hashSetH2) {
            Set set2 = fVar4.f14717b;
            h[] hVarArr = (h[]) set2.toArray(new h[set2.size()]);
            i iVar = new i();
            iVar.f14726a = true;
            Arrays.sort(hVarArr, iVar);
            List<h> listAsList = Arrays.asList(hVarArr);
            fVar4.f14717b = new HashSet();
            int i10 = -1;
            f fVar5 = null;
            int i11 = -1;
            for (h hVar2 : listAsList) {
                f fVar6 = hVar2.f14725d;
                char c10 = hVar2.f14724b;
                char c11 = hVar2.f14723a;
                if (fVar5 != fVar6) {
                    if (fVar5 != null) {
                        fVar4.f14717b.add(new h((char) i10, (char) i11, fVar5));
                    }
                    fVar5 = hVar2.f14725d;
                } else if (c11 <= i11 + 1) {
                    if (c10 > i11) {
                        i11 = c10;
                    }
                } else if (fVar5 != null) {
                    fVar4.f14717b.add(new h((char) i10, (char) i11, fVar5));
                }
                i11 = c10;
                i10 = c11;
            }
            if (fVar5 != null) {
                fVar4.f14717b.add(new h((char) i10, (char) i11, fVar5));
            }
        }
        this.f14691d = 0;
    }

    public final boolean l(String str) {
        if (i()) {
            return str.equals(this.f14692f);
        }
        if (this.f14690b) {
            f fVarE = this.f14689a;
            for (int i10 = 0; i10 < str.length(); i10++) {
                fVarE = fVarE.e(str.charAt(i10));
                if (fVarE == null) {
                    return false;
                }
            }
            return fVarE.f14716a;
        }
        HashSet hashSetH = h();
        m(hashSetH);
        LinkedList linkedList = new LinkedList();
        LinkedList<f> linkedList2 = new LinkedList();
        BitSet bitSet = new BitSet(hashSetH.size());
        BitSet bitSet2 = new BitSet(hashSetH.size());
        linkedList.add(this.f14689a);
        ArrayList<f> arrayList = new ArrayList();
        boolean z9 = this.f14689a.f14716a;
        int i11 = 0;
        while (true) {
            LinkedList linkedList3 = linkedList2;
            linkedList2 = linkedList;
            linkedList = linkedList3;
            BitSet bitSet3 = bitSet2;
            bitSet2 = bitSet;
            bitSet = bitSet3;
            if (i11 >= str.length()) {
                return z9;
            }
            char cCharAt = str.charAt(i11);
            linkedList.clear();
            bitSet.clear();
            boolean z10 = false;
            for (f fVar : linkedList2) {
                arrayList.clear();
                for (h hVar : fVar.f14717b) {
                    if (hVar.f14723a <= cCharAt && cCharAt <= hVar.f14724b) {
                        arrayList.add(hVar.f14725d);
                    }
                }
                for (f fVar2 : arrayList) {
                    if (fVar2.f14716a) {
                        z10 = true;
                    }
                    if (!bitSet.get(fVar2.f14718d)) {
                        bitSet.set(fVar2.f14718d);
                        linkedList.add(fVar2);
                    }
                }
            }
            i11++;
            z9 = z10;
        }
    }

    public final boolean n(a aVar) {
        if (this != aVar) {
            if (i()) {
                return aVar.i() ? this.f14692f.equals(aVar.f14692f) : aVar.l(this.f14692f);
            }
            aVar.c();
            h[][] hVarArrF = f(h());
            h[][] hVarArrF2 = f(aVar.h());
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            g gVar = new g(this.f14689a, aVar.f14689a);
            linkedList.add(gVar);
            hashSet.add(gVar);
            loop0: while (linkedList.size() > 0) {
                g gVar2 = (g) linkedList.removeFirst();
                f fVar = gVar2.f14721b;
                boolean z9 = fVar.f14716a;
                f fVar2 = gVar2.f14722c;
                if (!z9 || fVar2.f14716a) {
                    h[] hVarArr = hVarArrF[fVar.f14718d];
                    h[] hVarArr2 = hVarArrF2[fVar2.f14718d];
                    int i10 = 0;
                    for (int i11 = 0; i11 < hVarArr.length; i11++) {
                        while (i10 < hVarArr2.length && hVarArr2[i10].f14724b < hVarArr[i11].f14723a) {
                            i10++;
                        }
                        h hVar = hVarArr[i11];
                        int i12 = hVar.f14723a;
                        char c10 = hVar.f14724b;
                        for (int i13 = i10; i13 < hVarArr2.length; i13++) {
                            h hVar2 = hVarArr[i11];
                            char c11 = hVar2.f14724b;
                            h hVar3 = hVarArr2[i13];
                            char c12 = hVar3.f14723a;
                            if (c11 < c12) {
                                break;
                            }
                            if (c12 > i12) {
                                break loop0;
                            }
                            char c13 = hVar3.f14724b;
                            i12 = 65535;
                            if (c13 < 65535) {
                                i12 = c13 + 1;
                            } else {
                                c10 = 0;
                            }
                            g gVar3 = new g(hVar2.f14725d, hVar3.f14725d);
                            if (!hashSet.contains(gVar3)) {
                                linkedList.add(gVar3);
                                hashSet.add(gVar3);
                            }
                        }
                        if (i12 > c10) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final void o() {
        f fVar = new f();
        fVar.f14717b.add(new h((char) 0, (char) 65535, fVar));
        for (f fVar2 : h()) {
            Set set = fVar2.f14717b;
            h[] hVarArr = (h[]) set.toArray(new h[set.size()]);
            i iVar = new i();
            iVar.f14726a = false;
            Arrays.sort(hVarArr, iVar);
            int i10 = 0;
            for (h hVar : Arrays.asList(hVarArr)) {
                char c10 = hVar.f14723a;
                if (c10 > i10) {
                    fVar2.f14717b.add(new h((char) i10, (char) (c10 - 1), fVar));
                }
                int i11 = hVar.f14724b + 1;
                if (i11 > i10) {
                    i10 = i11;
                }
            }
            if (i10 <= 65535) {
                fVar2.f14717b.add(new h((char) i10, (char) 65535, fVar));
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (i()) {
            sb.append("singleton: ");
            for (char c10 : this.f14692f.toCharArray()) {
                h.a(c10, sb);
            }
            sb.append("\n");
        } else {
            HashSet hashSetH = h();
            m(hashSetH);
            sb.append("initial state: ");
            sb.append(this.f14689a.f14718d);
            sb.append("\n");
            Iterator it = hashSetH.iterator();
            while (it.hasNext()) {
                sb.append(((f) it.next()).toString());
            }
        }
        return sb.toString();
    }
}
