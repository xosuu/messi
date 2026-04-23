package z7;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20741a;

    public j(int i10) {
        this.f20741a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length;
        int length2;
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        for (int i10 = this.f20741a; i10 < bArr.length && i10 < bArr2.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                length = b10 & 255;
                length2 = b11 & 255;
                break;
            }
        }
        length = bArr.length;
        length2 = bArr2.length;
        return length - length2;
    }
}
