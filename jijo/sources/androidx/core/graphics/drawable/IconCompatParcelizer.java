package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import y1.a;
import y1.b;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f544a = aVar.f(iconCompat.f544a, 1);
        byte[] bArr = iconCompat.f546c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f20440e;
            int i10 = parcel.readInt();
            if (i10 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i10];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f546c = bArr;
        iconCompat.f547d = aVar.g(iconCompat.f547d, 3);
        iconCompat.f548e = aVar.f(iconCompat.f548e, 4);
        iconCompat.f549f = aVar.f(iconCompat.f549f, 5);
        iconCompat.f550g = (ColorStateList) aVar.g(iconCompat.f550g, 6);
        String string = iconCompat.f552i;
        if (aVar.e(7)) {
            string = ((b) aVar).f20440e.readString();
        }
        iconCompat.f552i = string;
        String string2 = iconCompat.f553j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f20440e.readString();
        }
        iconCompat.f553j = string2;
        iconCompat.f551h = PorterDuff.Mode.valueOf(iconCompat.f552i);
        switch (iconCompat.f544a) {
            case -1:
                Parcelable parcelable = iconCompat.f547d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f545b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f547d;
                if (parcelable2 != null) {
                    iconCompat.f545b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f546c;
                    iconCompat.f545b = bArr3;
                    iconCompat.f544a = 3;
                    iconCompat.f548e = 0;
                    iconCompat.f549f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f546c, Charset.forName("UTF-16"));
                iconCompat.f545b = str;
                if (iconCompat.f544a == 2 && iconCompat.f553j == null) {
                    iconCompat.f553j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f545b = iconCompat.f546c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f552i = iconCompat.f551h.name();
        switch (iconCompat.f544a) {
            case -1:
                iconCompat.f547d = (Parcelable) iconCompat.f545b;
                break;
            case 1:
            case 5:
                iconCompat.f547d = (Parcelable) iconCompat.f545b;
                break;
            case 2:
                iconCompat.f546c = ((String) iconCompat.f545b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f546c = (byte[]) iconCompat.f545b;
                break;
            case 4:
            case 6:
                iconCompat.f546c = iconCompat.f545b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f544a;
        if (-1 != i10) {
            aVar.j(i10, 1);
        }
        byte[] bArr = iconCompat.f546c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f20440e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f547d;
        if (parcelable != null) {
            aVar.i(3);
            ((b) aVar).f20440e.writeParcelable(parcelable, 0);
        }
        int i11 = iconCompat.f548e;
        if (i11 != 0) {
            aVar.j(i11, 4);
        }
        int i12 = iconCompat.f549f;
        if (i12 != 0) {
            aVar.j(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f550g;
        if (colorStateList != null) {
            aVar.i(6);
            ((b) aVar).f20440e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f552i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f20440e.writeString(str);
        }
        String str2 = iconCompat.f553j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f20440e.writeString(str2);
        }
    }
}
