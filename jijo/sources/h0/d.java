package h0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static IconCompat a(Object obj) {
        obj.getClass();
        int iD = d(obj);
        if (iD == 2) {
            return IconCompat.b(null, c(obj), b(obj));
        }
        if (iD == 4) {
            Uri uriE = e(obj);
            PorterDuff.Mode mode = IconCompat.f543k;
            uriE.getClass();
            String string = uriE.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f545b = string;
            return iconCompat;
        }
        if (iD != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f545b = obj;
            return iconCompat2;
        }
        Uri uriE2 = e(obj);
        PorterDuff.Mode mode2 = IconCompat.f543k;
        uriE2.getClass();
        String string2 = uriE2.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f545b = string2;
        return iconCompat3;
    }

    public static int b(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return f.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public static String c(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return f.b(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static int d(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return f.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            Objects.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            Objects.toString(obj);
            return -1;
        }
    }

    public static Uri e(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return f.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Drawable f(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon g(IconCompat iconCompat, Context context) throws FileNotFoundException {
        Icon iconCreateWithBitmap;
        switch (iconCompat.f544a) {
            case -1:
                return (Icon) iconCompat.f545b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f545b);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(iconCompat.e(), iconCompat.f548e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f545b, iconCompat.f548e, iconCompat.f549f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f545b);
                break;
            case 5:
                iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f545b, false)) : e.b((Bitmap) iconCompat.f545b);
                break;
            case 6:
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    iconCreateWithBitmap = g.a(iconCompat.h());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.h());
                    }
                    InputStream inputStreamI = iconCompat.i(context);
                    if (inputStreamI == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.h());
                    }
                    if (i10 < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(inputStreamI), false));
                    } else {
                        iconCreateWithBitmap = e.b(BitmapFactory.decodeStream(inputStreamI));
                    }
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.f550g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f551h;
        if (mode != IconCompat.f543k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }
}
