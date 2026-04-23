package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public final class x4 implements c4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f10417b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f10418d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f10419f = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f10420h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f10421q = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f10422s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f10423t = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final w4 f10424u = new w4(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f10425a;

    public x4() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f10425a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long b(java.lang.String r13, com.google.android.gms.internal.ads.w4 r14) throws com.google.android.gms.internal.ads.zzajw {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x4.b(java.lang.String, com.google.android.gms.internal.ads.w4):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.Layout.Alignment d(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.tc1.g(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 1
            goto L43
        L1a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 2
            goto L43
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 0
            goto L43
        L2e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 3
            goto L43
        L38:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 4
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 == 0) goto L55
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L52
            if (r5 == r1) goto L4f
            r5 = 0
            return r5
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x4.d(java.lang.String):android.text.Layout$Alignment");
    }

    public static z4 e(z4 z4Var) {
        return z4Var == null ? new z4() : z4Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.z4 f(org.xmlpull.v1.XmlPullParser r12, com.google.android.gms.internal.ads.z4 r13) {
        /*
            Method dump skipped, instruction units count: 1316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x4.f(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.z4):com.google.android.gms.internal.ads.z4");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(15:253|(3:424|254|255)|(7:434|257|258|SW:259|SW:286|392|393)|443|322|(2:324|(4:326|(1:328)(1:329)|330|(1:332)(9:334|337|(2:339|(1:341)(3:(3:343|344|(1:346)(1:347))(0)|392|393))(1:348)|416|349|350|412|351|(3:353|(1:355)|356)))(1:335))(1:336)|333|337|(0)(0)|416|349|350|412|351|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x06a2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x06a3, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x06a5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x06a6, code lost:
    
        r3 = r25;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:286:0x0592. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e3 A[PHI: r16 r17 r18 r41 r42 r43
      0x02e3: PHI (r16v13 com.google.android.gms.internal.ads.w4) = (r16v11 com.google.android.gms.internal.ads.w4), (r16v14 com.google.android.gms.internal.ads.w4) binds: [B:247:0x04e2, B:137:0x02dd] A[DONT_GENERATE, DONT_INLINE]
      0x02e3: PHI (r17v12 java.lang.String) = (r17v10 java.lang.String), (r17v13 java.lang.String) binds: [B:247:0x04e2, B:137:0x02dd] A[DONT_GENERATE, DONT_INLINE]
      0x02e3: PHI (r18v12 java.lang.String) = (r18v10 java.lang.String), (r18v13 java.lang.String) binds: [B:247:0x04e2, B:137:0x02dd] A[DONT_GENERATE, DONT_INLINE]
      0x02e3: PHI (r41v6 java.lang.String) = (r41v2 java.lang.String), (r41v7 java.lang.String) binds: [B:247:0x04e2, B:137:0x02dd] A[DONT_GENERATE, DONT_INLINE]
      0x02e3: PHI (r42v6 java.lang.String) = (r42v2 java.lang.String), (r42v7 java.lang.String) binds: [B:247:0x04e2, B:137:0x02dd] A[DONT_GENERATE, DONT_INLINE]
      0x02e3: PHI (r43v11 java.util.HashMap) = (r43v7 java.util.HashMap), (r43v12 java.util.HashMap) binds: [B:247:0x04e2, B:137:0x02dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ad A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0096, TRY_LEAVE, TryCatch #19 {IOException -> 0x0092, XmlPullParserException -> 0x0096, blocks: (B:3:0x0006, B:7:0x0062, B:9:0x006d, B:12:0x0077, B:15:0x0085, B:17:0x008d, B:23:0x009c, B:26:0x00a8, B:30:0x00ba, B:32:0x00d7, B:34:0x00e1, B:35:0x00e5, B:37:0x00f1, B:38:0x00f5, B:68:0x0183, B:85:0x01de, B:88:0x01ee, B:90:0x01f4, B:92:0x01fc, B:94:0x0204, B:96:0x020c, B:98:0x0214, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:106:0x0232, B:108:0x0238, B:110:0x023e, B:112:0x0244, B:114:0x024c, B:117:0x0255, B:392:0x0732, B:119:0x027d, B:122:0x0285, B:124:0x028e, B:126:0x029f, B:128:0x02a9, B:130:0x02b8, B:132:0x02be, B:134:0x02d4, B:136:0x02da, B:249:0x04eb, B:129:0x02af, B:139:0x02e7, B:142:0x02f5, B:144:0x02fb, B:146:0x0304, B:148:0x030a, B:149:0x0311, B:152:0x0318, B:248:0x04e4, B:156:0x0327, B:158:0x032f, B:162:0x034c, B:164:0x0353, B:166:0x0361, B:182:0x03a7, B:184:0x03ad, B:188:0x03be, B:190:0x03c5, B:192:0x03d3, B:207:0x041e, B:209:0x0426, B:218:0x0455, B:220:0x045f, B:240:0x049a, B:194:0x03de, B:195:0x03e7, B:198:0x03ef, B:201:0x03f9, B:203:0x0400, B:205:0x040c, B:241:0x04a6, B:242:0x04af, B:243:0x04ba, B:169:0x036a, B:170:0x0372, B:173:0x037c, B:176:0x0385, B:178:0x038c, B:180:0x0398, B:244:0x04c1, B:245:0x04ca, B:246:0x04d5, B:254:0x0511, B:257:0x0532, B:288:0x0596, B:291:0x059f, B:364:0x06ad, B:300:0x05b6, B:302:0x05c0, B:304:0x05d1, B:319:0x0609, B:303:0x05c7, B:311:0x05e0, B:314:0x05e8, B:315:0x05f2, B:316:0x05fc, B:324:0x061c, B:328:0x062d, B:332:0x0636, B:341:0x065c, B:349:0x0671, B:351:0x067f, B:353:0x0684, B:355:0x0688, B:356:0x068f, B:343:0x0663, B:71:0x018c, B:73:0x0196, B:76:0x01a1, B:78:0x01a8, B:80:0x01b4, B:82:0x01c0, B:42:0x010f, B:45:0x011d, B:48:0x0126, B:50:0x012d, B:52:0x0134, B:54:0x013b, B:60:0x0151, B:62:0x0158, B:67:0x017b, B:369:0x06d1, B:371:0x06dd, B:372:0x06e4, B:376:0x06ef, B:378:0x06f9, B:380:0x0706, B:382:0x070e, B:386:0x0724, B:390:0x072c), top: B:436:0x0006, inners: #0, #1, #3, #5, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0426 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0096, TRY_LEAVE, TryCatch #19 {IOException -> 0x0092, XmlPullParserException -> 0x0096, blocks: (B:3:0x0006, B:7:0x0062, B:9:0x006d, B:12:0x0077, B:15:0x0085, B:17:0x008d, B:23:0x009c, B:26:0x00a8, B:30:0x00ba, B:32:0x00d7, B:34:0x00e1, B:35:0x00e5, B:37:0x00f1, B:38:0x00f5, B:68:0x0183, B:85:0x01de, B:88:0x01ee, B:90:0x01f4, B:92:0x01fc, B:94:0x0204, B:96:0x020c, B:98:0x0214, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:106:0x0232, B:108:0x0238, B:110:0x023e, B:112:0x0244, B:114:0x024c, B:117:0x0255, B:392:0x0732, B:119:0x027d, B:122:0x0285, B:124:0x028e, B:126:0x029f, B:128:0x02a9, B:130:0x02b8, B:132:0x02be, B:134:0x02d4, B:136:0x02da, B:249:0x04eb, B:129:0x02af, B:139:0x02e7, B:142:0x02f5, B:144:0x02fb, B:146:0x0304, B:148:0x030a, B:149:0x0311, B:152:0x0318, B:248:0x04e4, B:156:0x0327, B:158:0x032f, B:162:0x034c, B:164:0x0353, B:166:0x0361, B:182:0x03a7, B:184:0x03ad, B:188:0x03be, B:190:0x03c5, B:192:0x03d3, B:207:0x041e, B:209:0x0426, B:218:0x0455, B:220:0x045f, B:240:0x049a, B:194:0x03de, B:195:0x03e7, B:198:0x03ef, B:201:0x03f9, B:203:0x0400, B:205:0x040c, B:241:0x04a6, B:242:0x04af, B:243:0x04ba, B:169:0x036a, B:170:0x0372, B:173:0x037c, B:176:0x0385, B:178:0x038c, B:180:0x0398, B:244:0x04c1, B:245:0x04ca, B:246:0x04d5, B:254:0x0511, B:257:0x0532, B:288:0x0596, B:291:0x059f, B:364:0x06ad, B:300:0x05b6, B:302:0x05c0, B:304:0x05d1, B:319:0x0609, B:303:0x05c7, B:311:0x05e0, B:314:0x05e8, B:315:0x05f2, B:316:0x05fc, B:324:0x061c, B:328:0x062d, B:332:0x0636, B:341:0x065c, B:349:0x0671, B:351:0x067f, B:353:0x0684, B:355:0x0688, B:356:0x068f, B:343:0x0663, B:71:0x018c, B:73:0x0196, B:76:0x01a1, B:78:0x01a8, B:80:0x01b4, B:82:0x01c0, B:42:0x010f, B:45:0x011d, B:48:0x0126, B:50:0x012d, B:52:0x0134, B:54:0x013b, B:60:0x0151, B:62:0x0158, B:67:0x017b, B:369:0x06d1, B:371:0x06dd, B:372:0x06e4, B:376:0x06ef, B:378:0x06f9, B:380:0x0706, B:382:0x070e, B:386:0x0724, B:390:0x072c), top: B:436:0x0006, inners: #0, #1, #3, #5, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04ba A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0096, TryCatch #19 {IOException -> 0x0092, XmlPullParserException -> 0x0096, blocks: (B:3:0x0006, B:7:0x0062, B:9:0x006d, B:12:0x0077, B:15:0x0085, B:17:0x008d, B:23:0x009c, B:26:0x00a8, B:30:0x00ba, B:32:0x00d7, B:34:0x00e1, B:35:0x00e5, B:37:0x00f1, B:38:0x00f5, B:68:0x0183, B:85:0x01de, B:88:0x01ee, B:90:0x01f4, B:92:0x01fc, B:94:0x0204, B:96:0x020c, B:98:0x0214, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:106:0x0232, B:108:0x0238, B:110:0x023e, B:112:0x0244, B:114:0x024c, B:117:0x0255, B:392:0x0732, B:119:0x027d, B:122:0x0285, B:124:0x028e, B:126:0x029f, B:128:0x02a9, B:130:0x02b8, B:132:0x02be, B:134:0x02d4, B:136:0x02da, B:249:0x04eb, B:129:0x02af, B:139:0x02e7, B:142:0x02f5, B:144:0x02fb, B:146:0x0304, B:148:0x030a, B:149:0x0311, B:152:0x0318, B:248:0x04e4, B:156:0x0327, B:158:0x032f, B:162:0x034c, B:164:0x0353, B:166:0x0361, B:182:0x03a7, B:184:0x03ad, B:188:0x03be, B:190:0x03c5, B:192:0x03d3, B:207:0x041e, B:209:0x0426, B:218:0x0455, B:220:0x045f, B:240:0x049a, B:194:0x03de, B:195:0x03e7, B:198:0x03ef, B:201:0x03f9, B:203:0x0400, B:205:0x040c, B:241:0x04a6, B:242:0x04af, B:243:0x04ba, B:169:0x036a, B:170:0x0372, B:173:0x037c, B:176:0x0385, B:178:0x038c, B:180:0x0398, B:244:0x04c1, B:245:0x04ca, B:246:0x04d5, B:254:0x0511, B:257:0x0532, B:288:0x0596, B:291:0x059f, B:364:0x06ad, B:300:0x05b6, B:302:0x05c0, B:304:0x05d1, B:319:0x0609, B:303:0x05c7, B:311:0x05e0, B:314:0x05e8, B:315:0x05f2, B:316:0x05fc, B:324:0x061c, B:328:0x062d, B:332:0x0636, B:341:0x065c, B:349:0x0671, B:351:0x067f, B:353:0x0684, B:355:0x0688, B:356:0x068f, B:343:0x0663, B:71:0x018c, B:73:0x0196, B:76:0x01a1, B:78:0x01a8, B:80:0x01b4, B:82:0x01c0, B:42:0x010f, B:45:0x011d, B:48:0x0126, B:50:0x012d, B:52:0x0134, B:54:0x013b, B:60:0x0151, B:62:0x0158, B:67:0x017b, B:369:0x06d1, B:371:0x06dd, B:372:0x06e4, B:376:0x06ef, B:378:0x06f9, B:380:0x0706, B:382:0x070e, B:386:0x0724, B:390:0x072c), top: B:436:0x0006, inners: #0, #1, #3, #5, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04e4 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0096, TryCatch #19 {IOException -> 0x0092, XmlPullParserException -> 0x0096, blocks: (B:3:0x0006, B:7:0x0062, B:9:0x006d, B:12:0x0077, B:15:0x0085, B:17:0x008d, B:23:0x009c, B:26:0x00a8, B:30:0x00ba, B:32:0x00d7, B:34:0x00e1, B:35:0x00e5, B:37:0x00f1, B:38:0x00f5, B:68:0x0183, B:85:0x01de, B:88:0x01ee, B:90:0x01f4, B:92:0x01fc, B:94:0x0204, B:96:0x020c, B:98:0x0214, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:106:0x0232, B:108:0x0238, B:110:0x023e, B:112:0x0244, B:114:0x024c, B:117:0x0255, B:392:0x0732, B:119:0x027d, B:122:0x0285, B:124:0x028e, B:126:0x029f, B:128:0x02a9, B:130:0x02b8, B:132:0x02be, B:134:0x02d4, B:136:0x02da, B:249:0x04eb, B:129:0x02af, B:139:0x02e7, B:142:0x02f5, B:144:0x02fb, B:146:0x0304, B:148:0x030a, B:149:0x0311, B:152:0x0318, B:248:0x04e4, B:156:0x0327, B:158:0x032f, B:162:0x034c, B:164:0x0353, B:166:0x0361, B:182:0x03a7, B:184:0x03ad, B:188:0x03be, B:190:0x03c5, B:192:0x03d3, B:207:0x041e, B:209:0x0426, B:218:0x0455, B:220:0x045f, B:240:0x049a, B:194:0x03de, B:195:0x03e7, B:198:0x03ef, B:201:0x03f9, B:203:0x0400, B:205:0x040c, B:241:0x04a6, B:242:0x04af, B:243:0x04ba, B:169:0x036a, B:170:0x0372, B:173:0x037c, B:176:0x0385, B:178:0x038c, B:180:0x0398, B:244:0x04c1, B:245:0x04ca, B:246:0x04d5, B:254:0x0511, B:257:0x0532, B:288:0x0596, B:291:0x059f, B:364:0x06ad, B:300:0x05b6, B:302:0x05c0, B:304:0x05d1, B:319:0x0609, B:303:0x05c7, B:311:0x05e0, B:314:0x05e8, B:315:0x05f2, B:316:0x05fc, B:324:0x061c, B:328:0x062d, B:332:0x0636, B:341:0x065c, B:349:0x0671, B:351:0x067f, B:353:0x0684, B:355:0x0688, B:356:0x068f, B:343:0x0663, B:71:0x018c, B:73:0x0196, B:76:0x01a1, B:78:0x01a8, B:80:0x01b4, B:82:0x01c0, B:42:0x010f, B:45:0x011d, B:48:0x0126, B:50:0x012d, B:52:0x0134, B:54:0x013b, B:60:0x0151, B:62:0x0158, B:67:0x017b, B:369:0x06d1, B:371:0x06dd, B:372:0x06e4, B:376:0x06ef, B:378:0x06f9, B:380:0x0706, B:382:0x070e, B:386:0x0724, B:390:0x072c), top: B:436:0x0006, inners: #0, #1, #3, #5, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04f7 A[LOOP:1: B:122:0x0285->B:252:0x04f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0546 A[PHI: r2
      0x0546: PHI (r2v37 java.lang.Object) = 
      (r2v26 java.lang.Object)
      (r2v27 java.lang.Object)
      (r2v28 java.lang.Object)
      (r2v29 java.lang.Object)
      (r2v30 java.lang.Object)
      (r2v38 java.lang.Object)
     binds: [B:283:0x058e, B:279:0x0583, B:275:0x0576, B:271:0x0569, B:267:0x055c, B:260:0x0544] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0684 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0096, zzajw -> 0x06a2, TryCatch #6 {zzajw -> 0x06a2, blocks: (B:351:0x067f, B:353:0x0684, B:355:0x0688, B:356:0x068f), top: B:412:0x067f }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0096, TryCatch #19 {IOException -> 0x0092, XmlPullParserException -> 0x0096, blocks: (B:3:0x0006, B:7:0x0062, B:9:0x006d, B:12:0x0077, B:15:0x0085, B:17:0x008d, B:23:0x009c, B:26:0x00a8, B:30:0x00ba, B:32:0x00d7, B:34:0x00e1, B:35:0x00e5, B:37:0x00f1, B:38:0x00f5, B:68:0x0183, B:85:0x01de, B:88:0x01ee, B:90:0x01f4, B:92:0x01fc, B:94:0x0204, B:96:0x020c, B:98:0x0214, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:106:0x0232, B:108:0x0238, B:110:0x023e, B:112:0x0244, B:114:0x024c, B:117:0x0255, B:392:0x0732, B:119:0x027d, B:122:0x0285, B:124:0x028e, B:126:0x029f, B:128:0x02a9, B:130:0x02b8, B:132:0x02be, B:134:0x02d4, B:136:0x02da, B:249:0x04eb, B:129:0x02af, B:139:0x02e7, B:142:0x02f5, B:144:0x02fb, B:146:0x0304, B:148:0x030a, B:149:0x0311, B:152:0x0318, B:248:0x04e4, B:156:0x0327, B:158:0x032f, B:162:0x034c, B:164:0x0353, B:166:0x0361, B:182:0x03a7, B:184:0x03ad, B:188:0x03be, B:190:0x03c5, B:192:0x03d3, B:207:0x041e, B:209:0x0426, B:218:0x0455, B:220:0x045f, B:240:0x049a, B:194:0x03de, B:195:0x03e7, B:198:0x03ef, B:201:0x03f9, B:203:0x0400, B:205:0x040c, B:241:0x04a6, B:242:0x04af, B:243:0x04ba, B:169:0x036a, B:170:0x0372, B:173:0x037c, B:176:0x0385, B:178:0x038c, B:180:0x0398, B:244:0x04c1, B:245:0x04ca, B:246:0x04d5, B:254:0x0511, B:257:0x0532, B:288:0x0596, B:291:0x059f, B:364:0x06ad, B:300:0x05b6, B:302:0x05c0, B:304:0x05d1, B:319:0x0609, B:303:0x05c7, B:311:0x05e0, B:314:0x05e8, B:315:0x05f2, B:316:0x05fc, B:324:0x061c, B:328:0x062d, B:332:0x0636, B:341:0x065c, B:349:0x0671, B:351:0x067f, B:353:0x0684, B:355:0x0688, B:356:0x068f, B:343:0x0663, B:71:0x018c, B:73:0x0196, B:76:0x01a1, B:78:0x01a8, B:80:0x01b4, B:82:0x01c0, B:42:0x010f, B:45:0x011d, B:48:0x0126, B:50:0x012d, B:52:0x0134, B:54:0x013b, B:60:0x0151, B:62:0x0158, B:67:0x017b, B:369:0x06d1, B:371:0x06dd, B:372:0x06e4, B:376:0x06ef, B:378:0x06f9, B:380:0x0706, B:382:0x070e, B:386:0x0724, B:390:0x072c), top: B:436:0x0006, inners: #0, #1, #3, #5, #17 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.qp0 a(int r45, byte[] r46, int r47) {
        /*
            Method dump skipped, instruction units count: 1952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x4.a(int, byte[], int):com.google.android.gms.internal.ads.qp0");
    }

    @Override // com.google.android.gms.internal.ads.c4
    public final void c(byte[] bArr, int i10, int i11, e4 e4Var) {
        t3.i.G(a(i10, bArr, i11), e4Var);
    }

    @Override // com.google.android.gms.internal.ads.c4
    public final /* synthetic */ void zzb() {
    }
}
