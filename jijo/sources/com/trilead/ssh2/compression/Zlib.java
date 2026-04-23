package com.trilead.ssh2.compression;

import m1.l1;
import t5.c;
import t5.e;
import t5.i;
import t5.j;
import t5.k;
import t5.l;

/* JADX INFO: loaded from: classes.dex */
public class Zlib implements ICompressor {
    private static final int DEFAULT_BUF_SIZE = 4096;
    private static final int LEVEL = 5;
    private byte[] deflate_tmpbuf;
    private byte[] inflate_tmpbuf;
    private byte[] inflated_buf;
    private l deflate = new l();
    private l inflate = new l();

    public Zlib() {
        l lVar = this.deflate;
        lVar.getClass();
        c cVar = new c();
        k kVar = new k();
        cVar.X = kVar;
        k kVar2 = new k();
        cVar.Y = kVar2;
        k kVar3 = new k();
        cVar.Z = kVar3;
        cVar.f16889a0 = new short[16];
        cVar.f16891b0 = new short[16];
        cVar.f16892c0 = new int[573];
        cVar.f16897f0 = new byte[573];
        cVar.f16910q0 = null;
        cVar.f16888a = lVar;
        cVar.U = new short[1146];
        cVar.V = new short[122];
        cVar.W = new short[78];
        lVar.f17020i = cVar;
        cVar.f16911s = 1;
        cVar.f16915w = 15;
        cVar.f16914v = 32768;
        cVar.f16916x = 32767;
        cVar.D = 32768;
        cVar.E = 32767;
        cVar.F = 5;
        cVar.f16917y = new byte[65536];
        cVar.A = new short[32768];
        cVar.B = new short[32768];
        cVar.f16900h0 = 16384;
        cVar.f16893d = new byte[49152];
        cVar.f16896f = 49152;
        cVar.f16902j0 = 16384;
        cVar.f16898g0 = new byte[16384];
        cVar.Q = 5;
        cVar.R = 0;
        lVar.f17018g = 0L;
        lVar.f17019h = null;
        cVar.f16909q = 0;
        cVar.f16899h = 0;
        cVar.f16890b = 42;
        lVar.f17022k.reset();
        cVar.f16913u = 0;
        kVar.f17009a = cVar.U;
        kVar.f17011c = j.f16993h;
        kVar2.f17009a = cVar.V;
        kVar2.f17011c = j.f16994i;
        kVar3.f17009a = cVar.W;
        kVar3.f17011c = j.f16995j;
        cVar.f16907o0 = (short) 0;
        cVar.f16908p0 = 0;
        cVar.f16906n0 = 8;
        cVar.g();
        cVar.f16918z = cVar.f16914v * 2;
        cVar.B[cVar.D - 1] = 0;
        for (int i10 = 0; i10 < cVar.D - 1; i10++) {
            cVar.B[i10] = 0;
        }
        l1 l1Var = c.f16886r0[cVar.Q];
        cVar.P = l1Var.f15539b;
        cVar.S = l1Var.f15538a;
        cVar.T = l1Var.f15540c;
        cVar.O = l1Var.f15541d;
        cVar.K = 0;
        cVar.G = 0;
        cVar.M = 0;
        cVar.N = 2;
        cVar.H = 2;
        cVar.J = 0;
        cVar.C = 0;
        l lVar2 = this.inflate;
        lVar2.getClass();
        i iVar = new i(lVar2);
        lVar2.f17021j = iVar;
        lVar2.f17019h = null;
        iVar.f16984f = null;
        iVar.f16982d = 1;
        iVar.f16983e = 15;
        e eVar = new e(lVar2, 32768);
        iVar.f16984f = eVar;
        lVar2.f17018g = 0L;
        lVar2.f17019h = null;
        iVar.f16979a = 14;
        iVar.f16987i = -1;
        eVar.c();
        this.deflate_tmpbuf = new byte[4096];
        this.inflate_tmpbuf = new byte[4096];
        this.inflated_buf = new byte[4096];
    }

    @Override // com.trilead.ssh2.compression.ICompressor
    public boolean canCompressPreauth() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x041f  */
    @Override // com.trilead.ssh2.compression.ICompressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compress(byte[] r18, int r19, int r20, byte[] r21) {
        /*
            Method dump skipped, instruction units count: 1186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.trilead.ssh2.compression.Zlib.compress(byte[], int, int, byte[]):int");
    }

    @Override // com.trilead.ssh2.compression.ICompressor
    public int getBufferSize() {
        return 4096;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x02bc, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0322, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0440, code lost:
    
        r4 = r10.f17014c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0442, code lost:
    
        if (r4 != 0) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0446, code lost:
    
        r10.f17014c = r4 - 1;
        r4 = r10.f17012a;
        r6 = r10.f17013b;
        r10.f17013b = r6 + 1;
        r0.f16981c = ((long) ((r4[r6] & 255) << 24)) & 4278190080L;
        r0.f16979a = 3;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0461, code lost:
    
        r4 = r10.f17014c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0463, code lost:
    
        if (r4 != 0) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0466, code lost:
    
        r10.f17014c = r4 - 1;
        r6 = r0.f16981c;
        r4 = r10.f17012a;
        r8 = r10.f17013b;
        r10.f17013b = r8 + 1;
        r0.f16981c = r6 + (((long) ((r4[r8] & 255) << 16)) & 16711680);
        r0.f16979a = 4;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0484, code lost:
    
        r4 = r10.f17014c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0486, code lost:
    
        if (r4 != 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0489, code lost:
    
        r10.f17014c = r4 - 1;
        r4 = r0.f16981c;
        r6 = r10.f17012a;
        r7 = r10.f17013b;
        r10.f17013b = r7 + 1;
        r0.f16981c = r4 + (((long) ((r6[r7] & 255) << 8)) & 65280);
        r0.f16979a = 5;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04a6, code lost:
    
        r4 = r10.f17014c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04a8, code lost:
    
        if (r4 != 0) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04ab, code lost:
    
        r10.f17014c = r4 - 1;
        r4 = r0.f16981c;
        r6 = r10.f17012a;
        r7 = r10.f17013b;
        r10.f17013b = r7 + 1;
        r4 = r4 + (((long) r6[r7]) & 255);
        r0.f16981c = r4;
        r10.f17022k.a(r4);
        r0.f16979a = 6;
        r9 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e0 A[PHI: r11
      0x01e0: PHI (r11v6 int) = (r11v5 int), (r11v7 int) binds: [B:117:0x01bd, B:121:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0180  */
    @Override // com.trilead.ssh2.compression.ICompressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] uncompress(byte[] r32, int r33, int[] r34) {
        /*
            Method dump skipped, instruction units count: 1366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.trilead.ssh2.compression.Zlib.uncompress(byte[], int, int[]):byte[]");
    }
}
