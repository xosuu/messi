package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import h0.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f543k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f553j;

    public IconCompat() {
        this.f544a = -1;
        this.f546c = null;
        this.f547d = null;
        this.f548e = 0;
        this.f549f = 0;
        this.f550g = null;
        this.f551h = f543k;
        this.f552i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z9) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z9) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f548e = i10;
        if (resources != null) {
            try {
                iconCompat.f545b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f545b = str;
        }
        iconCompat.f553j = str;
        return iconCompat;
    }

    public static Resources f(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", str);
            return null;
        }
    }

    public final Bitmap c() {
        int i10 = this.f544a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f545b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f545b;
        }
        if (i10 == 5) {
            return a((Bitmap) this.f545b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public final int d() {
        int i10 = this.f544a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return d.b(this.f545b);
        }
        if (i10 == 2) {
            return this.f548e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final String e() {
        int i10 = this.f544a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return d.c(this.f545b);
        }
        if (i10 == 2) {
            String str = this.f553j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f545b).split(":", -1)[0] : this.f553j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public final int g() {
        int i10 = this.f544a;
        return (i10 != -1 || Build.VERSION.SDK_INT < 23) ? i10 : d.d(this.f545b);
    }

    public final Uri h() {
        int i10 = this.f544a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return d.e(this.f545b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f545b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final InputStream i(Context context) throws FileNotFoundException {
        Uri uriH = h();
        String scheme = uriH.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriH);
            } catch (Exception unused) {
                uriH.toString();
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f545b));
        } catch (FileNotFoundException unused2) {
            uriH.toString();
            return null;
        }
    }

    public final Icon j(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public final String toString() {
        String str;
        if (this.f544a == -1) {
            return String.valueOf(this.f545b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f544a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f544a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f545b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f545b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f553j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(d())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f548e);
                if (this.f549f != 0) {
                    sb.append(" off=");
                    sb.append(this.f549f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f545b);
                break;
        }
        if (this.f550g != null) {
            sb.append(" tint=");
            sb.append(this.f550g);
        }
        if (this.f551h != f543k) {
            sb.append(" mode=");
            sb.append(this.f551h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i10) {
        this.f546c = null;
        this.f547d = null;
        this.f548e = 0;
        this.f549f = 0;
        this.f550g = null;
        this.f551h = f543k;
        this.f552i = null;
        this.f544a = i10;
    }
}
