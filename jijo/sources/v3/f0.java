package v3;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends f4.a implements r {
    @Override // f4.a
    public final boolean m(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            a4.b bVar = new a4.b(((s3.k) this).a0());
            parcel2.writeNoException();
            f4.b.c(parcel2, bVar);
        } else {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(((s3.k) this).f16699b);
        }
        return true;
    }
}
