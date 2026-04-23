package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zk implements wk {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f11253f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzb f11254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kp f11255b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i10 f11256d;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        s.b bVar = new s.b(7);
        for (int i10 = 0; i10 < 7; i10++) {
            bVar.put(strArr[i10], numArr[i10]);
        }
        f11253f = Collections.unmodifiableMap(bVar);
    }

    public zk(zzb zzbVar, kp kpVar, i10 i10Var) {
        this.f11254a = zzbVar;
        this.f11255b = kpVar;
        this.f11256d = i10Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d8 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, RuntimeException -> 0x04b8, blocks: (B:25:0x0064, B:27:0x0068, B:28:0x006d, B:32:0x0073, B:34:0x007b, B:35:0x0080, B:37:0x0083, B:39:0x008f, B:40:0x0094, B:42:0x0097, B:44:0x009f, B:45:0x00a4, B:47:0x00a7, B:49:0x00b5, B:50:0x00c6, B:52:0x00d4, B:53:0x00e5, B:55:0x00f3, B:56:0x0104, B:58:0x0112, B:59:0x0123, B:61:0x0131, B:62:0x013f, B:64:0x014d, B:65:0x014f, B:67:0x0153, B:69:0x0157, B:71:0x015f, B:74:0x0167, B:78:0x0189, B:84:0x0195, B:167:0x02d8, B:168:0x02dd, B:170:0x02e0, B:172:0x0300, B:174:0x0304, B:176:0x0311, B:178:0x034e, B:209:0x0409, B:216:0x043c, B:217:0x0455, B:218:0x0476, B:220:0x047e, B:221:0x048f, B:222:0x04b6, B:225:0x04b9, B:227:0x04d9, B:228:0x04ee, B:210:0x0410, B:211:0x0417, B:212:0x0420, B:213:0x0427, B:214:0x042d, B:215:0x0436, B:177:0x034b, B:230:0x04f0, B:231:0x04f5, B:86:0x019d, B:88:0x01a1, B:118:0x01f8, B:120:0x0200, B:121:0x0202, B:141:0x0261, B:143:0x0266, B:145:0x026b, B:148:0x0272, B:122:0x0206, B:124:0x020e, B:127:0x021c, B:129:0x0225, B:130:0x0227, B:132:0x022e, B:133:0x0236, B:135:0x0240, B:136:0x024a, B:138:0x0254, B:139:0x0257, B:149:0x0285, B:157:0x02b3, B:163:0x02c3, B:160:0x02b9, B:162:0x02c1, B:153:0x02a9, B:155:0x02af, B:164:0x02c8, B:165:0x02cf, B:233:0x04f7, B:234:0x04fc, B:236:0x04fe, B:237:0x0503), top: B:262:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e0 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, RuntimeException -> 0x04b8, blocks: (B:25:0x0064, B:27:0x0068, B:28:0x006d, B:32:0x0073, B:34:0x007b, B:35:0x0080, B:37:0x0083, B:39:0x008f, B:40:0x0094, B:42:0x0097, B:44:0x009f, B:45:0x00a4, B:47:0x00a7, B:49:0x00b5, B:50:0x00c6, B:52:0x00d4, B:53:0x00e5, B:55:0x00f3, B:56:0x0104, B:58:0x0112, B:59:0x0123, B:61:0x0131, B:62:0x013f, B:64:0x014d, B:65:0x014f, B:67:0x0153, B:69:0x0157, B:71:0x015f, B:74:0x0167, B:78:0x0189, B:84:0x0195, B:167:0x02d8, B:168:0x02dd, B:170:0x02e0, B:172:0x0300, B:174:0x0304, B:176:0x0311, B:178:0x034e, B:209:0x0409, B:216:0x043c, B:217:0x0455, B:218:0x0476, B:220:0x047e, B:221:0x048f, B:222:0x04b6, B:225:0x04b9, B:227:0x04d9, B:228:0x04ee, B:210:0x0410, B:211:0x0417, B:212:0x0420, B:213:0x0427, B:214:0x042d, B:215:0x0436, B:177:0x034b, B:230:0x04f0, B:231:0x04f5, B:86:0x019d, B:88:0x01a1, B:118:0x01f8, B:120:0x0200, B:121:0x0202, B:141:0x0261, B:143:0x0266, B:145:0x026b, B:148:0x0272, B:122:0x0206, B:124:0x020e, B:127:0x021c, B:129:0x0225, B:130:0x0227, B:132:0x022e, B:133:0x0236, B:135:0x0240, B:136:0x024a, B:138:0x0254, B:139:0x0257, B:149:0x0285, B:157:0x02b3, B:163:0x02c3, B:160:0x02b9, B:162:0x02c1, B:153:0x02a9, B:155:0x02af, B:164:0x02c8, B:165:0x02cf, B:233:0x04f7, B:234:0x04fc, B:236:0x04fe, B:237:0x0503), top: B:262:0x0064 }] */
    @Override // com.google.android.gms.internal.ads.wk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r19, java.util.Map r20) {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zk.b(java.lang.Object, java.util.Map):void");
    }
}
