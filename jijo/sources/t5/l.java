package t5;

import androidx.emoji2.text.v;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f17012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f17015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f17019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f17020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f17021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f17022k = new v(3);

    public final void a() {
        c cVar = this.f17020i;
        int i10 = cVar.f16909q;
        int i11 = this.f17017f;
        if (i10 > i11) {
            i10 = i11;
        }
        if (i10 == 0) {
            return;
        }
        byte[] bArr = cVar.f16893d;
        int length = bArr.length;
        int i12 = cVar.f16899h;
        if (length > i12) {
            byte[] bArr2 = this.f17015d;
            if (bArr2.length > this.f17016e && bArr.length >= i12 + i10) {
                int length2 = bArr2.length;
            }
        }
        System.arraycopy(bArr, i12, this.f17015d, this.f17016e, i10);
        this.f17016e += i10;
        c cVar2 = this.f17020i;
        cVar2.f16899h += i10;
        this.f17018g += (long) i10;
        this.f17017f -= i10;
        int i13 = cVar2.f16909q - i10;
        cVar2.f16909q = i13;
        if (i13 == 0) {
            cVar2.f16899h = 0;
        }
    }
}
