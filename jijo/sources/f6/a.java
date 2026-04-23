package f6;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.i2;
import com.trilead.ssh2.compression.CompressionFactory;
import com.trilead.ssh2.compression.ICompressor;
import com.trilead.ssh2.crypto.CryptoWishList;
import com.trilead.ssh2.crypto.KeyMaterial;
import com.trilead.ssh2.crypto.cipher.BlockCipher;
import com.trilead.ssh2.crypto.cipher.BlockCipherFactory;
import com.trilead.ssh2.crypto.cipher.NullCipher;
import com.trilead.ssh2.crypto.dh.DhExchange;
import com.trilead.ssh2.crypto.dh.DhGroupExchange;
import com.trilead.ssh2.crypto.digest.MessageMac;
import com.trilead.ssh2.transport.NegotiateException;
import g4.t;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c6.a f13102o = c6.a.a(a.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ArrayList f13103p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f13104a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public KeyMaterial f13106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f13107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f13108e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f13113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CryptoWishList f13114k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z5.i f13116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SecureRandom f13117n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13105b = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f13109f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z5.b f13110g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13111h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13112i = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public z5.d f13115l = new z5.d();

    static {
        ArrayList arrayList = new ArrayList();
        Iterator it = e6.i.f12735a.iterator();
        while (it.hasNext()) {
            arrayList.add(arrayList.size(), ((e6.h) it.next()).f12733b);
        }
        f13103p = arrayList;
    }

    public a(i iVar, t tVar, CryptoWishList cryptoWishList, String str, int i10, z5.i iVar2, SecureRandom secureRandom) {
        this.f13113j = iVar;
        this.f13108e = tVar;
        this.f13114k = cryptoWishList;
        this.f13116m = iVar2;
        this.f13117n = secureRandom;
    }

    public static boolean c(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null) {
            throw new IllegalArgumentException();
        }
        if (strArr.length == 0 && strArr2.length == 0) {
            return true;
        }
        if (strArr.length == 0 || strArr2.length == 0) {
            return false;
        }
        return strArr[0].equals(strArr2[0]);
    }

    public static String e(String[] strArr, String[] strArr2) throws NegotiateException {
        if (strArr == null || strArr2 == null) {
            throw new IllegalArgumentException();
        }
        if (strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (str.equals(str2)) {
                    return str;
                }
            }
        }
        throw new NegotiateException();
    }

    public static e f(b bVar, b bVar2) {
        e eVar = new e();
        try {
            eVar.f13143b = e(bVar.f13119b, bVar2.f13119b);
            c6.a aVar = f13102o;
            aVar.b(30, "kex_algo=" + eVar.f13143b);
            eVar.f13144c = e(bVar.f13120c, bVar2.f13120c);
            aVar.b(30, "server_host_key_algo=" + eVar.f13144c);
            eVar.f13145d = e(bVar.f13121d, bVar2.f13121d);
            eVar.f13146e = e(bVar.f13122e, bVar2.f13122e);
            aVar.b(30, "enc_algo_client_to_server=" + eVar.f13145d);
            aVar.b(30, "enc_algo_server_to_client=" + eVar.f13146e);
            eVar.f13147f = e(bVar.f13123f, bVar2.f13123f);
            eVar.f13148g = e(bVar.f13124g, bVar2.f13124g);
            aVar.b(30, "mac_algo_client_to_server=" + eVar.f13147f);
            aVar.b(30, "mac_algo_server_to_client=" + eVar.f13148g);
            eVar.f13149h = e(bVar.f13125h, bVar2.f13125h);
            eVar.f13150i = e(bVar.f13126i, bVar2.f13126i);
            aVar.b(30, "comp_algo_client_to_server=" + eVar.f13149h);
            aVar.b(30, "comp_algo_server_to_client=" + eVar.f13150i);
            try {
                e(bVar.f13127j, bVar2.f13127j);
            } catch (NegotiateException unused) {
            }
            try {
                e(bVar.f13128k, bVar2.f13128k);
            } catch (NegotiateException unused2) {
            }
            if (c(bVar.f13119b, bVar2.f13119b) && c(bVar.f13120c, bVar2.f13120c)) {
                eVar.f13142a = true;
            }
            return eVar;
        } catch (NegotiateException unused3) {
            return null;
        }
    }

    @Override // f6.d
    public final void a(IOException iOException) {
        synchronized (this.f13109f) {
            this.f13111h = true;
            this.f13109f.notifyAll();
        }
    }

    @Override // f6.d
    public final synchronized void b(byte[] bArr, int i10) {
        c cVar;
        byte[] bytes;
        byte[] bytes2;
        byte[] bytes3;
        byte[] bytes4;
        try {
            cVar = this.f13104a;
            if (cVar == null && bArr[0] != 20) {
                throw new IOException("Unexpected KEX message (type " + ((int) bArr[0]) + ")");
            }
        } catch (Throwable th) {
            throw th;
        }
        if (this.f13112i) {
            this.f13112i = false;
            return;
        }
        byte b10 = bArr[0];
        if (b10 == 20) {
            if (cVar != null && cVar.f13134d != 0) {
                throw new IOException("Unexpected SSH_MSG_KEXINIT message during on-going kex exchange!");
            }
            if (cVar == null) {
                c cVar2 = new c();
                this.f13104a = cVar2;
                cVar2.f13140j = this.f13115l;
                z5.e eVar = new z5.e(this.f13114k, this.f13117n);
                this.f13104a.f13131a = eVar;
                this.f13113j.m(eVar.b());
            }
            z5.e eVar2 = new z5.e(bArr, i10);
            c cVar3 = this.f13104a;
            cVar3.f13132b = eVar2;
            cVar3.f13133c = f(cVar3.f13131a.a(), this.f13104a.f13132b.a());
            c cVar4 = this.f13104a;
            if (cVar4.f13133c == null) {
                throw new IOException("Cannot negotiate, proposals do not match.");
            }
            if (cVar4.f13132b.c() && !this.f13104a.f13133c.f13142a) {
                this.f13112i = true;
            }
            if (!this.f13104a.f13133c.f13143b.equals("diffie-hellman-group-exchange-sha1") && !this.f13104a.f13133c.f13143b.equals("diffie-hellman-group-exchange-sha256")) {
                if (!this.f13104a.f13133c.f13143b.equals("diffie-hellman-group1-sha1") && !this.f13104a.f13133c.f13143b.equals("diffie-hellman-group14-sha1")) {
                    throw new IllegalStateException("Unkown KEX method!");
                }
                this.f13104a.f13138h = new DhExchange("SHA1");
                if (this.f13104a.f13133c.f13143b.equals("diffie-hellman-group1-sha1")) {
                    this.f13104a.f13138h.init(1, this.f13117n);
                } else {
                    this.f13104a.f13138h.init(14, this.f13117n);
                }
                BigInteger e10 = this.f13104a.f13138h.getE();
                i iVar = this.f13113j;
                d6.b bVar = new d6.b();
                bVar.c(30);
                bVar.e(e10);
                iVar.m(bVar.a());
                c cVar5 = this.f13104a;
                cVar5.f13134d = 1;
                cVar5.b(cVar5.f13138h.getHashAlgorithm());
                return;
            }
            this.f13104a.f13140j.getClass();
            this.f13104a.f13140j.getClass();
            i iVar2 = this.f13113j;
            d6.b bVar2 = new d6.b();
            bVar2.c(34);
            bVar2.h(1024);
            bVar2.h(2048);
            bVar2.h(NotificationCompat.FLAG_BUBBLE);
            iVar2.m(bVar2.a());
            c cVar6 = this.f13104a;
            cVar6.f13134d = 1;
            if (cVar6.f13133c.f13143b.endsWith("sha1")) {
                this.f13104a.b("SHA1");
            } else {
                this.f13104a.b("SHA-256");
            }
            return;
        }
        if (b10 == 21) {
            KeyMaterial keyMaterial = this.f13106c;
            if (keyMaterial == null) {
                throw new IOException("Peer sent SSH_MSG_NEWKEYS, but I have no key material ready!");
            }
            try {
                BlockCipher blockCipherCreateCipher = BlockCipherFactory.createCipher(cVar.f13133c.f13146e, false, keyMaterial.enc_key_server_to_client, keyMaterial.initial_iv_server_to_client);
                MessageMac messageMac = new MessageMac(this.f13104a.f13133c.f13148g, this.f13106c.integrity_key_server_to_client);
                ICompressor iCompressorCreateCompressor = CompressionFactory.createCompressor(this.f13104a.f13133c.f13150i);
                this.f13113j.a(blockCipherCreateCipher, messageMac);
                this.f13113j.b(iCompressorCreateCompressor);
                z5.b bVar3 = new z5.b(0);
                int i11 = this.f13105b + 1;
                this.f13105b = i11;
                c cVar7 = this.f13104a;
                e eVar3 = cVar7.f13133c;
                bVar3.f20714b = eVar3.f13143b;
                bVar3.f20718f = i11;
                bVar3.f20715c = eVar3.f13145d;
                bVar3.f20716d = eVar3.f13146e;
                bVar3.f20717e = eVar3.f13147f;
                bVar3.f20719g = eVar3.f13148g;
                bVar3.f20720h = eVar3.f13144c;
                bVar3.f20721i = cVar7.f13137g;
                synchronized (this.f13109f) {
                    this.f13110g = bVar3;
                    this.f13109f.notifyAll();
                }
                this.f13104a = null;
                return;
            } catch (IllegalArgumentException unused) {
                throw new IOException("Fatal error during MAC startup!");
            }
        }
        if (cVar == null || cVar.f13134d == 0) {
            throw new IOException("Unexpected Kex submessage!");
        }
        if (!cVar.f13133c.f13143b.equals("diffie-hellman-group-exchange-sha1") && !this.f13104a.f13133c.f13143b.equals("diffie-hellman-group-exchange-sha256")) {
            if ((!this.f13104a.f13133c.f13143b.equals("diffie-hellman-group1-sha1") && !this.f13104a.f13133c.f13143b.equals("diffie-hellman-group14-sha1")) || this.f13104a.f13134d != 1) {
                throw new IllegalStateException("Unkown KEX method! (" + this.f13104a.f13133c.f13143b + ")");
            }
            System.arraycopy(bArr, 0, new byte[i10], 0, i10);
            i2 i2Var = new i2(bArr, 0, i10);
            int iB = i2Var.b();
            if (iB != 31) {
                throw new IOException("This is not a SSH_MSG_KEXDH_REPLY! (" + iB + ")");
            }
            byte[] bArrC = i2Var.c();
            BigInteger bigIntegerE = i2Var.e();
            byte[] bArrC2 = i2Var.c();
            if (i2Var.j() != 0) {
                throw new IOException("PADDING IN SSH_MSG_KEXDH_REPLY!");
            }
            c cVar8 = this.f13104a;
            cVar8.f13137g = bArrC;
            z5.i iVar3 = this.f13116m;
            if (iVar3 != null) {
                try {
                    ((SSHTunnelService) iVar3).n(cVar8.f13133c.f13144c, bArrC);
                } catch (Exception e11) {
                    throw new IOException("The server hostkey was not accepted by the verifier callback.", e11);
                }
            }
            this.f13104a.f13138h.setF(bigIntegerE);
            try {
                c cVar9 = this.f13104a;
                DhExchange dhExchange = cVar9.f13138h;
                t tVar = this.f13108e;
                tVar.getClass();
                try {
                    bytes3 = tVar.f13794b.getBytes("ISO-8859-1");
                } catch (UnsupportedEncodingException unused2) {
                    bytes3 = tVar.f13794b.getBytes();
                }
                byte[] bArr2 = bytes3;
                t tVar2 = this.f13108e;
                tVar2.getClass();
                try {
                    bytes4 = tVar2.f13793a.getBytes("ISO-8859-1");
                } catch (UnsupportedEncodingException unused3) {
                    bytes4 = tVar2.f13793a.getBytes();
                }
                cVar9.f13136f = dhExchange.calculateH(bArr2, bytes4, this.f13104a.f13131a.b(), this.f13104a.f13132b.b(), bArrC);
                if (!g(bArrC2, this.f13104a.f13137g)) {
                    throw new IOException("Hostkey signature sent by remote is wrong!");
                }
                c cVar10 = this.f13104a;
                cVar10.f13135e = cVar10.f13138h.getK();
                d();
                this.f13104a.f13134d = -1;
                return;
            } catch (IllegalArgumentException e12) {
                throw new IOException("KEX error.", e12);
            }
        }
        int i12 = this.f13104a.f13134d;
        if (i12 == 1) {
            System.arraycopy(bArr, 0, new byte[i10], 0, i10);
            i2 i2Var2 = new i2(bArr, 0, i10);
            int iB2 = i2Var2.b();
            if (iB2 != 31) {
                throw new IllegalArgumentException("This is not a SSH_MSG_KEX_DH_GEX_GROUP! (" + iB2 + ")");
            }
            BigInteger bigIntegerE2 = i2Var2.e();
            BigInteger bigIntegerE3 = i2Var2.e();
            if (i2Var2.j() != 0) {
                throw new IOException("PADDING IN SSH_MSG_KEX_DH_GEX_GROUP!");
            }
            c cVar11 = this.f13104a;
            cVar11.f13139i = new DhGroupExchange(cVar11.a(), bigIntegerE2, bigIntegerE3);
            this.f13104a.f13139i.init(this.f13117n);
            BigInteger e13 = this.f13104a.f13139i.getE();
            i iVar4 = this.f13113j;
            d6.b bVar4 = new d6.b();
            bVar4.c(32);
            bVar4.e(e13);
            iVar4.m(bVar4.a());
            this.f13104a.f13134d = 2;
            return;
        }
        if (i12 != 2) {
            throw new IllegalStateException("Illegal State in KEX Exchange!");
        }
        System.arraycopy(bArr, 0, new byte[i10], 0, i10);
        i2 i2Var3 = new i2(bArr, 0, i10);
        int iB3 = i2Var3.b();
        if (iB3 != 33) {
            throw new IOException("This is not a SSH_MSG_KEX_DH_GEX_REPLY! (" + iB3 + ")");
        }
        byte[] bArrC3 = i2Var3.c();
        BigInteger bigIntegerE4 = i2Var3.e();
        byte[] bArrC4 = i2Var3.c();
        if (i2Var3.j() != 0) {
            throw new IOException("PADDING IN SSH_MSG_KEX_DH_GEX_REPLY!");
        }
        c cVar12 = this.f13104a;
        cVar12.f13137g = bArrC3;
        z5.i iVar5 = this.f13116m;
        if (iVar5 != null) {
            try {
                ((SSHTunnelService) iVar5).n(cVar12.f13133c.f13144c, bArrC3);
            } catch (Exception e14) {
                throw new IOException("The server hostkey was not accepted by the verifier callback.", e14);
            }
        }
        this.f13104a.f13139i.setF(bigIntegerE4);
        try {
            c cVar13 = this.f13104a;
            DhGroupExchange dhGroupExchange = cVar13.f13139i;
            t tVar3 = this.f13108e;
            tVar3.getClass();
            try {
                bytes = tVar3.f13794b.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException unused4) {
                bytes = tVar3.f13794b.getBytes();
            }
            byte[] bArr3 = bytes;
            t tVar4 = this.f13108e;
            tVar4.getClass();
            try {
                bytes2 = tVar4.f13793a.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException unused5) {
                bytes2 = tVar4.f13793a.getBytes();
            }
            cVar13.f13136f = dhGroupExchange.calculateH(bArr3, bytes2, this.f13104a.f13131a.b(), this.f13104a.f13132b.b(), bArrC3, this.f13104a.f13140j);
            if (!g(bArrC4, this.f13104a.f13137g)) {
                throw new IOException("Hostkey signature sent by remote is wrong!");
            }
            c cVar14 = this.f13104a;
            cVar14.f13135e = cVar14.f13139i.getK();
            d();
            this.f13104a.f13134d = -1;
            return;
        } catch (IllegalArgumentException e15) {
            throw new IOException("KEX error.", e15);
        }
        throw th;
    }

    public final void d() throws IOException {
        if (this.f13107d == null) {
            this.f13107d = this.f13104a.f13136f;
        }
        try {
            int keyLength = MessageMac.getKeyLength(this.f13104a.f13133c.f13147f);
            int keySize = BlockCipherFactory.getKeySize(this.f13104a.f13133c.f13145d);
            int blockSize = BlockCipherFactory.getBlockSize(this.f13104a.f13133c.f13145d);
            int keyLength2 = MessageMac.getKeyLength(this.f13104a.f13133c.f13148g);
            int keySize2 = BlockCipherFactory.getKeySize(this.f13104a.f13133c.f13146e);
            int blockSize2 = BlockCipherFactory.getBlockSize(this.f13104a.f13133c.f13146e);
            c cVar = this.f13104a;
            this.f13106c = KeyMaterial.create(cVar.f13141k, cVar.f13136f, cVar.f13135e, this.f13107d, keySize, blockSize, keyLength, keySize2, blockSize2, keyLength2);
        } catch (IllegalArgumentException unused) {
        }
        i iVar = this.f13113j;
        byte[] bArr = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        bArr[0] = (byte) 21;
        byte[] bArr2 = new byte[1];
        System.arraycopy(bArr, 0, bArr2, 0, 1);
        iVar.m(bArr2);
        try {
            String str = this.f13104a.f13133c.f13145d;
            KeyMaterial keyMaterial = this.f13106c;
            BlockCipher blockCipherCreateCipher = BlockCipherFactory.createCipher(str, true, keyMaterial.enc_key_client_to_server, keyMaterial.initial_iv_client_to_server);
            MessageMac messageMac = new MessageMac(this.f13104a.f13133c.f13147f, this.f13106c.integrity_key_client_to_server);
            ICompressor iCompressorCreateCompressor = CompressionFactory.createCompressor(this.f13104a.f13133c.f13149h);
            f fVar = this.f13113j.f13188j;
            fVar.getClass();
            if (!(blockCipherCreateCipher instanceof NullCipher)) {
                fVar.f13156e = true;
            }
            fVar.f13155d.changeCipher(blockCipherCreateCipher);
            fVar.f13157f = messageMac;
            fVar.f13158g = new byte[messageMac.size()];
            int blockSize3 = blockCipherCreateCipher.getBlockSize();
            fVar.f13159h = blockSize3;
            if (blockSize3 < 8) {
                fVar.f13159h = 8;
            }
            i iVar2 = this.f13113j;
            if (iVar2.f13194p) {
                f fVar2 = iVar2.f13188j;
                fVar2.f13164m = iCompressorCreateCompressor;
                if (iCompressorCreateCompressor != null) {
                    fVar2.f13167p = new byte[iCompressorCreateCompressor.getBufferSize()];
                    fVar2.f13166o |= fVar2.f13164m.canCompressPreauth();
                }
            } else {
                iVar2.f13188j.f13164m = null;
            }
            i iVar3 = this.f13113j;
            synchronized (iVar3.f13185g) {
                iVar3.f13186h = false;
                iVar3.f13185g.notifyAll();
            }
        } catch (IllegalArgumentException unused2) {
            throw new IOException("Fatal error during MAC startup!");
        }
    }

    public final boolean g(byte[] bArr, byte[] bArr2) throws IOException {
        for (e6.h hVar : e6.i.f12735a) {
            if (hVar.f12733b.equals(this.f13104a.f13133c.f13144c)) {
                PublicKey publicKeyA = hVar.a(bArr2);
                byte[] bArrB = hVar.b(bArr);
                byte[] bArr3 = this.f13104a.f13136f;
                try {
                    Provider provider = hVar.f12734c;
                    String str = hVar.f12732a;
                    Signature signature = provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
                    signature.initVerify(publicKeyA);
                    signature.update(bArr3);
                    return signature.verify(bArrB);
                } catch (GeneralSecurityException e10) {
                    throw new IOException("Could not verify signature", e10);
                }
            }
        }
        throw new IOException(g1.a.r(new StringBuilder("Unknown server host key algorithm '"), this.f13104a.f13133c.f13144c, "'"));
    }
}
