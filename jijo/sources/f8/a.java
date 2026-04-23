package f8;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k {
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = this.f13437d;
        sb.append(Integer.toString(bArr[0] & 255));
        sb.append(".");
        sb.append(Integer.toString(bArr[1] & 255));
        sb.append(".");
        sb.append(Integer.toString(bArr[2] & 255));
        sb.append(".");
        sb.append(Integer.toString(bArr[3] & 255));
        return sb.toString();
    }
}
