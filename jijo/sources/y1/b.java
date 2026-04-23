package y1;

import android.os.Parcel;
import android.util.SparseIntArray;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f20439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f20440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20446k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new s.b(), new s.b(), new s.b());
    }

    @Override // y1.a
    public final b a() {
        Parcel parcel = this.f20440e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f20445j;
        if (i10 == this.f20441f) {
            i10 = this.f20442g;
        }
        return new b(parcel, iDataPosition, i10, g1.a.r(new StringBuilder(), this.f20443h, "  "), this.f20436a, this.f20437b, this.f20438c);
    }

    @Override // y1.a
    public final boolean e(int i10) {
        while (this.f20445j < this.f20442g) {
            int i11 = this.f20446k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f20445j;
            Parcel parcel = this.f20440e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f20446k = parcel.readInt();
            this.f20445j += i13;
        }
        return this.f20446k == i10;
    }

    @Override // y1.a
    public final void i(int i10) {
        int i11 = this.f20444i;
        SparseIntArray sparseIntArray = this.f20439d;
        Parcel parcel = this.f20440e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f20444i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public b(Parcel parcel, int i10, int i11, String str, s.b bVar, s.b bVar2, s.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f20439d = new SparseIntArray();
        this.f20444i = -1;
        this.f20446k = -1;
        this.f20440e = parcel;
        this.f20441f = i10;
        this.f20442g = i11;
        this.f20445j = i10;
        this.f20443h = str;
    }
}
