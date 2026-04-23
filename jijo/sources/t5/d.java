package t5;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16919a = 255;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f16920b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f16921d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f16922f;

    public final Object clone() {
        d dVar = (d) super.clone();
        byte[] bArr = dVar.f16920b;
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            dVar.f16920b = bArr2;
        }
        byte[] bArr3 = dVar.f16921d;
        if (bArr3 != null) {
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr3, 0, bArr4, 0, length2);
            dVar.f16921d = bArr4;
        }
        byte[] bArr5 = dVar.f16922f;
        if (bArr5 != null) {
            int length3 = bArr5.length;
            byte[] bArr6 = new byte[length3];
            System.arraycopy(bArr5, 0, bArr6, 0, length3);
            dVar.f16922f = bArr6;
        }
        return dVar;
    }
}
