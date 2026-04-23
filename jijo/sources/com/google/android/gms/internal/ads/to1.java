package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class to1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f9209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ca1 f9210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ep f9211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f9212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c8.a f9213e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f9215g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f9217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public iz0 f9218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public cp1 f9219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ wo1 f9221m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f9214f = new k0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9216h = true;

    public to1(wo1 wo1Var, Uri uri, hw0 hw0Var, ep epVar, i0 i0Var, c8.a aVar) {
        this.f9221m = wo1Var;
        this.f9209a = uri;
        this.f9210b = new ca1(hw0Var);
        this.f9211c = epVar;
        this.f9212d = i0Var;
        this.f9213e = aVar;
        bo1.f3069a.getAndIncrement();
        this.f9218j = b(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[LOOP:0: B:3:0x0004->B:152:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0208 A[EDGE_INSN: B:153:0x0208->B:101:0x0208 BREAK  A[LOOP:1: B:78:0x01b3->B:156:0x01b3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9 A[Catch: all -> 0x004b, TryCatch #8 {all -> 0x004b, blocks: (B:6:0x000c, B:17:0x003d, B:21:0x004e, B:23:0x0063, B:24:0x0069, B:32:0x009e, B:34:0x00a9, B:36:0x00b5, B:38:0x00bf, B:40:0x00cb, B:42:0x00d5, B:44:0x00e1, B:46:0x00eb, B:48:0x00fd, B:50:0x0107, B:51:0x010d, B:59:0x013c, B:60:0x0143, B:62:0x014d, B:64:0x0151, B:66:0x016d, B:68:0x0188, B:71:0x0191, B:73:0x0199, B:74:0x019d, B:76:0x01a1, B:54:0x0117, B:57:0x012d, B:28:0x0075, B:31:0x008e), top: B:141:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf A[Catch: all -> 0x004b, TryCatch #8 {all -> 0x004b, blocks: (B:6:0x000c, B:17:0x003d, B:21:0x004e, B:23:0x0063, B:24:0x0069, B:32:0x009e, B:34:0x00a9, B:36:0x00b5, B:38:0x00bf, B:40:0x00cb, B:42:0x00d5, B:44:0x00e1, B:46:0x00eb, B:48:0x00fd, B:50:0x0107, B:51:0x010d, B:59:0x013c, B:60:0x0143, B:62:0x014d, B:64:0x0151, B:66:0x016d, B:68:0x0188, B:71:0x0191, B:73:0x0199, B:74:0x019d, B:76:0x01a1, B:54:0x0117, B:57:0x012d, B:28:0x0075, B:31:0x008e), top: B:141:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[Catch: all -> 0x004b, TryCatch #8 {all -> 0x004b, blocks: (B:6:0x000c, B:17:0x003d, B:21:0x004e, B:23:0x0063, B:24:0x0069, B:32:0x009e, B:34:0x00a9, B:36:0x00b5, B:38:0x00bf, B:40:0x00cb, B:42:0x00d5, B:44:0x00e1, B:46:0x00eb, B:48:0x00fd, B:50:0x0107, B:51:0x010d, B:59:0x013c, B:60:0x0143, B:62:0x014d, B:64:0x0151, B:66:0x016d, B:68:0x0188, B:71:0x0191, B:73:0x0199, B:74:0x019d, B:76:0x01a1, B:54:0x0117, B:57:0x012d, B:28:0x0075, B:31:0x008e), top: B:141:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[Catch: all -> 0x004b, TryCatch #8 {all -> 0x004b, blocks: (B:6:0x000c, B:17:0x003d, B:21:0x004e, B:23:0x0063, B:24:0x0069, B:32:0x009e, B:34:0x00a9, B:36:0x00b5, B:38:0x00bf, B:40:0x00cb, B:42:0x00d5, B:44:0x00e1, B:46:0x00eb, B:48:0x00fd, B:50:0x0107, B:51:0x010d, B:59:0x013c, B:60:0x0143, B:62:0x014d, B:64:0x0151, B:66:0x016d, B:68:0x0188, B:71:0x0191, B:73:0x0199, B:74:0x019d, B:76:0x01a1, B:54:0x0117, B:57:0x012d, B:28:0x0075, B:31:0x008e), top: B:141:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #8 {all -> 0x004b, blocks: (B:6:0x000c, B:17:0x003d, B:21:0x004e, B:23:0x0063, B:24:0x0069, B:32:0x009e, B:34:0x00a9, B:36:0x00b5, B:38:0x00bf, B:40:0x00cb, B:42:0x00d5, B:44:0x00e1, B:46:0x00eb, B:48:0x00fd, B:50:0x0107, B:51:0x010d, B:59:0x013c, B:60:0x0143, B:62:0x014d, B:64:0x0151, B:66:0x016d, B:68:0x0188, B:71:0x0191, B:73:0x0199, B:74:0x019d, B:76:0x01a1, B:54:0x0117, B:57:0x012d, B:28:0x0075, B:31:0x008e), top: B:141:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c A[Catch: all -> 0x004b, TryCatch #8 {all -> 0x004b, blocks: (B:6:0x000c, B:17:0x003d, B:21:0x004e, B:23:0x0063, B:24:0x0069, B:32:0x009e, B:34:0x00a9, B:36:0x00b5, B:38:0x00bf, B:40:0x00cb, B:42:0x00d5, B:44:0x00e1, B:46:0x00eb, B:48:0x00fd, B:50:0x0107, B:51:0x010d, B:59:0x013c, B:60:0x0143, B:62:0x014d, B:64:0x0151, B:66:0x016d, B:68:0x0188, B:71:0x0191, B:73:0x0199, B:74:0x019d, B:76:0x01a1, B:54:0x0117, B:57:0x012d, B:28:0x0075, B:31:0x008e), top: B:141:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014d A[Catch: all -> 0x004b, TryCatch #8 {all -> 0x004b, blocks: (B:6:0x000c, B:17:0x003d, B:21:0x004e, B:23:0x0063, B:24:0x0069, B:32:0x009e, B:34:0x00a9, B:36:0x00b5, B:38:0x00bf, B:40:0x00cb, B:42:0x00d5, B:44:0x00e1, B:46:0x00eb, B:48:0x00fd, B:50:0x0107, B:51:0x010d, B:59:0x013c, B:60:0x0143, B:62:0x014d, B:64:0x0151, B:66:0x016d, B:68:0x0188, B:71:0x0191, B:73:0x0199, B:74:0x019d, B:76:0x01a1, B:54:0x0117, B:57:0x012d, B:28:0x0075, B:31:0x008e), top: B:141:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0199 A[Catch: all -> 0x004b, TryCatch #8 {all -> 0x004b, blocks: (B:6:0x000c, B:17:0x003d, B:21:0x004e, B:23:0x0063, B:24:0x0069, B:32:0x009e, B:34:0x00a9, B:36:0x00b5, B:38:0x00bf, B:40:0x00cb, B:42:0x00d5, B:44:0x00e1, B:46:0x00eb, B:48:0x00fd, B:50:0x0107, B:51:0x010d, B:59:0x013c, B:60:0x0143, B:62:0x014d, B:64:0x0151, B:66:0x016d, B:68:0x0188, B:71:0x0191, B:73:0x0199, B:74:0x019d, B:76:0x01a1, B:54:0x0117, B:57:0x012d, B:28:0x0075, B:31:0x008e), top: B:141:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #8 {all -> 0x004b, blocks: (B:6:0x000c, B:17:0x003d, B:21:0x004e, B:23:0x0063, B:24:0x0069, B:32:0x009e, B:34:0x00a9, B:36:0x00b5, B:38:0x00bf, B:40:0x00cb, B:42:0x00d5, B:44:0x00e1, B:46:0x00eb, B:48:0x00fd, B:50:0x0107, B:51:0x010d, B:59:0x013c, B:60:0x0143, B:62:0x014d, B:64:0x0151, B:66:0x016d, B:68:0x0188, B:71:0x0191, B:73:0x0199, B:74:0x019d, B:76:0x01a1, B:54:0x0117, B:57:0x012d, B:28:0x0075, B:31:0x008e), top: B:141:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.to1.a():void");
    }

    public final iz0 b(long j10) {
        Collections.emptyMap();
        Map map = wo1.X;
        Uri uri = this.f9209a;
        if (uri != null) {
            return new iz0(uri, map, j10, -1L, 6);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
