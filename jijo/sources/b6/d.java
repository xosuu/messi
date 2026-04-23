package b6;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class d extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f1371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1372b;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1372b) {
            return;
        }
        this.f1372b = true;
        a aVar = this.f1371a;
        c cVar = aVar.f1343b;
        cVar.getClass();
        byte[] bArr = new byte[5];
        synchronized (aVar) {
            try {
                if (aVar.f1352k == 2) {
                    bArr[0] = 96;
                    int i10 = aVar.f1348g;
                    bArr[1] = (byte) (i10 >> 24);
                    bArr[2] = (byte) (i10 >> 16);
                    bArr[3] = (byte) (i10 >> 8);
                    bArr[4] = (byte) i10;
                    synchronized (aVar.f1349h) {
                        try {
                            if (!aVar.f1350i) {
                                cVar.f1365b.n(bArr);
                                c6.a aVar2 = c.f1363h;
                                aVar2.getClass();
                                aVar2.b(50, "Sent EOF (Channel " + aVar.f1347f + "/" + aVar.f1348g + ")");
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f1372b) {
            throw new IOException("This OutputStream is closed.");
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        if (r5 < r15) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = (int) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        r7 = r0.f1356o;
        r8 = r1.f1365b.f13188j;
        r7 = r7 - (((r8.f13159h + 8) + r8.f13158g.length) + 9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r7 > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r2 <= r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        r0.f1354m = r5 - ((long) r2);
        r5 = new byte[r2 + 9];
        r5[0] = 94;
        r6 = r0.f1348g;
        r5[1] = (byte) (r6 >> 24);
        r5[2] = (byte) (r6 >> 16);
        r5[3] = (byte) (r6 >> 8);
        r5[4] = (byte) r6;
        r5[5] = (byte) (r2 >> 24);
        r5[6] = (byte) (r2 >> 16);
        r5[7] = (byte) (r2 >> 8);
        r5[8] = (byte) r2;
        java.lang.System.arraycopy(r13, r14, r5, 9, r2);
     */
    @Override // java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(byte[] r13, int r14, int r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.d.write(byte[], int, int):void");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
