package org.minidns.dnsname;

/* JADX INFO: loaded from: classes.dex */
public abstract class InvalidDnsNameException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16137a;

    public static class DNSNameTooLongException extends InvalidDnsNameException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f16138b;

        public DNSNameTooLongException(String str, byte[] bArr) {
            super(str);
            this.f16138b = bArr;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            StringBuilder sb = new StringBuilder("The DNS name '");
            sb.append(this.f16137a);
            sb.append("' exceeds the maximum name length of 255 octets by ");
            sb.append(this.f16138b.length - 255);
            sb.append(" octets.");
            return sb.toString();
        }
    }

    public static class LabelTooLongException extends InvalidDnsNameException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f16139b;

        public LabelTooLongException(String str, String str2) {
            super(str);
            this.f16139b = str2;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            StringBuilder sb = new StringBuilder("The DNS name '");
            sb.append(this.f16137a);
            sb.append("' contains the label '");
            sb.append(this.f16139b);
            sb.append("' which exceeds the maximum label length of 63 octets by ");
            sb.append(r1.length() - 63);
            sb.append(" octets.");
            return sb.toString();
        }
    }

    public InvalidDnsNameException(String str) {
        this.f16137a = str;
    }
}
