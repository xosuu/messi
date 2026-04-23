package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class v7 implements w7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f9793b = Logger.getLogger(v7.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.h f9794a = new b4.h();

    public final y7 a(zv zvVar, z7 z7Var) throws EOFException {
        int iA;
        ByteBuffer byteBuffer;
        long jLimit;
        y7 c8Var;
        long jC = zvVar.c();
        b4.h hVar = this.f9794a;
        ((ByteBuffer) hVar.get()).rewind().limit(8);
        do {
            iA = zvVar.a((ByteBuffer) hVar.get());
            byteBuffer = zvVar.f11328a;
            if (iA == 8) {
                ((ByteBuffer) hVar.get()).rewind();
                long jK0 = b4.f.k0((ByteBuffer) hVar.get());
                if (jK0 < 8 && jK0 > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jK0);
                    sb.append("). Stop parsing!");
                    f9793b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) hVar.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (jK0 == 1) {
                        ((ByteBuffer) hVar.get()).limit(16);
                        zvVar.a((ByteBuffer) hVar.get());
                        ((ByteBuffer) hVar.get()).position(8);
                        jLimit = b4.f.n0((ByteBuffer) hVar.get()) - 16;
                    } else {
                        jLimit = jK0 == 0 ? ((long) byteBuffer.limit()) - zvVar.c() : jK0 - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) hVar.get()).limit(((ByteBuffer) hVar.get()).limit() + 16);
                        zvVar.a((ByteBuffer) hVar.get());
                        byte[] bArr2 = new byte[16];
                        for (int iPosition = ((ByteBuffer) hVar.get()).position() - 16; iPosition < ((ByteBuffer) hVar.get()).position(); iPosition++) {
                            bArr2[iPosition - (((ByteBuffer) hVar.get()).position() - 16)] = ((ByteBuffer) hVar.get()).get(iPosition);
                        }
                        jLimit -= 16;
                    }
                    long j10 = jLimit;
                    if (z7Var instanceof y7) {
                        ((y7) z7Var).zza();
                    }
                    if ("moov".equals(str)) {
                        c8Var = new a8();
                    } else if ("mvhd".equals(str)) {
                        b8 b8Var = new b8("mvhd");
                        b8Var.f2938z = 1.0d;
                        b8Var.A = 1.0f;
                        b8Var.B = dh1.f3669j;
                        c8Var = b8Var;
                    } else {
                        c8Var = new c8(str, 0);
                    }
                    ((ByteBuffer) hVar.get()).rewind();
                    c8Var.a(zvVar, (ByteBuffer) hVar.get(), j10, this);
                    return c8Var;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } while (iA >= 0);
        byteBuffer.position((int) jC);
        throw new EOFException();
    }
}
