package f8;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k {
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f13437d;
            if (i10 >= bArr.length) {
                return sb.toString();
            }
            if (i10 != 0) {
                sb.append(':');
            }
            sb.append(Integer.toHexString(((bArr[i10] & 255) << 8) + (bArr[i10 + 1] & 255)));
            i10 += 2;
        }
    }
}
