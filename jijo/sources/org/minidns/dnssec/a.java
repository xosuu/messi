package org.minidns.dnssec;

import com.google.android.gms.internal.ads.ql1;
import e8.c;
import f8.x;
import f8.y;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import x7.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final BigInteger f16150o = new BigInteger("1628686155461064465348252249725010996177649738666492500572664444461532807739744536029771810659241049343994038053541290419968870563183856865780916376571550372513476957870843322273120879361960335192976656756972171258658400305760429696147778001233984421619267530978084631948434496468785021389956803104620471232008587410372348519229650742022804219634190734272506220018657920136902014393834092648785514548876370028925405557661759399901378816916683122474038734912535425670533237815676134840739565610963796427401855723026687073600445461090736240030247906095053875491225879656640052743394090544036297390104110989318819106653199917493");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ConcurrentHashMap f16151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f16152n;

    static {
        org.minidns.dnsname.a.a("dlv.isc.org");
    }

    public a(ql1 ql1Var) {
        super(ql1Var);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f16151m = concurrentHashMap;
        this.f16152n = true;
        concurrentHashMap.put(org.minidns.dnsname.a.f16140u, f16150o.toByteArray());
    }

    public static List j(List list) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar.f13523b != x.RRSIG) {
                arrayList.add(yVar);
            }
        }
        return arrayList;
    }

    @Override // e8.c, org.minidns.a
    public final x7.a d(x7.a aVar) {
        if (aVar.f18520p == null) {
            aVar.f18520p = new c8.a();
        }
        c8.a aVar2 = aVar.f18520p;
        this.f16128e.getClass();
        aVar2.f1583a = 1024;
        aVar2.f1584b = true;
        aVar.f18514j = true;
        return aVar;
    }

    @Override // e8.c
    public final String h(d dVar) {
        c8.c cVar = dVar.f18545p;
        if (cVar == null) {
            int i10 = dVar.f18544o;
            y yVar = i10 == -1 ? null : (y) dVar.f18543n.get(i10);
            if (yVar == null) {
                cVar = null;
            } else {
                c8.c cVar2 = new c8.c(yVar);
                dVar.f18545p = cVar2;
                cVar = cVar2;
            }
        }
        if (cVar == null || !cVar.f1594e) {
            return "DNSSEC OK (DO) flag not set in response";
        }
        if (dVar.f18539j) {
            return null;
        }
        return "CHECKING DISABLED (CD) flag not set in response";
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j2.h i(x7.e r25) throws org.minidns.dnssec.DnssecValidationFailedException {
        /*
            Method dump skipped, instruction units count: 1138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.dnssec.a.i(x7.e):j2.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0232 A[Catch: IOException -> 0x0208, LOOP:6: B:78:0x022c->B:80:0x0232, LOOP_END, TryCatch #2 {IOException -> 0x0208, blocks: (B:62:0x01be, B:64:0x01d4, B:67:0x01de, B:69:0x01e4, B:77:0x021f, B:78:0x022c, B:80:0x0232, B:81:0x0265, B:82:0x027b, B:84:0x0281, B:85:0x028b, B:74:0x0212, B:75:0x0219), top: B:148:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0281 A[Catch: IOException -> 0x0208, LOOP:7: B:82:0x027b->B:84:0x0281, LOOP_END, TryCatch #2 {IOException -> 0x0208, blocks: (B:62:0x01be, B:64:0x01d4, B:67:0x01de, B:69:0x01e4, B:77:0x021f, B:78:0x022c, B:80:0x0232, B:81:0x0265, B:82:0x027b, B:84:0x0281, B:85:0x028b, B:74:0x0212, B:75:0x0219), top: B:148:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ae  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.lq k(x7.e r35, java.util.List r36, java.util.ArrayList r37) throws org.minidns.dnssec.DnssecValidationFailedException {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.dnssec.a.k(x7.e, java.util.List, java.util.ArrayList):com.google.android.gms.internal.ads.lq");
    }
}
