package b4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends e4.a {
    public final a4.a a0(a4.b bVar, String str, int i10) {
        Parcel parcelT = t();
        f4.b.c(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(i10);
        return fb1.f(m(parcelT, 2));
    }

    public final a4.a u1(a4.b bVar, String str, int i10, a4.b bVar2) {
        Parcel parcelT = t();
        f4.b.c(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(i10);
        f4.b.c(parcelT, bVar2);
        return fb1.f(m(parcelT, 8));
    }

    public final a4.a v1(a4.b bVar, String str, int i10) {
        Parcel parcelT = t();
        f4.b.c(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(i10);
        return fb1.f(m(parcelT, 4));
    }

    public final a4.a w1(a4.b bVar, String str, boolean z9, long j10) {
        Parcel parcelT = t();
        f4.b.c(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(z9 ? 1 : 0);
        parcelT.writeLong(j10);
        return fb1.f(m(parcelT, 7));
    }
}
