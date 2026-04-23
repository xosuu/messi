package androidx.core.app;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f502f;

    public static l0 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat iconCompat = null;
        if (bundle2 != null) {
            PorterDuff.Mode mode = IconCompat.f543k;
            int i10 = bundle2.getInt("type");
            IconCompat iconCompat2 = new IconCompat(i10);
            iconCompat2.f548e = bundle2.getInt("int1");
            iconCompat2.f549f = bundle2.getInt("int2");
            iconCompat2.f553j = bundle2.getString("string1");
            if (bundle2.containsKey("tint_list")) {
                iconCompat2.f550g = (ColorStateList) bundle2.getParcelable("tint_list");
            }
            if (bundle2.containsKey("tint_mode")) {
                iconCompat2.f551h = PorterDuff.Mode.valueOf(bundle2.getString("tint_mode"));
            }
            switch (i10) {
                case -1:
                case 1:
                case 5:
                    iconCompat2.f545b = bundle2.getParcelable("obj");
                    break;
                case 2:
                case 4:
                case 6:
                    iconCompat2.f545b = bundle2.getString("obj");
                    break;
                case 3:
                    iconCompat2.f545b = bundle2.getByteArray("obj");
                    break;
            }
            iconCompat = iconCompat2;
        }
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z9 = bundle.getBoolean("isBot");
        boolean z10 = bundle.getBoolean("isImportant");
        l0 l0Var = new l0();
        l0Var.f497a = charSequence;
        l0Var.f498b = iconCompat;
        l0Var.f499c = string;
        l0Var.f500d = string2;
        l0Var.f501e = z9;
        l0Var.f502f = z10;
        return l0Var;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f497a);
        IconCompat iconCompat = this.f498b;
        if (iconCompat != null) {
            iconCompat.getClass();
            bundle = new Bundle();
            switch (iconCompat.f544a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f545b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f545b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.f545b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f545b);
                    break;
            }
            bundle.putInt("type", iconCompat.f544a);
            bundle.putInt("int1", iconCompat.f548e);
            bundle.putInt("int2", iconCompat.f549f);
            bundle.putString("string1", iconCompat.f553j);
            ColorStateList colorStateList = iconCompat.f550g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f551h;
            if (mode != IconCompat.f543k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f499c);
        bundle2.putString("key", this.f500d);
        bundle2.putBoolean("isBot", this.f501e);
        bundle2.putBoolean("isImportant", this.f502f);
        return bundle2;
    }
}
