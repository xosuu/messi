package g1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.s;
import com.google.android.gms.internal.ads.c30;
import com.google.android.gms.internal.ads.e80;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.ft;
import com.google.android.gms.internal.ads.ih1;
import com.google.android.gms.internal.ads.jh1;
import com.google.android.gms.internal.ads.nh1;
import com.google.android.gms.internal.ads.oh1;
import com.google.android.gms.internal.ads.s30;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import n6.h;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ String A(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static /* synthetic */ String B(int i10) {
        return i10 != 1 ? i10 != 2 ? "null" : "LINEAR" : "EXPONENTIAL";
    }

    public static /* synthetic */ String C(int i10) {
        return i10 != 1 ? i10 != 2 ? "null" : "DROP_WORK_REQUEST" : "RUN_AS_NON_EXPEDITED_WORK_REQUEST";
    }

    public static /* synthetic */ String D(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "VIDEO" : "NATIVE_DISPLAY" : "HTML_DISPLAY";
    }

    public static final void a(int i10, View view) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i11 == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(view);
            }
            view.setVisibility(0);
        } else if (i11 == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(view);
            }
            view.setVisibility(8);
        } else {
            if (i11 != 3) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(view);
            }
            view.setVisibility(4);
        }
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 4) {
            return 4;
        }
        if (i10 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(fb1.g("Unknown visibility ", i10));
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static final int d(int i10) {
        if (i10 != 6) {
            return h(i10);
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ String e(int i10) {
        if (i10 == 1) {
            return "htmlDisplay";
        }
        if (i10 == 2) {
            return "nativeDisplay";
        }
        if (i10 == 3) {
            return "video";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i10) {
        if (i10 == 1) {
            return "ctv";
        }
        if (i10 == 2) {
            return "mobile";
        }
        if (i10 == 3) {
            return "other";
        }
        throw null;
    }

    public static /* synthetic */ String g(int i10) {
        if (i10 == 1) {
            return "beginToRender";
        }
        if (i10 == 2) {
            return "definedByJavascript";
        }
        if (i10 == 3) {
            return "onePixel";
        }
        if (i10 == 4) {
            return "unspecified";
        }
        throw null;
    }

    public static /* synthetic */ int h(int i10) {
        switch (i10) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return -1;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int i(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 4;
        }
        throw null;
    }

    public static /* synthetic */ String j(int i10) {
        switch (i10) {
            case 1:
                return "api-call";
            case 2:
                return "dynamite-enter";
            case 3:
                return "client-signals-start";
            case 4:
                return "client-signals-end";
            case 5:
                return "service-connected";
            case 6:
                return "gms-signals-start";
            case 7:
                return "gms-signals-end";
            case 8:
                return "get-signals-sdkcore-start";
            case 9:
                return "get-signals-sdkcore-end";
            case 10:
                return "get-ad-dictionary-sdkcore-start";
            case 11:
                return "get-ad-dictionary-sdkcore-end";
            case 12:
                return "http-response-ready";
            case 13:
                return "server-response-parse-start";
            case 14:
                return "public-api-callback";
            default:
                throw null;
        }
    }

    public static nh1 k(nh1 nh1Var, int i10) {
        return ih1.b(new c30(nh1Var, i10));
    }

    public static nh1 l(nh1 nh1Var, int i10, int i11) {
        return ih1.b(new c30(nh1Var, i10, i11));
    }

    public static nh1 m(nh1 nh1Var, int i10, Object obj) {
        return ih1.b(new e80(nh1Var, i10, obj));
    }

    public static nh1 n(nh1 nh1Var, nh1 nh1Var2, int i10) {
        return ih1.b(new ft(nh1Var, nh1Var2, i10));
    }

    public static nh1 o(oh1 oh1Var, int i10) {
        return ih1.b(new s30((jh1) oh1Var, i10));
    }

    public static String p(String str, s sVar, String str2) {
        return str + sVar + str2;
    }

    public static String q(String str, String str2) {
        return str + str2;
    }

    public static String r(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder s(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static void t(int i10, HashMap map, String str, int i11, String str2) {
        map.put(str, Integer.valueOf(i10));
        map.put(str2, Integer.valueOf(i11));
    }

    public static /* synthetic */ void u(Object obj) {
        throw new ClassCastException();
    }

    public static void v(String str, String str2) {
        fg0.f(str2.concat(String.valueOf(str)));
    }

    public static void w(SimpleDateFormat simpleDateFormat, StringBuilder sb, String str) {
        sb.append(simpleDateFormat.format(new Date()));
        sb.append(str);
    }

    public static /* synthetic */ void x(h hVar) {
        if (hVar != null) {
            throw new ClassCastException();
        }
    }

    public static String y(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String z(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }
}
