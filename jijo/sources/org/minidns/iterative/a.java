package org.minidns.iterative;

import f8.v;
import f8.x;
import f8.y;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Logger;
import l.a0;
import org.minidns.iterative.IterativeClientException;
import org.minidns.util.MultipleIoException;
import u.h;
import x7.c;
import x7.d;
import x7.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends org.minidns.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f16153k = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16154j;

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[EDGE_INSN: B:28:0x0055->B:22:0x0055 BREAK  A[LOOP:1: B:14:0x0034->B:18:0x0044], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress[] h(java.util.Set r5, java.util.Set r6) {
        /*
            r0 = 2
            java.net.InetAddress[] r0 = new java.net.InetAddress[r0]
            java.util.Iterator r5 = r5.iterator()
        L7:
            boolean r1 = r5.hasNext()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            java.lang.Object r1 = r5.next()
            f8.k r1 = (f8.k) r1
            r4 = r0[r3]
            if (r4 != 0) goto L26
            java.net.InetAddress r4 = r1.e()
            r0[r3] = r4
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L26
            goto L7
        L26:
            r5 = r0[r2]
            if (r5 != 0) goto L30
            java.net.InetAddress r5 = r1.e()
            r0[r2] = r5
        L30:
            java.util.Iterator r5 = r6.iterator()
        L34:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L55
            java.lang.Object r6 = r5.next()
            f8.k r6 = (f8.k) r6
            r1 = r0[r3]
            if (r1 != 0) goto L4b
            java.net.InetAddress r6 = r6.e()
            r0[r3] = r6
            goto L34
        L4b:
            r5 = r0[r2]
            if (r5 != 0) goto L55
            java.net.InetAddress r5 = r6.e()
            r0[r2] = r5
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.iterative.a.h(java.util.Set, java.util.Set):java.net.InetAddress[]");
    }

    @Override // org.minidns.a
    public final y7.b f(x7.a aVar) {
        aVar.getClass();
        return i(new b(this), new d(aVar));
    }

    public final y7.b i(b bVar, d dVar) throws IOException {
        InetAddress inetAddressE;
        InetAddress inetAddressE2;
        org.minidns.dnsname.a aVar = dVar.d().f18552a;
        org.minidns.dnsname.a aVarN = aVar.h() ? org.minidns.dnsname.a.f16140u : aVar.n(aVar.e() - 1);
        int i10 = this.f16129f;
        int iB = h.b(i10);
        if (iB == 0) {
            inetAddressE = null;
            for (f8.a aVar2 : a(aVarN, x.A)) {
                if (inetAddressE != null) {
                    inetAddressE2 = aVar2.e();
                    break;
                }
                inetAddressE = aVar2.e();
            }
            inetAddressE2 = null;
        } else if (iB == 1) {
            inetAddressE = null;
            for (f8.b bVar2 : a(aVarN, x.AAAA)) {
                if (inetAddressE != null) {
                    inetAddressE2 = bVar2.e();
                    break;
                }
                inetAddressE = bVar2.e();
            }
            inetAddressE2 = null;
        } else if (iB == 2) {
            InetAddress[] inetAddressArrH = h(a(aVarN, x.A), a(aVarN, x.AAAA));
            inetAddressE = inetAddressArrH[0];
            inetAddressE2 = inetAddressArrH[1];
        } else {
            if (iB != 3) {
                throw new AssertionError();
            }
            InetAddress[] inetAddressArrH2 = h(a(aVarN, x.AAAA), a(aVarN, x.A));
            inetAddressE = inetAddressArrH2[0];
            inetAddressE2 = inetAddressArrH2[1];
        }
        if (inetAddressE == null) {
            org.minidns.dnsname.a aVar3 = org.minidns.dnsname.a.f16140u;
            int iB2 = h.b(i10);
            Random random = this.f16126c;
            if (iB2 == 0) {
                InetAddress[] inetAddressArr = v7.a.f17887c;
                inetAddressE = inetAddressArr[random.nextInt(inetAddressArr.length)];
            } else if (iB2 == 1) {
                InetAddress[] inetAddressArr2 = v7.a.f17888d;
                inetAddressE = inetAddressArr2[random.nextInt(inetAddressArr2.length)];
            } else if (iB2 == 2) {
                InetAddress[] inetAddressArr3 = v7.a.f17887c;
                inetAddressE = inetAddressArr3[random.nextInt(inetAddressArr3.length)];
                InetAddress[] inetAddressArr4 = v7.a.f17888d;
                inetAddressE2 = inetAddressArr4[random.nextInt(inetAddressArr4.length)];
            } else if (iB2 == 3) {
                InetAddress[] inetAddressArr5 = v7.a.f17888d;
                inetAddressE = inetAddressArr5[random.nextInt(inetAddressArr5.length)];
                InetAddress[] inetAddressArr6 = v7.a.f17887c;
                inetAddressE2 = inetAddressArr6[random.nextInt(inetAddressArr6.length)];
            }
        }
        LinkedList linkedList = new LinkedList();
        try {
            return j(bVar, dVar, inetAddressE);
        } catch (IOException e10) {
            if (e10 instanceof IterativeClientException.LoopDetected) {
                throw e10;
            }
            linkedList.add(e10);
            if (inetAddressE2 != null) {
                try {
                    return j(bVar, dVar, inetAddressE2);
                } catch (IOException e11) {
                    linkedList.add(e11);
                    MultipleIoException.a(linkedList);
                    return null;
                }
            }
            MultipleIoException.a(linkedList);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y7.b j(org.minidns.iterative.b r13, x7.d r14, java.net.InetAddress r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.iterative.a.j(org.minidns.iterative.b, x7.d, java.net.InetAddress):y7.b");
    }

    public final c1.d k(b bVar, org.minidns.dnsname.a aVar) throws IOException {
        Random random = this.f16126c;
        ArrayList arrayList = new ArrayList(8);
        ArrayList arrayList2 = new ArrayList(8);
        int i10 = this.f16129f;
        boolean zB = a0.b(i10);
        SecureRandom secureRandom = this.f16125b;
        if (zB) {
            e eVar = new e(aVar, x.A);
            Logger logger = d.f18529w;
            x7.a aVar2 = new x7.a();
            aVar2.f18506b = x7.b.QUERY;
            aVar2.f18507c = c.NO_ERROR;
            aVar2.f18515k = -1L;
            ArrayList arrayList3 = new ArrayList(1);
            aVar2.f18516l = arrayList3;
            arrayList3.add(eVar);
            aVar2.f18505a = secureRandom.nextInt() & 65535;
            x7.a aVarD = d(aVar2);
            aVarD.getClass();
            y7.b bVarI = i(bVar, new d(aVarD));
            d dVar = bVarI != null ? bVarI.f20468a : null;
            if (dVar != null) {
                for (y yVar : dVar.f18541l) {
                    boolean zD = yVar.d(eVar);
                    f8.h hVar = yVar.f13527f;
                    if (zD) {
                        try {
                            arrayList.add(InetAddress.getByAddress(aVar.f16142a, (byte[]) ((f8.a) hVar).f13437d.clone()));
                        } catch (UnknownHostException e10) {
                            throw new RuntimeException(e10);
                        }
                    } else {
                        if (yVar.f13523b == x.CNAME && yVar.f13522a.equals(aVar)) {
                            return k(bVar, ((v) hVar).f13475d);
                        }
                    }
                }
            }
        }
        if (a0.c(i10)) {
            e eVar2 = new e(aVar, x.AAAA);
            Logger logger2 = d.f18529w;
            x7.a aVar3 = new x7.a();
            aVar3.f18506b = x7.b.QUERY;
            aVar3.f18507c = c.NO_ERROR;
            aVar3.f18515k = -1L;
            ArrayList arrayList4 = new ArrayList(1);
            aVar3.f18516l = arrayList4;
            arrayList4.add(eVar2);
            aVar3.f18505a = secureRandom.nextInt() & 65535;
            x7.a aVarD2 = d(aVar3);
            aVarD2.getClass();
            y7.b bVarI2 = i(bVar, new d(aVarD2));
            d dVar2 = bVarI2 != null ? bVarI2.f20468a : null;
            if (dVar2 != null) {
                for (y yVar2 : dVar2.f18541l) {
                    boolean zD2 = yVar2.d(eVar2);
                    f8.h hVar2 = yVar2.f13527f;
                    if (zD2) {
                        try {
                            arrayList2.add(InetAddress.getByAddress(aVar.f16142a, (byte[]) ((f8.b) hVar2).f13437d.clone()));
                        } catch (UnknownHostException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else {
                        if (yVar2.f13523b == x.CNAME && yVar2.f13522a.equals(aVar)) {
                            return k(bVar, ((v) hVar2).f13475d);
                        }
                    }
                }
            }
        }
        return new c1.d(arrayList, arrayList2, random);
    }
}
