package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(y1.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        y1.c cVarH = remoteActionCompat.f441a;
        if (aVar.e(1)) {
            cVarH = aVar.h();
        }
        remoteActionCompat.f441a = (IconCompat) cVarH;
        CharSequence charSequence = remoteActionCompat.f442b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((y1.b) aVar).f20440e);
        }
        remoteActionCompat.f442b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f443c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((y1.b) aVar).f20440e);
        }
        remoteActionCompat.f443c = charSequence2;
        remoteActionCompat.f444d = (PendingIntent) aVar.g(remoteActionCompat.f444d, 4);
        boolean z9 = remoteActionCompat.f445e;
        if (aVar.e(5)) {
            z9 = ((y1.b) aVar).f20440e.readInt() != 0;
        }
        remoteActionCompat.f445e = z9;
        boolean z10 = remoteActionCompat.f446f;
        if (aVar.e(6)) {
            z10 = ((y1.b) aVar).f20440e.readInt() != 0;
        }
        remoteActionCompat.f446f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, y1.a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f441a;
        aVar.i(1);
        aVar.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.f442b;
        aVar.i(2);
        Parcel parcel = ((y1.b) aVar).f20440e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f443c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f444d;
        aVar.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z9 = remoteActionCompat.f445e;
        aVar.i(5);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = remoteActionCompat.f446f;
        aVar.i(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
