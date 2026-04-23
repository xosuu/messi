package com.trilead.ssh2.crypto.digest;

/* JADX INFO: loaded from: classes.dex */
public class MAC {

    @Deprecated
    Digest mac;

    @Deprecated
    int size;

    public MAC(String str, byte[] bArr) {
        if (str.equals("hmac-sha1")) {
            this.mac = new HMAC(new SHA1(), bArr, 20);
        } else if (str.equals("hmac-sha1-96")) {
            this.mac = new HMAC(new SHA1(), bArr, 12);
        } else if (str.equals("hmac-md5")) {
            this.mac = new HMAC(new MD5(), bArr, 16);
        } else if (!str.equals("hmac-md5-96")) {
            return;
        } else {
            this.mac = new HMAC(new MD5(), bArr, 12);
        }
        this.size = this.mac.getDigestLength();
    }

    @Deprecated
    public static void checkMacList(String[] strArr) {
        for (String str : strArr) {
            getKeyLen(str);
        }
    }

    @Deprecated
    public static int getKeyLen(String str) {
        if (str.equals("hmac-sha1") || str.equals("hmac-sha1-96")) {
            return 20;
        }
        if (str.equals("hmac-md5") || str.equals("hmac-md5-96")) {
            return 16;
        }
        throw new IllegalArgumentException("Unkown algorithm ".concat(str));
    }

    @Deprecated
    public static String[] getMacList() {
        return new String[]{"hmac-sha1-96", "hmac-sha1", "hmac-md5-96", "hmac-md5"};
    }

    public void getMac(byte[] bArr, int i10) {
        this.mac.digest(bArr, i10);
    }

    public void initMac(int i10) {
        this.mac.reset();
        this.mac.update((byte) (i10 >> 24));
        this.mac.update((byte) (i10 >> 16));
        this.mac.update((byte) (i10 >> 8));
        this.mac.update((byte) i10);
    }

    public int size() {
        return this.size;
    }

    public void update(byte[] bArr, int i10, int i11) {
        this.mac.update(bArr, i10, i11);
    }
}
