package b4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
public final class l extends e4.a {
    public final a4.a a0(a4.b bVar, String str, int i10, a4.b bVar2) {
        Parcel parcelT = t();
        f4.b.c(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(i10);
        f4.b.c(parcelT, bVar2);
        return fb1.f(m(parcelT, 2));
    }

    public final a4.a u1(a4.b bVar, String str, int i10, a4.b bVar2) {
        Parcel parcelT = t();
        f4.b.c(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(i10);
        f4.b.c(parcelT, bVar2);
        return fb1.f(m(parcelT, 3));
    }
}
