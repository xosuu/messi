package v3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s.k f17779a = new s.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Locale f17780b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = z3.b.a(context).f16692a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i10 == 1) {
            return resources.getString(R.string.e5, strA);
        }
        if (i10 == 2) {
            return y3.c.e(context) ? resources.getString(R.string.ee) : resources.getString(R.string.eb, strA);
        }
        if (i10 == 3) {
            return resources.getString(R.string.e2, strA);
        }
        if (i10 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i10 == 7) {
            return d(context, "common_google_play_services_network_error_text", strA);
        }
        if (i10 == 9) {
            return resources.getString(R.string.e_, strA);
        }
        if (i10 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i10) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(R.string.ed, strA);
            default:
                return resources.getString(R.string.e9, strA);
        }
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(R.string.e6);
        }
        if (i10 == 2) {
            return resources.getString(R.string.ec);
        }
        if (i10 == 3) {
            return resources.getString(R.string.e3);
        }
        if (i10 == 5) {
            return e(context, "common_google_play_services_invalid_account_title");
        }
        if (i10 == 7) {
            return e(context, "common_google_play_services_network_error_title");
        }
        if (i10 == 17) {
            return e(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i10 != 20) {
            return null;
        }
        return e(context, "common_google_play_services_restricted_profile_title");
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strE = e(context, str);
        if (strE == null) {
            strE = resources.getString(R.string.e9);
        }
        return String.format(resources.getConfiguration().locale, strE, str2);
    }

    public static String e(Context context, String str) {
        Resources resourcesForApplication;
        s.k kVar = f17779a;
        synchronized (kVar) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                Locale locale = (Build.VERSION.SDK_INT >= 24 ? new k0.h(new k0.k(k0.c.a(configuration))) : k0.h.a(configuration.locale)).f14632a.get(0);
                if (!locale.equals(f17780b)) {
                    kVar.clear();
                    f17780b = locale;
                }
                String str2 = (String) kVar.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                int i10 = s3.e.f16688c;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication == null) {
                    return null;
                }
                int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    if (str.length() != 0) {
                        "Missing resource: ".concat(str);
                    }
                    return null;
                }
                String string = resourcesForApplication.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    f17779a.put(str, string);
                    return string;
                }
                if (str.length() != 0) {
                    "Got empty resource: ".concat(str);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
