package m2;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import j6.c0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2.e f15694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.f f15695b = new f.f(12);

    static {
        c2.n.l("EnqueueRunnable");
    }

    public d(d2.e eVar) {
        this.f15694a = eVar;
    }

    public static void a(l2.j jVar) throws Throwable {
        c2.c cVar = jVar.f15151j;
        String str = jVar.f15144c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (cVar.f1518d || cVar.f1519e) {
            c0 c0Var = new c0(0);
            c0Var.i(jVar.f15146e.f1527a);
            c0Var.f14389a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            jVar.f15144c = ConstraintTrackingWorker.class.getName();
            c2.f fVar = new c2.f(c0Var.f14389a);
            c2.f.c(fVar);
            jVar.f15146e = fVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0231 A[Catch: all -> 0x0315, TryCatch #11 {all -> 0x0315, blocks: (B:152:0x02eb, B:49:0x00f7, B:51:0x0103, B:52:0x0107, B:54:0x010d, B:56:0x0117, B:59:0x011d, B:60:0x012d, B:62:0x0133, B:64:0x014d, B:66:0x0156, B:68:0x0161, B:70:0x016d, B:71:0x0177, B:65:0x0152, B:83:0x0199, B:84:0x019f, B:86:0x01a5, B:90:0x01b3, B:99:0x01d1, B:103:0x01db, B:113:0x0208, B:117:0x020f, B:119:0x022a, B:121:0x0231, B:123:0x0237, B:125:0x025c, B:127:0x0269, B:128:0x026c, B:131:0x027a, B:132:0x0280, B:134:0x0286, B:136:0x02a9, B:138:0x02ae, B:139:0x02b1, B:141:0x02b4, B:143:0x02d1, B:145:0x02d6, B:146:0x02d9, B:149:0x02e4, B:150:0x02e7, B:107:0x01e5, B:108:0x01ef, B:110:0x01f5, B:112:0x0205, B:93:0x01ba, B:94:0x01bd, B:95:0x01c2, B:97:0x01c8, B:98:0x01cb, B:77:0x0182, B:78:0x0188, B:118:0x021e, B:124:0x0254, B:67:0x0159, B:135:0x02a1, B:142:0x02c9), top: B:198:0x003c, inners: #2, #3, #6, #7, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0286 A[Catch: all -> 0x0315, TRY_LEAVE, TryCatch #11 {all -> 0x0315, blocks: (B:152:0x02eb, B:49:0x00f7, B:51:0x0103, B:52:0x0107, B:54:0x010d, B:56:0x0117, B:59:0x011d, B:60:0x012d, B:62:0x0133, B:64:0x014d, B:66:0x0156, B:68:0x0161, B:70:0x016d, B:71:0x0177, B:65:0x0152, B:83:0x0199, B:84:0x019f, B:86:0x01a5, B:90:0x01b3, B:99:0x01d1, B:103:0x01db, B:113:0x0208, B:117:0x020f, B:119:0x022a, B:121:0x0231, B:123:0x0237, B:125:0x025c, B:127:0x0269, B:128:0x026c, B:131:0x027a, B:132:0x0280, B:134:0x0286, B:136:0x02a9, B:138:0x02ae, B:139:0x02b1, B:141:0x02b4, B:143:0x02d1, B:145:0x02d6, B:146:0x02d9, B:149:0x02e4, B:150:0x02e7, B:107:0x01e5, B:108:0x01ef, B:110:0x01f5, B:112:0x0205, B:93:0x01ba, B:94:0x01bd, B:95:0x01c2, B:97:0x01c8, B:98:0x01cb, B:77:0x0182, B:78:0x0188, B:118:0x021e, B:124:0x0254, B:67:0x0159, B:135:0x02a1, B:142:0x02c9), top: B:198:0x003c, inners: #2, #3, #6, #7, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b4 A[Catch: all -> 0x0315, TRY_LEAVE, TryCatch #11 {all -> 0x0315, blocks: (B:152:0x02eb, B:49:0x00f7, B:51:0x0103, B:52:0x0107, B:54:0x010d, B:56:0x0117, B:59:0x011d, B:60:0x012d, B:62:0x0133, B:64:0x014d, B:66:0x0156, B:68:0x0161, B:70:0x016d, B:71:0x0177, B:65:0x0152, B:83:0x0199, B:84:0x019f, B:86:0x01a5, B:90:0x01b3, B:99:0x01d1, B:103:0x01db, B:113:0x0208, B:117:0x020f, B:119:0x022a, B:121:0x0231, B:123:0x0237, B:125:0x025c, B:127:0x0269, B:128:0x026c, B:131:0x027a, B:132:0x0280, B:134:0x0286, B:136:0x02a9, B:138:0x02ae, B:139:0x02b1, B:141:0x02b4, B:143:0x02d1, B:145:0x02d6, B:146:0x02d9, B:149:0x02e4, B:150:0x02e7, B:107:0x01e5, B:108:0x01ef, B:110:0x01f5, B:112:0x0205, B:93:0x01ba, B:94:0x01bd, B:95:0x01c2, B:97:0x01c8, B:98:0x01cb, B:77:0x0182, B:78:0x0188, B:118:0x021e, B:124:0x0254, B:67:0x0159, B:135:0x02a1, B:142:0x02c9), top: B:198:0x003c, inners: #2, #3, #6, #7, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f5 A[Catch: all -> 0x0309, TryCatch #5 {all -> 0x0309, blocks: (B:153:0x02f0, B:155:0x02f5, B:159:0x030b), top: B:187:0x02f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a5 A[Catch: all -> 0x0315, TryCatch #11 {all -> 0x0315, blocks: (B:152:0x02eb, B:49:0x00f7, B:51:0x0103, B:52:0x0107, B:54:0x010d, B:56:0x0117, B:59:0x011d, B:60:0x012d, B:62:0x0133, B:64:0x014d, B:66:0x0156, B:68:0x0161, B:70:0x016d, B:71:0x0177, B:65:0x0152, B:83:0x0199, B:84:0x019f, B:86:0x01a5, B:90:0x01b3, B:99:0x01d1, B:103:0x01db, B:113:0x0208, B:117:0x020f, B:119:0x022a, B:121:0x0231, B:123:0x0237, B:125:0x025c, B:127:0x0269, B:128:0x026c, B:131:0x027a, B:132:0x0280, B:134:0x0286, B:136:0x02a9, B:138:0x02ae, B:139:0x02b1, B:141:0x02b4, B:143:0x02d1, B:145:0x02d6, B:146:0x02d9, B:149:0x02e4, B:150:0x02e7, B:107:0x01e5, B:108:0x01ef, B:110:0x01f5, B:112:0x0205, B:93:0x01ba, B:94:0x01bd, B:95:0x01c2, B:97:0x01c8, B:98:0x01cb, B:77:0x0182, B:78:0x0188, B:118:0x021e, B:124:0x0254, B:67:0x0159, B:135:0x02a1, B:142:0x02c9), top: B:198:0x003c, inners: #2, #3, #6, #7, #10 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.d.run():void");
    }
}
