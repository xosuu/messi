package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mw extends lw {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Set f7065q = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final DecimalFormat f7066s = new DecimalFormat("#,###");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f7067f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7068h;

    @Override // com.google.android.gms.internal.ads.lw
    public final void k() {
        this.f7068h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x031e, code lost:
    
        r24 = r4;
        r22 = r13;
        r20 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0324, code lost:
    
        r24.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x032c, code lost:
    
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(3) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x032e, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zze("Preloaded " + com.google.android.gms.internal.ads.mw.f7066s.format(r12) + " bytes from " + r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0351, code lost:
    
        r11.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x035a, code lost:
    
        if (r0.isFile() == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x035c, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0364, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0421  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.lw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 1103
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mw.r(java.lang.String):boolean");
    }

    public final File u(File file) {
        File file2 = this.f7067f;
        String strConcat = String.valueOf(file.getName()).concat(".done");
        int i10 = bw0.f3121a;
        return new File(new File(file2, strConcat).getPath());
    }
}
