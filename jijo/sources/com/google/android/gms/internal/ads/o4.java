package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class o4 implements c4 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f7501s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1.l1 f7503b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinkedHashMap f7505f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f7506h = -3.4028235E38f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f7507q = -3.4028235E38f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik0 f7504d = new ik0();

    public o4(List list) {
        if (list == null || list.isEmpty()) {
            this.f7502a = false;
            this.f7503b = null;
            return;
        }
        this.f7502a = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = fx0.f4681c;
        String str = new String(bArr, charset);
        tc1.K(str.startsWith("Format:"));
        m1.l1 l1VarB = m1.l1.b(str);
        l1VarB.getClass();
        this.f7503b = l1VarB;
        d(new ik0((byte[]) list.get(1)), charset);
    }

    public static int a(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public static long b(String str) {
        Matcher matcher = f7501s.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i10 = yn0.f10944a;
        long j10 = Long.parseLong(strGroup) * 3600000000L;
        long j11 = Long.parseLong(matcher.group(2)) * 60000000;
        return j10 + j11 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:41|(3:191|42|43)|(2:193|44)|(3:(4:47|48|187|49)(1:52)|50|53)(2:54|(1:56)(7:63|(1:65)|189|67|(6:69|70|185|71|SW:72|75)(1:77)|(2:79|203)(2:81|204)|80))|57|58|59|60|61|(0)|189|67|(0)(0)|(0)(0)|80|39) */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182 A[Catch: RuntimeException -> 0x01a1, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x01a1, blocks: (B:67:0x0176, B:69:0x0182, B:71:0x018a, B:73:0x0195), top: B:189:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af  */
    @Override // com.google.android.gms.internal.ads.c4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(byte[] r36, int r37, int r38, com.google.android.gms.internal.ads.e4 r39) {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o4.c(byte[], int, int, com.google.android.gms.internal.ads.e4):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02cf A[Catch: RuntimeException -> 0x0224, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0224, blocks: (B:106:0x01f0, B:108:0x01fe, B:109:0x0204, B:118:0x0229, B:120:0x022d, B:122:0x023c, B:124:0x0240, B:126:0x024f, B:128:0x0253, B:129:0x0259, B:135:0x0277, B:137:0x027b, B:141:0x028c, B:143:0x0290, B:147:0x02a1, B:149:0x02a5, B:153:0x02b6, B:155:0x02ba, B:159:0x02cb, B:161:0x02cf, B:162:0x02d5, B:169:0x02f4, B:167:0x02e5, B:133:0x0262, B:113:0x0213), top: B:188:0x01f0, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.ik0 r39, java.nio.charset.Charset r40) {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o4.d(com.google.android.gms.internal.ads.ik0, java.nio.charset.Charset):void");
    }

    @Override // com.google.android.gms.internal.ads.c4
    public final /* synthetic */ void zzb() {
    }
}
